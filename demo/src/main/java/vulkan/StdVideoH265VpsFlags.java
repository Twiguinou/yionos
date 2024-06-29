package vulkan;

public record StdVideoH265VpsFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(4).withName("StdVideoH265VpsFlags");

    public StdVideoH265VpsFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265VpsFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265VpsFlags(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265VpsFlags value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }
}
