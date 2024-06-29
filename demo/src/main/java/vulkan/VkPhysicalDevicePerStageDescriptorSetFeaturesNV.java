package vulkan;

public record VkPhysicalDevicePerStageDescriptorSetFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__perStageDescriptorSet = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__perStageDescriptorSet = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dynamicPipelineLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dynamicPipelineLayout = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__perStageDescriptorSet,
            LAYOUT__dynamicPipelineLayout
    ).withByteAlignment(8).withName("VkPhysicalDevicePerStageDescriptorSetFeaturesNV");

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevicePerStageDescriptorSetFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int perStageDescriptorSet() {return this.ptr.get(LAYOUT__perStageDescriptorSet, OFFSET__perStageDescriptorSet);}
    public void perStageDescriptorSet(int value) {this.ptr.set(LAYOUT__perStageDescriptorSet, OFFSET__perStageDescriptorSet, value);}
    public java.lang.foreign.MemorySegment $perStageDescriptorSet() {return this.ptr.asSlice(OFFSET__perStageDescriptorSet, LAYOUT__perStageDescriptorSet);}

    public int dynamicPipelineLayout() {return this.ptr.get(LAYOUT__dynamicPipelineLayout, OFFSET__dynamicPipelineLayout);}
    public void dynamicPipelineLayout(int value) {this.ptr.set(LAYOUT__dynamicPipelineLayout, OFFSET__dynamicPipelineLayout, value);}
    public java.lang.foreign.MemorySegment $dynamicPipelineLayout() {return this.ptr.asSlice(OFFSET__dynamicPipelineLayout, LAYOUT__dynamicPipelineLayout);}
}
