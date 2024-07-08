package nuklear;

public record nk_style_combo(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout.withName("normal");
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout.withName("hover");
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__active = nuklear.nk_style_item.gRecordLayout.withName("active");
    public static final long OFFSET__active = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout.withName("border_color");
    public static final long OFFSET__border_color = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__label_normal = nuklear.nk_color.gRecordLayout.withName("label_normal");
    public static final long OFFSET__label_normal = 124;
    public static final java.lang.foreign.StructLayout LAYOUT__label_hover = nuklear.nk_color.gRecordLayout.withName("label_hover");
    public static final long OFFSET__label_hover = 128;
    public static final java.lang.foreign.StructLayout LAYOUT__label_active = nuklear.nk_color.gRecordLayout.withName("label_active");
    public static final long OFFSET__label_active = 132;
    public static final java.lang.foreign.StructLayout LAYOUT__symbol_normal = nuklear.nk_color.gRecordLayout.withName("symbol_normal");
    public static final long OFFSET__symbol_normal = 136;
    public static final java.lang.foreign.StructLayout LAYOUT__symbol_hover = nuklear.nk_color.gRecordLayout.withName("symbol_hover");
    public static final long OFFSET__symbol_hover = 140;
    public static final java.lang.foreign.StructLayout LAYOUT__symbol_active = nuklear.nk_color.gRecordLayout.withName("symbol_active");
    public static final long OFFSET__symbol_active = 144;
    public static final java.lang.foreign.StructLayout LAYOUT__button = nuklear.nk_style_button.gRecordLayout.withName("button");
    public static final long OFFSET__button = 152;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sym_normal = java.lang.foreign.ValueLayout.JAVA_INT.withName("sym_normal");
    public static final long OFFSET__sym_normal = 368;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sym_hover = java.lang.foreign.ValueLayout.JAVA_INT.withName("sym_hover");
    public static final long OFFSET__sym_hover = 372;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sym_active = java.lang.foreign.ValueLayout.JAVA_INT.withName("sym_active");
    public static final long OFFSET__sym_active = 376;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("border");
    public static final long OFFSET__border = 380;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("rounding");
    public static final long OFFSET__rounding = 384;
    public static final java.lang.foreign.StructLayout LAYOUT__content_padding = nuklear.nk_vec2.gRecordLayout.withName("content_padding");
    public static final long OFFSET__content_padding = 388;
    public static final java.lang.foreign.StructLayout LAYOUT__button_padding = nuklear.nk_vec2.gRecordLayout.withName("button_padding");
    public static final long OFFSET__button_padding = 396;
    public static final java.lang.foreign.StructLayout LAYOUT__spacing = nuklear.nk_vec2.gRecordLayout.withName("spacing");
    public static final long OFFSET__spacing = 404;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("color_factor");
    public static final long OFFSET__color_factor = 412;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("disabled_factor");
    public static final long OFFSET__disabled_factor = 416;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__active,
            LAYOUT__border_color,
            LAYOUT__label_normal,
            LAYOUT__label_hover,
            LAYOUT__label_active,
            LAYOUT__symbol_normal,
            LAYOUT__symbol_hover,
            LAYOUT__symbol_active,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__button,
            LAYOUT__sym_normal,
            LAYOUT__sym_hover,
            LAYOUT__sym_active,
            LAYOUT__border,
            LAYOUT__rounding,
            LAYOUT__content_padding,
            LAYOUT__button_padding,
            LAYOUT__spacing,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_style_combo");

    public nk_style_combo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_combo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_combo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_combo value)
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

    public nuklear.nk_color label_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_normal, LAYOUT__label_normal));}
    public void label_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_normal());}
    public void label_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_normal, LAYOUT__label_normal.byteSize());}

    public nuklear.nk_color label_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_hover, LAYOUT__label_hover));}
    public void label_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_hover());}
    public void label_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_hover, LAYOUT__label_hover.byteSize());}

    public nuklear.nk_color label_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_active, LAYOUT__label_active));}
    public void label_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_active());}
    public void label_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_active, LAYOUT__label_active.byteSize());}

    public nuklear.nk_color symbol_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__symbol_normal, LAYOUT__symbol_normal));}
    public void symbol_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.symbol_normal());}
    public void symbol_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__symbol_normal, LAYOUT__symbol_normal.byteSize());}

    public nuklear.nk_color symbol_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__symbol_hover, LAYOUT__symbol_hover));}
    public void symbol_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.symbol_hover());}
    public void symbol_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__symbol_hover, LAYOUT__symbol_hover.byteSize());}

    public nuklear.nk_color symbol_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__symbol_active, LAYOUT__symbol_active));}
    public void symbol_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.symbol_active());}
    public void symbol_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__symbol_active, LAYOUT__symbol_active.byteSize());}

    public nuklear.nk_style_button button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__button, LAYOUT__button));}
    public void button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.button());}
    public void button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__button, LAYOUT__button.byteSize());}

    public int sym_normal() {return this._ptr.get(LAYOUT__sym_normal, OFFSET__sym_normal);}
    public void sym_normal(int value) {this._ptr.set(LAYOUT__sym_normal, OFFSET__sym_normal, value);}
    public java.lang.foreign.MemorySegment $sym_normal() {return this._ptr.asSlice(OFFSET__sym_normal, LAYOUT__sym_normal);}

    public int sym_hover() {return this._ptr.get(LAYOUT__sym_hover, OFFSET__sym_hover);}
    public void sym_hover(int value) {this._ptr.set(LAYOUT__sym_hover, OFFSET__sym_hover, value);}
    public java.lang.foreign.MemorySegment $sym_hover() {return this._ptr.asSlice(OFFSET__sym_hover, LAYOUT__sym_hover);}

    public int sym_active() {return this._ptr.get(LAYOUT__sym_active, OFFSET__sym_active);}
    public void sym_active(int value) {this._ptr.set(LAYOUT__sym_active, OFFSET__sym_active, value);}
    public java.lang.foreign.MemorySegment $sym_active() {return this._ptr.asSlice(OFFSET__sym_active, LAYOUT__sym_active);}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public nuklear.nk_vec2 content_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__content_padding, LAYOUT__content_padding));}
    public void content_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.content_padding());}
    public void content_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__content_padding, LAYOUT__content_padding.byteSize());}

    public nuklear.nk_vec2 button_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__button_padding, LAYOUT__button_padding));}
    public void button_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.button_padding());}
    public void button_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__button_padding, LAYOUT__button_padding.byteSize());}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__spacing, LAYOUT__spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__spacing, LAYOUT__spacing.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT__color_factor, OFFSET__color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT__color_factor, OFFSET__color_factor, value);}
    public java.lang.foreign.MemorySegment $color_factor() {return this._ptr.asSlice(OFFSET__color_factor, LAYOUT__color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT__disabled_factor, OFFSET__disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT__disabled_factor, OFFSET__disabled_factor, value);}
    public java.lang.foreign.MemorySegment $disabled_factor() {return this._ptr.asSlice(OFFSET__disabled_factor, LAYOUT__disabled_factor);}
}
