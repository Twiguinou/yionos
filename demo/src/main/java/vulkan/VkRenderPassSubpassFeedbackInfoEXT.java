package vulkan;

public record VkRenderPassSubpassFeedbackInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subpassMergeStatus = java.lang.foreign.ValueLayout.JAVA_INT.withName("subpassMergeStatus");
    public static final long OFFSET__subpassMergeStatus = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("description");
    public static final long OFFSET__description = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__postMergeIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("postMergeIndex");
    public static final long OFFSET__postMergeIndex = 260;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__subpassMergeStatus,
            LAYOUT__description,
            LAYOUT__postMergeIndex
    ).withByteAlignment(4).withName("VkRenderPassSubpassFeedbackInfoEXT");

    public VkRenderPassSubpassFeedbackInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassSubpassFeedbackInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassSubpassFeedbackInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassSubpassFeedbackInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int subpassMergeStatus() {return this.ptr.get(LAYOUT__subpassMergeStatus, OFFSET__subpassMergeStatus);}
    public void subpassMergeStatus(int value) {this.ptr.set(LAYOUT__subpassMergeStatus, OFFSET__subpassMergeStatus, value);}
    public java.lang.foreign.MemorySegment $subpassMergeStatus() {return this.ptr.asSlice(OFFSET__subpassMergeStatus, LAYOUT__subpassMergeStatus);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET__description, LAYOUT__description);}
    public byte description(int index) {return this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void description(int index, byte value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int postMergeIndex() {return this.ptr.get(LAYOUT__postMergeIndex, OFFSET__postMergeIndex);}
    public void postMergeIndex(int value) {this.ptr.set(LAYOUT__postMergeIndex, OFFSET__postMergeIndex, value);}
    public java.lang.foreign.MemorySegment $postMergeIndex() {return this.ptr.asSlice(OFFSET__postMergeIndex, LAYOUT__postMergeIndex);}
}
