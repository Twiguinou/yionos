package vulkan;

public record StdVideoH265LongTermRefPicsSps(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__used_by_curr_pic_lt_sps_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__used_by_curr_pic_lt_sps_flag = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__lt_ref_pic_poc_lsb_sps = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET__lt_ref_pic_poc_lsb_sps = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__used_by_curr_pic_lt_sps_flag,
            LAYOUT__lt_ref_pic_poc_lsb_sps
    ).withByteAlignment(4).withName("StdVideoH265LongTermRefPicsSps");

    public StdVideoH265LongTermRefPicsSps(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265LongTermRefPicsSps getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265LongTermRefPicsSps(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265LongTermRefPicsSps value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int used_by_curr_pic_lt_sps_flag() {return this.ptr.get(LAYOUT__used_by_curr_pic_lt_sps_flag, OFFSET__used_by_curr_pic_lt_sps_flag);}
    public void used_by_curr_pic_lt_sps_flag(int value) {this.ptr.set(LAYOUT__used_by_curr_pic_lt_sps_flag, OFFSET__used_by_curr_pic_lt_sps_flag, value);}
    public java.lang.foreign.MemorySegment $used_by_curr_pic_lt_sps_flag() {return this.ptr.asSlice(OFFSET__used_by_curr_pic_lt_sps_flag, LAYOUT__used_by_curr_pic_lt_sps_flag);}

    public java.lang.foreign.MemorySegment lt_ref_pic_poc_lsb_sps() {return this.ptr.asSlice(OFFSET__lt_ref_pic_poc_lsb_sps, LAYOUT__lt_ref_pic_poc_lsb_sps);}
    public int lt_ref_pic_poc_lsb_sps(int index) {return this.lt_ref_pic_poc_lsb_sps().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void lt_ref_pic_poc_lsb_sps(int index, int value) {this.lt_ref_pic_poc_lsb_sps().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}
}
