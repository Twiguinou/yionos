package vulkan;

public record StdVideoH265PredictorPaletteEntries(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__PredictorPaletteEntries = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.MemoryLayout.sequenceLayout(128, java.lang.foreign.ValueLayout.JAVA_SHORT));
    public static final long OFFSET__PredictorPaletteEntries = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__PredictorPaletteEntries
    ).withByteAlignment(2).withName("StdVideoH265PredictorPaletteEntries");

    public StdVideoH265PredictorPaletteEntries(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265PredictorPaletteEntries getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265PredictorPaletteEntries(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265PredictorPaletteEntries value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment PredictorPaletteEntries() {return this.ptr.asSlice(OFFSET__PredictorPaletteEntries, LAYOUT__PredictorPaletteEntries);}
}
