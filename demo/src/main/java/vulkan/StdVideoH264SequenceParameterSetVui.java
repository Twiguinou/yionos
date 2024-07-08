package vulkan;

public record StdVideoH264SequenceParameterSetVui(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH264SpsVuiFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspect_ratio_idc = java.lang.foreign.ValueLayout.JAVA_INT.withName("aspect_ratio_idc");
    public static final long OFFSET__aspect_ratio_idc = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__sar_width = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("sar_width");
    public static final long OFFSET__sar_width = 8;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__sar_height = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("sar_height");
    public static final long OFFSET__sar_height = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__video_format = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("video_format");
    public static final long OFFSET__video_format = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__colour_primaries = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("colour_primaries");
    public static final long OFFSET__colour_primaries = 13;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__transfer_characteristics = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("transfer_characteristics");
    public static final long OFFSET__transfer_characteristics = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__matrix_coefficients = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("matrix_coefficients");
    public static final long OFFSET__matrix_coefficients = 15;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__num_units_in_tick = java.lang.foreign.ValueLayout.JAVA_INT.withName("num_units_in_tick");
    public static final long OFFSET__num_units_in_tick = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__time_scale = java.lang.foreign.ValueLayout.JAVA_INT.withName("time_scale");
    public static final long OFFSET__time_scale = 20;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__max_num_reorder_frames = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("max_num_reorder_frames");
    public static final long OFFSET__max_num_reorder_frames = 24;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__max_dec_frame_buffering = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("max_dec_frame_buffering");
    public static final long OFFSET__max_dec_frame_buffering = 25;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_sample_loc_type_top_field = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_top_field");
    public static final long OFFSET__chroma_sample_loc_type_top_field = 26;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_sample_loc_type_bottom_field = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field");
    public static final long OFFSET__chroma_sample_loc_type_bottom_field = 27;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_INT.withName("reserved1");
    public static final long OFFSET__reserved1 = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pHrdParameters = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pHrdParameters");
    public static final long OFFSET__pHrdParameters = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__aspect_ratio_idc,
            LAYOUT__sar_width,
            LAYOUT__sar_height,
            LAYOUT__video_format,
            LAYOUT__colour_primaries,
            LAYOUT__transfer_characteristics,
            LAYOUT__matrix_coefficients,
            LAYOUT__num_units_in_tick,
            LAYOUT__time_scale,
            LAYOUT__max_num_reorder_frames,
            LAYOUT__max_dec_frame_buffering,
            LAYOUT__chroma_sample_loc_type_top_field,
            LAYOUT__chroma_sample_loc_type_bottom_field,
            LAYOUT__reserved1,
            LAYOUT__pHrdParameters
    ).withByteAlignment(8).withName("StdVideoH264SequenceParameterSetVui");

    public StdVideoH264SequenceParameterSetVui(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH264SequenceParameterSetVui getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH264SequenceParameterSetVui(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH264SequenceParameterSetVui value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH264SpsVuiFlags flags() {return new vulkan.StdVideoH264SpsVuiFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH264SpsVuiFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH264SpsVuiFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

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

    public byte matrix_coefficients() {return this.ptr.get(LAYOUT__matrix_coefficients, OFFSET__matrix_coefficients);}
    public void matrix_coefficients(byte value) {this.ptr.set(LAYOUT__matrix_coefficients, OFFSET__matrix_coefficients, value);}
    public java.lang.foreign.MemorySegment $matrix_coefficients() {return this.ptr.asSlice(OFFSET__matrix_coefficients, LAYOUT__matrix_coefficients);}

    public int num_units_in_tick() {return this.ptr.get(LAYOUT__num_units_in_tick, OFFSET__num_units_in_tick);}
    public void num_units_in_tick(int value) {this.ptr.set(LAYOUT__num_units_in_tick, OFFSET__num_units_in_tick, value);}
    public java.lang.foreign.MemorySegment $num_units_in_tick() {return this.ptr.asSlice(OFFSET__num_units_in_tick, LAYOUT__num_units_in_tick);}

    public int time_scale() {return this.ptr.get(LAYOUT__time_scale, OFFSET__time_scale);}
    public void time_scale(int value) {this.ptr.set(LAYOUT__time_scale, OFFSET__time_scale, value);}
    public java.lang.foreign.MemorySegment $time_scale() {return this.ptr.asSlice(OFFSET__time_scale, LAYOUT__time_scale);}

    public byte max_num_reorder_frames() {return this.ptr.get(LAYOUT__max_num_reorder_frames, OFFSET__max_num_reorder_frames);}
    public void max_num_reorder_frames(byte value) {this.ptr.set(LAYOUT__max_num_reorder_frames, OFFSET__max_num_reorder_frames, value);}
    public java.lang.foreign.MemorySegment $max_num_reorder_frames() {return this.ptr.asSlice(OFFSET__max_num_reorder_frames, LAYOUT__max_num_reorder_frames);}

    public byte max_dec_frame_buffering() {return this.ptr.get(LAYOUT__max_dec_frame_buffering, OFFSET__max_dec_frame_buffering);}
    public void max_dec_frame_buffering(byte value) {this.ptr.set(LAYOUT__max_dec_frame_buffering, OFFSET__max_dec_frame_buffering, value);}
    public java.lang.foreign.MemorySegment $max_dec_frame_buffering() {return this.ptr.asSlice(OFFSET__max_dec_frame_buffering, LAYOUT__max_dec_frame_buffering);}

    public byte chroma_sample_loc_type_top_field() {return this.ptr.get(LAYOUT__chroma_sample_loc_type_top_field, OFFSET__chroma_sample_loc_type_top_field);}
    public void chroma_sample_loc_type_top_field(byte value) {this.ptr.set(LAYOUT__chroma_sample_loc_type_top_field, OFFSET__chroma_sample_loc_type_top_field, value);}
    public java.lang.foreign.MemorySegment $chroma_sample_loc_type_top_field() {return this.ptr.asSlice(OFFSET__chroma_sample_loc_type_top_field, LAYOUT__chroma_sample_loc_type_top_field);}

    public byte chroma_sample_loc_type_bottom_field() {return this.ptr.get(LAYOUT__chroma_sample_loc_type_bottom_field, OFFSET__chroma_sample_loc_type_bottom_field);}
    public void chroma_sample_loc_type_bottom_field(byte value) {this.ptr.set(LAYOUT__chroma_sample_loc_type_bottom_field, OFFSET__chroma_sample_loc_type_bottom_field, value);}
    public java.lang.foreign.MemorySegment $chroma_sample_loc_type_bottom_field() {return this.ptr.asSlice(OFFSET__chroma_sample_loc_type_bottom_field, LAYOUT__chroma_sample_loc_type_bottom_field);}

    public int reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(int value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public java.lang.foreign.MemorySegment pHrdParameters() {return this.ptr.get(LAYOUT__pHrdParameters, OFFSET__pHrdParameters);}
    public void pHrdParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pHrdParameters, OFFSET__pHrdParameters, value);}
    public java.lang.foreign.MemorySegment $pHrdParameters() {return this.ptr.asSlice(OFFSET__pHrdParameters, LAYOUT__pHrdParameters);}
}
