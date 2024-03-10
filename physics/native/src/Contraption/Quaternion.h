#ifndef YIONOS_CONTRAPTION_QUATERNION
#define YIONOS_CONTRAPTION_QUATERNION

#include "Vector3.h"

namespace yionos
{

class Quaternion
{
    double m_x, m_y, m_z, m_w;

public:
    Quaternion()
    : m_x(0.0), m_y(0.0), m_z(0.0), m_w(1.0)
    {}

    Quaternion(double x, double y, double z, double w)
    : m_x(x), m_y(y), m_z(z), m_w(w)
    {}

    YIONOS_ALWAYS_INLINE double x() const
    {
        return m_x;
    }

    YIONOS_ALWAYS_INLINE double y() const
    {
        return m_y;
    }

    YIONOS_ALWAYS_INLINE double z() const
    {
        return m_z;
    }

    YIONOS_ALWAYS_INLINE double w() const
    {
        return m_w;
    }

    YIONOS_ALWAYS_INLINE double dot(const Quaternion &o) const
    {
        return FMAdd(m_x, o.m_x, FMAdd(m_y, o.m_y, FMAdd(m_z, o.m_z, m_w * o.m_w)));
    }

    YIONOS_ALWAYS_INLINE double lengthSquared() const
    {
        return dot(*this);
    }

    YIONOS_ALWAYS_INLINE double length() const
    {
        return Sqrt(lengthSquared());
    }

    YIONOS_ALWAYS_INLINE Quaternion normalized() const
    {
        double length2 = lengthSquared();
        YIONOS_ASSERT(length2 >= YIONOS_EPSILON);
        return *this * InvSqrt(length2);
    }

    YIONOS_ALWAYS_INLINE Quaternion conjugate() const
    {
        return Quaternion(-m_x, -m_y, -m_z, m_w);
    }

    YIONOS_ALWAYS_INLINE Vector3 transform(const Vector3 &v) const
    {
        Vector3 q(m_x, m_y, m_z);
        Vector3 qv2 = 2.0 * q.cross(v);

        return v + m_w * qv2 + q.cross(qv2);
    }

    YIONOS_ALWAYS_INLINE Quaternion &operator=(const Quaternion &o) = default;

    YIONOS_ALWAYS_INLINE Quaternion operator+(const Quaternion &o) const
    {
        return Quaternion(m_x + o.m_x, m_y + o.m_y, m_z + o.m_z, m_w + o.m_w);
    }

    YIONOS_ALWAYS_INLINE Quaternion &operator+=(const Quaternion &o)
    {
        m_x += o.m_x;
        m_y += o.m_y;
        m_z += o.m_z;
        m_w += o.m_w;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Quaternion operator-(const Quaternion &o) const
    {
        return Quaternion(m_x - o.m_x, m_y - o.m_y, m_z - o.m_z, m_w - o.m_w);
    }

    YIONOS_ALWAYS_INLINE Quaternion &operator-=(const Quaternion &o)
    {
        m_x -= o.m_x;
        m_y -= o.m_y;
        m_z -= o.m_z;
        m_w -= o.m_w;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Quaternion operator*(const Quaternion &o) const
    {
        return Quaternion(
                FMAdd(m_w, o.m_x, FMAdd(m_x, o.m_w, FMSub(m_y, o.m_z, m_z * o.m_y))),
                FMAdd(m_w, o.m_y, FMAdd(-m_x, o.m_z, FMAdd(m_y, o.m_w, m_z * o.m_x))),
                FMAdd(m_w, o.m_z, FMAdd(m_x, o.m_y, FMAdd(-m_y, o.m_x, m_z * o.m_w))),
                FMSub(m_w, o.m_w, FMAdd(m_x, o.m_x, FMAdd(m_y, o.m_y, m_z * o.m_z)))
        );
    }

    YIONOS_ALWAYS_INLINE Quaternion &operator*=(const Quaternion &o)
    {
        double nx = FMAdd(m_w, o.m_x, FMAdd(m_x, o.m_w, FMSub(m_y, o.m_z, m_z * o.m_y)));
        double ny = FMAdd(m_w, o.m_y, FMAdd(-m_x, o.m_z, FMAdd(m_y, o.m_w, m_z * o.m_x)));
        double nz = FMAdd(m_w, o.m_z, FMAdd(m_x, o.m_y, FMAdd(-m_y, o.m_x, m_z * o.m_w)));
        double nw = FMSub(m_w, o.m_w, FMAdd(m_x, o.m_x, FMAdd(m_y, o.m_y, m_z * o.m_z)));

        m_x = nx;
        m_y = ny;
        m_z = nz;
        m_w = nw;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Quaternion operator*(double s) const
    {
        return Quaternion(m_x * s, m_y * s, m_z * s, m_w * s);
    }

    YIONOS_ALWAYS_INLINE Quaternion &operator*=(double s)
    {
        m_x *= s;
        m_y *= s;
        m_z *= s;
        m_w *= s;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Quaternion operator/(double s) const
    {
        return Quaternion(m_x / s, m_y / s, m_z / s, m_w / s);
    }

    YIONOS_ALWAYS_INLINE Quaternion &operator/=(double s)
    {
        m_x /= s;
        m_y /= s;
        m_z /= s;
        m_w /= s;

        return *this;
    }
};

YIONOS_ALWAYS_INLINE Quaternion operator*(double s, const Quaternion &q)
{
    return q * s;
}

} /* yionos */

#endif /* YIONOS_CONTRAPTION_QUATERNION */
