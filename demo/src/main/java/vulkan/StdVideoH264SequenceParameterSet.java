package vulkan;

public record StdVideoH264SequenceParameterSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH264SpsFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__profile_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__profile_idc = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__level_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__level_idc = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chroma_format_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__chroma_format_idc = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__seq_parameter_set_id = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__bit_depth_luma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__bit_depth_luma_minus8 = 17;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__bit_depth_chroma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__bit_depth_chroma_minus8 = 18;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_max_frame_num_minus4 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_max_frame_num_minus4 = 19;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pic_order_cnt_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pic_order_cnt_type = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__offset_for_non_ref_pic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__offset_for_non_ref_pic = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__offset_for_top_to_bottom_field = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__offset_for_top_to_bottom_field = 28;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_max_pic_order_cnt_lsb_minus4 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_max_pic_order_cnt_lsb_minus4 = 32;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_frames_in_pic_order_cnt_cycle = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_ref_frames_in_pic_order_cnt_cycle = 33;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__max_num_ref_frames = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__max_num_ref_frames = 34;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved1 = 35;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pic_width_in_mbs_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pic_width_in_mbs_minus1 = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pic_height_in_map_units_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pic_height_in_map_units_minus1 = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frame_crop_left_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frame_crop_left_offset = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frame_crop_right_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frame_crop_right_offset = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frame_crop_top_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frame_crop_top_offset = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frame_crop_bottom_offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__frame_crop_bottom_offset = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__reserved2 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__reserved2 = 60;
    public static final java.lang.foreign.AddressLayout LAYOUT__pOffsetForRefFrame = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pOffsetForRefFrame = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pScalingLists = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pScalingLists = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSequenceParameterSetVui = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSequenceParameterSetVui = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__profile_idc,
            LAYOUT__level_idc,
            LAYOUT__chroma_format_idc,
            LAYOUT__seq_parameter_set_id,
            LAYOUT__bit_depth_luma_minus8,
            LAYOUT__bit_depth_chroma_minus8,
            LAYOUT__log2_max_frame_num_minus4,
            LAYOUT__pic_order_cnt_type,
            LAYOUT__offset_for_non_ref_pic,
            LAYOUT__offset_for_top_to_bottom_field,
            LAYOUT__log2_max_pic_order_cnt_lsb_minus4,
            LAYOUT__num_ref_frames_in_pic_order_cnt_cycle,
            LAYOUT__max_num_ref_frames,
            LAYOUT__reserved1,
            LAYOUT__pic_width_in_mbs_minus1,
            LAYOUT__pic_height_in_map_units_minus1,
            LAYOUT__frame_crop_left_offset,
            LAYOUT__frame_crop_right_offset,
            LAYOUT__frame_crop_top_offset,
            LAYOUT__frame_crop_bottom_offset,
            LAYOUT__reserved2,
            LAYOUT__pOffsetForRefFrame,
            LAYOUT__pScalingLists,
            LAYOUT__pSequenceParameterSetVui
    ).withByteAlignment(8).withName("StdVideoH264SequenceParameterSet");

    public StdVideoH264SequenceParameterSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH264SequenceParameterSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH264SequenceParameterSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH264SequenceParameterSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH264SpsFlags flags() {return new vulkan.StdVideoH264SpsFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH264SpsFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH264SpsFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int profile_idc() {return this.ptr.get(LAYOUT__profile_idc, OFFSET__profile_idc);}
    public void profile_idc(int value) {this.ptr.set(LAYOUT__profile_idc, OFFSET__profile_idc, value);}
    public java.lang.foreign.MemorySegment $profile_idc() {return this.ptr.asSlice(OFFSET__profile_idc, LAYOUT__profile_idc);}

    public int level_idc() {return this.ptr.get(LAYOUT__level_idc, OFFSET__level_idc);}
    public void level_idc(int value) {this.ptr.set(LAYOUT__level_idc, OFFSET__level_idc, value);}
    public java.lang.foreign.MemorySegment $level_idc() {return this.ptr.asSlice(OFFSET__level_idc, LAYOUT__level_idc);}

    public int chroma_format_idc() {return this.ptr.get(LAYOUT__chroma_format_idc, OFFSET__chroma_format_idc);}
    public void chroma_format_idc(int value) {this.ptr.set(LAYOUT__chroma_format_idc, OFFSET__chroma_format_idc, value);}
    public java.lang.foreign.MemorySegment $chroma_format_idc() {return this.ptr.asSlice(OFFSET__chroma_format_idc, LAYOUT__chroma_format_idc);}

    public byte seq_parameter_set_id() {return this.ptr.get(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id);}
    public void seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__seq_parameter_set_id, OFFSET__seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__seq_parameter_set_id, LAYOUT__seq_parameter_set_id);}

    public byte bit_depth_luma_minus8() {return this.ptr.get(LAYOUT__bit_depth_luma_minus8, OFFSET__bit_depth_luma_minus8);}
    public void bit_depth_luma_minus8(byte value) {this.ptr.set(LAYOUT__bit_depth_luma_minus8, OFFSET__bit_depth_luma_minus8, value);}
    public java.lang.foreign.MemorySegment $bit_depth_luma_minus8() {return this.ptr.asSlice(OFFSET__bit_depth_luma_minus8, LAYOUT__bit_depth_luma_minus8);}

    public byte bit_depth_chroma_minus8() {return this.ptr.get(LAYOUT__bit_depth_chroma_minus8, OFFSET__bit_depth_chroma_minus8);}
    public void bit_depth_chroma_minus8(byte value) {this.ptr.set(LAYOUT__bit_depth_chroma_minus8, OFFSET__bit_depth_chroma_minus8, value);}
    public java.lang.foreign.MemorySegment $bit_depth_chroma_minus8() {return this.ptr.asSlice(OFFSET__bit_depth_chroma_minus8, LAYOUT__bit_depth_chroma_minus8);}

    public byte log2_max_frame_num_minus4() {return this.ptr.get(LAYOUT__log2_max_frame_num_minus4, OFFSET__log2_max_frame_num_minus4);}
    public void log2_max_frame_num_minus4(byte value) {this.ptr.set(LAYOUT__log2_max_frame_num_minus4, OFFSET__log2_max_frame_num_minus4, value);}
    public java.lang.foreign.MemorySegment $log2_max_frame_num_minus4() {return this.ptr.asSlice(OFFSET__log2_max_frame_num_minus4, LAYOUT__log2_max_frame_num_minus4);}

    public int pic_order_cnt_type() {return this.ptr.get(LAYOUT__pic_order_cnt_type, OFFSET__pic_order_cnt_type);}
    public void pic_order_cnt_type(int value) {this.ptr.set(LAYOUT__pic_order_cnt_type, OFFSET__pic_order_cnt_type, value);}
    public java.lang.foreign.MemorySegment $pic_order_cnt_type() {return this.ptr.asSlice(OFFSET__pic_order_cnt_type, LAYOUT__pic_order_cnt_type);}

    public int offset_for_non_ref_pic() {return this.ptr.get(LAYOUT__offset_for_non_ref_pic, OFFSET__offset_for_non_ref_pic);}
    public void offset_for_non_ref_pic(int value) {this.ptr.set(LAYOUT__offset_for_non_ref_pic, OFFSET__offset_for_non_ref_pic, value);}
    public java.lang.foreign.MemorySegment $offset_for_non_ref_pic() {return this.ptr.asSlice(OFFSET__offset_for_non_ref_pic, LAYOUT__offset_for_non_ref_pic);}

    public int offset_for_top_to_bottom_field() {return this.ptr.get(LAYOUT__offset_for_top_to_bottom_field, OFFSET__offset_for_top_to_bottom_field);}
    public void offset_for_top_to_bottom_field(int value) {this.ptr.set(LAYOUT__offset_for_top_to_bottom_field, OFFSET__offset_for_top_to_bottom_field, value);}
    public java.lang.foreign.MemorySegment $offset_for_top_to_bottom_field() {return this.ptr.asSlice(OFFSET__offset_for_top_to_bottom_field, LAYOUT__offset_for_top_to_bottom_field);}

    public byte log2_max_pic_order_cnt_lsb_minus4() {return this.ptr.get(LAYOUT__log2_max_pic_order_cnt_lsb_minus4, OFFSET__log2_max_pic_order_cnt_lsb_minus4);}
    public void log2_max_pic_order_cnt_lsb_minus4(byte value) {this.ptr.set(LAYOUT__log2_max_pic_order_cnt_lsb_minus4, OFFSET__log2_max_pic_order_cnt_lsb_minus4, value);}
    public java.lang.foreign.MemorySegment $log2_max_pic_order_cnt_lsb_minus4() {return this.ptr.asSlice(OFFSET__log2_max_pic_order_cnt_lsb_minus4, LAYOUT__log2_max_pic_order_cnt_lsb_minus4);}

    public byte num_ref_frames_in_pic_order_cnt_cycle() {return this.ptr.get(LAYOUT__num_ref_frames_in_pic_order_cnt_cycle, OFFSET__num_ref_frames_in_pic_order_cnt_cycle);}
    public void num_ref_frames_in_pic_order_cnt_cycle(byte value) {this.ptr.set(LAYOUT__num_ref_frames_in_pic_order_cnt_cycle, OFFSET__num_ref_frames_in_pic_order_cnt_cycle, value);}
    public java.lang.foreign.MemorySegment $num_ref_frames_in_pic_order_cnt_cycle() {return this.ptr.asSlice(OFFSET__num_ref_frames_in_pic_order_cnt_cycle, LAYOUT__num_ref_frames_in_pic_order_cnt_cycle);}

    public byte max_num_ref_frames() {return this.ptr.get(LAYOUT__max_num_ref_frames, OFFSET__max_num_ref_frames);}
    public void max_num_ref_frames(byte value) {this.ptr.set(LAYOUT__max_num_ref_frames, OFFSET__max_num_ref_frames, value);}
    public java.lang.foreign.MemorySegment $max_num_ref_frames() {return this.ptr.asSlice(OFFSET__max_num_ref_frames, LAYOUT__max_num_ref_frames);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public int pic_width_in_mbs_minus1() {return this.ptr.get(LAYOUT__pic_width_in_mbs_minus1, OFFSET__pic_width_in_mbs_minus1);}
    public void pic_width_in_mbs_minus1(int value) {this.ptr.set(LAYOUT__pic_width_in_mbs_minus1, OFFSET__pic_width_in_mbs_minus1, value);}
    public java.lang.foreign.MemorySegment $pic_width_in_mbs_minus1() {return this.ptr.asSlice(OFFSET__pic_width_in_mbs_minus1, LAYOUT__pic_width_in_mbs_minus1);}

    public int pic_height_in_map_units_minus1() {return this.ptr.get(LAYOUT__pic_height_in_map_units_minus1, OFFSET__pic_height_in_map_units_minus1);}
    public void pic_height_in_map_units_minus1(int value) {this.ptr.set(LAYOUT__pic_height_in_map_units_minus1, OFFSET__pic_height_in_map_units_minus1, value);}
    public java.lang.foreign.MemorySegment $pic_height_in_map_units_minus1() {return this.ptr.asSlice(OFFSET__pic_height_in_map_units_minus1, LAYOUT__pic_height_in_map_units_minus1);}

    public int frame_crop_left_offset() {return this.ptr.get(LAYOUT__frame_crop_left_offset, OFFSET__frame_crop_left_offset);}
    public void frame_crop_left_offset(int value) {this.ptr.set(LAYOUT__frame_crop_left_offset, OFFSET__frame_crop_left_offset, value);}
    public java.lang.foreign.MemorySegment $frame_crop_left_offset() {return this.ptr.asSlice(OFFSET__frame_crop_left_offset, LAYOUT__frame_crop_left_offset);}

    public int frame_crop_right_offset() {return this.ptr.get(LAYOUT__frame_crop_right_offset, OFFSET__frame_crop_right_offset);}
    public void frame_crop_right_offset(int value) {this.ptr.set(LAYOUT__frame_crop_right_offset, OFFSET__frame_crop_right_offset, value);}
    public java.lang.foreign.MemorySegment $frame_crop_right_offset() {return this.ptr.asSlice(OFFSET__frame_crop_right_offset, LAYOUT__frame_crop_right_offset);}

    public int frame_crop_top_offset() {return this.ptr.get(LAYOUT__frame_crop_top_offset, OFFSET__frame_crop_top_offset);}
    public void frame_crop_top_offset(int value) {this.ptr.set(LAYOUT__frame_crop_top_offset, OFFSET__frame_crop_top_offset, value);}
    public java.lang.foreign.MemorySegment $frame_crop_top_offset() {return this.ptr.asSlice(OFFSET__frame_crop_top_offset, LAYOUT__frame_crop_top_offset);}

    public int frame_crop_bottom_offset() {return this.ptr.get(LAYOUT__frame_crop_bottom_offset, OFFSET__frame_crop_bottom_offset);}
    public void frame_crop_bottom_offset(int value) {this.ptr.set(LAYOUT__frame_crop_bottom_offset, OFFSET__frame_crop_bottom_offset, value);}
    public java.lang.foreign.MemorySegment $frame_crop_bottom_offset() {return this.ptr.asSlice(OFFSET__frame_crop_bottom_offset, LAYOUT__frame_crop_bottom_offset);}

    public int reserved2() {return this.ptr.get(LAYOUT__reserved2, OFFSET__reserved2);}
    public void reserved2(int value) {this.ptr.set(LAYOUT__reserved2, OFFSET__reserved2, value);}
    public java.lang.foreign.MemorySegment $reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}

    public java.lang.foreign.MemorySegment pOffsetForRefFrame() {return this.ptr.get(LAYOUT__pOffsetForRefFrame, OFFSET__pOffsetForRefFrame);}
    public void pOffsetForRefFrame(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pOffsetForRefFrame, OFFSET__pOffsetForRefFrame, value);}
    public java.lang.foreign.MemorySegment $pOffsetForRefFrame() {return this.ptr.asSlice(OFFSET__pOffsetForRefFrame, LAYOUT__pOffsetForRefFrame);}

    public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT__pScalingLists, OFFSET__pScalingLists);}
    public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pScalingLists, OFFSET__pScalingLists, value);}
    public java.lang.foreign.MemorySegment $pScalingLists() {return this.ptr.asSlice(OFFSET__pScalingLists, LAYOUT__pScalingLists);}

    public java.lang.foreign.MemorySegment pSequenceParameterSetVui() {return this.ptr.get(LAYOUT__pSequenceParameterSetVui, OFFSET__pSequenceParameterSetVui);}
    public void pSequenceParameterSetVui(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSequenceParameterSetVui, OFFSET__pSequenceParameterSetVui, value);}
    public java.lang.foreign.MemorySegment $pSequenceParameterSetVui() {return this.ptr.asSlice(OFFSET__pSequenceParameterSetVui, LAYOUT__pSequenceParameterSetVui);}
}
