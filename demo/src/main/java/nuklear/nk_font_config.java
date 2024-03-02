package nuklear;

public record nk_font_config(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$next = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$next = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$ttf_blob = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ttf_blob = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$ttf_size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$ttf_size = 16L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$ttf_data_owned_by_atlas = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$ttf_data_owned_by_atlas = 24L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$merge_mode = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$merge_mode = 25L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pixel_snap = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pixel_snap = 26L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$oversample_v = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$oversample_v = 27L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$oversample_h = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$oversample_h = 28L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$padding = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$padding = 29L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$size = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$coord_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$coord_type = 36L;
    public static final java.lang.foreign.GroupLayout LAYOUT$spacing = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$spacing = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$range = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$range = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$font = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$font = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fallback_glyph = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fallback_glyph = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$n = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$n = 72L;
    public static final java.lang.foreign.AddressLayout LAYOUT$p = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$p = 80L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$next,
            LAYOUT$ttf_blob,
            LAYOUT$ttf_size,
            LAYOUT$ttf_data_owned_by_atlas,
            LAYOUT$merge_mode,
            LAYOUT$pixel_snap,
            LAYOUT$oversample_v,
            LAYOUT$oversample_h,
            LAYOUT$padding,
            LAYOUT$size,
            LAYOUT$coord_type,
            LAYOUT$spacing,
            LAYOUT$range,
            LAYOUT$font,
            LAYOUT$fallback_glyph,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$n,
            LAYOUT$p
    ).withName("nk_font_config");

    public nk_font_config(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_font_config getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_font_config(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this._ptr.asSlice(OFFSET$next, LAYOUT$next);}

    public java.lang.foreign.MemorySegment ttf_blob() {return this._ptr.get(LAYOUT$ttf_blob, OFFSET$ttf_blob);}
    public void ttf_blob(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$ttf_blob, OFFSET$ttf_blob, value);}
    public java.lang.foreign.MemorySegment ttf_blob_ptr() {return this._ptr.asSlice(OFFSET$ttf_blob, LAYOUT$ttf_blob);}

    public long ttf_size() {return this._ptr.get(LAYOUT$ttf_size, OFFSET$ttf_size);}
    public void ttf_size(long value) {this._ptr.set(LAYOUT$ttf_size, OFFSET$ttf_size, value);}
    public java.lang.foreign.MemorySegment ttf_size_ptr() {return this._ptr.asSlice(OFFSET$ttf_size, LAYOUT$ttf_size);}

    public char ttf_data_owned_by_atlas() {return (char)this._ptr.get(LAYOUT$ttf_data_owned_by_atlas, OFFSET$ttf_data_owned_by_atlas);}
    public void ttf_data_owned_by_atlas(char value) {this._ptr.set(LAYOUT$ttf_data_owned_by_atlas, OFFSET$ttf_data_owned_by_atlas, (byte)value);}
    public java.lang.foreign.MemorySegment ttf_data_owned_by_atlas_ptr() {return this._ptr.asSlice(OFFSET$ttf_data_owned_by_atlas, LAYOUT$ttf_data_owned_by_atlas);}

    public char merge_mode() {return (char)this._ptr.get(LAYOUT$merge_mode, OFFSET$merge_mode);}
    public void merge_mode(char value) {this._ptr.set(LAYOUT$merge_mode, OFFSET$merge_mode, (byte)value);}
    public java.lang.foreign.MemorySegment merge_mode_ptr() {return this._ptr.asSlice(OFFSET$merge_mode, LAYOUT$merge_mode);}

    public char pixel_snap() {return (char)this._ptr.get(LAYOUT$pixel_snap, OFFSET$pixel_snap);}
    public void pixel_snap(char value) {this._ptr.set(LAYOUT$pixel_snap, OFFSET$pixel_snap, (byte)value);}
    public java.lang.foreign.MemorySegment pixel_snap_ptr() {return this._ptr.asSlice(OFFSET$pixel_snap, LAYOUT$pixel_snap);}

    public char oversample_v() {return (char)this._ptr.get(LAYOUT$oversample_v, OFFSET$oversample_v);}
    public void oversample_v(char value) {this._ptr.set(LAYOUT$oversample_v, OFFSET$oversample_v, (byte)value);}
    public java.lang.foreign.MemorySegment oversample_v_ptr() {return this._ptr.asSlice(OFFSET$oversample_v, LAYOUT$oversample_v);}

    public char oversample_h() {return (char)this._ptr.get(LAYOUT$oversample_h, OFFSET$oversample_h);}
    public void oversample_h(char value) {this._ptr.set(LAYOUT$oversample_h, OFFSET$oversample_h, (byte)value);}
    public java.lang.foreign.MemorySegment oversample_h_ptr() {return this._ptr.asSlice(OFFSET$oversample_h, LAYOUT$oversample_h);}

    public java.lang.foreign.MemorySegment padding() {return this._ptr.asSlice(OFFSET$padding, LAYOUT$padding);}
    public char padding(int i) {return (char)this.padding().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void padding(int i, char value) {this.padding().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public float size() {return this._ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(float value) {this._ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this._ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public int coord_type() {return this._ptr.get(LAYOUT$coord_type, OFFSET$coord_type);}
    public void coord_type(int value) {this._ptr.set(LAYOUT$coord_type, OFFSET$coord_type, value);}
    public java.lang.foreign.MemorySegment coord_type_ptr() {return this._ptr.asSlice(OFFSET$coord_type, LAYOUT$coord_type);}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$spacing, LAYOUT$spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$spacing, LAYOUT$spacing.byteSize());}

    public java.lang.foreign.MemorySegment range() {return this._ptr.get(LAYOUT$range, OFFSET$range);}
    public void range(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$range, OFFSET$range, value);}
    public java.lang.foreign.MemorySegment range_ptr() {return this._ptr.asSlice(OFFSET$range, LAYOUT$range);}

    public java.lang.foreign.MemorySegment font() {return this._ptr.get(LAYOUT$font, OFFSET$font);}
    public void font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$font, OFFSET$font, value);}
    public java.lang.foreign.MemorySegment font_ptr() {return this._ptr.asSlice(OFFSET$font, LAYOUT$font);}

    public int fallback_glyph() {return this._ptr.get(LAYOUT$fallback_glyph, OFFSET$fallback_glyph);}
    public void fallback_glyph(int value) {this._ptr.set(LAYOUT$fallback_glyph, OFFSET$fallback_glyph, value);}
    public java.lang.foreign.MemorySegment fallback_glyph_ptr() {return this._ptr.asSlice(OFFSET$fallback_glyph, LAYOUT$fallback_glyph);}

    public java.lang.foreign.MemorySegment n() {return this._ptr.get(LAYOUT$n, OFFSET$n);}
    public void n(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$n, OFFSET$n, value);}
    public java.lang.foreign.MemorySegment n_ptr() {return this._ptr.asSlice(OFFSET$n, LAYOUT$n);}

    public java.lang.foreign.MemorySegment p() {return this._ptr.get(LAYOUT$p, OFFSET$p);}
    public void p(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$p, OFFSET$p, value);}
    public java.lang.foreign.MemorySegment p_ptr() {return this._ptr.asSlice(OFFSET$p, LAYOUT$p);}
}
