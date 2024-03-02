package nuklear;

public record nk_style_selectable(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$pressed = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$pressed = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$normal_active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal_active = 120L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover_active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover_active = 160L;
    public static final java.lang.foreign.GroupLayout LAYOUT$pressed_active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$pressed_active = 200L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_normal = 240L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_hover = 244L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_pressed = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_pressed = 248L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_normal_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_normal_active = 252L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_hover_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_hover_active = 256L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_pressed_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_pressed_active = 260L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_background = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_background = 264L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$text_alignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$text_alignment = 268L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 272L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 276L;
    public static final java.lang.foreign.GroupLayout LAYOUT$touch_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$touch_padding = 284L;
    public static final java.lang.foreign.GroupLayout LAYOUT$image_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$image_padding = 292L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor = 300L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 304L;
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 312L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_begin = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_begin = 320L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_end = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_end = 328L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$pressed,
            LAYOUT$normal_active,
            LAYOUT$hover_active,
            LAYOUT$pressed_active,
            LAYOUT$text_normal,
            LAYOUT$text_hover,
            LAYOUT$text_pressed,
            LAYOUT$text_normal_active,
            LAYOUT$text_hover_active,
            LAYOUT$text_pressed_active,
            LAYOUT$text_background,
            LAYOUT$text_alignment,
            LAYOUT$rounding,
            LAYOUT$padding,
            LAYOUT$touch_padding,
            LAYOUT$image_padding,
            LAYOUT$color_factor,
            LAYOUT$disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$userdata,
            LAYOUT$draw_begin,
            LAYOUT$draw_end
    ).withName("nk_style_selectable");

    public nk_style_selectable(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_selectable getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_selectable(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_style_item normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$normal, LAYOUT$normal));}
    public void normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.normal());}
    public void normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$normal, LAYOUT$normal.byteSize());}

    public nuklear.nk_style_item hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$hover, LAYOUT$hover));}
    public void hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.hover());}
    public void hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$hover, LAYOUT$hover.byteSize());}

    public nuklear.nk_style_item pressed() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$pressed, LAYOUT$pressed));}
    public void pressed(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.pressed());}
    public void pressed(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$pressed, LAYOUT$pressed.byteSize());}

    public nuklear.nk_style_item normal_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$normal_active, LAYOUT$normal_active));}
    public void normal_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.normal_active());}
    public void normal_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$normal_active, LAYOUT$normal_active.byteSize());}

    public nuklear.nk_style_item hover_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$hover_active, LAYOUT$hover_active));}
    public void hover_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.hover_active());}
    public void hover_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$hover_active, LAYOUT$hover_active.byteSize());}

    public nuklear.nk_style_item pressed_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$pressed_active, LAYOUT$pressed_active));}
    public void pressed_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.pressed_active());}
    public void pressed_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$pressed_active, LAYOUT$pressed_active.byteSize());}

    public nuklear.nk_color text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_normal, LAYOUT$text_normal));}
    public void text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal());}
    public void text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_normal, LAYOUT$text_normal.byteSize());}

    public nuklear.nk_color text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_hover, LAYOUT$text_hover));}
    public void text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover());}
    public void text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_hover, LAYOUT$text_hover.byteSize());}

    public nuklear.nk_color text_pressed() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_pressed, LAYOUT$text_pressed));}
    public void text_pressed(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_pressed());}
    public void text_pressed(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_pressed, LAYOUT$text_pressed.byteSize());}

    public nuklear.nk_color text_normal_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_normal_active, LAYOUT$text_normal_active));}
    public void text_normal_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal_active());}
    public void text_normal_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_normal_active, LAYOUT$text_normal_active.byteSize());}

    public nuklear.nk_color text_hover_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_hover_active, LAYOUT$text_hover_active));}
    public void text_hover_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover_active());}
    public void text_hover_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_hover_active, LAYOUT$text_hover_active.byteSize());}

    public nuklear.nk_color text_pressed_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_pressed_active, LAYOUT$text_pressed_active));}
    public void text_pressed_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_pressed_active());}
    public void text_pressed_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_pressed_active, LAYOUT$text_pressed_active.byteSize());}

    public nuklear.nk_color text_background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_background, LAYOUT$text_background));}
    public void text_background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_background());}
    public void text_background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_background, LAYOUT$text_background.byteSize());}

    public int text_alignment() {return this._ptr.get(LAYOUT$text_alignment, OFFSET$text_alignment);}
    public void text_alignment(int value) {this._ptr.set(LAYOUT$text_alignment, OFFSET$text_alignment, value);}
    public java.lang.foreign.MemorySegment text_alignment_ptr() {return this._ptr.asSlice(OFFSET$text_alignment, LAYOUT$text_alignment);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

    public nuklear.nk_vec2 touch_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$touch_padding, LAYOUT$touch_padding));}
    public void touch_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.touch_padding());}
    public void touch_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$touch_padding, LAYOUT$touch_padding.byteSize());}

    public nuklear.nk_vec2 image_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$image_padding, LAYOUT$image_padding));}
    public void image_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.image_padding());}
    public void image_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$image_padding, LAYOUT$image_padding.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT$color_factor, OFFSET$color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT$color_factor, OFFSET$color_factor, value);}
    public java.lang.foreign.MemorySegment color_factor_ptr() {return this._ptr.asSlice(OFFSET$color_factor, LAYOUT$color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT$disabled_factor, OFFSET$disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT$disabled_factor, OFFSET$disabled_factor, value);}
    public java.lang.foreign.MemorySegment disabled_factor_ptr() {return this._ptr.asSlice(OFFSET$disabled_factor, LAYOUT$disabled_factor);}

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
