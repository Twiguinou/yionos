package yionos.utils;

public final class MathDefinitions
{private MathDefinitions() {}

    public static final double PI = Math.PI;
    public static final double PI_2 = PI * 0.5;
    public static final double PIx2 = PI * 2.0;

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
}
