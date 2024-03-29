package vulkan;

public record VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$globalPriorityQuery = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$globalPriorityQuery = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$globalPriorityQuery,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR");

    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int globalPriorityQuery() {return this.ptr.get(LAYOUT$globalPriorityQuery, OFFSET$globalPriorityQuery);}
    public void globalPriorityQuery(int value) {this.ptr.set(LAYOUT$globalPriorityQuery, OFFSET$globalPriorityQuery, value);}
    public java.lang.foreign.MemorySegment globalPriorityQuery_ptr() {return this.ptr.asSlice(OFFSET$globalPriorityQuery, LAYOUT$globalPriorityQuery);}
}
