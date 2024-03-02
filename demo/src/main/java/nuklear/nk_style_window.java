package nuklear;

public record nk_style_window(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_style_window_header.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$fixed_background = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$fixed_background = 608L;
    public static final java.lang.foreign.GroupLayout LAYOUT$background = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$background = 648L;
    public static final java.lang.foreign.GroupLayout LAYOUT$border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$border_color = 652L;
    public static final java.lang.foreign.GroupLayout LAYOUT$popup_border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$popup_border_color = 656L;
    public static final java.lang.foreign.GroupLayout LAYOUT$combo_border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$combo_border_color = 660L;
    public static final java.lang.foreign.GroupLayout LAYOUT$contextual_border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$contextual_border_color = 664L;
    public static final java.lang.foreign.GroupLayout LAYOUT$menu_border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$menu_border_color = 668L;
    public static final java.lang.foreign.GroupLayout LAYOUT$group_border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$group_border_color = 672L;
    public static final java.lang.foreign.GroupLayout LAYOUT$tooltip_border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$tooltip_border_color = 676L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scaler = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$scaler = 680L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 720L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$combo_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$combo_border = 724L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$contextual_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$contextual_border = 728L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$menu_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$menu_border = 732L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$group_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$group_border = 736L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$tooltip_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$tooltip_border = 740L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$popup_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$popup_border = 744L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$min_row_height_padding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$min_row_height_padding = 748L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 752L;
    public static final java.lang.foreign.GroupLayout LAYOUT$spacing = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$spacing = 756L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollbar_size = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$scrollbar_size = 764L;
    public static final java.lang.foreign.GroupLayout LAYOUT$min_size = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$min_size = 772L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 780L;
    public static final java.lang.foreign.GroupLayout LAYOUT$group_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$group_padding = 788L;
    public static final java.lang.foreign.GroupLayout LAYOUT$popup_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$popup_padding = 796L;
    public static final java.lang.foreign.GroupLayout LAYOUT$combo_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$combo_padding = 804L;
    public static final java.lang.foreign.GroupLayout LAYOUT$contextual_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$contextual_padding = 812L;
    public static final java.lang.foreign.GroupLayout LAYOUT$menu_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$menu_padding = 820L;
    public static final java.lang.foreign.GroupLayout LAYOUT$tooltip_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$tooltip_padding = 828L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$fixed_background,
            LAYOUT$background,
            LAYOUT$border_color,
            LAYOUT$popup_border_color,
            LAYOUT$combo_border_color,
            LAYOUT$contextual_border_color,
            LAYOUT$menu_border_color,
            LAYOUT$group_border_color,
            LAYOUT$tooltip_border_color,
            LAYOUT$scaler,
            LAYOUT$border,
            LAYOUT$combo_border,
            LAYOUT$contextual_border,
            LAYOUT$menu_border,
            LAYOUT$group_border,
            LAYOUT$tooltip_border,
            LAYOUT$popup_border,
            LAYOUT$min_row_height_padding,
            LAYOUT$rounding,
            LAYOUT$spacing,
            LAYOUT$scrollbar_size,
            LAYOUT$min_size,
            LAYOUT$padding,
            LAYOUT$group_padding,
            LAYOUT$popup_padding,
            LAYOUT$combo_padding,
            LAYOUT$contextual_padding,
            LAYOUT$menu_padding,
            LAYOUT$tooltip_padding,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_style_window");

    public nk_style_window(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_window getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_window(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_style_window_header header() {return new nuklear.nk_style_window_header(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_style_window_header> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_style_window_header value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public nuklear.nk_style_item fixed_background() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$fixed_background, LAYOUT$fixed_background));}
    public void fixed_background(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.fixed_background());}
    public void fixed_background(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$fixed_background, LAYOUT$fixed_background.byteSize());}

    public nuklear.nk_color background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$background, LAYOUT$background));}
    public void background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.background());}
    public void background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$background, LAYOUT$background.byteSize());}

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$border_color, LAYOUT$border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$border_color, LAYOUT$border_color.byteSize());}

    public nuklear.nk_color popup_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$popup_border_color, LAYOUT$popup_border_color));}
    public void popup_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.popup_border_color());}
    public void popup_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$popup_border_color, LAYOUT$popup_border_color.byteSize());}

    public nuklear.nk_color combo_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$combo_border_color, LAYOUT$combo_border_color));}
    public void combo_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.combo_border_color());}
    public void combo_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$combo_border_color, LAYOUT$combo_border_color.byteSize());}

    public nuklear.nk_color contextual_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$contextual_border_color, LAYOUT$contextual_border_color));}
    public void contextual_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.contextual_border_color());}
    public void contextual_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$contextual_border_color, LAYOUT$contextual_border_color.byteSize());}

    public nuklear.nk_color menu_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$menu_border_color, LAYOUT$menu_border_color));}
    public void menu_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.menu_border_color());}
    public void menu_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$menu_border_color, LAYOUT$menu_border_color.byteSize());}

    public nuklear.nk_color group_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$group_border_color, LAYOUT$group_border_color));}
    public void group_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.group_border_color());}
    public void group_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$group_border_color, LAYOUT$group_border_color.byteSize());}

    public nuklear.nk_color tooltip_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$tooltip_border_color, LAYOUT$tooltip_border_color));}
    public void tooltip_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.tooltip_border_color());}
    public void tooltip_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$tooltip_border_color, LAYOUT$tooltip_border_color.byteSize());}

    public nuklear.nk_style_item scaler() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$scaler, LAYOUT$scaler));}
    public void scaler(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.scaler());}
    public void scaler(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scaler, LAYOUT$scaler.byteSize());}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float combo_border() {return this._ptr.get(LAYOUT$combo_border, OFFSET$combo_border);}
    public void combo_border(float value) {this._ptr.set(LAYOUT$combo_border, OFFSET$combo_border, value);}
    public java.lang.foreign.MemorySegment combo_border_ptr() {return this._ptr.asSlice(OFFSET$combo_border, LAYOUT$combo_border);}

    public float contextual_border() {return this._ptr.get(LAYOUT$contextual_border, OFFSET$contextual_border);}
    public void contextual_border(float value) {this._ptr.set(LAYOUT$contextual_border, OFFSET$contextual_border, value);}
    public java.lang.foreign.MemorySegment contextual_border_ptr() {return this._ptr.asSlice(OFFSET$contextual_border, LAYOUT$contextual_border);}

    public float menu_border() {return this._ptr.get(LAYOUT$menu_border, OFFSET$menu_border);}
    public void menu_border(float value) {this._ptr.set(LAYOUT$menu_border, OFFSET$menu_border, value);}
    public java.lang.foreign.MemorySegment menu_border_ptr() {return this._ptr.asSlice(OFFSET$menu_border, LAYOUT$menu_border);}

    public float group_border() {return this._ptr.get(LAYOUT$group_border, OFFSET$group_border);}
    public void group_border(float value) {this._ptr.set(LAYOUT$group_border, OFFSET$group_border, value);}
    public java.lang.foreign.MemorySegment group_border_ptr() {return this._ptr.asSlice(OFFSET$group_border, LAYOUT$group_border);}

    public float tooltip_border() {return this._ptr.get(LAYOUT$tooltip_border, OFFSET$tooltip_border);}
    public void tooltip_border(float value) {this._ptr.set(LAYOUT$tooltip_border, OFFSET$tooltip_border, value);}
    public java.lang.foreign.MemorySegment tooltip_border_ptr() {return this._ptr.asSlice(OFFSET$tooltip_border, LAYOUT$tooltip_border);}

    public float popup_border() {return this._ptr.get(LAYOUT$popup_border, OFFSET$popup_border);}
    public void popup_border(float value) {this._ptr.set(LAYOUT$popup_border, OFFSET$popup_border, value);}
    public java.lang.foreign.MemorySegment popup_border_ptr() {return this._ptr.asSlice(OFFSET$popup_border, LAYOUT$popup_border);}

    public float min_row_height_padding() {return this._ptr.get(LAYOUT$min_row_height_padding, OFFSET$min_row_height_padding);}
    public void min_row_height_padding(float value) {this._ptr.set(LAYOUT$min_row_height_padding, OFFSET$min_row_height_padding, value);}
    public java.lang.foreign.MemorySegment min_row_height_padding_ptr() {return this._ptr.asSlice(OFFSET$min_row_height_padding, LAYOUT$min_row_height_padding);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$spacing, LAYOUT$spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$spacing, LAYOUT$spacing.byteSize());}

    public nuklear.nk_vec2 scrollbar_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$scrollbar_size, LAYOUT$scrollbar_size));}
    public void scrollbar_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scrollbar_size());}
    public void scrollbar_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollbar_size, LAYOUT$scrollbar_size.byteSize());}

    public nuklear.nk_vec2 min_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$min_size, LAYOUT$min_size));}
    public void min_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.min_size());}
    public void min_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$min_size, LAYOUT$min_size.byteSize());}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

    public nuklear.nk_vec2 group_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$group_padding, LAYOUT$group_padding));}
    public void group_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.group_padding());}
    public void group_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$group_padding, LAYOUT$group_padding.byteSize());}

    public nuklear.nk_vec2 popup_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$popup_padding, LAYOUT$popup_padding));}
    public void popup_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.popup_padding());}
    public void popup_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$popup_padding, LAYOUT$popup_padding.byteSize());}

    public nuklear.nk_vec2 combo_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$combo_padding, LAYOUT$combo_padding));}
    public void combo_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.combo_padding());}
    public void combo_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$combo_padding, LAYOUT$combo_padding.byteSize());}

    public nuklear.nk_vec2 contextual_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$contextual_padding, LAYOUT$contextual_padding));}
    public void contextual_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.contextual_padding());}
    public void contextual_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$contextual_padding, LAYOUT$contextual_padding.byteSize());}

    public nuklear.nk_vec2 menu_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$menu_padding, LAYOUT$menu_padding));}
    public void menu_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.menu_padding());}
    public void menu_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$menu_padding, LAYOUT$menu_padding.byteSize());}

    public nuklear.nk_vec2 tooltip_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$tooltip_padding, LAYOUT$tooltip_padding));}
    public void tooltip_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.tooltip_padding());}
    public void tooltip_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$tooltip_padding, LAYOUT$tooltip_padding.byteSize());}
}
