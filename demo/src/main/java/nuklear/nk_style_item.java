package nuklear;

public record nk_style_item(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 0;
    public static final java.lang.foreign.UnionLayout LAYOUT__data = nuklear.nk_style_item_data.gRecordLayout.withName("data");
    public static final long OFFSET__data = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__data
    ).withByteAlignment(8).withName("nk_style_item");

    public nk_style_item(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_item getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_item(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_item value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public nuklear.nk_style_item_data data() {return new nuklear.nk_style_item_data(this._ptr.asSlice(OFFSET__data, LAYOUT__data));}
    public void data(java.util.function.Consumer<nuklear.nk_style_item_data> consumer) {consumer.accept(this.data());}
    public void data(nuklear.nk_style_item_data value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__data, LAYOUT__data.byteSize());}
}
