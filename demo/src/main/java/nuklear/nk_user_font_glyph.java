package nuklear;

public record nk_user_font_glyph(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__uv = java.lang.foreign.MemoryLayout.sequenceLayout(2, nuklear.nk_vec2.gRecordLayout).withName("uv");
    public static final long OFFSET__uv = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__offset = nuklear.nk_vec2.gRecordLayout.withName("offset");
    public static final long OFFSET__offset = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("width");
    public static final long OFFSET__width = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("height");
    public static final long OFFSET__height = 28;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__xadvance = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("xadvance");
    public static final long OFFSET__xadvance = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__uv,
            LAYOUT__offset,
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__xadvance
    ).withByteAlignment(4).withName("nk_user_font_glyph");

    public nk_user_font_glyph(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_user_font_glyph getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_user_font_glyph(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_user_font_glyph value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment uv() {return this._ptr.asSlice(OFFSET__uv, LAYOUT__uv);}
    public nuklear.nk_vec2 uv(int index) {return nuklear.nk_vec2.getAtIndex(this.uv(), index);}
    public void uv(int index, java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.uv(index));}
    public void uv(int index, nuklear.nk_vec2 value) {nuklear.nk_vec2.setAtIndex(this.uv(), index, value);}

    public nuklear.nk_vec2 offset() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__offset, LAYOUT__offset));}
    public void offset(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.offset());}
    public void offset(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__offset, LAYOUT__offset.byteSize());}

    public float width() {return this._ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(float value) {this._ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this._ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public float height() {return this._ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(float value) {this._ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this._ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public float xadvance() {return this._ptr.get(LAYOUT__xadvance, OFFSET__xadvance);}
    public void xadvance(float value) {this._ptr.set(LAYOUT__xadvance, OFFSET__xadvance, value);}
    public java.lang.foreign.MemorySegment $xadvance() {return this._ptr.asSlice(OFFSET__xadvance, LAYOUT__xadvance);}
}
