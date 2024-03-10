#ifndef YIONOS_CONTRAPTION_VECTOR3
#define YIONOS_CONTRAPTION_VECTOR3

#include "MathDefinitions.h"

namespace yionos
{

class Vector3
{
    double m_x, m_y, m_z;

public:
    Vector3() = default;

    Vector3(double x, double y, double z)
    : m_x(x), m_y(y), m_z(z)
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

    YIONOS_ALWAYS_INLINE double dot(const Vector3 &o) const
    {
        return FMAdd(m_x, o.m_x, FMAdd(m_y, o.m_y, m_z * o.m_z));
    }

    YIONOS_ALWAYS_INLINE double lengthSquared() const
    {
        return dot(*this);
    }

    YIONOS_ALWAYS_INLINE double length() const
    {
        return Sqrt(lengthSquared());
    }

    YIONOS_ALWAYS_INLINE Vector3 cross(const Vector3 &o) const
    {
        return Vector3(FMSub(m_y, o.m_z, m_z * o.m_y), FMSub(m_z, o.m_x, m_x * o.m_z), FMSub(m_x, o.m_y, m_y * o.m_x));
    }

    YIONOS_ALWAYS_INLINE Vector3 normalized() const
    {
        double length2 = lengthSquared();
        YIONOS_ASSERT(length2 >= YIONOS_EPSILON);
        return *this * InvSqrt(length2);
    }

    YIONOS_ALWAYS_INLINE Vector3 operator+(const Vector3 &o) const
    {
        return Vector3(m_x + o.m_x, m_y + o.m_y, m_z + o.m_z);
    }

    YIONOS_ALWAYS_INLINE Vector3 &operator+=(const Vector3 &o)
    {
        m_x += o.m_x;
        m_y += o.m_y;
        m_z += o.m_z;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Vector3 operator-(const Vector3 &o) const
    {
        return Vector3(m_x - o.m_x, m_y - o.m_y, m_z - o.m_z);
    }

    YIONOS_ALWAYS_INLINE Vector3 &operator-=(const Vector3 &o)
    {
        m_x -= o.m_x;
        m_y -= o.m_y;
        m_z -= o.m_z;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Vector3 operator-() const
    {
        return Vector3(-m_x, -m_y, -m_z);
    }

    YIONOS_ALWAYS_INLINE Vector3 &operator=(const Vector3 &o) = default;

    YIONOS_ALWAYS_INLINE Vector3 operator*(double s) const
    {
        return Vector3(m_x * s, m_y * s, m_z * s);
    }

    YIONOS_ALWAYS_INLINE Vector3 &operator*=(double s)
    {
        m_x *= s;
        m_y *= s;
        m_z *= s;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Vector3 operator/(double s) const
    {
        return Vector3(m_x / s, m_y / s, m_z / s);
    }

    YIONOS_ALWAYS_INLINE Vector3 &operator/=(double s)
    {
        m_x /= s;
        m_y /= s;
        m_z /= s;

        return *this;
    }
};

YIONOS_ALWAYS_INLINE Vector3 operator*(double s, const Vector3 &v)
{
    return v * s;
}

} /* yionos */

#endif /* YIONOS_CONTRAPTION_VECTOR3 */
