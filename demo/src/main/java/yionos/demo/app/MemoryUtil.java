package yionos.demo.app;

import org.joml.Matrix4dc;
import org.joml.Vector4dc;

import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.*;

public final class MemoryUtil
{private MemoryUtil() {}

    public static void getMatrix4dFloats(Matrix4dc m, MemorySegment segment)
    {
        segment.setAtIndex(JAVA_FLOAT, 0, (float)m.m00());
        segment.setAtIndex(JAVA_FLOAT, 1, (float)m.m01());
        segment.setAtIndex(JAVA_FLOAT, 2, (float)m.m02());
        segment.setAtIndex(JAVA_FLOAT, 3, (float)m.m03());
        segment.setAtIndex(JAVA_FLOAT, 4, (float)m.m10());
        segment.setAtIndex(JAVA_FLOAT, 5, (float)m.m11());
        segment.setAtIndex(JAVA_FLOAT, 6, (float)m.m12());
        segment.setAtIndex(JAVA_FLOAT, 7, (float)m.m13());
        segment.setAtIndex(JAVA_FLOAT, 8, (float)m.m20());
        segment.setAtIndex(JAVA_FLOAT, 9, (float)m.m21());
        segment.setAtIndex(JAVA_FLOAT, 10, (float)m.m22());
        segment.setAtIndex(JAVA_FLOAT, 11, (float)m.m23());
        segment.setAtIndex(JAVA_FLOAT, 12, (float)m.m30());
        segment.setAtIndex(JAVA_FLOAT, 13, (float)m.m31());
        segment.setAtIndex(JAVA_FLOAT, 14, (float)m.m32());
        segment.setAtIndex(JAVA_FLOAT, 15, (float)m.m33());
    }

    public static void getVector4dFloats(Vector4dc v, MemorySegment segment)
    {
        segment.setAtIndex(JAVA_FLOAT, 0, (float)v.x());
        segment.setAtIndex(JAVA_FLOAT, 1, (float)v.y());
        segment.setAtIndex(JAVA_FLOAT, 2, (float)v.z());
        segment.setAtIndex(JAVA_FLOAT, 3, (float)v.w());
    }
}
