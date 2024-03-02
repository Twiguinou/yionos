package nuklear;

public record nk_draw_command(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$elem_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$elem_count = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$clip_rect = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$clip_rect = 4L;
    public static final java.lang.foreign.GroupLayout LAYOUT$texture = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$texture = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$elem_count,
            LAYOUT$clip_rect,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$texture
    ).withName("nk_draw_command");

    public nk_draw_command(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_draw_command getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_draw_command(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int elem_count() {return this._ptr.get(LAYOUT$elem_count, OFFSET$elem_count);}
    public void elem_count(int value) {this._ptr.set(LAYOUT$elem_count, OFFSET$elem_count, value);}
    public java.lang.foreign.MemorySegment elem_count_ptr() {return this._ptr.asSlice(OFFSET$elem_count, LAYOUT$elem_count);}

    public nuklear.nk_rect clip_rect() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$clip_rect, LAYOUT$clip_rect));}
    public void clip_rect(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip_rect());}
    public void clip_rect(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$clip_rect, LAYOUT$clip_rect.byteSize());}

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$texture, LAYOUT$texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$texture, LAYOUT$texture.byteSize());}
}
