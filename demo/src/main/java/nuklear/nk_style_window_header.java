package nuklear;

public record nk_style_window_header(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout.withName("normal");
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout.withName("hover");
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__active = nuklear.nk_style_item.gRecordLayout.withName("active");
    public static final long OFFSET__active = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__close_button = nuklear.nk_style_button.gRecordLayout.withName("close_button");
    public static final long OFFSET__close_button = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__minimize_button = nuklear.nk_style_button.gRecordLayout.withName("minimize_button");
    public static final long OFFSET__minimize_button = 336;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__close_symbol = java.lang.foreign.ValueLayout.JAVA_INT.withName("close_symbol");
    public static final long OFFSET__close_symbol = 552;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minimize_symbol = java.lang.foreign.ValueLayout.JAVA_INT.withName("minimize_symbol");
    public static final long OFFSET__minimize_symbol = 556;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maximize_symbol = java.lang.foreign.ValueLayout.JAVA_INT.withName("maximize_symbol");
    public static final long OFFSET__maximize_symbol = 560;
    public static final java.lang.foreign.StructLayout LAYOUT__label_normal = nuklear.nk_color.gRecordLayout.withName("label_normal");
    public static final long OFFSET__label_normal = 564;
    public static final java.lang.foreign.StructLayout LAYOUT__label_hover = nuklear.nk_color.gRecordLayout.withName("label_hover");
    public static final long OFFSET__label_hover = 568;
    public static final java.lang.foreign.StructLayout LAYOUT__label_active = nuklear.nk_color.gRecordLayout.withName("label_active");
    public static final long OFFSET__label_active = 572;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__align = java.lang.foreign.ValueLayout.JAVA_INT.withName("align");
    public static final long OFFSET__align = 576;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout.withName("padding");
    public static final long OFFSET__padding = 580;
    public static final java.lang.foreign.StructLayout LAYOUT__label_padding = nuklear.nk_vec2.gRecordLayout.withName("label_padding");
    public static final long OFFSET__label_padding = 588;
    public static final java.lang.foreign.StructLayout LAYOUT__spacing = nuklear.nk_vec2.gRecordLayout.withName("spacing");
    public static final long OFFSET__spacing = 596;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__active,
            LAYOUT__close_button,
            LAYOUT__minimize_button,
            LAYOUT__close_symbol,
            LAYOUT__minimize_symbol,
            LAYOUT__maximize_symbol,
            LAYOUT__label_normal,
            LAYOUT__label_hover,
            LAYOUT__label_active,
            LAYOUT__align,
            LAYOUT__padding,
            LAYOUT__label_padding,
            LAYOUT__spacing,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_style_window_header");

    public nk_style_window_header(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_window_header getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_window_header(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_window_header value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_style_item normal() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__normal, LAYOUT__normal));}
    public void normal(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.normal());}
    public void normal(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__normal, LAYOUT__normal.byteSize());}

    public nuklear.nk_style_item hover() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__hover, LAYOUT__hover));}
    public void hover(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.hover());}
    public void hover(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__hover, LAYOUT__hover.byteSize());}

    public nuklear.nk_style_item active() {return new nuklear.nk_style_item(this._ptr.asSlice(OFFSET__active, LAYOUT__active));}
    public void active(java.util.function.Consumer<nuklear.nk_style_item> consumer) {consumer.accept(this.active());}
    public void active(nuklear.nk_style_item value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__active, LAYOUT__active.byteSize());}

    public nuklear.nk_style_button close_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__close_button, LAYOUT__close_button));}
    public void close_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.close_button());}
    public void close_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__close_button, LAYOUT__close_button.byteSize());}

    public nuklear.nk_style_button minimize_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__minimize_button, LAYOUT__minimize_button));}
    public void minimize_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.minimize_button());}
    public void minimize_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__minimize_button, LAYOUT__minimize_button.byteSize());}

    public int close_symbol() {return this._ptr.get(LAYOUT__close_symbol, OFFSET__close_symbol);}
    public void close_symbol(int value) {this._ptr.set(LAYOUT__close_symbol, OFFSET__close_symbol, value);}
    public java.lang.foreign.MemorySegment $close_symbol() {return this._ptr.asSlice(OFFSET__close_symbol, LAYOUT__close_symbol);}

    public int minimize_symbol() {return this._ptr.get(LAYOUT__minimize_symbol, OFFSET__minimize_symbol);}
    public void minimize_symbol(int value) {this._ptr.set(LAYOUT__minimize_symbol, OFFSET__minimize_symbol, value);}
    public java.lang.foreign.MemorySegment $minimize_symbol() {return this._ptr.asSlice(OFFSET__minimize_symbol, LAYOUT__minimize_symbol);}

    public int maximize_symbol() {return this._ptr.get(LAYOUT__maximize_symbol, OFFSET__maximize_symbol);}
    public void maximize_symbol(int value) {this._ptr.set(LAYOUT__maximize_symbol, OFFSET__maximize_symbol, value);}
    public java.lang.foreign.MemorySegment $maximize_symbol() {return this._ptr.asSlice(OFFSET__maximize_symbol, LAYOUT__maximize_symbol);}

    public nuklear.nk_color label_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_normal, LAYOUT__label_normal));}
    public void label_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_normal());}
    public void label_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_normal, LAYOUT__label_normal.byteSize());}

    public nuklear.nk_color label_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_hover, LAYOUT__label_hover));}
    public void label_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_hover());}
    public void label_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_hover, LAYOUT__label_hover.byteSize());}

    public nuklear.nk_color label_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_active, LAYOUT__label_active));}
    public void label_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_active());}
    public void label_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_active, LAYOUT__label_active.byteSize());}

    public int align() {return this._ptr.get(LAYOUT__align, OFFSET__align);}
    public void align(int value) {this._ptr.set(LAYOUT__align, OFFSET__align, value);}
    public java.lang.foreign.MemorySegment $align() {return this._ptr.asSlice(OFFSET__align, LAYOUT__align);}

    public nuklear.nk_vec2 padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__padding, LAYOUT__padding));}
    public void padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.padding());}
    public void padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__padding, LAYOUT__padding.byteSize());}

    public nuklear.nk_vec2 label_padding() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__label_padding, LAYOUT__label_padding));}
    public void label_padding(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.label_padding());}
    public void label_padding(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_padding, LAYOUT__label_padding.byteSize());}

    public nuklear.nk_vec2 spacing() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__spacing, LAYOUT__spacing));}
    public void spacing(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.spacing());}
    public void spacing(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__spacing, LAYOUT__spacing.byteSize());}
}
