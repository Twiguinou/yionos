#ifndef YIONOS_CONTRAPTION_COMMON_TOOLSET
#define YIONOS_CONTRAPTION_COMMON_TOOLSET

// YIONOS_DEBUG definition
#ifndef YIONOS_DEBUG
#define YIONOS_DEBUG 0
#endif

// YIONOS_ALWAYS_INLINE definition
#if defined(_MSC_VER)
#define YIONOS_ALWAYS_INLINE __forceinline
#elif defined(__GNUC__)
#define YIONOS_ALWAYS_INLINE __attribute__((always_inline))
#else
#define YIONOS_ALWAYS_INLINE inline
#endif

// YIONOS_ENABLE_ASSERTIONS definition
#ifndef YIONOS_ENABLE_ASSERTIONS
#if YIONOS_DEBUG
#define YIONOS_ENABLE_ASSERTIONS 1
#else
#define YIONOS_ENABLE_ASSERTIONS 0
#endif

// YIONOS_ASSERT definition
#if YIONOS_ENABLE_ASSERTIONS
#include <cassert>
#define YIONOS_ASSERT(x) assert(x)
#else
#define YIONOS_ASSERT(x) ((void) 0)
#endif

#endif /* YIONOS_CONTRAPTION_COMMON_TOOLSET */
