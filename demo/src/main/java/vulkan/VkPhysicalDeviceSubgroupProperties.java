package vulkan;

public record VkPhysicalDeviceSubgroupProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subgroupSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedStages = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedOperations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedOperations = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__quadOperationsInAllStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__quadOperationsInAllStages = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__subgroupSize,
            LAYOUT__supportedStages,
            LAYOUT__supportedOperations,
            LAYOUT__quadOperationsInAllStages
    ).withByteAlignment(8).withName("VkPhysicalDeviceSubgroupProperties");

    public VkPhysicalDeviceSubgroupProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceSubgroupProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceSubgroupProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceSubgroupProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int subgroupSize() {return this.ptr.get(LAYOUT__subgroupSize, OFFSET__subgroupSize);}
    public void subgroupSize(int value) {this.ptr.set(LAYOUT__subgroupSize, OFFSET__subgroupSize, value);}
    public java.lang.foreign.MemorySegment $subgroupSize() {return this.ptr.asSlice(OFFSET__subgroupSize, LAYOUT__subgroupSize);}

    public int supportedStages() {return this.ptr.get(LAYOUT__supportedStages, OFFSET__supportedStages);}
    public void supportedStages(int value) {this.ptr.set(LAYOUT__supportedStages, OFFSET__supportedStages, value);}
    public java.lang.foreign.MemorySegment $supportedStages() {return this.ptr.asSlice(OFFSET__supportedStages, LAYOUT__supportedStages);}

    public int supportedOperations() {return this.ptr.get(LAYOUT__supportedOperations, OFFSET__supportedOperations);}
    public void supportedOperations(int value) {this.ptr.set(LAYOUT__supportedOperations, OFFSET__supportedOperations, value);}
    public java.lang.foreign.MemorySegment $supportedOperations() {return this.ptr.asSlice(OFFSET__supportedOperations, LAYOUT__supportedOperations);}

    public int quadOperationsInAllStages() {return this.ptr.get(LAYOUT__quadOperationsInAllStages, OFFSET__quadOperationsInAllStages);}
    public void quadOperationsInAllStages(int value) {this.ptr.set(LAYOUT__quadOperationsInAllStages, OFFSET__quadOperationsInAllStages, value);}
    public java.lang.foreign.MemorySegment $quadOperationsInAllStages() {return this.ptr.asSlice(OFFSET__quadOperationsInAllStages, LAYOUT__quadOperationsInAllStages);}
}
