package nuklear;

public record nk_panel(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__type = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 4;
    public static final java.lang.foreign.StructLayout LAYOUT__bounds = nuklear.nk_rect.gRecordLayout;
    public static final long OFFSET__bounds = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__offset_x = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__offset_x = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__offset_y = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__offset_y = 32;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__at_x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__at_x = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__at_y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__at_y = 44;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__max_x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__max_x = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__footer_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__footer_height = 52;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__header_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__header_height = 56;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__border = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__has_scrolling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__has_scrolling = 64;
    public static final java.lang.foreign.StructLayout LAYOUT__clip = nuklear.nk_rect.gRecordLayout;
    public static final long OFFSET__clip = 68;
    public static final java.lang.foreign.StructLayout LAYOUT__menu = nuklear.nk_menu_state.gRecordLayout;
    public static final long OFFSET__menu = 84;
    public static final java.lang.foreign.StructLayout LAYOUT__row = nuklear.nk_row_layout.gRecordLayout;
    public static final long OFFSET__row = 112;
    public static final java.lang.foreign.StructLayout LAYOUT__chart = nuklear.nk_chart.gRecordLayout;
    public static final long OFFSET__chart = 248;
    public static final java.lang.foreign.AddressLayout LAYOUT__buffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__buffer = 448;
    public static final java.lang.foreign.AddressLayout LAYOUT__parent = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__parent = 456;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__type,
            LAYOUT__flags,
            LAYOUT__bounds,
            LAYOUT__offset_x,
            LAYOUT__offset_y,
            LAYOUT__at_x,
            LAYOUT__at_y,
            LAYOUT__max_x,
            LAYOUT__footer_height,
            LAYOUT__header_height,
            LAYOUT__border,
            LAYOUT__has_scrolling,
            LAYOUT__clip,
            LAYOUT__menu,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__row,
            LAYOUT__chart,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__buffer,
            LAYOUT__parent
    ).withByteAlignment(8).withName("nk_panel");

    public nk_panel(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_panel getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_panel(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_panel value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int flags() {return this._ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this._ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this._ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public nuklear.nk_rect bounds() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__bounds, LAYOUT__bounds));}
    public void bounds(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.bounds());}
    public void bounds(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__bounds, LAYOUT__bounds.byteSize());}

    public java.lang.foreign.MemorySegment offset_x() {return this._ptr.get(LAYOUT__offset_x, OFFSET__offset_x);}
    public void offset_x(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__offset_x, OFFSET__offset_x, value);}
    public java.lang.foreign.MemorySegment $offset_x() {return this._ptr.asSlice(OFFSET__offset_x, LAYOUT__offset_x);}

    public java.lang.foreign.MemorySegment offset_y() {return this._ptr.get(LAYOUT__offset_y, OFFSET__offset_y);}
    public void offset_y(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__offset_y, OFFSET__offset_y, value);}
    public java.lang.foreign.MemorySegment $offset_y() {return this._ptr.asSlice(OFFSET__offset_y, LAYOUT__offset_y);}

    public float at_x() {return this._ptr.get(LAYOUT__at_x, OFFSET__at_x);}
    public void at_x(float value) {this._ptr.set(LAYOUT__at_x, OFFSET__at_x, value);}
    public java.lang.foreign.MemorySegment $at_x() {return this._ptr.asSlice(OFFSET__at_x, LAYOUT__at_x);}

    public float at_y() {return this._ptr.get(LAYOUT__at_y, OFFSET__at_y);}
    public void at_y(float value) {this._ptr.set(LAYOUT__at_y, OFFSET__at_y, value);}
    public java.lang.foreign.MemorySegment $at_y() {return this._ptr.asSlice(OFFSET__at_y, LAYOUT__at_y);}

    public float max_x() {return this._ptr.get(LAYOUT__max_x, OFFSET__max_x);}
    public void max_x(float value) {this._ptr.set(LAYOUT__max_x, OFFSET__max_x, value);}
    public java.lang.foreign.MemorySegment $max_x() {return this._ptr.asSlice(OFFSET__max_x, LAYOUT__max_x);}

    public float footer_height() {return this._ptr.get(LAYOUT__footer_height, OFFSET__footer_height);}
    public void footer_height(float value) {this._ptr.set(LAYOUT__footer_height, OFFSET__footer_height, value);}
    public java.lang.foreign.MemorySegment $footer_height() {return this._ptr.asSlice(OFFSET__footer_height, LAYOUT__footer_height);}

    public float header_height() {return this._ptr.get(LAYOUT__header_height, OFFSET__header_height);}
    public void header_height(float value) {this._ptr.set(LAYOUT__header_height, OFFSET__header_height, value);}
    public java.lang.foreign.MemorySegment $header_height() {return this._ptr.asSlice(OFFSET__header_height, LAYOUT__header_height);}

    public float border() {return this._ptr.get(LAYOUT__border, OFFSET__border);}
    public void border(float value) {this._ptr.set(LAYOUT__border, OFFSET__border, value);}
    public java.lang.foreign.MemorySegment $border() {return this._ptr.asSlice(OFFSET__border, LAYOUT__border);}

    public int has_scrolling() {return this._ptr.get(LAYOUT__has_scrolling, OFFSET__has_scrolling);}
    public void has_scrolling(int value) {this._ptr.set(LAYOUT__has_scrolling, OFFSET__has_scrolling, value);}
    public java.lang.foreign.MemorySegment $has_scrolling() {return this._ptr.asSlice(OFFSET__has_scrolling, LAYOUT__has_scrolling);}

    public nuklear.nk_rect clip() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__clip, LAYOUT__clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__clip, LAYOUT__clip.byteSize());}

    public nuklear.nk_menu_state menu() {return new nuklear.nk_menu_state(this._ptr.asSlice(OFFSET__menu, LAYOUT__menu));}
    public void menu(java.util.function.Consumer<nuklear.nk_menu_state> consumer) {consumer.accept(this.menu());}
    public void menu(nuklear.nk_menu_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__menu, LAYOUT__menu.byteSize());}

    public nuklear.nk_row_layout row() {return new nuklear.nk_row_layout(this._ptr.asSlice(OFFSET__row, LAYOUT__row));}
    public void row(java.util.function.Consumer<nuklear.nk_row_layout> consumer) {consumer.accept(this.row());}
    public void row(nuklear.nk_row_layout value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__row, LAYOUT__row.byteSize());}

    public nuklear.nk_chart chart() {return new nuklear.nk_chart(this._ptr.asSlice(OFFSET__chart, LAYOUT__chart));}
    public void chart(java.util.function.Consumer<nuklear.nk_chart> consumer) {consumer.accept(this.chart());}
    public void chart(nuklear.nk_chart value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__chart, LAYOUT__chart.byteSize());}

    public java.lang.foreign.MemorySegment buffer() {return this._ptr.get(LAYOUT__buffer, OFFSET__buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__buffer, OFFSET__buffer, value);}
    public java.lang.foreign.MemorySegment $buffer() {return this._ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}

    public java.lang.foreign.MemorySegment parent() {return this._ptr.get(LAYOUT__parent, OFFSET__parent);}
    public void parent(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__parent, OFFSET__parent, value);}
    public java.lang.foreign.MemorySegment $parent() {return this._ptr.asSlice(OFFSET__parent, LAYOUT__parent);}
}
