package nuklear;

public record nk_baked_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$height = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$ascent = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$ascent = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$descent = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$descent = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$glyph_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$glyph_offset = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$glyph_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$glyph_count = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$ranges = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ranges = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$height,
            LAYOUT$ascent,
            LAYOUT$descent,
            LAYOUT$glyph_offset,
            LAYOUT$glyph_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$ranges
    ).withName("nk_baked_font");

    public nk_baked_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_baked_font getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_baked_font(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public float height() {return this._ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(float value) {this._ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this._ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public float ascent() {return this._ptr.get(LAYOUT$ascent, OFFSET$ascent);}
    public void ascent(float value) {this._ptr.set(LAYOUT$ascent, OFFSET$ascent, value);}
    public java.lang.foreign.MemorySegment ascent_ptr() {return this._ptr.asSlice(OFFSET$ascent, LAYOUT$ascent);}

    public float descent() {return this._ptr.get(LAYOUT$descent, OFFSET$descent);}
    public void descent(float value) {this._ptr.set(LAYOUT$descent, OFFSET$descent, value);}
    public java.lang.foreign.MemorySegment descent_ptr() {return this._ptr.asSlice(OFFSET$descent, LAYOUT$descent);}

    public int glyph_offset() {return this._ptr.get(LAYOUT$glyph_offset, OFFSET$glyph_offset);}
    public void glyph_offset(int value) {this._ptr.set(LAYOUT$glyph_offset, OFFSET$glyph_offset, value);}
    public java.lang.foreign.MemorySegment glyph_offset_ptr() {return this._ptr.asSlice(OFFSET$glyph_offset, LAYOUT$glyph_offset);}

    public int glyph_count() {return this._ptr.get(LAYOUT$glyph_count, OFFSET$glyph_count);}
    public void glyph_count(int value) {this._ptr.set(LAYOUT$glyph_count, OFFSET$glyph_count, value);}
    public java.lang.foreign.MemorySegment glyph_count_ptr() {return this._ptr.asSlice(OFFSET$glyph_count, LAYOUT$glyph_count);}

    public java.lang.foreign.MemorySegment ranges() {return this._ptr.get(LAYOUT$ranges, OFFSET$ranges);}
    public void ranges(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$ranges, OFFSET$ranges, value);}
    public java.lang.foreign.MemorySegment ranges_ptr() {return this._ptr.asSlice(OFFSET$ranges, LAYOUT$ranges);}
}
