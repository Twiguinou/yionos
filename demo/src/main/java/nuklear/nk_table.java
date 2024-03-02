package nuklear;

public record nk_table(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$seq = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$seq = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 4L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$keys = java.lang.foreign.MemoryLayout.sequenceLayout(60, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$keys = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$values = java.lang.foreign.MemoryLayout.sequenceLayout(60, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$values = 248L;
    public static final java.lang.foreign.AddressLayout LAYOUT$next = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$next = 488L;
    public static final java.lang.foreign.AddressLayout LAYOUT$prev = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$prev = 496L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$seq,
            LAYOUT$size,
            LAYOUT$keys,
            LAYOUT$values,
            LAYOUT$next,
            LAYOUT$prev
    ).withName("nk_table");

    public nk_table(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_table getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_table(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int seq() {return this._ptr.get(LAYOUT$seq, OFFSET$seq);}
    public void seq(int value) {this._ptr.set(LAYOUT$seq, OFFSET$seq, value);}
    public java.lang.foreign.MemorySegment seq_ptr() {return this._ptr.asSlice(OFFSET$seq, LAYOUT$seq);}

    public int size() {return this._ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this._ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this._ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment keys() {return this._ptr.asSlice(OFFSET$keys, LAYOUT$keys);}
    public int keys(int i) {return this.keys().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void keys(int i, int value) {this.keys().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public java.lang.foreign.MemorySegment values() {return this._ptr.asSlice(OFFSET$values, LAYOUT$values);}
    public int values(int i) {return this.values().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void values(int i, int value) {this.values().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public java.lang.foreign.MemorySegment next() {return this._ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this._ptr.asSlice(OFFSET$next, LAYOUT$next);}

    public java.lang.foreign.MemorySegment prev() {return this._ptr.get(LAYOUT$prev, OFFSET$prev);}
    public void prev(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$prev, OFFSET$prev, value);}
    public java.lang.foreign.MemorySegment prev_ptr() {return this._ptr.asSlice(OFFSET$prev, LAYOUT$prev);}
}
