package vulkan;

public record StdVideoH265PictureParameterSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH265PpsFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_pic_parameter_set_id = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_seq_parameter_set_id = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__sps_video_parameter_set_id = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_extra_slice_header_bits = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_extra_slice_header_bits = 7;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l0_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_ref_idx_l0_default_active_minus1 = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_ref_idx_l1_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_ref_idx_l1_default_active_minus1 = 9;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__init_qp_minus26 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__init_qp_minus26 = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__diff_cu_qp_delta_depth = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__diff_cu_qp_delta_depth = 11;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_cb_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_cb_qp_offset = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_cr_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_cr_qp_offset = 13;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_beta_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_beta_offset_div2 = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_tc_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_tc_offset_div2 = 15;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_parallel_merge_level_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_parallel_merge_level_minus2 = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_max_transform_skip_block_size_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_max_transform_skip_block_size_minus2 = 17;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__diff_cu_chroma_qp_offset_depth = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__diff_cu_chroma_qp_offset_depth = 18;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_qp_offset_list_len_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__chroma_qp_offset_list_len_minus1 = 19;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cb_qp_offset_list = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__cb_qp_offset_list = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__cr_qp_offset_list = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__cr_qp_offset_list = 26;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_sao_offset_scale_luma = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_sao_offset_scale_luma = 32;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_sao_offset_scale_chroma = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_sao_offset_scale_chroma = 33;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_act_y_qp_offset_plus5 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_act_y_qp_offset_plus5 = 34;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_act_cb_qp_offset_plus5 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_act_cb_qp_offset_plus5 = 35;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_act_cr_qp_offset_plus3 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_act_cr_qp_offset_plus3 = 36;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pps_num_palette_predictor_initializers = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__pps_num_palette_predictor_initializers = 37;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__luma_bit_depth_entry_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__luma_bit_depth_entry_minus8 = 38;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_bit_depth_entry_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__chroma_bit_depth_entry_minus8 = 39;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_tile_columns_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_tile_columns_minus1 = 40;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_tile_rows_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_tile_rows_minus1 = 41;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved1 = 42;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved2 = 43;
    public static final java.lang.foreign.SequenceLayout LAYOUT__column_width_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(19, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET__column_width_minus1 = 44;
    public static final java.lang.foreign.SequenceLayout LAYOUT__row_height_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(21, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET__row_height_minus1 = 82;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__reserved3 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__reserved3 = 124;
    public static final java.lang.foreign.AddressLayout LAYOUT__pScalingLists = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pScalingLists = 128;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPredictorPaletteEntries = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pPredictorPaletteEntries = 136;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__pps_pic_parameter_set_id,
            LAYOUT__pps_seq_parameter_set_id,
            LAYOUT__sps_video_parameter_set_id,
            LAYOUT__num_extra_slice_header_bits,
            LAYOUT__num_ref_idx_l0_default_active_minus1,
            LAYOUT__num_ref_idx_l1_default_active_minus1,
            LAYOUT__init_qp_minus26,
            LAYOUT__diff_cu_qp_delta_depth,
            LAYOUT__pps_cb_qp_offset,
            LAYOUT__pps_cr_qp_offset,
            LAYOUT__pps_beta_offset_div2,
            LAYOUT__pps_tc_offset_div2,
            LAYOUT__log2_parallel_merge_level_minus2,
            LAYOUT__log2_max_transform_skip_block_size_minus2,
            LAYOUT__diff_cu_chroma_qp_offset_depth,
            LAYOUT__chroma_qp_offset_list_len_minus1,
            LAYOUT__cb_qp_offset_list,
            LAYOUT__cr_qp_offset_list,
            LAYOUT__log2_sao_offset_scale_luma,
            LAYOUT__log2_sao_offset_scale_chroma,
            LAYOUT__pps_act_y_qp_offset_plus5,
            LAYOUT__pps_act_cb_qp_offset_plus5,
            LAYOUT__pps_act_cr_qp_offset_plus3,
            LAYOUT__pps_num_palette_predictor_initializers,
            LAYOUT__luma_bit_depth_entry_minus8,
            LAYOUT__chroma_bit_depth_entry_minus8,
            LAYOUT__num_tile_columns_minus1,
            LAYOUT__num_tile_rows_minus1,
            LAYOUT__reserved1,
            LAYOUT__reserved2,
            LAYOUT__column_width_minus1,
            LAYOUT__row_height_minus1,
            LAYOUT__reserved3,
            LAYOUT__pScalingLists,
            LAYOUT__pPredictorPaletteEntries
    ).withByteAlignment(8).withName("StdVideoH265PictureParameterSet");

    public StdVideoH265PictureParameterSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265PictureParameterSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265PictureParameterSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265PictureParameterSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH265PpsFlags flags() {return new vulkan.StdVideoH265PpsFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265PpsFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265PpsFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte pps_pic_parameter_set_id() {return this.ptr.get(LAYOUT__pps_pic_parameter_set_id, OFFSET__pps_pic_parameter_set_id);}
    public void pps_pic_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pps_pic_parameter_set_id, OFFSET__pps_pic_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pps_pic_parameter_set_id() {return this.ptr.asSlice(OFFSET__pps_pic_parameter_set_id, LAYOUT__pps_pic_parameter_set_id);}

    public byte pps_seq_parameter_set_id() {return this.ptr.get(LAYOUT__pps_seq_parameter_set_id, OFFSET__pps_seq_parameter_set_id);}
    public void pps_seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__pps_seq_parameter_set_id, OFFSET__pps_seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $pps_seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__pps_seq_parameter_set_id, LAYOUT__pps_seq_parameter_set_id);}

    public byte sps_video_parameter_set_id() {return this.ptr.get(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id);}
    public void sps_video_parameter_set_id(byte value) {this.ptr.set(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $sps_video_parameter_set_id() {return this.ptr.asSlice(OFFSET__sps_video_parameter_set_id, LAYOUT__sps_video_parameter_set_id);}

    public byte num_extra_slice_header_bits() {return this.ptr.get(LAYOUT__num_extra_slice_header_bits, OFFSET__num_extra_slice_header_bits);}
    public void num_extra_slice_header_bits(byte value) {this.ptr.set(LAYOUT__num_extra_slice_header_bits, OFFSET__num_extra_slice_header_bits, value);}
    public java.lang.foreign.MemorySegment $num_extra_slice_header_bits() {return this.ptr.asSlice(OFFSET__num_extra_slice_header_bits, LAYOUT__num_extra_slice_header_bits);}

    public byte num_ref_idx_l0_default_active_minus1() {return this.ptr.get(LAYOUT__num_ref_idx_l0_default_active_minus1, OFFSET__num_ref_idx_l0_default_active_minus1);}
    public void num_ref_idx_l0_default_active_minus1(byte value) {this.ptr.set(LAYOUT__num_ref_idx_l0_default_active_minus1, OFFSET__num_ref_idx_l0_default_active_minus1, value);}
    public java.lang.foreign.MemorySegment $num_ref_idx_l0_default_active_minus1() {return this.ptr.asSlice(OFFSET__num_ref_idx_l0_default_active_minus1, LAYOUT__num_ref_idx_l0_default_active_minus1);}

    public byte num_ref_idx_l1_default_active_minus1() {return this.ptr.get(LAYOUT__num_ref_idx_l1_default_active_minus1, OFFSET__num_ref_idx_l1_default_active_minus1);}
    public void num_ref_idx_l1_default_active_minus1(byte value) {this.ptr.set(LAYOUT__num_ref_idx_l1_default_active_minus1, OFFSET__num_ref_idx_l1_default_active_minus1, value);}
    public java.lang.foreign.MemorySegment $num_ref_idx_l1_default_active_minus1() {return this.ptr.asSlice(OFFSET__num_ref_idx_l1_default_active_minus1, LAYOUT__num_ref_idx_l1_default_active_minus1);}

    public byte init_qp_minus26() {return this.ptr.get(LAYOUT__init_qp_minus26, OFFSET__init_qp_minus26);}
    public void init_qp_minus26(byte value) {this.ptr.set(LAYOUT__init_qp_minus26, OFFSET__init_qp_minus26, value);}
    public java.lang.foreign.MemorySegment $init_qp_minus26() {return this.ptr.asSlice(OFFSET__init_qp_minus26, LAYOUT__init_qp_minus26);}

    public byte diff_cu_qp_delta_depth() {return this.ptr.get(LAYOUT__diff_cu_qp_delta_depth, OFFSET__diff_cu_qp_delta_depth);}
    public void diff_cu_qp_delta_depth(byte value) {this.ptr.set(LAYOUT__diff_cu_qp_delta_depth, OFFSET__diff_cu_qp_delta_depth, value);}
    public java.lang.foreign.MemorySegment $diff_cu_qp_delta_depth() {return this.ptr.asSlice(OFFSET__diff_cu_qp_delta_depth, LAYOUT__diff_cu_qp_delta_depth);}

    public byte pps_cb_qp_offset() {return this.ptr.get(LAYOUT__pps_cb_qp_offset, OFFSET__pps_cb_qp_offset);}
    public void pps_cb_qp_offset(byte value) {this.ptr.set(LAYOUT__pps_cb_qp_offset, OFFSET__pps_cb_qp_offset, value);}
    public java.lang.foreign.MemorySegment $pps_cb_qp_offset() {return this.ptr.asSlice(OFFSET__pps_cb_qp_offset, LAYOUT__pps_cb_qp_offset);}

    public byte pps_cr_qp_offset() {return this.ptr.get(LAYOUT__pps_cr_qp_offset, OFFSET__pps_cr_qp_offset);}
    public void pps_cr_qp_offset(byte value) {this.ptr.set(LAYOUT__pps_cr_qp_offset, OFFSET__pps_cr_qp_offset, value);}
    public java.lang.foreign.MemorySegment $pps_cr_qp_offset() {return this.ptr.asSlice(OFFSET__pps_cr_qp_offset, LAYOUT__pps_cr_qp_offset);}

    public byte pps_beta_offset_div2() {return this.ptr.get(LAYOUT__pps_beta_offset_div2, OFFSET__pps_beta_offset_div2);}
    public void pps_beta_offset_div2(byte value) {this.ptr.set(LAYOUT__pps_beta_offset_div2, OFFSET__pps_beta_offset_div2, value);}
    public java.lang.foreign.MemorySegment $pps_beta_offset_div2() {return this.ptr.asSlice(OFFSET__pps_beta_offset_div2, LAYOUT__pps_beta_offset_div2);}

    public byte pps_tc_offset_div2() {return this.ptr.get(LAYOUT__pps_tc_offset_div2, OFFSET__pps_tc_offset_div2);}
    public void pps_tc_offset_div2(byte value) {this.ptr.set(LAYOUT__pps_tc_offset_div2, OFFSET__pps_tc_offset_div2, value);}
    public java.lang.foreign.MemorySegment $pps_tc_offset_div2() {return this.ptr.asSlice(OFFSET__pps_tc_offset_div2, LAYOUT__pps_tc_offset_div2);}

    public byte log2_parallel_merge_level_minus2() {return this.ptr.get(LAYOUT__log2_parallel_merge_level_minus2, OFFSET__log2_parallel_merge_level_minus2);}
    public void log2_parallel_merge_level_minus2(byte value) {this.ptr.set(LAYOUT__log2_parallel_merge_level_minus2, OFFSET__log2_parallel_merge_level_minus2, value);}
    public java.lang.foreign.MemorySegment $log2_parallel_merge_level_minus2() {return this.ptr.asSlice(OFFSET__log2_parallel_merge_level_minus2, LAYOUT__log2_parallel_merge_level_minus2);}

    public byte log2_max_transform_skip_block_size_minus2() {return this.ptr.get(LAYOUT__log2_max_transform_skip_block_size_minus2, OFFSET__log2_max_transform_skip_block_size_minus2);}
    public void log2_max_transform_skip_block_size_minus2(byte value) {this.ptr.set(LAYOUT__log2_max_transform_skip_block_size_minus2, OFFSET__log2_max_transform_skip_block_size_minus2, value);}
    public java.lang.foreign.MemorySegment $log2_max_transform_skip_block_size_minus2() {return this.ptr.asSlice(OFFSET__log2_max_transform_skip_block_size_minus2, LAYOUT__log2_max_transform_skip_block_size_minus2);}

    public byte diff_cu_chroma_qp_offset_depth() {return this.ptr.get(LAYOUT__diff_cu_chroma_qp_offset_depth, OFFSET__diff_cu_chroma_qp_offset_depth);}
    public void diff_cu_chroma_qp_offset_depth(byte value) {this.ptr.set(LAYOUT__diff_cu_chroma_qp_offset_depth, OFFSET__diff_cu_chroma_qp_offset_depth, value);}
    public java.lang.foreign.MemorySegment $diff_cu_chroma_qp_offset_depth() {return this.ptr.asSlice(OFFSET__diff_cu_chroma_qp_offset_depth, LAYOUT__diff_cu_chroma_qp_offset_depth);}

    public byte chroma_qp_offset_list_len_minus1() {return this.ptr.get(LAYOUT__chroma_qp_offset_list_len_minus1, OFFSET__chroma_qp_offset_list_len_minus1);}
    public void chroma_qp_offset_list_len_minus1(byte value) {this.ptr.set(LAYOUT__chroma_qp_offset_list_len_minus1, OFFSET__chroma_qp_offset_list_len_minus1, value);}
    public java.lang.foreign.MemorySegment $chroma_qp_offset_list_len_minus1() {return this.ptr.asSlice(OFFSET__chroma_qp_offset_list_len_minus1, LAYOUT__chroma_qp_offset_list_len_minus1);}

    public java.lang.foreign.MemorySegment cb_qp_offset_list() {return this.ptr.asSlice(OFFSET__cb_qp_offset_list, LAYOUT__cb_qp_offset_list);}
    public byte cb_qp_offset_list(int index) {return this.cb_qp_offset_list().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cb_qp_offset_list(int index, byte value) {this.cb_qp_offset_list().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment cr_qp_offset_list() {return this.ptr.asSlice(OFFSET__cr_qp_offset_list, LAYOUT__cr_qp_offset_list);}
    public byte cr_qp_offset_list(int index) {return this.cr_qp_offset_list().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void cr_qp_offset_list(int index, byte value) {this.cr_qp_offset_list().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public byte log2_sao_offset_scale_luma() {return this.ptr.get(LAYOUT__log2_sao_offset_scale_luma, OFFSET__log2_sao_offset_scale_luma);}
    public void log2_sao_offset_scale_luma(byte value) {this.ptr.set(LAYOUT__log2_sao_offset_scale_luma, OFFSET__log2_sao_offset_scale_luma, value);}
    public java.lang.foreign.MemorySegment $log2_sao_offset_scale_luma() {return this.ptr.asSlice(OFFSET__log2_sao_offset_scale_luma, LAYOUT__log2_sao_offset_scale_luma);}

    public byte log2_sao_offset_scale_chroma() {return this.ptr.get(LAYOUT__log2_sao_offset_scale_chroma, OFFSET__log2_sao_offset_scale_chroma);}
    public void log2_sao_offset_scale_chroma(byte value) {this.ptr.set(LAYOUT__log2_sao_offset_scale_chroma, OFFSET__log2_sao_offset_scale_chroma, value);}
    public java.lang.foreign.MemorySegment $log2_sao_offset_scale_chroma() {return this.ptr.asSlice(OFFSET__log2_sao_offset_scale_chroma, LAYOUT__log2_sao_offset_scale_chroma);}

    public byte pps_act_y_qp_offset_plus5() {return this.ptr.get(LAYOUT__pps_act_y_qp_offset_plus5, OFFSET__pps_act_y_qp_offset_plus5);}
    public void pps_act_y_qp_offset_plus5(byte value) {this.ptr.set(LAYOUT__pps_act_y_qp_offset_plus5, OFFSET__pps_act_y_qp_offset_plus5, value);}
    public java.lang.foreign.MemorySegment $pps_act_y_qp_offset_plus5() {return this.ptr.asSlice(OFFSET__pps_act_y_qp_offset_plus5, LAYOUT__pps_act_y_qp_offset_plus5);}

    public byte pps_act_cb_qp_offset_plus5() {return this.ptr.get(LAYOUT__pps_act_cb_qp_offset_plus5, OFFSET__pps_act_cb_qp_offset_plus5);}
    public void pps_act_cb_qp_offset_plus5(byte value) {this.ptr.set(LAYOUT__pps_act_cb_qp_offset_plus5, OFFSET__pps_act_cb_qp_offset_plus5, value);}
    public java.lang.foreign.MemorySegment $pps_act_cb_qp_offset_plus5() {return this.ptr.asSlice(OFFSET__pps_act_cb_qp_offset_plus5, LAYOUT__pps_act_cb_qp_offset_plus5);}

    public byte pps_act_cr_qp_offset_plus3() {return this.ptr.get(LAYOUT__pps_act_cr_qp_offset_plus3, OFFSET__pps_act_cr_qp_offset_plus3);}
    public void pps_act_cr_qp_offset_plus3(byte value) {this.ptr.set(LAYOUT__pps_act_cr_qp_offset_plus3, OFFSET__pps_act_cr_qp_offset_plus3, value);}
    public java.lang.foreign.MemorySegment $pps_act_cr_qp_offset_plus3() {return this.ptr.asSlice(OFFSET__pps_act_cr_qp_offset_plus3, LAYOUT__pps_act_cr_qp_offset_plus3);}

    public byte pps_num_palette_predictor_initializers() {return this.ptr.get(LAYOUT__pps_num_palette_predictor_initializers, OFFSET__pps_num_palette_predictor_initializers);}
    public void pps_num_palette_predictor_initializers(byte value) {this.ptr.set(LAYOUT__pps_num_palette_predictor_initializers, OFFSET__pps_num_palette_predictor_initializers, value);}
    public java.lang.foreign.MemorySegment $pps_num_palette_predictor_initializers() {return this.ptr.asSlice(OFFSET__pps_num_palette_predictor_initializers, LAYOUT__pps_num_palette_predictor_initializers);}

    public byte luma_bit_depth_entry_minus8() {return this.ptr.get(LAYOUT__luma_bit_depth_entry_minus8, OFFSET__luma_bit_depth_entry_minus8);}
    public void luma_bit_depth_entry_minus8(byte value) {this.ptr.set(LAYOUT__luma_bit_depth_entry_minus8, OFFSET__luma_bit_depth_entry_minus8, value);}
    public java.lang.foreign.MemorySegment $luma_bit_depth_entry_minus8() {return this.ptr.asSlice(OFFSET__luma_bit_depth_entry_minus8, LAYOUT__luma_bit_depth_entry_minus8);}

    public byte chroma_bit_depth_entry_minus8() {return this.ptr.get(LAYOUT__chroma_bit_depth_entry_minus8, OFFSET__chroma_bit_depth_entry_minus8);}
    public void chroma_bit_depth_entry_minus8(byte value) {this.ptr.set(LAYOUT__chroma_bit_depth_entry_minus8, OFFSET__chroma_bit_depth_entry_minus8, value);}
    public java.lang.foreign.MemorySegment $chroma_bit_depth_entry_minus8() {return this.ptr.asSlice(OFFSET__chroma_bit_depth_entry_minus8, LAYOUT__chroma_bit_depth_entry_minus8);}

    public byte num_tile_columns_minus1() {return this.ptr.get(LAYOUT__num_tile_columns_minus1, OFFSET__num_tile_columns_minus1);}
    public void num_tile_columns_minus1(byte value) {this.ptr.set(LAYOUT__num_tile_columns_minus1, OFFSET__num_tile_columns_minus1, value);}
    public java.lang.foreign.MemorySegment $num_tile_columns_minus1() {return this.ptr.asSlice(OFFSET__num_tile_columns_minus1, LAYOUT__num_tile_columns_minus1);}

    public byte num_tile_rows_minus1() {return this.ptr.get(LAYOUT__num_tile_rows_minus1, OFFSET__num_tile_rows_minus1);}
    public void num_tile_rows_minus1(byte value) {this.ptr.set(LAYOUT__num_tile_rows_minus1, OFFSET__num_tile_rows_minus1, value);}
    public java.lang.foreign.MemorySegment $num_tile_rows_minus1() {return this.ptr.asSlice(OFFSET__num_tile_rows_minus1, LAYOUT__num_tile_rows_minus1);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public byte reserved2() {return this.ptr.get(LAYOUT__reserved2, OFFSET__reserved2);}
    public void reserved2(byte value) {this.ptr.set(LAYOUT__reserved2, OFFSET__reserved2, value);}
    public java.lang.foreign.MemorySegment $reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}

    public java.lang.foreign.MemorySegment column_width_minus1() {return this.ptr.asSlice(OFFSET__column_width_minus1, LAYOUT__column_width_minus1);}
    public short column_width_minus1(int index) {return this.column_width_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void column_width_minus1(int index, short value) {this.column_width_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}

    public java.lang.foreign.MemorySegment row_height_minus1() {return this.ptr.asSlice(OFFSET__row_height_minus1, LAYOUT__row_height_minus1);}
    public short row_height_minus1(int index) {return this.row_height_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index);}
    public void row_height_minus1(int index, short value) {this.row_height_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, index, value);}

    public int reserved3() {return this.ptr.get(LAYOUT__reserved3, OFFSET__reserved3);}
    public void reserved3(int value) {this.ptr.set(LAYOUT__reserved3, OFFSET__reserved3, value);}
    public java.lang.foreign.MemorySegment $reserved3() {return this.ptr.asSlice(OFFSET__reserved3, LAYOUT__reserved3);}

    public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT__pScalingLists, OFFSET__pScalingLists);}
    public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pScalingLists, OFFSET__pScalingLists, value);}
    public java.lang.foreign.MemorySegment $pScalingLists() {return this.ptr.asSlice(OFFSET__pScalingLists, LAYOUT__pScalingLists);}

    public java.lang.foreign.MemorySegment pPredictorPaletteEntries() {return this.ptr.get(LAYOUT__pPredictorPaletteEntries, OFFSET__pPredictorPaletteEntries);}
    public void pPredictorPaletteEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPredictorPaletteEntries, OFFSET__pPredictorPaletteEntries, value);}
    public java.lang.foreign.MemorySegment $pPredictorPaletteEntries() {return this.ptr.asSlice(OFFSET__pPredictorPaletteEntries, LAYOUT__pPredictorPaletteEntries);}
}
