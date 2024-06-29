package vulkan;

public record VkPhysicalDeviceSampleLocationsPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleLocationSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sampleLocationSampleCounts = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__maxSampleLocationGridSize = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxSampleLocationGridSize = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__sampleLocationCoordinateRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET__sampleLocationCoordinateRange = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleLocationSubPixelBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sampleLocationSubPixelBits = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__variableSampleLocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__variableSampleLocations = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__sampleLocationSampleCounts,
            LAYOUT__maxSampleLocationGridSize,
            LAYOUT__sampleLocationCoordinateRange,
            LAYOUT__sampleLocationSubPixelBits,
            LAYOUT__variableSampleLocations,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceSampleLocationsPropertiesEXT");

    public VkPhysicalDeviceSampleLocationsPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceSampleLocationsPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int sampleLocationSampleCounts() {return this.ptr.get(LAYOUT__sampleLocationSampleCounts, OFFSET__sampleLocationSampleCounts);}
    public void sampleLocationSampleCounts(int value) {this.ptr.set(LAYOUT__sampleLocationSampleCounts, OFFSET__sampleLocationSampleCounts, value);}
    public java.lang.foreign.MemorySegment $sampleLocationSampleCounts() {return this.ptr.asSlice(OFFSET__sampleLocationSampleCounts, LAYOUT__sampleLocationSampleCounts);}

    public vulkan.VkExtent2D maxSampleLocationGridSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxSampleLocationGridSize, LAYOUT__maxSampleLocationGridSize));}
    public void maxSampleLocationGridSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxSampleLocationGridSize());}
    public void maxSampleLocationGridSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxSampleLocationGridSize, LAYOUT__maxSampleLocationGridSize.byteSize());}

    public java.lang.foreign.MemorySegment sampleLocationCoordinateRange() {return this.ptr.asSlice(OFFSET__sampleLocationCoordinateRange, LAYOUT__sampleLocationCoordinateRange);}
    public float sampleLocationCoordinateRange(int index) {return this.sampleLocationCoordinateRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void sampleLocationCoordinateRange(int index, float value) {this.sampleLocationCoordinateRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}

    public int sampleLocationSubPixelBits() {return this.ptr.get(LAYOUT__sampleLocationSubPixelBits, OFFSET__sampleLocationSubPixelBits);}
    public void sampleLocationSubPixelBits(int value) {this.ptr.set(LAYOUT__sampleLocationSubPixelBits, OFFSET__sampleLocationSubPixelBits, value);}
    public java.lang.foreign.MemorySegment $sampleLocationSubPixelBits() {return this.ptr.asSlice(OFFSET__sampleLocationSubPixelBits, LAYOUT__sampleLocationSubPixelBits);}

    public int variableSampleLocations() {return this.ptr.get(LAYOUT__variableSampleLocations, OFFSET__variableSampleLocations);}
    public void variableSampleLocations(int value) {this.ptr.set(LAYOUT__variableSampleLocations, OFFSET__variableSampleLocations, value);}
    public java.lang.foreign.MemorySegment $variableSampleLocations() {return this.ptr.asSlice(OFFSET__variableSampleLocations, LAYOUT__variableSampleLocations);}
}
