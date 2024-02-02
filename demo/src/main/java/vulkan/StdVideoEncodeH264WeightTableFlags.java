package vulkan;

public record StdVideoEncodeH264WeightTableFlags(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$luma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$luma_weight_l0_flag = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$chroma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$chroma_weight_l0_flag = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$luma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$luma_weight_l1_flag = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$chroma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$chroma_weight_l1_flag = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$luma_weight_l0_flag,
            LAYOUT$chroma_weight_l0_flag,
            LAYOUT$luma_weight_l1_flag,
            LAYOUT$chroma_weight_l1_flag
    ).withName("StdVideoEncodeH264WeightTableFlags");

    public StdVideoEncodeH264WeightTableFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264WeightTableFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264WeightTableFlags(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int luma_weight_l0_flag() {return this.ptr.get(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag);}
    public void luma_weight_l0_flag(int value) {this.ptr.set(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment luma_weight_l0_flag_ptr() {return this.ptr.asSlice(OFFSET$luma_weight_l0_flag, LAYOUT$luma_weight_l0_flag);}

    public int chroma_weight_l0_flag() {return this.ptr.get(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag);}
    public void chroma_weight_l0_flag(int value) {this.ptr.set(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment chroma_weight_l0_flag_ptr() {return this.ptr.asSlice(OFFSET$chroma_weight_l0_flag, LAYOUT$chroma_weight_l0_flag);}

    public int luma_weight_l1_flag() {return this.ptr.get(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag);}
    public void luma_weight_l1_flag(int value) {this.ptr.set(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment luma_weight_l1_flag_ptr() {return this.ptr.asSlice(OFFSET$luma_weight_l1_flag, LAYOUT$luma_weight_l1_flag);}

    public int chroma_weight_l1_flag() {return this.ptr.get(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag);}
    public void chroma_weight_l1_flag(int value) {this.ptr.set(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment chroma_weight_l1_flag_ptr() {return this.ptr.asSlice(OFFSET$chroma_weight_l1_flag, LAYOUT$chroma_weight_l1_flag);}
}
