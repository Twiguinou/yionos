package nuklear;

public record nk_draw_vertex_layout_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attribute = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$attribute = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$format = 4L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$attribute,
            LAYOUT$format,
            LAYOUT$offset
    ).withName("nk_draw_vertex_layout_element");

    public nk_draw_vertex_layout_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_draw_vertex_layout_element getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_draw_vertex_layout_element(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int attribute() {return this._ptr.get(LAYOUT$attribute, OFFSET$attribute);}
    public void attribute(int value) {this._ptr.set(LAYOUT$attribute, OFFSET$attribute, value);}
    public java.lang.foreign.MemorySegment attribute_ptr() {return this._ptr.asSlice(OFFSET$attribute, LAYOUT$attribute);}

    public int format() {return this._ptr.get(LAYOUT$format, OFFSET$format);}
    public void format(int value) {this._ptr.set(LAYOUT$format, OFFSET$format, value);}
    public java.lang.foreign.MemorySegment format_ptr() {return this._ptr.asSlice(OFFSET$format, LAYOUT$format);}

    public long offset() {return this._ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this._ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this._ptr.asSlice(OFFSET$offset, LAYOUT$offset);}
}
