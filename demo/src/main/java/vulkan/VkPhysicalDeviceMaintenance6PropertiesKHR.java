package vulkan;

public record VkPhysicalDeviceMaintenance6PropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blockTexelViewCompatibleMultipleLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers");
    public static final long OFFSET__blockTexelViewCompatibleMultipleLayers = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxCombinedImageSamplerDescriptorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount");
    public static final long OFFSET__maxCombinedImageSamplerDescriptorCount = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShadingRateClampCombinerInputs = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs");
    public static final long OFFSET__fragmentShadingRateClampCombinerInputs = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__blockTexelViewCompatibleMultipleLayers,
            LAYOUT__maxCombinedImageSamplerDescriptorCount,
            LAYOUT__fragmentShadingRateClampCombinerInputs,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceMaintenance6PropertiesKHR");

    public VkPhysicalDeviceMaintenance6PropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMaintenance6PropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMaintenance6PropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int blockTexelViewCompatibleMultipleLayers() {return this.ptr.get(LAYOUT__blockTexelViewCompatibleMultipleLayers, OFFSET__blockTexelViewCompatibleMultipleLayers);}
    public void blockTexelViewCompatibleMultipleLayers(int value) {this.ptr.set(LAYOUT__blockTexelViewCompatibleMultipleLayers, OFFSET__blockTexelViewCompatibleMultipleLayers, value);}
    public java.lang.foreign.MemorySegment $blockTexelViewCompatibleMultipleLayers() {return this.ptr.asSlice(OFFSET__blockTexelViewCompatibleMultipleLayers, LAYOUT__blockTexelViewCompatibleMultipleLayers);}

    public int maxCombinedImageSamplerDescriptorCount() {return this.ptr.get(LAYOUT__maxCombinedImageSamplerDescriptorCount, OFFSET__maxCombinedImageSamplerDescriptorCount);}
    public void maxCombinedImageSamplerDescriptorCount(int value) {this.ptr.set(LAYOUT__maxCombinedImageSamplerDescriptorCount, OFFSET__maxCombinedImageSamplerDescriptorCount, value);}
    public java.lang.foreign.MemorySegment $maxCombinedImageSamplerDescriptorCount() {return this.ptr.asSlice(OFFSET__maxCombinedImageSamplerDescriptorCount, LAYOUT__maxCombinedImageSamplerDescriptorCount);}

    public int fragmentShadingRateClampCombinerInputs() {return this.ptr.get(LAYOUT__fragmentShadingRateClampCombinerInputs, OFFSET__fragmentShadingRateClampCombinerInputs);}
    public void fragmentShadingRateClampCombinerInputs(int value) {this.ptr.set(LAYOUT__fragmentShadingRateClampCombinerInputs, OFFSET__fragmentShadingRateClampCombinerInputs, value);}
    public java.lang.foreign.MemorySegment $fragmentShadingRateClampCombinerInputs() {return this.ptr.asSlice(OFFSET__fragmentShadingRateClampCombinerInputs, LAYOUT__fragmentShadingRateClampCombinerInputs);}
}
