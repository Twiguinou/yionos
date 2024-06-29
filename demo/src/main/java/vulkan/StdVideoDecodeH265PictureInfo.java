package vulkan;

public record StdVideoDecodeH265PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoDecodeH265PictureInfoFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__sps_video_parameter_set_id = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_seq_parameter_set_id = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_pic_parameter_set_id = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__NumDeltaPocsOfRefRpsIdx = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__NumDeltaPocsOfRefRpsIdx = 7;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__PicOrderCntVal = 8;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__NumBitsForSTRefPicSetInSlice = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__NumBitsForSTRefPicSetInSlice = 12;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__reserved = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__reserved = 14;
    public static final java.lang.foreign.SequenceLayout LAYOUT__RefPicSetStCurrBefore = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__RefPicSetStCurrBefore = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__RefPicSetStCurrAfter = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__RefPicSetStCurrAfter = 24;
    public static final java.lang.foreign.SequenceLayout LAYOUT__RefPicSetLtCurr = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__RefPicSetLtCurr = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__sps_video_parameter_set_id,
            LAYOUT__pps_seq_parameter_set_id,
            LAYOUT__pps_pic_parameter_set_id,
            LAYOUT__NumDeltaPocsOfRefRpsIdx,
            LAYOUT__PicOrderCntVal,
            LAYOUT__NumBitsForSTRefPicSetInSlice,
            LAYOUT__reserved,
            LAYOUT__RefPicSetStCurrBefore,
            LAYOUT__RefPicSetStCurrAfter,
            LAYOUT__RefPicSetLtCurr
    ).withByteAlignment(4).withName("StdVideoDecodeH265PictureInfo");

    public StdVideoDecodeH265PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoDecodeH265PictureInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoDecodeH265PictureInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoDecodeH265PictureInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoDecodeH265PictureInfoFlags flags() {return new vulkan.StdVideoDecodeH265PictureInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoDecodeH265PictureInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoDecodeH265PictureInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte sps_video_parameter_set_id() {return this.ptr.get(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id);}
    public void sps_video_parameter_set_id(byte value) {this.ptr.set(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $sps_video_parameter_set_id() {return this.ptr.asSlice(OFFSET__sps_video_parameter_set_id, LAYOUT__sps_video_parameter_set_id);}

    public byte pps_seq_parameter_set_id() {return this.ptr.get(LAYOUT__pps_seq_parameter_set_id, OFFSET__pps_seq_parameter_set_id);}
    public void pps_seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pps_seq_parameter_set_id, OFFSET__pps_seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pps_seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__pps_seq_parameter_set_id, LAYOUT__pps_seq_parameter_set_id);}

    public byte pps_pic_parameter_set_id() {return this.ptr.get(LAYOUT__pps_pic_parameter_set_id, OFFSET__pps_pic_parameter_set_id);}
    public void pps_pic_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pps_pic_parameter_set_id, OFFSET__pps_pic_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pps_pic_parameter_set_id() {return this.ptr.asSlice(OFFSET__pps_pic_parameter_set_id, LAYOUT__pps_pic_parameter_set_id);}

    public byte NumDeltaPocsOfRefRpsIdx() {return this.ptr.get(LAYOUT__NumDeltaPocsOfRefRpsIdx, OFFSET__NumDeltaPocsOfRefRpsIdx);}
    public void NumDeltaPocsOfRefRpsIdx(byte value) {this.ptr.set(LAYOUT__NumDeltaPocsOfRefRpsIdx, OFFSET__NumDeltaPocsOfRefRpsIdx, value);}
    public java.lang.foreign.MemorySegment $NumDeltaPocsOfRefRpsIdx() {return this.ptr.asSlice(OFFSET__NumDeltaPocsOfRefRpsIdx, LAYOUT__NumDeltaPocsOfRefRpsIdx);}

    public int PicOrderCntVal() {return this.ptr.get(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal);}
    public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal, value);}
    public java.lang.foreign.MemorySegment $PicOrderCntVal() {return this.ptr.asSlice(OFFSET__PicOrderCntVal, LAYOUT__PicOrderCntVal);}

    public short NumBitsForSTRefPicSetInSlice() {return this.ptr.get(LAYOUT__NumBitsForSTRefPicSetInSlice, OFFSET__NumBitsForSTRefPicSetInSlice);}
    public void NumBitsForSTRefPicSetInSlice(short value) {this.ptr.set(LAYOUT__NumBitsForSTRefPicSetInSlice, OFFSET__NumBitsForSTRefPicSetInSlice, value);}
    public java.lang.foreign.MemorySegment $NumBitsForSTRefPicSetInSlice() {return this.ptr.asSlice(OFFSET__NumBitsForSTRefPicSetInSlice, LAYOUT__NumBitsForSTRefPicSetInSlice);}

    public short reserved() {return this.ptr.get(LAYOUT__reserved, OFFSET__reserved);}
    public void reserved(short value) {this.ptr.set(LAYOUT__reserved, OFFSET__reserved, value);}
    public java.lang.foreign.MemorySegment $reserved() {return this.ptr.asSlice(OFFSET__reserved, LAYOUT__reserved);}

    public java.lang.foreign.MemorySegment RefPicSetStCurrBefore() {return this.ptr.asSlice(OFFSET__RefPicSetStCurrBefore, LAYOUT__RefPicSetStCurrBefore);}
    public byte RefPicSetStCurrBefore(int index) {return this.RefPicSetStCurrBefore().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void RefPicSetStCurrBefore(int index, byte value) {this.RefPicSetStCurrBefore().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment RefPicSetStCurrAfter() {return this.ptr.asSlice(OFFSET__RefPicSetStCurrAfter, LAYOUT__RefPicSetStCurrAfter);}
    public byte RefPicSetStCurrAfter(int index) {return this.RefPicSetStCurrAfter().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void RefPicSetStCurrAfter(int index, byte value) {this.RefPicSetStCurrAfter().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment RefPicSetLtCurr() {return this.ptr.asSlice(OFFSET__RefPicSetLtCurr, LAYOUT__RefPicSetLtCurr);}
    public byte RefPicSetLtCurr(int index) {return this.RefPicSetLtCurr().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void RefPicSetLtCurr(int index, byte value) {this.RefPicSetLtCurr().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
