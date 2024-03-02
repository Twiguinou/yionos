package nuklear;

public record nk_draw_null_texture(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$texture = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$texture = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$uv = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$uv = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$texture,
            LAYOUT$uv
    ).withName("nk_draw_null_texture");

    public nk_draw_null_texture(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_draw_null_texture getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_draw_null_texture(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$texture, LAYOUT$texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$texture, LAYOUT$texture.byteSize());}

    public nuklear.nk_vec2 uv() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$uv, LAYOUT$uv));}
    public void uv(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.uv());}
    public void uv(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$uv, LAYOUT$uv.byteSize());}
}
