package nuklear;

public record nk_style_selectable(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout.withName("normal");
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout.withName("hover");
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__pressed = nuklear.nk_style_item.gRecordLayout.withName("pressed");
    public static final long OFFSET__pressed = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__normal_active = nuklear.nk_style_item.gRecordLayout.withName("normal_active");
    public static final long OFFSET__normal_active = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__hover_active = nuklear.nk_style_item.gRecordLayout.withName("hover_active");
    public static final long OFFSET__hover_active = 160;
    public static final java.lang.foreign.StructLayout LAYOUT__pressed_active = nuklear.nk_style_item.gRecordLayout.withName("pressed_active");
    public static final long OFFSET__pressed_active = 200;
    public static final java.lang.foreign.StructLayout LAYOUT__text_normal = nuklear.nk_color.gRecordLayout.withName("text_normal");
    public static final long OFFSET__text_normal = 240;
    public static final java.lang.foreign.StructLayout LAYOUT__text_hover = nuklear.nk_color.gRecordLayout.withName("text_hover");
    public static final long OFFSET__text_hover = 244;
    public static final java.lang.foreign.StructLayout LAYOUT__text_pressed = nuklear.nk_color.gRecordLayout.withName("text_pressed");
    public static final long OFFSET__text_pressed = 248;
    public static final java.lang.foreign.StructLayout LAYOUT__text_normal_active = nuklear.nk_color.gRecordLayout.withName("text_normal_active");
    public static final long OFFSET__text_normal_active = 252;
    public static final java.lang.foreign.StructLayout LAYOUT__text_hover_active = nuklear.nk_color.gRecordLayout.withName("text_hover_active");
    public static final long OFFSET__text_hover_active = 256;
    public static final java.lang.foreign.StructLayout LAYOUT__text_pressed_active = nuklear.nk_color.gRecordLayout.withName("text_pressed_active");
    public static final long OFFSET__text_pressed_active = 260;
    public static final java.lang.foreign.StructLayout LAYOUT__text_background = nuklear.nk_color.gRecordLayout.withName("text_background");
    public static final long OFFSET__text_background = 264;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__text_alignment = java.lang.foreign.ValueLayout.JAVA_INT.withName("text_alignment");
    public static final long OFFSET__text_alignment = 268;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("rounding");
    public static final long OFFSET__rounding = 272;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout.withName("padding");
    public static final long OFFSET__padding = 276;
    public static final java.lang.foreign.StructLayout LAYOUT__touch_padding = nuklear.nk_vec2.gRecordLayout.withName("touch_padding");
    public static final long OFFSET__touch_padding = 284;
    public static final java.lang.foreign.StructLayout LAYOUT__image_padding = nuklear.nk_vec2.gRecordLayout.withName("image_padding");
    public static final long OFFSET__image_padding = 292;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("color_factor");
    public static final long OFFSET__color_factor = 300;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("disabled_factor");
    public static final long OFFSET__disabled_factor = 304;
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout.withName("userdata");
    public static final long OFFSET__userdata = 312;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_begin = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("draw_begin");
    public static final long OFFSET__draw_begin = 320;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_end = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("draw_end");
    public static final long OFFSET__draw_end = 328;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__pressed,
            LAYOUT__normal_active,
            LAYOUT__hover_active,
            LAYOUT__pressed_active,
            LAYOUT__text_normal,
            LAYOUT__text_hover,
            LAYOUT__text_pressed,
            LAYOUT__text_normal_active,
            LAYOUT__text_hover_active,
            LAYOUT__text_pressed_active,
            LAYOUT__text_background,
            LAYOUT__text_alignment,
            LAYOUT__rounding,
            LAYOUT__padding,
            LAYOUT__touch_padding,
            LAYOUT__image_padding,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__userdata,
            LAYOUT__draw_begin,
            LAYOUT__draw_end
    ).withByteAlignment(8).withName("nk_style_selectable");

    public nk_style_selectable(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_selectable getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_selectable(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_selectable value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_style_item normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__normal, LAYOUT__normal));}
    public void normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.normal());}
    public void normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__normal, LAYOUT__normal.byteSize());}

    public nuklear.nk_style_item hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__hover, LAYOUT__hover));}
    public void hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.hover());}
    public void hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__hover, LAYOUT__hover.byteSize());}

    public nuklear.nk_style_item pressed() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__pressed, LAYOUT__pressed));}
    public void pressed(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.pressed());}
    public void pressed(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__pressed, LAYOUT__pressed.byteSize());}

    public nuklear.nk_style_item normal_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__normal_active, LAYOUT__normal_active));}
    public void normal_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.normal_active());}
    public void normal_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__normal_active, LAYOUT__normal_active.byteSize());}

    public nuklear.nk_style_item hover_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__hover_active, LAYOUT__hover_active));}
    public void hover_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.hover_active());}
    public void hover_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__hover_active, LAYOUT__hover_active.byteSize());}

    public nuklear.nk_style_item pressed_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__pressed_active, LAYOUT__pressed_active));}
    public void pressed_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.pressed_active());}
    public void pressed_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__pressed_active, LAYOUT__pressed_active.byteSize());}

    public nuklear.nk_color text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_normal, LAYOUT__text_normal));}
    public void text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal());}
    public void text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_normal, LAYOUT__text_normal.byteSize());}

    public nuklear.nk_color text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_hover, LAYOUT__text_hover));}
    public void text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover());}
    public void text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_hover, LAYOUT__text_hover.byteSize());}

    public nuklear.nk_color text_pressed() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_pressed, LAYOUT__text_pressed));}
    public void text_pressed(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_pressed());}
    public void text_pressed(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_pressed, LAYOUT__text_pressed.byteSize());}

    public nuklear.nk_color text_normal_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_normal_active, LAYOUT__text_normal_active));}
    public void text_normal_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal_active());}
    public void text_normal_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_normal_active, LAYOUT__text_normal_active.byteSize());}

    public nuklear.nk_color text_hover_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_hover_active, LAYOUT__text_hover_active));}
    public void text_hover_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover_active());}
    public void text_hover_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_hover_active, LAYOUT__text_hover_active.byteSize());}

    public nuklear.nk_color text_pressed_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_pressed_active, LAYOUT__text_pressed_active));}
    public void text_pressed_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_pressed_active());}
    public void text_pressed_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_pressed_active, LAYOUT__text_pressed_active.byteSize());}

    public nuklear.nk_color text_background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text_background, LAYOUT__text_background));}
    public void text_background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_background());}
    public void text_background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_background, LAYOUT__text_background.byteSize());}

    public int text_alignment() {return this._ptr.get(LAYOUT__text_alignment, OFFSET__text_alignment);}
    public void text_alignment(int value) {this._ptr.set(LAYOUT__text_alignment, OFFSET__text_alignment, value);}
    public java.lang.foreign.MemorySegment $text_alignment() {return this._ptr.asSlice(OFFSET__text_alignment, LAYOUT__text_alignment);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public nuklear.nk_vec2 touch_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__touch_padding, LAYOUT__touch_padding));}
    public void touch_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.touch_padding());}
    public void touch_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__touch_padding, LAYOUT__touch_padding.byteSize());}

    public nuklear.nk_vec2 image_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__image_padding, LAYOUT__image_padding));}
    public void image_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.image_padding());}
    public void image_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__image_padding, LAYOUT__image_padding.byteSize());}

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
