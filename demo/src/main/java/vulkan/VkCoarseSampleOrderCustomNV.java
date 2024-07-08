package vulkan;

public record VkCoarseSampleOrderCustomNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("shadingRate");
    public static final long OFFSET__shadingRate = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampleCount");
    public static final long OFFSET__sampleCount = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleLocationCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampleLocationCount");
    public static final long OFFSET__sampleLocationCount = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSampleLocations = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSampleLocations");
    public static final long OFFSET__pSampleLocations = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__shadingRate,
            LAYOUT__sampleCount,
            LAYOUT__sampleLocationCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSampleLocations
    ).withByteAlignment(8).withName("VkCoarseSampleOrderCustomNV");

    public VkCoarseSampleOrderCustomNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCoarseSampleOrderCustomNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCoarseSampleOrderCustomNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCoarseSampleOrderCustomNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int shadingRate() {return this.ptr.get(LAYOUT__shadingRate, OFFSET__shadingRate);}
    public void shadingRate(int value) {this.ptr.set(LAYOUT__shadingRate, OFFSET__shadingRate, value);}
    public java.lang.foreign.MemorySegment $shadingRate() {return this.ptr.asSlice(OFFSET__shadingRate, LAYOUT__shadingRate);}

    public int sampleCount() {return this.ptr.get(LAYOUT__sampleCount, OFFSET__sampleCount);}
    public void sampleCount(int value) {this.ptr.set(LAYOUT__sampleCount, OFFSET__sampleCount, value);}
    public java.lang.foreign.MemorySegment $sampleCount() {return this.ptr.asSlice(OFFSET__sampleCount, LAYOUT__sampleCount);}

    public int sampleLocationCount() {return this.ptr.get(LAYOUT__sampleLocationCount, OFFSET__sampleLocationCount);}
    public void sampleLocationCount(int value) {this.ptr.set(LAYOUT__sampleLocationCount, OFFSET__sampleLocationCount, value);}
    public java.lang.foreign.MemorySegment $sampleLocationCount() {return this.ptr.asSlice(OFFSET__sampleLocationCount, LAYOUT__sampleLocationCount);}

    public java.lang.foreign.MemorySegment pSampleLocations() {return this.ptr.get(LAYOUT__pSampleLocations, OFFSET__pSampleLocations);}
    public void pSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSampleLocations, OFFSET__pSampleLocations, value);}
    public java.lang.foreign.MemorySegment $pSampleLocations() {return this.ptr.asSlice(OFFSET__pSampleLocations, LAYOUT__pSampleLocations);}
}
