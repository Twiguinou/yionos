package nuklear;

public record nk_command_circle_filled(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_command.gRecordLayout;
    public static final long OFFSET__header = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__x = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__x = 16;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__y = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__y = 18;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__w = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__w = 20;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__h = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__h = 22;
    public static final java.lang.foreign.StructLayout LAYOUT__color = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__color = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__w,
            LAYOUT__h,
            LAYOUT__color,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("nk_command_circle_filled");

    public nk_command_circle_filled(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_circle_filled getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_circle_filled(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_circle_filled value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_command header() {return new nuklear.nk_command(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_command> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_command value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}

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

    public nuklear.nk_color color() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__color, LAYOUT__color));}
    public void color(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.color());}
    public void color(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__color, LAYOUT__color.byteSize());}
}
