package vulkan;

public record StdVideoEncodeH265LongTermRefPics(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_long_term_sps = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_long_term_sps = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_long_term_pics = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_long_term_pics = 1L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$lt_idx_sps = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$lt_idx_sps = 2L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$poc_lsb_lt = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$poc_lsb_lt = 34L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$used_by_curr_pic_lt_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$used_by_curr_pic_lt_flag = 50L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_poc_msb_present_flag = java.lang.foreign.MemoryLayout.sequenceLayout(48, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$delta_poc_msb_present_flag = 52L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_poc_msb_cycle_lt = java.lang.foreign.MemoryLayout.sequenceLayout(48, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$delta_poc_msb_cycle_lt = 100L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$num_long_term_sps,
            LAYOUT$num_long_term_pics,
            LAYOUT$lt_idx_sps,
            LAYOUT$poc_lsb_lt,
            LAYOUT$used_by_curr_pic_lt_flag,
            LAYOUT$delta_poc_msb_present_flag,
            LAYOUT$delta_poc_msb_cycle_lt
    ).withName("StdVideoEncodeH265LongTermRefPics");

    public StdVideoEncodeH265LongTermRefPics(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265LongTermRefPics getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265LongTermRefPics(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public char num_long_term_sps() {return (char)this.ptr.get(LAYOUT$num_long_term_sps, OFFSET$num_long_term_sps);}
    public void num_long_term_sps(char value) {this.ptr.set(LAYOUT$num_long_term_sps, OFFSET$num_long_term_sps, (byte)value);}
    public java.lang.foreign.MemorySegment num_long_term_sps_ptr() {return this.ptr.asSlice(OFFSET$num_long_term_sps, LAYOUT$num_long_term_sps);}

    public char num_long_term_pics() {return (char)this.ptr.get(LAYOUT$num_long_term_pics, OFFSET$num_long_term_pics);}
    public void num_long_term_pics(char value) {this.ptr.set(LAYOUT$num_long_term_pics, OFFSET$num_long_term_pics, (byte)value);}
    public java.lang.foreign.MemorySegment num_long_term_pics_ptr() {return this.ptr.asSlice(OFFSET$num_long_term_pics, LAYOUT$num_long_term_pics);}

    public java.lang.foreign.MemorySegment lt_idx_sps() {return this.ptr.asSlice(OFFSET$lt_idx_sps, LAYOUT$lt_idx_sps);}
    public char lt_idx_sps(int i) {return (char)this.lt_idx_sps().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void lt_idx_sps(int i, char value) {this.lt_idx_sps().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment poc_lsb_lt() {return this.ptr.asSlice(OFFSET$poc_lsb_lt, LAYOUT$poc_lsb_lt);}
    public char poc_lsb_lt(int i) {return (char)this.poc_lsb_lt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void poc_lsb_lt(int i, char value) {this.poc_lsb_lt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public short used_by_curr_pic_lt_flag() {return this.ptr.get(LAYOUT$used_by_curr_pic_lt_flag, OFFSET$used_by_curr_pic_lt_flag);}
    public void used_by_curr_pic_lt_flag(short value) {this.ptr.set(LAYOUT$used_by_curr_pic_lt_flag, OFFSET$used_by_curr_pic_lt_flag, value);}
    public java.lang.foreign.MemorySegment used_by_curr_pic_lt_flag_ptr() {return this.ptr.asSlice(OFFSET$used_by_curr_pic_lt_flag, LAYOUT$used_by_curr_pic_lt_flag);}

    public java.lang.foreign.MemorySegment delta_poc_msb_present_flag() {return this.ptr.asSlice(OFFSET$delta_poc_msb_present_flag, LAYOUT$delta_poc_msb_present_flag);}
    public char delta_poc_msb_present_flag(int i) {return (char)this.delta_poc_msb_present_flag().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void delta_poc_msb_present_flag(int i, char value) {this.delta_poc_msb_present_flag().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment delta_poc_msb_cycle_lt() {return this.ptr.asSlice(OFFSET$delta_poc_msb_cycle_lt, LAYOUT$delta_poc_msb_cycle_lt);}
    public char delta_poc_msb_cycle_lt(int i) {return (char)this.delta_poc_msb_cycle_lt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void delta_poc_msb_cycle_lt(int i, char value) {this.delta_poc_msb_cycle_lt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}
