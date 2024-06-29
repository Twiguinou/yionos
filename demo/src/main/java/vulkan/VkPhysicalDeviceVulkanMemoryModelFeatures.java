package vulkan;

public record VkPhysicalDeviceVulkanMemoryModelFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vulkanMemoryModel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vulkanMemoryModel = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vulkanMemoryModelDeviceScope = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vulkanMemoryModelDeviceScope = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vulkanMemoryModelAvailabilityVisibilityChains = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__vulkanMemoryModel,
            LAYOUT__vulkanMemoryModelDeviceScope,
            LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceVulkanMemoryModelFeatures");

    public VkPhysicalDeviceVulkanMemoryModelFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVulkanMemoryModelFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int vulkanMemoryModel() {return this.ptr.get(LAYOUT__vulkanMemoryModel, OFFSET__vulkanMemoryModel);}
    public void vulkanMemoryModel(int value) {this.ptr.set(LAYOUT__vulkanMemoryModel, OFFSET__vulkanMemoryModel, value);}
    public java.lang.foreign.MemorySegment $vulkanMemoryModel() {return this.ptr.asSlice(OFFSET__vulkanMemoryModel, LAYOUT__vulkanMemoryModel);}

    public int vulkanMemoryModelDeviceScope() {return this.ptr.get(LAYOUT__vulkanMemoryModelDeviceScope, OFFSET__vulkanMemoryModelDeviceScope);}
    public void vulkanMemoryModelDeviceScope(int value) {this.ptr.set(LAYOUT__vulkanMemoryModelDeviceScope, OFFSET__vulkanMemoryModelDeviceScope, value);}
    public java.lang.foreign.MemorySegment $vulkanMemoryModelDeviceScope() {return this.ptr.asSlice(OFFSET__vulkanMemoryModelDeviceScope, LAYOUT__vulkanMemoryModelDeviceScope);}

    public int vulkanMemoryModelAvailabilityVisibilityChains() {return this.ptr.get(LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains, OFFSET__vulkanMemoryModelAvailabilityVisibilityChains);}
    public void vulkanMemoryModelAvailabilityVisibilityChains(int value) {this.ptr.set(LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains, OFFSET__vulkanMemoryModelAvailabilityVisibilityChains, value);}
    public java.lang.foreign.MemorySegment $vulkanMemoryModelAvailabilityVisibilityChains() {return this.ptr.asSlice(OFFSET__vulkanMemoryModelAvailabilityVisibilityChains, LAYOUT__vulkanMemoryModelAvailabilityVisibilityChains);}
}
