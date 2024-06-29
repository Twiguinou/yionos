package vulkan;

public record StdVideoAV1LoopRestoration(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__FrameRestorationType = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__FrameRestorationType = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__LoopRestorationSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET__LoopRestorationSize = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__FrameRestorationType,
            LAYOUT__LoopRestorationSize,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(4).withName("StdVideoAV1LoopRestoration");

    public StdVideoAV1LoopRestoration(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1LoopRestoration getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1LoopRestoration(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1LoopRestoration value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment FrameRestorationType() {return this.ptr.asSlice(OFFSET__FrameRestorationType, LAYOUT__FrameRestorationType);}
    public int FrameRestorationType(int index) {return this.FrameRestorationType().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void FrameRestorationType(int index, int value) {this.FrameRestorationType().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment LoopRestorationSize() {return this.ptr.asSlice(OFFSET__LoopRestorationSize, LAYOUT__LoopRestorationSize);}
    public short LoopRestorationSize(int index) {return this.LoopRestorationSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void LoopRestorationSize(int index, short value) {this.LoopRestorationSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}
}
