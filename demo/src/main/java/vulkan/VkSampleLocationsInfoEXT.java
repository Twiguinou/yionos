package vulkan;

public record VkSampleLocationsInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleLocationsPerPixel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sampleLocationsPerPixel = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__sampleLocationGridSize = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__sampleLocationGridSize = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleLocationsCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sampleLocationsCount = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSampleLocations = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSampleLocations = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__sampleLocationsPerPixel,
            LAYOUT__sampleLocationGridSize,
            LAYOUT__sampleLocationsCount,
            LAYOUT__pSampleLocations
    ).withByteAlignment(8).withName("VkSampleLocationsInfoEXT");

    public VkSampleLocationsInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSampleLocationsInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSampleLocationsInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSampleLocationsInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int sampleLocationsPerPixel() {return this.ptr.get(LAYOUT__sampleLocationsPerPixel, OFFSET__sampleLocationsPerPixel);}
    public void sampleLocationsPerPixel(int value) {this.ptr.set(LAYOUT__sampleLocationsPerPixel, OFFSET__sampleLocationsPerPixel, value);}
    public java.lang.foreign.MemorySegment $sampleLocationsPerPixel() {return this.ptr.asSlice(OFFSET__sampleLocationsPerPixel, LAYOUT__sampleLocationsPerPixel);}

    public vulkan.VkExtent2D sampleLocationGridSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__sampleLocationGridSize, LAYOUT__sampleLocationGridSize));}
    public void sampleLocationGridSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.sampleLocationGridSize());}
    public void sampleLocationGridSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__sampleLocationGridSize, LAYOUT__sampleLocationGridSize.byteSize());}

    public int sampleLocationsCount() {return this.ptr.get(LAYOUT__sampleLocationsCount, OFFSET__sampleLocationsCount);}
    public void sampleLocationsCount(int value) {this.ptr.set(LAYOUT__sampleLocationsCount, OFFSET__sampleLocationsCount, value);}
    public java.lang.foreign.MemorySegment $sampleLocationsCount() {return this.ptr.asSlice(OFFSET__sampleLocationsCount, LAYOUT__sampleLocationsCount);}

    public java.lang.foreign.MemorySegment pSampleLocations() {return this.ptr.get(LAYOUT__pSampleLocations, OFFSET__pSampleLocations);}
    public void pSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSampleLocations, OFFSET__pSampleLocations, value);}
    public java.lang.foreign.MemorySegment $pSampleLocations() {return this.ptr.asSlice(OFFSET__pSampleLocations, LAYOUT__pSampleLocations);}
}
