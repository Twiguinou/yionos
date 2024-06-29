package vulkan;

public record StdVideoEncodeH265LongTermRefPics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_long_term_sps = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_long_term_sps = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_long_term_pics = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_long_term_pics = 1;
    public static final java.lang.foreign.SequenceLayout LAYOUT__lt_idx_sps = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__lt_idx_sps = 2;
    public static final java.lang.foreign.SequenceLayout LAYOUT__poc_lsb_lt = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__poc_lsb_lt = 34;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__used_by_curr_pic_lt_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__used_by_curr_pic_lt_flag = 50;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_poc_msb_present_flag = java.lang.foreign.MemoryLayout.sequenceLayout(48, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__delta_poc_msb_present_flag = 52;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_poc_msb_cycle_lt = java.lang.foreign.MemoryLayout.sequenceLayout(48, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__delta_poc_msb_cycle_lt = 100;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__num_long_term_sps,
            LAYOUT__num_long_term_pics,
            LAYOUT__lt_idx_sps,
            LAYOUT__poc_lsb_lt,
            LAYOUT__used_by_curr_pic_lt_flag,
            LAYOUT__delta_poc_msb_present_flag,
            LAYOUT__delta_poc_msb_cycle_lt
    ).withByteAlignment(2).withName("StdVideoEncodeH265LongTermRefPics");

    public StdVideoEncodeH265LongTermRefPics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH265LongTermRefPics getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH265LongTermRefPics(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH265LongTermRefPics value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public byte num_long_term_sps() {return this.ptr.get(LAYOUT__num_long_term_sps, OFFSET__num_long_term_sps);}
    public void num_long_term_sps(byte value) {this.ptr.set(LAYOUT__num_long_term_sps, OFFSET__num_long_term_sps, value);}
    public java.lang.foreign.MemorySegment $num_long_term_sps() {return this.ptr.asSlice(OFFSET__num_long_term_sps, LAYOUT__num_long_term_sps);}

    public byte num_long_term_pics() {return this.ptr.get(LAYOUT__num_long_term_pics, OFFSET__num_long_term_pics);}
    public void num_long_term_pics(byte value) {this.ptr.set(LAYOUT__num_long_term_pics, OFFSET__num_long_term_pics, value);}
    public java.lang.foreign.MemorySegment $num_long_term_pics() {return this.ptr.asSlice(OFFSET__num_long_term_pics, LAYOUT__num_long_term_pics);}

    public java.lang.foreign.MemorySegment lt_idx_sps() {return this.ptr.asSlice(OFFSET__lt_idx_sps, LAYOUT__lt_idx_sps);}
    public byte lt_idx_sps(int index) {return this.lt_idx_sps().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void lt_idx_sps(int index, byte value) {this.lt_idx_sps().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment poc_lsb_lt() {return this.ptr.asSlice(OFFSET__poc_lsb_lt, LAYOUT__poc_lsb_lt);}
    public byte poc_lsb_lt(int index) {return this.poc_lsb_lt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void poc_lsb_lt(int index, byte value) {this.poc_lsb_lt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public short used_by_curr_pic_lt_flag() {return this.ptr.get(LAYOUT__used_by_curr_pic_lt_flag, OFFSET__used_by_curr_pic_lt_flag);}
    public void used_by_curr_pic_lt_flag(short value) {this.ptr.set(LAYOUT__used_by_curr_pic_lt_flag, OFFSET__used_by_curr_pic_lt_flag, value);}
    public java.lang.foreign.MemorySegment $used_by_curr_pic_lt_flag() {return this.ptr.asSlice(OFFSET__used_by_curr_pic_lt_flag, LAYOUT__used_by_curr_pic_lt_flag);}

    public java.lang.foreign.MemorySegment delta_poc_msb_present_flag() {return this.ptr.asSlice(OFFSET__delta_poc_msb_present_flag, LAYOUT__delta_poc_msb_present_flag);}
    public byte delta_poc_msb_present_flag(int index) {return this.delta_poc_msb_present_flag().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void delta_poc_msb_present_flag(int index, byte value) {this.delta_poc_msb_present_flag().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment delta_poc_msb_cycle_lt() {return this.ptr.asSlice(OFFSET__delta_poc_msb_cycle_lt, LAYOUT__delta_poc_msb_cycle_lt);}
    public byte delta_poc_msb_cycle_lt(int index) {return this.delta_poc_msb_cycle_lt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void delta_poc_msb_cycle_lt(int index, byte value) {this.delta_poc_msb_cycle_lt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
