package nuklear;

public record nk_table(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__seq = java.lang.foreign.ValueLayout.JAVA_INT.withName("seq");
    public static final long OFFSET__seq = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_INT.withName("size");
    public static final long OFFSET__size = 4;
    public static final java.lang.foreign.SequenceLayout LAYOUT__keys = java.lang.foreign.MemoryLayout.sequenceLayout(60, java.lang.foreign.ValueLayout.JAVA_INT).withName("keys");
    public static final long OFFSET__keys = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__values = java.lang.foreign.MemoryLayout.sequenceLayout(60, java.lang.foreign.ValueLayout.JAVA_INT).withName("values");
    public static final long OFFSET__values = 248;
    public static final java.lang.foreign.AddressLayout LAYOUT__next = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("next");
    public static final long OFFSET__next = 488;
    public static final java.lang.foreign.AddressLayout LAYOUT__prev = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("prev");
    public static final long OFFSET__prev = 496;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__seq,
            LAYOUT__size,
            LAYOUT__keys,
            LAYOUT__values,
            LAYOUT__next,
            LAYOUT__prev
    ).withByteAlignment(8).withName("nk_table");

    public nk_table(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_table getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_table(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_table value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int seq() {return this._ptr.get(LAYOUT__seq, OFFSET__seq);}
    public void seq(int value) {this._ptr.set(LAYOUT__seq, OFFSET__seq, value);}
    public java.lang.foreign.MemorySegment $seq() {return this._ptr.asSlice(OFFSET__seq, LAYOUT__seq);}

    public int size() {return this._ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(int value) {this._ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this._ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public java.lang.foreign.MemorySegment keys() {return this._ptr.asSlice(OFFSET__keys, LAYOUT__keys);}
    public int keys(int index) {return this.keys().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void keys(int index, int value) {this.keys().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment values() {return this._ptr.asSlice(OFFSET__values, LAYOUT__values);}
    public int values(int index) {return this.values().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void values(int index, int value) {this.values().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT__next, OFFSET__next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__next, OFFSET__next, value);}
    public java.lang.foreign.MemorySegment $next() {return this._ptr.asSlice(OFFSET__next, LAYOUT__next);}

    public java.lang.foreign.MemorySegment prev() {return this._ptr.get(LAYOUT__prev, OFFSET__prev);}
    public void prev(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__prev, OFFSET__prev, value);}
    public java.lang.foreign.MemorySegment $prev() {return this._ptr.asSlice(OFFSET__prev, LAYOUT__prev);}
}
