package vulkan;

public record StdVideoEncodeH264ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH264ReferenceInfoFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primary_pic_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__primary_pic_type = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__FrameNum = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__FrameNum = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__PicOrderCnt = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__PicOrderCnt = 12;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__long_term_pic_num = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__long_term_pic_num = 16;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__long_term_frame_idx = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__long_term_frame_idx = 18;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__temporal_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__temporal_id = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__primary_pic_type,
            LAYOUT__FrameNum,
            LAYOUT__PicOrderCnt,
            LAYOUT__long_term_pic_num,
            LAYOUT__long_term_frame_idx,
            LAYOUT__temporal_id,
            java.lang.foreign.MemoryLayout.paddingLayout(3)
    ).withByteAlignment(4).withName("StdVideoEncodeH264ReferenceInfo");

    public StdVideoEncodeH264ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264ReferenceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264ReferenceInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264ReferenceInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH264ReferenceInfoFlags flags() {return new vulkan.StdVideoEncodeH264ReferenceInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264ReferenceInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264ReferenceInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int primary_pic_type() {return this.ptr.get(LAYOUT__primary_pic_type, OFFSET__primary_pic_type);}
    public void primary_pic_type(int value) {this.ptr.set(LAYOUT__primary_pic_type, OFFSET__primary_pic_type, value);}
    public java.lang.foreign.MemorySegment $primary_pic_type() {return this.ptr.asSlice(OFFSET__primary_pic_type, LAYOUT__primary_pic_type);}

    public int FrameNum() {return this.ptr.get(LAYOUT__FrameNum, OFFSET__FrameNum);}
    public void FrameNum(int value) {this.ptr.set(LAYOUT__FrameNum, OFFSET__FrameNum, value);}
    public java.lang.foreign.MemorySegment $FrameNum() {return this.ptr.asSlice(OFFSET__FrameNum, LAYOUT__FrameNum);}

    public int PicOrderCnt() {return this.ptr.get(LAYOUT__PicOrderCnt, OFFSET__PicOrderCnt);}
    public void PicOrderCnt(int value) {this.ptr.set(LAYOUT__PicOrderCnt, OFFSET__PicOrderCnt, value);}
    public java.lang.foreign.MemorySegment $PicOrderCnt() {return this.ptr.asSlice(OFFSET__PicOrderCnt, LAYOUT__PicOrderCnt);}

    public short long_term_pic_num() {return this.ptr.get(LAYOUT__long_term_pic_num, OFFSET__long_term_pic_num);}
    public void long_term_pic_num(short value) {this.ptr.set(LAYOUT__long_term_pic_num, OFFSET__long_term_pic_num, value);}
    public java.lang.foreign.MemorySegment $long_term_pic_num() {return this.ptr.asSlice(OFFSET__long_term_pic_num, LAYOUT__long_term_pic_num);}

    public short long_term_frame_idx() {return this.ptr.get(LAYOUT__long_term_frame_idx, OFFSET__long_term_frame_idx);}
    public void long_term_frame_idx(short value) {this.ptr.set(LAYOUT__long_term_frame_idx, OFFSET__long_term_frame_idx, value);}
    public java.lang.foreign.MemorySegment $long_term_frame_idx() {return this.ptr.asSlice(OFFSET__long_term_frame_idx, LAYOUT__long_term_frame_idx);}

    public byte temporal_id() {return this.ptr.get(LAYOUT__temporal_id, OFFSET__temporal_id);}
    public void temporal_id(byte value) {this.ptr.set(LAYOUT__temporal_id, OFFSET__temporal_id, value);}
    public java.lang.foreign.MemorySegment $temporal_id() {return this.ptr.asSlice(OFFSET__temporal_id, LAYOUT__temporal_id);}
}
