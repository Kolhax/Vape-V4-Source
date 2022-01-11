#include "Memory.h"

//===============================================================================================//
LPVOID MemAlloc( SIZE_T size )
{
#ifdef _DEBUG
	return malloc( size );
#else
	return VirtualAllocEx( (HANDLE) -1, 0, size, MEM_COMMIT | MEM_RESERVE, PAGE_READWRITE );
#endif
}
//===============================================================================================//

//===============================================================================================//
VOID MemFree( LPVOID memory )
{
	if( memory )
	{
#ifdef _DEBUG
		free( memory );
#else
		VirtualFreeEx( (HANDLE) -1, memory, 0, MEM_RELEASE );
#endif
	}
}
//===============================================================================================//

//===============================================================================================//
LPVOID MemCalloc( SIZE_T size )
{
#ifdef _DEBUG
	return calloc( 1, size );
#else
	LPVOID memory = MemAlloc( size );
	if( NULL == memory )
		return NULL;
	ZeroMemory( memory, size );
	return memory;
#endif
}
//===============================================================================================//

//===============================================================================================//
SIZE_T GetMemSize( LPVOID memory )
{
	if( NULL != memory )
	{
		MEMORY_BASIC_INFORMATION memInfo;
		VirtualQueryEx( (HANDLE) -1, 0, &memInfo, sizeof( MEMORY_BASIC_INFORMATION ) );
		return memInfo.RegionSize;
	}

	return 0;
}
//===============================================================================================//

//===============================================================================================//
LPVOID MemReAlloc( LPVOID memory, SIZE_T size )
{
#ifdef _DEBUG
	return realloc( memory, size );
#else
	SIZE_T prevSize = 0;
	LPVOID newAddr = NULL;

	if( memory )
		prevSize = GetMemSize( memory );

	if( size > 0 )
	{
		newAddr = MemAlloc( size );

		if( memory && newAddr && prevSize )
		{
			if( size < prevSize )
				prevSize = size;

			memcpy( newAddr, memory, prevSize );
		}
	}

	if( memory != NULL )
		MemFree( memory );

	return newAddr;
#endif
}
//===============================================================================================//
