package assimp;

public record aiQuaternion(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("w");
    public static final long OFFSET__w = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("x");
    public static final long OFFSET__x = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("y");
    public static final long OFFSET__y = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__z = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("z");
    public static final long OFFSET__z = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__w,
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__z
    ).withByteAlignment(4).withName("aiQuaternion");

    public aiQuaternion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiQuaternion getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiQuaternion(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiQuaternion value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float w() {return this.ptr.get(LAYOUT__w, OFFSET__w);}
    public void w(float value) {this.ptr.set(LAYOUT__w, OFFSET__w, value);}
    public java.lang.foreign.MemorySegment $w() {return this.ptr.asSlice(OFFSET__w, LAYOUT__w);}

    public float x() {return this.ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(float value) {this.ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this.ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public float y() {return this.ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(float value) {this.ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this.ptr.asSlice(OFFSET__y, LAYOUT__y);}

    public float z() {return this.ptr.get(LAYOUT__z, OFFSET__z);}
    public void z(float value) {this.ptr.set(LAYOUT__z, OFFSET__z, value);}
    public java.lang.foreign.MemorySegment $z() {return this.ptr.asSlice(OFFSET__z, LAYOUT__z);}
}
