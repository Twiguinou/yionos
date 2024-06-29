package vulkan;

public record StdVideoH265SequenceParameterSetVui(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH265SpsVuiFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspect_ratio_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__aspect_ratio_idc = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__sar_width = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__sar_width = 8;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__sar_height = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__sar_height = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__video_format = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__video_format = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__colour_primaries = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__colour_primaries = 13;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__transfer_characteristics = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__transfer_characteristics = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__matrix_coeffs = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__matrix_coeffs = 15;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_sample_loc_type_top_field = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__chroma_sample_loc_type_top_field = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_sample_loc_type_bottom_field = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__chroma_sample_loc_type_bottom_field = 17;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved1 = 18;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved2 = 19;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__def_disp_win_left_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__def_disp_win_left_offset = 20;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__def_disp_win_right_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__def_disp_win_right_offset = 22;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__def_disp_win_top_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__def_disp_win_top_offset = 24;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__def_disp_win_bottom_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__def_disp_win_bottom_offset = 26;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vui_num_units_in_tick = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vui_num_units_in_tick = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vui_time_scale = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vui_time_scale = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vui_num_ticks_poc_diff_one_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vui_num_ticks_poc_diff_one_minus1 = 36;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__min_spatial_segmentation_idc = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__min_spatial_segmentation_idc = 40;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__reserved3 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__reserved3 = 42;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__max_bytes_per_pic_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__max_bytes_per_pic_denom = 44;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__max_bits_per_min_cu_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__max_bits_per_min_cu_denom = 45;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_max_mv_length_horizontal = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_max_mv_length_horizontal = 46;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__log2_max_mv_length_vertical = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__log2_max_mv_length_vertical = 47;
    public static final java.lang.foreign.AddressLayout LAYOUT__pHrdParameters = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pHrdParameters = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__aspect_ratio_idc,
            LAYOUT__sar_width,
            LAYOUT__sar_height,
            LAYOUT__video_format,
            LAYOUT__colour_primaries,
            LAYOUT__transfer_characteristics,
            LAYOUT__matrix_coeffs,
            LAYOUT__chroma_sample_loc_type_top_field,
            LAYOUT__chroma_sample_loc_type_bottom_field,
            LAYOUT__reserved1,
            LAYOUT__reserved2,
            LAYOUT__def_disp_win_left_offset,
            LAYOUT__def_disp_win_right_offset,
            LAYOUT__def_disp_win_top_offset,
            LAYOUT__def_disp_win_bottom_offset,
            LAYOUT__vui_num_units_in_tick,
            LAYOUT__vui_time_scale,
            LAYOUT__vui_num_ticks_poc_diff_one_minus1,
            LAYOUT__min_spatial_segmentation_idc,
            LAYOUT__reserved3,
            LAYOUT__max_bytes_per_pic_denom,
            LAYOUT__max_bits_per_min_cu_denom,
            LAYOUT__log2_max_mv_length_horizontal,
            LAYOUT__log2_max_mv_length_vertical,
            LAYOUT__pHrdParameters
    ).withByteAlignment(8).withName("StdVideoH265SequenceParameterSetVui");

    public StdVideoH265SequenceParameterSetVui(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265SequenceParameterSetVui getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265SequenceParameterSetVui(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265SequenceParameterSetVui value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH265SpsVuiFlags flags() {return new vulkan.StdVideoH265SpsVuiFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265SpsVuiFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265SpsVuiFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int aspect_ratio_idc() {return this.ptr.get(LAYOUT__aspect_ratio_idc, OFFSET__aspect_ratio_idc);}
    public void aspect_ratio_idc(int value) {this.ptr.set(LAYOUT__aspect_ratio_idc, OFFSET__aspect_ratio_idc, value);}
    public java.lang.foreign.MemorySegment $aspect_ratio_idc() {return this.ptr.asSlice(OFFSET__aspect_ratio_idc, LAYOUT__aspect_ratio_idc);}

    public short sar_width() {return this.ptr.get(LAYOUT__sar_width, OFFSET__sar_width);}
    public void sar_width(short value) {this.ptr.set(LAYOUT__sar_width, OFFSET__sar_width, value);}
    public java.lang.foreign.MemorySegment $sar_width() {return this.ptr.asSlice(OFFSET__sar_width, LAYOUT__sar_width);}

    public short sar_height() {return this.ptr.get(LAYOUT__sar_height, OFFSET__sar_height);}
    public void sar_height(short value) {this.ptr.set(LAYOUT__sar_height, OFFSET__sar_height, value);}
    public java.lang.foreign.MemorySegment $sar_height() {return this.ptr.asSlice(OFFSET__sar_height, LAYOUT__sar_height);}

    public byte video_format() {return this.ptr.get(LAYOUT__video_format, OFFSET__video_format);}
    public void video_format(byte value) {this.ptr.set(LAYOUT__video_format, OFFSET__video_format, value);}
    public java.lang.foreign.MemorySegment $video_format() {return this.ptr.asSlice(OFFSET__video_format, LAYOUT__video_format);}

    public byte colour_primaries() {return this.ptr.get(LAYOUT__colour_primaries, OFFSET__colour_primaries);}
    public void colour_primaries(byte value) {this.ptr.set(LAYOUT__colour_primaries, OFFSET__colour_primaries, value);}
    public java.lang.foreign.MemorySegment $colour_primaries() {return this.ptr.asSlice(OFFSET__colour_primaries, LAYOUT__colour_primaries);}

    public byte transfer_characteristics() {return this.ptr.get(LAYOUT__transfer_characteristics, OFFSET__transfer_characteristics);}
    public void transfer_characteristics(byte value) {this.ptr.set(LAYOUT__transfer_characteristics, OFFSET__transfer_characteristics, value);}
    public java.lang.foreign.MemorySegment $transfer_characteristics() {return this.ptr.asSlice(OFFSET__transfer_characteristics, LAYOUT__transfer_characteristics);}

    public byte matrix_coeffs() {return this.ptr.get(LAYOUT__matrix_coeffs, OFFSET__matrix_coeffs);}
    public void matrix_coeffs(byte value) {this.ptr.set(LAYOUT__matrix_coeffs, OFFSET__matrix_coeffs, value);}
    public java.lang.foreign.MemorySegment $matrix_coeffs() {return this.ptr.asSlice(OFFSET__matrix_coeffs, LAYOUT__matrix_coeffs);}

    public byte chroma_sample_loc_type_top_field() {return this.ptr.get(LAYOUT__chroma_sample_loc_type_top_field, OFFSET__chroma_sample_loc_type_top_field);}
    public void chroma_sample_loc_type_top_field(byte value) {this.ptr.set(LAYOUT__chroma_sample_loc_type_top_field, OFFSET__chroma_sample_loc_type_top_field, value);}
    public java.lang.foreign.MemorySegment $chroma_sample_loc_type_top_field() {return this.ptr.asSlice(OFFSET__chroma_sample_loc_type_top_field, LAYOUT__chroma_sample_loc_type_top_field);}

    public byte chroma_sample_loc_type_bottom_field() {return this.ptr.get(LAYOUT__chroma_sample_loc_type_bottom_field, OFFSET__chroma_sample_loc_type_bottom_field);}
    public void chroma_sample_loc_type_bottom_field(byte value) {this.ptr.set(LAYOUT__chroma_sample_loc_type_bottom_field, OFFSET__chroma_sample_loc_type_bottom_field, value);}
    public java.lang.foreign.MemorySegment $chroma_sample_loc_type_bottom_field() {return this.ptr.asSlice(OFFSET__chroma_sample_loc_type_bottom_field, LAYOUT__chroma_sample_loc_type_bottom_field);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public byte reserved2() {return this.ptr.get(LAYOUT__reserved2, OFFSET__reserved2);}
    public void reserved2(byte value) {this.ptr.set(LAYOUT__reserved2, OFFSET__reserved2, value);}
    public java.lang.foreign.MemorySegment $reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}

    public short def_disp_win_left_offset() {return this.ptr.get(LAYOUT__def_disp_win_left_offset, OFFSET__def_disp_win_left_offset);}
    public void def_disp_win_left_offset(short value) {this.ptr.set(LAYOUT__def_disp_win_left_offset, OFFSET__def_disp_win_left_offset, value);}
    public java.lang.foreign.MemorySegment $def_disp_win_left_offset() {return this.ptr.asSlice(OFFSET__def_disp_win_left_offset, LAYOUT__def_disp_win_left_offset);}

    public short def_disp_win_right_offset() {return this.ptr.get(LAYOUT__def_disp_win_right_offset, OFFSET__def_disp_win_right_offset);}
    public void def_disp_win_right_offset(short value) {this.ptr.set(LAYOUT__def_disp_win_right_offset, OFFSET__def_disp_win_right_offset, value);}
    public java.lang.foreign.MemorySegment $def_disp_win_right_offset() {return this.ptr.asSlice(OFFSET__def_disp_win_right_offset, LAYOUT__def_disp_win_right_offset);}

    public short def_disp_win_top_offset() {return this.ptr.get(LAYOUT__def_disp_win_top_offset, OFFSET__def_disp_win_top_offset);}
    public void def_disp_win_top_offset(short value) {this.ptr.set(LAYOUT__def_disp_win_top_offset, OFFSET__def_disp_win_top_offset, value);}
    public java.lang.foreign.MemorySegment $def_disp_win_top_offset() {return this.ptr.asSlice(OFFSET__def_disp_win_top_offset, LAYOUT__def_disp_win_top_offset);}

    public short def_disp_win_bottom_offset() {return this.ptr.get(LAYOUT__def_disp_win_bottom_offset, OFFSET__def_disp_win_bottom_offset);}
    public void def_disp_win_bottom_offset(short value) {this.ptr.set(LAYOUT__def_disp_win_bottom_offset, OFFSET__def_disp_win_bottom_offset, value);}
    public java.lang.foreign.MemorySegment $def_disp_win_bottom_offset() {return this.ptr.asSlice(OFFSET__def_disp_win_bottom_offset, LAYOUT__def_disp_win_bottom_offset);}

    public int vui_num_units_in_tick() {return this.ptr.get(LAYOUT__vui_num_units_in_tick, OFFSET__vui_num_units_in_tick);}
    public void vui_num_units_in_tick(int value) {this.ptr.set(LAYOUT__vui_num_units_in_tick, OFFSET__vui_num_units_in_tick, value);}
    public java.lang.foreign.MemorySegment $vui_num_units_in_tick() {return this.ptr.asSlice(OFFSET__vui_num_units_in_tick, LAYOUT__vui_num_units_in_tick);}

    public int vui_time_scale() {return this.ptr.get(LAYOUT__vui_time_scale, OFFSET__vui_time_scale);}
    public void vui_time_scale(int value) {this.ptr.set(LAYOUT__vui_time_scale, OFFSET__vui_time_scale, value);}
    public java.lang.foreign.MemorySegment $vui_time_scale() {return this.ptr.asSlice(OFFSET__vui_time_scale, LAYOUT__vui_time_scale);}

    public int vui_num_ticks_poc_diff_one_minus1() {return this.ptr.get(LAYOUT__vui_num_ticks_poc_diff_one_minus1, OFFSET__vui_num_ticks_poc_diff_one_minus1);}
    public void vui_num_ticks_poc_diff_one_minus1(int value) {this.ptr.set(LAYOUT__vui_num_ticks_poc_diff_one_minus1, OFFSET__vui_num_ticks_poc_diff_one_minus1, value);}
    public java.lang.foreign.MemorySegment $vui_num_ticks_poc_diff_one_minus1() {return this.ptr.asSlice(OFFSET__vui_num_ticks_poc_diff_one_minus1, LAYOUT__vui_num_ticks_poc_diff_one_minus1);}

    public short min_spatial_segmentation_idc() {return this.ptr.get(LAYOUT__min_spatial_segmentation_idc, OFFSET__min_spatial_segmentation_idc);}
    public void min_spatial_segmentation_idc(short value) {this.ptr.set(LAYOUT__min_spatial_segmentation_idc, OFFSET__min_spatial_segmentation_idc, value);}
    public java.lang.foreign.MemorySegment $min_spatial_segmentation_idc() {return this.ptr.asSlice(OFFSET__min_spatial_segmentation_idc, LAYOUT__min_spatial_segmentation_idc);}

    public short reserved3() {return this.ptr.get(LAYOUT__reserved3, OFFSET__reserved3);}
    public void reserved3(short value) {this.ptr.set(LAYOUT__reserved3, OFFSET__reserved3, value);}
    public java.lang.foreign.MemorySegment $reserved3() {return this.ptr.asSlice(OFFSET__reserved3, LAYOUT__reserved3);}

    public byte max_bytes_per_pic_denom() {return this.ptr.get(LAYOUT__max_bytes_per_pic_denom, OFFSET__max_bytes_per_pic_denom);}
    public void max_bytes_per_pic_denom(byte value) {this.ptr.set(LAYOUT__max_bytes_per_pic_denom, OFFSET__max_bytes_per_pic_denom, value);}
    public java.lang.foreign.MemorySegment $max_bytes_per_pic_denom() {return this.ptr.asSlice(OFFSET__max_bytes_per_pic_denom, LAYOUT__max_bytes_per_pic_denom);}

    public byte max_bits_per_min_cu_denom() {return this.ptr.get(LAYOUT__max_bits_per_min_cu_denom, OFFSET__max_bits_per_min_cu_denom);}
    public void max_bits_per_min_cu_denom(byte value) {this.ptr.set(LAYOUT__max_bits_per_min_cu_denom, OFFSET__max_bits_per_min_cu_denom, value);}
    public java.lang.foreign.MemorySegment $max_bits_per_min_cu_denom() {return this.ptr.asSlice(OFFSET__max_bits_per_min_cu_denom, LAYOUT__max_bits_per_min_cu_denom);}

    public byte log2_max_mv_length_horizontal() {return this.ptr.get(LAYOUT__log2_max_mv_length_horizontal, OFFSET__log2_max_mv_length_horizontal);}
    public void log2_max_mv_length_horizontal(byte value) {this.ptr.set(LAYOUT__log2_max_mv_length_horizontal, OFFSET__log2_max_mv_length_horizontal, value);}
    public java.lang.foreign.MemorySegment $log2_max_mv_length_horizontal() {return this.ptr.asSlice(OFFSET__log2_max_mv_length_horizontal, LAYOUT__log2_max_mv_length_horizontal);}

    public byte log2_max_mv_length_vertical() {return this.ptr.get(LAYOUT__log2_max_mv_length_vertical, OFFSET__log2_max_mv_length_vertical);}
    public void log2_max_mv_length_vertical(byte value) {this.ptr.set(LAYOUT__log2_max_mv_length_vertical, OFFSET__log2_max_mv_length_vertical, value);}
    public java.lang.foreign.MemorySegment $log2_max_mv_length_vertical() {return this.ptr.asSlice(OFFSET__log2_max_mv_length_vertical, LAYOUT__log2_max_mv_length_vertical);}

    public java.lang.foreign.MemorySegment pHrdParameters() {return this.ptr.get(LAYOUT__pHrdParameters, OFFSET__pHrdParameters);}
    public void pHrdParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pHrdParameters, OFFSET__pHrdParameters, value);}
    public java.lang.foreign.MemorySegment $pHrdParameters() {return this.ptr.asSlice(OFFSET__pHrdParameters, LAYOUT__pHrdParameters);}
}
