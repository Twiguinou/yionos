package vulkan;

public record VkRenderPassCreationFeedbackInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__postMergeSubpassCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__postMergeSubpassCount = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__postMergeSubpassCount
    ).withByteAlignment(4).withName("VkRenderPassCreationFeedbackInfoEXT");

    public VkRenderPassCreationFeedbackInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassCreationFeedbackInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassCreationFeedbackInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassCreationFeedbackInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int postMergeSubpassCount() {return this.ptr.get(LAYOUT__postMergeSubpassCount, OFFSET__postMergeSubpassCount);}
    public void postMergeSubpassCount(int value) {this.ptr.set(LAYOUT__postMergeSubpassCount, OFFSET__postMergeSubpassCount, value);}
    public java.lang.foreign.MemorySegment $postMergeSubpassCount() {return this.ptr.asSlice(OFFSET__postMergeSubpassCount, LAYOUT__postMergeSubpassCount);}
}
