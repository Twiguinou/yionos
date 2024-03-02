package nuklear;

public record nk_style_window_header(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$normal = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$normal = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$hover = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$hover = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$active = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$active = 80L;
    public static final java.lang.foreign.GroupLayout LAYOUT$close_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$close_button = 120L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minimize_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$minimize_button = 336L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$close_symbol = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$close_symbol = 552L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minimize_symbol = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minimize_symbol = 556L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maximize_symbol = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maximize_symbol = 560L;
    public static final java.lang.foreign.GroupLayout LAYOUT$label_normal = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$label_normal = 564L;
    public static final java.lang.foreign.GroupLayout LAYOUT$label_hover = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$label_hover = 568L;
    public static final java.lang.foreign.GroupLayout LAYOUT$label_active = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$label_active = 572L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$align = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$align = 576L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 580L;
    public static final java.lang.foreign.GroupLayout LAYOUT$label_padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$label_padding = 588L;
    public static final java.lang.foreign.GroupLayout LAYOUT$spacing = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$spacing = 596L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$normal,
            LAYOUT$hover,
            LAYOUT$active,
            LAYOUT$close_button,
            LAYOUT$minimize_button,
            LAYOUT$close_symbol,
            LAYOUT$minimize_symbol,
            LAYOUT$maximize_symbol,
            LAYOUT$label_normal,
            LAYOUT$label_hover,
            LAYOUT$label_active,
            LAYOUT$align,
            LAYOUT$padding,
            LAYOUT$label_padding,
            LAYOUT$spacing,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_style_window_header");

    public nk_style_window_header(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_window_header getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_window_header(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public nuklear.nk_style_button close_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$close_button, LAYOUT$close_button));}
    public void close_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.close_button());}
    public void close_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$close_button, LAYOUT$close_button.byteSize());}

    public nuklear.nk_style_button minimize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$minimize_button, LAYOUT$minimize_button));}
    public void minimize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.minimize_button());}
    public void minimize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$minimize_button, LAYOUT$minimize_button.byteSize());}

    public int close_symbol() {return this._ptr.get(LAYOUT$close_symbol, OFFSET$close_symbol);}
    public void close_symbol(int value) {this._ptr.set(LAYOUT$close_symbol, OFFSET$close_symbol, value);}
    public java.lang.foreign.MemorySegment close_symbol_ptr() {return this._ptr.asSlice(OFFSET$close_symbol, LAYOUT$close_symbol);}

    public int minimize_symbol() {return this._ptr.get(LAYOUT$minimize_symbol, OFFSET$minimize_symbol);}
    public void minimize_symbol(int value) {this._ptr.set(LAYOUT$minimize_symbol, OFFSET$minimize_symbol, value);}
    public java.lang.foreign.MemorySegment minimize_symbol_ptr() {return this._ptr.asSlice(OFFSET$minimize_symbol, LAYOUT$minimize_symbol);}

    public int maximize_symbol() {return this._ptr.get(LAYOUT$maximize_symbol, OFFSET$maximize_symbol);}
    public void maximize_symbol(int value) {this._ptr.set(LAYOUT$maximize_symbol, OFFSET$maximize_symbol, value);}
    public java.lang.foreign.MemorySegment maximize_symbol_ptr() {return this._ptr.asSlice(OFFSET$maximize_symbol, LAYOUT$maximize_symbol);}

    public nuklear.nk_color label_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$label_normal, LAYOUT$label_normal));}
    public void label_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_normal());}
    public void label_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$label_normal, LAYOUT$label_normal.byteSize());}

    public nuklear.nk_color label_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$label_hover, LAYOUT$label_hover));}
    public void label_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_hover());}
    public void label_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$label_hover, LAYOUT$label_hover.byteSize());}

    public nuklear.nk_color label_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$label_active, LAYOUT$label_active));}
    public void label_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_active());}
    public void label_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$label_active, LAYOUT$label_active.byteSize());}

    public int align() {return this._ptr.get(LAYOUT$align, OFFSET$align);}
    public void align(int value) {this._ptr.set(LAYOUT$align, OFFSET$align, value);}
    public java.lang.foreign.MemorySegment align_ptr() {return this._ptr.asSlice(OFFSET$align, LAYOUT$align);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

    public nuklear.nk_vec2 label_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$label_padding, LAYOUT$label_padding));}
    public void label_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.label_padding());}
    public void label_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$label_padding, LAYOUT$label_padding.byteSize());}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$spacing, LAYOUT$spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$spacing, LAYOUT$spacing.byteSize());}
}
