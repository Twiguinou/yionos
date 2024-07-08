package nuklear;

public record nk_buffer(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__marker = java.lang.foreign.MemoryLayout.sequenceLayout(2, nuklear.nk_buffer_marker.gRecordLayout).withName("marker");
    public static final long OFFSET__marker = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__pool = nuklear.nk_allocator.gRecordLayout.withName("pool");
    public static final long OFFSET__pool = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 56;
    public static final java.lang.foreign.StructLayout LAYOUT__memory = nuklear.nk_memory.gRecordLayout.withName("memory");
    public static final long OFFSET__memory = 64;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__grow_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("grow_factor");
    public static final long OFFSET__grow_factor = 80;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__allocated = java.lang.foreign.ValueLayout.JAVA_LONG.withName("allocated");
    public static final long OFFSET__allocated = 88;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__needed = java.lang.foreign.ValueLayout.JAVA_LONG.withName("needed");
    public static final long OFFSET__needed = 96;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__calls = java.lang.foreign.ValueLayout.JAVA_LONG.withName("calls");
    public static final long OFFSET__calls = 104;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 112;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__marker,
            LAYOUT__pool,
            LAYOUT__type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__memory,
            LAYOUT__grow_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__allocated,
            LAYOUT__needed,
            LAYOUT__calls,
            LAYOUT__size
    ).withByteAlignment(8).withName("nk_buffer");

    public nk_buffer(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_buffer getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_buffer(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_buffer value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment marker() {return this._ptr.asSlice(OFFSET__marker, LAYOUT__marker);}
    public nuklear.nk_buffer_marker marker(int index) {return nuklear.nk_buffer_marker.getAtIndex(this.marker(), index);}
    public void marker(int index, java.util.function.Consumer<nuklear.nk_buffer_marker> consumer) {consumer.accept(this.marker(index));}
    public void marker(int index, nuklear.nk_buffer_marker value) {nuklear.nk_buffer_marker.setAtIndex(this.marker(), index, value);}

    public nuklear.nk_allocator pool() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET__pool, LAYOUT__pool));}
    public void pool(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.pool());}
    public void pool(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__pool, LAYOUT__pool.byteSize());}

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public nuklear.nk_memory memory() {return new nuklear.nk_memory(this._ptr.asSlice(OFFSET__memory, LAYOUT__memory));}
    public void memory(java.util.function.Consumer<nuklear.nk_memory> consumer) {consumer.accept(this.memory());}
    public void memory(nuklear.nk_memory value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__memory, LAYOUT__memory.byteSize());}

    public float grow_factor() {return this._ptr.get(LAYOUT__grow_factor, OFFSET__grow_factor);}
    public void grow_factor(float value) {this._ptr.set(LAYOUT__grow_factor, OFFSET__grow_factor, value);}
    public java.lang.foreign.MemorySegment $grow_factor() {return this._ptr.asSlice(OFFSET__grow_factor, LAYOUT__grow_factor);}

    public long allocated() {return this._ptr.get(LAYOUT__allocated, OFFSET__allocated);}
    public void allocated(long value) {this._ptr.set(LAYOUT__allocated, OFFSET__allocated, value);}
    public java.lang.foreign.MemorySegment $allocated() {return this._ptr.asSlice(OFFSET__allocated, LAYOUT__allocated);}

    public long needed() {return this._ptr.get(LAYOUT__needed, OFFSET__needed);}
    public void needed(long value) {this._ptr.set(LAYOUT__needed, OFFSET__needed, value);}
    public java.lang.foreign.MemorySegment $needed() {return this._ptr.asSlice(OFFSET__needed, LAYOUT__needed);}

    public long calls() {return this._ptr.get(LAYOUT__calls, OFFSET__calls);}
    public void calls(long value) {this._ptr.set(LAYOUT__calls, OFFSET__calls, value);}
    public java.lang.foreign.MemorySegment $calls() {return this._ptr.asSlice(OFFSET__calls, LAYOUT__calls);}

    public long size() {return this._ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this._ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this._ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
