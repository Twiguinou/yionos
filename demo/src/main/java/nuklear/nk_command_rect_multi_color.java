package nuklear;

public record nk_command_rect_multi_color(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$x = 16L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$y = 18L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$w = 20L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$h = 22L;
    public static final java.lang.foreign.GroupLayout LAYOUT$left = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$left = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$top = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$top = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$bottom = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$bottom = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$right = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$right = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$left,
            LAYOUT$top,
            LAYOUT$bottom,
            LAYOUT$right
    ).withName("nk_command_rect_multi_color");

    public nk_command_rect_multi_color(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_rect_multi_color getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_rect_multi_color(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public short x() {return this._ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(short value) {this._ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this._ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public short y() {return this._ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(short value) {this._ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this._ptr.asSlice(OFFSET$y, LAYOUT$y);}

    public short w() {return this._ptr.get(LAYOUT$w, OFFSET$w);}
    public void w(short value) {this._ptr.set(LAYOUT$w, OFFSET$w, value);}
    public java.lang.foreign.MemorySegment w_ptr() {return this._ptr.asSlice(OFFSET$w, LAYOUT$w);}

    public short h() {return this._ptr.get(LAYOUT$h, OFFSET$h);}
    public void h(short value) {this._ptr.set(LAYOUT$h, OFFSET$h, value);}
    public java.lang.foreign.MemorySegment h_ptr() {return this._ptr.asSlice(OFFSET$h, LAYOUT$h);}

    public nuklear.nk_color left() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$left, LAYOUT$left));}
    public void left(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.left());}
    public void left(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$left, LAYOUT$left.byteSize());}

    public nuklear.nk_color top() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$top, LAYOUT$top));}
    public void top(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.top());}
    public void top(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$top, LAYOUT$top.byteSize());}

    public nuklear.nk_color bottom() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$bottom, LAYOUT$bottom));}
    public void bottom(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bottom());}
    public void bottom(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$bottom, LAYOUT$bottom.byteSize());}

    public nuklear.nk_color right() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$right, LAYOUT$right));}
    public void right(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.right());}
    public void right(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$right, LAYOUT$right.byteSize());}
}
