package nuklear;

public record nk_command_text(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_command.gRecordLayout;
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__font = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__font = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__background = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__background = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__foreground = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__foreground = 28;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__x = 32;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__y = 34;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__w = 36;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__h = 38;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__height = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__length = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__length = 44;
    public static final java.lang.foreign.SequenceLayout LAYOUT__string = java.lang.foreign.MemoryLayout.sequenceLayout(1, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__string = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__font,
            LAYOUT__background,
            LAYOUT__foreground,
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__w,
            LAYOUT__h,
            LAYOUT__height,
            LAYOUT__length,
            LAYOUT__string,
            java.lang.foreign.MemoryLayout.paddingLayout(7)
    ).withByteAlignment(8).withName("nk_command_text");

    public nk_command_text(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_text getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_text(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_text value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

    public java.lang.foreign.MemorySegment font() {return this._ptr.get(LAYOUT__font, OFFSET__font);}
    public void font(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__font, OFFSET__font, value);}
    public java.lang.foreign.MemorySegment $font() {return this._ptr.asSlice(OFFSET__font, LAYOUT__font);}

    public nuklear.nk_color background() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__background, LAYOUT__background));}
    public void background(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.background());}
    public void background(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__background, LAYOUT__background.byteSize());}

    public nuklear.nk_color foreground() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__foreground, LAYOUT__foreground));}
    public void foreground(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.foreground());}
    public void foreground(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__foreground, LAYOUT__foreground.byteSize());}

    public short x() {return this._ptr.get(LAYOUT__x, OFFSET__x);}
    public void x(short value) {this._ptr.set(LAYOUT__x, OFFSET__x, value);}
    public java.lang.foreign.MemorySegment $x() {return this._ptr.asSlice(OFFSET__x, LAYOUT__x);}

    public short y() {return this._ptr.get(LAYOUT__y, OFFSET__y);}
    public void y(short value) {this._ptr.set(LAYOUT__y, OFFSET__y, value);}
    public java.lang.foreign.MemorySegment $y() {return this._ptr.asSlice(OFFSET__y, LAYOUT__y);}

    public short w() {return this._ptr.get(LAYOUT__w, OFFSET__w);}
    public void w(short value) {this._ptr.set(LAYOUT__w, OFFSET__w, value);}
    public java.lang.foreign.MemorySegment $w() {return this._ptr.asSlice(OFFSET__w, LAYOUT__w);}

    public short h() {return this._ptr.get(LAYOUT__h, OFFSET__h);}
    public void h(short value) {this._ptr.set(LAYOUT__h, OFFSET__h, value);}
    public java.lang.foreign.MemorySegment $h() {return this._ptr.asSlice(OFFSET__h, LAYOUT__h);}

    public float height() {return this._ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(float value) {this._ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this._ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public int length() {return this._ptr.get(LAYOUT__length, OFFSET__length);}
    public void length(int value) {this._ptr.set(LAYOUT__length, OFFSET__length, value);}
    public java.lang.foreign.MemorySegment $length() {return this._ptr.asSlice(OFFSET__length, LAYOUT__length);}

    public java.lang.foreign.MemorySegment string() {return this._ptr.asSlice(OFFSET__string, LAYOUT__string);}
    public byte string(int index) {return this.string().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void string(int index, byte value) {this.string().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
