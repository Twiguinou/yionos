package nuklear;

public record nk_font_atlas(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__pixel = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pixel");
    public static final long OFFSET__pixel = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tex_width = java.lang.foreign.ValueLayout.JAVA_INT.withName("tex_width");
    public static final long OFFSET__tex_width = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tex_height = java.lang.foreign.ValueLayout.JAVA_INT.withName("tex_height");
    public static final long OFFSET__tex_height = 12;
    public static final java.lang.foreign.StructLayout LAYOUT__permanent = nuklear.nk_allocator.gRecordLayout.withName("permanent");
    public static final long OFFSET__permanent = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__temporary = nuklear.nk_allocator.gRecordLayout.withName("temporary");
    public static final long OFFSET__temporary = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__custom = nuklear.nk_recti.gRecordLayout.withName("custom");
    public static final long OFFSET__custom = 64;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cursors = java.lang.foreign.MemoryLayout.sequenceLayout(7, nuklear.nk_cursor.gRecordLayout).withName("cursors");
    public static final long OFFSET__cursors = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__glyph_count = java.lang.foreign.ValueLayout.JAVA_INT.withName("glyph_count");
    public static final long OFFSET__glyph_count = 352;
    public static final java.lang.foreign.AddressLayout LAYOUT__glyphs = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("glyphs");
    public static final long OFFSET__glyphs = 360;
    public static final java.lang.foreign.AddressLayout LAYOUT__default_font = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("default_font");
    public static final long OFFSET__default_font = 368;
    public static final java.lang.foreign.AddressLayout LAYOUT__fonts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("fonts");
    public static final long OFFSET__fonts = 376;
    public static final java.lang.foreign.AddressLayout LAYOUT__config = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("config");
    public static final long OFFSET__config = 384;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__font_num = java.lang.foreign.ValueLayout.JAVA_INT.withName("font_num");
    public static final long OFFSET__font_num = 392;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__pixel,
            LAYOUT__tex_width,
            LAYOUT__tex_height,
            LAYOUT__permanent,
            LAYOUT__temporary,
            LAYOUT__custom,
            LAYOUT__cursors,
            LAYOUT__glyph_count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__glyphs,
            LAYOUT__default_font,
            LAYOUT__fonts,
            LAYOUT__config,
            LAYOUT__font_num,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_font_atlas");

    public nk_font_atlas(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_font_atlas getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_font_atlas(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_font_atlas value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment pixel() {return this._ptr.get(LAYOUT__pixel, OFFSET__pixel);}
    public void pixel(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__pixel, OFFSET__pixel, value);}
    public java.lang.foreign.MemorySegment $pixel() {return this._ptr.asSlice(OFFSET__pixel, LAYOUT__pixel);}

    public int tex_width() {return this._ptr.get(LAYOUT__tex_width, OFFSET__tex_width);}
    public void tex_width(int value) {this._ptr.set(LAYOUT__tex_width, OFFSET__tex_width, value);}
    public java.lang.foreign.MemorySegment $tex_width() {return this._ptr.asSlice(OFFSET__tex_width, LAYOUT__tex_width);}

    public int tex_height() {return this._ptr.get(LAYOUT__tex_height, OFFSET__tex_height);}
    public void tex_height(int value) {this._ptr.set(LAYOUT__tex_height, OFFSET__tex_height, value);}
    public java.lang.foreign.MemorySegment $tex_height() {return this._ptr.asSlice(OFFSET__tex_height, LAYOUT__tex_height);}

    public nuklear.nk_allocator permanent() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET__permanent, LAYOUT__permanent));}
    public void permanent(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.permanent());}
    public void permanent(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__permanent, LAYOUT__permanent.byteSize());}

    public nuklear.nk_allocator temporary() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET__temporary, LAYOUT__temporary));}
    public void temporary(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.temporary());}
    public void temporary(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__temporary, LAYOUT__temporary.byteSize());}

    public nuklear.nk_recti custom() {return new nuklear.nk_recti(this._ptr.asSlice(OFFSET__custom, LAYOUT__custom));}
    public void custom(java.util.function.Consumer<nuklear.nk_recti> consumer) {consumer.accept(this.custom());}
    public void custom(nuklear.nk_recti value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__custom, LAYOUT__custom.byteSize());}

    public java.lang.foreign.MemorySegment cursors() {return this._ptr.asSlice(OFFSET__cursors, LAYOUT__cursors);}
    public nuklear.nk_cursor cursors(int index) {return nuklear.nk_cursor.getAtIndex(this.cursors(), index);}
    public void cursors(int index, java.util.function.Consumer<nuklear.nk_cursor> consumer) {consumer.accept(this.cursors(index));}
    public void cursors(int index, nuklear.nk_cursor value) {nuklear.nk_cursor.setAtIndex(this.cursors(), index, value);}

    public int glyph_count() {return this._ptr.get(LAYOUT__glyph_count, OFFSET__glyph_count);}
    public void glyph_count(int value) {this._ptr.set(LAYOUT__glyph_count, OFFSET__glyph_count, value);}
    public java.lang.foreign.MemorySegment $glyph_count() {return this._ptr.asSlice(OFFSET__glyph_count, LAYOUT__glyph_count);}

    public java.lang.foreign.MemorySegment glyphs() {return this._ptr.get(LAYOUT__glyphs, OFFSET__glyphs);}
    public void glyphs(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__glyphs, OFFSET__glyphs, value);}
    public java.lang.foreign.MemorySegment $glyphs() {return this._ptr.asSlice(OFFSET__glyphs, LAYOUT__glyphs);}

    public java.lang.foreign.MemorySegment default_font() {return this._ptr.get(LAYOUT__default_font, OFFSET__default_font);}
    public void default_font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__default_font, OFFSET__default_font, value);}
    public java.lang.foreign.MemorySegment $default_font() {return this._ptr.asSlice(OFFSET__default_font, LAYOUT__default_font);}

    public java.lang.foreign.MemorySegment fonts() {return this._ptr.get(LAYOUT__fonts, OFFSET__fonts);}
    public void fonts(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__fonts, OFFSET__fonts, value);}
    public java.lang.foreign.MemorySegment $fonts() {return this._ptr.asSlice(OFFSET__fonts, LAYOUT__fonts);}

    public java.lang.foreign.MemorySegment config() {return this._ptr.get(LAYOUT__config, OFFSET__config);}
    public void config(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__config, OFFSET__config, value);}
    public java.lang.foreign.MemorySegment $config() {return this._ptr.asSlice(OFFSET__config, LAYOUT__config);}

    public int font_num() {return this._ptr.get(LAYOUT__font_num, OFFSET__font_num);}
    public void font_num(int value) {this._ptr.set(LAYOUT__font_num, OFFSET__font_num, value);}
    public java.lang.foreign.MemorySegment $font_num() {return this._ptr.asSlice(OFFSET__font_num, LAYOUT__font_num);}
}
