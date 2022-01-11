
#define WIN32_LEAN_AND_MEAN
#include <Windows.h>
#include <TlHelp32.h>
#include <string.h>
#include <stdarg.h>
#include <stdio.h>
#include <conio.h>
#include "resource.h"
#include "LoadLibraryR.h"
#include "../Common/Memory.h"

#ifdef _DEBUG
#define _CRTDBG_MAP_ALLOC
#include <stdlib.h>
#include <crtdbg.h>
#endif

//===============================================================================================//
// https://stackoverflow.com/questions/744766/how-to-compare-ends-of-strings-in-c
int string_has_suffix( const WCHAR *str, const WCHAR *suf )
{
	const WCHAR *a = str + wcslen( str );
	const WCHAR *b = suf + wcslen( suf );

	while( a != str && b != suf ) {
		if( *--a != *--b ) break;
	}
	return b == suf && *a == *b;
}
//===============================================================================================//

//===============================================================================================//
// Caller must free
LPWSTR GetLastErrorAsString( SIZE_T* length )
{
	DWORD lastError = GetLastError();

	if( 0 != lastError )
	{
		LPWSTR errorMessage;
		SIZE_T tempLengthHolder;

		errorMessage = NULL;
		tempLengthHolder = FormatMessage( FORMAT_MESSAGE_ALLOCATE_BUFFER | FORMAT_MESSAGE_FROM_SYSTEM | FORMAT_MESSAGE_IGNORE_INSERTS,
			NULL, lastError, MAKELANGID( LANG_NEUTRAL, SUBLANG_DEFAULT ), errorMessage, 0, NULL );

		if( length )
			*length = tempLengthHolder;

		return errorMessage;
	}

	return NULL;
}

VOID PrintLastErrorAsString( VOID )
{
	LPWSTR errorMessage;
	SIZE_T errorMessageLength;

	if( NULL != (errorMessage = GetLastErrorAsString( &errorMessageLength )) )
	{
		fwrite( errorMessage, sizeof( WCHAR ), errorMessageLength, stdout );
		fflush( stdout );

		MemFree( errorMessage );
	}
}
//===============================================================================================//

//===============================================================================================//
#define GWOP_CTX_FREE(ptr)					\
	do {									\
		if( ptr ) {							\
			if( ptr->Windows )				\
				MemFree( ptr->Windows );		\
			MemFree( ptr );					\
			ptr = NULL;						\
		}									\
	} while( 0 );

typedef struct _GWOP_CTX {
	DWORD TargetProcess;
	HWND* Windows;
	SIZE_T WindowCount;
} GWOP_CTX, *PGWOP_CTX;

BOOL CALLBACK GetWindowsOfProcessProc( HWND hwnd, LPARAM lParam )
{
	PGWOP_CTX ctx;
	DWORD processId;

	ctx = (PGWOP_CTX) lParam;
	GetWindowThreadProcessId( hwnd, &processId );

	if( processId == ctx->TargetProcess )
	{
		HWND* newMemory = NULL;

		newMemory = (HWND*) MemReAlloc( ctx->Windows, (ctx->WindowCount + 1) * sizeof( HWND ) );
		if( NULL == newMemory )
			return FALSE;

		ctx->Windows = newMemory;
		ctx->Windows[ctx->WindowCount++] = hwnd;
	}
	
	return TRUE;
}

// Caller must free
PGWOP_CTX GetWindowsOfProcess( DWORD pid )
{
	PGWOP_CTX ctx;

	if( (ctx = (PGWOP_CTX) MemCalloc( sizeof( GWOP_CTX ) )) )
	{
		ctx->TargetProcess = pid;
		EnumWindows( GetWindowsOfProcessProc, (LPARAM) ctx );
		return ctx;
	}

	return NULL;
}
//===============================================================================================//

//===============================================================================================//
#define FPBNAWT_CTX_FREE(ptr)				\
	do {									\
		if( ptr ) {							\
			if( ptr->Pids )					\
				MemFree( ptr->Pids );		\
			MemFree( ptr );					\
			ptr = NULL;						\
		}									\
	} while( 0 );

typedef struct _FPBNAWT_CTX
{
	PDWORD Pids;
	SIZE_T PidCount;
} FPBNAWT_CTX, *PFPBNAWT_CTX;

