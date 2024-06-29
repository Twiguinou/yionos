package vulkan;

public record StdVideoEncodeH264RefListModEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__modification_of_pic_nums_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__modification_of_pic_nums_idc = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__abs_diff_pic_num_minus1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__abs_diff_pic_num_minus1 = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__long_term_pic_num = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__long_term_pic_num = 6;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__modification_of_pic_nums_idc,
            LAYOUT__abs_diff_pic_num_minus1,
            LAYOUT__long_term_pic_num
    ).withByteAlignment(4).withName("StdVideoEncodeH264RefListModEntry");

    public StdVideoEncodeH264RefListModEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264RefListModEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264RefListModEntry(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264RefListModEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int modification_of_pic_nums_idc() {return this.ptr.get(LAYOUT__modification_of_pic_nums_idc, OFFSET__modification_of_pic_nums_idc);}
    public void modification_of_pic_nums_idc(int value) {this.ptr.set(LAYOUT__modification_of_pic_nums_idc, OFFSET__modification_of_pic_nums_idc, value);}
    public java.lang.foreign.MemorySegment $modification_of_pic_nums_idc() {return this.ptr.asSlice(OFFSET__modification_of_pic_nums_idc, LAYOUT__modification_of_pic_nums_idc);}

    public short abs_diff_pic_num_minus1() {return this.ptr.get(LAYOUT__abs_diff_pic_num_minus1, OFFSET__abs_diff_pic_num_minus1);}
    public void abs_diff_pic_num_minus1(short value) {this.ptr.set(LAYOUT__abs_diff_pic_num_minus1, OFFSET__abs_diff_pic_num_minus1, value);}
    public java.lang.foreign.MemorySegment $abs_diff_pic_num_minus1() {return this.ptr.asSlice(OFFSET__abs_diff_pic_num_minus1, LAYOUT__abs_diff_pic_num_minus1);}

    public short long_term_pic_num() {return this.ptr.get(LAYOUT__long_term_pic_num, OFFSET__long_term_pic_num);}
    public void long_term_pic_num(short value) {this.ptr.set(LAYOUT__long_term_pic_num, OFFSET__long_term_pic_num, value);}
    public java.lang.foreign.MemorySegment $long_term_pic_num() {return this.ptr.asSlice(OFFSET__long_term_pic_num, LAYOUT__long_term_pic_num);}
}
