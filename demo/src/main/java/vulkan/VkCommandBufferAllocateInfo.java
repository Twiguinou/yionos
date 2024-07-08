package vulkan;

public record VkCommandBufferAllocateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__commandPool = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("commandPool");
    public static final long OFFSET__commandPool = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__level = java.lang.foreign.ValueLayout.JAVA_INT.withName("level");
    public static final long OFFSET__level = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__commandBufferCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("commandBufferCount");
    public static final long OFFSET__commandBufferCount = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__commandPool,
            LAYOUT__level,
            LAYOUT__commandBufferCount
    ).withByteAlignment(8).withName("VkCommandBufferAllocateInfo");

    public VkCommandBufferAllocateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCommandBufferAllocateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCommandBufferAllocateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCommandBufferAllocateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment commandPool() {return this.ptr.get(LAYOUT__commandPool, OFFSET__commandPool);}
    public void commandPool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__commandPool, OFFSET__commandPool, value);}
    public java.lang.foreign.MemorySegment $commandPool() {return this.ptr.asSlice(OFFSET__commandPool, LAYOUT__commandPool);}

    public int level() {return this.ptr.get(LAYOUT__level, OFFSET__level);}
    public void level(int value) {this.ptr.set(LAYOUT__level, OFFSET__level, value);}
    public java.lang.foreign.MemorySegment $level() {return this.ptr.asSlice(OFFSET__level, LAYOUT__level);}

    public int commandBufferCount() {return this.ptr.get(LAYOUT__commandBufferCount, OFFSET__commandBufferCount);}
    public void commandBufferCount(int value) {this.ptr.set(LAYOUT__commandBufferCount, OFFSET__commandBufferCount, value);}
    public java.lang.foreign.MemorySegment $commandBufferCount() {return this.ptr.asSlice(OFFSET__commandBufferCount, LAYOUT__commandBufferCount);}
}
