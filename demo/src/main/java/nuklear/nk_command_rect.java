package nuklear;

public record nk_command_rect(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$rounding = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$rounding = 16L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$line_thickness = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$line_thickness = 18L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$x = 20L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$y = 22L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$w = 24L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$h = 26L;
    public static final java.lang.foreign.GroupLayout LAYOUT$color = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$color = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$rounding,
            LAYOUT$line_thickness,
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$color
    ).withName("nk_command_rect");

    public nk_command_rect(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_rect getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_rect(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public short rounding() {return this._ptr.get(LAYOUT$rounding, OFFSET$rounding);}
    public void rounding(short value) {this._ptr.set(LAYOUT$rounding, OFFSET$rounding, value);}
    public java.lang.foreign.MemorySegment rounding_ptr() {return this._ptr.asSlice(OFFSET$rounding, LAYOUT$rounding);}

    public short line_thickness() {return this._ptr.get(LAYOUT$line_thickness, OFFSET$line_thickness);}
    public void line_thickness(short value) {this._ptr.set(LAYOUT$line_thickness, OFFSET$line_thickness, value);}
    public java.lang.foreign.MemorySegment line_thickness_ptr() {return this._ptr.asSlice(OFFSET$line_thickness, LAYOUT$line_thickness);}

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

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$color, LAYOUT$color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$color, LAYOUT$color.byteSize());}
}
