package vulkan;

public record StdVideoEncodeH265PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH265PictureInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pic_type = java.lang.foreign.ValueLayout.JAVA_INT.withName("pic_type");
    public static final long OFFSET__pic_type = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id");
    public static final long OFFSET__sps_video_parameter_set_id = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id");
    public static final long OFFSET__pps_seq_parameter_set_id = 9;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id");
    public static final long OFFSET__pps_pic_parameter_set_id = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__short_term_ref_pic_set_idx = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("short_term_ref_pic_set_idx");
    public static final long OFFSET__short_term_ref_pic_set_idx = 11;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT.withName("PicOrderCntVal");
    public static final long OFFSET__PicOrderCntVal = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__TemporalId = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("TemporalId");
    public static final long OFFSET__TemporalId = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("reserved1");
    public static final long OFFSET__reserved1 = 17;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRefLists = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRefLists");
    public static final long OFFSET__pRefLists = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pShortTermRefPicSet = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pShortTermRefPicSet");
    public static final long OFFSET__pShortTermRefPicSet = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLongTermRefPics = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pLongTermRefPics");
    public static final long OFFSET__pLongTermRefPics = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__pic_type,
            LAYOUT__sps_video_parameter_set_id,
            LAYOUT__pps_seq_parameter_set_id,
            LAYOUT__pps_pic_parameter_set_id,
            LAYOUT__short_term_ref_pic_set_idx,
            LAYOUT__PicOrderCntVal,
            LAYOUT__TemporalId,
            LAYOUT__reserved1,
            LAYOUT__pRefLists,
            LAYOUT__pShortTermRefPicSet,
            LAYOUT__pLongTermRefPics
    ).withByteAlignment(8).withName("StdVideoEncodeH265PictureInfo");

    public StdVideoEncodeH265PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH265PictureInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH265PictureInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH265PictureInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH265PictureInfoFlags flags() {return new vulkan.StdVideoEncodeH265PictureInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265PictureInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265PictureInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int pic_type() {return this.ptr.get(LAYOUT__pic_type, OFFSET__pic_type);}
    public void pic_type(int value) {this.ptr.set(LAYOUT__pic_type, OFFSET__pic_type, value);}
    public java.lang.foreign.MemorySegment $pic_type() {return this.ptr.asSlice(OFFSET__pic_type, LAYOUT__pic_type);}

    public byte sps_video_parameter_set_id() {return this.ptr.get(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id);}
    public void sps_video_parameter_set_id(byte value) {this.ptr.set(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $sps_video_parameter_set_id() {return this.ptr.asSlice(OFFSET__sps_video_parameter_set_id, LAYOUT__sps_video_parameter_set_id);}

    public byte pps_seq_parameter_set_id() {return this.ptr.get(LAYOUT__pps_seq_parameter_set_id, OFFSET__pps_seq_parameter_set_id);}
    public void pps_seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pps_seq_parameter_set_id, OFFSET__pps_seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pps_seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__pps_seq_parameter_set_id, LAYOUT__pps_seq_parameter_set_id);}

    public byte pps_pic_parameter_set_id() {return this.ptr.get(LAYOUT__pps_pic_parameter_set_id, OFFSET__pps_pic_parameter_set_id);}
    public void pps_pic_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pps_pic_parameter_set_id, OFFSET__pps_pic_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pps_pic_parameter_set_id() {return this.ptr.asSlice(OFFSET__pps_pic_parameter_set_id, LAYOUT__pps_pic_parameter_set_id);}

    public byte short_term_ref_pic_set_idx() {return this.ptr.get(LAYOUT__short_term_ref_pic_set_idx, OFFSET__short_term_ref_pic_set_idx);}
    public void short_term_ref_pic_set_idx(byte value) {this.ptr.set(LAYOUT__short_term_ref_pic_set_idx, OFFSET__short_term_ref_pic_set_idx, value);}
    public java.lang.foreign.MemorySegment $short_term_ref_pic_set_idx() {return this.ptr.asSlice(OFFSET__short_term_ref_pic_set_idx, LAYOUT__short_term_ref_pic_set_idx);}

    public int PicOrderCntVal() {return this.ptr.get(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal);}
    public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal, value);}
    public java.lang.foreign.MemorySegment $PicOrderCntVal() {return this.ptr.asSlice(OFFSET__PicOrderCntVal, LAYOUT__PicOrderCntVal);}

    public byte TemporalId() {return this.ptr.get(LAYOUT__TemporalId, OFFSET__TemporalId);}
    public void TemporalId(byte value) {this.ptr.set(LAYOUT__TemporalId, OFFSET__TemporalId, value);}
    public java.lang.foreign.MemorySegment $TemporalId() {return this.ptr.asSlice(OFFSET__TemporalId, LAYOUT__TemporalId);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}
    public byte reserved1(int index) {return this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void reserved1(int index, byte value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pRefLists() {return this.ptr.get(LAYOUT__pRefLists, OFFSET__pRefLists);}
    public void pRefLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRefLists, OFFSET__pRefLists, value);}
    public java.lang.foreign.MemorySegment $pRefLists() {return this.ptr.asSlice(OFFSET__pRefLists, LAYOUT__pRefLists);}

    public java.lang.foreign.MemorySegment pShortTermRefPicSet() {return this.ptr.get(LAYOUT__pShortTermRefPicSet, OFFSET__pShortTermRefPicSet);}
    public void pShortTermRefPicSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pShortTermRefPicSet, OFFSET__pShortTermRefPicSet, value);}
    public java.lang.foreign.MemorySegment $pShortTermRefPicSet() {return this.ptr.asSlice(OFFSET__pShortTermRefPicSet, LAYOUT__pShortTermRefPicSet);}

    public java.lang.foreign.MemorySegment pLongTermRefPics() {return this.ptr.get(LAYOUT__pLongTermRefPics, OFFSET__pLongTermRefPics);}
    public void pLongTermRefPics(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLongTermRefPics, OFFSET__pLongTermRefPics, value);}
    public java.lang.foreign.MemorySegment $pLongTermRefPics() {return this.ptr.asSlice(OFFSET__pLongTermRefPics, LAYOUT__pLongTermRefPics);}
}
