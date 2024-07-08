package nuklear;

public record nk_draw_null_texture(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.UnionLayout LAYOUT__texture = nuklear.nk_handle.gRecordLayout.withName("texture");
    public static final long OFFSET__texture = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__uv = nuklear.nk_vec2.gRecordLayout.withName("uv");
    public static final long OFFSET__uv = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__texture,
            LAYOUT__uv
    ).withByteAlignment(8).withName("nk_draw_null_texture");

    public nk_draw_null_texture(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_draw_null_texture getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_draw_null_texture(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_draw_null_texture value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_handle texture() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__texture, LAYOUT__texture));}
    public void texture(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.texture());}
    public void texture(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__texture, LAYOUT__texture.byteSize());}

    public nuklear.nk_vec2 uv() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__uv, LAYOUT__uv));}
    public void uv(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.uv());}
    public void uv(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__uv, LAYOUT__uv.byteSize());}
}
