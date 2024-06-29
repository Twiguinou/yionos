package vulkan;

public record StdVideoEncodeH264WeightTableFlags(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__luma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__luma_weight_l0_flag = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chroma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__chroma_weight_l0_flag = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__luma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__luma_weight_l1_flag = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chroma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__chroma_weight_l1_flag = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__luma_weight_l0_flag,
            LAYOUT__chroma_weight_l0_flag,
            LAYOUT__luma_weight_l1_flag,
            LAYOUT__chroma_weight_l1_flag
    ).withByteAlignment(4).withName("StdVideoEncodeH264WeightTableFlags");

    public StdVideoEncodeH264WeightTableFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH264WeightTableFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH264WeightTableFlags(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH264WeightTableFlags value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int luma_weight_l0_flag() {return this.ptr.get(LAYOUT__luma_weight_l0_flag, OFFSET__luma_weight_l0_flag);}
    public void luma_weight_l0_flag(int value) {this.ptr.set(LAYOUT__luma_weight_l0_flag, OFFSET__luma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment $luma_weight_l0_flag() {return this.ptr.asSlice(OFFSET__luma_weight_l0_flag, LAYOUT__luma_weight_l0_flag);}

    public int chroma_weight_l0_flag() {return this.ptr.get(LAYOUT__chroma_weight_l0_flag, OFFSET__chroma_weight_l0_flag);}
    public void chroma_weight_l0_flag(int value) {this.ptr.set(LAYOUT__chroma_weight_l0_flag, OFFSET__chroma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment $chroma_weight_l0_flag() {return this.ptr.asSlice(OFFSET__chroma_weight_l0_flag, LAYOUT__chroma_weight_l0_flag);}

    public int luma_weight_l1_flag() {return this.ptr.get(LAYOUT__luma_weight_l1_flag, OFFSET__luma_weight_l1_flag);}
    public void luma_weight_l1_flag(int value) {this.ptr.set(LAYOUT__luma_weight_l1_flag, OFFSET__luma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment $luma_weight_l1_flag() {return this.ptr.asSlice(OFFSET__luma_weight_l1_flag, LAYOUT__luma_weight_l1_flag);}

    public int chroma_weight_l1_flag() {return this.ptr.get(LAYOUT__chroma_weight_l1_flag, OFFSET__chroma_weight_l1_flag);}
    public void chroma_weight_l1_flag(int value) {this.ptr.set(LAYOUT__chroma_weight_l1_flag, OFFSET__chroma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment $chroma_weight_l1_flag() {return this.ptr.asSlice(OFFSET__chroma_weight_l1_flag, LAYOUT__chroma_weight_l1_flag);}
}
