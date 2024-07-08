package nuklear;

public record nk_draw_vertex_layout_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attribute = java.lang.foreign.ValueLayout.JAVA_INT.withName("attribute");
    public static final long OFFSET__attribute = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 4;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("offset");
    public static final long OFFSET__offset = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__attribute,
            LAYOUT__format,
            LAYOUT__offset
    ).withByteAlignment(8).withName("nk_draw_vertex_layout_element");

    public nk_draw_vertex_layout_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_draw_vertex_layout_element getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_draw_vertex_layout_element(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_draw_vertex_layout_element value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int attribute() {return this._ptr.get(LAYOUT__attribute, OFFSET__attribute);}
    public void attribute(int value) {this._ptr.set(LAYOUT__attribute, OFFSET__attribute, value);}
    public java.lang.foreign.MemorySegment $attribute() {return this._ptr.asSlice(OFFSET__attribute, LAYOUT__attribute);}

    public int format() {return this._ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this._ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this._ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public long offset() {return this._ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this._ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this._ptr.asSlice(OFFSET__offset, LAYOUT__offset);}
}
