#ifndef YIONOS_CONTRAPTION_WIDE_TYPES
#define YIONOS_CONTRAPTION_WIDE_TYPES

#include "CommonToolset.h"

#include <hwy/highway.h>
#include <array>

using namespace hwy::HWY_NAMESPACE;

namespace yionos
{

typedef ScalableTag<double> VectorSpan;
typedef std::array<double, MaxLanes(VectorSpan())> ScalarVector;

struct WideVector3
{
    ScalarVector x, y, z;

    WideVector3()
    : x(), y(), z()
    {}

    YIONOS_ALWAYS_INLINE ScalarVector dot(const WideVector3& o) const
    {
        const VectorSpan vs;
        ScalarVector a;

        const auto vAx = LoadU(vs, x.data()), vAy = LoadU(vs, y.data()), vAz = LoadU(vs, z.data());
        const auto vBx = LoadU(vs, o.x.data()), vBy = LoadU(vs, o.y.data()), vBz = LoadU(vs, o.z.data());
        const auto V = MulAdd(vAx, vBx, MulAdd(vAy, vBy, Mul(vAz, vBz)));

        StoreU(V, vs, a.data());
        return a;
    }

    YIONOS_ALWAYS_INLINE ScalarVector lengthSquared() const
    {
        const VectorSpan vs;
        ScalarVector a;

        const auto vx = LoadU(vs, x.data()), vy = LoadU(vs, y.data()), vz = LoadU(vs, z.data());
        const auto V = MulAdd(vx, vx, MulAdd(vy, vy, Mul(vz, vz)));

        StoreU(V, vs, a.data());
        return a;
    }

    YIONOS_ALWAYS_INLINE ScalarVector length() const
    {
        const VectorSpan vs;
        ScalarVector a;

        const auto vx = LoadU(vs, x.data()), vy = LoadU(vs, y.data()), vz = LoadU(vs, z.data());
        auto V = MulAdd(vx, vx, MulAdd(vy, vy, Mul(vz, vz)));
        V = Sqrt(V);

        StoreU(V, vs, a.data());
        return a;
    }

    YIONOS_ALWAYS_INLINE WideVector3 cross(const WideVector3& o) const
    {
        const VectorSpan vs;
        WideVector3 c;

        const auto vAx = LoadU(vs, x.data()), vAy = LoadU(vs, y.data()), vAz = LoadU(vs, z.data());
        const auto vBx = LoadU(vs, o.x.data()), vBy = LoadU(vs, o.y.data()), vBz = LoadU(vs, o.z.data());

        auto V1 = MulSub(vAy, vBz, Mul(vAz, vBy)), V2 = MulSub(vAz, vBx, Mul(vAx, vBz)), V3 = MulSub(vAx, vBy, Mul(vAy, vBx));
        StoreU(V1, vs, c.x.data());
        StoreU(V2, vs, c.y.data());
        StoreU(V3, vs, c.z.data());

        return c;
    }

    YIONOS_ALWAYS_INLINE WideVector3 normalized() const
    {
        const VectorSpan vs;
        WideVector3 n;

        auto vx = LoadU(vs, x.data()), vy = LoadU(vs, y.data()), vz = LoadU(vs, z.data());
        auto V = MulAdd(vx, vx, MulAdd(vy, vy, Mul(vz, vz)));
        V = ApproximateReciprocalSqrt(V);

        vx = Mul(vx, V);
        vy = Mul(vy, V);
        vz = Mul(vz, V);

        StoreU(vx, vs, n.x.data());
        StoreU(vy, vs, n.y.data());
        StoreU(vz, vs, n.z.data());

        return n;
    }
};

}

#endif /* YIONOS_CONTRAPTION_WIDE_TYPES */
