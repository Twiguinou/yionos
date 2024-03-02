package nuklear;

public record nk_font_atlas(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$pixel = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pixel = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tex_width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$tex_width = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tex_height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$tex_height = 12L;
    public static final java.lang.foreign.GroupLayout LAYOUT$permanent = nuklear.nk_allocator.gStructLayout;
    public static final long OFFSET$permanent = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$temporary = nuklear.nk_allocator.gStructLayout;
    public static final long OFFSET$temporary = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$custom = nuklear.nk_recti.gStructLayout;
    public static final long OFFSET$custom = 64L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$cursors = java.lang.foreign.MemoryLayout.sequenceLayout(7, nuklear.nk_cursor.gStructLayout);
    public static final long OFFSET$cursors = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$glyph_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$glyph_count = 352L;
    public static final java.lang.foreign.AddressLayout LAYOUT$glyphs = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$glyphs = 360L;
    public static final java.lang.foreign.AddressLayout LAYOUT$default_font = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$default_font = 368L;
    public static final java.lang.foreign.AddressLayout LAYOUT$fonts = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$fonts = 376L;
    public static final java.lang.foreign.AddressLayout LAYOUT$config = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$config = 384L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$font_num = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$font_num = 392L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$pixel,
            LAYOUT$tex_width,
            LAYOUT$tex_height,
            LAYOUT$permanent,
            LAYOUT$temporary,
            LAYOUT$custom,
            LAYOUT$cursors,
            LAYOUT$glyph_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$glyphs,
            LAYOUT$default_font,
            LAYOUT$fonts,
            LAYOUT$config,
            LAYOUT$font_num,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_font_atlas");

    public nk_font_atlas(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_font_atlas getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_font_atlas(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment pixel() {return this._ptr.get(LAYOUT$pixel, OFFSET$pixel);}
    public void pixel(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$pixel, OFFSET$pixel, value);}
    public java.lang.foreign.MemorySegment pixel_ptr() {return this._ptr.asSlice(OFFSET$pixel, LAYOUT$pixel);}

    public int tex_width() {return this._ptr.get(LAYOUT$tex_width, OFFSET$tex_width);}
    public void tex_width(int value) {this._ptr.set(LAYOUT$tex_width, OFFSET$tex_width, value);}
    public java.lang.foreign.MemorySegment tex_width_ptr() {return this._ptr.asSlice(OFFSET$tex_width, LAYOUT$tex_width);}

    public int tex_height() {return this._ptr.get(LAYOUT$tex_height, OFFSET$tex_height);}
    public void tex_height(int value) {this._ptr.set(LAYOUT$tex_height, OFFSET$tex_height, value);}
    public java.lang.foreign.MemorySegment tex_height_ptr() {return this._ptr.asSlice(OFFSET$tex_height, LAYOUT$tex_height);}

    public nuklear.nk_allocator permanent() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET$permanent, LAYOUT$permanent));}
    public void permanent(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.permanent());}
    public void permanent(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$permanent, LAYOUT$permanent.byteSize());}

    public nuklear.nk_allocator temporary() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET$temporary, LAYOUT$temporary));}
    public void temporary(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.temporary());}
    public void temporary(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$temporary, LAYOUT$temporary.byteSize());}

    public nuklear.nk_recti custom() {return new nuklear.nk_recti(this._ptr.asSlice(OFFSET$custom, LAYOUT$custom));}
    public void custom(java.util.function.Consumer<nuklear.nk_recti> consumer) {consumer.accept(this.custom());}
    public void custom(nuklear.nk_recti value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$custom, LAYOUT$custom.byteSize());}

    public java.lang.foreign.MemorySegment cursors() {return this._ptr.asSlice(OFFSET$cursors, LAYOUT$cursors);}
    public nuklear.nk_cursor cursors(int i) {return new nuklear.nk_cursor(this._ptr.asSlice(OFFSET$cursors + i * LAYOUT$cursors.byteSize(), LAYOUT$cursors));}
    public void cursors(int i, java.util.function.Consumer<nuklear.nk_cursor> consumer) {consumer.accept(this.cursors(i));}
    public void cursors(int i, nuklear.nk_cursor value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursors + i * LAYOUT$cursors.byteSize(), LAYOUT$cursors.byteSize());}

    public int glyph_count() {return this._ptr.get(LAYOUT$glyph_count, OFFSET$glyph_count);}
    public void glyph_count(int value) {this._ptr.set(LAYOUT$glyph_count, OFFSET$glyph_count, value);}
    public java.lang.foreign.MemorySegment glyph_count_ptr() {return this._ptr.asSlice(OFFSET$glyph_count, LAYOUT$glyph_count);}

    public java.lang.foreign.MemorySegment glyphs() {return this._ptr.get(LAYOUT$glyphs, OFFSET$glyphs);}
    public void glyphs(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$glyphs, OFFSET$glyphs, value);}
    public java.lang.foreign.MemorySegment glyphs_ptr() {return this._ptr.asSlice(OFFSET$glyphs, LAYOUT$glyphs);}

    public java.lang.foreign.MemorySegment default_font() {return this._ptr.get(LAYOUT$default_font, OFFSET$default_font);}
    public void default_font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$default_font, OFFSET$default_font, value);}
    public java.lang.foreign.MemorySegment default_font_ptr() {return this._ptr.asSlice(OFFSET$default_font, LAYOUT$default_font);}

    public java.lang.foreign.MemorySegment fonts() {return this._ptr.get(LAYOUT$fonts, OFFSET$fonts);}
    public void fonts(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$fonts, OFFSET$fonts, value);}
    public java.lang.foreign.MemorySegment fonts_ptr() {return this._ptr.asSlice(OFFSET$fonts, LAYOUT$fonts);}

    public java.lang.foreign.MemorySegment config() {return this._ptr.get(LAYOUT$config, OFFSET$config);}
    public void config(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$config, OFFSET$config, value);}
    public java.lang.foreign.MemorySegment config_ptr() {return this._ptr.asSlice(OFFSET$config, LAYOUT$config);}

    public int font_num() {return this._ptr.get(LAYOUT$font_num, OFFSET$font_num);}
    public void font_num(int value) {this._ptr.set(LAYOUT$font_num, OFFSET$font_num, value);}
    public java.lang.foreign.MemorySegment font_num_ptr() {return this._ptr.asSlice(OFFSET$font_num, LAYOUT$font_num);}
}
