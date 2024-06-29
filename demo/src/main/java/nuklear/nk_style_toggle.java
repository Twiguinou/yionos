package nuklear;

public record nk_style_toggle(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__active = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__active = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__border_color = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_normal = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__cursor_normal = 128;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_hover = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__cursor_hover = 168;
    public static final java.lang.foreign.StructLayout LAYOUT__text_normal = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__text_normal = 208;
    public static final java.lang.foreign.StructLayout LAYOUT__text_hover = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__text_hover = 212;
    public static final java.lang.foreign.StructLayout LAYOUT__text_active = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__text_active = 216;
    public static final java.lang.foreign.StructLayout LAYOUT__text_background = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__text_background = 220;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__text_alignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__text_alignment = 224;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__padding = 228;
    public static final java.lang.foreign.StructLayout LAYOUT__touch_padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__touch_padding = 236;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__spacing = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__spacing = 244;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__border = 248;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__color_factor = 252;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__disabled_factor = 256;
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout;
    public static final long OFFSET__userdata = 264;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_begin = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__draw_begin = 272;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_end = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__draw_end = 280;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__active,
            LAYOUT__border_color,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__cursor_normal,
            LAYOUT__cursor_hover,
            LAYOUT__text_normal,
            LAYOUT__text_hover,
            LAYOUT__text_active,
            LAYOUT__text_background,
            LAYOUT__text_alignment,
            LAYOUT__padding,
            LAYOUT__touch_padding,
            LAYOUT__spacing,
            LAYOUT__border,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__userdata,
            LAYOUT__draw_begin,
            LAYOUT__draw_end
    ).withByteAlignment(8).withName("nk_style_toggle");

    public nk_style_toggle(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_toggle getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_toggle(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_toggle value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_style_item normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__normal, LAYOUT__normal));}
    public void normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.normal());}
    public void normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__normal, LAYOUT__normal.byteSize());}

    public nuklear.nk_style_item hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__hover, LAYOUT__hover));}
    public void hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.hover());}
    public void hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__hover, LAYOUT__hover.byteSize());}

    public nuklear.nk_style_item active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__active, LAYOUT__active));}
    public void active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.active());}
    public void active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__active, LAYOUT__active.byteSize());}

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__border_color, LAYOUT__border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__border_color, LAYOUT__border_color.byteSize());}

    public nuklear.nk_style_item cursor_normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__cursor_normal, LAYOUT__cursor_normal));}
    public void cursor_normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_normal());}
    public void cursor_normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_normal, LAYOUT__cursor_normal.byteSize());}

    public nuklear.nk_style_item cursor_hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__cursor_hover, LAYOUT__cursor_hover));}
    public void cursor_hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_hover());}
    public void cursor_hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_hover, LAYOUT__cursor_hover.byteSize());}

    public nuklear.nk_color text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_normal, LAYOUT__text_normal));}
    public void text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal());}
    public void text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_normal, LAYOUT__text_normal.byteSize());}

    public nuklear.nk_color text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_hover, LAYOUT__text_hover));}
    public void text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover());}
    public void text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_hover, LAYOUT__text_hover.byteSize());}

    public nuklear.nk_color text_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_active, LAYOUT__text_active));}
    public void text_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_active());}
    public void text_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_active, LAYOUT__text_active.byteSize());}

    public nuklear.nk_color text_background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_background, LAYOUT__text_background));}
    public void text_background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_background());}
    public void text_background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_background, LAYOUT__text_background.byteSize());}

    public int text_alignment() {return this._ptr.get(LAYOUT__text_alignment, OFFSET__text_alignment);}
    public void text_alignment(int value) {this._ptr.set(LAYOUT__text_alignment, OFFSET__text_alignment, value);}
    public java.lang.foreign.MemorySegment $text_alignment() {return this._ptr.asSlice(OFFSET__text_alignment, LAYOUT__text_alignment);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public nuklear.nk_vec2 touch_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__touch_padding, LAYOUT__touch_padding));}
    public void touch_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.touch_padding());}
    public void touch_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__touch_padding, LAYOUT__touch_padding.byteSize());}

    public float spacing() {return this._ptr.get(LAYOUT__spacing, OFFSET__spacing);}
    public void spacing(float value) {this._ptr.set(LAYOUT__spacing, OFFSET__spacing, value);}
    public java.lang.foreign.MemorySegment $spacing() {return this._ptr.asSlice(OFFSET__spacing, LAYOUT__spacing);}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float color_factor() {return this._ptr.get(LAYOUT__color_factor, OFFSET__color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT__color_factor, OFFSET__color_factor, value);}
    public java.lang.foreign.MemorySegment $color_factor() {return this._ptr.asSlice(OFFSET__color_factor, LAYOUT__color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT__disabled_factor, OFFSET__disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT__disabled_factor, OFFSET__disabled_factor, value);}
    public java.lang.foreign.MemorySegment $disabled_factor() {return this._ptr.asSlice(OFFSET__disabled_factor, LAYOUT__disabled_factor);}

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__userdata, LAYOUT__userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__userdata, LAYOUT__userdata.byteSize());}

    public java.lang.foreign.MemorySegment draw_begin() {return this._ptr.get(LAYOUT__draw_begin, OFFSET__draw_begin);}
    public void draw_begin(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__draw_begin, OFFSET__draw_begin, value);}
    public java.lang.foreign.MemorySegment $draw_begin() {return this._ptr.asSlice(OFFSET__draw_begin, LAYOUT__draw_begin);}

    public java.lang.foreign.MemorySegment draw_end() {return this._ptr.get(LAYOUT__draw_end, OFFSET__draw_end);}
    public void draw_end(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__draw_end, OFFSET__draw_end, value);}
    public java.lang.foreign.MemorySegment $draw_end() {return this._ptr.asSlice(OFFSET__draw_end, LAYOUT__draw_end);}
}
