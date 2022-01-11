#pragma once

#define WIN32_LEAN_AND_MEAN
#include <Windows.h>

#ifdef _DEBUG
#define _CRTDBG_MAP_ALLOC
#include <stdlib.h>
#include <crtdbg.h>
#endif

#define MemFreeSafe(ptr)	\
	do {					\
		if (ptr) {			\
			MemFree(ptr);	\
			ptr = NULL;		\
		}					\
	} while( 0 );

LPVOID MemAlloc( SIZE_T size );
VOID MemFree( LPVOID memory );
LPVOID MemCalloc( SIZE_T size );
SIZE_T GetMemSize( LPVOID memory );
LPVOID MemReAlloc( LPVOID memory, SIZE_T size );