package nuklear;

public record nk_command_image(java.lang.foreign.MemorySegment _ptr)
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
    public static final java.lang.foreign.GroupLayout LAYOUT$img = nuklear.nk_image.gStructLayout;
    public static final long OFFSET$img = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$col = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$col = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$img,
            LAYOUT$col,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_command_image");

    public nk_command_image(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_image getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_image(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public nuklear.nk_image img() {return new nuklear.nk_image(this._ptr.asSlice(OFFSET$img, LAYOUT$img));}
    public void img(java.util.function.Consumer<nuklear.nk_image> consumer) {consumer.accept(this.img());}
    public void img(nuklear.nk_image value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$img, LAYOUT$img.byteSize());}

    public nuklear.nk_color col() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$col, LAYOUT$col));}
    public void col(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.col());}
    public void col(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$col, LAYOUT$col.byteSize());}
}
