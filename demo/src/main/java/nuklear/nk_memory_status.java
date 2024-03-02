package nuklear;

public record nk_memory_status(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$memory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$memory = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$allocated = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$allocated = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$needed = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$needed = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$calls = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$calls = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$memory,
            LAYOUT$type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$size,
            LAYOUT$allocated,
            LAYOUT$needed,
            LAYOUT$calls
    ).withName("nk_memory_status");

    public nk_memory_status(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_memory_status getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_memory_status(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment memory() {return this._ptr.get(LAYOUT$memory, OFFSET$memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$memory, OFFSET$memory, value);}
    public java.lang.foreign.MemorySegment memory_ptr() {return this._ptr.asSlice(OFFSET$memory, LAYOUT$memory);}

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public long size() {return this._ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this._ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this._ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public long allocated() {return this._ptr.get(LAYOUT$allocated, OFFSET$allocated);}
    public void allocated(long value) {this._ptr.set(LAYOUT$allocated, OFFSET$allocated, value);}
    public java.lang.foreign.MemorySegment allocated_ptr() {return this._ptr.asSlice(OFFSET$allocated, LAYOUT$allocated);}

    public long needed() {return this._ptr.get(LAYOUT$needed, OFFSET$needed);}
    public void needed(long value) {this._ptr.set(LAYOUT$needed, OFFSET$needed, value);}
    public java.lang.foreign.MemorySegment needed_ptr() {return this._ptr.asSlice(OFFSET$needed, LAYOUT$needed);}

    public long calls() {return this._ptr.get(LAYOUT$calls, OFFSET$calls);}
    public void calls(long value) {this._ptr.set(LAYOUT$calls, OFFSET$calls, value);}
    public java.lang.foreign.MemorySegment calls_ptr() {return this._ptr.asSlice(OFFSET$calls, LAYOUT$calls);}
}
