package nuklear;

public record nk_font_config(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__next = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__next = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__ttf_blob = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__ttf_blob = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__ttf_size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__ttf_size = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__ttf_data_owned_by_atlas = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__ttf_data_owned_by_atlas = 24;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__merge_mode = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__merge_mode = 25;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pixel_snap = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pixel_snap = 26;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__oversample_v = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__oversample_v = 27;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__oversample_h = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__oversample_h = 28;
    public static final java.lang.foreign.SequenceLayout LAYOUT__padding = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__padding = 29;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__size = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__coord_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__coord_type = 36;
    public static final java.lang.foreign.StructLayout LAYOUT__spacing = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__spacing = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__range = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__range = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__font = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__font = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fallback_glyph = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fallback_glyph = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__n = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__n = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__p = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__p = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__next,
            LAYOUT__ttf_blob,
            LAYOUT__ttf_size,
            LAYOUT__ttf_data_owned_by_atlas,
            LAYOUT__merge_mode,
            LAYOUT__pixel_snap,
            LAYOUT__oversample_v,
            LAYOUT__oversample_h,
            LAYOUT__padding,
            LAYOUT__size,
            LAYOUT__coord_type,
            LAYOUT__spacing,
            LAYOUT__range,
            LAYOUT__font,
            LAYOUT__fallback_glyph,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__n,
            LAYOUT__p
    ).withByteAlignment(8).withName("nk_font_config");

    public nk_font_config(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_font_config getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_font_config(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_font_config value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT__next, OFFSET__next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__next, OFFSET__next, value);}
    public java.lang.foreign.MemorySegment $next() {return this._ptr.asSlice(OFFSET__next, LAYOUT__next);}

    public java.lang.foreign.MemorySegment ttf_blob() {return this._ptr.get(LAYOUT__ttf_blob, OFFSET__ttf_blob);}
    public void ttf_blob(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__ttf_blob, OFFSET__ttf_blob, value);}
    public java.lang.foreign.MemorySegment $ttf_blob() {return this._ptr.asSlice(OFFSET__ttf_blob, LAYOUT__ttf_blob);}

    public long ttf_size() {return this._ptr.get(LAYOUT__ttf_size, OFFSET__ttf_size);}
    public void ttf_size(long value) {this._ptr.set(LAYOUT__ttf_size, OFFSET__ttf_size, value);}
    public java.lang.foreign.MemorySegment $ttf_size() {return this._ptr.asSlice(OFFSET__ttf_size, LAYOUT__ttf_size);}

    public byte ttf_data_owned_by_atlas() {return this._ptr.get(LAYOUT__ttf_data_owned_by_atlas, OFFSET__ttf_data_owned_by_atlas);}
    public void ttf_data_owned_by_atlas(byte value) {this._ptr.set(LAYOUT__ttf_data_owned_by_atlas, OFFSET__ttf_data_owned_by_atlas, value);}
    public java.lang.foreign.MemorySegment $ttf_data_owned_by_atlas() {return this._ptr.asSlice(OFFSET__ttf_data_owned_by_atlas, LAYOUT__ttf_data_owned_by_atlas);}

    public byte merge_mode() {return this._ptr.get(LAYOUT__merge_mode, OFFSET__merge_mode);}
    public void merge_mode(byte value) {this._ptr.set(LAYOUT__merge_mode, OFFSET__merge_mode, value);}
    public java.lang.foreign.MemorySegment $merge_mode() {return this._ptr.asSlice(OFFSET__merge_mode, LAYOUT__merge_mode);}

    public byte pixel_snap() {return this._ptr.get(LAYOUT__pixel_snap, OFFSET__pixel_snap);}
    public void pixel_snap(byte value) {this._ptr.set(LAYOUT__pixel_snap, OFFSET__pixel_snap, value);}
    public java.lang.foreign.MemorySegment $pixel_snap() {return this._ptr.asSlice(OFFSET__pixel_snap, LAYOUT__pixel_snap);}

    public byte oversample_v() {return this._ptr.get(LAYOUT__oversample_v, OFFSET__oversample_v);}
    public void oversample_v(byte value) {this._ptr.set(LAYOUT__oversample_v, OFFSET__oversample_v, value);}
    public java.lang.foreign.MemorySegment $oversample_v() {return this._ptr.asSlice(OFFSET__oversample_v, LAYOUT__oversample_v);}

    public byte oversample_h() {return this._ptr.get(LAYOUT__oversample_h, OFFSET__oversample_h);}
    public void oversample_h(byte value) {this._ptr.set(LAYOUT__oversample_h, OFFSET__oversample_h, value);}
    public java.lang.foreign.MemorySegment $oversample_h() {return this._ptr.asSlice(OFFSET__oversample_h, LAYOUT__oversample_h);}

    public java.lang.foreign.MemorySegment padding() {return this._ptr.asSlice(OFFSET__padding, LAYOUT__padding);}
    public byte padding(int index) {return this.padding().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void padding(int index, byte value) {this.padding().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public float size() {return this._ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(float value) {this._ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this._ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public int coord_type() {return this._ptr.get(LAYOUT__coord_type, OFFSET__coord_type);}
    public void coord_type(int value) {this._ptr.set(LAYOUT__coord_type, OFFSET__coord_type, value);}
    public java.lang.foreign.MemorySegment $coord_type() {return this._ptr.asSlice(OFFSET__coord_type, LAYOUT__coord_type);}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__spacing, LAYOUT__spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__spacing, LAYOUT__spacing.byteSize());}

    public java.lang.foreign.MemorySegment range() {return this._ptr.get(LAYOUT__range, OFFSET__range);}
    public void range(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__range, OFFSET__range, value);}
    public java.lang.foreign.MemorySegment $range() {return this._ptr.asSlice(OFFSET__range, LAYOUT__range);}

    public java.lang.foreign.MemorySegment font() {return this._ptr.get(LAYOUT__font, OFFSET__font);}
    public void font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__font, OFFSET__font, value);}
    public java.lang.foreign.MemorySegment $font() {return this._ptr.asSlice(OFFSET__font, LAYOUT__font);}

    public int fallback_glyph() {return this._ptr.get(LAYOUT__fallback_glyph, OFFSET__fallback_glyph);}
    public void fallback_glyph(int value) {this._ptr.set(LAYOUT__fallback_glyph, OFFSET__fallback_glyph, value);}
    public java.lang.foreign.MemorySegment $fallback_glyph() {return this._ptr.asSlice(OFFSET__fallback_glyph, LAYOUT__fallback_glyph);}

    public java.lang.foreign.MemorySegment n() {return this._ptr.get(LAYOUT__n, OFFSET__n);}
    public void n(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__n, OFFSET__n, value);}
    public java.lang.foreign.MemorySegment $n() {return this._ptr.asSlice(OFFSET__n, LAYOUT__n);}

    public java.lang.foreign.MemorySegment p() {return this._ptr.get(LAYOUT__p, OFFSET__p);}
    public void p(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__p, OFFSET__p, value);}
    public java.lang.foreign.MemorySegment $p() {return this._ptr.asSlice(OFFSET__p, LAYOUT__p);}
}
