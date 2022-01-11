#define WIN32_LEAN_AND_MEAN
#include <Windows.h>
#include "..\Common\Memory.h"
#include <jni.h>
#include <jvmti.h>
#include <Shellapi.h> // ShellExecute
#include <stdlib.h> // wcstombs

// 1563 as per recommended on vape.gg
#define FORGE_VERSION_MAJOR		11
#define FORGE_VERSION_MINOR		14
#define FORGE_VERSION_REVISION	4
#define FORGE_VERSION_BUILD		1563

//===============================================================================================//
typedef struct APP_CTX {
	JavaVM* jvm;
	JNIEnv* jniEnv;
} APP_CTX, *PAPP_CTX;
//===============================================================================================//

//===============================================================================================//
// https://community.oracle.com/message/6466727#6466727
jobject wchar2jstring( JNIEnv* env, const wchar_t* s )
{
	jobject result = 0;
	size_t len = wcslen( s );
	size_t sz = wcstombs( 0, s, len );
	PCHAR c = MemCalloc( sz + 1 );
	if( NULL == c )
		return NULL;
	wcstombs( c, s, len );
	c[sz] = '\0';
	result = (*env)->NewStringUTF( env, c );
	MemFree( c );
	return result;
}
//===============================================================================================//

//===============================================================================================//
BOOL AttemptAttachJvm( PAPP_CTX appCtx )
{
	HMODULE jvmHandle;
	
	if( NULL != (jvmHandle = GetModuleHandle( L"jvm.dll" )) )
	{
		typedef jint( JNICALL *fnJNI_GetCreatedJavaVMs )(JavaVM **, jsize, jsize *);
		fnJNI_GetCreatedJavaVMs JNI_GetCreatedJavaVMs = (fnJNI_GetCreatedJavaVMs) GetProcAddress( jvmHandle, "JNI_GetCreatedJavaVMs" );
		
		if( JNI_GetCreatedJavaVMs( &appCtx->jvm, 1, NULL ) == JNI_OK )
		{
			if( (*appCtx->jvm)->AttachCurrentThread( appCtx->jvm, (void **) &appCtx->jniEnv, NULL ) == JNI_OK )
			{
				return TRUE;
			}
		}
	}

	return FALSE;
}
//===============================================================================================//

//===============================================================================================//
VOID DetachJvm( PAPP_CTX appCtx )
{
	if( appCtx->jvm && appCtx->jniEnv )
	{
		(*appCtx->jvm)->DetachCurrentThread( appCtx->jvm );
	}

	appCtx->jniEnv = NULL;
	appCtx->jvm = NULL;
}
//===============================================================================================//

//===============================================================================================//
BOOL IsMinecraft( PAPP_CTX appCtx )
{
	return (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "net/minecraft/launchwrapper/Launch" ) != NULL;
}
//===============================================================================================//

//===============================================================================================//
BOOL IsMinecraftForgeVersion( PAPP_CTX appCtx, int major, int minor, int revision, int build )
{
	jclass clazz = (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "net/minecraftforge/common/ForgeVersion" );

	if( NULL != clazz )
	{
		jfieldID field = (*appCtx->jniEnv)->GetStaticFieldID( appCtx->jniEnv, clazz, "majorVersion", "I" );

		if( (*appCtx->jniEnv)->GetStaticIntField( appCtx->jniEnv, clazz, field ) == major )
		{
			field = (*appCtx->jniEnv)->GetStaticFieldID( appCtx->jniEnv, clazz, "minorVersion", "I" );

			if( (*appCtx->jniEnv)->GetStaticIntField( appCtx->jniEnv, clazz, field ) == minor )
			{
				field = (*appCtx->jniEnv)->GetStaticFieldID( appCtx->jniEnv, clazz, "revisionVersion", "I" );

				if( (*appCtx->jniEnv)->GetStaticIntField( appCtx->jniEnv, clazz, field ) == revision )
				{
					field = (*appCtx->jniEnv)->GetStaticFieldID( appCtx->jniEnv, clazz, "buildVersion", "I" );

					if( (*appCtx->jniEnv)->GetStaticIntField( appCtx->jniEnv, clazz, field ) == build )
					{
						// Nesting for days
						return TRUE;
					}
				}
			}
		}
	}

	return FALSE;
}
//===============================================================================================//

