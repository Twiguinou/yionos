package nuklear;

public record nk_baked_font(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__height = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__ascent = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__ascent = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__descent = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__descent = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__glyph_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__glyph_offset = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__glyph_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__glyph_count = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__ranges = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__ranges = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__height,
            LAYOUT__ascent,
            LAYOUT__descent,
            LAYOUT__glyph_offset,
            LAYOUT__glyph_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ranges
    ).withByteAlignment(8).withName("nk_baked_font");

    public nk_baked_font(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_baked_font getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_baked_font(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_baked_font value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float height() {return this._ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(float value) {this._ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this._ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public float ascent() {return this._ptr.get(LAYOUT__ascent, OFFSET__ascent);}
    public void ascent(float value) {this._ptr.set(LAYOUT__ascent, OFFSET__ascent, value);}
    public java.lang.foreign.MemorySegment $ascent() {return this._ptr.asSlice(OFFSET__ascent, LAYOUT__ascent);}

    public float descent() {return this._ptr.get(LAYOUT__descent, OFFSET__descent);}
    public void descent(float value) {this._ptr.set(LAYOUT__descent, OFFSET__descent, value);}
    public java.lang.foreign.MemorySegment $descent() {return this._ptr.asSlice(OFFSET__descent, LAYOUT__descent);}

    public int glyph_offset() {return this._ptr.get(LAYOUT__glyph_offset, OFFSET__glyph_offset);}
    public void glyph_offset(int value) {this._ptr.set(LAYOUT__glyph_offset, OFFSET__glyph_offset, value);}
    public java.lang.foreign.MemorySegment $glyph_offset() {return this._ptr.asSlice(OFFSET__glyph_offset, LAYOUT__glyph_offset);}

    public int glyph_count() {return this._ptr.get(LAYOUT__glyph_count, OFFSET__glyph_count);}
    public void glyph_count(int value) {this._ptr.set(LAYOUT__glyph_count, OFFSET__glyph_count, value);}
    public java.lang.foreign.MemorySegment $glyph_count() {return this._ptr.asSlice(OFFSET__glyph_count, LAYOUT__glyph_count);}

    public java.lang.foreign.MemorySegment ranges() {return this._ptr.get(LAYOUT__ranges, OFFSET__ranges);}
    public void ranges(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__ranges, OFFSET__ranges, value);}
    public java.lang.foreign.MemorySegment $ranges() {return this._ptr.asSlice(OFFSET__ranges, LAYOUT__ranges);}
}
