package nuklear;

public record nk_cursor(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$img = nuklear.nk_image.gStructLayout;
    public static final long OFFSET$img = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$size = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$size = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$offset = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$offset = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$img,
            LAYOUT$size,
            LAYOUT$offset
    ).withName("nk_cursor");

    public nk_cursor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_cursor getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_cursor(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_image img() {return new nuklear.nk_image(this._ptr.asSlice(OFFSET$img, LAYOUT$img));}
    public void img(java.util.function.Consumer<nuklear.nk_image> consumer) {consumer.accept(this.img());}
    public void img(nuklear.nk_image value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$img, LAYOUT$img.byteSize());}

    public nuklear.nk_vec2 size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$size, LAYOUT$size));}
    public void size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.size());}
    public void size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$size, LAYOUT$size.byteSize());}

    public nuklear.nk_vec2 offset() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$offset, LAYOUT$offset));}
    public void offset(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.offset());}
    public void offset(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$offset, LAYOUT$offset.byteSize());}
}
