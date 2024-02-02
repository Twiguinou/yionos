package vulkan;

public record StdVideoEncodeH264ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH264ReferenceInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primary_pic_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primary_pic_type = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$FrameNum = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$FrameNum = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$PicOrderCnt = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$PicOrderCnt = 12L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$long_term_pic_num = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$long_term_pic_num = 16L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$long_term_frame_idx = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$long_term_frame_idx = 18L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$temporal_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$temporal_id = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$primary_pic_type,
            LAYOUT$FrameNum,
            LAYOUT$PicOrderCnt,
            LAYOUT$long_term_pic_num,
            LAYOUT$long_term_frame_idx,
            LAYOUT$temporal_id,
            java.lang.foreign.MemoryLayout.paddingLayout(3)
    ).withName("StdVideoEncodeH264ReferenceInfo");

    public StdVideoEncodeH264ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264ReferenceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264ReferenceInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH264ReferenceInfoFlags flags() {return new vulkan.StdVideoEncodeH264ReferenceInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264ReferenceInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264ReferenceInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public int primary_pic_type() {return this.ptr.get(LAYOUT$primary_pic_type, OFFSET$primary_pic_type);}
    public void primary_pic_type(int value) {this.ptr.set(LAYOUT$primary_pic_type, OFFSET$primary_pic_type, value);}
    public java.lang.foreign.MemorySegment primary_pic_type_ptr() {return this.ptr.asSlice(OFFSET$primary_pic_type, LAYOUT$primary_pic_type);}

    public int FrameNum() {return this.ptr.get(LAYOUT$FrameNum, OFFSET$FrameNum);}
    public void FrameNum(int value) {this.ptr.set(LAYOUT$FrameNum, OFFSET$FrameNum, value);}
    public java.lang.foreign.MemorySegment FrameNum_ptr() {return this.ptr.asSlice(OFFSET$FrameNum, LAYOUT$FrameNum);}

    public int PicOrderCnt() {return this.ptr.get(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt);}
    public void PicOrderCnt(int value) {this.ptr.set(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt, value);}
    public java.lang.foreign.MemorySegment PicOrderCnt_ptr() {return this.ptr.asSlice(OFFSET$PicOrderCnt, LAYOUT$PicOrderCnt);}

    public short long_term_pic_num() {return this.ptr.get(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num);}
    public void long_term_pic_num(short value) {this.ptr.set(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num, value);}
    public java.lang.foreign.MemorySegment long_term_pic_num_ptr() {return this.ptr.asSlice(OFFSET$long_term_pic_num, LAYOUT$long_term_pic_num);}

    public short long_term_frame_idx() {return this.ptr.get(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx);}
    public void long_term_frame_idx(short value) {this.ptr.set(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx, value);}
    public java.lang.foreign.MemorySegment long_term_frame_idx_ptr() {return this.ptr.asSlice(OFFSET$long_term_frame_idx, LAYOUT$long_term_frame_idx);}

    public char temporal_id() {return (char)this.ptr.get(LAYOUT$temporal_id, OFFSET$temporal_id);}
    public void temporal_id(char value) {this.ptr.set(LAYOUT$temporal_id, OFFSET$temporal_id, (byte)value);}
    public java.lang.foreign.MemorySegment temporal_id_ptr() {return this.ptr.asSlice(OFFSET$temporal_id, LAYOUT$temporal_id);}
}
