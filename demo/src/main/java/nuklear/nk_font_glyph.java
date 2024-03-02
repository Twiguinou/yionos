package nuklear;

public record nk_font_glyph(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$codepoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$codepoint = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$xadvance = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$xadvance = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x0 = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y0 = 12L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x1 = 16L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y1 = 20L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$w = 24L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$h = 28L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$u0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$u0 = 32L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$v0 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$v0 = 36L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$u1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$u1 = 40L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$v1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$v1 = 44L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$codepoint,
            LAYOUT$xadvance,
            LAYOUT$x0,
            LAYOUT$y0,
            LAYOUT$x1,
            LAYOUT$y1,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$u0,
            LAYOUT$v0,
            LAYOUT$u1,
            LAYOUT$v1
    ).withName("nk_font_glyph");

    public nk_font_glyph(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_font_glyph getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_font_glyph(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int codepoint() {return this._ptr.get(LAYOUT$codepoint, OFFSET$codepoint);}
    public void codepoint(int value) {this._ptr.set(LAYOUT$codepoint, OFFSET$codepoint, value);}
    public java.lang.foreign.MemorySegment codepoint_ptr() {return this._ptr.asSlice(OFFSET$codepoint, LAYOUT$codepoint);}

    public float xadvance() {return this._ptr.get(LAYOUT$xadvance, OFFSET$xadvance);}
    public void xadvance(float value) {this._ptr.set(LAYOUT$xadvance, OFFSET$xadvance, value);}
    public java.lang.foreign.MemorySegment xadvance_ptr() {return this._ptr.asSlice(OFFSET$xadvance, LAYOUT$xadvance);}

    public float x0() {return this._ptr.get(LAYOUT$x0, OFFSET$x0);}
    public void x0(float value) {this._ptr.set(LAYOUT$x0, OFFSET$x0, value);}
    public java.lang.foreign.MemorySegment x0_ptr() {return this._ptr.asSlice(OFFSET$x0, LAYOUT$x0);}

    public float y0() {return this._ptr.get(LAYOUT$y0, OFFSET$y0);}
    public void y0(float value) {this._ptr.set(LAYOUT$y0, OFFSET$y0, value);}
    public java.lang.foreign.MemorySegment y0_ptr() {return this._ptr.asSlice(OFFSET$y0, LAYOUT$y0);}

    public float x1() {return this._ptr.get(LAYOUT$x1, OFFSET$x1);}
    public void x1(float value) {this._ptr.set(LAYOUT$x1, OFFSET$x1, value);}
    public java.lang.foreign.MemorySegment x1_ptr() {return this._ptr.asSlice(OFFSET$x1, LAYOUT$x1);}

    public float y1() {return this._ptr.get(LAYOUT$y1, OFFSET$y1);}
    public void y1(float value) {this._ptr.set(LAYOUT$y1, OFFSET$y1, value);}
    public java.lang.foreign.MemorySegment y1_ptr() {return this._ptr.asSlice(OFFSET$y1, LAYOUT$y1);}

    public float w() {return this._ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(float value) {this._ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this._ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public float h() {return this._ptr.get(LAYOUT$h, OFFSET$h);}
    public void h(float value) {this._ptr.set(LAYOUT$h, OFFSET$h, value);}
    public java.lang.foreign.MemorySegment h_ptr() {return this._ptr.asSlice(OFFSET$h, LAYOUT$h);}

    public float u0() {return this._ptr.get(LAYOUT$u0, OFFSET$u0);}
    public void u0(float value) {this._ptr.set(LAYOUT$u0, OFFSET$u0, value);}
    public java.lang.foreign.MemorySegment u0_ptr() {return this._ptr.asSlice(OFFSET$u0, LAYOUT$u0);}

    public float v0() {return this._ptr.get(LAYOUT$v0, OFFSET$v0);}
    public void v0(float value) {this._ptr.set(LAYOUT$v0, OFFSET$v0, value);}
    public java.lang.foreign.MemorySegment v0_ptr() {return this._ptr.asSlice(OFFSET$v0, LAYOUT$v0);}

    public float u1() {return this._ptr.get(LAYOUT$u1, OFFSET$u1);}
    public void u1(float value) {this._ptr.set(LAYOUT$u1, OFFSET$u1, value);}
    public java.lang.foreign.MemorySegment u1_ptr() {return this._ptr.asSlice(OFFSET$u1, LAYOUT$u1);}

    public float v1() {return this._ptr.get(LAYOUT$v1, OFFSET$v1);}
    public void v1(float value) {this._ptr.set(LAYOUT$v1, OFFSET$v1, value);}
    public java.lang.foreign.MemorySegment v1_ptr() {return this._ptr.asSlice(OFFSET$v1, LAYOUT$v1);}
}
