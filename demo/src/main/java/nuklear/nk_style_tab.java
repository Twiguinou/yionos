package nuklear;

public record nk_style_tab(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$background = nuklear.nk_style_item.gStructLayout;
    public static final long OFFSET$background = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$border_color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$border_color = 40L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$text = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$tab_maximize_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$tab_maximize_button = 48L;
    public static final java.lang.foreign.GroupLayout LAYOUT$tab_minimize_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$tab_minimize_button = 264L;
    public static final java.lang.foreign.GroupLayout LAYOUT$node_maximize_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$node_maximize_button = 480L;
    public static final java.lang.foreign.GroupLayout LAYOUT$node_minimize_button = nuklear.nk_style_button.gStructLayout;
    public static final long OFFSET$node_minimize_button = 696L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sym_minimize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sym_minimize = 912L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sym_maximize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sym_maximize = 916L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 920L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$rounding = 924L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$indent = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$indent = 928L;
    public static final java.lang.foreign.GroupLayout LAYOUT$padding = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$padding = 932L;
    public static final java.lang.foreign.GroupLayout LAYOUT$spacing = nuklear.nk_vec2.gStructLayout;
    public static final long OFFSET$spacing = 940L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$color_factor = 948L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$disabled_factor = 952L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$background,
            LAYOUT$border_color,
            LAYOUT$text,
            LAYOUT$tab_maximize_button,
            LAYOUT$tab_minimize_button,
            LAYOUT$node_maximize_button,
            LAYOUT$node_minimize_button,
            LAYOUT$sym_minimize,
            LAYOUT$sym_maximize,
            LAYOUT$border,
            LAYOUT$rounding,
            LAYOUT$indent,
            LAYOUT$padding,
            LAYOUT$spacing,
            LAYOUT$color_factor,
            LAYOUT$disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_style_tab");

    public nk_style_tab(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_style_tab getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_style_tab(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_style_item background() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET$background, LAYOUT$background));}
    public void background(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.background());}
    public void background(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$background, LAYOUT$background.byteSize());}

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$border_color, LAYOUT$border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$border_color, LAYOUT$border_color.byteSize());}

    public nuklear.nk_color text() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$text, LAYOUT$text));}
    public void text(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text());}
    public void text(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text, LAYOUT$text.byteSize());}

    public nuklear.nk_style_button tab_maximize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$tab_maximize_button, LAYOUT$tab_maximize_button));}
    public void tab_maximize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.tab_maximize_button());}
    public void tab_maximize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$tab_maximize_button, LAYOUT$tab_maximize_button.byteSize());}

    public nuklear.nk_style_button tab_minimize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$tab_minimize_button, LAYOUT$tab_minimize_button));}
    public void tab_minimize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.tab_minimize_button());}
    public void tab_minimize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$tab_minimize_button, LAYOUT$tab_minimize_button.byteSize());}

    public nuklear.nk_style_button node_maximize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$node_maximize_button, LAYOUT$node_maximize_button));}
    public void node_maximize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.node_maximize_button());}
    public void node_maximize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$node_maximize_button, LAYOUT$node_maximize_button.byteSize());}

    public nuklear.nk_style_button node_minimize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET$node_minimize_button, LAYOUT$node_minimize_button));}
    public void node_minimize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.node_minimize_button());}
    public void node_minimize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$node_minimize_button, LAYOUT$node_minimize_button.byteSize());}

    public int sym_minimize() {return this._ptr.get(LAYOUT$sym_minimize, OFFSET$sym_minimize);}
    public void sym_minimize(int value) {this._ptr.set(LAYOUT$sym_minimize, OFFSET$sym_minimize, value);}
    public java.lang.foreign.MemorySegment sym_minimize_ptr() {return this._ptr.asSlice(OFFSET$sym_minimize, LAYOUT$sym_minimize);}

    public int sym_maximize() {return this._ptr.get(LAYOUT$sym_maximize, OFFSET$sym_maximize);}
    public void sym_maximize(int value) {this._ptr.set(LAYOUT$sym_maximize, OFFSET$sym_maximize, value);}
    public java.lang.foreign.MemorySegment sym_maximize_ptr() {return this._ptr.asSlice(OFFSET$sym_maximize, LAYOUT$sym_maximize);}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public float rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public float indent() {return this._ptr.get(LAYOUT$indent, OFFSET$indent);}
    public void indent(float value) {this._ptr.set(LAYOUT$indent, OFFSET$indent, value);}
    public java.lang.foreign.MemorySegment indent_ptr() {return this._ptr.asSlice(OFFSET$indent, LAYOUT$indent);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET$padding, LAYOUT$padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$padding, LAYOUT$padding.byteSize());}

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