// Caller must free
PFPBNAWT_CTX FindProcessByNameAndWindowTitle( const wchar_t* name, const wchar_t* title, const BOOL matchTitleExact )
{
	HANDLE snapshot = INVALID_HANDLE_VALUE;
	PFPBNAWT_CTX fpbnawtCtx = NULL;

	if( INVALID_HANDLE_VALUE != (snapshot = CreateToolhelp32Snapshot( TH32CS_SNAPPROCESS, 0 )) )
	{
		PROCESSENTRY32 entry = { 0 };
		PDWORD pids = NULL;
		SIZE_T pidCount = 0;

		entry.dwSize = sizeof( PROCESSENTRY32 );

		if( TRUE == Process32First( snapshot, &entry ) )
		{
			while( TRUE == Process32Next( snapshot, &entry ) )
			{
				if( 0 == wcscmp( entry.szExeFile, name ) )
				{
					PDWORD newMemory = NULL;

					newMemory = (PDWORD) MemReAlloc( pids, (pidCount + 1) * sizeof( DWORD ) );
					if( NULL == newMemory )
						break;

					pids = newMemory;
					pids[pidCount++] = entry.th32ProcessID;
				}
			}
		}

		if( NULL != pids )
		{
			fpbnawtCtx = (PFPBNAWT_CTX) MemCalloc( sizeof( FPBNAWT_CTX ) );

			if( NULL != fpbnawtCtx )
			{
				PGWOP_CTX gwopCtx;
				wchar_t textBuf[256]; // Make configurable?
				BOOL outOfMemory = FALSE;

				for( SIZE_T iii = 0; iii < pidCount; iii++ )
				{
					gwopCtx = GetWindowsOfProcess( pids[iii] );

					if( gwopCtx == NULL )
						// Failed to allocate memory
						break;

					for( SIZE_T jjj = 0; jjj < gwopCtx->WindowCount; jjj++ )
					{
						ZeroMemory( textBuf, sizeof( textBuf ) );

						if( GetWindowText( gwopCtx->Windows[jjj], textBuf, sizeof( textBuf ) ) > 0 )
						{
							BOOL match = FALSE;

							if( matchTitleExact )
							{
								if( 0 == wcscmp( textBuf, title ) )
								{
									match = TRUE;
								}
							}
							else
							{
								if( NULL != wcsstr( textBuf, title ) )
								{
									match = TRUE;
								}
							}

							if( TRUE == match )
							{
								PDWORD newMemory = NULL;

								newMemory = (PDWORD) MemReAlloc( fpbnawtCtx->Pids, (fpbnawtCtx->PidCount + 1) * sizeof( DWORD ) );
								if( NULL == newMemory ) {
									outOfMemory = TRUE;
									break;
								}

								fpbnawtCtx->Pids = newMemory;
								fpbnawtCtx->Pids[fpbnawtCtx->PidCount++] = pids[iii];
								break;
							}
						}
					}

					GWOP_CTX_FREE( gwopCtx );

					if( outOfMemory )
						break;
				}
			}

			MemFree( pids );
			pids = NULL;
		}
	}

	return fpbnawtCtx;
}
//===============================================================================================//

//===============================================================================================//
PBYTE GetClientInjectorDll( SIZE_T* size )
{
	HRSRC res			= NULL;
	HGLOBAL resHandle	= NULL;
	PBYTE resData		= NULL;
	DWORD resSize		= 0;

	if( size )
		*size = resSize;

	if( (res = FindResource( NULL, MAKEINTRESOURCE( IDR_INJECTOR_DLL ), L"BINARY" )) )
	{
		if( (resHandle = LoadResource( NULL, res )) )
		{
			resData = (PBYTE) LockResource( resHandle );

			if( NULL != resData )
			{
				if( size )
					*size = SizeofResource( NULL, res );
			}
		}
	}

	return resData;
}
//===============================================================================================//


//===============================================================================================//
#define FFIDMS_CTX_FREE(ptr)							\
	do {												\
		if( ptr ) {										\
			if( ptr->Paths )	 {							\
				for( int iii = 0;						\
					 iii < ptr->PathsCount;				\
					 iii++ ) {							\
					if( ptr->Paths[iii] )				\
						MemFree( ptr->Paths[iii] );		\
				}										\
				MemFree( ptr->Paths );					\
			}											\
			MemFree( ptr );								\
			ptr = NULL;									\
		}												\
	} while( 0 );

typedef struct _FFIDMS_CTX
{
	LPWSTR* Paths;
	SIZE_T PathsCount;
} FFIDMS_CTX, *PFFIDMS_CTX;

