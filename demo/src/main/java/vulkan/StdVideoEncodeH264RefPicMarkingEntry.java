package vulkan;

public record StdVideoEncodeH264RefPicMarkingEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memory_management_control_operation = java.lang.foreign.ValueLayout.JAVA_INT.withName("memory_management_control_operation");
    public static final long OFFSET__memory_management_control_operation = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__difference_of_pic_nums_minus1 = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("difference_of_pic_nums_minus1");
    public static final long OFFSET__difference_of_pic_nums_minus1 = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__long_term_pic_num = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("long_term_pic_num");
    public static final long OFFSET__long_term_pic_num = 6;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__long_term_frame_idx = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("long_term_frame_idx");
    public static final long OFFSET__long_term_frame_idx = 8;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__max_long_term_frame_idx_plus1 = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("max_long_term_frame_idx_plus1");
    public static final long OFFSET__max_long_term_frame_idx_plus1 = 10;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__memory_management_control_operation,
            LAYOUT__difference_of_pic_nums_minus1,
            LAYOUT__long_term_pic_num,
            LAYOUT__long_term_frame_idx,
            LAYOUT__max_long_term_frame_idx_plus1
    ).withByteAlignment(4).withName("StdVideoEncodeH264RefPicMarkingEntry");

    public StdVideoEncodeH264RefPicMarkingEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264RefPicMarkingEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264RefPicMarkingEntry(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264RefPicMarkingEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int memory_management_control_operation() {return this.ptr.get(LAYOUT__memory_management_control_operation, OFFSET__memory_management_control_operation);}
    public void memory_management_control_operation(int value) {this.ptr.set(LAYOUT__memory_management_control_operation, OFFSET__memory_management_control_operation, value);}
    public java.lang.foreign.MemorySegment $memory_management_control_operation() {return this.ptr.asSlice(OFFSET__memory_management_control_operation, LAYOUT__memory_management_control_operation);}

    public short difference_of_pic_nums_minus1() {return this.ptr.get(LAYOUT__difference_of_pic_nums_minus1, OFFSET__difference_of_pic_nums_minus1);}
    public void difference_of_pic_nums_minus1(short value) {this.ptr.set(LAYOUT__difference_of_pic_nums_minus1, OFFSET__difference_of_pic_nums_minus1, value);}
    public java.lang.foreign.MemorySegment $difference_of_pic_nums_minus1() {return this.ptr.asSlice(OFFSET__difference_of_pic_nums_minus1, LAYOUT__difference_of_pic_nums_minus1);}

    public short long_term_pic_num() {return this.ptr.get(LAYOUT__long_term_pic_num, OFFSET__long_term_pic_num);}
    public void long_term_pic_num(short value) {this.ptr.set(LAYOUT__long_term_pic_num, OFFSET__long_term_pic_num, value);}
    public java.lang.foreign.MemorySegment $long_term_pic_num() {return this.ptr.asSlice(OFFSET__long_term_pic_num, LAYOUT__long_term_pic_num);}

    public short long_term_frame_idx() {return this.ptr.get(LAYOUT__long_term_frame_idx, OFFSET__long_term_frame_idx);}
    public void long_term_frame_idx(short value) {this.ptr.set(LAYOUT__long_term_frame_idx, OFFSET__long_term_frame_idx, value);}
    public java.lang.foreign.MemorySegment $long_term_frame_idx() {return this.ptr.asSlice(OFFSET__long_term_frame_idx, LAYOUT__long_term_frame_idx);}

    public short max_long_term_frame_idx_plus1() {return this.ptr.get(LAYOUT__max_long_term_frame_idx_plus1, OFFSET__max_long_term_frame_idx_plus1);}
    public void max_long_term_frame_idx_plus1(short value) {this.ptr.set(LAYOUT__max_long_term_frame_idx_plus1, OFFSET__max_long_term_frame_idx_plus1, value);}
    public java.lang.foreign.MemorySegment $max_long_term_frame_idx_plus1() {return this.ptr.asSlice(OFFSET__max_long_term_frame_idx_plus1, LAYOUT__max_long_term_frame_idx_plus1);}
}
