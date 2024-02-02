package vulkan;

public record StdVideoEncodeH264RefListModEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$modification_of_pic_nums_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$modification_of_pic_nums_idc = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$abs_diff_pic_num_minus1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$abs_diff_pic_num_minus1 = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$long_term_pic_num = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$long_term_pic_num = 6L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$modification_of_pic_nums_idc,
            LAYOUT$abs_diff_pic_num_minus1,
            LAYOUT$long_term_pic_num
    ).withName("StdVideoEncodeH264RefListModEntry");

    public StdVideoEncodeH264RefListModEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264RefListModEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264RefListModEntry(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int modification_of_pic_nums_idc() {return this.ptr.get(LAYOUT$modification_of_pic_nums_idc, OFFSET$modification_of_pic_nums_idc);}
    public void modification_of_pic_nums_idc(int value) {this.ptr.set(LAYOUT$modification_of_pic_nums_idc, OFFSET$modification_of_pic_nums_idc, value);}
    public java.lang.foreign.MemorySegment modification_of_pic_nums_idc_ptr() {return this.ptr.asSlice(OFFSET$modification_of_pic_nums_idc, LAYOUT$modification_of_pic_nums_idc);}

    public short abs_diff_pic_num_minus1() {return this.ptr.get(LAYOUT$abs_diff_pic_num_minus1, OFFSET$abs_diff_pic_num_minus1);}
    public void abs_diff_pic_num_minus1(short value) {this.ptr.set(LAYOUT$abs_diff_pic_num_minus1, OFFSET$abs_diff_pic_num_minus1, value);}
    public java.lang.foreign.MemorySegment abs_diff_pic_num_minus1_ptr() {return this.ptr.asSlice(OFFSET$abs_diff_pic_num_minus1, LAYOUT$abs_diff_pic_num_minus1);}

    public short long_term_pic_num() {return this.ptr.get(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num);}
    public void long_term_pic_num(short value) {this.ptr.set(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num, value);}
    public java.lang.foreign.MemorySegment long_term_pic_num_ptr() {return this.ptr.asSlice(OFFSET$long_term_pic_num, LAYOUT$long_term_pic_num);}
}
