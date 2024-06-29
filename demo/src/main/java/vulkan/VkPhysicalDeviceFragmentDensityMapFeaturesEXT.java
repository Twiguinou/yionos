package vulkan;

public record VkPhysicalDeviceFragmentDensityMapFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentDensityMap = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fragmentDensityMap = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentDensityMapDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fragmentDensityMapDynamic = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentDensityMapNonSubsampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fragmentDensityMapNonSubsampledImages = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__fragmentDensityMap,
            LAYOUT__fragmentDensityMapDynamic,
            LAYOUT__fragmentDensityMapNonSubsampledImages,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentDensityMapFeaturesEXT");

    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentDensityMapFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int fragmentDensityMap() {return this.ptr.get(LAYOUT__fragmentDensityMap, OFFSET__fragmentDensityMap);}
    public void fragmentDensityMap(int value) {this.ptr.set(LAYOUT__fragmentDensityMap, OFFSET__fragmentDensityMap, value);}
    public java.lang.foreign.MemorySegment $fragmentDensityMap() {return this.ptr.asSlice(OFFSET__fragmentDensityMap, LAYOUT__fragmentDensityMap);}

    public int fragmentDensityMapDynamic() {return this.ptr.get(LAYOUT__fragmentDensityMapDynamic, OFFSET__fragmentDensityMapDynamic);}
    public void fragmentDensityMapDynamic(int value) {this.ptr.set(LAYOUT__fragmentDensityMapDynamic, OFFSET__fragmentDensityMapDynamic, value);}
    public java.lang.foreign.MemorySegment $fragmentDensityMapDynamic() {return this.ptr.asSlice(OFFSET__fragmentDensityMapDynamic, LAYOUT__fragmentDensityMapDynamic);}

    public int fragmentDensityMapNonSubsampledImages() {return this.ptr.get(LAYOUT__fragmentDensityMapNonSubsampledImages, OFFSET__fragmentDensityMapNonSubsampledImages);}
    public void fragmentDensityMapNonSubsampledImages(int value) {this.ptr.set(LAYOUT__fragmentDensityMapNonSubsampledImages, OFFSET__fragmentDensityMapNonSubsampledImages, value);}
    public java.lang.foreign.MemorySegment $fragmentDensityMapNonSubsampledImages() {return this.ptr.asSlice(OFFSET__fragmentDensityMapNonSubsampledImages, LAYOUT__fragmentDensityMapNonSubsampledImages);}
}
