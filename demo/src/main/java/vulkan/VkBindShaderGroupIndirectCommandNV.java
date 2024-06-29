package vulkan;

public record VkBindShaderGroupIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__groupIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__groupIndex = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__groupIndex
    ).withByteAlignment(4).withName("VkBindShaderGroupIndirectCommandNV");

    public VkBindShaderGroupIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindShaderGroupIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindShaderGroupIndirectCommandNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindShaderGroupIndirectCommandNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int groupIndex() {return this.ptr.get(LAYOUT__groupIndex, OFFSET__groupIndex);}
    public void groupIndex(int value) {this.ptr.set(LAYOUT__groupIndex, OFFSET__groupIndex, value);}
    public java.lang.foreign.MemorySegment $groupIndex() {return this.ptr.asSlice(OFFSET__groupIndex, LAYOUT__groupIndex);}
}
