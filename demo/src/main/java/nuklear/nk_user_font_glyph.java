package nuklear;

public record nk_user_font_glyph(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$uv = java.lang.foreign.MemoryLayout.sequenceLayout(2, nuklear.nk_vec2.gStructLayout);
    public static final long OFFSET$uv = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$offset = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$offset = 16L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$width = 24L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$height = 28L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$xadvance = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$xadvance = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$uv,
            LAYOUT$offset,
            LAYOUT$width,
            LAYOUT$height,
            LAYOUT$xadvance
    ).withName("nk_user_font_glyph");

    public nk_user_font_glyph(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_user_font_glyph getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_user_font_glyph(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment uv() {return this._ptr.asSlice(OFFSET$uv, LAYOUT$uv);}
    public nuklear.nk_vec2 uv(int i) {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$uv + i * LAYOUT$uv.byteSize(), LAYOUT$uv));}
    public void uv(int i, java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.uv(i));}
    public void uv(int i, nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$uv + i * LAYOUT$uv.byteSize(), LAYOUT$uv.byteSize());}

    public nuklear.nk_vec2 offset() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$offset, LAYOUT$offset));}
    public void offset(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.offset());}
    public void offset(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$offset, LAYOUT$offset.byteSize());}

    public float width() {return this._ptr.get(LAYOUT$width, OFFSET$width);}
    public void width(float value) {this._ptr.set(LAYOUT$width, OFFSET$width, value);}
    public java.lang.foreign.MemorySegment width_ptr() {return this._ptr.asSlice(OFFSET$width, LAYOUT$width);}

    public float height() {return this._ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(float value) {this._ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this._ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public float xadvance() {return this._ptr.get(LAYOUT$xadvance, OFFSET$xadvance);}
    public void xadvance(float value) {this._ptr.set(LAYOUT$xadvance, OFFSET$xadvance, value);}
    public java.lang.foreign.MemorySegment xadvance_ptr() {return this._ptr.asSlice(OFFSET$xadvance, LAYOUT$xadvance);}
}
