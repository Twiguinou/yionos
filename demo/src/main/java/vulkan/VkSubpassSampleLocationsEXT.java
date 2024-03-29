package vulkan;

public record VkSubpassSampleLocationsEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subpassIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subpassIndex = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$sampleLocationsInfo = vulkan.VkSampleLocationsInfoEXT.gStructLayout;
    public static final long OFFSET$sampleLocationsInfo = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$subpassIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$sampleLocationsInfo
    ).withName("VkSubpassSampleLocationsEXT");

    public VkSubpassSampleLocationsEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSubpassSampleLocationsEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSubpassSampleLocationsEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int subpassIndex() {return this.ptr.get(LAYOUT$subpassIndex, OFFSET$subpassIndex);}
    public void subpassIndex(int value) {this.ptr.set(LAYOUT$subpassIndex, OFFSET$subpassIndex, value);}
    public java.lang.foreign.MemorySegment subpassIndex_ptr() {return this.ptr.asSlice(OFFSET$subpassIndex, LAYOUT$subpassIndex);}

    public vulkan.VkSampleLocationsInfoEXT sampleLocationsInfo() {return new vulkan.VkSampleLocationsInfoEXT(this.ptr.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));}
    public void sampleLocationsInfo(java.util.function.Consumer<vulkan.VkSampleLocationsInfoEXT> consumer) {consumer.accept(this.sampleLocationsInfo());}
    public void sampleLocationsInfo(vulkan.VkSampleLocationsInfoEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo.byteSize());}
}
