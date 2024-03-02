package nuklear;

public record nk_style_button(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$active = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$border_color = 120L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor_background = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor_background = 124L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_background = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_background = 128L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_normal = 132L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_hover = 136L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text_active = 140L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$text_alignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$text_alignment = 144L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor_text = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor_text = 148L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 152L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 156L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 160L;
    public static final java.lang.foreign.GroupLayout LAYOUT$image_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$image_padding = 168L;
    public static final java.lang.foreign.GroupLayout LAYOUT$touch_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$touch_padding = 176L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 184L;
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 192L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_begin = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_begin = 200L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_end = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_end = 208L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$active,
            LAYOUT$border_color,
            LAYOUT$color_factor_background,
            LAYOUT$text_background,
            LAYOUT$text_normal,
            LAYOUT$text_hover,
            LAYOUT$text_active,
            LAYOUT$text_alignment,
            LAYOUT$color_factor_text,
            LAYOUT$border,
            LAYOUT$rounding,
            LAYOUT$padding,
            LAYOUT$image_padding,
            LAYOUT$touch_padding,
            LAYOUT$disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$userdata,
            LAYOUT$draw_begin,
            LAYOUT$draw_end
    ).withName("nk_style_button");

    public nk_style_button(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_button getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_button(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public float color_factor_background() {return this._ptr.get(LAYOUT$color_factor_background, OFFSET$color_factor_background);}
    public void color_factor_background(float value) {this._ptr.set(LAYOUT$color_factor_background, OFFSET$color_factor_background, value);}
    public java.lang.foreign.MemorySegment color_factor_background_ptr() {return this._ptr.asSlice(OFFSET$color_factor_background, LAYOUT$color_factor_background);}

    public nuklear.nk_color text_background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_background, LAYOUT$text_background));}
    public void text_background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_background());}
    public void text_background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_background, LAYOUT$text_background.byteSize());}

    public nuklear.nk_color text_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_normal, LAYOUT$text_normal));}
    public void text_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_normal());}
    public void text_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_normal, LAYOUT$text_normal.byteSize());}

    public nuklear.nk_color text_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_hover, LAYOUT$text_hover));}
    public void text_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_hover());}
    public void text_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_hover, LAYOUT$text_hover.byteSize());}

    public nuklear.nk_color text_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text_active, LAYOUT$text_active));}
    public void text_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text_active());}
    public void text_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_active, LAYOUT$text_active.byteSize());}

    public int text_alignment() {return this._ptr.get(LAYOUT$text_alignment, OFFSET$text_alignment);}
    public void text_alignment(int value) {this._ptr.set(LAYOUT$text_alignment, OFFSET$text_alignment, value);}
    public java.lang.foreign.MemorySegment text_alignment_ptr() {return this._ptr.asSlice(OFFSET$text_alignment, LAYOUT$text_alignment);}

    public float color_factor_text() {return this._ptr.get(LAYOUT$color_factor_text, OFFSET$color_factor_text);}
    public void color_factor_text(float value) {this._ptr.set(LAYOUT$color_factor_text, OFFSET$color_factor_text, value);}
    public java.lang.foreign.MemorySegment color_factor_text_ptr() {return this._ptr.asSlice(OFFSET$color_factor_text, LAYOUT$color_factor_text);}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

    public nuklear.nk_vec2 image_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$image_padding, LAYOUT$image_padding));}
    public void image_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.image_padding());}
    public void image_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$image_padding, LAYOUT$image_padding.byteSize());}

    public nuklear.nk_vec2 touch_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$touch_padding, LAYOUT$touch_padding));}
    public void touch_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.touch_padding());}
    public void touch_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$touch_padding, LAYOUT$touch_padding.byteSize());}

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
