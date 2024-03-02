package nuklear;

public record nk_panel(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 4L;
    public static final java.lang.foreign.GroupLayout LAYOUT$bounds = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$bounds = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$offset_x = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$offset_x = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$offset_y = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$offset_y = 32L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$at_x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$at_x = 40L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$at_y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$at_y = 44L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$max_x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$max_x = 48L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$footer_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$footer_height = 52L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$header_height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$header_height = 56L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$border = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$border = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$has_scrolling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$has_scrolling = 64L;
    public static final java.lang.foreign.GroupLayout LAYOUT$clip = nuklear.nk_rect.gStructLayout;
    public static final long OFFSET$clip = 68L;
    public static final java.lang.foreign.GroupLayout LAYOUT$menu = nuklear.nk_menu_state.gStructLayout;
    public static final long OFFSET$menu = 84L;
    public static final java.lang.foreign.GroupLayout LAYOUT$row = nuklear.nk_row_layout.gStructLayout;
    public static final long OFFSET$row = 112L;
    public static final java.lang.foreign.GroupLayout LAYOUT$chart = nuklear.nk_chart.gStructLayout;
    public static final long OFFSET$chart = 248L;
    public static final java.lang.foreign.AddressLayout LAYOUT$buffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$buffer = 432L;
    public static final java.lang.foreign.AddressLayout LAYOUT$parent = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$parent = 440L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$type,
            LAYOUT$flags,
            LAYOUT$bounds,
            LAYOUT$offset_x,
            LAYOUT$offset_y,
            LAYOUT$at_x,
            LAYOUT$at_y,
            LAYOUT$max_x,
            LAYOUT$footer_height,
            LAYOUT$header_height,
            LAYOUT$border,
            LAYOUT$has_scrolling,
            LAYOUT$clip,
            LAYOUT$menu,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$row,
            LAYOUT$chart,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$buffer,
            LAYOUT$parent
    ).withName("nk_panel");

    public nk_panel(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_panel getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_panel(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public int flags() {return this._ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this._ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this._ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public nuklear.nk_rect bounds() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$bounds, LAYOUT$bounds));}
    public void bounds(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.bounds());}
    public void bounds(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$bounds, LAYOUT$bounds.byteSize());}

    public java.lang.foreign.MemorySegment offset_x() {return this._ptr.get(LAYOUT$offset_x, OFFSET$offset_x);}
    public void offset_x(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$offset_x, OFFSET$offset_x, value);}
    public java.lang.foreign.MemorySegment offset_x_ptr() {return this._ptr.asSlice(OFFSET$offset_x, LAYOUT$offset_x);}

    public java.lang.foreign.MemorySegment offset_y() {return this._ptr.get(LAYOUT$offset_y, OFFSET$offset_y);}
    public void offset_y(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$offset_y, OFFSET$offset_y, value);}
    public java.lang.foreign.MemorySegment offset_y_ptr() {return this._ptr.asSlice(OFFSET$offset_y, LAYOUT$offset_y);}

    public float at_x() {return this._ptr.get(LAYOUT$at_x, OFFSET$at_x);}
    public void at_x(float value) {this._ptr.set(LAYOUT$at_x, OFFSET$at_x, value);}
    public java.lang.foreign.MemorySegment at_x_ptr() {return this._ptr.asSlice(OFFSET$at_x, LAYOUT$at_x);}

    public float at_y() {return this._ptr.get(LAYOUT$at_y, OFFSET$at_y);}
    public void at_y(float value) {this._ptr.set(LAYOUT$at_y, OFFSET$at_y, value);}
    public java.lang.foreign.MemorySegment at_y_ptr() {return this._ptr.asSlice(OFFSET$at_y, LAYOUT$at_y);}

    public float max_x() {return this._ptr.get(LAYOUT$max_x, OFFSET$max_x);}
    public void max_x(float value) {this._ptr.set(LAYOUT$max_x, OFFSET$max_x, value);}
    public java.lang.foreign.MemorySegment max_x_ptr() {return this._ptr.asSlice(OFFSET$max_x, LAYOUT$max_x);}

    public float footer_height() {return this._ptr.get(LAYOUT$footer_height, OFFSET$footer_height);}
    public void footer_height(float value) {this._ptr.set(LAYOUT$footer_height, OFFSET$footer_height, value);}
    public java.lang.foreign.MemorySegment footer_height_ptr() {return this._ptr.asSlice(OFFSET$footer_height, LAYOUT$footer_height);}

    public float header_height() {return this._ptr.get(LAYOUT$header_height, OFFSET$header_height);}
    public void header_height(float value) {this._ptr.set(LAYOUT$header_height, OFFSET$header_height, value);}
    public java.lang.foreign.MemorySegment header_height_ptr() {return this._ptr.asSlice(OFFSET$header_height, LAYOUT$header_height);}

    public float border() {return this._ptr.get(LAYOUT$border, OFFSET$border);}
    public void border(float value) {this._ptr.set(LAYOUT$border, OFFSET$border, value);}
    public java.lang.foreign.MemorySegment border_ptr() {return this._ptr.asSlice(OFFSET$border, LAYOUT$border);}

    public int has_scrolling() {return this._ptr.get(LAYOUT$has_scrolling, OFFSET$has_scrolling);}
    public void has_scrolling(int value) {this._ptr.set(LAYOUT$has_scrolling, OFFSET$has_scrolling, value);}
    public java.lang.foreign.MemorySegment has_scrolling_ptr() {return this._ptr.asSlice(OFFSET$has_scrolling, LAYOUT$has_scrolling);}

    public nuklear.nk_rect clip() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET$clip, LAYOUT$clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$clip, LAYOUT$clip.byteSize());}

    public nuklear.nk_menu_state menu() {return new nuklear.nk_menu_state(this._ptr.asSlice(OFFSET$menu, LAYOUT$menu));}
    public void menu(java.util.function.Consumer<nuklear.nk_menu_state> consumer) {consumer.accept(this.menu());}
    public void menu(nuklear.nk_menu_state value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$menu, LAYOUT$menu.byteSize());}

    public nuklear.nk_row_layout row() {return new nuklear.nk_row_layout(this._ptr.asSlice(OFFSET$row, LAYOUT$row));}
    public void row(java.util.function.Consumer<nuklear.nk_row_layout> consumer) {consumer.accept(this.row());}
    public void row(nuklear.nk_row_layout value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$row, LAYOUT$row.byteSize());}

    public nuklear.nk_chart chart() {return new nuklear.nk_chart(this._ptr.asSlice(OFFSET$chart, LAYOUT$chart));}
    public void chart(java.util.function.Consumer<nuklear.nk_chart> consumer) {consumer.accept(this.chart());}
    public void chart(nuklear.nk_chart value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$chart, LAYOUT$chart.byteSize());}

    public java.lang.foreign.MemorySegment buffer() {return this._ptr.get(LAYOUT$buffer, OFFSET$buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$buffer, OFFSET$buffer, value);}
    public java.lang.foreign.MemorySegment buffer_ptr() {return this._ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}

    public java.lang.foreign.MemorySegment parent() {return this._ptr.get(LAYOUT$parent, OFFSET$parent);}
    public void parent(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$parent, OFFSET$parent, value);}
    public java.lang.foreign.MemorySegment parent_ptr() {return this._ptr.asSlice(OFFSET$parent, LAYOUT$parent);}
}
