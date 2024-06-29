package nuklear;

public record nk_list_view(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__begin = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__begin = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__end = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__end = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__count = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__total_height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__total_height = 12;
    public static final java.lang.foreign.AddressLayout LAYOUT__ctx = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__ctx = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__scroll_pointer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__scroll_pointer = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__scroll_value = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__scroll_value = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__begin,
            LAYOUT__end,
            LAYOUT__count,
            LAYOUT__total_height,
            LAYOUT__ctx,
            LAYOUT__scroll_pointer,
            LAYOUT__scroll_value,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_list_view");

    public nk_list_view(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_list_view getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_list_view(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_list_view value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int begin() {return this._ptr.get(LAYOUT__begin, OFFSET__begin);}
    public void begin(int value) {this._ptr.set(LAYOUT__begin, OFFSET__begin, value);}
    public java.lang.foreign.MemorySegment $begin() {return this._ptr.asSlice(OFFSET__begin, LAYOUT__begin);}

    public int end() {return this._ptr.get(LAYOUT__end, OFFSET__end);}
    public void end(int value) {this._ptr.set(LAYOUT__end, OFFSET__end, value);}
    public java.lang.foreign.MemorySegment $end() {return this._ptr.asSlice(OFFSET__end, LAYOUT__end);}

    public int count() {return this._ptr.get(LAYOUT__count, OFFSET__count);}
    public void count(int value) {this._ptr.set(LAYOUT__count, OFFSET__count, value);}
    public java.lang.foreign.MemorySegment $count() {return this._ptr.asSlice(OFFSET__count, LAYOUT__count);}

    public int total_height() {return this._ptr.get(LAYOUT__total_height, OFFSET__total_height);}
    public void total_height(int value) {this._ptr.set(LAYOUT__total_height, OFFSET__total_height, value);}
    public java.lang.foreign.MemorySegment $total_height() {return this._ptr.asSlice(OFFSET__total_height, LAYOUT__total_height);}

    public java.lang.foreign.MemorySegment ctx() {return this._ptr.get(LAYOUT__ctx, OFFSET__ctx);}
    public void ctx(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__ctx, OFFSET__ctx, value);}
    public java.lang.foreign.MemorySegment $ctx() {return this._ptr.asSlice(OFFSET__ctx, LAYOUT__ctx);}

    public java.lang.foreign.MemorySegment scroll_pointer() {return this._ptr.get(LAYOUT__scroll_pointer, OFFSET__scroll_pointer);}
    public void scroll_pointer(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__scroll_pointer, OFFSET__scroll_pointer, value);}
    public java.lang.foreign.MemorySegment $scroll_pointer() {return this._ptr.asSlice(OFFSET__scroll_pointer, LAYOUT__scroll_pointer);}

    public int scroll_value() {return this._ptr.get(LAYOUT__scroll_value, OFFSET__scroll_value);}
    public void scroll_value(int value) {this._ptr.set(LAYOUT__scroll_value, OFFSET__scroll_value, value);}
    public java.lang.foreign.MemorySegment $scroll_value() {return this._ptr.asSlice(OFFSET__scroll_value, LAYOUT__scroll_value);}
}
