package nuklear;

public record nk_popup_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__win = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__win = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__type = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__buf = nuklear.nk_popup_buffer.gRecordLayout;
    public static final long OFFSET__buf = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__name = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__name = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__active = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__combo_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__combo_count = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__con_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__con_count = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__con_old = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__con_old = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__active_con = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__active_con = 76;
    public static final java.lang.foreign.StructLayout LAYOUT__header = nuklear.nk_rect.gRecordLayout;
    public static final long OFFSET__header = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__win,
            LAYOUT__type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__buf,
            LAYOUT__name,
            LAYOUT__active,
            LAYOUT__combo_count,
            LAYOUT__con_count,
            LAYOUT__con_old,
            LAYOUT__active_con,
            LAYOUT__header
    ).withByteAlignment(8).withName("nk_popup_state");

    public nk_popup_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_popup_state getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_popup_state(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_popup_state value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment win() {return this._ptr.get(LAYOUT__win, OFFSET__win);}
    public void win(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__win, OFFSET__win, value);}
    public java.lang.foreign.MemorySegment $win() {return this._ptr.asSlice(OFFSET__win, LAYOUT__win);}

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public nuklear.nk_popup_buffer buf() {return new nuklear.nk_popup_buffer(this._ptr.asSlice(OFFSET__buf, LAYOUT__buf));}
    public void buf(java.util.function.Consumer<nuklear.nk_popup_buffer> consumer) {consumer.accept(this.buf());}
    public void buf(nuklear.nk_popup_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__buf, LAYOUT__buf.byteSize());}

    public int name() {return this._ptr.get(LAYOUT__name, OFFSET__name);}
    public void name(int value) {this._ptr.set(LAYOUT__name, OFFSET__name, value);}
    public java.lang.foreign.MemorySegment $name() {return this._ptr.asSlice(OFFSET__name, LAYOUT__name);}

    public int active() {return this._ptr.get(LAYOUT__active, OFFSET__active);}
    public void active(int value) {this._ptr.set(LAYOUT__active, OFFSET__active, value);}
    public java.lang.foreign.MemorySegment $active() {return this._ptr.asSlice(OFFSET__active, LAYOUT__active);}

    public int combo_count() {return this._ptr.get(LAYOUT__combo_count, OFFSET__combo_count);}
    public void combo_count(int value) {this._ptr.set(LAYOUT__combo_count, OFFSET__combo_count, value);}
    public java.lang.foreign.MemorySegment $combo_count() {return this._ptr.asSlice(OFFSET__combo_count, LAYOUT__combo_count);}

    public int con_count() {return this._ptr.get(LAYOUT__con_count, OFFSET__con_count);}
    public void con_count(int value) {this._ptr.set(LAYOUT__con_count, OFFSET__con_count, value);}
    public java.lang.foreign.MemorySegment $con_count() {return this._ptr.asSlice(OFFSET__con_count, LAYOUT__con_count);}

    public int con_old() {return this._ptr.get(LAYOUT__con_old, OFFSET__con_old);}
    public void con_old(int value) {this._ptr.set(LAYOUT__con_old, OFFSET__con_old, value);}
    public java.lang.foreign.MemorySegment $con_old() {return this._ptr.asSlice(OFFSET__con_old, LAYOUT__con_old);}

    public int active_con() {return this._ptr.get(LAYOUT__active_con, OFFSET__active_con);}
    public void active_con(int value) {this._ptr.set(LAYOUT__active_con, OFFSET__active_con, value);}
    public java.lang.foreign.MemorySegment $active_con() {return this._ptr.asSlice(OFFSET__active_con, LAYOUT__active_con);}

    public nuklear.nk_rect header() {return new nuklear.nk_rect(this._ptr.asSlice(OFFSET__header, LAYOUT__header));}
    public void header(java.util.function.Consumer<nuklear.nk_rect> consumer) {consumer.accept(this.header());}
    public void header(nuklear.nk_rect value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__header, LAYOUT__header.byteSize());}
}
