package vulkan;

public record VkSubpassSampleLocationsEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subpassIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("subpassIndex");
    public static final long OFFSET__subpassIndex = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__sampleLocationsInfo = vulkan.VkSampleLocationsInfoEXT.gRecordLayout.withName("sampleLocationsInfo");
    public static final long OFFSET__sampleLocationsInfo = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__subpassIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__sampleLocationsInfo
    ).withByteAlignment(8).withName("VkSubpassSampleLocationsEXT");

    public VkSubpassSampleLocationsEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubpassSampleLocationsEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubpassSampleLocationsEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubpassSampleLocationsEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int subpassIndex() {return this.ptr.get(LAYOUT__subpassIndex, OFFSET__subpassIndex);}
    public void subpassIndex(int value) {this.ptr.set(LAYOUT__subpassIndex, OFFSET__subpassIndex, value);}
    public java.lang.foreign.MemorySegment $subpassIndex() {return this.ptr.asSlice(OFFSET__subpassIndex, LAYOUT__subpassIndex);}

    public vulkan.VkSampleLocationsInfoEXT sampleLocationsInfo() {return new vulkan.VkSampleLocationsInfoEXT(this.ptr.asSlice(OFFSET__sampleLocationsInfo, LAYOUT__sampleLocationsInfo));}
    public void sampleLocationsInfo(java.util.function.Consumer<vulkan.VkSampleLocationsInfoEXT> consumer) {consumer.accept(this.sampleLocationsInfo());}
    public void sampleLocationsInfo(vulkan.VkSampleLocationsInfoEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__sampleLocationsInfo, LAYOUT__sampleLocationsInfo.byteSize());}
}
