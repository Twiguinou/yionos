package vulkan;

public record StdVideoDecodeH264ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoDecodeH264ReferenceInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__FrameNum = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("FrameNum");
    public static final long OFFSET__FrameNum = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__reserved = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("reserved");
    public static final long OFFSET__reserved = 6;
    public static final java.lang.foreign.SequenceLayout LAYOUT__PicOrderCnt = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT).withName("PicOrderCnt");
    public static final long OFFSET__PicOrderCnt = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__FrameNum,
            LAYOUT__reserved,
            LAYOUT__PicOrderCnt
    ).withByteAlignment(4).withName("StdVideoDecodeH264ReferenceInfo");

    public StdVideoDecodeH264ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoDecodeH264ReferenceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoDecodeH264ReferenceInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoDecodeH264ReferenceInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoDecodeH264ReferenceInfoFlags flags() {return new vulkan.StdVideoDecodeH264ReferenceInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoDecodeH264ReferenceInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoDecodeH264ReferenceInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public short FrameNum() {return this.ptr.get(LAYOUT__FrameNum, OFFSET__FrameNum);}
    public void FrameNum(short value) {this.ptr.set(LAYOUT__FrameNum, OFFSET__FrameNum, value);}
    public java.lang.foreign.MemorySegment $FrameNum() {return this.ptr.asSlice(OFFSET__FrameNum, LAYOUT__FrameNum);}

    public short reserved() {return this.ptr.get(LAYOUT__reserved, OFFSET__reserved);}
    public void reserved(short value) {this.ptr.set(LAYOUT__reserved, OFFSET__reserved, value);}
    public java.lang.foreign.MemorySegment $reserved() {return this.ptr.asSlice(OFFSET__reserved, LAYOUT__reserved);}

    public java.lang.foreign.MemorySegment PicOrderCnt() {return this.ptr.asSlice(OFFSET__PicOrderCnt, LAYOUT__PicOrderCnt);}
    public int PicOrderCnt(int index) {return this.PicOrderCnt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void PicOrderCnt(int index, int value) {this.PicOrderCnt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}
}
