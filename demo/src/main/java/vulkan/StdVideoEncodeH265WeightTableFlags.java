package vulkan;

public record StdVideoEncodeH265WeightTableFlags(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$luma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$luma_weight_l0_flag = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$chroma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$chroma_weight_l0_flag = 2L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$luma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$luma_weight_l1_flag = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$chroma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$chroma_weight_l1_flag = 6L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$luma_weight_l0_flag,
            LAYOUT$chroma_weight_l0_flag,
            LAYOUT$luma_weight_l1_flag,
            LAYOUT$chroma_weight_l1_flag
    ).withName("StdVideoEncodeH265WeightTableFlags");

    public StdVideoEncodeH265WeightTableFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265WeightTableFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265WeightTableFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public short luma_weight_l0_flag() {return this.ptr.get(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag);}
    public void luma_weight_l0_flag(short value) {this.ptr.set(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment luma_weight_l0_flag_ptr() {return this.ptr.asSlice(OFFSET$luma_weight_l0_flag, LAYOUT$luma_weight_l0_flag);}

    public short chroma_weight_l0_flag() {return this.ptr.get(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag);}
    public void chroma_weight_l0_flag(short value) {this.ptr.set(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment chroma_weight_l0_flag_ptr() {return this.ptr.asSlice(OFFSET$chroma_weight_l0_flag, LAYOUT$chroma_weight_l0_flag);}

    public short luma_weight_l1_flag() {return this.ptr.get(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag);}
    public void luma_weight_l1_flag(short value) {this.ptr.set(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment luma_weight_l1_flag_ptr() {return this.ptr.asSlice(OFFSET$luma_weight_l1_flag, LAYOUT$luma_weight_l1_flag);}

    public short chroma_weight_l1_flag() {return this.ptr.get(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag);}
    public void chroma_weight_l1_flag(short value) {this.ptr.set(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment chroma_weight_l1_flag_ptr() {return this.ptr.asSlice(OFFSET$chroma_weight_l1_flag, LAYOUT$chroma_weight_l1_flag);}
}
