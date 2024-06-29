package nuklear;

public record nk_command_rect_multi_color(java.lang.foreign.MemorySegment _ptr)
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
    public static final java.lang.foreign.StructLayout LAYOUT__left = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__left = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__top = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__top = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__bottom = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__bottom = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__right = nuklear.nk_color.gRecordLayout;
    public static final long OFFSET__right = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__header,
            LAYOUT__x,
            LAYOUT__y,
            LAYOUT__w,
            LAYOUT__h,
            LAYOUT__left,
            LAYOUT__top,
            LAYOUT__bottom,
            LAYOUT__right
    ).withByteAlignment(8).withName("nk_command_rect_multi_color");

    public nk_command_rect_multi_color(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_command_rect_multi_color getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_command_rect_multi_color(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_command_rect_multi_color value)
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

    public nuklear.nk_color left() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__left, LAYOUT__left));}
    public void left(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.left());}
    public void left(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__left, LAYOUT__left.byteSize());}

    public nuklear.nk_color top() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__top, LAYOUT__top));}
    public void top(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.top());}
    public void top(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__top, LAYOUT__top.byteSize());}

    public nuklear.nk_color bottom() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__bottom, LAYOUT__bottom));}
    public void bottom(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.bottom());}
    public void bottom(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__bottom, LAYOUT__bottom.byteSize());}

    public nuklear.nk_color right() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET__right, LAYOUT__right));}
    public void right(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.right());}
    public void right(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__right, LAYOUT__right.byteSize());}
}
