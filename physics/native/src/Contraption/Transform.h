#ifndef YIONOS_CONTRAPTION_TRANSFORM
#define YIONOS_CONTRAPTION_TRANSFORM

#include "Quaternion.h"

namespace yionos
{

struct Transform
{
    Vector3 position;
    Quaternion rotation;

    Transform()
    : position(), rotation()
    {}

    YIONOS_ALWAYS_INLINE Transform &operator=(const Transform &o) = default;
};

} /* yionos */

#endif /* YIONOS_CONTRAPTION_TRANSFORM */
