package nuklear;

public record nk_style_item_data(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$color = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$image = nuklear.nk_image.gStructLayout;
    public static final long OFFSET$image = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$slice = nuklear.nk_nine_slice.gStructLayout;
    public static final long OFFSET$slice = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$color,
            LAYOUT$image,
            LAYOUT$slice
    ).withName("nk_style_item_data");

    public nk_style_item_data(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_item_data getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_item_data(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$color, LAYOUT$color.byteSize());}

    public nuklear.nk_image image() {return new nuklear.nk_image(this._ptr.asSlice(OFFSET$image, LAYOUT$image));}
    public void image(java.util.function.Consumer<nuklear.nk_image> consumer) {consumer.accept(this.image());}
    public void image(nuklear.nk_image value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$image, LAYOUT$image.byteSize());}

    public nuklear.nk_nine_slice slice() {return new nuklear.nk_nine_slice(this._ptr.asSlice(OFFSET$slice, LAYOUT$slice));}
    public void slice(java.util.function.Consumer<nuklear.nk_nine_slice> consumer) {consumer.accept(this.slice());}
    public void slice(nuklear.nk_nine_slice value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$slice, LAYOUT$slice.byteSize());}
}
