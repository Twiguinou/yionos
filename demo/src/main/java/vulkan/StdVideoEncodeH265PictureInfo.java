package vulkan;

public record StdVideoEncodeH265PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH265PictureInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pic_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pic_type = 4L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$sps_video_parameter_set_id = 8L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pps_seq_parameter_set_id = 9L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pps_pic_parameter_set_id = 10L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$short_term_ref_pic_set_idx = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$short_term_ref_pic_set_idx = 11L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$PicOrderCntVal = 12L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$TemporalId = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$TemporalId = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$reserved1 = 17L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRefLists = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRefLists = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pShortTermRefPicSet = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pShortTermRefPicSet = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pLongTermRefPics = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pLongTermRefPics = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$pic_type,
            LAYOUT$sps_video_parameter_set_id,
            LAYOUT$pps_seq_parameter_set_id,
            LAYOUT$pps_pic_parameter_set_id,
            LAYOUT$short_term_ref_pic_set_idx,
            LAYOUT$PicOrderCntVal,
            LAYOUT$TemporalId,
            LAYOUT$reserved1,
            LAYOUT$pRefLists,
            LAYOUT$pShortTermRefPicSet,
            LAYOUT$pLongTermRefPics
    ).withName("StdVideoEncodeH265PictureInfo");

    public StdVideoEncodeH265PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265PictureInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265PictureInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH265PictureInfoFlags flags() {return new vulkan.StdVideoEncodeH265PictureInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265PictureInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265PictureInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public int pic_type() {return this.ptr.get(LAYOUT$pic_type, OFFSET$pic_type);}
    public void pic_type(int value) {this.ptr.set(LAYOUT$pic_type, OFFSET$pic_type, value);}
    public java.lang.foreign.MemorySegment pic_type_ptr() {return this.ptr.asSlice(OFFSET$pic_type, LAYOUT$pic_type);}

    public char sps_video_parameter_set_id() {return (char)this.ptr.get(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id);}
    public void sps_video_parameter_set_id(char value) {this.ptr.set(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment sps_video_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$sps_video_parameter_set_id, LAYOUT$sps_video_parameter_set_id);}

    public char pps_seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id);}
    public void pps_seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment pps_seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pps_seq_parameter_set_id, LAYOUT$pps_seq_parameter_set_id);}

    public char pps_pic_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id);}
    public void pps_pic_parameter_set_id(char value) {this.ptr.set(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment pps_pic_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pps_pic_parameter_set_id, LAYOUT$pps_pic_parameter_set_id);}

    public char short_term_ref_pic_set_idx() {return (char)this.ptr.get(LAYOUT$short_term_ref_pic_set_idx, OFFSET$short_term_ref_pic_set_idx);}
    public void short_term_ref_pic_set_idx(char value) {this.ptr.set(LAYOUT$short_term_ref_pic_set_idx, OFFSET$short_term_ref_pic_set_idx, (byte)value);}
    public java.lang.foreign.MemorySegment short_term_ref_pic_set_idx_ptr() {return this.ptr.asSlice(OFFSET$short_term_ref_pic_set_idx, LAYOUT$short_term_ref_pic_set_idx);}

    public int PicOrderCntVal() {return this.ptr.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);}
    public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);}
    public java.lang.foreign.MemorySegment PicOrderCntVal_ptr() {return this.ptr.asSlice(OFFSET$PicOrderCntVal, LAYOUT$PicOrderCntVal);}

    public char TemporalId() {return (char)this.ptr.get(LAYOUT$TemporalId, OFFSET$TemporalId);}
    public void TemporalId(char value) {this.ptr.set(LAYOUT$TemporalId, OFFSET$TemporalId, (byte)value);}
    public java.lang.foreign.MemorySegment TemporalId_ptr() {return this.ptr.asSlice(OFFSET$TemporalId, LAYOUT$TemporalId);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}
    public char reserved1(int i) {return (char)this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void reserved1(int i, char value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment pRefLists() {return this.ptr.get(LAYOUT$pRefLists, OFFSET$pRefLists);}
    public void pRefLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRefLists, OFFSET$pRefLists, value);}
    public java.lang.foreign.MemorySegment pRefLists_ptr() {return this.ptr.asSlice(OFFSET$pRefLists, LAYOUT$pRefLists);}

    public java.lang.foreign.MemorySegment pShortTermRefPicSet() {return this.ptr.get(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet);}
    public void pShortTermRefPicSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet, value);}
    public java.lang.foreign.MemorySegment pShortTermRefPicSet_ptr() {return this.ptr.asSlice(OFFSET$pShortTermRefPicSet, LAYOUT$pShortTermRefPicSet);}

    public java.lang.foreign.MemorySegment pLongTermRefPics() {return this.ptr.get(LAYOUT$pLongTermRefPics, OFFSET$pLongTermRefPics);}
    public void pLongTermRefPics(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pLongTermRefPics, OFFSET$pLongTermRefPics, value);}
    public java.lang.foreign.MemorySegment pLongTermRefPics_ptr() {return this.ptr.asSlice(OFFSET$pLongTermRefPics, LAYOUT$pLongTermRefPics);}
}
