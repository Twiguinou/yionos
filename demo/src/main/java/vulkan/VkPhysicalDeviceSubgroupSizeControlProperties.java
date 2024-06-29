package vulkan;

public record VkPhysicalDeviceSubgroupSizeControlProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minSubgroupSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxSubgroupSize = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxComputeWorkgroupSubgroups = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxComputeWorkgroupSubgroups = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__requiredSubgroupSizeStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__requiredSubgroupSizeStages = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__minSubgroupSize,
            LAYOUT__maxSubgroupSize,
            LAYOUT__maxComputeWorkgroupSubgroups,
            LAYOUT__requiredSubgroupSizeStages
    ).withByteAlignment(8).withName("VkPhysicalDeviceSubgroupSizeControlProperties");

    public VkPhysicalDeviceSubgroupSizeControlProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceSubgroupSizeControlProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int minSubgroupSize() {return this.ptr.get(LAYOUT__minSubgroupSize, OFFSET__minSubgroupSize);}
    public void minSubgroupSize(int value) {this.ptr.set(LAYOUT__minSubgroupSize, OFFSET__minSubgroupSize, value);}
    public java.lang.foreign.MemorySegment $minSubgroupSize() {return this.ptr.asSlice(OFFSET__minSubgroupSize, LAYOUT__minSubgroupSize);}

    public int maxSubgroupSize() {return this.ptr.get(LAYOUT__maxSubgroupSize, OFFSET__maxSubgroupSize);}
    public void maxSubgroupSize(int value) {this.ptr.set(LAYOUT__maxSubgroupSize, OFFSET__maxSubgroupSize, value);}
    public java.lang.foreign.MemorySegment $maxSubgroupSize() {return this.ptr.asSlice(OFFSET__maxSubgroupSize, LAYOUT__maxSubgroupSize);}

    public int maxComputeWorkgroupSubgroups() {return this.ptr.get(LAYOUT__maxComputeWorkgroupSubgroups, OFFSET__maxComputeWorkgroupSubgroups);}
    public void maxComputeWorkgroupSubgroups(int value) {this.ptr.set(LAYOUT__maxComputeWorkgroupSubgroups, OFFSET__maxComputeWorkgroupSubgroups, value);}
    public java.lang.foreign.MemorySegment $maxComputeWorkgroupSubgroups() {return this.ptr.asSlice(OFFSET__maxComputeWorkgroupSubgroups, LAYOUT__maxComputeWorkgroupSubgroups);}

    public int requiredSubgroupSizeStages() {return this.ptr.get(LAYOUT__requiredSubgroupSizeStages, OFFSET__requiredSubgroupSizeStages);}
    public void requiredSubgroupSizeStages(int value) {this.ptr.set(LAYOUT__requiredSubgroupSizeStages, OFFSET__requiredSubgroupSizeStages, value);}
    public java.lang.foreign.MemorySegment $requiredSubgroupSizeStages() {return this.ptr.asSlice(OFFSET__requiredSubgroupSizeStages, LAYOUT__requiredSubgroupSizeStages);}
}
