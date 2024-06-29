package vulkan;

public record StdVideoEncodeH265WeightTable(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH265WeightTableFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__luma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__luma_log2_weight_denom = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__delta_chroma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__delta_chroma_log2_weight_denom = 9;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_luma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__delta_luma_weight_l0 = 10;
    public static final java.lang.foreign.SequenceLayout LAYOUT__luma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__luma_offset_l0 = 25;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_chroma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__delta_chroma_weight_l0 = 40;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_chroma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__delta_chroma_offset_l0 = 70;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_luma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__delta_luma_weight_l1 = 100;
    public static final java.lang.foreign.SequenceLayout LAYOUT__luma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__luma_offset_l1 = 115;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_chroma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__delta_chroma_weight_l1 = 130;
    public static final java.lang.foreign.SequenceLayout LAYOUT__delta_chroma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__delta_chroma_offset_l1 = 160;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__luma_log2_weight_denom,
            LAYOUT__delta_chroma_log2_weight_denom,
            LAYOUT__delta_luma_weight_l0,
            LAYOUT__luma_offset_l0,
            LAYOUT__delta_chroma_weight_l0,
            LAYOUT__delta_chroma_offset_l0,
            LAYOUT__delta_luma_weight_l1,
            LAYOUT__luma_offset_l1,
            LAYOUT__delta_chroma_weight_l1,
            LAYOUT__delta_chroma_offset_l1
    ).withByteAlignment(2).withName("StdVideoEncodeH265WeightTable");

    public StdVideoEncodeH265WeightTable(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH265WeightTable getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH265WeightTable(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH265WeightTable value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH265WeightTableFlags flags() {return new vulkan.StdVideoEncodeH265WeightTableFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265WeightTableFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265WeightTableFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte luma_log2_weight_denom() {return this.ptr.get(LAYOUT__luma_log2_weight_denom, OFFSET__luma_log2_weight_denom);}
    public void luma_log2_weight_denom(byte value) {this.ptr.set(LAYOUT__luma_log2_weight_denom, OFFSET__luma_log2_weight_denom, value);}
    public java.lang.foreign.MemorySegment $luma_log2_weight_denom() {return this.ptr.asSlice(OFFSET__luma_log2_weight_denom, LAYOUT__luma_log2_weight_denom);}

    public byte delta_chroma_log2_weight_denom() {return this.ptr.get(LAYOUT__delta_chroma_log2_weight_denom, OFFSET__delta_chroma_log2_weight_denom);}
    public void delta_chroma_log2_weight_denom(byte value) {this.ptr.set(LAYOUT__delta_chroma_log2_weight_denom, OFFSET__delta_chroma_log2_weight_denom, value);}
    public java.lang.foreign.MemorySegment $delta_chroma_log2_weight_denom() {return this.ptr.asSlice(OFFSET__delta_chroma_log2_weight_denom, LAYOUT__delta_chroma_log2_weight_denom);}

    public java.lang.foreign.MemorySegment delta_luma_weight_l0() {return this.ptr.asSlice(OFFSET__delta_luma_weight_l0, LAYOUT__delta_luma_weight_l0);}
    public byte delta_luma_weight_l0(int index) {return this.delta_luma_weight_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void delta_luma_weight_l0(int index, byte value) {this.delta_luma_weight_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment luma_offset_l0() {return this.ptr.asSlice(OFFSET__luma_offset_l0, LAYOUT__luma_offset_l0);}
    public byte luma_offset_l0(int index) {return this.luma_offset_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void luma_offset_l0(int index, byte value) {this.luma_offset_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment delta_chroma_weight_l0() {return this.ptr.asSlice(OFFSET__delta_chroma_weight_l0, LAYOUT__delta_chroma_weight_l0);}

    public java.lang.foreign.MemorySegment delta_chroma_offset_l0() {return this.ptr.asSlice(OFFSET__delta_chroma_offset_l0, LAYOUT__delta_chroma_offset_l0);}

    public java.lang.foreign.MemorySegment delta_luma_weight_l1() {return this.ptr.asSlice(OFFSET__delta_luma_weight_l1, LAYOUT__delta_luma_weight_l1);}
    public byte delta_luma_weight_l1(int index) {return this.delta_luma_weight_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void delta_luma_weight_l1(int index, byte value) {this.delta_luma_weight_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment luma_offset_l1() {return this.ptr.asSlice(OFFSET__luma_offset_l1, LAYOUT__luma_offset_l1);}
    public byte luma_offset_l1(int index) {return this.luma_offset_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void luma_offset_l1(int index, byte value) {this.luma_offset_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment delta_chroma_weight_l1() {return this.ptr.asSlice(OFFSET__delta_chroma_weight_l1, LAYOUT__delta_chroma_weight_l1);}

    public java.lang.foreign.MemorySegment delta_chroma_offset_l1() {return this.ptr.asSlice(OFFSET__delta_chroma_offset_l1, LAYOUT__delta_chroma_offset_l1);}
}
