package yionos.utils;

import org.joml.Intersectiond;
import org.joml.Vector3d;

public final class MathDefinitions
{private MathDefinitions() {}

    public static final double PI = Math.PI, PI_2 = PI * 0.5, PIx2 = PI * 2.0;
    public static final double EPSILON = 1e-8;

    public static double arccos(double x)
    {
        return Math.acos(x);
    }

    public static double arctan(double x)
    {
        return Math.atan(x);
    }

    public static double atan2(double y, double x)
    {
        return Math.atan2(y, x);
    }

    public static double tan(double x)
    {
        return Math.tan(x);
    }

    public static double cos(double x)
    {
        return Math.cos(x);
    }

    public static double sin(double x)
    {
        return Math.sin(x);
    }

    public static double cot(double x)
    {
        return tan(PI_2 - x);
    }

    public static double pow(double x, double y)
    {
        return Math.pow(x, y);
    }

    public static double clamp(double x, double min, double max)
    {
        return Math.clamp(x, min, max);
    }

    public static double radians(double x)
    {
        return Math.toRadians(x);
    }

    public static double degrees(double x)
    {
        return Math.toDegrees(x);
    }

    public static double sqrt(double x)
    {
        return Math.sqrt(x);
    }

    public static boolean isValidVolume(Vector3d min, Vector3d max)
    {
        return (min.x <= max.x) && (min.y <= max.y) && (min.z <= max.z);
    }

    public static boolean volumesOverlap(Vector3d min1, Vector3d max1, Vector3d min2, Vector3d max2)
    {
        return Intersectiond.testAabAab(min1, max1, min2, max2);
    }

    public static void fattenVolume(Vector3d min, Vector3d max, double value)
    {
        min.sub(value, value, value);
        max.add(value, value, value);
    }
}
