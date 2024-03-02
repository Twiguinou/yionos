package nuklear;

public record nk_command_text(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$header = nuklear.nk_command.gStructLayout;
    public static final long OFFSET$header = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$font = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$font = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$background = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$background = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$foreground = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$foreground = 28L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$x = 32L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$y = 34L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$w = 36L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$h = 38L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$height = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$length = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$length = 44L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$string = java.lang.foreign.MemoryLayout.sequenceLayout(1, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$string = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$header,
            LAYOUT$font,
            LAYOUT$background,
            LAYOUT$foreground,
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$w,
            LAYOUT$h,
            LAYOUT$height,
            LAYOUT$length,
            LAYOUT$string,
            java.lang.foreign.MemoryLayout.paddingLayout(7)
    ).withName("nk_command_text");

    public nk_command_text(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_command_text getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_command_text(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET$header, LAYOUT$header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$header, LAYOUT$header.byteSize());}

    public java.lang.foreign.MemorySegment font() {return this._ptr.get(LAYOUT$font, OFFSET$font);}
    public void font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$font, OFFSET$font, value);}
    public java.lang.foreign.MemorySegment font_ptr() {return this._ptr.asSlice(OFFSET$font, LAYOUT$font);}

    public nuklear.nk_color background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$background, LAYOUT$background));}
    public void background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.background());}
    public void background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$background, LAYOUT$background.byteSize());}

    public nuklear.nk_color foreground() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$foreground, LAYOUT$foreground));}
    public void foreground(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.foreground());}
    public void foreground(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$foreground, LAYOUT$foreground.byteSize());}

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

    public float height() {return this._ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(float value) {this._ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this._ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public int length() {return this._ptr.get(LAYOUT$length, OFFSET$length);}
    public void length(int value) {this._ptr.set(LAYOUT$length, OFFSET$length, value);}
    public java.lang.foreign.MemorySegment length_ptr() {return this._ptr.asSlice(OFFSET$length, LAYOUT$length);}

    public java.lang.foreign.MemorySegment string() {return this._ptr.asSlice(OFFSET$string, LAYOUT$string);}
    public char string(int i) {return (char)this.string().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void string(int i, char value) {this.string().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
