package nuklear;

public record nk_style_property(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__normal = nuklear.nk_style_item.gRecordLayout.withName("normal");
    public static final long OFFSET__normal = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__hover = nuklear.nk_style_item.gRecordLayout.withName("hover");
    public static final long OFFSET__hover = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__active = nuklear.nk_style_item.gRecordLayout.withName("active");
    public static final long OFFSET__active = 80;
    public static final java.lang.foreign.StructLayout LAYOUT__border_color = nuklear.nk_color.gRecordLayout.withName("border_color");
    public static final long OFFSET__border_color = 120;
    public static final java.lang.foreign.StructLayout LAYOUT__label_normal = nuklear.nk_color.gRecordLayout.withName("label_normal");
    public static final long OFFSET__label_normal = 124;
    public static final java.lang.foreign.StructLayout LAYOUT__label_hover = nuklear.nk_color.gRecordLayout.withName("label_hover");
    public static final long OFFSET__label_hover = 128;
    public static final java.lang.foreign.StructLayout LAYOUT__label_active = nuklear.nk_color.gRecordLayout.withName("label_active");
    public static final long OFFSET__label_active = 132;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sym_left = java.lang.foreign.ValueLayout.JAVA_INT.withName("sym_left");
    public static final long OFFSET__sym_left = 136;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sym_right = java.lang.foreign.ValueLayout.JAVA_INT.withName("sym_right");
    public static final long OFFSET__sym_right = 140;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("border");
    public static final long OFFSET__border = 144;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__rounding = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("rounding");
    public static final long OFFSET__rounding = 148;
    public static final java.lang.foreign.StructLayout LAYOUT__padding = nuklear.nk_vec2.gRecordLayout.withName("padding");
    public static final long OFFSET__padding = 152;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__color_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("color_factor");
    public static final long OFFSET__color_factor = 160;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__disabled_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("disabled_factor");
    public static final long OFFSET__disabled_factor = 164;
    public static final java.lang.foreign.StructLayout LAYOUT__edit = nuklear.nk_style_edit.gRecordLayout.withName("edit");
    public static final long OFFSET__edit = 168;
    public static final java.lang.foreign.StructLayout LAYOUT__inc_button = nuklear.nk_style_button.gRecordLayout.withName("inc_button");
    public static final long OFFSET__inc_button = 1136;
    public static final java.lang.foreign.StructLayout LAYOUT__dec_button = nuklear.nk_style_button.gRecordLayout.withName("dec_button");
    public static final long OFFSET__dec_button = 1352;
    public static final java.lang.foreign.UnionLayout LAYOUT__userdata = nuklear.nk_handle.gRecordLayout.withName("userdata");
    public static final long OFFSET__userdata = 1568;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_begin = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("draw_begin");
    public static final long OFFSET__draw_begin = 1576;
    public static final java.lang.foreign.AddressLayout LAYOUT__draw_end = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("draw_end");
    public static final long OFFSET__draw_end = 1584;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__normal,
            LAYOUT__hover,
            LAYOUT__active,
            LAYOUT__border_color,
            LAYOUT__label_normal,
            LAYOUT__label_hover,
            LAYOUT__label_active,
            LAYOUT__sym_left,
            LAYOUT__sym_right,
            LAYOUT__border,
            LAYOUT__rounding,
            LAYOUT__padding,
            LAYOUT__color_factor,
            LAYOUT__disabled_factor,
            LAYOUT__edit,
            LAYOUT__inc_button,
            LAYOUT__dec_button,
            LAYOUT__userdata,
            LAYOUT__draw_begin,
            LAYOUT__draw_end
    ).withByteAlignment(8).withName("nk_style_property");

    public nk_style_property(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_style_property getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_style_property(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_style_property value)
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

    public nuklear.nk_color border_color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__border_color, LAYOUT__border_color));}
    public void border_color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.border_color());}
    public void border_color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__border_color, LAYOUT__border_color.byteSize());}

    public nuklear.nk_color label_normal() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_normal, LAYOUT__label_normal));}
    public void label_normal(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_normal());}
    public void label_normal(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_normal, LAYOUT__label_normal.byteSize());}

    public nuklear.nk_color label_hover() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_hover, LAYOUT__label_hover));}
    public void label_hover(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_hover());}
    public void label_hover(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_hover, LAYOUT__label_hover.byteSize());}

    public nuklear.nk_color label_active() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__label_active, LAYOUT__label_active));}
    public void label_active(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.label_active());}
    public void label_active(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__label_active, LAYOUT__label_active.byteSize());}

    public int sym_left() {return this._ptr.get(LAYOUT__sym_left, OFFSET__sym_left);}
    public void sym_left(int value) {this._ptr.set(LAYOUT__sym_left, OFFSET__sym_left, value);}
    public java.lang.foreign.MemorySegment $sym_left() {return this._ptr.asSlice(OFFSET__sym_left, LAYOUT__sym_left);}

    public int sym_right() {return this._ptr.get(LAYOUT__sym_right, OFFSET__sym_right);}
    public void sym_right(int value) {this._ptr.set(LAYOUT__sym_right, OFFSET__sym_right, value);}
    public java.lang.foreign.MemorySegment $sym_right() {return this._ptr.asSlice(OFFSET__sym_right, LAYOUT__sym_right);}

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

    public nuklear.nk_style_edit edit() {return new nuklear.nk_style_edit(this._ptr.asSlice(OFFSET__edit, LAYOUT__edit));}
    public void edit(java.util.function.Consumer<nuklear.nk_style_edit> consumer) {consumer.accept(this.edit());}
    public void edit(nuklear.nk_style_edit value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__edit, LAYOUT__edit.byteSize());}

    public nuklear.nk_style_button inc_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__inc_button, LAYOUT__inc_button));}
    public void inc_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.inc_button());}
    public void inc_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__inc_button, LAYOUT__inc_button.byteSize());}

    public nuklear.nk_style_button dec_button() {return new nuklear.nk_style_button(this._ptr.asSlice(OFFSET__dec_button, LAYOUT__dec_button));}
    public void dec_button(java.util.function.Consumer<nuklear.nk_style_button> consumer) {consumer.accept(this.dec_button());}
    public void dec_button(nuklear.nk_style_button value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__dec_button, LAYOUT__dec_button.byteSize());}

    public nuklear.nk_handle userdata() {return new nuklear.nk_handle(this._ptr.asSlice(OFFSET__userdata, LAYOUT__userdata));}
    public void userdata(java.util.function.Consumer<nuklear.nk_handle> consumer) {consumer.accept(this.userdata());}
    public void userdata(nuklear.nk_handle value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__userdata, LAYOUT__userdata.byteSize());}

    public java.lang.foreign.MemorySegment draw_begin() {return this._ptr.get(LAYOUT__draw_begin, OFFSET__draw_begin);}
    public void draw_begin(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__draw_begin, OFFSET__draw_begin, value);}
    public java.lang.foreign.MemorySegment $draw_begin() {return this._ptr.asSlice(OFFSET__draw_begin, LAYOUT__draw_begin);}

    public java.lang.foreign.MemorySegment draw_end() {return this._ptr.get(LAYOUT__draw_end, OFFSET__draw_end);}
    public void draw_end(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__draw_end, OFFSET__draw_end, value);}
    public java.lang.foreign.MemorySegment $draw_end() {return this._ptr.asSlice(OFFSET__draw_end, LAYOUT__draw_end);}
}
