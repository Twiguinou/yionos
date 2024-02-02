package vulkan;

public record VkPhysicalDeviceMaintenance6PropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blockTexelViewCompatibleMultipleLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$blockTexelViewCompatibleMultipleLayers = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxCombinedImageSamplerDescriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxCombinedImageSamplerDescriptorCount = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateClampCombinerInputs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateClampCombinerInputs = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$blockTexelViewCompatibleMultipleLayers,
            LAYOUT$maxCombinedImageSamplerDescriptorCount,
            LAYOUT$fragmentShadingRateClampCombinerInputs,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceMaintenance6PropertiesKHR");

    public VkPhysicalDeviceMaintenance6PropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceMaintenance6PropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int blockTexelViewCompatibleMultipleLayers() {return this.ptr.get(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers);}
    public void blockTexelViewCompatibleMultipleLayers(int value) {this.ptr.set(LAYOUT$blockTexelViewCompatibleMultipleLayers, OFFSET$blockTexelViewCompatibleMultipleLayers, value);}
    public java.lang.foreign.MemorySegment blockTexelViewCompatibleMultipleLayers_ptr() {return this.ptr.asSlice(OFFSET$blockTexelViewCompatibleMultipleLayers, LAYOUT$blockTexelViewCompatibleMultipleLayers);}

    public int maxCombinedImageSamplerDescriptorCount() {return this.ptr.get(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount);}
    public void maxCombinedImageSamplerDescriptorCount(int value) {this.ptr.set(LAYOUT$maxCombinedImageSamplerDescriptorCount, OFFSET$maxCombinedImageSamplerDescriptorCount, value);}
    public java.lang.foreign.MemorySegment maxCombinedImageSamplerDescriptorCount_ptr() {return this.ptr.asSlice(OFFSET$maxCombinedImageSamplerDescriptorCount, LAYOUT$maxCombinedImageSamplerDescriptorCount);}

    public int fragmentShadingRateClampCombinerInputs() {return this.ptr.get(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs);}
    public void fragmentShadingRateClampCombinerInputs(int value) {this.ptr.set(LAYOUT$fragmentShadingRateClampCombinerInputs, OFFSET$fragmentShadingRateClampCombinerInputs, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateClampCombinerInputs_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateClampCombinerInputs, LAYOUT$fragmentShadingRateClampCombinerInputs);}
}
