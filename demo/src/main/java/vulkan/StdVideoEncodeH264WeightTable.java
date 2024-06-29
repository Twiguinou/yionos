package vulkan;

public record StdVideoEncodeH264WeightTable(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH264WeightTableFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__luma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__luma_log2_weight_denom = 16;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__chroma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__chroma_log2_weight_denom = 17;
    public static final java.lang.foreign.SequenceLayout LAYOUT__luma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__luma_weight_l0 = 18;
    public static final java.lang.foreign.SequenceLayout LAYOUT__luma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__luma_offset_l0 = 50;
    public static final java.lang.foreign.SequenceLayout LAYOUT__chroma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__chroma_weight_l0 = 82;
    public static final java.lang.foreign.SequenceLayout LAYOUT__chroma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__chroma_offset_l0 = 146;
    public static final java.lang.foreign.SequenceLayout LAYOUT__luma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__luma_weight_l1 = 210;
    public static final java.lang.foreign.SequenceLayout LAYOUT__luma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__luma_offset_l1 = 242;
    public static final java.lang.foreign.SequenceLayout LAYOUT__chroma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__chroma_weight_l1 = 274;
    public static final java.lang.foreign.SequenceLayout LAYOUT__chroma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET__chroma_offset_l1 = 338;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__luma_log2_weight_denom,
            LAYOUT__chroma_log2_weight_denom,
            LAYOUT__luma_weight_l0,
            LAYOUT__luma_offset_l0,
            LAYOUT__chroma_weight_l0,
            LAYOUT__chroma_offset_l0,
            LAYOUT__luma_weight_l1,
            LAYOUT__luma_offset_l1,
            LAYOUT__chroma_weight_l1,
            LAYOUT__chroma_offset_l1,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(4).withName("StdVideoEncodeH264WeightTable");

    public StdVideoEncodeH264WeightTable(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264WeightTable getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264WeightTable(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264WeightTable value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH264WeightTableFlags flags() {return new vulkan.StdVideoEncodeH264WeightTableFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264WeightTableFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264WeightTableFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte luma_log2_weight_denom() {return this.ptr.get(LAYOUT__luma_log2_weight_denom, OFFSET__luma_log2_weight_denom);}
    public void luma_log2_weight_denom(byte value) {this.ptr.set(LAYOUT__luma_log2_weight_denom, OFFSET__luma_log2_weight_denom, value);}
    public java.lang.foreign.MemorySegment $luma_log2_weight_denom() {return this.ptr.asSlice(OFFSET__luma_log2_weight_denom, LAYOUT__luma_log2_weight_denom);}

    public byte chroma_log2_weight_denom() {return this.ptr.get(LAYOUT__chroma_log2_weight_denom, OFFSET__chroma_log2_weight_denom);}
    public void chroma_log2_weight_denom(byte value) {this.ptr.set(LAYOUT__chroma_log2_weight_denom, OFFSET__chroma_log2_weight_denom, value);}
    public java.lang.foreign.MemorySegment $chroma_log2_weight_denom() {return this.ptr.asSlice(OFFSET__chroma_log2_weight_denom, LAYOUT__chroma_log2_weight_denom);}

    public java.lang.foreign.MemorySegment luma_weight_l0() {return this.ptr.asSlice(OFFSET__luma_weight_l0, LAYOUT__luma_weight_l0);}
    public byte luma_weight_l0(int index) {return this.luma_weight_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void luma_weight_l0(int index, byte value) {this.luma_weight_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment luma_offset_l0() {return this.ptr.asSlice(OFFSET__luma_offset_l0, LAYOUT__luma_offset_l0);}
    public byte luma_offset_l0(int index) {return this.luma_offset_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void luma_offset_l0(int index, byte value) {this.luma_offset_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment chroma_weight_l0() {return this.ptr.asSlice(OFFSET__chroma_weight_l0, LAYOUT__chroma_weight_l0);}

    public java.lang.foreign.MemorySegment chroma_offset_l0() {return this.ptr.asSlice(OFFSET__chroma_offset_l0, LAYOUT__chroma_offset_l0);}

    public java.lang.foreign.MemorySegment luma_weight_l1() {return this.ptr.asSlice(OFFSET__luma_weight_l1, LAYOUT__luma_weight_l1);}
    public byte luma_weight_l1(int index) {return this.luma_weight_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void luma_weight_l1(int index, byte value) {this.luma_weight_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment luma_offset_l1() {return this.ptr.asSlice(OFFSET__luma_offset_l1, LAYOUT__luma_offset_l1);}
    public byte luma_offset_l1(int index) {return this.luma_offset_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void luma_offset_l1(int index, byte value) {this.luma_offset_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment chroma_weight_l1() {return this.ptr.asSlice(OFFSET__chroma_weight_l1, LAYOUT__chroma_weight_l1);}

    public java.lang.foreign.MemorySegment chroma_offset_l1() {return this.ptr.asSlice(OFFSET__chroma_offset_l1, LAYOUT__chroma_offset_l1);}
}
