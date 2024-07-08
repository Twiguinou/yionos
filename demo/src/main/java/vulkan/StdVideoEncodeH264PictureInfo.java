package vulkan;

public record StdVideoEncodeH264PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH264PictureInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id");
    public static final long OFFSET__seq_parameter_set_id = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id");
    public static final long OFFSET__pic_parameter_set_id = 5;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__idr_pic_id = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("idr_pic_id");
    public static final long OFFSET__idr_pic_id = 6;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__primary_pic_type = java.lang.foreign.ValueLayout.JAVA_INT.withName("primary_pic_type");
    public static final long OFFSET__primary_pic_type = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frame_num = java.lang.foreign.ValueLayout.JAVA_INT.withName("frame_num");
    public static final long OFFSET__frame_num = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__PicOrderCnt = java.lang.foreign.ValueLayout.JAVA_INT.withName("PicOrderCnt");
    public static final long OFFSET__PicOrderCnt = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__temporal_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("temporal_id");
    public static final long OFFSET__temporal_id = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("reserved1");
    public static final long OFFSET__reserved1 = 21;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRefLists = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRefLists");
    public static final long OFFSET__pRefLists = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__seq_parameter_set_id,
            LAYOUT__pic_parameter_set_id,
            LAYOUT__idr_pic_id,
            LAYOUT__primary_pic_type,
            LAYOUT__frame_num,
            LAYOUT__PicOrderCnt,
            LAYOUT__temporal_id,
            LAYOUT__reserved1,
            LAYOUT__pRefLists
    ).withByteAlignment(8).withName("StdVideoEncodeH264PictureInfo");

    public StdVideoEncodeH264PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264PictureInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264PictureInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264PictureInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH264PictureInfoFlags flags() {return new vulkan.StdVideoEncodeH264PictureInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264PictureInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264PictureInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte seq_parameter_set_id() {return this.ptr.get(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id);}
    public void seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__seq_parameter_set_id, LAYOUT__seq_parameter_set_id);}

    public byte pic_parameter_set_id() {return this.ptr.get(LAYOUT__pic_parameter_set_id, OFFSET__pic_parameter_set_id);}
    public void pic_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pic_parameter_set_id, OFFSET__pic_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pic_parameter_set_id() {return this.ptr.asSlice(OFFSET__pic_parameter_set_id, LAYOUT__pic_parameter_set_id);}

    public short idr_pic_id() {return this.ptr.get(LAYOUT__idr_pic_id, OFFSET__idr_pic_id);}
    public void idr_pic_id(short value) {this.ptr.set(LAYOUT__idr_pic_id, OFFSET__idr_pic_id, value);}
    public java.lang.foreign.MemorySegment $idr_pic_id() {return this.ptr.asSlice(OFFSET__idr_pic_id, LAYOUT__idr_pic_id);}

    public int primary_pic_type() {return this.ptr.get(LAYOUT__primary_pic_type, OFFSET__primary_pic_type);}
    public void primary_pic_type(int value) {this.ptr.set(LAYOUT__primary_pic_type, OFFSET__primary_pic_type, value);}
    public java.lang.foreign.MemorySegment $primary_pic_type() {return this.ptr.asSlice(OFFSET__primary_pic_type, LAYOUT__primary_pic_type);}

    public int frame_num() {return this.ptr.get(LAYOUT__frame_num, OFFSET__frame_num);}
    public void frame_num(int value) {this.ptr.set(LAYOUT__frame_num, OFFSET__frame_num, value);}
    public java.lang.foreign.MemorySegment $frame_num() {return this.ptr.asSlice(OFFSET__frame_num, LAYOUT__frame_num);}

    public int PicOrderCnt() {return this.ptr.get(LAYOUT__PicOrderCnt, OFFSET__PicOrderCnt);}
    public void PicOrderCnt(int value) {this.ptr.set(LAYOUT__PicOrderCnt, OFFSET__PicOrderCnt, value);}
    public java.lang.foreign.MemorySegment $PicOrderCnt() {return this.ptr.asSlice(OFFSET__PicOrderCnt, LAYOUT__PicOrderCnt);}

    public byte temporal_id() {return this.ptr.get(LAYOUT__temporal_id, OFFSET__temporal_id);}
    public void temporal_id(byte value) {this.ptr.set(LAYOUT__temporal_id, OFFSET__temporal_id, value);}
    public java.lang.foreign.MemorySegment $temporal_id() {return this.ptr.asSlice(OFFSET__temporal_id, LAYOUT__temporal_id);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}
    public byte reserved1(int index) {return this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void reserved1(int index, byte value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pRefLists() {return this.ptr.get(LAYOUT__pRefLists, OFFSET__pRefLists);}
    public void pRefLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRefLists, OFFSET__pRefLists, value);}
    public java.lang.foreign.MemorySegment $pRefLists() {return this.ptr.asSlice(OFFSET__pRefLists, LAYOUT__pRefLists);}
}