// Caller must free
PFFIDMS_CTX FindFilesInDirectoryWithSuffix( LPWSTR path, LPWSTR suffix )
{
	PFFIDMS_CTX ctx = NULL;

	if( (ctx = (PFFIDMS_CTX) MemCalloc( sizeof( FFIDMS_CTX ) )) )
	{
		HANDLE findHandle;
		WIN32_FIND_DATA findData;
		WCHAR dirPath[MAX_PATH]; // Unicode API supports up to 32k chars, but oh well, MAX_PATH should be fine.
		SIZE_T pathLength;
		BOOL pathEndsWithBackslash;

		pathLength = wcslen( path );
		pathEndsWithBackslash = path[pathLength - 1] == L'\\';

		// Append "\*" for FindFirstFile
		ZeroMemory( dirPath, MAX_PATH );
		wcscpy( dirPath, path );
		wcscat( dirPath, L"\\*" );

		if( INVALID_HANDLE_VALUE != (findHandle = FindFirstFile( dirPath, &findData )) )
		{
			do
			{
				if( TRUE == string_has_suffix( findData.cFileName, suffix ) )
				{
					LPWSTR fullPath = NULL;
					SIZE_T fileNameLength;
					LPWSTR* newMemory = NULL;

					fileNameLength = wcslen( findData.cFileName );
					fullPath = (LPWSTR) MemCalloc( (pathLength + fileNameLength + 2) * sizeof( WCHAR ) ); // null-terminator & possible "\"
					if( NULL == fullPath )
						break;

					// Rebuild full path
					wcscpy( fullPath, path );
					if( FALSE == pathEndsWithBackslash )
						wcscat( fullPath, L"\\" );
					wcscat( fullPath, findData.cFileName );

					newMemory = (LPWSTR*) MemReAlloc( ctx->Paths, (ctx->PathsCount + 1) * sizeof( LPWSTR ) );
					if( NULL == newMemory )
						break;

					ctx->Paths = newMemory;
					ctx->Paths[ctx->PathsCount++] = fullPath;
				}
			} while( 0 != FindNextFile( findHandle, &findData ) );

			FindClose( findHandle );
		}
	}

	return ctx;
}
//===============================================================================================//

//===============================================================================================//
// Caller must free
PFFIDMS_CTX GetJarsInModuleDirectory( VOID )
{
	PFFIDMS_CTX ctx		= NULL;
	LPWSTR modulePath	= NULL;
	
	// Unicode API supports up to 32k chars, but oh well, MAX_PATH should be fine
	modulePath = (LPWSTR) MemCalloc( (MAX_PATH + 1) * sizeof( WCHAR ) ); 
	
	if( NULL != modulePath )
	{
		if( GetModuleFileName( NULL, modulePath, MAX_PATH ) > 0 )
		{
			PWCHAR ch = wcsrchr( modulePath, L'\\' );

			if( NULL != ch )
			{
				*ch = L'\0';
				ctx = FindFilesInDirectoryWithSuffix( modulePath, L".jar" );
			}
		}

		MemFree( modulePath );
	}

	return ctx;
}
//===============================================================================================//

//===============================================================================================//
SIZE_T Inject( LPWSTR jarPath, SIZE_T jarPathLength, PBYTE dllBuffer, SIZE_T dllBufferSize, PFPBNAWT_CTX fpbnawtCtx )
{
	HANDLE processHandle		= NULL;
	HANDLE moduleHandle			= NULL;
	LPVOID remoteMemoryBuffer	= NULL;
	SIZE_T injectedCount		= 0;
	SIZE_T jarPathSize			= jarPathLength * sizeof( WCHAR );

	for( SIZE_T iii = 0; iii < fpbnawtCtx->PidCount; iii++ )
	{
		processHandle = OpenProcess( PROCESS_CREATE_THREAD | PROCESS_QUERY_INFORMATION | PROCESS_VM_OPERATION | PROCESS_VM_WRITE | PROCESS_VM_READ, FALSE, fpbnawtCtx->Pids[iii] );
		if( NULL == processHandle )
		{
			printf( "[!] Failed to open handle to process with id %lu:\n ... \n", fpbnawtCtx->Pids[iii] );
			PrintLastErrorAsString();
			continue;
		}

		// We're going to allocate memory in the remote process to store the path to the Vape jar
		remoteMemoryBuffer = VirtualAllocEx( processHandle, NULL, jarPathSize, MEM_RESERVE | MEM_COMMIT, PAGE_EXECUTE_READWRITE );
		if( !remoteMemoryBuffer )
		{
			printf( "[!] Failed to allocate memory in process with id %lu:\n ... \n", fpbnawtCtx->Pids[iii] );
			PrintLastErrorAsString();
			continue;
		}

		// Write path of jar to remote process
		if( !WriteProcessMemory( processHandle, remoteMemoryBuffer, jarPath, jarPathSize, NULL ) )
		{
			printf( "[!] Failed to write jar path to memory memory of process with id %lu:\n ... \n", fpbnawtCtx->Pids[iii] );
			PrintLastErrorAsString();
			continue;
		}

		// Inject and pass on the allocated memory as argument
		moduleHandle = LoadRemoteLibraryR( processHandle, dllBuffer, (DWORD) dllBufferSize, remoteMemoryBuffer );
		if( NULL == moduleHandle )
		{
			// Clean up allocated memory on fail - will be cleaned by the DLL on success
			VirtualFreeEx( processHandle, remoteMemoryBuffer, jarPathSize, MEM_RELEASE );

			printf( "[!] Failed to inject JAR injector into process with id %lu:\n ... \n", fpbnawtCtx->Pids[iii] );
			PrintLastErrorAsString();
		}
		else
		{
			++injectedCount;
			printf( "[*] Successfully injected into process with id %lu ... \n", fpbnawtCtx->Pids[iii] );
			CloseHandle( moduleHandle );
		}

		CloseHandle( processHandle );
	}

	return injectedCount;
}
//===============================================================================================//

