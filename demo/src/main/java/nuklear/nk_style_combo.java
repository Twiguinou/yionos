package nuklear;

public record nk_style_combo(java.lang.foreign.MemorySegment _ptr)
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
    public static final java.lang.foreign.GroupLayout LAYOUT$symbol_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$symbol_normal = 136L;
    public static final java.lang.foreign.GroupLayout LAYOUT$symbol_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$symbol_hover = 140L;
    public static final java.lang.foreign.GroupLayout LAYOUT$symbol_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$symbol_active = 144L;
    public static final java.lang.foreign.GroupLayout LAYOUT$button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$button = 152L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sym_normal = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sym_normal = 368L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sym_hover = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sym_hover = 372L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sym_active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sym_active = 376L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 380L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 384L;
    public static final java.lang.foreign.GroupLayout LAYOUT$content_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$content_padding = 388L;
    public static final java.lang.foreign.GroupLayout LAYOUT$button_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$button_padding = 396L;
    public static final java.lang.foreign.GroupLayout LAYOUT$spacing = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$spacing = 404L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor = 412L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 416L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$active,
            LAYOUT$border_color,
            LAYOUT$label_normal,
            LAYOUT$label_hover,
            LAYOUT$label_active,
            LAYOUT$symbol_normal,
            LAYOUT$symbol_hover,
            LAYOUT$symbol_active,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$button,
            LAYOUT$sym_normal,
            LAYOUT$sym_hover,
            LAYOUT$sym_active,
            LAYOUT$border,
            LAYOUT$rounding,
            LAYOUT$content_padding,
            LAYOUT$button_padding,
            LAYOUT$spacing,
            LAYOUT$color_factor,
            LAYOUT$disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_style_combo");

    public nk_style_combo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_combo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_combo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public nuklear.nk_color symbol_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$symbol_normal, LAYOUT$symbol_normal));}
    public void symbol_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.symbol_normal());}
    public void symbol_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$symbol_normal, LAYOUT$symbol_normal.byteSize());}

    public nuklear.nk_color symbol_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$symbol_hover, LAYOUT$symbol_hover));}
    public void symbol_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.symbol_hover());}
    public void symbol_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$symbol_hover, LAYOUT$symbol_hover.byteSize());}

    public nuklear.nk_color symbol_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$symbol_active, LAYOUT$symbol_active));}
    public void symbol_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.symbol_active());}
    public void symbol_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$symbol_active, LAYOUT$symbol_active.byteSize());}

    public nuklear.nk_style_button button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$button, LAYOUT$button));}
    public void button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.button());}
    public void button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$button, LAYOUT$button.byteSize());}

    public int sym_normal() {return this._ptr.get(LAYOUT$sym_normal, OFFSET$sym_normal);}
    public void sym_normal(int value) {this._ptr.set(LAYOUT$sym_normal, OFFSET$sym_normal, value);}
    public java.lang.foreign.MemorySegment sym_normal_ptr() {return this._ptr.asSlice(OFFSET$sym_normal, LAYOUT$sym_normal);}

    public int sym_hover() {return this._ptr.get(LAYOUT$sym_hover, OFFSET$sym_hover);}
    public void sym_hover(int value) {this._ptr.set(LAYOUT$sym_hover, OFFSET$sym_hover, value);}
    public java.lang.foreign.MemorySegment sym_hover_ptr() {return this._ptr.asSlice(OFFSET$sym_hover, LAYOUT$sym_hover);}

    public int sym_active() {return this._ptr.get(LAYOUT$sym_active, OFFSET$sym_active);}
    public void sym_active(int value) {this._ptr.set(LAYOUT$sym_active, OFFSET$sym_active, value);}
    public java.lang.foreign.MemorySegment sym_active_ptr() {return this._ptr.asSlice(OFFSET$sym_active, LAYOUT$sym_active);}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public nuklear.nk_vec2 content_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$content_padding, LAYOUT$content_padding));}
    public void content_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.content_padding());}
    public void content_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$content_padding, LAYOUT$content_padding.byteSize());}

    public nuklear.nk_vec2 button_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$button_padding, LAYOUT$button_padding));}
    public void button_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.button_padding());}
    public void button_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$button_padding, LAYOUT$button_padding.byteSize());}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$spacing, LAYOUT$spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$spacing, LAYOUT$spacing.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT$color_factor, OFFSET$color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT$color_factor, OFFSET$color_factor, value);}
    public java.lang.foreign.MemorySegment color_factor_ptr() {return this._ptr.asSlice(OFFSET$color_factor, LAYOUT$color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT$disabled_factor, OFFSET$disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT$disabled_factor, OFFSET$disabled_factor, value);}
    public java.lang.foreign.MemorySegment disabled_factor_ptr() {return this._ptr.asSlice(OFFSET$disabled_factor, LAYOUT$disabled_factor);}
}
