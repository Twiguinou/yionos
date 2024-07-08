package vulkan;

public record StdVideoH265SequenceParameterSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH265SpsFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chroma_format_idc = java.lang.foreign.ValueLayout.JAVA_INT.withName("chroma_format_idc");
    public static final long OFFSET__chroma_format_idc = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pic_width_in_luma_samples = java.lang.foreign.ValueLayout.JAVA_INT.withName("pic_width_in_luma_samples");
    public static final long OFFSET__pic_width_in_luma_samples = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pic_height_in_luma_samples = java.lang.foreign.ValueLayout.JAVA_INT.withName("pic_height_in_luma_samples");
    public static final long OFFSET__pic_height_in_luma_samples = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id");
    public static final long OFFSET__sps_video_parameter_set_id = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sps_max_sub_layers_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("sps_max_sub_layers_minus1");
    public static final long OFFSET__sps_max_sub_layers_minus1 = 17;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("sps_seq_parameter_set_id");
    public static final long OFFSET__sps_seq_parameter_set_id = 18;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__bit_depth_luma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("bit_depth_luma_minus8");
    public static final long OFFSET__bit_depth_luma_minus8 = 19;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__bit_depth_chroma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("bit_depth_chroma_minus8");
    public static final long OFFSET__bit_depth_chroma_minus8 = 20;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_max_pic_order_cnt_lsb_minus4 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4");
    public static final long OFFSET__log2_max_pic_order_cnt_lsb_minus4 = 21;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_min_luma_coding_block_size_minus3 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("log2_min_luma_coding_block_size_minus3");
    public static final long OFFSET__log2_min_luma_coding_block_size_minus3 = 22;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_diff_max_min_luma_coding_block_size = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_coding_block_size");
    public static final long OFFSET__log2_diff_max_min_luma_coding_block_size = 23;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_min_luma_transform_block_size_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("log2_min_luma_transform_block_size_minus2");
    public static final long OFFSET__log2_min_luma_transform_block_size_minus2 = 24;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_diff_max_min_luma_transform_block_size = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_transform_block_size");
    public static final long OFFSET__log2_diff_max_min_luma_transform_block_size = 25;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__max_transform_hierarchy_depth_inter = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_inter");
    public static final long OFFSET__max_transform_hierarchy_depth_inter = 26;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__max_transform_hierarchy_depth_intra = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_intra");
    public static final long OFFSET__max_transform_hierarchy_depth_intra = 27;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_short_term_ref_pic_sets = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("num_short_term_ref_pic_sets");
    public static final long OFFSET__num_short_term_ref_pic_sets = 28;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_long_term_ref_pics_sps = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("num_long_term_ref_pics_sps");
    public static final long OFFSET__num_long_term_ref_pics_sps = 29;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pcm_sample_bit_depth_luma_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_luma_minus1");
    public static final long OFFSET__pcm_sample_bit_depth_luma_minus1 = 30;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__pcm_sample_bit_depth_chroma_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_chroma_minus1");
    public static final long OFFSET__pcm_sample_bit_depth_chroma_minus1 = 31;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_min_pcm_luma_coding_block_size_minus3 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("log2_min_pcm_luma_coding_block_size_minus3");
    public static final long OFFSET__log2_min_pcm_luma_coding_block_size_minus3 = 32;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_diff_max_min_pcm_luma_coding_block_size = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_pcm_luma_coding_block_size");
    public static final long OFFSET__log2_diff_max_min_pcm_luma_coding_block_size = 33;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final long OFFSET__reserved1 = 34;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("reserved2");
    public static final long OFFSET__reserved2 = 35;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__palette_max_size = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("palette_max_size");
    public static final long OFFSET__palette_max_size = 36;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__delta_palette_max_predictor_size = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("delta_palette_max_predictor_size");
    public static final long OFFSET__delta_palette_max_predictor_size = 37;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__motion_vector_resolution_control_idc = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("motion_vector_resolution_control_idc");
    public static final long OFFSET__motion_vector_resolution_control_idc = 38;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sps_num_palette_predictor_initializers_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("sps_num_palette_predictor_initializers_minus1");
    public static final long OFFSET__sps_num_palette_predictor_initializers_minus1 = 39;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conf_win_left_offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("conf_win_left_offset");
    public static final long OFFSET__conf_win_left_offset = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conf_win_right_offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("conf_win_right_offset");
    public static final long OFFSET__conf_win_right_offset = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conf_win_top_offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("conf_win_top_offset");
    public static final long OFFSET__conf_win_top_offset = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conf_win_bottom_offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("conf_win_bottom_offset");
    public static final long OFFSET__conf_win_bottom_offset = 52;
    public static final java.lang.foreign.AddressLayout LAYOUT__pProfileTierLevel = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pProfileTierLevel");
    public static final long OFFSET__pProfileTierLevel = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDecPicBufMgr = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDecPicBufMgr");
    public static final long OFFSET__pDecPicBufMgr = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pScalingLists = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pScalingLists");
    public static final long OFFSET__pScalingLists = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pShortTermRefPicSet = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pShortTermRefPicSet");
    public static final long OFFSET__pShortTermRefPicSet = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLongTermRefPicsSps = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pLongTermRefPicsSps");
    public static final long OFFSET__pLongTermRefPicsSps = 88;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSequenceParameterSetVui = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSequenceParameterSetVui");
    public static final long OFFSET__pSequenceParameterSetVui = 96;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPredictorPaletteEntries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPredictorPaletteEntries");
    public static final long OFFSET__pPredictorPaletteEntries = 104;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__chroma_format_idc,
            LAYOUT__pic_width_in_luma_samples,
            LAYOUT__pic_height_in_luma_samples,
            LAYOUT__sps_video_parameter_set_id,
            LAYOUT__sps_max_sub_layers_minus1,
            LAYOUT__sps_seq_parameter_set_id,
            LAYOUT__bit_depth_luma_minus8,
            LAYOUT__bit_depth_chroma_minus8,
            LAYOUT__log2_max_pic_order_cnt_lsb_minus4,
            LAYOUT__log2_min_luma_coding_block_size_minus3,
            LAYOUT__log2_diff_max_min_luma_coding_block_size,
            LAYOUT__log2_min_luma_transform_block_size_minus2,
            LAYOUT__log2_diff_max_min_luma_transform_block_size,
            LAYOUT__max_transform_hierarchy_depth_inter,
            LAYOUT__max_transform_hierarchy_depth_intra,
            LAYOUT__num_short_term_ref_pic_sets,
            LAYOUT__num_long_term_ref_pics_sps,
            LAYOUT__pcm_sample_bit_depth_luma_minus1,
            LAYOUT__pcm_sample_bit_depth_chroma_minus1,
            LAYOUT__log2_min_pcm_luma_coding_block_size_minus3,
            LAYOUT__log2_diff_max_min_pcm_luma_coding_block_size,
            LAYOUT__reserved1,
            LAYOUT__reserved2,
            LAYOUT__palette_max_size,
            LAYOUT__delta_palette_max_predictor_size,
            LAYOUT__motion_vector_resolution_control_idc,
            LAYOUT__sps_num_palette_predictor_initializers_minus1,
            LAYOUT__conf_win_left_offset,
            LAYOUT__conf_win_right_offset,
            LAYOUT__conf_win_top_offset,
            LAYOUT__conf_win_bottom_offset,
            LAYOUT__pProfileTierLevel,
            LAYOUT__pDecPicBufMgr,
            LAYOUT__pScalingLists,
            LAYOUT__pShortTermRefPicSet,
            LAYOUT__pLongTermRefPicsSps,
            LAYOUT__pSequenceParameterSetVui,
            LAYOUT__pPredictorPaletteEntries
    ).withByteAlignment(8).withName("StdVideoH265SequenceParameterSet");

    public StdVideoH265SequenceParameterSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265SequenceParameterSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265SequenceParameterSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265SequenceParameterSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH265SpsFlags flags() {return new vulkan.StdVideoH265SpsFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265SpsFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265SpsFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int chroma_format_idc() {return this.ptr.get(LAYOUT__chroma_format_idc, OFFSET__chroma_format_idc);}
    public void chroma_format_idc(int value) {this.ptr.set(LAYOUT__chroma_format_idc, OFFSET__chroma_format_idc, value);}
    public java.lang.foreign.MemorySegment $chroma_format_idc() {return this.ptr.asSlice(OFFSET__chroma_format_idc, LAYOUT__chroma_format_idc);}

    public int pic_width_in_luma_samples() {return this.ptr.get(LAYOUT__pic_width_in_luma_samples, OFFSET__pic_width_in_luma_samples);}
    public void pic_width_in_luma_samples(int value) {this.ptr.set(LAYOUT__pic_width_in_luma_samples, OFFSET__pic_width_in_luma_samples, value);}
    public java.lang.foreign.MemorySegment $pic_width_in_luma_samples() {return this.ptr.asSlice(OFFSET__pic_width_in_luma_samples, LAYOUT__pic_width_in_luma_samples);}

    public int pic_height_in_luma_samples() {return this.ptr.get(LAYOUT__pic_height_in_luma_samples, OFFSET__pic_height_in_luma_samples);}
    public void pic_height_in_luma_samples(int value) {this.ptr.set(LAYOUT__pic_height_in_luma_samples, OFFSET__pic_height_in_luma_samples, value);}
    public java.lang.foreign.MemorySegment $pic_height_in_luma_samples() {return this.ptr.asSlice(OFFSET__pic_height_in_luma_samples, LAYOUT__pic_height_in_luma_samples);}

    public byte sps_video_parameter_set_id() {return this.ptr.get(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id);}
    public void sps_video_parameter_set_id(byte value) {this.ptr.set(LAYOUT__sps_video_parameter_set_id, OFFSET__sps_video_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $sps_video_parameter_set_id() {return this.ptr.asSlice(OFFSET__sps_video_parameter_set_id, LAYOUT__sps_video_parameter_set_id);}

    public byte sps_max_sub_layers_minus1() {return this.ptr.get(LAYOUT__sps_max_sub_layers_minus1, OFFSET__sps_max_sub_layers_minus1);}
    public void sps_max_sub_layers_minus1(byte value) {this.ptr.set(LAYOUT__sps_max_sub_layers_minus1, OFFSET__sps_max_sub_layers_minus1, value);}
    public java.lang.foreign.MemorySegment $sps_max_sub_layers_minus1() {return this.ptr.asSlice(OFFSET__sps_max_sub_layers_minus1, LAYOUT__sps_max_sub_layers_minus1);}

    public byte sps_seq_parameter_set_id() {return this.ptr.get(LAYOUT__sps_seq_parameter_set_id, OFFSET__sps_seq_parameter_set_id);}
    public void sps_seq_parameter_set_id(byte value) {this.ptr.set(LAYOUT__sps_seq_parameter_set_id, OFFSET__sps_seq_parameter_set_id, value);}
    public java.lang.foreign.MemorySegment $sps_seq_parameter_set_id() {return this.ptr.asSlice(OFFSET__sps_seq_parameter_set_id, LAYOUT__sps_seq_parameter_set_id);}

    public byte bit_depth_luma_minus8() {return this.ptr.get(LAYOUT__bit_depth_luma_minus8, OFFSET__bit_depth_luma_minus8);}
    public void bit_depth_luma_minus8(byte value) {this.ptr.set(LAYOUT__bit_depth_luma_minus8, OFFSET__bit_depth_luma_minus8, value);}
    public java.lang.foreign.MemorySegment $bit_depth_luma_minus8() {return this.ptr.asSlice(OFFSET__bit_depth_luma_minus8, LAYOUT__bit_depth_luma_minus8);}

    public byte bit_depth_chroma_minus8() {return this.ptr.get(LAYOUT__bit_depth_chroma_minus8, OFFSET__bit_depth_chroma_minus8);}
    public void bit_depth_chroma_minus8(byte value) {this.ptr.set(LAYOUT__bit_depth_chroma_minus8, OFFSET__bit_depth_chroma_minus8, value);}
    public java.lang.foreign.MemorySegment $bit_depth_chroma_minus8() {return this.ptr.asSlice(OFFSET__bit_depth_chroma_minus8, LAYOUT__bit_depth_chroma_minus8);}

    public byte log2_max_pic_order_cnt_lsb_minus4() {return this.ptr.get(LAYOUT__log2_max_pic_order_cnt_lsb_minus4, OFFSET__log2_max_pic_order_cnt_lsb_minus4);}
    public void log2_max_pic_order_cnt_lsb_minus4(byte value) {this.ptr.set(LAYOUT__log2_max_pic_order_cnt_lsb_minus4, OFFSET__log2_max_pic_order_cnt_lsb_minus4, value);}
    public java.lang.foreign.MemorySegment $log2_max_pic_order_cnt_lsb_minus4() {return this.ptr.asSlice(OFFSET__log2_max_pic_order_cnt_lsb_minus4, LAYOUT__log2_max_pic_order_cnt_lsb_minus4);}

    public byte log2_min_luma_coding_block_size_minus3() {return this.ptr.get(LAYOUT__log2_min_luma_coding_block_size_minus3, OFFSET__log2_min_luma_coding_block_size_minus3);}
    public void log2_min_luma_coding_block_size_minus3(byte value) {this.ptr.set(LAYOUT__log2_min_luma_coding_block_size_minus3, OFFSET__log2_min_luma_coding_block_size_minus3, value);}
    public java.lang.foreign.MemorySegment $log2_min_luma_coding_block_size_minus3() {return this.ptr.asSlice(OFFSET__log2_min_luma_coding_block_size_minus3, LAYOUT__log2_min_luma_coding_block_size_minus3);}

    public byte log2_diff_max_min_luma_coding_block_size() {return this.ptr.get(LAYOUT__log2_diff_max_min_luma_coding_block_size, OFFSET__log2_diff_max_min_luma_coding_block_size);}
    public void log2_diff_max_min_luma_coding_block_size(byte value) {this.ptr.set(LAYOUT__log2_diff_max_min_luma_coding_block_size, OFFSET__log2_diff_max_min_luma_coding_block_size, value);}
    public java.lang.foreign.MemorySegment $log2_diff_max_min_luma_coding_block_size() {return this.ptr.asSlice(OFFSET__log2_diff_max_min_luma_coding_block_size, LAYOUT__log2_diff_max_min_luma_coding_block_size);}

    public byte log2_min_luma_transform_block_size_minus2() {return this.ptr.get(LAYOUT__log2_min_luma_transform_block_size_minus2, OFFSET__log2_min_luma_transform_block_size_minus2);}
    public void log2_min_luma_transform_block_size_minus2(byte value) {this.ptr.set(LAYOUT__log2_min_luma_transform_block_size_minus2, OFFSET__log2_min_luma_transform_block_size_minus2, value);}
    public java.lang.foreign.MemorySegment $log2_min_luma_transform_block_size_minus2() {return this.ptr.asSlice(OFFSET__log2_min_luma_transform_block_size_minus2, LAYOUT__log2_min_luma_transform_block_size_minus2);}

    public byte log2_diff_max_min_luma_transform_block_size() {return this.ptr.get(LAYOUT__log2_diff_max_min_luma_transform_block_size, OFFSET__log2_diff_max_min_luma_transform_block_size);}
    public void log2_diff_max_min_luma_transform_block_size(byte value) {this.ptr.set(LAYOUT__log2_diff_max_min_luma_transform_block_size, OFFSET__log2_diff_max_min_luma_transform_block_size, value);}
    public java.lang.foreign.MemorySegment $log2_diff_max_min_luma_transform_block_size() {return this.ptr.asSlice(OFFSET__log2_diff_max_min_luma_transform_block_size, LAYOUT__log2_diff_max_min_luma_transform_block_size);}

    public byte max_transform_hierarchy_depth_inter() {return this.ptr.get(LAYOUT__max_transform_hierarchy_depth_inter, OFFSET__max_transform_hierarchy_depth_inter);}
    public void max_transform_hierarchy_depth_inter(byte value) {this.ptr.set(LAYOUT__max_transform_hierarchy_depth_inter, OFFSET__max_transform_hierarchy_depth_inter, value);}
    public java.lang.foreign.MemorySegment $max_transform_hierarchy_depth_inter() {return this.ptr.asSlice(OFFSET__max_transform_hierarchy_depth_inter, LAYOUT__max_transform_hierarchy_depth_inter);}

    public byte max_transform_hierarchy_depth_intra() {return this.ptr.get(LAYOUT__max_transform_hierarchy_depth_intra, OFFSET__max_transform_hierarchy_depth_intra);}
    public void max_transform_hierarchy_depth_intra(byte value) {this.ptr.set(LAYOUT__max_transform_hierarchy_depth_intra, OFFSET__max_transform_hierarchy_depth_intra, value);}
    public java.lang.foreign.MemorySegment $max_transform_hierarchy_depth_intra() {return this.ptr.asSlice(OFFSET__max_transform_hierarchy_depth_intra, LAYOUT__max_transform_hierarchy_depth_intra);}

    public byte num_short_term_ref_pic_sets() {return this.ptr.get(LAYOUT__num_short_term_ref_pic_sets, OFFSET__num_short_term_ref_pic_sets);}
    public void num_short_term_ref_pic_sets(byte value) {this.ptr.set(LAYOUT__num_short_term_ref_pic_sets, OFFSET__num_short_term_ref_pic_sets, value);}
    public java.lang.foreign.MemorySegment $num_short_term_ref_pic_sets() {return this.ptr.asSlice(OFFSET__num_short_term_ref_pic_sets, LAYOUT__num_short_term_ref_pic_sets);}

    public byte num_long_term_ref_pics_sps() {return this.ptr.get(LAYOUT__num_long_term_ref_pics_sps, OFFSET__num_long_term_ref_pics_sps);}
    public void num_long_term_ref_pics_sps(byte value) {this.ptr.set(LAYOUT__num_long_term_ref_pics_sps, OFFSET__num_long_term_ref_pics_sps, value);}
    public java.lang.foreign.MemorySegment $num_long_term_ref_pics_sps() {return this.ptr.asSlice(OFFSET__num_long_term_ref_pics_sps, LAYOUT__num_long_term_ref_pics_sps);}

    public byte pcm_sample_bit_depth_luma_minus1() {return this.ptr.get(LAYOUT__pcm_sample_bit_depth_luma_minus1, OFFSET__pcm_sample_bit_depth_luma_minus1);}
    public void pcm_sample_bit_depth_luma_minus1(byte value) {this.ptr.set(LAYOUT__pcm_sample_bit_depth_luma_minus1, OFFSET__pcm_sample_bit_depth_luma_minus1, value);}
    public java.lang.foreign.MemorySegment $pcm_sample_bit_depth_luma_minus1() {return this.ptr.asSlice(OFFSET__pcm_sample_bit_depth_luma_minus1, LAYOUT__pcm_sample_bit_depth_luma_minus1);}

    public byte pcm_sample_bit_depth_chroma_minus1() {return this.ptr.get(LAYOUT__pcm_sample_bit_depth_chroma_minus1, OFFSET__pcm_sample_bit_depth_chroma_minus1);}
    public void pcm_sample_bit_depth_chroma_minus1(byte value) {this.ptr.set(LAYOUT__pcm_sample_bit_depth_chroma_minus1, OFFSET__pcm_sample_bit_depth_chroma_minus1, value);}
    public java.lang.foreign.MemorySegment $pcm_sample_bit_depth_chroma_minus1() {return this.ptr.asSlice(OFFSET__pcm_sample_bit_depth_chroma_minus1, LAYOUT__pcm_sample_bit_depth_chroma_minus1);}

    public byte log2_min_pcm_luma_coding_block_size_minus3() {return this.ptr.get(LAYOUT__log2_min_pcm_luma_coding_block_size_minus3, OFFSET__log2_min_pcm_luma_coding_block_size_minus3);}
    public void log2_min_pcm_luma_coding_block_size_minus3(byte value) {this.ptr.set(LAYOUT__log2_min_pcm_luma_coding_block_size_minus3, OFFSET__log2_min_pcm_luma_coding_block_size_minus3, value);}
    public java.lang.foreign.MemorySegment $log2_min_pcm_luma_coding_block_size_minus3() {return this.ptr.asSlice(OFFSET__log2_min_pcm_luma_coding_block_size_minus3, LAYOUT__log2_min_pcm_luma_coding_block_size_minus3);}

    public byte log2_diff_max_min_pcm_luma_coding_block_size() {return this.ptr.get(LAYOUT__log2_diff_max_min_pcm_luma_coding_block_size, OFFSET__log2_diff_max_min_pcm_luma_coding_block_size);}
    public void log2_diff_max_min_pcm_luma_coding_block_size(byte value) {this.ptr.set(LAYOUT__log2_diff_max_min_pcm_luma_coding_block_size, OFFSET__log2_diff_max_min_pcm_luma_coding_block_size, value);}
    public java.lang.foreign.MemorySegment $log2_diff_max_min_pcm_luma_coding_block_size() {return this.ptr.asSlice(OFFSET__log2_diff_max_min_pcm_luma_coding_block_size, LAYOUT__log2_diff_max_min_pcm_luma_coding_block_size);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public byte reserved2() {return this.ptr.get(LAYOUT__reserved2, OFFSET__reserved2);}
    public void reserved2(byte value) {this.ptr.set(LAYOUT__reserved2, OFFSET__reserved2, value);}
    public java.lang.foreign.MemorySegment $reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}

    public byte palette_max_size() {return this.ptr.get(LAYOUT__palette_max_size, OFFSET__palette_max_size);}
    public void palette_max_size(byte value) {this.ptr.set(LAYOUT__palette_max_size, OFFSET__palette_max_size, value);}
    public java.lang.foreign.MemorySegment $palette_max_size() {return this.ptr.asSlice(OFFSET__palette_max_size, LAYOUT__palette_max_size);}

    public byte delta_palette_max_predictor_size() {return this.ptr.get(LAYOUT__delta_palette_max_predictor_size, OFFSET__delta_palette_max_predictor_size);}
    public void delta_palette_max_predictor_size(byte value) {this.ptr.set(LAYOUT__delta_palette_max_predictor_size, OFFSET__delta_palette_max_predictor_size, value);}
    public java.lang.foreign.MemorySegment $delta_palette_max_predictor_size() {return this.ptr.asSlice(OFFSET__delta_palette_max_predictor_size, LAYOUT__delta_palette_max_predictor_size);}

    public byte motion_vector_resolution_control_idc() {return this.ptr.get(LAYOUT__motion_vector_resolution_control_idc, OFFSET__motion_vector_resolution_control_idc);}
    public void motion_vector_resolution_control_idc(byte value) {this.ptr.set(LAYOUT__motion_vector_resolution_control_idc, OFFSET__motion_vector_resolution_control_idc, value);}
    public java.lang.foreign.MemorySegment $motion_vector_resolution_control_idc() {return this.ptr.asSlice(OFFSET__motion_vector_resolution_control_idc, LAYOUT__motion_vector_resolution_control_idc);}

    public byte sps_num_palette_predictor_initializers_minus1() {return this.ptr.get(LAYOUT__sps_num_palette_predictor_initializers_minus1, OFFSET__sps_num_palette_predictor_initializers_minus1);}
    public void sps_num_palette_predictor_initializers_minus1(byte value) {this.ptr.set(LAYOUT__sps_num_palette_predictor_initializers_minus1, OFFSET__sps_num_palette_predictor_initializers_minus1, value);}
    public java.lang.foreign.MemorySegment $sps_num_palette_predictor_initializers_minus1() {return this.ptr.asSlice(OFFSET__sps_num_palette_predictor_initializers_minus1, LAYOUT__sps_num_palette_predictor_initializers_minus1);}

    public int conf_win_left_offset() {return this.ptr.get(LAYOUT__conf_win_left_offset, OFFSET__conf_win_left_offset);}
    public void conf_win_left_offset(int value) {this.ptr.set(LAYOUT__conf_win_left_offset, OFFSET__conf_win_left_offset, value);}
    public java.lang.foreign.MemorySegment $conf_win_left_offset() {return this.ptr.asSlice(OFFSET__conf_win_left_offset, LAYOUT__conf_win_left_offset);}

    public int conf_win_right_offset() {return this.ptr.get(LAYOUT__conf_win_right_offset, OFFSET__conf_win_right_offset);}
    public void conf_win_right_offset(int value) {this.ptr.set(LAYOUT__conf_win_right_offset, OFFSET__conf_win_right_offset, value);}
    public java.lang.foreign.MemorySegment $conf_win_right_offset() {return this.ptr.asSlice(OFFSET__conf_win_right_offset, LAYOUT__conf_win_right_offset);}

    public int conf_win_top_offset() {return this.ptr.get(LAYOUT__conf_win_top_offset, OFFSET__conf_win_top_offset);}
    public void conf_win_top_offset(int value) {this.ptr.set(LAYOUT__conf_win_top_offset, OFFSET__conf_win_top_offset, value);}
    public java.lang.foreign.MemorySegment $conf_win_top_offset() {return this.ptr.asSlice(OFFSET__conf_win_top_offset, LAYOUT__conf_win_top_offset);}

    public int conf_win_bottom_offset() {return this.ptr.get(LAYOUT__conf_win_bottom_offset, OFFSET__conf_win_bottom_offset);}
    public void conf_win_bottom_offset(int value) {this.ptr.set(LAYOUT__conf_win_bottom_offset, OFFSET__conf_win_bottom_offset, value);}
    public java.lang.foreign.MemorySegment $conf_win_bottom_offset() {return this.ptr.asSlice(OFFSET__conf_win_bottom_offset, LAYOUT__conf_win_bottom_offset);}

    public java.lang.foreign.MemorySegment pProfileTierLevel() {return this.ptr.get(LAYOUT__pProfileTierLevel, OFFSET__pProfileTierLevel);}
    public void pProfileTierLevel(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pProfileTierLevel, OFFSET__pProfileTierLevel, value);}
    public java.lang.foreign.MemorySegment $pProfileTierLevel() {return this.ptr.asSlice(OFFSET__pProfileTierLevel, LAYOUT__pProfileTierLevel);}

    public java.lang.foreign.MemorySegment pDecPicBufMgr() {return this.ptr.get(LAYOUT__pDecPicBufMgr, OFFSET__pDecPicBufMgr);}
    public void pDecPicBufMgr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDecPicBufMgr, OFFSET__pDecPicBufMgr, value);}
    public java.lang.foreign.MemorySegment $pDecPicBufMgr() {return this.ptr.asSlice(OFFSET__pDecPicBufMgr, LAYOUT__pDecPicBufMgr);}

    public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT__pScalingLists, OFFSET__pScalingLists);}
    public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pScalingLists, OFFSET__pScalingLists, value);}
    public java.lang.foreign.MemorySegment $pScalingLists() {return this.ptr.asSlice(OFFSET__pScalingLists, LAYOUT__pScalingLists);}

    public java.lang.foreign.MemorySegment pShortTermRefPicSet() {return this.ptr.get(LAYOUT__pShortTermRefPicSet, OFFSET__pShortTermRefPicSet);}
    public void pShortTermRefPicSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pShortTermRefPicSet, OFFSET__pShortTermRefPicSet, value);}
    public java.lang.foreign.MemorySegment $pShortTermRefPicSet() {return this.ptr.asSlice(OFFSET__pShortTermRefPicSet, LAYOUT__pShortTermRefPicSet);}

    public java.lang.foreign.MemorySegment pLongTermRefPicsSps() {return this.ptr.get(LAYOUT__pLongTermRefPicsSps, OFFSET__pLongTermRefPicsSps);}
    public void pLongTermRefPicsSps(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLongTermRefPicsSps, OFFSET__pLongTermRefPicsSps, value);}
    public java.lang.foreign.MemorySegment $pLongTermRefPicsSps() {return this.ptr.asSlice(OFFSET__pLongTermRefPicsSps, LAYOUT__pLongTermRefPicsSps);}

    public java.lang.foreign.MemorySegment pSequenceParameterSetVui() {return this.ptr.get(LAYOUT__pSequenceParameterSetVui, OFFSET__pSequenceParameterSetVui);}
    public void pSequenceParameterSetVui(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSequenceParameterSetVui, OFFSET__pSequenceParameterSetVui, value);}
    public java.lang.foreign.MemorySegment $pSequenceParameterSetVui() {return this.ptr.asSlice(OFFSET__pSequenceParameterSetVui, LAYOUT__pSequenceParameterSetVui);}

    public java.lang.foreign.MemorySegment pPredictorPaletteEntries() {return this.ptr.get(LAYOUT__pPredictorPaletteEntries, OFFSET__pPredictorPaletteEntries);}
    public void pPredictorPaletteEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPredictorPaletteEntries, OFFSET__pPredictorPaletteEntries, value);}
    public java.lang.foreign.MemorySegment $pPredictorPaletteEntries() {return this.ptr.asSlice(OFFSET__pPredictorPaletteEntries, LAYOUT__pPredictorPaletteEntries);}
}
