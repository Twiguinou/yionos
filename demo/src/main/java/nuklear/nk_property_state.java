package nuklear;

public record nk_property_state(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__active = java.lang.foreign.ValueLayout.JAVA_INT.withName("active");
    public static final long OFFSET__active = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prev = java.lang.foreign.ValueLayout.JAVA_INT.withName("prev");
    public static final long OFFSET__prev = 4;
    public static final java.lang.foreign.SequenceLayout LAYOUT__buffer = java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("buffer");
    public static final long OFFSET__buffer = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__length = java.lang.foreign.ValueLayout.JAVA_INT.withName("length");
    public static final long OFFSET__length = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cursor = java.lang.foreign.ValueLayout.JAVA_INT.withName("cursor");
    public static final long OFFSET__cursor = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__select_start = java.lang.foreign.ValueLayout.JAVA_INT.withName("select_start");
    public static final long OFFSET__select_start = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__select_end = java.lang.foreign.ValueLayout.JAVA_INT.withName("select_end");
    public static final long OFFSET__select_end = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__name = java.lang.foreign.ValueLayout.JAVA_INT.withName("name");
    public static final long OFFSET__name = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__seq = java.lang.foreign.ValueLayout.JAVA_INT.withName("seq");
    public static final long OFFSET__seq = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__old = java.lang.foreign.ValueLayout.JAVA_INT.withName("old");
    public static final long OFFSET__old = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__state = java.lang.foreign.ValueLayout.JAVA_INT.withName("state");
    public static final long OFFSET__state = 100;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__active,
            LAYOUT__prev,
            LAYOUT__buffer,
            LAYOUT__length,
            LAYOUT__cursor,
            LAYOUT__select_start,
            LAYOUT__select_end,
            LAYOUT__name,
            LAYOUT__seq,
            LAYOUT__old,
            LAYOUT__state
    ).withByteAlignment(4).withName("nk_property_state");

    public nk_property_state(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_property_state getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_property_state(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_property_state value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int active() {return this._ptr.get(LAYOUT__active, OFFSET__active);}
    public void active(int value) {this._ptr.set(LAYOUT__active, OFFSET__active, value);}
    public java.lang.foreign.MemorySegment $active() {return this._ptr.asSlice(OFFSET__active, LAYOUT__active);}

    public int prev() {return this._ptr.get(LAYOUT__prev, OFFSET__prev);}
    public void prev(int value) {this._ptr.set(LAYOUT__prev, OFFSET__prev, value);}
    public java.lang.foreign.MemorySegment $prev() {return this._ptr.asSlice(OFFSET__prev, LAYOUT__prev);}

    public java.lang.foreign.MemorySegment buffer() {return this._ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}
    public byte buffer(int index) {return this.buffer().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void buffer(int index, byte value) {this.buffer().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int length() {return this._ptr.get(LAYOUT__length, OFFSET__length);}
    public void length(int value) {this._ptr.set(LAYOUT__length, OFFSET__length, value);}
    public java.lang.foreign.MemorySegment $length() {return this._ptr.asSlice(OFFSET__length, LAYOUT__length);}

    public int cursor() {return this._ptr.get(LAYOUT__cursor, OFFSET__cursor);}
    public void cursor(int value) {this._ptr.set(LAYOUT__cursor, OFFSET__cursor, value);}
    public java.lang.foreign.MemorySegment $cursor() {return this._ptr.asSlice(OFFSET__cursor, LAYOUT__cursor);}

    public int select_start() {return this._ptr.get(LAYOUT__select_start, OFFSET__select_start);}
    public void select_start(int value) {this._ptr.set(LAYOUT__select_start, OFFSET__select_start, value);}
    public java.lang.foreign.MemorySegment $select_start() {return this._ptr.asSlice(OFFSET__select_start, LAYOUT__select_start);}

    public int select_end() {return this._ptr.get(LAYOUT__select_end, OFFSET__select_end);}
    public void select_end(int value) {this._ptr.set(LAYOUT__select_end, OFFSET__select_end, value);}
    public java.lang.foreign.MemorySegment $select_end() {return this._ptr.asSlice(OFFSET__select_end, LAYOUT__select_end);}

    public int name() {return this._ptr.get(LAYOUT__name, OFFSET__name);}
    public void name(int value) {this._ptr.set(LAYOUT__name, OFFSET__name, value);}
    public java.lang.foreign.MemorySegment $name() {return this._ptr.asSlice(OFFSET__name, LAYOUT__name);}

    public int seq() {return this._ptr.get(LAYOUT__seq, OFFSET__seq);}
    public void seq(int value) {this._ptr.set(LAYOUT__seq, OFFSET__seq, value);}
    public java.lang.foreign.MemorySegment $seq() {return this._ptr.asSlice(OFFSET__seq, LAYOUT__seq);}

    public int old() {return this._ptr.get(LAYOUT__old, OFFSET__old);}
    public void old(int value) {this._ptr.set(LAYOUT__old, OFFSET__old, value);}
    public java.lang.foreign.MemorySegment $old() {return this._ptr.asSlice(OFFSET__old, LAYOUT__old);}

    public int state() {return this._ptr.get(LAYOUT__state, OFFSET__state);}
    public void state(int value) {this._ptr.set(LAYOUT__state, OFFSET__state, value);}
    public java.lang.foreign.MemorySegment $state() {return this._ptr.asSlice(OFFSET__state, LAYOUT__state);}
}
