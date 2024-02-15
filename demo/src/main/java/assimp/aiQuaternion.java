package assimp;

public record aiQuaternion(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$w = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$z = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$z = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$w,
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$z
    ).withName("aiQuaternion");

    public aiQuaternion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiQuaternion getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiQuaternion(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float w() {return this.ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(float value) {this.ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this.ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public float x() {return this.ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(float value) {this.ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this.ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public float y() {return this.ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(float value) {this.ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this.ptr.asSlice(OFFSET$y, LAYOUT$y);}

    public float z() {return this.ptr.get(LAYOUT$z, OFFSET$z);}
    public void z(float value) {this.ptr.set(LAYOUT$z, OFFSET$z, value);}
    public java.lang.foreign.MemorySegment z_ptr() {return this.ptr.asSlice(OFFSET$z, LAYOUT$z);}
}
