package vulkan;

public record VkBindPipelineIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__pipelineAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__pipelineAddress = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__pipelineAddress
    ).withByteAlignment(8).withName("VkBindPipelineIndirectCommandNV");

    public VkBindPipelineIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindPipelineIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindPipelineIndirectCommandNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindPipelineIndirectCommandNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long pipelineAddress() {return this.ptr.get(LAYOUT__pipelineAddress, OFFSET__pipelineAddress);}
    public void pipelineAddress(long value) {this.ptr.set(LAYOUT__pipelineAddress, OFFSET__pipelineAddress, value);}
    public java.lang.foreign.MemorySegment $pipelineAddress() {return this.ptr.asSlice(OFFSET__pipelineAddress, LAYOUT__pipelineAddress);}
}
