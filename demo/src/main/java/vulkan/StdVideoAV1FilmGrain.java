package vulkan;

public record StdVideoAV1FilmGrain(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoAV1FilmGrainFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__grain_scaling_minus_8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__grain_scaling_minus_8 = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__ar_coeff_lag = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__ar_coeff_lag = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__ar_coeff_shift_minus_6 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__ar_coeff_shift_minus_6 = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__grain_scale_shift = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__grain_scale_shift = 7;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__grain_seed = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__grain_seed = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__film_grain_params_ref_idx = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__film_grain_params_ref_idx = 10;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_y_points = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_y_points = 11;
    public static final java.lang.foreign.SequenceLayout LAYOUT__point_y_value = java.lang.foreign.MemoryLayout.sequenceLayout(14, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__point_y_value = 12;
    public static final java.lang.foreign.SequenceLayout LAYOUT__point_y_scaling = java.lang.foreign.MemoryLayout.sequenceLayout(14, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__point_y_scaling = 26;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_cb_points = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_cb_points = 40;
    public static final java.lang.foreign.SequenceLayout LAYOUT__point_cb_value = java.lang.foreign.MemoryLayout.sequenceLayout(10, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__point_cb_value = 41;
    public static final java.lang.foreign.SequenceLayout LAYOUT__point_cb_scaling = java.lang.foreign.MemoryLayout.sequenceLayout(10, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__point_cb_scaling = 51;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__num_cr_points = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__num_cr_points = 61;
    public static final java.lang.foreign.SequenceLayout LAYOUT__point_cr_value = java.lang.foreign.MemoryLayout.sequenceLayout(10, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__point_cr_value = 62;
    public static final java.lang.foreign.SequenceLayout LAYOUT__point_cr_scaling = java.lang.foreign.MemoryLayout.sequenceLayout(10, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__point_cr_scaling = 72;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ar_coeffs_y_plus_128 = java.lang.foreign.MemoryLayout.sequenceLayout(24, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__ar_coeffs_y_plus_128 = 82;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ar_coeffs_cb_plus_128 = java.lang.foreign.MemoryLayout.sequenceLayout(25, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__ar_coeffs_cb_plus_128 = 106;
    public static final java.lang.foreign.SequenceLayout LAYOUT__ar_coeffs_cr_plus_128 = java.lang.foreign.MemoryLayout.sequenceLayout(25, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__ar_coeffs_cr_plus_128 = 131;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cb_mult = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cb_mult = 156;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cb_luma_mult = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cb_luma_mult = 157;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__cb_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__cb_offset = 158;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cr_mult = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cr_mult = 160;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__cr_luma_mult = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__cr_luma_mult = 161;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__cr_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__cr_offset = 162;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__grain_scaling_minus_8,
            LAYOUT__ar_coeff_lag,
            LAYOUT__ar_coeff_shift_minus_6,
            LAYOUT__grain_scale_shift,
            LAYOUT__grain_seed,
            LAYOUT__film_grain_params_ref_idx,
            LAYOUT__num_y_points,
            LAYOUT__point_y_value,
            LAYOUT__point_y_scaling,
            LAYOUT__num_cb_points,
            LAYOUT__point_cb_value,
            LAYOUT__point_cb_scaling,
            LAYOUT__num_cr_points,
            LAYOUT__point_cr_value,
            LAYOUT__point_cr_scaling,
            LAYOUT__ar_coeffs_y_plus_128,
            LAYOUT__ar_coeffs_cb_plus_128,
            LAYOUT__ar_coeffs_cr_plus_128,
            LAYOUT__cb_mult,
            LAYOUT__cb_luma_mult,
            LAYOUT__cb_offset,
            LAYOUT__cr_mult,
            LAYOUT__cr_luma_mult,
            LAYOUT__cr_offset
    ).withByteAlignment(4).withName("StdVideoAV1FilmGrain");

    public StdVideoAV1FilmGrain(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1FilmGrain getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1FilmGrain(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1FilmGrain value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoAV1FilmGrainFlags flags() {return new vulkan.StdVideoAV1FilmGrainFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoAV1FilmGrainFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoAV1FilmGrainFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte grain_scaling_minus_8() {return this.ptr.get(LAYOUT__grain_scaling_minus_8, OFFSET__grain_scaling_minus_8);}
    public void grain_scaling_minus_8(byte value) {this.ptr.set(LAYOUT__grain_scaling_minus_8, OFFSET__grain_scaling_minus_8, value);}
    public java.lang.foreign.MemorySegment $grain_scaling_minus_8() {return this.ptr.asSlice(OFFSET__grain_scaling_minus_8, LAYOUT__grain_scaling_minus_8);}

    public byte ar_coeff_lag() {return this.ptr.get(LAYOUT__ar_coeff_lag, OFFSET__ar_coeff_lag);}
    public void ar_coeff_lag(byte value) {this.ptr.set(LAYOUT__ar_coeff_lag, OFFSET__ar_coeff_lag, value);}
    public java.lang.foreign.MemorySegment $ar_coeff_lag() {return this.ptr.asSlice(OFFSET__ar_coeff_lag, LAYOUT__ar_coeff_lag);}

    public byte ar_coeff_shift_minus_6() {return this.ptr.get(LAYOUT__ar_coeff_shift_minus_6, OFFSET__ar_coeff_shift_minus_6);}
    public void ar_coeff_shift_minus_6(byte value) {this.ptr.set(LAYOUT__ar_coeff_shift_minus_6, OFFSET__ar_coeff_shift_minus_6, value);}
    public java.lang.foreign.MemorySegment $ar_coeff_shift_minus_6() {return this.ptr.asSlice(OFFSET__ar_coeff_shift_minus_6, LAYOUT__ar_coeff_shift_minus_6);}

    public byte grain_scale_shift() {return this.ptr.get(LAYOUT__grain_scale_shift, OFFSET__grain_scale_shift);}
    public void grain_scale_shift(byte value) {this.ptr.set(LAYOUT__grain_scale_shift, OFFSET__grain_scale_shift, value);}
    public java.lang.foreign.MemorySegment $grain_scale_shift() {return this.ptr.asSlice(OFFSET__grain_scale_shift, LAYOUT__grain_scale_shift);}

    public short grain_seed() {return this.ptr.get(LAYOUT__grain_seed, OFFSET__grain_seed);}
    public void grain_seed(short value) {this.ptr.set(LAYOUT__grain_seed, OFFSET__grain_seed, value);}
    public java.lang.foreign.MemorySegment $grain_seed() {return this.ptr.asSlice(OFFSET__grain_seed, LAYOUT__grain_seed);}

    public byte film_grain_params_ref_idx() {return this.ptr.get(LAYOUT__film_grain_params_ref_idx, OFFSET__film_grain_params_ref_idx);}
    public void film_grain_params_ref_idx(byte value) {this.ptr.set(LAYOUT__film_grain_params_ref_idx, OFFSET__film_grain_params_ref_idx, value);}
    public java.lang.foreign.MemorySegment $film_grain_params_ref_idx() {return this.ptr.asSlice(OFFSET__film_grain_params_ref_idx, LAYOUT__film_grain_params_ref_idx);}

    public byte num_y_points() {return this.ptr.get(LAYOUT__num_y_points, OFFSET__num_y_points);}
    public void num_y_points(byte value) {this.ptr.set(LAYOUT__num_y_points, OFFSET__num_y_points, value);}
    public java.lang.foreign.MemorySegment $num_y_points() {return this.ptr.asSlice(OFFSET__num_y_points, LAYOUT__num_y_points);}

    public java.lang.foreign.MemorySegment point_y_value() {return this.ptr.asSlice(OFFSET__point_y_value, LAYOUT__point_y_value);}
    public byte point_y_value(int index) {return this.point_y_value().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void point_y_value(int index, byte value) {this.point_y_value().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment point_y_scaling() {return this.ptr.asSlice(OFFSET__point_y_scaling, LAYOUT__point_y_scaling);}
    public byte point_y_scaling(int index) {return this.point_y_scaling().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void point_y_scaling(int index, byte value) {this.point_y_scaling().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public byte num_cb_points() {return this.ptr.get(LAYOUT__num_cb_points, OFFSET__num_cb_points);}
    public void num_cb_points(byte value) {this.ptr.set(LAYOUT__num_cb_points, OFFSET__num_cb_points, value);}
    public java.lang.foreign.MemorySegment $num_cb_points() {return this.ptr.asSlice(OFFSET__num_cb_points, LAYOUT__num_cb_points);}

    public java.lang.foreign.MemorySegment point_cb_value() {return this.ptr.asSlice(OFFSET__point_cb_value, LAYOUT__point_cb_value);}
    public byte point_cb_value(int index) {return this.point_cb_value().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void point_cb_value(int index, byte value) {this.point_cb_value().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment point_cb_scaling() {return this.ptr.asSlice(OFFSET__point_cb_scaling, LAYOUT__point_cb_scaling);}
    public byte point_cb_scaling(int index) {return this.point_cb_scaling().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void point_cb_scaling(int index, byte value) {this.point_cb_scaling().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public byte num_cr_points() {return this.ptr.get(LAYOUT__num_cr_points, OFFSET__num_cr_points);}
    public void num_cr_points(byte value) {this.ptr.set(LAYOUT__num_cr_points, OFFSET__num_cr_points, value);}
    public java.lang.foreign.MemorySegment $num_cr_points() {return this.ptr.asSlice(OFFSET__num_cr_points, LAYOUT__num_cr_points);}

    public java.lang.foreign.MemorySegment point_cr_value() {return this.ptr.asSlice(OFFSET__point_cr_value, LAYOUT__point_cr_value);}
    public byte point_cr_value(int index) {return this.point_cr_value().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void point_cr_value(int index, byte value) {this.point_cr_value().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment point_cr_scaling() {return this.ptr.asSlice(OFFSET__point_cr_scaling, LAYOUT__point_cr_scaling);}
    public byte point_cr_scaling(int index) {return this.point_cr_scaling().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void point_cr_scaling(int index, byte value) {this.point_cr_scaling().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment ar_coeffs_y_plus_128() {return this.ptr.asSlice(OFFSET__ar_coeffs_y_plus_128, LAYOUT__ar_coeffs_y_plus_128);}
    public byte ar_coeffs_y_plus_128(int index) {return this.ar_coeffs_y_plus_128().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void ar_coeffs_y_plus_128(int index, byte value) {this.ar_coeffs_y_plus_128().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment ar_coeffs_cb_plus_128() {return this.ptr.asSlice(OFFSET__ar_coeffs_cb_plus_128, LAYOUT__ar_coeffs_cb_plus_128);}
    public byte ar_coeffs_cb_plus_128(int index) {return this.ar_coeffs_cb_plus_128().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void ar_coeffs_cb_plus_128(int index, byte value) {this.ar_coeffs_cb_plus_128().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment ar_coeffs_cr_plus_128() {return this.ptr.asSlice(OFFSET__ar_coeffs_cr_plus_128, LAYOUT__ar_coeffs_cr_plus_128);}
    public byte ar_coeffs_cr_plus_128(int index) {return this.ar_coeffs_cr_plus_128().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void ar_coeffs_cr_plus_128(int index, byte value) {this.ar_coeffs_cr_plus_128().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public byte cb_mult() {return this.ptr.get(LAYOUT__cb_mult, OFFSET__cb_mult);}
    public void cb_mult(byte value) {this.ptr.set(LAYOUT__cb_mult, OFFSET__cb_mult, value);}
    public java.lang.foreign.MemorySegment $cb_mult() {return this.ptr.asSlice(OFFSET__cb_mult, LAYOUT__cb_mult);}

    public byte cb_luma_mult() {return this.ptr.get(LAYOUT__cb_luma_mult, OFFSET__cb_luma_mult);}
    public void cb_luma_mult(byte value) {this.ptr.set(LAYOUT__cb_luma_mult, OFFSET__cb_luma_mult, value);}
    public java.lang.foreign.MemorySegment $cb_luma_mult() {return this.ptr.asSlice(OFFSET__cb_luma_mult, LAYOUT__cb_luma_mult);}

    public short cb_offset() {return this.ptr.get(LAYOUT__cb_offset, OFFSET__cb_offset);}
    public void cb_offset(short value) {this.ptr.set(LAYOUT__cb_offset, OFFSET__cb_offset, value);}
    public java.lang.foreign.MemorySegment $cb_offset() {return this.ptr.asSlice(OFFSET__cb_offset, LAYOUT__cb_offset);}

    public byte cr_mult() {return this.ptr.get(LAYOUT__cr_mult, OFFSET__cr_mult);}
    public void cr_mult(byte value) {this.ptr.set(LAYOUT__cr_mult, OFFSET__cr_mult, value);}
    public java.lang.foreign.MemorySegment $cr_mult() {return this.ptr.asSlice(OFFSET__cr_mult, LAYOUT__cr_mult);}

    public byte cr_luma_mult() {return this.ptr.get(LAYOUT__cr_luma_mult, OFFSET__cr_luma_mult);}
    public void cr_luma_mult(byte value) {this.ptr.set(LAYOUT__cr_luma_mult, OFFSET__cr_luma_mult, value);}
    public java.lang.foreign.MemorySegment $cr_luma_mult() {return this.ptr.asSlice(OFFSET__cr_luma_mult, LAYOUT__cr_luma_mult);}

    public short cr_offset() {return this.ptr.get(LAYOUT__cr_offset, OFFSET__cr_offset);}
    public void cr_offset(short value) {this.ptr.set(LAYOUT__cr_offset, OFFSET__cr_offset, value);}
    public java.lang.foreign.MemorySegment $cr_offset() {return this.ptr.asSlice(OFFSET__cr_offset, LAYOUT__cr_offset);}
}
