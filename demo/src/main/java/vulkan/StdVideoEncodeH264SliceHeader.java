package vulkan;

public record StdVideoEncodeH264SliceHeader(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH264SliceHeaderFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__first_mb_in_slice = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__first_mb_in_slice = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__slice_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__slice_type = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_alpha_c0_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__slice_alpha_c0_offset_div2 = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_beta_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__slice_beta_offset_div2 = 13;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_qp_delta = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__slice_qp_delta = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__reserved1 = 15;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cabac_init_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cabac_init_idc = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__disable_deblocking_filter_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__disable_deblocking_filter_idc = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWeightTable = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pWeightTable = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__first_mb_in_slice,
            LAYOUT__slice_type,
            LAYOUT__slice_alpha_c0_offset_div2,
            LAYOUT__slice_beta_offset_div2,
            LAYOUT__slice_qp_delta,
            LAYOUT__reserved1,
            LAYOUT__cabac_init_idc,
            LAYOUT__disable_deblocking_filter_idc,
            LAYOUT__pWeightTable
    ).withByteAlignment(8).withName("StdVideoEncodeH264SliceHeader");

    public StdVideoEncodeH264SliceHeader(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264SliceHeader getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264SliceHeader(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264SliceHeader value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH264SliceHeaderFlags flags() {return new vulkan.StdVideoEncodeH264SliceHeaderFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264SliceHeaderFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264SliceHeaderFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int first_mb_in_slice() {return this.ptr.get(LAYOUT__first_mb_in_slice, OFFSET__first_mb_in_slice);}
    public void first_mb_in_slice(int value) {this.ptr.set(LAYOUT__first_mb_in_slice, OFFSET__first_mb_in_slice, value);}
    public java.lang.foreign.MemorySegment $first_mb_in_slice() {return this.ptr.asSlice(OFFSET__first_mb_in_slice, LAYOUT__first_mb_in_slice);}

    public int slice_type() {return this.ptr.get(LAYOUT__slice_type, OFFSET__slice_type);}
    public void slice_type(int value) {this.ptr.set(LAYOUT__slice_type, OFFSET__slice_type, value);}
    public java.lang.foreign.MemorySegment $slice_type() {return this.ptr.asSlice(OFFSET__slice_type, LAYOUT__slice_type);}

    public byte slice_alpha_c0_offset_div2() {return this.ptr.get(LAYOUT__slice_alpha_c0_offset_div2, OFFSET__slice_alpha_c0_offset_div2);}
    public void slice_alpha_c0_offset_div2(byte value) {this.ptr.set(LAYOUT__slice_alpha_c0_offset_div2, OFFSET__slice_alpha_c0_offset_div2, value);}
    public java.lang.foreign.MemorySegment $slice_alpha_c0_offset_div2() {return this.ptr.asSlice(OFFSET__slice_alpha_c0_offset_div2, LAYOUT__slice_alpha_c0_offset_div2);}

    public byte slice_beta_offset_div2() {return this.ptr.get(LAYOUT__slice_beta_offset_div2, OFFSET__slice_beta_offset_div2);}
    public void slice_beta_offset_div2(byte value) {this.ptr.set(LAYOUT__slice_beta_offset_div2, OFFSET__slice_beta_offset_div2, value);}
    public java.lang.foreign.MemorySegment $slice_beta_offset_div2() {return this.ptr.asSlice(OFFSET__slice_beta_offset_div2, LAYOUT__slice_beta_offset_div2);}

    public byte slice_qp_delta() {return this.ptr.get(LAYOUT__slice_qp_delta, OFFSET__slice_qp_delta);}
    public void slice_qp_delta(byte value) {this.ptr.set(LAYOUT__slice_qp_delta, OFFSET__slice_qp_delta, value);}
    public java.lang.foreign.MemorySegment $slice_qp_delta() {return this.ptr.asSlice(OFFSET__slice_qp_delta, LAYOUT__slice_qp_delta);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public int cabac_init_idc() {return this.ptr.get(LAYOUT__cabac_init_idc, OFFSET__cabac_init_idc);}
    public void cabac_init_idc(int value) {this.ptr.set(LAYOUT__cabac_init_idc, OFFSET__cabac_init_idc, value);}
    public java.lang.foreign.MemorySegment $cabac_init_idc() {return this.ptr.asSlice(OFFSET__cabac_init_idc, LAYOUT__cabac_init_idc);}

    public int disable_deblocking_filter_idc() {return this.ptr.get(LAYOUT__disable_deblocking_filter_idc, OFFSET__disable_deblocking_filter_idc);}
    public void disable_deblocking_filter_idc(int value) {this.ptr.set(LAYOUT__disable_deblocking_filter_idc, OFFSET__disable_deblocking_filter_idc, value);}
    public java.lang.foreign.MemorySegment $disable_deblocking_filter_idc() {return this.ptr.asSlice(OFFSET__disable_deblocking_filter_idc, LAYOUT__disable_deblocking_filter_idc);}

    public java.lang.foreign.MemorySegment pWeightTable() {return this.ptr.get(LAYOUT__pWeightTable, OFFSET__pWeightTable);}
    public void pWeightTable(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWeightTable, OFFSET__pWeightTable, value);}
    public java.lang.foreign.MemorySegment $pWeightTable() {return this.ptr.asSlice(OFFSET__pWeightTable, LAYOUT__pWeightTable);}
}
