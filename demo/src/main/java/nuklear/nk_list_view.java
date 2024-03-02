package nuklear;

public record nk_list_view(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$begin = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$begin = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$end = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$end = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$count = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$total_height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$total_height = 12L;
    public static final java.lang.foreign.AddressLayout LAYOUT$ctx = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ctx = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$scroll_pointer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$scroll_pointer = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$scroll_value = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$scroll_value = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$begin,
            LAYOUT$end,
            LAYOUT$count,
            LAYOUT$total_height,
            LAYOUT$ctx,
            LAYOUT$scroll_pointer,
            LAYOUT$scroll_value,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_list_view");

    public nk_list_view(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_list_view getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_list_view(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int begin() {return this._ptr.get(LAYOUT$begin, OFFSET$begin);}
    public void begin(int value) {this._ptr.set(LAYOUT$begin, OFFSET$begin, value);}
    public java.lang.foreign.MemorySegment begin_ptr() {return this._ptr.asSlice(OFFSET$begin, LAYOUT$begin);}

    public int end() {return this._ptr.get(LAYOUT$end, OFFSET$end);}
    public void end(int value) {this._ptr.set(LAYOUT$end, OFFSET$end, value);}
    public java.lang.foreign.MemorySegment end_ptr() {return this._ptr.asSlice(OFFSET$end, LAYOUT$end);}

    public int count() {return this._ptr.get(LAYOUT$count, OFFSET$count);}
    public void count(int value) {this._ptr.set(LAYOUT$count, OFFSET$count, value);}
    public java.lang.foreign.MemorySegment count_ptr() {return this._ptr.asSlice(OFFSET$count, LAYOUT$count);}

    public int total_height() {return this._ptr.get(LAYOUT$total_height, OFFSET$total_height);}
    public void total_height(int value) {this._ptr.set(LAYOUT$total_height, OFFSET$total_height, value);}
    public java.lang.foreign.MemorySegment total_height_ptr() {return this._ptr.asSlice(OFFSET$total_height, LAYOUT$total_height);}

    public java.lang.foreign.MemorySegment ctx() {return this._ptr.get(LAYOUT$ctx, OFFSET$ctx);}
    public void ctx(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$ctx, OFFSET$ctx, value);}
    public java.lang.foreign.MemorySegment ctx_ptr() {return this._ptr.asSlice(OFFSET$ctx, LAYOUT$ctx);}

    public java.lang.foreign.MemorySegment scroll_pointer() {return this._ptr.get(LAYOUT$scroll_pointer, OFFSET$scroll_pointer);}
    public void scroll_pointer(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$scroll_pointer, OFFSET$scroll_pointer, value);}
    public java.lang.foreign.MemorySegment scroll_pointer_ptr() {return this._ptr.asSlice(OFFSET$scroll_pointer, LAYOUT$scroll_pointer);}

    public int scroll_value() {return this._ptr.get(LAYOUT$scroll_value, OFFSET$scroll_value);}
    public void scroll_value(int value) {this._ptr.set(LAYOUT$scroll_value, OFFSET$scroll_value, value);}
    public java.lang.foreign.MemorySegment scroll_value_ptr() {return this._ptr.asSlice(OFFSET$scroll_value, LAYOUT$scroll_value);}
}
