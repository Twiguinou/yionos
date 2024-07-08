package vulkan;

public record StdVideoAV1GlobalMotion(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__GmType = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("GmType");
    public static final long OFFSET__GmType = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__gm_params = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_INT)).withName("gm_params");
    public static final long OFFSET__gm_params = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__GmType,
            LAYOUT__gm_params
    ).withByteAlignment(4).withName("StdVideoAV1GlobalMotion");

    public StdVideoAV1GlobalMotion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1GlobalMotion getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1GlobalMotion(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1GlobalMotion value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment GmType() {return this.ptr.asSlice(OFFSET__GmType, LAYOUT__GmType);}
    public byte GmType(int index) {return this.GmType().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void GmType(int index, byte value) {this.GmType().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment gm_params() {return this.ptr.asSlice(OFFSET__gm_params, LAYOUT__gm_params);}
}
