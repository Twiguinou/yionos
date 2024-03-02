package nuklear;

public record nk_style_item(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$data = nuklear.nk_style_item_data.gStructLayout;
    public static final long OFFSET$data = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$data
    ).withName("nk_style_item");

    public nk_style_item(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_item getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_item(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public nuklear.nk_style_item_data data() {return new nuklear.nk_style_item_data(this._ptr.asSlice(OFFSET$data, LAYOUT$data));}
    public void data(java.util.function.Consumer<nuklear.nk_style_item_data> consumer) {consumer.accept(this.data());}
    public void data(nuklear.nk_style_item_data value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$data, LAYOUT$data.byteSize());}
}
