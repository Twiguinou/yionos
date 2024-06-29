package vulkan;

public record VkSetStateFlagsIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__data = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__data = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__data
    ).withByteAlignment(4).withName("VkSetStateFlagsIndirectCommandNV");

    public VkSetStateFlagsIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSetStateFlagsIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSetStateFlagsIndirectCommandNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSetStateFlagsIndirectCommandNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int data() {return this.ptr.get(LAYOUT__data, OFFSET__data);}
    public void data(int value) {this.ptr.set(LAYOUT__data, OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}
}
