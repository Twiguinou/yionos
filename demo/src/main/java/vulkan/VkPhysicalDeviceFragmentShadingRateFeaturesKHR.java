package vulkan;

public record VkPhysicalDeviceFragmentShadingRateFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineFragmentShadingRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("pipelineFragmentShadingRate");
    public static final long OFFSET__pipelineFragmentShadingRate = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primitiveFragmentShadingRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRate");
    public static final long OFFSET__primitiveFragmentShadingRate = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentFragmentShadingRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("attachmentFragmentShadingRate");
    public static final long OFFSET__attachmentFragmentShadingRate = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pipelineFragmentShadingRate,
            LAYOUT__primitiveFragmentShadingRate,
            LAYOUT__attachmentFragmentShadingRate,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentShadingRateFeaturesKHR");

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentShadingRateFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int pipelineFragmentShadingRate() {return this.ptr.get(LAYOUT__pipelineFragmentShadingRate, OFFSET__pipelineFragmentShadingRate);}
    public void pipelineFragmentShadingRate(int value) {this.ptr.set(LAYOUT__pipelineFragmentShadingRate, OFFSET__pipelineFragmentShadingRate, value);}
    public java.lang.foreign.MemorySegment $pipelineFragmentShadingRate() {return this.ptr.asSlice(OFFSET__pipelineFragmentShadingRate, LAYOUT__pipelineFragmentShadingRate);}

    public int primitiveFragmentShadingRate() {return this.ptr.get(LAYOUT__primitiveFragmentShadingRate, OFFSET__primitiveFragmentShadingRate);}
    public void primitiveFragmentShadingRate(int value) {this.ptr.set(LAYOUT__primitiveFragmentShadingRate, OFFSET__primitiveFragmentShadingRate, value);}
    public java.lang.foreign.MemorySegment $primitiveFragmentShadingRate() {return this.ptr.asSlice(OFFSET__primitiveFragmentShadingRate, LAYOUT__primitiveFragmentShadingRate);}

    public int attachmentFragmentShadingRate() {return this.ptr.get(LAYOUT__attachmentFragmentShadingRate, OFFSET__attachmentFragmentShadingRate);}
    public void attachmentFragmentShadingRate(int value) {this.ptr.set(LAYOUT__attachmentFragmentShadingRate, OFFSET__attachmentFragmentShadingRate, value);}
    public java.lang.foreign.MemorySegment $attachmentFragmentShadingRate() {return this.ptr.asSlice(OFFSET__attachmentFragmentShadingRate, LAYOUT__attachmentFragmentShadingRate);}
}
