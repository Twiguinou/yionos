package vulkan;

public record StdVideoEncodeH264RefPicMarkingEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memory_management_control_operation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memory_management_control_operation = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$difference_of_pic_nums_minus1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$difference_of_pic_nums_minus1 = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$long_term_pic_num = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$long_term_pic_num = 6L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$long_term_frame_idx = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$long_term_frame_idx = 8L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$max_long_term_frame_idx_plus1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$max_long_term_frame_idx_plus1 = 10L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$memory_management_control_operation,
            LAYOUT$difference_of_pic_nums_minus1,
            LAYOUT$long_term_pic_num,
            LAYOUT$long_term_frame_idx,
            LAYOUT$max_long_term_frame_idx_plus1
    ).withName("StdVideoEncodeH264RefPicMarkingEntry");

    public StdVideoEncodeH264RefPicMarkingEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264RefPicMarkingEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264RefPicMarkingEntry(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int memory_management_control_operation() {return this.ptr.get(LAYOUT$memory_management_control_operation, OFFSET$memory_management_control_operation);}
    public void memory_management_control_operation(int value) {this.ptr.set(LAYOUT$memory_management_control_operation, OFFSET$memory_management_control_operation, value);}
    public java.lang.foreign.MemorySegment memory_management_control_operation_ptr() {return this.ptr.asSlice(OFFSET$memory_management_control_operation, LAYOUT$memory_management_control_operation);}

    public short difference_of_pic_nums_minus1() {return this.ptr.get(LAYOUT$difference_of_pic_nums_minus1, OFFSET$difference_of_pic_nums_minus1);}
    public void difference_of_pic_nums_minus1(short value) {this.ptr.set(LAYOUT$difference_of_pic_nums_minus1, OFFSET$difference_of_pic_nums_minus1, value);}
    public java.lang.foreign.MemorySegment difference_of_pic_nums_minus1_ptr() {return this.ptr.asSlice(OFFSET$difference_of_pic_nums_minus1, LAYOUT$difference_of_pic_nums_minus1);}

    public short long_term_pic_num() {return this.ptr.get(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num);}
    public void long_term_pic_num(short value) {this.ptr.set(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num, value);}
    public java.lang.foreign.MemorySegment long_term_pic_num_ptr() {return this.ptr.asSlice(OFFSET$long_term_pic_num, LAYOUT$long_term_pic_num);}

    public short long_term_frame_idx() {return this.ptr.get(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx);}
    public void long_term_frame_idx(short value) {this.ptr.set(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx, value);}
    public java.lang.foreign.MemorySegment long_term_frame_idx_ptr() {return this.ptr.asSlice(OFFSET$long_term_frame_idx, LAYOUT$long_term_frame_idx);}

    public short max_long_term_frame_idx_plus1() {return this.ptr.get(LAYOUT$max_long_term_frame_idx_plus1, OFFSET$max_long_term_frame_idx_plus1);}
    public void max_long_term_frame_idx_plus1(short value) {this.ptr.set(LAYOUT$max_long_term_frame_idx_plus1, OFFSET$max_long_term_frame_idx_plus1, value);}
    public java.lang.foreign.MemorySegment max_long_term_frame_idx_plus1_ptr() {return this.ptr.asSlice(OFFSET$max_long_term_frame_idx_plus1, LAYOUT$max_long_term_frame_idx_plus1);}
}