//===============================================================================================//
int WINAPI WinMain( HINSTANCE hInstance, HINSTANCE hPrevInstance, LPSTR lpCmdLine, int windowStyle )
{
	int exitCode			= 0;

	PFFIDMS_CTX jarsInPath	= NULL;
	LPWSTR jarPath			= NULL;
	SIZE_T jarPathLength	= 0;

	PBYTE dllBuffer			= NULL;
	SIZE_T dllBufferSize	= 0;

	HANDLE hToken			= NULL;
	TOKEN_PRIVILEGES priv	= { 0 };

	PFPBNAWT_CTX fpbnawtCtx	= NULL;
	SIZE_T injectedCount	= 0;

	// What to do on fail?
	if( AllocConsole() ) {
		freopen( "CONOUT$", "w", stdout );
		SetConsoleTitle( L"Vape Launcher" );
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), FOREGROUND_GREEN | FOREGROUND_BLUE | FOREGROUND_RED );
	}

	jarsInPath = GetJarsInModuleDirectory();
	if( NULL == jarsInPath )
	{
		printf( "[!] Failed to find Vape jar\n ... \n" );
		PrintLastErrorAsString();
		exitCode = 1;
		goto exit;
	}
	else if( jarsInPath->PathsCount > 1 )
	{
		printf( "[!] Multiple jar files found, place only the Vape jar in the same directory as the launcher ... \n" );
		exitCode = 1;
		goto exit;
	}
	else if( jarsInPath->PathsCount == 0 )
	{
		printf( "[!] No jar files found, place the Vape jar in the same directory as the launcher ... \n" );
		exitCode = 1;
		goto exit;
	}

	dllBuffer = GetClientInjectorDll( &dllBufferSize );
	if( NULL == dllBuffer || 0 == dllBufferSize )
	{
		printf( "[!] Failed to load extract DLL:\n ... \n" );
		PrintLastErrorAsString();
		exitCode = 1;
		goto exit;
	}

	if( OpenProcessToken( GetCurrentProcess(), TOKEN_ADJUST_PRIVILEGES | TOKEN_QUERY, &hToken ) )
	{
		priv.PrivilegeCount = 1;
		priv.Privileges[0].Attributes = SE_PRIVILEGE_ENABLED;

		if( LookupPrivilegeValue( NULL, SE_DEBUG_NAME, &priv.Privileges[0].Luid ) )
			AdjustTokenPrivileges( hToken, FALSE, &priv, 0, NULL, NULL );

		CloseHandle( hToken );
	}

	jarPath = jarsInPath->Paths[0];
	jarPathLength = wcslen( jarPath );

	fpbnawtCtx = FindProcessByNameAndWindowTitle( L"javaw.exe", L"Minecraft 1.8", false );
	if( NULL != fpbnawtCtx )
	{
		injectedCount += Inject( jarPath, jarPathLength, dllBuffer, dllBufferSize, fpbnawtCtx );
		FPBNAWT_CTX_FREE( fpbnawtCtx );
	}

	// Also check java.exe in case user changed exectuable in their launcher profile - also duplicate code...
	fpbnawtCtx = FindProcessByNameAndWindowTitle( L"java.exe", L"Minecraft 1.8", false );
	if( NULL != fpbnawtCtx )
	{
		injectedCount += Inject( jarPath, jarPathLength, dllBuffer, dllBufferSize, fpbnawtCtx );
		FPBNAWT_CTX_FREE( fpbnawtCtx );
	}

	if( 0 == injectedCount )
		printf( "[!] Did not inject into anything. Are you running Minecraft?\n" );

exit:
	FFIDMS_CTX_FREE( jarsInPath );

#ifdef _DEBUG
	_CrtDumpMemoryLeaks();
#endif

	printf( "Press ANY key to exit...\n" );
	_getch();
	return exitCode;
}
//===============================================================================================//