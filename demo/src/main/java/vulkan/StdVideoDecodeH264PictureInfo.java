package vulkan;

public record StdVideoDecodeH264PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoDecodeH264PictureInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id");
    public static final long OFFSET__seq_parameter_set_id = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id");
    public static final long OFFSET__pic_parameter_set_id = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final long OFFSET__reserved1 = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("reserved2");
    public static final long OFFSET__reserved2 = 7;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__frame_num = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("frame_num");
    public static final long OFFSET__frame_num = 8;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__idr_pic_id = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("idr_pic_id");
    public static final long OFFSET__idr_pic_id = 10;
    public static final java.lang.foreign.SequenceLayout LAYOUT__PicOrderCnt = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT).withName("PicOrderCnt");
    public static final long OFFSET__PicOrderCnt = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__seq_parameter_set_id,
            LAYOUT__pic_parameter_set_id,
            LAYOUT__reserved1,
            LAYOUT__reserved2,
            LAYOUT__frame_num,
            LAYOUT__idr_pic_id,
            LAYOUT__PicOrderCnt
    ).withByteAlignment(4).withName("StdVideoDecodeH264PictureInfo");

    public StdVideoDecodeH264PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoDecodeH264PictureInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoDecodeH264PictureInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoDecodeH264PictureInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoDecodeH264PictureInfoFlags flags() {return new vulkan.StdVideoDecodeH264PictureInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoDecodeH264PictureInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoDecodeH264PictureInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte seq_parameter_set_id() {return this.ptr.get(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id);}
    public void seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__seq_parameter_set_id, LAYOUT__seq_parameter_set_id);}

    public byte pic_parameter_set_id() {return this.ptr.get(LAYOUT__pic_parameter_set_id, OFFSET__pic_parameter_set_id);}
    public void pic_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pic_parameter_set_id, OFFSET__pic_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pic_parameter_set_id() {return this.ptr.asSlice(OFFSET__pic_parameter_set_id, LAYOUT__pic_parameter_set_id);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public byte reserved2() {return this.ptr.get(LAYOUT__reserved2, OFFSET__reserved2);}
    public void reserved2(byte value) {this.ptr.set(LAYOUT__reserved2, OFFSET__reserved2, value);}
    public java.lang.foreign.MemorySegment $reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}

    public short frame_num() {return this.ptr.get(LAYOUT__frame_num, OFFSET__frame_num);}
    public void frame_num(short value) {this.ptr.set(LAYOUT__frame_num, OFFSET__frame_num, value);}
    public java.lang.foreign.MemorySegment $frame_num() {return this.ptr.asSlice(OFFSET__frame_num, LAYOUT__frame_num);}

    public short idr_pic_id() {return this.ptr.get(LAYOUT__idr_pic_id, OFFSET__idr_pic_id);}
    public void idr_pic_id(short value) {this.ptr.set(LAYOUT__idr_pic_id, OFFSET__idr_pic_id, value);}
    public java.lang.foreign.MemorySegment $idr_pic_id() {return this.ptr.asSlice(OFFSET__idr_pic_id, LAYOUT__idr_pic_id);}

    public java.lang.foreign.MemorySegment PicOrderCnt() {return this.ptr.asSlice(OFFSET__PicOrderCnt, LAYOUT__PicOrderCnt);}
    public int PicOrderCnt(int index) {return this.PicOrderCnt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void PicOrderCnt(int index, int value) {this.PicOrderCnt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}
}
