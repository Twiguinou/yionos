package nuklear;

public record nk_vec2i(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("x");
    public static final long OFFSET__x = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("y");
    public static final long OFFSET__y = 2;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__x,
            LAYOUT__y
    ).withByteAlignment(2).withName("nk_vec2i");

    public nk_vec2i(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_vec2i getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_vec2i(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_vec2i value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public short x() {return this._ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(short value) {this._ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this._ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public short y() {return this._ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(short value) {this._ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this._ptr.asSlice(OFFSET__y, LAYOUT__y);}
}
