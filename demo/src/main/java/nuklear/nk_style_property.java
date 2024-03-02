package nuklear;

public record nk_style_property(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$active = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$border_color = 120L;
    public static final java.lang.foreign.GroupLayout LAYOUT$label_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$label_normal = 124L;
    public static final java.lang.foreign.GroupLayout LAYOUT$label_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$label_hover = 128L;
    public static final java.lang.foreign.GroupLayout LAYOUT$label_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$label_active = 132L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sym_left = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sym_left = 136L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sym_right = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sym_right = 140L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 144L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 148L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 152L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor = 160L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 164L;
    public static final java.lang.foreign.GroupLayout LAYOUT$edit = nuklear.nk_style_edit.gStructLayout;
    public static final long OFFSET$edit = 168L;
    public static final java.lang.foreign.GroupLayout LAYOUT$inc_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$inc_button = 1136L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dec_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$dec_button = 1352L;
    public static final java.lang.foreign.GroupLayout LAYOUT$userdata = nuklear.nk_handle.gStructLayout;
    public static final long OFFSET$userdata = 1568L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_begin = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_begin = 1576L;
    public static final java.lang.foreign.AddressLayout LAYOUT$draw_end = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$draw_end = 1584L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$active,
            LAYOUT$border_color,
            LAYOUT$label_normal,
            LAYOUT$label_hover,
            LAYOUT$label_active,
            LAYOUT$sym_left,
            LAYOUT$sym_right,
            LAYOUT$border,
            LAYOUT$rounding,
            LAYOUT$padding,
            LAYOUT$color_factor,
            LAYOUT$disabled_factor,
            LAYOUT$edit,
            LAYOUT$inc_button,
            LAYOUT$dec_button,
            LAYOUT$userdata,
            LAYOUT$draw_begin,
            LAYOUT$draw_end
    ).withName("nk_style_property");

    public nk_style_property(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_property getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_property(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public nuklear.nk_color label_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$label_normal, LAYOUT$label_normal));}
    public void label_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_normal());}
    public void label_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$label_normal, LAYOUT$label_normal.byteSize());}

    public nuklear.nk_color label_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$label_hover, LAYOUT$label_hover));}
    public void label_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_hover());}
    public void label_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$label_hover, LAYOUT$label_hover.byteSize());}

    public nuklear.nk_color label_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$label_active, LAYOUT$label_active));}
    public void label_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_active());}
    public void label_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$label_active, LAYOUT$label_active.byteSize());}

    public int sym_left() {return this._ptr.get(LAYOUT$sym_left, OFFSET$sym_left);}
    public void sym_left(int value) {this._ptr.set(LAYOUT$sym_left, OFFSET$sym_left, value);}
    public java.lang.foreign.MemorySegment sym_left_ptr() {return this._ptr.asSlice(OFFSET$sym_left, LAYOUT$sym_left);}

    public int sym_right() {return this._ptr.get(LAYOUT$sym_right, OFFSET$sym_right);}
    public void sym_right(int value) {this._ptr.set(LAYOUT$sym_right, OFFSET$sym_right, value);}
    public java.lang.foreign.MemorySegment sym_right_ptr() {return this._ptr.asSlice(OFFSET$sym_right, LAYOUT$sym_right);}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT$color_factor, OFFSET$color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT$color_factor, OFFSET$color_factor, value);}
    public java.lang.foreign.MemorySegment color_factor_ptr() {return this._ptr.asSlice(OFFSET$color_factor, LAYOUT$color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT$disabled_factor, OFFSET$disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT$disabled_factor, OFFSET$disabled_factor, value);}
    public java.lang.foreign.MemorySegment disabled_factor_ptr() {return this._ptr.asSlice(OFFSET$disabled_factor, LAYOUT$disabled_factor);}

    public nuklear.nk_style_edit edit() {return new nuklear.nk_style_edit(this._ptr.asSlice(OFFSET$edit, LAYOUT$edit));}
    public void edit(java.util.function.Consumer<nuklear.nk_style_edit> consumer) {consumer.accept(this.edit());}
    public void edit(nuklear.nk_style_edit value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$edit, LAYOUT$edit.byteSize());}

    public nuklear.nk_style_button inc_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$inc_button, LAYOUT$inc_button));}
    public void inc_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.inc_button());}
    public void inc_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$inc_button, LAYOUT$inc_button.byteSize());}

    public nuklear.nk_style_button dec_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$dec_button, LAYOUT$dec_button));}
    public void dec_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.dec_button());}
    public void dec_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$dec_button, LAYOUT$dec_button.byteSize());}

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
