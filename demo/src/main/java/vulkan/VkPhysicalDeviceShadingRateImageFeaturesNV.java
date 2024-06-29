package vulkan;

public record VkPhysicalDeviceShadingRateImageFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRateImage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shadingRateImage = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRateCoarseSampleOrder = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shadingRateCoarseSampleOrder = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shadingRateImage,
            LAYOUT__shadingRateCoarseSampleOrder
    ).withByteAlignment(8).withName("VkPhysicalDeviceShadingRateImageFeaturesNV");

    public VkPhysicalDeviceShadingRateImageFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShadingRateImageFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shadingRateImage() {return this.ptr.get(LAYOUT__shadingRateImage, OFFSET__shadingRateImage);}
    public void shadingRateImage(int value) {this.ptr.set(LAYOUT__shadingRateImage, OFFSET__shadingRateImage, value);}
    public java.lang.foreign.MemorySegment $shadingRateImage() {return this.ptr.asSlice(OFFSET__shadingRateImage, LAYOUT__shadingRateImage);}

    public int shadingRateCoarseSampleOrder() {return this.ptr.get(LAYOUT__shadingRateCoarseSampleOrder, OFFSET__shadingRateCoarseSampleOrder);}
    public void shadingRateCoarseSampleOrder(int value) {this.ptr.set(LAYOUT__shadingRateCoarseSampleOrder, OFFSET__shadingRateCoarseSampleOrder, value);}
    public java.lang.foreign.MemorySegment $shadingRateCoarseSampleOrder() {return this.ptr.asSlice(OFFSET__shadingRateCoarseSampleOrder, LAYOUT__shadingRateCoarseSampleOrder);}
}
