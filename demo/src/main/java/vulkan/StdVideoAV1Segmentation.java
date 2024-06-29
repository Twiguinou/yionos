package vulkan;

public record StdVideoAV1Segmentation(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__FeatureEnabled = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__FeatureEnabled = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__FeatureData = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_SHORT));
    public static final long OFFSET__FeatureData = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__FeatureEnabled,
            LAYOUT__FeatureData
    ).withByteAlignment(2).withName("StdVideoAV1Segmentation");

    public StdVideoAV1Segmentation(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1Segmentation getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1Segmentation(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1Segmentation value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment FeatureEnabled() {return this.ptr.asSlice(OFFSET__FeatureEnabled, LAYOUT__FeatureEnabled);}
    public byte FeatureEnabled(int index) {return this.FeatureEnabled().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void FeatureEnabled(int index, byte value) {this.FeatureEnabled().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment FeatureData() {return this.ptr.asSlice(OFFSET__FeatureData, LAYOUT__FeatureData);}
}
