package vulkan;

public record StdVideoEncodeH265SliceSegmentHeader(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__slice_type = java.lang.foreign.ValueLayout.JAVA_INT.withName("slice_type");
    public static final long OFFSET__slice_type = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__slice_segment_address = java.lang.foreign.ValueLayout.JAVA_INT.withName("slice_segment_address");
    public static final long OFFSET__slice_segment_address = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__collocated_ref_idx = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("collocated_ref_idx");
    public static final long OFFSET__collocated_ref_idx = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__MaxNumMergeCand = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("MaxNumMergeCand");
    public static final long OFFSET__MaxNumMergeCand = 13;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_cb_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_cb_qp_offset");
    public static final long OFFSET__slice_cb_qp_offset = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_cr_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_cr_qp_offset");
    public static final long OFFSET__slice_cr_qp_offset = 15;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_beta_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_beta_offset_div2");
    public static final long OFFSET__slice_beta_offset_div2 = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_tc_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_tc_offset_div2");
    public static final long OFFSET__slice_tc_offset_div2 = 17;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_act_y_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_act_y_qp_offset");
    public static final long OFFSET__slice_act_y_qp_offset = 18;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_act_cb_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_act_cb_qp_offset");
    public static final long OFFSET__slice_act_cb_qp_offset = 19;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_act_cr_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_act_cr_qp_offset");
    public static final long OFFSET__slice_act_cr_qp_offset = 20;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__slice_qp_delta = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("slice_qp_delta");
    public static final long OFFSET__slice_qp_delta = 21;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("reserved1");
    public static final long OFFSET__reserved1 = 22;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWeightTable = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pWeightTable");
    public static final long OFFSET__pWeightTable = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__slice_type,
            LAYOUT__slice_segment_address,
            LAYOUT__collocated_ref_idx,
            LAYOUT__MaxNumMergeCand,
            LAYOUT__slice_cb_qp_offset,
            LAYOUT__slice_cr_qp_offset,
            LAYOUT__slice_beta_offset_div2,
            LAYOUT__slice_tc_offset_div2,
            LAYOUT__slice_act_y_qp_offset,
            LAYOUT__slice_act_cb_qp_offset,
            LAYOUT__slice_act_cr_qp_offset,
            LAYOUT__slice_qp_delta,
            LAYOUT__reserved1,
            LAYOUT__pWeightTable
    ).withByteAlignment(8).withName("StdVideoEncodeH265SliceSegmentHeader");

    public StdVideoEncodeH265SliceSegmentHeader(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH265SliceSegmentHeader getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH265SliceSegmentHeader(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH265SliceSegmentHeader value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags flags() {return new vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265SliceSegmentHeaderFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int slice_type() {return this.ptr.get(LAYOUT__slice_type, OFFSET__slice_type);}
    public void slice_type(int value) {this.ptr.set(LAYOUT__slice_type, OFFSET__slice_type, value);}
    public java.lang.foreign.MemorySegment $slice_type() {return this.ptr.asSlice(OFFSET__slice_type, LAYOUT__slice_type);}

    public int slice_segment_address() {return this.ptr.get(LAYOUT__slice_segment_address, OFFSET__slice_segment_address);}
    public void slice_segment_address(int value) {this.ptr.set(LAYOUT__slice_segment_address, OFFSET__slice_segment_address, value);}
    public java.lang.foreign.MemorySegment $slice_segment_address() {return this.ptr.asSlice(OFFSET__slice_segment_address, LAYOUT__slice_segment_address);}

    public byte collocated_ref_idx() {return this.ptr.get(LAYOUT__collocated_ref_idx, OFFSET__collocated_ref_idx);}
    public void collocated_ref_idx(byte value) {this.ptr.set(LAYOUT__collocated_ref_idx, OFFSET__collocated_ref_idx, value);}
    public java.lang.foreign.MemorySegment $collocated_ref_idx() {return this.ptr.asSlice(OFFSET__collocated_ref_idx, LAYOUT__collocated_ref_idx);}

    public byte MaxNumMergeCand() {return this.ptr.get(LAYOUT__MaxNumMergeCand, OFFSET__MaxNumMergeCand);}
    public void MaxNumMergeCand(byte value) {this.ptr.set(LAYOUT__MaxNumMergeCand, OFFSET__MaxNumMergeCand, value);}
    public java.lang.foreign.MemorySegment $MaxNumMergeCand() {return this.ptr.asSlice(OFFSET__MaxNumMergeCand, LAYOUT__MaxNumMergeCand);}

    public byte slice_cb_qp_offset() {return this.ptr.get(LAYOUT__slice_cb_qp_offset, OFFSET__slice_cb_qp_offset);}
    public void slice_cb_qp_offset(byte value) {this.ptr.set(LAYOUT__slice_cb_qp_offset, OFFSET__slice_cb_qp_offset, value);}
    public java.lang.foreign.MemorySegment $slice_cb_qp_offset() {return this.ptr.asSlice(OFFSET__slice_cb_qp_offset, LAYOUT__slice_cb_qp_offset);}

    public byte slice_cr_qp_offset() {return this.ptr.get(LAYOUT__slice_cr_qp_offset, OFFSET__slice_cr_qp_offset);}
    public void slice_cr_qp_offset(byte value) {this.ptr.set(LAYOUT__slice_cr_qp_offset, OFFSET__slice_cr_qp_offset, value);}
    public java.lang.foreign.MemorySegment $slice_cr_qp_offset() {return this.ptr.asSlice(OFFSET__slice_cr_qp_offset, LAYOUT__slice_cr_qp_offset);}

    public byte slice_beta_offset_div2() {return this.ptr.get(LAYOUT__slice_beta_offset_div2, OFFSET__slice_beta_offset_div2);}
    public void slice_beta_offset_div2(byte value) {this.ptr.set(LAYOUT__slice_beta_offset_div2, OFFSET__slice_beta_offset_div2, value);}
    public java.lang.foreign.MemorySegment $slice_beta_offset_div2() {return this.ptr.asSlice(OFFSET__slice_beta_offset_div2, LAYOUT__slice_beta_offset_div2);}

    public byte slice_tc_offset_div2() {return this.ptr.get(LAYOUT__slice_tc_offset_div2, OFFSET__slice_tc_offset_div2);}
    public void slice_tc_offset_div2(byte value) {this.ptr.set(LAYOUT__slice_tc_offset_div2, OFFSET__slice_tc_offset_div2, value);}
    public java.lang.foreign.MemorySegment $slice_tc_offset_div2() {return this.ptr.asSlice(OFFSET__slice_tc_offset_div2, LAYOUT__slice_tc_offset_div2);}

    public byte slice_act_y_qp_offset() {return this.ptr.get(LAYOUT__slice_act_y_qp_offset, OFFSET__slice_act_y_qp_offset);}
    public void slice_act_y_qp_offset(byte value) {this.ptr.set(LAYOUT__slice_act_y_qp_offset, OFFSET__slice_act_y_qp_offset, value);}
    public java.lang.foreign.MemorySegment $slice_act_y_qp_offset() {return this.ptr.asSlice(OFFSET__slice_act_y_qp_offset, LAYOUT__slice_act_y_qp_offset);}

    public byte slice_act_cb_qp_offset() {return this.ptr.get(LAYOUT__slice_act_cb_qp_offset, OFFSET__slice_act_cb_qp_offset);}
    public void slice_act_cb_qp_offset(byte value) {this.ptr.set(LAYOUT__slice_act_cb_qp_offset, OFFSET__slice_act_cb_qp_offset, value);}
    public java.lang.foreign.MemorySegment $slice_act_cb_qp_offset() {return this.ptr.asSlice(OFFSET__slice_act_cb_qp_offset, LAYOUT__slice_act_cb_qp_offset);}

    public byte slice_act_cr_qp_offset() {return this.ptr.get(LAYOUT__slice_act_cr_qp_offset, OFFSET__slice_act_cr_qp_offset);}
    public void slice_act_cr_qp_offset(byte value) {this.ptr.set(LAYOUT__slice_act_cr_qp_offset, OFFSET__slice_act_cr_qp_offset, value);}
    public java.lang.foreign.MemorySegment $slice_act_cr_qp_offset() {return this.ptr.asSlice(OFFSET__slice_act_cr_qp_offset, LAYOUT__slice_act_cr_qp_offset);}

    public byte slice_qp_delta() {return this.ptr.get(LAYOUT__slice_qp_delta, OFFSET__slice_qp_delta);}
    public void slice_qp_delta(byte value) {this.ptr.set(LAYOUT__slice_qp_delta, OFFSET__slice_qp_delta, value);}
    public java.lang.foreign.MemorySegment $slice_qp_delta() {return this.ptr.asSlice(OFFSET__slice_qp_delta, LAYOUT__slice_qp_delta);}

    public short reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(short value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public java.lang.foreign.MemorySegment pWeightTable() {return this.ptr.get(LAYOUT__pWeightTable, OFFSET__pWeightTable);}
    public void pWeightTable(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWeightTable, OFFSET__pWeightTable, value);}
    public java.lang.foreign.MemorySegment $pWeightTable() {return this.ptr.asSlice(OFFSET__pWeightTable, LAYOUT__pWeightTable);}
}
