package nuklear;

public record nk_style_progress(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$active = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$border_color = 120L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$cursor_normal = 128L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$cursor_hover = 168L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$cursor_active = 208L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor_border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$cursor_border_color = 248L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 252L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 256L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$cursor_border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$cursor_border = 260L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$cursor_rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$cursor_rounding = 264L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 268L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor = 276L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 280L;
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 288L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_begin = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_begin = 296L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_end = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_end = 304L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$active,
            LAYOUT$border_color,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$cursor_normal,
            LAYOUT$cursor_hover,
            LAYOUT$cursor_active,
            LAYOUT$cursor_border_color,
            LAYOUT$rounding,
            LAYOUT$border,
            LAYOUT$cursor_border,
            LAYOUT$cursor_rounding,
            LAYOUT$padding,
            LAYOUT$color_factor,
            LAYOUT$disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$userdata,
            LAYOUT$draw_begin,
            LAYOUT$draw_end
    ).withName("nk_style_progress");

    public nk_style_progress(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_progress getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_progress(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public nuklear.nk_style_item cursor_normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$cursor_normal, LAYOUT$cursor_normal));}
    public void cursor_normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_normal());}
    public void cursor_normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_normal, LAYOUT$cursor_normal.byteSize());}

    public nuklear.nk_style_item cursor_hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$cursor_hover, LAYOUT$cursor_hover));}
    public void cursor_hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_hover());}
    public void cursor_hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_hover, LAYOUT$cursor_hover.byteSize());}

    public nuklear.nk_style_item cursor_active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$cursor_active, LAYOUT$cursor_active));}
    public void cursor_active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.cursor_active());}
    public void cursor_active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_active, LAYOUT$cursor_active.byteSize());}

    public nuklear.nk_color cursor_border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$cursor_border_color, LAYOUT$cursor_border_color));}
    public void cursor_border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.cursor_border_color());}
    public void cursor_border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$cursor_border_color, LAYOUT$cursor_border_color.byteSize());}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float cursor_border() {return this._ptr.get(LAYOUT$cursor_border, OFFSET$cursor_border);}
    public void cursor_border(float value) {this._ptr.set(LAYOUT$cursor_border, OFFSET$cursor_border, value);}
    public java.lang.foreign.MemorySegment cursor_border_ptr() {return this._ptr.asSlice(OFFSET$cursor_border, LAYOUT$cursor_border);}

    public float cursor_rounding() {return this._ptr.get(LAYOUT$cursor_rounding, OFFSET$cursor_rounding);}
    public void cursor_rounding(float value) {this._ptr.set(LAYOUT$cursor_rounding, OFFSET$cursor_rounding, value);}
    public java.lang.foreign.MemorySegment cursor_rounding_ptr() {return this._ptr.asSlice(OFFSET$cursor_rounding, LAYOUT$cursor_rounding);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

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
