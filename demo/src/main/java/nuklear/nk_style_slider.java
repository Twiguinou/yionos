package nuklear;

public record nk_style_slider(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$active = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$border_color = 120L;
    public static final java.lang.foreign.GroupLayout LAYOUT$bar_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$bar_normal = 124L;
    public static final java.lang.foreign.GroupLayout LAYOUT$bar_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$bar_hover = 128L;
    public static final java.lang.foreign.GroupLayout LAYOUT$bar_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$bar_active = 132L;
    public static final java.lang.foreign.GroupLayout LAYOUT$bar_filled = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$bar_filled = 136L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$cursor_normal = 144L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$cursor_hover = 184L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$cursor_active = 224L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 264L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 268L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$bar_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$bar_height = 272L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 276L;
    public static final java.lang.foreign.GroupLayout LAYOUT$spacing = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$spacing = 284L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_size = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$cursor_size = 292L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor = 300L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 304L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$show_buttons = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$show_buttons = 308L;
    public static final java.lang.foreign.GroupLayout LAYOUT$inc_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$inc_button = 312L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dec_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$dec_button = 528L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inc_symbol = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$inc_symbol = 744L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dec_symbol = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dec_symbol = 748L;
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 752L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_begin = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_begin = 760L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_end = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_end = 768L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$active,
            LAYOUT$border_color,
            LAYOUT$bar_normal,
            LAYOUT$bar_hover,
            LAYOUT$bar_active,
            LAYOUT$bar_filled,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$cursor_normal,
            LAYOUT$cursor_hover,
            LAYOUT$cursor_active,
            LAYOUT$border,
            LAYOUT$rounding,
            LAYOUT$bar_height,
            LAYOUT$padding,
            LAYOUT$spacing,
            LAYOUT$cursor_size,
            LAYOUT$color_factor,
            LAYOUT$disabled_factor,
            LAYOUT$show_buttons,
            LAYOUT$inc_button,
            LAYOUT$dec_button,
            LAYOUT$inc_symbol,
            LAYOUT$dec_symbol,
            LAYOUT$userdata,
            LAYOUT$draw_begin,
            LAYOUT$draw_end
    ).withName("nk_style_slider");

    public nk_style_slider(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_slider getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_slider(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public nuklear.nk_color bar_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$bar_normal, LAYOUT$bar_normal));}
    public void bar_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_normal());}
    public void bar_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$bar_normal, LAYOUT$bar_normal.byteSize());}

    public nuklear.nk_color bar_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$bar_hover, LAYOUT$bar_hover));}
    public void bar_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_hover());}
    public void bar_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$bar_hover, LAYOUT$bar_hover.byteSize());}

    public nuklear.nk_color bar_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$bar_active, LAYOUT$bar_active));}
    public void bar_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_active());}
    public void bar_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$bar_active, LAYOUT$bar_active.byteSize());}

    public nuklear.nk_color bar_filled() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$bar_filled, LAYOUT$bar_filled));}
    public void bar_filled(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_filled());}
    public void bar_filled(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$bar_filled, LAYOUT$bar_filled.byteSize());}

    public nuklear.nk_style_item cursor_normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$cursor_normal, LAYOUT$cursor_normal));}
    public void cursor_normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_normal());}
    public void cursor_normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_normal, LAYOUT$cursor_normal.byteSize());}

    public nuklear.nk_style_item cursor_hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$cursor_hover, LAYOUT$cursor_hover));}
    public void cursor_hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_hover());}
    public void cursor_hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_hover, LAYOUT$cursor_hover.byteSize());}

    public nuklear.nk_style_item cursor_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$cursor_active, LAYOUT$cursor_active));}
    public void cursor_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_active());}
    public void cursor_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_active, LAYOUT$cursor_active.byteSize());}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public float bar_height() {return this._ptr.get(LAYOUT$bar_height, OFFSET$bar_height);}
    public void bar_height(float value) {this._ptr.set(LAYOUT$bar_height, OFFSET$bar_height, value);}
    public java.lang.foreign.MemorySegment bar_height_ptr() {return this._ptr.asSlice(OFFSET$bar_height, LAYOUT$bar_height);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$spacing, LAYOUT$spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$spacing, LAYOUT$spacing.byteSize());}

    public nuklear.nk_vec2 cursor_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$cursor_size, LAYOUT$cursor_size));}
    public void cursor_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.cursor_size());}
    public void cursor_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_size, LAYOUT$cursor_size.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT$color_factor, OFFSET$color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT$color_factor, OFFSET$color_factor, value);}
    public java.lang.foreign.MemorySegment color_factor_ptr() {return this._ptr.asSlice(OFFSET$color_factor, LAYOUT$color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT$disabled_factor, OFFSET$disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT$disabled_factor, OFFSET$disabled_factor, value);}
    public java.lang.foreign.MemorySegment disabled_factor_ptr() {return this._ptr.asSlice(OFFSET$disabled_factor, LAYOUT$disabled_factor);}

    public int show_buttons() {return this._ptr.get(LAYOUT$show_buttons, OFFSET$show_buttons);}
    public void show_buttons(int value) {this._ptr.set(LAYOUT$show_buttons, OFFSET$show_buttons, value);}
    public java.lang.foreign.MemorySegment show_buttons_ptr() {return this._ptr.asSlice(OFFSET$show_buttons, LAYOUT$show_buttons);}

    public nuklear.nk_style_button inc_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$inc_button, LAYOUT$inc_button));}
    public void inc_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.inc_button());}
    public void inc_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$inc_button, LAYOUT$inc_button.byteSize());}

    public nuklear.nk_style_button dec_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$dec_button, LAYOUT$dec_button));}
    public void dec_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.dec_button());}
    public void dec_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$dec_button, LAYOUT$dec_button.byteSize());}

    public int inc_symbol() {return this._ptr.get(LAYOUT$inc_symbol, OFFSET$inc_symbol);}
    public void inc_symbol(int value) {this._ptr.set(LAYOUT$inc_symbol, OFFSET$inc_symbol, value);}
    public java.lang.foreign.MemorySegment inc_symbol_ptr() {return this._ptr.asSlice(OFFSET$inc_symbol, LAYOUT$inc_symbol);}

    public int dec_symbol() {return this._ptr.get(LAYOUT$dec_symbol, OFFSET$dec_symbol);}
    public void dec_symbol(int value) {this._ptr.set(LAYOUT$dec_symbol, OFFSET$dec_symbol, value);}
    public java.lang.foreign.MemorySegment dec_symbol_ptr() {return this._ptr.asSlice(OFFSET$dec_symbol, LAYOUT$dec_symbol);}

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET$userdata, LAYOUT$userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$userdata, LAYOUT$userdata.byteSize());}

    public java.lang.foreign.MemorySegment draw_begin() {return this._ptr.get(LAYOUT$draw_begin, OFFSET$draw_begin);}
    public void draw_begin(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$draw_begin, OFFSET$draw_begin, value);}
    public java.lang.foreign.MemorySegment draw_begin_ptr() {return this._ptr.asSlice(OFFSET$draw_begin, LAYOUT$draw_begin);}

    public java.lang.foreign.MemorySegment draw_end() {return this._ptr.get(LAYOUT$draw_end, OFFSET$draw_end);}
    public void draw_end(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$draw_end, OFFSET$draw_end, value);}
    public java.lang.foreign.MemorySegment draw_end_ptr() {return this._ptr.asSlice(OFFSET$draw_end, LAYOUT$draw_end);}
}
