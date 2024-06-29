package vulkan;

public record VkPipelineSampleLocationsStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleLocationsEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sampleLocationsEnable = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__sampleLocationsInfo = vulkan.VkSampleLocationsInfoEXT.gRecordLayout;
    public static final long OFFSET__sampleLocationsInfo = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__sampleLocationsEnable,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__sampleLocationsInfo
    ).withByteAlignment(8).withName("VkPipelineSampleLocationsStateCreateInfoEXT");

    public VkPipelineSampleLocationsStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineSampleLocationsStateCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int sampleLocationsEnable() {return this.ptr.get(LAYOUT__sampleLocationsEnable, OFFSET__sampleLocationsEnable);}
    public void sampleLocationsEnable(int value) {this.ptr.set(LAYOUT__sampleLocationsEnable, OFFSET__sampleLocationsEnable, value);}
    public java.lang.foreign.MemorySegment $sampleLocationsEnable() {return this.ptr.asSlice(OFFSET__sampleLocationsEnable, LAYOUT__sampleLocationsEnable);}

    public vulkan.VkSampleLocationsInfoEXT sampleLocationsInfo() {return new vulkan.VkSampleLocationsInfoEXT(this.ptr.asSlice(OFFSET__sampleLocationsInfo, LAYOUT__sampleLocationsInfo));}
    public void sampleLocationsInfo(java.util.function.Consumer<vulkan.VkSampleLocationsInfoEXT> consumer) {consumer.accept(this.sampleLocationsInfo());}
    public void sampleLocationsInfo(vulkan.VkSampleLocationsInfoEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__sampleLocationsInfo, LAYOUT__sampleLocationsInfo.byteSize());}
}
