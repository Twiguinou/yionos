package nuklear;

public record nk_property_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$active = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$active = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prev = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prev = 4L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$buffer = java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$buffer = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$length = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$length = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cursor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cursor = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$select_start = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$select_start = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$select_end = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$select_end = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$name = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$name = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$seq = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$seq = 92L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$old = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$old = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$state = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$state = 100L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$active,
            LAYOUT$prev,
            LAYOUT$buffer,
            LAYOUT$length,
            LAYOUT$cursor,
            LAYOUT$select_start,
            LAYOUT$select_end,
            LAYOUT$name,
            LAYOUT$seq,
            LAYOUT$old,
            LAYOUT$state
    ).withName("nk_property_state");

    public nk_property_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_property_state getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_property_state(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int active() {return this._ptr.get(LAYOUT$active, OFFSET$active);}
    public void active(int value) {this._ptr.set(LAYOUT$active, OFFSET$active, value);}
    public java.lang.foreign.MemorySegment active_ptr() {return this._ptr.asSlice(OFFSET$active, LAYOUT$active);}

    public int prev() {return this._ptr.get(LAYOUT$prev, OFFSET$prev);}
    public void prev(int value) {this._ptr.set(LAYOUT$prev, OFFSET$prev, value);}
    public java.lang.foreign.MemorySegment prev_ptr() {return this._ptr.asSlice(OFFSET$prev, LAYOUT$prev);}

    public java.lang.foreign.MemorySegment buffer() {return this._ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}
    public char buffer(int i) {return (char)this.buffer().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void buffer(int i, char value) {this.buffer().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int length() {return this._ptr.get(LAYOUT$length, OFFSET$length);}
    public void length(int value) {this._ptr.set(LAYOUT$length, OFFSET$length, value);}
    public java.lang.foreign.MemorySegment length_ptr() {return this._ptr.asSlice(OFFSET$length, LAYOUT$length);}

    public int cursor() {return this._ptr.get(LAYOUT$cursor, OFFSET$cursor);}
    public void cursor(int value) {this._ptr.set(LAYOUT$cursor, OFFSET$cursor, value);}
    public java.lang.foreign.MemorySegment cursor_ptr() {return this._ptr.asSlice(OFFSET$cursor, LAYOUT$cursor);}

    public int select_start() {return this._ptr.get(LAYOUT$select_start, OFFSET$select_start);}
    public void select_start(int value) {this._ptr.set(LAYOUT$select_start, OFFSET$select_start, value);}
    public java.lang.foreign.MemorySegment select_start_ptr() {return this._ptr.asSlice(OFFSET$select_start, LAYOUT$select_start);}

    public int select_end() {return this._ptr.get(LAYOUT$select_end, OFFSET$select_end);}
    public void select_end(int value) {this._ptr.set(LAYOUT$select_end, OFFSET$select_end, value);}
    public java.lang.foreign.MemorySegment select_end_ptr() {return this._ptr.asSlice(OFFSET$select_end, LAYOUT$select_end);}

    public int name() {return this._ptr.get(LAYOUT$name, OFFSET$name);}
    public void name(int value) {this._ptr.set(LAYOUT$name, OFFSET$name, value);}
    public java.lang.foreign.MemorySegment name_ptr() {return this._ptr.asSlice(OFFSET$name, LAYOUT$name);}

    public int seq() {return this._ptr.get(LAYOUT$seq, OFFSET$seq);}
    public void seq(int value) {this._ptr.set(LAYOUT$seq, OFFSET$seq, value);}
    public java.lang.foreign.MemorySegment seq_ptr() {return this._ptr.asSlice(OFFSET$seq, LAYOUT$seq);}

    public int old() {return this._ptr.get(LAYOUT$old, OFFSET$old);}
    public void old(int value) {this._ptr.set(LAYOUT$old, OFFSET$old, value);}
    public java.lang.foreign.MemorySegment old_ptr() {return this._ptr.asSlice(OFFSET$old, LAYOUT$old);}

    public int state() {return this._ptr.get(LAYOUT$state, OFFSET$state);}
    public void state(int value) {this._ptr.set(LAYOUT$state, OFFSET$state, value);}
    public java.lang.foreign.MemorySegment state_ptr() {return this._ptr.asSlice(OFFSET$state, LAYOUT$state);}
}
