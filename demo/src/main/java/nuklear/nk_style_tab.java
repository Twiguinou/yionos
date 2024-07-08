package nuklear;

public record nk_style_tab(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__background = nuklear.nk_style_item.gRecordLayout.withName("background");
    public static final long OFFSET__background = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout.withName("border_color");
    public static final long OFFSET__border_color = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__text = nuklear.nk_color.gRecordLayout.withName("text");
    public static final long OFFSET__text = 44;
    public static final java.lang.foreign.StructLayout LAYOUT__tab_maximize_button = nuklear.nk_style_button.gRecordLayout.withName("tab_maximize_button");
    public static final long OFFSET__tab_maximize_button = 48;
    public static final java.lang.foreign.StructLayout LAYOUT__tab_minimize_button = nuklear.nk_style_button.gRecordLayout.withName("tab_minimize_button");
    public static final long OFFSET__tab_minimize_button = 264;
    public static final java.lang.foreign.StructLayout LAYOUT__node_maximize_button = nuklear.nk_style_button.gRecordLayout.withName("node_maximize_button");
    public static final long OFFSET__node_maximize_button = 480;
    public static final java.lang.foreign.StructLayout LAYOUT__node_minimize_button = nuklear.nk_style_button.gRecordLayout.withName("node_minimize_button");
    public static final long OFFSET__node_minimize_button = 696;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sym_minimize = java.lang.foreign.ValueLayout.JAVA_INT.withName("sym_minimize");
    public static final long OFFSET__sym_minimize = 912;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sym_maximize = java.lang.foreign.ValueLayout.JAVA_INT.withName("sym_maximize");
    public static final long OFFSET__sym_maximize = 916;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("border");
    public static final long OFFSET__border = 920;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("rounding");
    public static final long OFFSET__rounding = 924;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__indent = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("indent");
    public static final long OFFSET__indent = 928;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout.withName("padding");
    public static final long OFFSET__padding = 932;
    public static final java.lang.foreign.StructLayout LAYOUT__spacing = nuklear.nk_vec2.gRecordLayout.withName("spacing");
    public static final long OFFSET__spacing = 940;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("color_factor");
    public static final long OFFSET__color_factor = 948;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("disabled_factor");
    public static final long OFFSET__disabled_factor = 952;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__background,
            LAYOUT__border_color,
            LAYOUT__text,
            LAYOUT__tab_maximize_button,
            LAYOUT__tab_minimize_button,
            LAYOUT__node_maximize_button,
            LAYOUT__node_minimize_button,
            LAYOUT__sym_minimize,
            LAYOUT__sym_maximize,
            LAYOUT__border,
            LAYOUT__rounding,
            LAYOUT__indent,
            LAYOUT__padding,
            LAYOUT__spacing,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_style_tab");

    public nk_style_tab(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_tab getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_tab(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_tab value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_style_item background() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__background, LAYOUT__background));}
    public void background(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.background());}
    public void background(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__background, LAYOUT__background.byteSize());}

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__border_color, LAYOUT__border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__border_color, LAYOUT__border_color.byteSize());}

    public nuklear.nk_color text() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__text, LAYOUT__text));}
    public void text(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.text());}
    public void text(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text, LAYOUT__text.byteSize());}

    public nuklear.nk_style_button tab_maximize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__tab_maximize_button, LAYOUT__tab_maximize_button));}
    public void tab_maximize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.tab_maximize_button());}
    public void tab_maximize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__tab_maximize_button, LAYOUT__tab_maximize_button.byteSize());}

    public nuklear.nk_style_button tab_minimize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__tab_minimize_button, LAYOUT__tab_minimize_button));}
    public void tab_minimize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.tab_minimize_button());}
    public void tab_minimize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__tab_minimize_button, LAYOUT__tab_minimize_button.byteSize());}

    public nuklear.nk_style_button node_maximize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__node_maximize_button, LAYOUT__node_maximize_button));}
    public void node_maximize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.node_maximize_button());}
    public void node_maximize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__node_maximize_button, LAYOUT__node_maximize_button.byteSize());}

    public nuklear.nk_style_button node_minimize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__node_minimize_button, LAYOUT__node_minimize_button));}
    public void node_minimize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.node_minimize_button());}
    public void node_minimize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__node_minimize_button, LAYOUT__node_minimize_button.byteSize());}

    public int sym_minimize() {return this._ptr.get(LAYOUT__sym_minimize, OFFSET__sym_minimize);}
    public void sym_minimize(int value) {this._ptr.set(LAYOUT__sym_minimize, OFFSET__sym_minimize, value);}
    public java.lang.foreign.MemorySegment $sym_minimize() {return this._ptr.asSlice(OFFSET__sym_minimize, LAYOUT__sym_minimize);}

    public int sym_maximize() {return this._ptr.get(LAYOUT__sym_maximize, OFFSET__sym_maximize);}
    public void sym_maximize(int value) {this._ptr.set(LAYOUT__sym_maximize, OFFSET__sym_maximize, value);}
    public java.lang.foreign.MemorySegment $sym_maximize() {return this._ptr.asSlice(OFFSET__sym_maximize, LAYOUT__sym_maximize);}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public float indent() {return this._ptr.get(LAYOUT__indent, OFFSET__indent);}
    public void indent(float value) {this._ptr.set(LAYOUT__indent, OFFSET__indent, value);}
    public java.lang.foreign.MemorySegment $indent() {return this._ptr.asSlice(OFFSET__indent, LAYOUT__indent);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__spacing, LAYOUT__spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__spacing, LAYOUT__spacing.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT__color_factor, OFFSET__color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT__color_factor, OFFSET__color_factor, value);}
    public java.lang.foreign.MemorySegment $color_factor() {return this._ptr.asSlice(OFFSET__color_factor, LAYOUT__color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT__disabled_factor, OFFSET__disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT__disabled_factor, OFFSET__disabled_factor, value);}
    public java.lang.foreign.MemorySegment $disabled_factor() {return this._ptr.asSlice(OFFSET__disabled_factor, LAYOUT__disabled_factor);}
}
