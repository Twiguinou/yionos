package nuklear;

public record nk_cursor(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__img = nuklear.nk_image.gRecordLayout;
    public static final long OFFSET__img = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__size = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__size = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__offset = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__offset = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__img,
            LAYOUT__size,
            LAYOUT__offset
    ).withByteAlignment(8).withName("nk_cursor");

    public nk_cursor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_cursor getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_cursor(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_cursor value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_image img() {return new nuklear.nk_image(this._ptr.asSlice(OFFSET__img, LAYOUT__img));}
    public void img(java.util.function.Consumer<nuklear.nk_image> consumer) {consumer.accept(this.img());}
    public void img(nuklear.nk_image value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__img, LAYOUT__img.byteSize());}

    public nuklear.nk_vec2 size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__size, LAYOUT__size));}
    public void size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.size());}
    public void size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__size, LAYOUT__size.byteSize());}

    public nuklear.nk_vec2 offset() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__offset, LAYOUT__offset));}
    public void offset(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.offset());}
    public void offset(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__offset, LAYOUT__offset.byteSize());}
}
