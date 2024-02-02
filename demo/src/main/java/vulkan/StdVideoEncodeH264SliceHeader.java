package vulkan;

public record StdVideoEncodeH264SliceHeader(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH264SliceHeaderFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$first_mb_in_slice = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$first_mb_in_slice = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$slice_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$slice_type = 8L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_alpha_c0_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_alpha_c0_offset_div2 = 12L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_beta_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_beta_offset_div2 = 13L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_qp_delta = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_qp_delta = 14L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$reserved1 = 15L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cabac_init_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cabac_init_idc = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$disable_deblocking_filter_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$disable_deblocking_filter_idc = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pWeightTable = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pWeightTable = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$first_mb_in_slice,
            LAYOUT$slice_type,
            LAYOUT$slice_alpha_c0_offset_div2,
            LAYOUT$slice_beta_offset_div2,
            LAYOUT$slice_qp_delta,
            LAYOUT$reserved1,
            LAYOUT$cabac_init_idc,
            LAYOUT$disable_deblocking_filter_idc,
            LAYOUT$pWeightTable
    ).withName("StdVideoEncodeH264SliceHeader");

    public StdVideoEncodeH264SliceHeader(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264SliceHeader getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264SliceHeader(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH264SliceHeaderFlags flags() {return new vulkan.StdVideoEncodeH264SliceHeaderFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264SliceHeaderFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264SliceHeaderFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public int first_mb_in_slice() {return this.ptr.get(LAYOUT$first_mb_in_slice, OFFSET$first_mb_in_slice);}
    public void first_mb_in_slice(int value) {this.ptr.set(LAYOUT$first_mb_in_slice, OFFSET$first_mb_in_slice, value);}
    public java.lang.foreign.MemorySegment first_mb_in_slice_ptr() {return this.ptr.asSlice(OFFSET$first_mb_in_slice, LAYOUT$first_mb_in_slice);}

    public int slice_type() {return this.ptr.get(LAYOUT$slice_type, OFFSET$slice_type);}
    public void slice_type(int value) {this.ptr.set(LAYOUT$slice_type, OFFSET$slice_type, value);}
    public java.lang.foreign.MemorySegment slice_type_ptr() {return this.ptr.asSlice(OFFSET$slice_type, LAYOUT$slice_type);}

    public char slice_alpha_c0_offset_div2() {return (char)this.ptr.get(LAYOUT$slice_alpha_c0_offset_div2, OFFSET$slice_alpha_c0_offset_div2);}
    public void slice_alpha_c0_offset_div2(char value) {this.ptr.set(LAYOUT$slice_alpha_c0_offset_div2, OFFSET$slice_alpha_c0_offset_div2, (byte)value);}
    public java.lang.foreign.MemorySegment slice_alpha_c0_offset_div2_ptr() {return this.ptr.asSlice(OFFSET$slice_alpha_c0_offset_div2, LAYOUT$slice_alpha_c0_offset_div2);}

    public char slice_beta_offset_div2() {return (char)this.ptr.get(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2);}
    public void slice_beta_offset_div2(char value) {this.ptr.set(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2, (byte)value);}
    public java.lang.foreign.MemorySegment slice_beta_offset_div2_ptr() {return this.ptr.asSlice(OFFSET$slice_beta_offset_div2, LAYOUT$slice_beta_offset_div2);}

    public char slice_qp_delta() {return (char)this.ptr.get(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta);}
    public void slice_qp_delta(char value) {this.ptr.set(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta, (byte)value);}
    public java.lang.foreign.MemorySegment slice_qp_delta_ptr() {return this.ptr.asSlice(OFFSET$slice_qp_delta, LAYOUT$slice_qp_delta);}

    public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
    public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
    public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

    public int cabac_init_idc() {return this.ptr.get(LAYOUT$cabac_init_idc, OFFSET$cabac_init_idc);}
    public void cabac_init_idc(int value) {this.ptr.set(LAYOUT$cabac_init_idc, OFFSET$cabac_init_idc, value);}
    public java.lang.foreign.MemorySegment cabac_init_idc_ptr() {return this.ptr.asSlice(OFFSET$cabac_init_idc, LAYOUT$cabac_init_idc);}

    public int disable_deblocking_filter_idc() {return this.ptr.get(LAYOUT$disable_deblocking_filter_idc, OFFSET$disable_deblocking_filter_idc);}
    public void disable_deblocking_filter_idc(int value) {this.ptr.set(LAYOUT$disable_deblocking_filter_idc, OFFSET$disable_deblocking_filter_idc, value);}
    public java.lang.foreign.MemorySegment disable_deblocking_filter_idc_ptr() {return this.ptr.asSlice(OFFSET$disable_deblocking_filter_idc, LAYOUT$disable_deblocking_filter_idc);}

    public java.lang.foreign.MemorySegment pWeightTable() {return this.ptr.get(LAYOUT$pWeightTable, OFFSET$pWeightTable);}
    public void pWeightTable(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWeightTable, OFFSET$pWeightTable, value);}
    public java.lang.foreign.MemorySegment pWeightTable_ptr() {return this.ptr.asSlice(OFFSET$pWeightTable, LAYOUT$pWeightTable);}
}
