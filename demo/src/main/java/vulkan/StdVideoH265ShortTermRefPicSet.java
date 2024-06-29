package vulkan;

public record StdVideoH265ShortTermRefPicSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH265ShortTermRefPicSetFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__delta_idx_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__delta_idx_minus1 = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__use_delta_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__use_delta_flag = 8;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__abs_delta_rps_minus1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__abs_delta_rps_minus1 = 10;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__used_by_curr_pic_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__used_by_curr_pic_flag = 12;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__used_by_curr_pic_s0_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__used_by_curr_pic_s0_flag = 14;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__used_by_curr_pic_s1_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__used_by_curr_pic_s1_flag = 16;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__reserved1 = 18;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved2 = 20;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved3 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved3 = 21;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_negative_pics = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_negative_pics = 22;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_positive_pics = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_positive_pics = 23;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_poc_s0_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET__delta_poc_s0_minus1 = 24;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_poc_s1_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET__delta_poc_s1_minus1 = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__delta_idx_minus1,
            LAYOUT__use_delta_flag,
            LAYOUT__abs_delta_rps_minus1,
            LAYOUT__used_by_curr_pic_flag,
            LAYOUT__used_by_curr_pic_s0_flag,
            LAYOUT__used_by_curr_pic_s1_flag,
            LAYOUT__reserved1,
            LAYOUT__reserved2,
            LAYOUT__reserved3,
            LAYOUT__num_negative_pics,
            LAYOUT__num_positive_pics,
            LAYOUT__delta_poc_s0_minus1,
            LAYOUT__delta_poc_s1_minus1
    ).withByteAlignment(4).withName("StdVideoH265ShortTermRefPicSet");

    public StdVideoH265ShortTermRefPicSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265ShortTermRefPicSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265ShortTermRefPicSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265ShortTermRefPicSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH265ShortTermRefPicSetFlags flags() {return new vulkan.StdVideoH265ShortTermRefPicSetFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265ShortTermRefPicSetFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265ShortTermRefPicSetFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int delta_idx_minus1() {return this.ptr.get(LAYOUT__delta_idx_minus1, OFFSET__delta_idx_minus1);}
    public void delta_idx_minus1(int value) {this.ptr.set(LAYOUT__delta_idx_minus1, OFFSET__delta_idx_minus1, value);}
    public java.lang.foreign.MemorySegment $delta_idx_minus1() {return this.ptr.asSlice(OFFSET__delta_idx_minus1, LAYOUT__delta_idx_minus1);}

    public short use_delta_flag() {return this.ptr.get(LAYOUT__use_delta_flag, OFFSET__use_delta_flag);}
    public void use_delta_flag(short value) {this.ptr.set(LAYOUT__use_delta_flag, OFFSET__use_delta_flag, value);}
    public java.lang.foreign.MemorySegment $use_delta_flag() {return this.ptr.asSlice(OFFSET__use_delta_flag, LAYOUT__use_delta_flag);}

    public short abs_delta_rps_minus1() {return this.ptr.get(LAYOUT__abs_delta_rps_minus1, OFFSET__abs_delta_rps_minus1);}
    public void abs_delta_rps_minus1(short value) {this.ptr.set(LAYOUT__abs_delta_rps_minus1, OFFSET__abs_delta_rps_minus1, value);}
    public java.lang.foreign.MemorySegment $abs_delta_rps_minus1() {return this.ptr.asSlice(OFFSET__abs_delta_rps_minus1, LAYOUT__abs_delta_rps_minus1);}

    public short used_by_curr_pic_flag() {return this.ptr.get(LAYOUT__used_by_curr_pic_flag, OFFSET__used_by_curr_pic_flag);}
    public void used_by_curr_pic_flag(short value) {this.ptr.set(LAYOUT__used_by_curr_pic_flag, OFFSET__used_by_curr_pic_flag, value);}
    public java.lang.foreign.MemorySegment $used_by_curr_pic_flag() {return this.ptr.asSlice(OFFSET__used_by_curr_pic_flag, LAYOUT__used_by_curr_pic_flag);}

    public short used_by_curr_pic_s0_flag() {return this.ptr.get(LAYOUT__used_by_curr_pic_s0_flag, OFFSET__used_by_curr_pic_s0_flag);}
    public void used_by_curr_pic_s0_flag(short value) {this.ptr.set(LAYOUT__used_by_curr_pic_s0_flag, OFFSET__used_by_curr_pic_s0_flag, value);}
    public java.lang.foreign.MemorySegment $used_by_curr_pic_s0_flag() {return this.ptr.asSlice(OFFSET__used_by_curr_pic_s0_flag, LAYOUT__used_by_curr_pic_s0_flag);}

    public short used_by_curr_pic_s1_flag() {return this.ptr.get(LAYOUT__used_by_curr_pic_s1_flag, OFFSET__used_by_curr_pic_s1_flag);}
    public void used_by_curr_pic_s1_flag(short value) {this.ptr.set(LAYOUT__used_by_curr_pic_s1_flag, OFFSET__used_by_curr_pic_s1_flag, value);}
    public java.lang.foreign.MemorySegment $used_by_curr_pic_s1_flag() {return this.ptr.asSlice(OFFSET__used_by_curr_pic_s1_flag, LAYOUT__used_by_curr_pic_s1_flag);}

    public short reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(short value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public byte reserved2() {return this.ptr.get(LAYOUT__reserved2, OFFSET__reserved2);}
    public void reserved2(byte value) {this.ptr.set(LAYOUT__reserved2, OFFSET__reserved2, value);}
    public java.lang.foreign.MemorySegment $reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}

    public byte reserved3() {return this.ptr.get(LAYOUT__reserved3, OFFSET__reserved3);}
    public void reserved3(byte value) {this.ptr.set(LAYOUT__reserved3, OFFSET__reserved3, value);}
    public java.lang.foreign.MemorySegment $reserved3() {return this.ptr.asSlice(OFFSET__reserved3, LAYOUT__reserved3);}

    public byte num_negative_pics() {return this.ptr.get(LAYOUT__num_negative_pics, OFFSET__num_negative_pics);}
    public void num_negative_pics(byte value) {this.ptr.set(LAYOUT__num_negative_pics, OFFSET__num_negative_pics, value);}
    public java.lang.foreign.MemorySegment $num_negative_pics() {return this.ptr.asSlice(OFFSET__num_negative_pics, LAYOUT__num_negative_pics);}

    public byte num_positive_pics() {return this.ptr.get(LAYOUT__num_positive_pics, OFFSET__num_positive_pics);}
    public void num_positive_pics(byte value) {this.ptr.set(LAYOUT__num_positive_pics, OFFSET__num_positive_pics, value);}
    public java.lang.foreign.MemorySegment $num_positive_pics() {return this.ptr.asSlice(OFFSET__num_positive_pics, LAYOUT__num_positive_pics);}

    public java.lang.foreign.MemorySegment delta_poc_s0_minus1() {return this.ptr.asSlice(OFFSET__delta_poc_s0_minus1, LAYOUT__delta_poc_s0_minus1);}
    public short delta_poc_s0_minus1(int index) {return this.delta_poc_s0_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void delta_poc_s0_minus1(int index, short value) {this.delta_poc_s0_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}

    public java.lang.foreign.MemorySegment delta_poc_s1_minus1() {return this.ptr.asSlice(OFFSET__delta_poc_s1_minus1, LAYOUT__delta_poc_s1_minus1);}
    public short delta_poc_s1_minus1(int index) {return this.delta_poc_s1_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void delta_poc_s1_minus1(int index, short value) {this.delta_poc_s1_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}
}
