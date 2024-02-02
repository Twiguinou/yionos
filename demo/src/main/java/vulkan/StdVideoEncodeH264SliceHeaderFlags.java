package vulkan;

public record StdVideoEncodeH264SliceHeaderFlags(java.lang.foreign.MemorySegment ptr)
{

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("StdVideoEncodeH264SliceHeaderFlags");

    public StdVideoEncodeH264SliceHeaderFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264SliceHeaderFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264SliceHeaderFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }
}