//===============================================================================================//
// Pretty much copied from the dumped Vape DLL - was too lazy to patch it, so made my own.
// Sick communication via the Windows registry btw Manthe (or is it tim?)
VOID LoadJar( PAPP_CTX appCtx, LPWSTR jarPath )
{
	jclass clsFile;
	jmethodID midFileConst;
	jmethodID midFileToURI;

	jclass clsURLClsLoader;
	jmethodID midURLClsLoaderConst;
	jmethodID midLoadClass;

	jclass clsURL;
	jclass clsURI;
	jmethodID midURItoURL;

	jclass clsNmlLaunch;
	jclass clsNmlLaunchClsLoader;
	jobject objNmlClassLoader;

	jobject obj;
	jobject obj2;
	jstring str;

	jclass clsVapeEntryPoint;
	jmethodID midVapeEntryPoint;

	(*appCtx->jniEnv)->PushLocalFrame( appCtx->jniEnv, 100 );

	// Grab required classes and methods
	clsFile = (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "java/io/File" );
	midFileConst = (*appCtx->jniEnv)->GetMethodID( appCtx->jniEnv, clsFile, "<init>", "(Ljava/lang/String;)V" );
	midFileToURI = (*appCtx->jniEnv)->GetMethodID( appCtx->jniEnv, clsFile, "toURI", "()Ljava/net/URI;" );

	clsURLClsLoader = (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "java/net/URLClassLoader" );
	midURLClsLoaderConst = (*appCtx->jniEnv)->GetMethodID( appCtx->jniEnv, clsURLClsLoader, "<init>", "([Ljava/net/URL;Ljava/lang/ClassLoader;)V" );
	midLoadClass = (*appCtx->jniEnv)->GetMethodID( appCtx->jniEnv, clsURLClsLoader, "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;" );

	clsURL = (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "java/net/URL" );
	clsURI = (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "java/net/URI" );
	midURItoURL = (*appCtx->jniEnv)->GetMethodID( appCtx->jniEnv, clsURI, "toURL", "()Ljava/net/URL;" );

	clsNmlLaunch = (*appCtx->jniEnv)->NewGlobalRef( appCtx->jniEnv, (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "net/minecraft/launchwrapper/Launch" ) );
	clsNmlLaunchClsLoader = (*appCtx->jniEnv)->NewGlobalRef( appCtx->jniEnv, (*appCtx->jniEnv)->FindClass( appCtx->jniEnv, "net/minecraft/launchwrapper/LaunchClassLoader" ) );
	objNmlClassLoader = (*appCtx->jniEnv)->NewGlobalRef( appCtx->jniEnv, (*appCtx->jniEnv)->GetStaticObjectField( appCtx->jniEnv, clsNmlLaunch, (*appCtx->jniEnv)->GetStaticFieldID( appCtx->jniEnv, clsNmlLaunch, "classLoader", "Lnet/minecraft/launchwrapper/LaunchClassLoader;" ) ) );

	// Create new java.io.File object with jar path as only argument
	// Folowed by converting the file to URI
	// Folowed by converting the URI to URL
	str = wchar2jstring( appCtx->jniEnv, jarPath );
	obj = (*appCtx->jniEnv)->NewObject( appCtx->jniEnv, clsFile, midFileConst, str );
	(*appCtx->jniEnv)->DeleteLocalRef( appCtx->jniEnv, str );
	obj2 = (*appCtx->jniEnv)->CallObjectMethod( appCtx->jniEnv, obj, midFileToURI );
	obj = (*appCtx->jniEnv)->CallObjectMethod( appCtx->jniEnv, obj2, midURItoURL );

	// Wrap URL object in an array and construct a new URLClassLoader obj
	obj2 = (*appCtx->jniEnv)->NewObjectArray( appCtx->jniEnv, 1, clsURL, obj );
	obj = (*appCtx->jniEnv)->NewObject( appCtx->jniEnv, clsURLClsLoader, midURLClsLoaderConst, obj2, objNmlClassLoader );

	// Create a new String obj with path to Vape's entry point class
	// followed by calling loadClass on the above created URLClassLoader obj
	str = (*appCtx->jniEnv)->NewStringUTF( appCtx->jniEnv, "com.sun.jna.z.Main" );
	obj2 = (*appCtx->jniEnv)->CallObjectMethod( appCtx->jniEnv, obj, midLoadClass, str );
	(*appCtx->jniEnv)->DeleteLocalRef( appCtx->jniEnv, obj );
	clsVapeEntryPoint = (*appCtx->jniEnv)->NewGlobalRef( appCtx->jniEnv, obj2 );
	(*appCtx->jniEnv)->DeleteLocalRef( appCtx->jniEnv, obj2 );
	(*appCtx->jniEnv)->DeleteLocalRef( appCtx->jniEnv, str );

	// Finally get the entry point signature
	midVapeEntryPoint = (*appCtx->jniEnv)->GetStaticMethodID( appCtx->jniEnv, clsVapeEntryPoint, "entry", "()V" );
	
	(*appCtx->jniEnv)->PopLocalFrame( appCtx->jniEnv, 0 );

	// And call it.
	(*appCtx->jniEnv)->CallStaticVoidMethod( appCtx->jniEnv, clsVapeEntryPoint, midVapeEntryPoint );
}
//===============================================================================================//

//===============================================================================================//
VOID RecommendForgeDownload( VOID )
{
	int result = MessageBox( NULL, L"You are missing Minecraft Forge (or have the wrong version). Take me to the download?", L" Error - Wrong Forge Version", MB_YESNO );

	if( IDYES == result )
	{
		ShellExecute( NULL, L"open", L"http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.8-11.14.4.1563/forge-1.8-11.14.4.1563-installer-win.exe", L"", L".", SW_SHOWDEFAULT );
	}
}
//===============================================================================================//

//===============================================================================================//
VOID AttemptAttachAndDetectMinecraft( LPWSTR jarPath )
{
	PAPP_CTX appCtx = NULL;

	if( NULL == (appCtx = MemCalloc( sizeof( APP_CTX ) )) )
		return;

	if( FALSE == AttemptAttachJvm( appCtx ) )
		goto out;

	if( IsMinecraft( appCtx ) )
	{
		if( IsMinecraftForgeVersion( appCtx, FORGE_VERSION_MAJOR, FORGE_VERSION_MINOR, FORGE_VERSION_REVISION, FORGE_VERSION_BUILD ) )
		{
			LoadJar( appCtx, jarPath );
		}
		else
		{
			RecommendForgeDownload();
		}
	}

out:
	DetachJvm( appCtx );
	MemFree( appCtx );
}
//===============================================================================================//

//===============================================================================================//
INT WINAPI DllMain( HINSTANCE hInstance, DWORD dwReason, LPVOID lpReserved )
{
	if( dwReason == DLL_PROCESS_ATTACH )
	{
		AttemptAttachAndDetectMinecraft( lpReserved );
		MemFree( lpReserved );
		FreeLibrary( hInstance );
	}

	return 0;
}
//===============================================================================================//