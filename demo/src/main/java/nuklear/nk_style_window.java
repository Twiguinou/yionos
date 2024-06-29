package nuklear;

public record nk_style_window(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_style_window_header.gRecordLayout;
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__fixed_background = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__fixed_background = 608;
    public static final java.lang.foreign.StructLayout LAYOUT__background = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__background = 648;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__border_color = 652;
    public static final java.lang.foreign.StructLayout LAYOUT__popup_border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__popup_border_color = 656;
    public static final java.lang.foreign.StructLayout LAYOUT__combo_border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__combo_border_color = 660;
    public static final java.lang.foreign.StructLayout LAYOUT__contextual_border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__contextual_border_color = 664;
    public static final java.lang.foreign.StructLayout LAYOUT__menu_border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__menu_border_color = 668;
    public static final java.lang.foreign.StructLayout LAYOUT__group_border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__group_border_color = 672;
    public static final java.lang.foreign.StructLayout LAYOUT__tooltip_border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__tooltip_border_color = 676;
    public static final java.lang.foreign.StructLayout LAYOUT__scaler = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__scaler = 680;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__border = 720;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__combo_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__combo_border = 724;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__contextual_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__contextual_border = 728;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__menu_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__menu_border = 732;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__group_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__group_border = 736;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__tooltip_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__tooltip_border = 740;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__popup_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__popup_border = 744;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__min_row_height_padding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__min_row_height_padding = 748;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__rounding = 752;
    public static final java.lang.foreign.StructLayout LAYOUT__spacing = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__spacing = 756;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollbar_size = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__scrollbar_size = 764;
    public static final java.lang.foreign.StructLayout LAYOUT__min_size = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__min_size = 772;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__padding = 780;
    public static final java.lang.foreign.StructLayout LAYOUT__group_padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__group_padding = 788;
    public static final java.lang.foreign.StructLayout LAYOUT__popup_padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__popup_padding = 796;
    public static final java.lang.foreign.StructLayout LAYOUT__combo_padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__combo_padding = 804;
    public static final java.lang.foreign.StructLayout LAYOUT__contextual_padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__contextual_padding = 812;
    public static final java.lang.foreign.StructLayout LAYOUT__menu_padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__menu_padding = 820;
    public static final java.lang.foreign.StructLayout LAYOUT__tooltip_padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__tooltip_padding = 828;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__fixed_background,
            LAYOUT__background,
            LAYOUT__border_color,
            LAYOUT__popup_border_color,
            LAYOUT__combo_border_color,
            LAYOUT__contextual_border_color,
            LAYOUT__menu_border_color,
            LAYOUT__group_border_color,
            LAYOUT__tooltip_border_color,
            LAYOUT__scaler,
            LAYOUT__border,
            LAYOUT__combo_border,
            LAYOUT__contextual_border,
            LAYOUT__menu_border,
            LAYOUT__group_border,
            LAYOUT__tooltip_border,
            LAYOUT__popup_border,
            LAYOUT__min_row_height_padding,
            LAYOUT__rounding,
            LAYOUT__spacing,
            LAYOUT__scrollbar_size,
            LAYOUT__min_size,
            LAYOUT__padding,
            LAYOUT__group_padding,
            LAYOUT__popup_padding,
            LAYOUT__combo_padding,
            LAYOUT__contextual_padding,
            LAYOUT__menu_padding,
            LAYOUT__tooltip_padding,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_style_window");

    public nk_style_window(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_window getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_window(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_window value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_style_window_header header() {return new nuklear.nk_style_window_header(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_style_window_header> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_style_window_header value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

    public nuklear.nk_style_item fixed_background() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__fixed_background, LAYOUT__fixed_background));}
    public void fixed_background(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.fixed_background());}
    public void fixed_background(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__fixed_background, LAYOUT__fixed_background.byteSize());}

    public nuklear.nk_color background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__background, LAYOUT__background));}
    public void background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.background());}
    public void background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__background, LAYOUT__background.byteSize());}

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__border_color, LAYOUT__border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__border_color, LAYOUT__border_color.byteSize());}

    public nuklear.nk_color popup_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__popup_border_color, LAYOUT__popup_border_color));}
    public void popup_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.popup_border_color());}
    public void popup_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__popup_border_color, LAYOUT__popup_border_color.byteSize());}

    public nuklear.nk_color combo_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__combo_border_color, LAYOUT__combo_border_color));}
    public void combo_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.combo_border_color());}
    public void combo_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__combo_border_color, LAYOUT__combo_border_color.byteSize());}

    public nuklear.nk_color contextual_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__contextual_border_color, LAYOUT__contextual_border_color));}
    public void contextual_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.contextual_border_color());}
    public void contextual_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__contextual_border_color, LAYOUT__contextual_border_color.byteSize());}

    public nuklear.nk_color menu_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__menu_border_color, LAYOUT__menu_border_color));}
    public void menu_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.menu_border_color());}
    public void menu_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__menu_border_color, LAYOUT__menu_border_color.byteSize());}

    public nuklear.nk_color group_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__group_border_color, LAYOUT__group_border_color));}
    public void group_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.group_border_color());}
    public void group_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__group_border_color, LAYOUT__group_border_color.byteSize());}

    public nuklear.nk_color tooltip_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__tooltip_border_color, LAYOUT__tooltip_border_color));}
    public void tooltip_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.tooltip_border_color());}
    public void tooltip_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__tooltip_border_color, LAYOUT__tooltip_border_color.byteSize());}

    public nuklear.nk_style_item scaler() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__scaler, LAYOUT__scaler));}
    public void scaler(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.scaler());}
    public void scaler(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scaler, LAYOUT__scaler.byteSize());}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float combo_border() {return this._ptr.get(LAYOUT__combo_border, OFFSET__combo_border);}
    public void combo_border(float value) {this._ptr.set(LAYOUT__combo_border, OFFSET__combo_border, value);}
    public java.lang.foreign.MemorySegment $combo_border() {return this._ptr.asSlice(OFFSET__combo_border, LAYOUT__combo_border);}

    public float contextual_border() {return this._ptr.get(LAYOUT__contextual_border, OFFSET__contextual_border);}
    public void contextual_border(float value) {this._ptr.set(LAYOUT__contextual_border, OFFSET__contextual_border, value);}
    public java.lang.foreign.MemorySegment $contextual_border() {return this._ptr.asSlice(OFFSET__contextual_border, LAYOUT__contextual_border);}

    public float menu_border() {return this._ptr.get(LAYOUT__menu_border, OFFSET__menu_border);}
    public void menu_border(float value) {this._ptr.set(LAYOUT__menu_border, OFFSET__menu_border, value);}
    public java.lang.foreign.MemorySegment $menu_border() {return this._ptr.asSlice(OFFSET__menu_border, LAYOUT__menu_border);}

    public float group_border() {return this._ptr.get(LAYOUT__group_border, OFFSET__group_border);}
    public void group_border(float value) {this._ptr.set(LAYOUT__group_border, OFFSET__group_border, value);}
    public java.lang.foreign.MemorySegment $group_border() {return this._ptr.asSlice(OFFSET__group_border, LAYOUT__group_border);}

    public float tooltip_border() {return this._ptr.get(LAYOUT__tooltip_border, OFFSET__tooltip_border);}
    public void tooltip_border(float value) {this._ptr.set(LAYOUT__tooltip_border, OFFSET__tooltip_border, value);}
    public java.lang.foreign.MemorySegment $tooltip_border() {return this._ptr.asSlice(OFFSET__tooltip_border, LAYOUT__tooltip_border);}

    public float popup_border() {return this._ptr.get(LAYOUT__popup_border, OFFSET__popup_border);}
    public void popup_border(float value) {this._ptr.set(LAYOUT__popup_border, OFFSET__popup_border, value);}
    public java.lang.foreign.MemorySegment $popup_border() {return this._ptr.asSlice(OFFSET__popup_border, LAYOUT__popup_border);}

    public float min_row_height_padding() {return this._ptr.get(LAYOUT__min_row_height_padding, OFFSET__min_row_height_padding);}
    public void min_row_height_padding(float value) {this._ptr.set(LAYOUT__min_row_height_padding, OFFSET__min_row_height_padding, value);}
    public java.lang.foreign.MemorySegment $min_row_height_padding() {return this._ptr.asSlice(OFFSET__min_row_height_padding, LAYOUT__min_row_height_padding);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__spacing, LAYOUT__spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__spacing, LAYOUT__spacing.byteSize());}

    public nuklear.nk_vec2 scrollbar_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__scrollbar_size, LAYOUT__scrollbar_size));}
    public void scrollbar_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scrollbar_size());}
    public void scrollbar_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollbar_size, LAYOUT__scrollbar_size.byteSize());}

    public nuklear.nk_vec2 min_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__min_size, LAYOUT__min_size));}
    public void min_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.min_size());}
    public void min_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__min_size, LAYOUT__min_size.byteSize());}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public nuklear.nk_vec2 group_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__group_padding, LAYOUT__group_padding));}
    public void group_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.group_padding());}
    public void group_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__group_padding, LAYOUT__group_padding.byteSize());}

    public nuklear.nk_vec2 popup_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__popup_padding, LAYOUT__popup_padding));}
    public void popup_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.popup_padding());}
    public void popup_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__popup_padding, LAYOUT__popup_padding.byteSize());}

    public nuklear.nk_vec2 combo_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__combo_padding, LAYOUT__combo_padding));}
    public void combo_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.combo_padding());}
    public void combo_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__combo_padding, LAYOUT__combo_padding.byteSize());}

    public nuklear.nk_vec2 contextual_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__contextual_padding, LAYOUT__contextual_padding));}
    public void contextual_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.contextual_padding());}
    public void contextual_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__contextual_padding, LAYOUT__contextual_padding.byteSize());}

    public nuklear.nk_vec2 menu_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__menu_padding, LAYOUT__menu_padding));}
    public void menu_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.menu_padding());}
    public void menu_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__menu_padding, LAYOUT__menu_padding.byteSize());}

    public nuklear.nk_vec2 tooltip_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__tooltip_padding, LAYOUT__tooltip_padding));}
    public void tooltip_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.tooltip_padding());}
    public void tooltip_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__tooltip_padding, LAYOUT__tooltip_padding.byteSize());}
}
