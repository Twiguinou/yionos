package nuklear;

public record nk_style_item_data(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout.withName("color");
    public static final long OFFSET__color = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__image = nuklear.nk_image.gRecordLayout.withName("image");
    public static final long OFFSET__image = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__slice = nuklear.nk_nine_slice.gRecordLayout.withName("slice");
    public static final long OFFSET__slice = 0;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__color,
            LAYOUT__image,
            LAYOUT__slice
    ).withByteAlignment(8).withName("nk_style_item_data");

    public nk_style_item_data(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_item_data getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_item_data(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_item_data value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}

    public nuklear.nk_image image() {return new nuklear.nk_image(this._ptr.asSlice(OFFSET__image, LAYOUT__image));}
    public void image(java.util.function.Consumer<nuklear.nk_image> consumer) {consumer.accept(this.image());}
    public void image(nuklear.nk_image value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__image, LAYOUT__image.byteSize());}

    public nuklear.nk_nine_slice slice() {return new nuklear.nk_nine_slice(this._ptr.asSlice(OFFSET__slice, LAYOUT__slice));}
    public void slice(java.util.function.Consumer<nuklear.nk_nine_slice> consumer) {consumer.accept(this.slice());}
    public void slice(nuklear.nk_nine_slice value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__slice, LAYOUT__slice.byteSize());}
}
