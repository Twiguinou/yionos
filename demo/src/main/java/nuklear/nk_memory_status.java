package nuklear;

public record nk_memory_status(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__memory = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("memory");
    public static final long OFFSET__memory = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__allocated = java.lang.foreign.ValueLayout.JAVA_LONG.withName("allocated");
    public static final long OFFSET__allocated = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__needed = java.lang.foreign.ValueLayout.JAVA_LONG.withName("needed");
    public static final long OFFSET__needed = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__calls = java.lang.foreign.ValueLayout.JAVA_LONG.withName("calls");
    public static final long OFFSET__calls = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__memory,
            LAYOUT__type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__size,
            LAYOUT__allocated,
            LAYOUT__needed,
            LAYOUT__calls
    ).withByteAlignment(8).withName("nk_memory_status");

    public nk_memory_status(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_memory_status getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_memory_status(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_memory_status value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment memory() {return this._ptr.get(LAYOUT__memory, OFFSET__memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__memory, OFFSET__memory, value);}
    public java.lang.foreign.MemorySegment $memory() {return this._ptr.asSlice(OFFSET__memory, LAYOUT__memory);}

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public long size() {return this._ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this._ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this._ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public long allocated() {return this._ptr.get(LAYOUT__allocated, OFFSET__allocated);}
    public void allocated(long value) {this._ptr.set(LAYOUT__allocated, OFFSET__allocated, value);}
    public java.lang.foreign.MemorySegment $allocated() {return this._ptr.asSlice(OFFSET__allocated, LAYOUT__allocated);}

    public long needed() {return this._ptr.get(LAYOUT__needed, OFFSET__needed);}
    public void needed(long value) {this._ptr.set(LAYOUT__needed, OFFSET__needed, value);}
    public java.lang.foreign.MemorySegment $needed() {return this._ptr.asSlice(OFFSET__needed, LAYOUT__needed);}

    public long calls() {return this._ptr.get(LAYOUT__calls, OFFSET__calls);}
    public void calls(long value) {this._ptr.set(LAYOUT__calls, OFFSET__calls, value);}
    public java.lang.foreign.MemorySegment $calls() {return this._ptr.asSlice(OFFSET__calls, LAYOUT__calls);}
}
