package vulkan;

public record StdVideoEncodeH265SliceSegmentHeaderFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoEncodeH265SliceSegmentHeaderFlags");

    public StdVideoEncodeH265SliceSegmentHeaderFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
