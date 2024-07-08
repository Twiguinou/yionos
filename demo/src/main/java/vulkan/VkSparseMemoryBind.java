package vulkan;

public record VkSparseMemoryBind(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__resourceOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("resourceOffset");
    public static final long OFFSET__resourceOffset = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__memory = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("memory");
    public static final long OFFSET__memory = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__memoryOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("memoryOffset");
    public static final long OFFSET__memoryOffset = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__resourceOffset,
            LAYOUT__size,
            LAYOUT__memory,
            LAYOUT__memoryOffset,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSparseMemoryBind");

    public VkSparseMemoryBind(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSparseMemoryBind getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSparseMemoryBind(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSparseMemoryBind value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long resourceOffset() {return this.ptr.get(LAYOUT__resourceOffset, OFFSET__resourceOffset);}
    public void resourceOffset(long value) {this.ptr.set(LAYOUT__resourceOffset, OFFSET__resourceOffset, value);}
    public java.lang.foreign.MemorySegment $resourceOffset() {return this.ptr.asSlice(OFFSET__resourceOffset, LAYOUT__resourceOffset);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT__memory, OFFSET__memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__memory, OFFSET__memory, value);}
    public java.lang.foreign.MemorySegment $memory() {return this.ptr.asSlice(OFFSET__memory, LAYOUT__memory);}

    public long memoryOffset() {return this.ptr.get(LAYOUT__memoryOffset, OFFSET__memoryOffset);}
    public void memoryOffset(long value) {this.ptr.set(LAYOUT__memoryOffset, OFFSET__memoryOffset, value);}
    public java.lang.foreign.MemorySegment $memoryOffset() {return this.ptr.asSlice(OFFSET__memoryOffset, LAYOUT__memoryOffset);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}
}
