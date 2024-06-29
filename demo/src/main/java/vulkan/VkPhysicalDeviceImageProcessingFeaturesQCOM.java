package vulkan;

public record VkPhysicalDeviceImageProcessingFeaturesQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textureSampleWeighted = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textureSampleWeighted = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textureBoxFilter = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textureBoxFilter = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textureBlockMatch = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textureBlockMatch = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__textureSampleWeighted,
            LAYOUT__textureBoxFilter,
            LAYOUT__textureBlockMatch,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceImageProcessingFeaturesQCOM");

    public VkPhysicalDeviceImageProcessingFeaturesQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceImageProcessingFeaturesQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int textureSampleWeighted() {return this.ptr.get(LAYOUT__textureSampleWeighted, OFFSET__textureSampleWeighted);}
    public void textureSampleWeighted(int value) {this.ptr.set(LAYOUT__textureSampleWeighted, OFFSET__textureSampleWeighted, value);}
    public java.lang.foreign.MemorySegment $textureSampleWeighted() {return this.ptr.asSlice(OFFSET__textureSampleWeighted, LAYOUT__textureSampleWeighted);}

    public int textureBoxFilter() {return this.ptr.get(LAYOUT__textureBoxFilter, OFFSET__textureBoxFilter);}
    public void textureBoxFilter(int value) {this.ptr.set(LAYOUT__textureBoxFilter, OFFSET__textureBoxFilter, value);}
    public java.lang.foreign.MemorySegment $textureBoxFilter() {return this.ptr.asSlice(OFFSET__textureBoxFilter, LAYOUT__textureBoxFilter);}

    public int textureBlockMatch() {return this.ptr.get(LAYOUT__textureBlockMatch, OFFSET__textureBlockMatch);}
    public void textureBlockMatch(int value) {this.ptr.set(LAYOUT__textureBlockMatch, OFFSET__textureBlockMatch, value);}
    public java.lang.foreign.MemorySegment $textureBlockMatch() {return this.ptr.asSlice(OFFSET__textureBlockMatch, LAYOUT__textureBlockMatch);}
}
