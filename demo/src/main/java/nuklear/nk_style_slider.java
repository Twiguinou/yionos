package nuklear;

public record nk_style_slider(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__active = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__active = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__border_color = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__bar_normal = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__bar_normal = 124;
    public static final java.lang.foreign.StructLayout LAYOUT__bar_hover = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__bar_hover = 128;
    public static final java.lang.foreign.StructLayout LAYOUT__bar_active = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__bar_active = 132;
    public static final java.lang.foreign.StructLayout LAYOUT__bar_filled = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__bar_filled = 136;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_normal = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__cursor_normal = 144;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_hover = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__cursor_hover = 184;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_active = nuklear.nk_style_item.gRecordLayout;
    public static final long OFFSET__cursor_active = 224;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__border = 264;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__rounding = 268;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__bar_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__bar_height = 272;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__padding = 276;
    public static final java.lang.foreign.StructLayout LAYOUT__spacing = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__spacing = 284;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_size = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__cursor_size = 292;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__color_factor = 300;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__disabled_factor = 304;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__show_buttons = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__show_buttons = 308;
    public static final java.lang.foreign.StructLayout LAYOUT__inc_button = nuklear.nk_style_button.gRecordLayout;
    public static final long OFFSET__inc_button = 312;
    public static final java.lang.foreign.StructLayout LAYOUT__dec_button = nuklear.nk_style_button.gRecordLayout;
    public static final long OFFSET__dec_button = 528;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inc_symbol = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__inc_symbol = 744;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dec_symbol = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dec_symbol = 748;
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout;
    public static final long OFFSET__userdata = 752;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_begin = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__draw_begin = 760;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_end = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__draw_end = 768;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__active,
            LAYOUT__border_color,
            LAYOUT__bar_normal,
            LAYOUT__bar_hover,
            LAYOUT__bar_active,
            LAYOUT__bar_filled,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__cursor_normal,
            LAYOUT__cursor_hover,
            LAYOUT__cursor_active,
            LAYOUT__border,
            LAYOUT__rounding,
            LAYOUT__bar_height,
            LAYOUT__padding,
            LAYOUT__spacing,
            LAYOUT__cursor_size,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            LAYOUT__show_buttons,
            LAYOUT__inc_button,
            LAYOUT__dec_button,
            LAYOUT__inc_symbol,
            LAYOUT__dec_symbol,
            LAYOUT__userdata,
            LAYOUT__draw_begin,
            LAYOUT__draw_end
    ).withByteAlignment(8).withName("nk_style_slider");

    public nk_style_slider(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_slider getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_slider(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_slider value)
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

    public nuklear.nk_color bar_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__bar_normal, LAYOUT__bar_normal));}
    public void bar_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_normal());}
    public void bar_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__bar_normal, LAYOUT__bar_normal.byteSize());}

    public nuklear.nk_color bar_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__bar_hover, LAYOUT__bar_hover));}
    public void bar_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_hover());}
    public void bar_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__bar_hover, LAYOUT__bar_hover.byteSize());}

    public nuklear.nk_color bar_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__bar_active, LAYOUT__bar_active));}
    public void bar_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_active());}
    public void bar_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__bar_active, LAYOUT__bar_active.byteSize());}

    public nuklear.nk_color bar_filled() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__bar_filled, LAYOUT__bar_filled));}
    public void bar_filled(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bar_filled());}
    public void bar_filled(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__bar_filled, LAYOUT__bar_filled.byteSize());}

    public nuklear.nk_style_item cursor_normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__cursor_normal, LAYOUT__cursor_normal));}
    public void cursor_normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_normal());}
    public void cursor_normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_normal, LAYOUT__cursor_normal.byteSize());}

    public nuklear.nk_style_item cursor_hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__cursor_hover, LAYOUT__cursor_hover));}
    public void cursor_hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_hover());}
    public void cursor_hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_hover, LAYOUT__cursor_hover.byteSize());}

    public nuklear.nk_style_item cursor_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__cursor_active, LAYOUT__cursor_active));}
    public void cursor_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_active());}
    public void cursor_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_active, LAYOUT__cursor_active.byteSize());}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public float bar_height() {return this._ptr.get(LAYOUT__bar_height, OFFSET__bar_height);}
    public void bar_height(float value) {this._ptr.set(LAYOUT__bar_height, OFFSET__bar_height, value);}
    public java.lang.foreign.MemorySegment $bar_height() {return this._ptr.asSlice(OFFSET__bar_height, LAYOUT__bar_height);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__spacing, LAYOUT__spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__spacing, LAYOUT__spacing.byteSize());}

    public nuklear.nk_vec2 cursor_size() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__cursor_size, LAYOUT__cursor_size));}
    public void cursor_size(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.cursor_size());}
    public void cursor_size(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_size, LAYOUT__cursor_size.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT__color_factor, OFFSET__color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT__color_factor, OFFSET__color_factor, value);}
    public java.lang.foreign.MemorySegment $color_factor() {return this._ptr.asSlice(OFFSET__color_factor, LAYOUT__color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT__disabled_factor, OFFSET__disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT__disabled_factor, OFFSET__disabled_factor, value);}
    public java.lang.foreign.MemorySegment $disabled_factor() {return this._ptr.asSlice(OFFSET__disabled_factor, LAYOUT__disabled_factor);}

    public int show_buttons() {return this._ptr.get(LAYOUT__show_buttons, OFFSET__show_buttons);}
    public void show_buttons(int value) {this._ptr.set(LAYOUT__show_buttons, OFFSET__show_buttons, value);}
    public java.lang.foreign.MemorySegment $show_buttons() {return this._ptr.asSlice(OFFSET__show_buttons, LAYOUT__show_buttons);}

    public nuklear.nk_style_button inc_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__inc_button, LAYOUT__inc_button));}
    public void inc_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.inc_button());}
    public void inc_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__inc_button, LAYOUT__inc_button.byteSize());}

    public nuklear.nk_style_button dec_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__dec_button, LAYOUT__dec_button));}
    public void dec_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.dec_button());}
    public void dec_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__dec_button, LAYOUT__dec_button.byteSize());}

    public int inc_symbol() {return this._ptr.get(LAYOUT__inc_symbol, OFFSET__inc_symbol);}
    public void inc_symbol(int value) {this._ptr.set(LAYOUT__inc_symbol, OFFSET__inc_symbol, value);}
    public java.lang.foreign.MemorySegment $inc_symbol() {return this._ptr.asSlice(OFFSET__inc_symbol, LAYOUT__inc_symbol);}

    public int dec_symbol() {return this._ptr.get(LAYOUT__dec_symbol, OFFSET__dec_symbol);}
    public void dec_symbol(int value) {this._ptr.set(LAYOUT__dec_symbol, OFFSET__dec_symbol, value);}
    public java.lang.foreign.MemorySegment $dec_symbol() {return this._ptr.asSlice(OFFSET__dec_symbol, LAYOUT__dec_symbol);}

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
