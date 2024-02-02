package vulkan;

public record StdVideoEncodeH265WeightTable(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH265WeightTableFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$luma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$luma_log2_weight_denom = 8L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$delta_chroma_log2_weight_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$delta_chroma_log2_weight_denom = 9L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_luma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$delta_luma_weight_l0 = 10L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$luma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$luma_offset_l0 = 25L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_chroma_weight_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$delta_chroma_weight_l0 = 40L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_chroma_offset_l0 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$delta_chroma_offset_l0 = 70L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_luma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$delta_luma_weight_l1 = 100L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$luma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$luma_offset_l1 = 115L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_chroma_weight_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$delta_chroma_weight_l1 = 130L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_chroma_offset_l1 = java.lang.foreign.MemoryLayout.sequenceLayout(15, java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE));
    public static final long OFFSET$delta_chroma_offset_l1 = 160L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$luma_log2_weight_denom,
            LAYOUT$delta_chroma_log2_weight_denom,
            LAYOUT$delta_luma_weight_l0,
            LAYOUT$luma_offset_l0,
            LAYOUT$delta_chroma_weight_l0,
            LAYOUT$delta_chroma_offset_l0,
            LAYOUT$delta_luma_weight_l1,
            LAYOUT$luma_offset_l1,
            LAYOUT$delta_chroma_weight_l1,
            LAYOUT$delta_chroma_offset_l1
    ).withName("StdVideoEncodeH265WeightTable");

    public StdVideoEncodeH265WeightTable(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265WeightTable getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265WeightTable(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH265WeightTableFlags flags() {return new vulkan.StdVideoEncodeH265WeightTableFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265WeightTableFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265WeightTableFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public char luma_log2_weight_denom() {return (char)this.ptr.get(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom);}
    public void luma_log2_weight_denom(char value) {this.ptr.set(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom, (byte)value);}
    public java.lang.foreign.MemorySegment luma_log2_weight_denom_ptr() {return this.ptr.asSlice(OFFSET$luma_log2_weight_denom, LAYOUT$luma_log2_weight_denom);}

    public char delta_chroma_log2_weight_denom() {return (char)this.ptr.get(LAYOUT$delta_chroma_log2_weight_denom, OFFSET$delta_chroma_log2_weight_denom);}
    public void delta_chroma_log2_weight_denom(char value) {this.ptr.set(LAYOUT$delta_chroma_log2_weight_denom, OFFSET$delta_chroma_log2_weight_denom, (byte)value);}
    public java.lang.foreign.MemorySegment delta_chroma_log2_weight_denom_ptr() {return this.ptr.asSlice(OFFSET$delta_chroma_log2_weight_denom, LAYOUT$delta_chroma_log2_weight_denom);}

    public java.lang.foreign.MemorySegment delta_luma_weight_l0() {return this.ptr.asSlice(OFFSET$delta_luma_weight_l0, LAYOUT$delta_luma_weight_l0);}
    public char delta_luma_weight_l0(int i) {return (char)this.delta_luma_weight_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void delta_luma_weight_l0(int i, char value) {this.delta_luma_weight_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment luma_offset_l0() {return this.ptr.asSlice(OFFSET$luma_offset_l0, LAYOUT$luma_offset_l0);}
    public char luma_offset_l0(int i) {return (char)this.luma_offset_l0().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void luma_offset_l0(int i, char value) {this.luma_offset_l0().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment delta_chroma_weight_l0() {return this.ptr.asSlice(OFFSET$delta_chroma_weight_l0, LAYOUT$delta_chroma_weight_l0);}

    public java.lang.foreign.MemorySegment delta_chroma_offset_l0() {return this.ptr.asSlice(OFFSET$delta_chroma_offset_l0, LAYOUT$delta_chroma_offset_l0);}

    public java.lang.foreign.MemorySegment delta_luma_weight_l1() {return this.ptr.asSlice(OFFSET$delta_luma_weight_l1, LAYOUT$delta_luma_weight_l1);}
    public char delta_luma_weight_l1(int i) {return (char)this.delta_luma_weight_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void delta_luma_weight_l1(int i, char value) {this.delta_luma_weight_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment luma_offset_l1() {return this.ptr.asSlice(OFFSET$luma_offset_l1, LAYOUT$luma_offset_l1);}
    public char luma_offset_l1(int i) {return (char)this.luma_offset_l1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void luma_offset_l1(int i, char value) {this.luma_offset_l1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment delta_chroma_weight_l1() {return this.ptr.asSlice(OFFSET$delta_chroma_weight_l1, LAYOUT$delta_chroma_weight_l1);}

    public java.lang.foreign.MemorySegment delta_chroma_offset_l1() {return this.ptr.asSlice(OFFSET$delta_chroma_offset_l1, LAYOUT$delta_chroma_offset_l1);}
}
