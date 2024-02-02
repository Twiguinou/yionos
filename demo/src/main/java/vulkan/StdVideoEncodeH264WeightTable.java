package vulkan;

public record StdVideoEncodeH264WeightTable(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH264WeightTableFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$luma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$luma_log2_weight_denom = 16L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$chroma_log2_weight_denom = 17L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$luma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$luma_weight_l0 = 18L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$luma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$luma_offset_l0 = 50L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$chroma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$chroma_weight_l0 = 82L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$chroma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$chroma_offset_l0 = 146L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$luma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$luma_weight_l1 = 210L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$luma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$luma_offset_l1 = 242L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$chroma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$chroma_weight_l1 = 274L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$chroma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$chroma_offset_l1 = 338L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$luma_log2_weight_denom,
            LAYOUT$chroma_log2_weight_denom,
            LAYOUT$luma_weight_l0,
            LAYOUT$luma_offset_l0,
            LAYOUT$chroma_weight_l0,
            LAYOUT$chroma_offset_l0,
            LAYOUT$luma_weight_l1,
            LAYOUT$luma_offset_l1,
            LAYOUT$chroma_weight_l1,
            LAYOUT$chroma_offset_l1,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withName("StdVideoEncodeH264WeightTable");

    public StdVideoEncodeH264WeightTable(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264WeightTable getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264WeightTable(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH264WeightTableFlags flags() {return new vulkan.StdVideoEncodeH264WeightTableFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264WeightTableFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264WeightTableFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public char luma_log2_weight_denom() {return (char)this.ptr.get(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom);}
    public void luma_log2_weight_denom(char value) {this.ptr.set(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom, (byte)value);}
    public java.lang.foreign.MemorySegment luma_log2_weight_denom_ptr() {return this.ptr.asSlice(OFFSET$luma_log2_weight_denom, LAYOUT$luma_log2_weight_denom);}

    public char chroma_log2_weight_denom() {return (char)this.ptr.get(LAYOUT$chroma_log2_weight_denom, OFFSET$chroma_log2_weight_denom);}
    public void chroma_log2_weight_denom(char value) {this.ptr.set(LAYOUT$chroma_log2_weight_denom, OFFSET$chroma_log2_weight_denom, (byte)value);}
    public java.lang.foreign.MemorySegment chroma_log2_weight_denom_ptr() {return this.ptr.asSlice(OFFSET$chroma_log2_weight_denom, LAYOUT$chroma_log2_weight_denom);}

    public java.lang.foreign.MemorySegment luma_weight_l0() {return this.ptr.asSlice(OFFSET$luma_weight_l0, LAYOUT$luma_weight_l0);}
    public char luma_weight_l0(int i) {return (char)this.luma_weight_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void luma_weight_l0(int i, char value) {this.luma_weight_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment luma_offset_l0() {return this.ptr.asSlice(OFFSET$luma_offset_l0, LAYOUT$luma_offset_l0);}
    public char luma_offset_l0(int i) {return (char)this.luma_offset_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void luma_offset_l0(int i, char value) {this.luma_offset_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment chroma_weight_l0() {return this.ptr.asSlice(OFFSET$chroma_weight_l0, LAYOUT$chroma_weight_l0);}

    public java.lang.foreign.MemorySegment chroma_offset_l0() {return this.ptr.asSlice(OFFSET$chroma_offset_l0, LAYOUT$chroma_offset_l0);}

    public java.lang.foreign.MemorySegment luma_weight_l1() {return this.ptr.asSlice(OFFSET$luma_weight_l1, LAYOUT$luma_weight_l1);}
    public char luma_weight_l1(int i) {return (char)this.luma_weight_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void luma_weight_l1(int i, char value) {this.luma_weight_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment luma_offset_l1() {return this.ptr.asSlice(OFFSET$luma_offset_l1, LAYOUT$luma_offset_l1);}
    public char luma_offset_l1(int i) {return (char)this.luma_offset_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void luma_offset_l1(int i, char value) {this.luma_offset_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment chroma_weight_l1() {return this.ptr.asSlice(OFFSET$chroma_weight_l1, LAYOUT$chroma_weight_l1);}

    public java.lang.foreign.MemorySegment chroma_offset_l1() {return this.ptr.asSlice(OFFSET$chroma_offset_l1, LAYOUT$chroma_offset_l1);}
}
