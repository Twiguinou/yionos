#ifndef YIONOS_CONTRAPTION_MATRIX3
#define YIONOS_CONTRAPTION_MATRIX3

#include "Vector3.h"

namespace yionos
{

struct Matrix3
{
    Vector3 row1, row2, row3;

    Matrix3()
    : row1(1.0, 0.0, 0.0), row2(0.0, 1.0, 0.0), row3(0.0, 0.0, 1.0)
    {}

    Matrix3(const Vector3 &row1, const Vector3 &row2, const Vector3 &row3)
    : row1(row1), row2(row2), row3(row3)
    {}

    YIONOS_ALWAYS_INLINE double det() const
    {
        double c1 = row1.x() * FMSub(row2.y(), row3.z(), row3.y() * row2.z());
        double c2 = row1.y() * FMSub(row3.x(), row2.z(), row2.x() * row3.z());
        double c3 = row1.z() * FMSub(row2.x(), row3.y(), row3.x() * row2.y());

        return c1 + c2 + c3;
    }

    YIONOS_ALWAYS_INLINE Matrix3 inverse() const
    {
        double dm11 = FMSub(row2.y(), row3.z(), row3.y() * row2.z());
        double dm12 = FMSub(row3.x(), row2.z(), row2.x() * row3.z());
        double dm13 = FMSub(row2.x(), row3.y(), row3.x() * row2.y());

        double dm21 = FMSub(row3.y(), row1.z(), row1.y() * row3.z());
        double dm22 = FMSub(row1.x(), row3.z(), row3.x() * row1.z());
        double dm23 = FMSub(row3.x(), row1.y(), row1.x() * row3.y());

        double dm31 = FMSub(row1.y(), row2.z(), row2.y() * row1.z());
        double dm32 = FMSub(row2.x(), row1.z(), row1.x() * row2.z());
        double dm33 = FMSub(row1.x(), row2.y(), row2.x() * row1.y());

        double inverseDeterminant = 1.0 / (dm11 * row1.x() + dm12 * row1.y() + dm13 * row1.z());

        return Matrix3(
                Vector3(dm11 * inverseDeterminant, dm12 * inverseDeterminant, dm13 * inverseDeterminant),
                Vector3(dm21 * inverseDeterminant, dm22 * inverseDeterminant, dm23 * inverseDeterminant),
                Vector3(dm31 * inverseDeterminant, dm32 * inverseDeterminant, dm33 * inverseDeterminant)
        );
    }

    YIONOS_ALWAYS_INLINE Matrix3 transposed() const
    {
        return Matrix3(
                Vector3(row1.x(), row2.x(), row3.x()),
                Vector3(row1.y(), row2.y(), row3.y()),
                Vector3(row1.z(), row2.z(), row3.z())
        );
    }

    YIONOS_ALWAYS_INLINE Matrix3 operator+(const Matrix3 &o) const
    {
        return Matrix3(row1 + o.row1, row2 + o.row2, row3 + o.row3);
    }

    YIONOS_ALWAYS_INLINE Matrix3 &operator+=(const Matrix3 &o)
    {
        row1 += o.row1;
        row2 += o.row2;
        row3 += o.row3;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Vector3 operator*(const Vector3 &v) const
    {
        return Vector3(row1.dot(v), row2.dot(v), row3.dot(v));
    }

    YIONOS_ALWAYS_INLINE Matrix3 operator*(const Matrix3 &o) const
    {
        Vector3 nr1(
                row1.x() * o.row1.x() + row1.y() * o.row2.x() + row1.z() * o.row3.x(),
                row1.x() * o.row1.y() + row1.y() * o.row2.y() + row1.z() * o.row3.y(),
                row1.x() * o.row1.z() + row1.y() * o.row2.z() + row1.z() * o.row3.z()
        );
        Vector3 nr2(
                row2.x() * o.row1.x() + row2.y() * o.row2.x() + row2.z() * o.row3.x(),
                row2.x() * o.row1.y() + row2.y() * o.row2.y() + row2.z() * o.row3.y(),
                row2.x() * o.row1.z() + row2.y() * o.row2.z() + row2.z() * o.row3.z()
        );
        Vector3 nr3(
                row3.x() * o.row1.x() + row3.y() * o.row2.x() + row3.z() * o.row3.x(),
                row3.x() * o.row1.y() + row3.y() * o.row2.y() + row3.z() * o.row3.y(),
                row3.x() * o.row1.z() + row3.y() * o.row2.z() + row3.z() * o.row3.z()
        );

        return Matrix3(nr1, nr2, nr3);
    }

    YIONOS_ALWAYS_INLINE Matrix3 &operator*=(const Matrix3 &o)
    {
        Vector3 nr1(
                row1.x() * o.row1.x() + row1.y() * o.row2.x() + row1.z() * o.row3.x(),
                row1.x() * o.row1.y() + row1.y() * o.row2.y() + row1.z() * o.row3.y(),
                row1.x() * o.row1.z() + row1.y() * o.row2.z() + row1.z() * o.row3.z()
        );
        Vector3 nr2(
                row2.x() * o.row1.x() + row2.y() * o.row2.x() + row2.z() * o.row3.x(),
                row2.x() * o.row1.y() + row2.y() * o.row2.y() + row2.z() * o.row3.y(),
                row2.x() * o.row1.z() + row2.y() * o.row2.z() + row2.z() * o.row3.z()
        );
        Vector3 nr3(
                row3.x() * o.row1.x() + row3.y() * o.row2.x() + row3.z() * o.row3.x(),
                row3.x() * o.row1.y() + row3.y() * o.row2.y() + row3.z() * o.row3.y(),
                row3.x() * o.row1.z() + row3.y() * o.row2.z() + row3.z() * o.row3.z()
        );

        row1 = nr1;
        row2 = nr2;
        row3 = nr3;

        return *this;
    }

    YIONOS_ALWAYS_INLINE Matrix3 operator*(double s) const
    {
        return Matrix3(row1 * s, row2 * s, row3 * s);
    }

    YIONOS_ALWAYS_INLINE Matrix3 &operator*=(double s)
    {
        row1 *= s;
        row2 *= s;
        row3 *= s;

        return *this;
    }
};

YIONOS_ALWAYS_INLINE Matrix3 operator*(double s, const Matrix3 &m)
{
    return m * s;
}

} /* yionos */

#endif /* YIONOS_CONTRAPTION_MATRIX3 */
