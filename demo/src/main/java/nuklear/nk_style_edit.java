package nuklear;

public record nk_style_edit(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$active = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$border_color = 120L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollbar = nuklear.nk_style_scrollbar.gStructLayout;
    public static final long OFFSET$scrollbar = 128L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$cursor_normal = 880L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$cursor_hover = 884L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_text_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$cursor_text_normal = 888L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_text_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$cursor_text_hover = 892L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_normal = 896L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_hover = 900L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_active = 904L;
    public static final java.lang.foreign.GroupLayout LAYOUT$selected_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$selected_normal = 908L;
    public static final java.lang.foreign.GroupLayout LAYOUT$selected_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$selected_hover = 912L;
    public static final java.lang.foreign.GroupLayout LAYOUT$selected_text_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$selected_text_normal = 916L;
    public static final java.lang.foreign.GroupLayout LAYOUT$selected_text_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$selected_text_hover = 920L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 924L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 928L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$cursor_size = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$cursor_size = 932L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollbar_size = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$scrollbar_size = 936L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 944L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$row_padding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$row_padding = 952L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor = 956L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 960L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$active,
            LAYOUT$border_color,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$scrollbar,
            LAYOUT$cursor_normal,
            LAYOUT$cursor_hover,
            LAYOUT$cursor_text_normal,
            LAYOUT$cursor_text_hover,
            LAYOUT$text_normal,
            LAYOUT$text_hover,
            LAYOUT$text_active,
            LAYOUT$selected_normal,
            LAYOUT$selected_hover,
            LAYOUT$selected_text_normal,
            LAYOUT$selected_text_hover,
            LAYOUT$border,
            LAYOUT$rounding,
            LAYOUT$cursor_size,
            LAYOUT$scrollbar_size,
            LAYOUT$padding,
            LAYOUT$row_padding,
            LAYOUT$color_factor,
            LAYOUT$disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_style_edit");

    public nk_style_edit(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_edit getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_edit(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_style_item normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$normal, LAYOUT$normal));}
    public void normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.normal());}
    public void normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$normal, LAYOUT$normal.byteSize());}

    public nuklear.nk_style_item hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$hover, LAYOUT$hover));}
    public void hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.hover());}
    public void hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$hover, LAYOUT$hover.byteSize());}

    public nuklear.nk_style_item active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$active, LAYOUT$active));}
    public void active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.active());}
    public void active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$active, LAYOUT$active.byteSize());}

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$border_color, LAYOUT$border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$border_color, LAYOUT$border_color.byteSize());}

    public nuklear.nk_style_scrollbar scrollbar() {return new nuklear.nk_style_scrollbar(this._ptr.asSlice(OFFSET$scrollbar, LAYOUT$scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_style_scrollbar> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_style_scrollbar value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollbar, LAYOUT$scrollbar.byteSize());}

    public nuklear.nk_color cursor_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$cursor_normal, LAYOUT$cursor_normal));}
    public void cursor_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_normal());}
    public void cursor_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_normal, LAYOUT$cursor_normal.byteSize());}

    public nuklear.nk_color cursor_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$cursor_hover, LAYOUT$cursor_hover));}
    public void cursor_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_hover());}
    public void cursor_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_hover, LAYOUT$cursor_hover.byteSize());}

    public nuklear.nk_color cursor_text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$cursor_text_normal, LAYOUT$cursor_text_normal));}
    public void cursor_text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_text_normal());}
    public void cursor_text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_text_normal, LAYOUT$cursor_text_normal.byteSize());}

    public nuklear.nk_color cursor_text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$cursor_text_hover, LAYOUT$cursor_text_hover));}
    public void cursor_text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_text_hover());}
    public void cursor_text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_text_hover, LAYOUT$cursor_text_hover.byteSize());}

    public nuklear.nk_color text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_normal, LAYOUT$text_normal));}
    public void text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal());}
    public void text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_normal, LAYOUT$text_normal.byteSize());}

    public nuklear.nk_color text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_hover, LAYOUT$text_hover));}
    public void text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover());}
    public void text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_hover, LAYOUT$text_hover.byteSize());}

    public nuklear.nk_color text_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_active, LAYOUT$text_active));}
    public void text_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_active());}
    public void text_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_active, LAYOUT$text_active.byteSize());}

    public nuklear.nk_color selected_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$selected_normal, LAYOUT$selected_normal));}
    public void selected_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_normal());}
    public void selected_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$selected_normal, LAYOUT$selected_normal.byteSize());}

    public nuklear.nk_color selected_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$selected_hover, LAYOUT$selected_hover));}
    public void selected_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_hover());}
    public void selected_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$selected_hover, LAYOUT$selected_hover.byteSize());}

    public nuklear.nk_color selected_text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$selected_text_normal, LAYOUT$selected_text_normal));}
    public void selected_text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_text_normal());}
    public void selected_text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$selected_text_normal, LAYOUT$selected_text_normal.byteSize());}

    public nuklear.nk_color selected_text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$selected_text_hover, LAYOUT$selected_text_hover));}
    public void selected_text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_text_hover());}
    public void selected_text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$selected_text_hover, LAYOUT$selected_text_hover.byteSize());}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public float cursor_size() {return this._ptr.get(LAYOUT$cursor_size, OFFSET$cursor_size);}
    public void cursor_size(float value) {this._ptr.set(LAYOUT$cursor_size, OFFSET$cursor_size, value);}
    public java.lang.foreign.MemorySegment cursor_size_ptr() {return this._ptr.asSlice(OFFSET$cursor_size, LAYOUT$cursor_size);}

    public nuklear.nk_vec2 scrollbar_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$scrollbar_size, LAYOUT$scrollbar_size));}
    public void scrollbar_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.scrollbar_size());}
    public void scrollbar_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollbar_size, LAYOUT$scrollbar_size.byteSize());}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

    public float row_padding() {return this._ptr.get(LAYOUT$row_padding, OFFSET$row_padding);}
    public void row_padding(float value) {this._ptr.set(LAYOUT$row_padding, OFFSET$row_padding, value);}
    public java.lang.foreign.MemorySegment row_padding_ptr() {return this._ptr.asSlice(OFFSET$row_padding, LAYOUT$row_padding);}

    public float color_factor() {return this._ptr.get(LAYOUT$color_factor, OFFSET$color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT$color_factor, OFFSET$color_factor, value);}
    public java.lang.foreign.MemorySegment color_factor_ptr() {return this._ptr.asSlice(OFFSET$color_factor, LAYOUT$color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT$disabled_factor, OFFSET$disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT$disabled_factor, OFFSET$disabled_factor, value);}
    public java.lang.foreign.MemorySegment disabled_factor_ptr() {return this._ptr.asSlice(OFFSET$disabled_factor, LAYOUT$disabled_factor);}
}
