package nuklear;

public record nk_font_glyph(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__codepoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__codepoint = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__xadvance = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__xadvance = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__x0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__x0 = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__y0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__y0 = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__x1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__x1 = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__y1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__y1 = 20;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__w = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__h = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__h = 28;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__u0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__u0 = 32;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__v0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__v0 = 36;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__u1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__u1 = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__v1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__v1 = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__codepoint,
            LAYOUT__xadvance,
            LAYOUT__x0,
            LAYOUT__y0,
            LAYOUT__x1,
            LAYOUT__y1,
            LAYOUT__w,
            LAYOUT__h,
            LAYOUT__u0,
            LAYOUT__v0,
            LAYOUT__u1,
            LAYOUT__v1
    ).withByteAlignment(4).withName("nk_font_glyph");

    public nk_font_glyph(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_font_glyph getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_font_glyph(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_font_glyph value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int codepoint() {return this._ptr.get(LAYOUT__codepoint, OFFSET__codepoint);}
    public void codepoint(int value) {this._ptr.set(LAYOUT__codepoint, OFFSET__codepoint, value);}
    public java.lang.foreign.MemorySegment $codepoint() {return this._ptr.asSlice(OFFSET__codepoint, LAYOUT__codepoint);}

    public float xadvance() {return this._ptr.get(LAYOUT__xadvance, OFFSET__xadvance);}
    public void xadvance(float value) {this._ptr.set(LAYOUT__xadvance, OFFSET__xadvance, value);}
    public java.lang.foreign.MemorySegment $xadvance() {return this._ptr.asSlice(OFFSET__xadvance, LAYOUT__xadvance);}

    public float x0() {return this._ptr.get(LAYOUT__x0, OFFSET__x0);}
    public void x0(float value) {this._ptr.set(LAYOUT__x0, OFFSET__x0, value);}
    public java.lang.foreign.MemorySegment $x0() {return this._ptr.asSlice(OFFSET__x0, LAYOUT__x0);}

    public float y0() {return this._ptr.get(LAYOUT__y0, OFFSET__y0);}
    public void y0(float value) {this._ptr.set(LAYOUT__y0, OFFSET__y0, value);}
    public java.lang.foreign.MemorySegment $y0() {return this._ptr.asSlice(OFFSET__y0, LAYOUT__y0);}

    public float x1() {return this._ptr.get(LAYOUT__x1, OFFSET__x1);}
    public void x1(float value) {this._ptr.set(LAYOUT__x1, OFFSET__x1, value);}
    public java.lang.foreign.MemorySegment $x1() {return this._ptr.asSlice(OFFSET__x1, LAYOUT__x1);}

    public float y1() {return this._ptr.get(LAYOUT__y1, OFFSET__y1);}
    public void y1(float value) {this._ptr.set(LAYOUT__y1, OFFSET__y1, value);}
    public java.lang.foreign.MemorySegment $y1() {return this._ptr.asSlice(OFFSET__y1, LAYOUT__y1);}

    public float w() {return this._ptr.get(LAYOUT__w, OFFSET__w);}
    public void w(float value) {this._ptr.set(LAYOUT__w, OFFSET__w, value);}
    public java.lang.foreign.MemorySegment $w() {return this._ptr.asSlice(OFFSET__w, LAYOUT__w);}

    public float h() {return this._ptr.get(LAYOUT__h, OFFSET__h);}
    public void h(float value) {this._ptr.set(LAYOUT__h, OFFSET__h, value);}
    public java.lang.foreign.MemorySegment $h() {return this._ptr.asSlice(OFFSET__h, LAYOUT__h);}

    public float u0() {return this._ptr.get(LAYOUT__u0, OFFSET__u0);}
    public void u0(float value) {this._ptr.set(LAYOUT__u0, OFFSET__u0, value);}
    public java.lang.foreign.MemorySegment $u0() {return this._ptr.asSlice(OFFSET__u0, LAYOUT__u0);}

    public float v0() {return this._ptr.get(LAYOUT__v0, OFFSET__v0);}
    public void v0(float value) {this._ptr.set(LAYOUT__v0, OFFSET__v0, value);}
    public java.lang.foreign.MemorySegment $v0() {return this._ptr.asSlice(OFFSET__v0, LAYOUT__v0);}

    public float u1() {return this._ptr.get(LAYOUT__u1, OFFSET__u1);}
    public void u1(float value) {this._ptr.set(LAYOUT__u1, OFFSET__u1, value);}
    public java.lang.foreign.MemorySegment $u1() {return this._ptr.asSlice(OFFSET__u1, LAYOUT__u1);}

    public float v1() {return this._ptr.get(LAYOUT__v1, OFFSET__v1);}
    public void v1(float value) {this._ptr.set(LAYOUT__v1, OFFSET__v1, value);}
    public java.lang.foreign.MemorySegment $v1() {return this._ptr.asSlice(OFFSET__v1, LAYOUT__v1);}
}
