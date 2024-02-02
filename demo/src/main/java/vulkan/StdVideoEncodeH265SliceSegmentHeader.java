package vulkan;

public record StdVideoEncodeH265SliceSegmentHeader(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$slice_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$slice_type = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$slice_segment_address = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$slice_segment_address = 8L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$collocated_ref_idx = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$collocated_ref_idx = 12L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$MaxNumMergeCand = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$MaxNumMergeCand = 13L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_cb_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_cb_qp_offset = 14L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_cr_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_cr_qp_offset = 15L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_beta_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_beta_offset_div2 = 16L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_tc_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_tc_offset_div2 = 17L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_act_y_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_act_y_qp_offset = 18L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_act_cb_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_act_cb_qp_offset = 19L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_act_cr_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_act_cr_qp_offset = 20L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$slice_qp_delta = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$slice_qp_delta = 21L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$reserved1 = 22L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pWeightTable = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pWeightTable = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$slice_type,
            LAYOUT$slice_segment_address,
            LAYOUT$collocated_ref_idx,
            LAYOUT$MaxNumMergeCand,
            LAYOUT$slice_cb_qp_offset,
            LAYOUT$slice_cr_qp_offset,
            LAYOUT$slice_beta_offset_div2,
            LAYOUT$slice_tc_offset_div2,
            LAYOUT$slice_act_y_qp_offset,
            LAYOUT$slice_act_cb_qp_offset,
            LAYOUT$slice_act_cr_qp_offset,
            LAYOUT$slice_qp_delta,
            LAYOUT$reserved1,
            LAYOUT$pWeightTable
    ).withName("StdVideoEncodeH265SliceSegmentHeader");

    public StdVideoEncodeH265SliceSegmentHeader(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265SliceSegmentHeader getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265SliceSegmentHeader(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags flags() {return new vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public int slice_type() {return this.ptr.get(LAYOUT$slice_type, OFFSET$slice_type);}
    public void slice_type(int value) {this.ptr.set(LAYOUT$slice_type, OFFSET$slice_type, value);}
    public java.lang.foreign.MemorySegment slice_type_ptr() {return this.ptr.asSlice(OFFSET$slice_type, LAYOUT$slice_type);}

    public int slice_segment_address() {return this.ptr.get(LAYOUT$slice_segment_address, OFFSET$slice_segment_address);}
    public void slice_segment_address(int value) {this.ptr.set(LAYOUT$slice_segment_address, OFFSET$slice_segment_address, value);}
    public java.lang.foreign.MemorySegment slice_segment_address_ptr() {return this.ptr.asSlice(OFFSET$slice_segment_address, LAYOUT$slice_segment_address);}

    public char collocated_ref_idx() {return (char)this.ptr.get(LAYOUT$collocated_ref_idx, OFFSET$collocated_ref_idx);}
    public void collocated_ref_idx(char value) {this.ptr.set(LAYOUT$collocated_ref_idx, OFFSET$collocated_ref_idx, (byte)value);}
    public java.lang.foreign.MemorySegment collocated_ref_idx_ptr() {return this.ptr.asSlice(OFFSET$collocated_ref_idx, LAYOUT$collocated_ref_idx);}

    public char MaxNumMergeCand() {return (char)this.ptr.get(LAYOUT$MaxNumMergeCand, OFFSET$MaxNumMergeCand);}
    public void MaxNumMergeCand(char value) {this.ptr.set(LAYOUT$MaxNumMergeCand, OFFSET$MaxNumMergeCand, (byte)value);}
    public java.lang.foreign.MemorySegment MaxNumMergeCand_ptr() {return this.ptr.asSlice(OFFSET$MaxNumMergeCand, LAYOUT$MaxNumMergeCand);}

    public char slice_cb_qp_offset() {return (char)this.ptr.get(LAYOUT$slice_cb_qp_offset, OFFSET$slice_cb_qp_offset);}
    public void slice_cb_qp_offset(char value) {this.ptr.set(LAYOUT$slice_cb_qp_offset, OFFSET$slice_cb_qp_offset, (byte)value);}
    public java.lang.foreign.MemorySegment slice_cb_qp_offset_ptr() {return this.ptr.asSlice(OFFSET$slice_cb_qp_offset, LAYOUT$slice_cb_qp_offset);}

    public char slice_cr_qp_offset() {return (char)this.ptr.get(LAYOUT$slice_cr_qp_offset, OFFSET$slice_cr_qp_offset);}
    public void slice_cr_qp_offset(char value) {this.ptr.set(LAYOUT$slice_cr_qp_offset, OFFSET$slice_cr_qp_offset, (byte)value);}
    public java.lang.foreign.MemorySegment slice_cr_qp_offset_ptr() {return this.ptr.asSlice(OFFSET$slice_cr_qp_offset, LAYOUT$slice_cr_qp_offset);}

    public char slice_beta_offset_div2() {return (char)this.ptr.get(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2);}
    public void slice_beta_offset_div2(char value) {this.ptr.set(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2, (byte)value);}
    public java.lang.foreign.MemorySegment slice_beta_offset_div2_ptr() {return this.ptr.asSlice(OFFSET$slice_beta_offset_div2, LAYOUT$slice_beta_offset_div2);}

    public char slice_tc_offset_div2() {return (char)this.ptr.get(LAYOUT$slice_tc_offset_div2, OFFSET$slice_tc_offset_div2);}
    public void slice_tc_offset_div2(char value) {this.ptr.set(LAYOUT$slice_tc_offset_div2, OFFSET$slice_tc_offset_div2, (byte)value);}
    public java.lang.foreign.MemorySegment slice_tc_offset_div2_ptr() {return this.ptr.asSlice(OFFSET$slice_tc_offset_div2, LAYOUT$slice_tc_offset_div2);}

    public char slice_act_y_qp_offset() {return (char)this.ptr.get(LAYOUT$slice_act_y_qp_offset, OFFSET$slice_act_y_qp_offset);}
    public void slice_act_y_qp_offset(char value) {this.ptr.set(LAYOUT$slice_act_y_qp_offset, OFFSET$slice_act_y_qp_offset, (byte)value);}
    public java.lang.foreign.MemorySegment slice_act_y_qp_offset_ptr() {return this.ptr.asSlice(OFFSET$slice_act_y_qp_offset, LAYOUT$slice_act_y_qp_offset);}

    public char slice_act_cb_qp_offset() {return (char)this.ptr.get(LAYOUT$slice_act_cb_qp_offset, OFFSET$slice_act_cb_qp_offset);}
    public void slice_act_cb_qp_offset(char value) {this.ptr.set(LAYOUT$slice_act_cb_qp_offset, OFFSET$slice_act_cb_qp_offset, (byte)value);}
    public java.lang.foreign.MemorySegment slice_act_cb_qp_offset_ptr() {return this.ptr.asSlice(OFFSET$slice_act_cb_qp_offset, LAYOUT$slice_act_cb_qp_offset);}

    public char slice_act_cr_qp_offset() {return (char)this.ptr.get(LAYOUT$slice_act_cr_qp_offset, OFFSET$slice_act_cr_qp_offset);}
    public void slice_act_cr_qp_offset(char value) {this.ptr.set(LAYOUT$slice_act_cr_qp_offset, OFFSET$slice_act_cr_qp_offset, (byte)value);}
    public java.lang.foreign.MemorySegment slice_act_cr_qp_offset_ptr() {return this.ptr.asSlice(OFFSET$slice_act_cr_qp_offset, LAYOUT$slice_act_cr_qp_offset);}

    public char slice_qp_delta() {return (char)this.ptr.get(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta);}
    public void slice_qp_delta(char value) {this.ptr.set(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta, (byte)value);}
    public java.lang.foreign.MemorySegment slice_qp_delta_ptr() {return this.ptr.asSlice(OFFSET$slice_qp_delta, LAYOUT$slice_qp_delta);}

    public short reserved1() {return this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
    public void reserved1(short value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, value);}
    public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

    public java.lang.foreign.MemorySegment pWeightTable() {return this.ptr.get(LAYOUT$pWeightTable, OFFSET$pWeightTable);}
    public void pWeightTable(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWeightTable, OFFSET$pWeightTable, value);}
    public java.lang.foreign.MemorySegment pWeightTable_ptr() {return this.ptr.asSlice(OFFSET$pWeightTable, LAYOUT$pWeightTable);}
}
