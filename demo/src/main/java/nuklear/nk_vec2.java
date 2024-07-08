package nuklear;

public record nk_vec2(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("x");
    public static final long OFFSET__x = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("y");
    public static final long OFFSET__y = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__x,
            LAYOUT__y
    ).withByteAlignment(4).withName("nk_vec2");

    public nk_vec2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_vec2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_vec2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_vec2 value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float x() {return this._ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(float value) {this._ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this._ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public float y() {return this._ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(float value) {this._ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this._ptr.asSlice(OFFSET__y, LAYOUT__y);}
}
