package nuklear;

public record nk_style_edit(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__active = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__active = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__border_color = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollbar = nuklear.nk_style_scrollbar.gRecordLayout;
    public static final long OFFSET__scrollbar = 128;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_normal = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__cursor_normal = 880;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_hover = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__cursor_hover = 884;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_text_normal = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__cursor_text_normal = 888;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_text_hover = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__cursor_text_hover = 892;
    public static final java.lang.foreign.StructLayout LAYOUT__text_normal = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__text_normal = 896;
    public static final java.lang.foreign.StructLayout LAYOUT__text_hover = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__text_hover = 900;
    public static final java.lang.foreign.StructLayout LAYOUT__text_active = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__text_active = 904;
    public static final java.lang.foreign.StructLayout LAYOUT__selected_normal = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__selected_normal = 908;
    public static final java.lang.foreign.StructLayout LAYOUT__selected_hover = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__selected_hover = 912;
    public static final java.lang.foreign.StructLayout LAYOUT__selected_text_normal = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__selected_text_normal = 916;
    public static final java.lang.foreign.StructLayout LAYOUT__selected_text_hover = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__selected_text_hover = 920;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__border = 924;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__rounding = 928;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__cursor_size = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__cursor_size = 932;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollbar_size = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__scrollbar_size = 936;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__padding = 944;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__row_padding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__row_padding = 952;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__color_factor = 956;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__disabled_factor = 960;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__active,
            LAYOUT__border_color,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__scrollbar,
            LAYOUT__cursor_normal,
            LAYOUT__cursor_hover,
            LAYOUT__cursor_text_normal,
            LAYOUT__cursor_text_hover,
            LAYOUT__text_normal,
            LAYOUT__text_hover,
            LAYOUT__text_active,
            LAYOUT__selected_normal,
            LAYOUT__selected_hover,
            LAYOUT__selected_text_normal,
            LAYOUT__selected_text_hover,
            LAYOUT__border,
            LAYOUT__rounding,
            LAYOUT__cursor_size,
            LAYOUT__scrollbar_size,
            LAYOUT__padding,
            LAYOUT__row_padding,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_style_edit");

    public nk_style_edit(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_edit getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_edit(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_edit value)
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

    public nuklear.nk_style_scrollbar scrollbar() {return new nuklear.nk_style_scrollbar(this._ptr.asSlice(OFFSET__scrollbar, LAYOUT__scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_style_scrollbar> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_style_scrollbar value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollbar, LAYOUT__scrollbar.byteSize());}

    public nuklear.nk_color cursor_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__cursor_normal, LAYOUT__cursor_normal));}
    public void cursor_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_normal());}
    public void cursor_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_normal, LAYOUT__cursor_normal.byteSize());}

    public nuklear.nk_color cursor_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__cursor_hover, LAYOUT__cursor_hover));}
    public void cursor_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_hover());}
    public void cursor_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_hover, LAYOUT__cursor_hover.byteSize());}

    public nuklear.nk_color cursor_text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__cursor_text_normal, LAYOUT__cursor_text_normal));}
    public void cursor_text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_text_normal());}
    public void cursor_text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_text_normal, LAYOUT__cursor_text_normal.byteSize());}

    public nuklear.nk_color cursor_text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__cursor_text_hover, LAYOUT__cursor_text_hover));}
    public void cursor_text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_text_hover());}
    public void cursor_text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_text_hover, LAYOUT__cursor_text_hover.byteSize());}

    public nuklear.nk_color text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_normal, LAYOUT__text_normal));}
    public void text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal());}
    public void text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_normal, LAYOUT__text_normal.byteSize());}

    public nuklear.nk_color text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_hover, LAYOUT__text_hover));}
    public void text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover());}
    public void text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_hover, LAYOUT__text_hover.byteSize());}

    public nuklear.nk_color text_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_active, LAYOUT__text_active));}
    public void text_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_active());}
    public void text_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_active, LAYOUT__text_active.byteSize());}

    public nuklear.nk_color selected_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__selected_normal, LAYOUT__selected_normal));}
    public void selected_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_normal());}
    public void selected_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__selected_normal, LAYOUT__selected_normal.byteSize());}

    public nuklear.nk_color selected_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__selected_hover, LAYOUT__selected_hover));}
    public void selected_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_hover());}
    public void selected_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__selected_hover, LAYOUT__selected_hover.byteSize());}

    public nuklear.nk_color selected_text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__selected_text_normal, LAYOUT__selected_text_normal));}
    public void selected_text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_text_normal());}
    public void selected_text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__selected_text_normal, LAYOUT__selected_text_normal.byteSize());}

    public nuklear.nk_color selected_text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__selected_text_hover, LAYOUT__selected_text_hover));}
    public void selected_text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_text_hover());}
    public void selected_text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__selected_text_hover, LAYOUT__selected_text_hover.byteSize());}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public float cursor_size() {return this._ptr.get(LAYOUT__cursor_size, OFFSET__cursor_size);}
    public void cursor_size(float value) {this._ptr.set(LAYOUT__cursor_size, OFFSET__cursor_size, value);}
    public java.lang.foreign.MemorySegment $cursor_size() {return this._ptr.asSlice(OFFSET__cursor_size, LAYOUT__cursor_size);}

    public nuklear.nk_vec2 scrollbar_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__scrollbar_size, LAYOUT__scrollbar_size));}
    public void scrollbar_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scrollbar_size());}
    public void scrollbar_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollbar_size, LAYOUT__scrollbar_size.byteSize());}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public float row_padding() {return this._ptr.get(LAYOUT__row_padding, OFFSET__row_padding);}
    public void row_padding(float value) {this._ptr.set(LAYOUT__row_padding, OFFSET__row_padding, value);}
    public java.lang.foreign.MemorySegment $row_padding() {return this._ptr.asSlice(OFFSET__row_padding, LAYOUT__row_padding);}

    public float color_factor() {return this._ptr.get(LAYOUT__color_factor, OFFSET__color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT__color_factor, OFFSET__color_factor, value);}
    public java.lang.foreign.MemorySegment $color_factor() {return this._ptr.asSlice(OFFSET__color_factor, LAYOUT__color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT__disabled_factor, OFFSET__disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT__disabled_factor, OFFSET__disabled_factor, value);}
    public java.lang.foreign.MemorySegment $disabled_factor() {return this._ptr.asSlice(OFFSET__disabled_factor, LAYOUT__disabled_factor);}
}
