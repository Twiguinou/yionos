package vulkan;

public record StdVideoH265SpsFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoH265SpsFlags");

    public StdVideoH265SpsFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoH265SpsFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoH265SpsFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
