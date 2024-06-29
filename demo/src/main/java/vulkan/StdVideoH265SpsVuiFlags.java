package vulkan;

public record StdVideoH265SpsVuiFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(4).withName("StdVideoH265SpsVuiFlags");

    public StdVideoH265SpsVuiFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265SpsVuiFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265SpsVuiFlags(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265SpsVuiFlags value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }
}
