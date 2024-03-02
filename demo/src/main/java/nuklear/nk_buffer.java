package nuklear;

public record nk_buffer(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$marker = java.lang.foreign.MemoryLayout.sequenceLayout(2, nuklear.nk_buffer_marker.gStructLayout);
    public static final long OFFSET$marker = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$pool = nuklear.nk_allocator.gStructLayout;
    public static final long OFFSET$pool = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 56L;
    public static final java.lang.foreign.GroupLayout LAYOUT$memory = nuklear.nk_memory.gStructLayout;
    public static final long OFFSET$memory = 64L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$grow_factor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$grow_factor = 80L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$allocated = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$allocated = 88L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$needed = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$needed = 96L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$calls = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$calls = 104L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 112L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$marker,
            LAYOUT$pool,
            LAYOUT$type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$memory,
            LAYOUT$grow_factor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$allocated,
            LAYOUT$needed,
            LAYOUT$calls,
            LAYOUT$size
    ).withName("nk_buffer");

    public nk_buffer(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_buffer getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_buffer(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment marker() {return this._ptr.asSlice(OFFSET$marker, LAYOUT$marker);}
    public nuklear.nk_buffer_marker marker(int i) {return new nuklear.nk_buffer_marker(this._ptr.asSlice(OFFSET$marker + i * LAYOUT$marker.byteSize(), LAYOUT$marker));}
    public void marker(int i, java.util.function.Consumer<nuklear.nk_buffer_marker> consumer) {consumer.accept(this.marker(i));}
    public void marker(int i, nuklear.nk_buffer_marker value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$marker + i * LAYOUT$marker.byteSize(), LAYOUT$marker.byteSize());}

    public nuklear.nk_allocator pool() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET$pool, LAYOUT$pool));}
    public void pool(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.pool());}
    public void pool(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$pool, LAYOUT$pool.byteSize());}

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public nuklear.nk_memory memory() {return new nuklear.nk_memory(this._ptr.asSlice(OFFSET$memory, LAYOUT$memory));}
    public void memory(java.util.function.Consumer<nuklear.nk_memory> consumer) {consumer.accept(this.memory());}
    public void memory(nuklear.nk_memory value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$memory, LAYOUT$memory.byteSize());}

    public float grow_factor() {return this._ptr.get(LAYOUT$grow_factor, OFFSET$grow_factor);}
    public void grow_factor(float value) {this._ptr.set(LAYOUT$grow_factor, OFFSET$grow_factor, value);}
    public java.lang.foreign.MemorySegment grow_factor_ptr() {return this._ptr.asSlice(OFFSET$grow_factor, LAYOUT$grow_factor);}

    public long allocated() {return this._ptr.get(LAYOUT$allocated, OFFSET$allocated);}
    public void allocated(long value) {this._ptr.set(LAYOUT$allocated, OFFSET$allocated, value);}
    public java.lang.foreign.MemorySegment allocated_ptr() {return this._ptr.asSlice(OFFSET$allocated, LAYOUT$allocated);}

    public long needed() {return this._ptr.get(LAYOUT$needed, OFFSET$needed);}
    public void needed(long value) {this._ptr.set(LAYOUT$needed, OFFSET$needed, value);}
    public java.lang.foreign.MemorySegment needed_ptr() {return this._ptr.asSlice(OFFSET$needed, LAYOUT$needed);}

    public long calls() {return this._ptr.get(LAYOUT$calls, OFFSET$calls);}
    public void calls(long value) {this._ptr.set(LAYOUT$calls, OFFSET$calls, value);}
    public java.lang.foreign.MemorySegment calls_ptr() {return this._ptr.asSlice(OFFSET$calls, LAYOUT$calls);}

    public long size() {return this._ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this._ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this._ptr.asSlice(OFFSET$size, LAYOUT$size);}
}
