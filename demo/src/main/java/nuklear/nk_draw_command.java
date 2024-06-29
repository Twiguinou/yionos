package nuklear;

public record nk_draw_command(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__elem_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__elem_count = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__clip_rect = nuklear.nk_rect.gRecordLayout;
    public static final long OFFSET__clip_rect = 4;
    public static final java.lang.foreign.UnionLayout LAYOUT__texture = nuklear.nk_handle.gRecordLayout;
    public static final long OFFSET__texture = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__elem_count,
            LAYOUT__clip_rect,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__texture
    ).withByteAlignment(8).withName("nk_draw_command");

    public nk_draw_command(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_draw_command getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_draw_command(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_draw_command value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int elem_count() {return this._ptr.get(LAYOUT__elem_count, OFFSET__elem_count);}
    public void elem_count(int value) {this._ptr.set(LAYOUT__elem_count, OFFSET__elem_count, value);}
    public java.lang.foreign.MemorySegment $elem_count() {return this._ptr.asSlice(OFFSET__elem_count, LAYOUT__elem_count);}

    public nuklear.nk_rect clip_rect() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__clip_rect, LAYOUT__clip_rect));}
    public void clip_rect(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip_rect());}
    public void clip_rect(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__clip_rect, LAYOUT__clip_rect.byteSize());}

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__texture, LAYOUT__texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__texture, LAYOUT__texture.byteSize());}
}
