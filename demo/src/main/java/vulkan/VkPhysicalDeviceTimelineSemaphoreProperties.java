package vulkan;

public record VkPhysicalDeviceTimelineSemaphoreProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxTimelineSemaphoreValueDifference = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxTimelineSemaphoreValueDifference = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxTimelineSemaphoreValueDifference
    ).withByteAlignment(8).withName("VkPhysicalDeviceTimelineSemaphoreProperties");

    public VkPhysicalDeviceTimelineSemaphoreProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceTimelineSemaphoreProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceTimelineSemaphoreProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceTimelineSemaphoreProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long maxTimelineSemaphoreValueDifference() {return this.ptr.get(LAYOUT__maxTimelineSemaphoreValueDifference, OFFSET__maxTimelineSemaphoreValueDifference);}
    public void maxTimelineSemaphoreValueDifference(long value) {this.ptr.set(LAYOUT__maxTimelineSemaphoreValueDifference, OFFSET__maxTimelineSemaphoreValueDifference, value);}
    public java.lang.foreign.MemorySegment $maxTimelineSemaphoreValueDifference() {return this.ptr.asSlice(OFFSET__maxTimelineSemaphoreValueDifference, LAYOUT__maxTimelineSemaphoreValueDifference);}
}
