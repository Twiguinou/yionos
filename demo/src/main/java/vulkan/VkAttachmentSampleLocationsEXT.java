package vulkan;

public record VkAttachmentSampleLocationsEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("attachmentIndex");
    public static final long OFFSET__attachmentIndex = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__sampleLocationsInfo = vulkan.VkSampleLocationsInfoEXT.gRecordLayout.withName("sampleLocationsInfo");
    public static final long OFFSET__sampleLocationsInfo = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__attachmentIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__sampleLocationsInfo
    ).withByteAlignment(8).withName("VkAttachmentSampleLocationsEXT");

    public VkAttachmentSampleLocationsEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAttachmentSampleLocationsEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAttachmentSampleLocationsEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAttachmentSampleLocationsEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int attachmentIndex() {return this.ptr.get(LAYOUT__attachmentIndex, OFFSET__attachmentIndex);}
    public void attachmentIndex(int value) {this.ptr.set(LAYOUT__attachmentIndex, OFFSET__attachmentIndex, value);}
    public java.lang.foreign.MemorySegment $attachmentIndex() {return this.ptr.asSlice(OFFSET__attachmentIndex, LAYOUT__attachmentIndex);}

    public vulkan.VkSampleLocationsInfoEXT sampleLocationsInfo() {return new vulkan.VkSampleLocationsInfoEXT(this.ptr.asSlice(OFFSET__sampleLocationsInfo, LAYOUT__sampleLocationsInfo));}
    public void sampleLocationsInfo(java.util.function.Consumer<vulkan.VkSampleLocationsInfoEXT> consumer) {consumer.accept(this.sampleLocationsInfo());}
    public void sampleLocationsInfo(vulkan.VkSampleLocationsInfoEXT value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__sampleLocationsInfo, LAYOUT__sampleLocationsInfo.byteSize());}
}
