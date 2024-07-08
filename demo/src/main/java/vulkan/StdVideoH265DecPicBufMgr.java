package vulkan;

public record StdVideoH265DecPicBufMgr(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__max_latency_increase_plus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_INT).withName("max_latency_increase_plus1");
    public static final long OFFSET__max_latency_increase_plus1 = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__max_dec_pic_buffering_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("max_dec_pic_buffering_minus1");
    public static final long OFFSET__max_dec_pic_buffering_minus1 = 28;
    public static final java.lang.foreign.SequenceLayout LAYOUT__max_num_reorder_pics = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("max_num_reorder_pics");
    public static final long OFFSET__max_num_reorder_pics = 35;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__max_latency_increase_plus1,
            LAYOUT__max_dec_pic_buffering_minus1,
            LAYOUT__max_num_reorder_pics,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(4).withName("StdVideoH265DecPicBufMgr");

    public StdVideoH265DecPicBufMgr(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265DecPicBufMgr getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265DecPicBufMgr(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265DecPicBufMgr value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment max_latency_increase_plus1() {return this.ptr.asSlice(OFFSET__max_latency_increase_plus1, LAYOUT__max_latency_increase_plus1);}
    public int max_latency_increase_plus1(int index) {return this.max_latency_increase_plus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void max_latency_increase_plus1(int index, int value) {this.max_latency_increase_plus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment max_dec_pic_buffering_minus1() {return this.ptr.asSlice(OFFSET__max_dec_pic_buffering_minus1, LAYOUT__max_dec_pic_buffering_minus1);}
    public byte max_dec_pic_buffering_minus1(int index) {return this.max_dec_pic_buffering_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void max_dec_pic_buffering_minus1(int index, byte value) {this.max_dec_pic_buffering_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment max_num_reorder_pics() {return this.ptr.asSlice(OFFSET__max_num_reorder_pics, LAYOUT__max_num_reorder_pics);}
    public byte max_num_reorder_pics(int index) {return this.max_num_reorder_pics().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void max_num_reorder_pics(int index, byte value) {this.max_num_reorder_pics().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
