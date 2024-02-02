package vulkan;

public record StdVideoH264SpsVuiFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoH264SpsVuiFlags");

    public StdVideoH264SpsVuiFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoH264SpsVuiFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoH264SpsVuiFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
