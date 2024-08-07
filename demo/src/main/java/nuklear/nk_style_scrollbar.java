package nuklear;

public record nk_style_scrollbar(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout.withName("normal");
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout.withName("hover");
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__active = nuklear.nk_style_item.gRecordLayout.withName("active");
    public static final long OFFSET__active = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout.withName("border_color");
    public static final long OFFSET__border_color = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_normal = nuklear.nk_style_item.gRecordLayout.withName("cursor_normal");
    public static final long OFFSET__cursor_normal = 128;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_hover = nuklear.nk_style_item.gRecordLayout.withName("cursor_hover");
    public static final long OFFSET__cursor_hover = 168;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_active = nuklear.nk_style_item.gRecordLayout.withName("cursor_active");
    public static final long OFFSET__cursor_active = 208;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor_border_color = nuklear.nk_color.gRecordLayout.withName("cursor_border_color");
    public static final long OFFSET__cursor_border_color = 248;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("border");
    public static final long OFFSET__border = 252;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("rounding");
    public static final long OFFSET__rounding = 256;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border_cursor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("border_cursor");
    public static final long OFFSET__border_cursor = 260;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding_cursor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("rounding_cursor");
    public static final long OFFSET__rounding_cursor = 264;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout.withName("padding");
    public static final long OFFSET__padding = 268;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("color_factor");
    public static final long OFFSET__color_factor = 276;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("disabled_factor");
    public static final long OFFSET__disabled_factor = 280;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__show_buttons = java.lang.foreign.ValueLayout.JAVA_INT.withName("show_buttons");
    public static final long OFFSET__show_buttons = 284;
    public static final java.lang.foreign.StructLayout LAYOUT__inc_button = nuklear.nk_style_button.gRecordLayout.withName("inc_button");
    public static final long OFFSET__inc_button = 288;
    public static final java.lang.foreign.StructLayout LAYOUT__dec_button = nuklear.nk_style_button.gRecordLayout.withName("dec_button");
    public static final long OFFSET__dec_button = 504;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inc_symbol = java.lang.foreign.ValueLayout.JAVA_INT.withName("inc_symbol");
    public static final long OFFSET__inc_symbol = 720;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dec_symbol = java.lang.foreign.ValueLayout.JAVA_INT.withName("dec_symbol");
    public static final long OFFSET__dec_symbol = 724;
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout.withName("userdata");
    public static final long OFFSET__userdata = 728;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_begin = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("draw_begin");
    public static final long OFFSET__draw_begin = 736;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_end = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("draw_end");
    public static final long OFFSET__draw_end = 744;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__active,
            LAYOUT__border_color,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__cursor_normal,
            LAYOUT__cursor_hover,
            LAYOUT__cursor_active,
            LAYOUT__cursor_border_color,
            LAYOUT__border,
            LAYOUT__rounding,
            LAYOUT__border_cursor,
            LAYOUT__rounding_cursor,
            LAYOUT__padding,
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
    ).withByteAlignment(8).withName("nk_style_scrollbar");

    public nk_style_scrollbar(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_scrollbar getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_scrollbar(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_scrollbar value)
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

    public nuklear.nk_style_item cursor_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__cursor_active, LAYOUT__cursor_active));}
    public void cursor_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_active());}
    public void cursor_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_active, LAYOUT__cursor_active.byteSize());}

    public nuklear.nk_color cursor_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__cursor_border_color, LAYOUT__cursor_border_color));}
    public void cursor_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_border_color());}
    public void cursor_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__cursor_border_color, LAYOUT__cursor_border_color.byteSize());}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public float border_cursor() {return this._ptr.get(LAYOUT__border_cursor, OFFSET__border_cursor);}
    public void border_cursor(float value) {this._ptr.set(LAYOUT__border_cursor, OFFSET__border_cursor, value);}
    public java.lang.foreign.MemorySegment $border_cursor() {return this._ptr.asSlice(OFFSET__border_cursor, LAYOUT__border_cursor);}

    public float rounding_cursor() {return this._ptr.get(LAYOUT__rounding_cursor, OFFSET__rounding_cursor);}
    public void rounding_cursor(float value) {this._ptr.set(LAYOUT__rounding_cursor, OFFSET__rounding_cursor, value);}
    public java.lang.foreign.MemorySegment $rounding_cursor() {return this._ptr.asSlice(OFFSET__rounding_cursor, LAYOUT__rounding_cursor);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

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
