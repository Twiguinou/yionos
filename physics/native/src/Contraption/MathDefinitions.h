#ifndef YIONOS_CONTRAPTION_MATH_DEFINITIONS
#define YIONOS_CONTRAPTION_MATH_DEFINITIONS

#include "CommonToolset.h"

#include <cmath>

#ifndef YIONOS_EPSILON
#define YIONOS_EPSILON 1e-10
#endif

namespace yionos
{

YIONOS_ALWAYS_INLINE double Sqrt(double x)
{
    return std::sqrt(x);
}

YIONOS_ALWAYS_INLINE double FMAdd(double x, double y, double z)
{
    return std::fma(x, y, z);
}

YIONOS_ALWAYS_INLINE double FMSub(double x, double y, double z)
{
    return FMAdd(x, y, -z);
}

YIONOS_ALWAYS_INLINE double InvSqrt(double x)
{
    return 1.0 / Sqrt(x);
}

} /* yionos */

#endif /* YIONOS_CONTRAPTION_MATH_DEFINITIONS */
