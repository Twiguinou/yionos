package nuklear;

public record nk_edit_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$name = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$name = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$seq = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$seq = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$old = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$old = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$active = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prev = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prev = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cursor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cursor = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sel_start = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sel_start = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sel_end = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sel_end = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$scrollbar = nuklear.nk_scroll.gStructLayout;
    public static final long OFFSET$scrollbar = 32L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$mode = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$mode = 40L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$single_line = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$single_line = 41L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$name,
            LAYOUT$seq,
            LAYOUT$old,
            LAYOUT$active,
            LAYOUT$prev,
            LAYOUT$cursor,
            LAYOUT$sel_start,
            LAYOUT$sel_end,
            LAYOUT$scrollbar,
            LAYOUT$mode,
            LAYOUT$single_line,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withName("nk_edit_state");

    public nk_edit_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_edit_state getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_edit_state(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int name() {return this._ptr.get(LAYOUT$name, OFFSET$name);}
    public void name(int value) {this._ptr.set(LAYOUT$name, OFFSET$name, value);}
    public java.lang.foreign.MemorySegment name_ptr() {return this._ptr.asSlice(OFFSET$name, LAYOUT$name);}

    public int seq() {return this._ptr.get(LAYOUT$seq, OFFSET$seq);}
    public void seq(int value) {this._ptr.set(LAYOUT$seq, OFFSET$seq, value);}
    public java.lang.foreign.MemorySegment seq_ptr() {return this._ptr.asSlice(OFFSET$seq, LAYOUT$seq);}

    public int old() {return this._ptr.get(LAYOUT$old, OFFSET$old);}
    public void old(int value) {this._ptr.set(LAYOUT$old, OFFSET$old, value);}
    public java.lang.foreign.MemorySegment old_ptr() {return this._ptr.asSlice(OFFSET$old, LAYOUT$old);}

    public int active() {return this._ptr.get(LAYOUT$active, OFFSET$active);}
    public void active(int value) {this._ptr.set(LAYOUT$active, OFFSET$active, value);}
    public java.lang.foreign.MemorySegment active_ptr() {return this._ptr.asSlice(OFFSET$active, LAYOUT$active);}

    public int prev() {return this._ptr.get(LAYOUT$prev, OFFSET$prev);}
    public void prev(int value) {this._ptr.set(LAYOUT$prev, OFFSET$prev, value);}
    public java.lang.foreign.MemorySegment prev_ptr() {return this._ptr.asSlice(OFFSET$prev, LAYOUT$prev);}

    public int cursor() {return this._ptr.get(LAYOUT$cursor, OFFSET$cursor);}
    public void cursor(int value) {this._ptr.set(LAYOUT$cursor, OFFSET$cursor, value);}
    public java.lang.foreign.MemorySegment cursor_ptr() {return this._ptr.asSlice(OFFSET$cursor, LAYOUT$cursor);}

    public int sel_start() {return this._ptr.get(LAYOUT$sel_start, OFFSET$sel_start);}
    public void sel_start(int value) {this._ptr.set(LAYOUT$sel_start, OFFSET$sel_start, value);}
    public java.lang.foreign.MemorySegment sel_start_ptr() {return this._ptr.asSlice(OFFSET$sel_start, LAYOUT$sel_start);}

    public int sel_end() {return this._ptr.get(LAYOUT$sel_end, OFFSET$sel_end);}
    public void sel_end(int value) {this._ptr.set(LAYOUT$sel_end, OFFSET$sel_end, value);}
    public java.lang.foreign.MemorySegment sel_end_ptr() {return this._ptr.asSlice(OFFSET$sel_end, LAYOUT$sel_end);}

    public nuklear.nk_scroll scrollbar() {return new nuklear.nk_scroll(this._ptr.asSlice(OFFSET$scrollbar, LAYOUT$scrollbar));}
    public void scrollbar(java.util.function.Consumer<nuklear.nk_scroll> consumer) {consumer.accept(this.scrollbar());}
    public void scrollbar(nuklear.nk_scroll value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$scrollbar, LAYOUT$scrollbar.byteSize());}

    public char mode() {return (char)this._ptr.get(LAYOUT$mode, OFFSET$mode);}
    public void mode(char value) {this._ptr.set(LAYOUT$mode, OFFSET$mode, (byte)value);}
    public java.lang.foreign.MemorySegment mode_ptr() {return this._ptr.asSlice(OFFSET$mode, LAYOUT$mode);}

    public char single_line() {return (char)this._ptr.get(LAYOUT$single_line, OFFSET$single_line);}
    public void single_line(char value) {this._ptr.set(LAYOUT$single_line, OFFSET$single_line, (byte)value);}
    public java.lang.foreign.MemorySegment single_line_ptr() {return this._ptr.asSlice(OFFSET$single_line, LAYOUT$single_line);}
}
