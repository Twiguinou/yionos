package nuklear;

public record nk_edit_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__name = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__name = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__seq = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__seq = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__old = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__old = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__active = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prev = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__prev = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cursor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cursor = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sel_start = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sel_start = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sel_end = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sel_end = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__scrollbar = nuklear.nk_scroll.gRecordLayout;
    public static final long OFFSET__scrollbar = 32;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__mode = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__mode = 40;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__single_line = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__single_line = 41;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__name,
            LAYOUT__seq,
            LAYOUT__old,
            LAYOUT__active,
            LAYOUT__prev,
            LAYOUT__cursor,
            LAYOUT__sel_start,
            LAYOUT__sel_end,
            LAYOUT__scrollbar,
            LAYOUT__mode,
            LAYOUT__single_line,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(4).withName("nk_edit_state");

    public nk_edit_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_edit_state getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_edit_state(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_edit_state value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int name() {return this._ptr.get(LAYOUT__name, OFFSET__name);}
    public void name(int value) {this._ptr.set(LAYOUT__name, OFFSET__name, value);}
    public java.lang.foreign.MemorySegment $name() {return this._ptr.asSlice(OFFSET__name, LAYOUT__name);}

    public int seq() {return this._ptr.get(LAYOUT__seq, OFFSET__seq);}
    public void seq(int value) {this._ptr.set(LAYOUT__seq, OFFSET__seq, value);}
    public java.lang.foreign.MemorySegment $seq() {return this._ptr.asSlice(OFFSET__seq, LAYOUT__seq);}

    public int old() {return this._ptr.get(LAYOUT__old, OFFSET__old);}
    public void old(int value) {this._ptr.set(LAYOUT__old, OFFSET__old, value);}
    public java.lang.foreign.MemorySegment $old() {return this._ptr.asSlice(OFFSET__old, LAYOUT__old);}

    public int active() {return this._ptr.get(LAYOUT__active, OFFSET__active);}
    public void active(int value) {this._ptr.set(LAYOUT__active, OFFSET__active, value);}
    public java.lang.foreign.MemorySegment $active() {return this._ptr.asSlice(OFFSET__active, LAYOUT__active);}

    public int prev() {return this._ptr.get(LAYOUT__prev, OFFSET__prev);}
    public void prev(int value) {this._ptr.set(LAYOUT__prev, OFFSET__prev, value);}
    public java.lang.foreign.MemorySegment $prev() {return this._ptr.asSlice(OFFSET__prev, LAYOUT__prev);}

    public int cursor() {return this._ptr.get(LAYOUT__cursor, OFFSET__cursor);}
    public void cursor(int value) {this._ptr.set(LAYOUT__cursor, OFFSET__cursor, value);}
    public java.lang.foreign.MemorySegment $cursor() {return this._ptr.asSlice(OFFSET__cursor, LAYOUT__cursor);}

    public int sel_start() {return this._ptr.get(LAYOUT__sel_start, OFFSET__sel_start);}
    public void sel_start(int value) {this._ptr.set(LAYOUT__sel_start, OFFSET__sel_start, value);}
    public java.lang.foreign.MemorySegment $sel_start() {return this._ptr.asSlice(OFFSET__sel_start, LAYOUT__sel_start);}

    public int sel_end() {return this._ptr.get(LAYOUT__sel_end, OFFSET__sel_end);}
    public void sel_end(int value) {this._ptr.set(LAYOUT__sel_end, OFFSET__sel_end, value);}
    public java.lang.foreign.MemorySegment $sel_end() {return this._ptr.asSlice(OFFSET__sel_end, LAYOUT__sel_end);}

    public nuklear.nk_scroll scrollbar() {return new nuklear.nk_scroll(this._ptr.asSlice(OFFSET__scrollbar, LAYOUT__scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_scroll> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_scroll value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__scrollbar, LAYOUT__scrollbar.byteSize());}

    public byte mode() {return this._ptr.get(LAYOUT__mode, OFFSET__mode);}
    public void mode(byte value) {this._ptr.set(LAYOUT__mode, OFFSET__mode, value);}
    public java.lang.foreign.MemorySegment $mode() {return this._ptr.asSlice(OFFSET__mode, LAYOUT__mode);}

    public byte single_line() {return this._ptr.get(LAYOUT__single_line, OFFSET__single_line);}
    public void single_line(byte value) {this._ptr.set(LAYOUT__single_line, OFFSET__single_line, value);}
    public java.lang.foreign.MemorySegment $single_line() {return this._ptr.asSlice(OFFSET__single_line, LAYOUT__single_line);}
}
