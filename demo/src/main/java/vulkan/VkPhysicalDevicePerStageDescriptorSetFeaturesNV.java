package vulkan;

public record VkPhysicalDevicePerStageDescriptorSetFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$perStageDescriptorSet = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$perStageDescriptorSet = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dynamicPipelineLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dynamicPipelineLayout = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$perStageDescriptorSet,
            LAYOUT$dynamicPipelineLayout
    ).withName("VkPhysicalDevicePerStageDescriptorSetFeaturesNV");

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int perStageDescriptorSet() {return this.ptr.get(LAYOUT$perStageDescriptorSet, OFFSET$perStageDescriptorSet);}
    public void perStageDescriptorSet(int value) {this.ptr.set(LAYOUT$perStageDescriptorSet, OFFSET$perStageDescriptorSet, value);}
    public java.lang.foreign.MemorySegment perStageDescriptorSet_ptr() {return this.ptr.asSlice(OFFSET$perStageDescriptorSet, LAYOUT$perStageDescriptorSet);}

    public int dynamicPipelineLayout() {return this.ptr.get(LAYOUT$dynamicPipelineLayout, OFFSET$dynamicPipelineLayout);}
    public void dynamicPipelineLayout(int value) {this.ptr.set(LAYOUT$dynamicPipelineLayout, OFFSET$dynamicPipelineLayout, value);}
    public java.lang.foreign.MemorySegment dynamicPipelineLayout_ptr() {return this.ptr.asSlice(OFFSET$dynamicPipelineLayout, LAYOUT$dynamicPipelineLayout);}
}
