package nuklear;

public record nk_style_chart(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__background = nuklear.nk_style_item.gRecordLayout.withName("background");
    public static final long OFFSET__background = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout.withName("border_color");
    public static final long OFFSET__border_color = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__selected_color = nuklear.nk_color.gRecordLayout.withName("selected_color");
    public static final long OFFSET__selected_color = 44;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout.withName("color");
    public static final long OFFSET__color = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("border");
    public static final long OFFSET__border = 52;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("rounding");
    public static final long OFFSET__rounding = 56;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout.withName("padding");
    public static final long OFFSET__padding = 60;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("color_factor");
    public static final long OFFSET__color_factor = 68;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("disabled_factor");
    public static final long OFFSET__disabled_factor = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__show_markers = java.lang.foreign.ValueLayout.JAVA_INT.withName("show_markers");
    public static final long OFFSET__show_markers = 76;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__background,
            LAYOUT__border_color,
            LAYOUT__selected_color,
            LAYOUT__color,
            LAYOUT__border,
            LAYOUT__rounding,
            LAYOUT__padding,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            LAYOUT__show_markers
    ).withByteAlignment(8).withName("nk_style_chart");

    public nk_style_chart(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_chart getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_chart(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_chart value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_style_item background() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__background, LAYOUT__background));}
    public void background(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.background());}
    public void background(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__background, LAYOUT__background.byteSize());}

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__border_color, LAYOUT__border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__border_color, LAYOUT__border_color.byteSize());}

    public nuklear.nk_color selected_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__selected_color, LAYOUT__selected_color));}
    public void selected_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.selected_color());}
    public void selected_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__selected_color, LAYOUT__selected_color.byteSize());}

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public float rounding() {return this._ptr.get(LAYOUT__rounding, OFFSET__rounding);}
    public void rounding(float value) {this._ptr.set(LAYOUT__rounding, OFFSET__rounding, value);}
    public java.lang.foreign.MemorySegment $rounding() {return this._ptr.asSlice(OFFSET__rounding, LAYOUT__rounding);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public float color_factor() {return this._ptr.get(LAYOUT__color_factor, OFFSET__color_factor);}
    public void color_factor(float value) {this._ptr.set(LAYOUT__color_factor, OFFSET__color_factor, value);}
    public java.lang.foreign.MemorySegment $color_factor() {return this._ptr.asSlice(OFFSET__color_factor, LAYOUT__color_factor);}

    public float disabled_factor() {return this._ptr.get(LAYOUT__disabled_factor, OFFSET__disabled_factor);}
    public void disabled_factor(float value) {this._ptr.set(LAYOUT__disabled_factor, OFFSET__disabled_factor, value);}
    public java.lang.foreign.MemorySegment $disabled_factor() {return this._ptr.asSlice(OFFSET__disabled_factor, LAYOUT__disabled_factor);}

    public int show_markers() {return this._ptr.get(LAYOUT__show_markers, OFFSET__show_markers);}
    public void show_markers(int value) {this._ptr.set(LAYOUT__show_markers, OFFSET__show_markers, value);}
    public java.lang.foreign.MemorySegment $show_markers() {return this._ptr.asSlice(OFFSET__show_markers, LAYOUT__show_markers);}
}
