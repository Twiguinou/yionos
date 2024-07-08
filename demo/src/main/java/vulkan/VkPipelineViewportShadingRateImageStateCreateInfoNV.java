package vulkan;

public record VkPipelineViewportShadingRateImageStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRateImageEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("shadingRateImageEnable");
    public static final long OFFSET__shadingRateImageEnable = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewportCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewportCount");
    public static final long OFFSET__viewportCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pShadingRatePalettes = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pShadingRatePalettes");
    public static final long OFFSET__pShadingRatePalettes = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shadingRateImageEnable,
            LAYOUT__viewportCount,
            LAYOUT__pShadingRatePalettes
    ).withByteAlignment(8).withName("VkPipelineViewportShadingRateImageStateCreateInfoNV");

    public VkPipelineViewportShadingRateImageStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineViewportShadingRateImageStateCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shadingRateImageEnable() {return this.ptr.get(LAYOUT__shadingRateImageEnable, OFFSET__shadingRateImageEnable);}
    public void shadingRateImageEnable(int value) {this.ptr.set(LAYOUT__shadingRateImageEnable, OFFSET__shadingRateImageEnable, value);}
    public java.lang.foreign.MemorySegment $shadingRateImageEnable() {return this.ptr.asSlice(OFFSET__shadingRateImageEnable, LAYOUT__shadingRateImageEnable);}

    public int viewportCount() {return this.ptr.get(LAYOUT__viewportCount, OFFSET__viewportCount);}
    public void viewportCount(int value) {this.ptr.set(LAYOUT__viewportCount, OFFSET__viewportCount, value);}
    public java.lang.foreign.MemorySegment $viewportCount() {return this.ptr.asSlice(OFFSET__viewportCount, LAYOUT__viewportCount);}

    public java.lang.foreign.MemorySegment pShadingRatePalettes() {return this.ptr.get(LAYOUT__pShadingRatePalettes, OFFSET__pShadingRatePalettes);}
    public void pShadingRatePalettes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pShadingRatePalettes, OFFSET__pShadingRatePalettes, value);}
    public java.lang.foreign.MemorySegment $pShadingRatePalettes() {return this.ptr.asSlice(OFFSET__pShadingRatePalettes, LAYOUT__pShadingRatePalettes);}
}
