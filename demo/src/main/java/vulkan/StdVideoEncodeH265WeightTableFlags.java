package vulkan;

public record StdVideoEncodeH265WeightTableFlags(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__luma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("luma_weight_l0_flag");
    public static final long OFFSET__luma_weight_l0_flag = 0;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__chroma_weight_l0_flag = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("chroma_weight_l0_flag");
    public static final long OFFSET__chroma_weight_l0_flag = 2;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__luma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("luma_weight_l1_flag");
    public static final long OFFSET__luma_weight_l1_flag = 4;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__chroma_weight_l1_flag = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("chroma_weight_l1_flag");
    public static final long OFFSET__chroma_weight_l1_flag = 6;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__luma_weight_l0_flag,
            LAYOUT__chroma_weight_l0_flag,
            LAYOUT__luma_weight_l1_flag,
            LAYOUT__chroma_weight_l1_flag
    ).withByteAlignment(2).withName("StdVideoEncodeH265WeightTableFlags");

    public StdVideoEncodeH265WeightTableFlags(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH265WeightTableFlags getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH265WeightTableFlags(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH265WeightTableFlags value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public short luma_weight_l0_flag() {return this.ptr.get(LAYOUT__luma_weight_l0_flag, OFFSET__luma_weight_l0_flag);}
    public void luma_weight_l0_flag(short value) {this.ptr.set(LAYOUT__luma_weight_l0_flag, OFFSET__luma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment $luma_weight_l0_flag() {return this.ptr.asSlice(OFFSET__luma_weight_l0_flag, LAYOUT__luma_weight_l0_flag);}

    public short chroma_weight_l0_flag() {return this.ptr.get(LAYOUT__chroma_weight_l0_flag, OFFSET__chroma_weight_l0_flag);}
    public void chroma_weight_l0_flag(short value) {this.ptr.set(LAYOUT__chroma_weight_l0_flag, OFFSET__chroma_weight_l0_flag, value);}
    public java.lang.foreign.MemorySegment $chroma_weight_l0_flag() {return this.ptr.asSlice(OFFSET__chroma_weight_l0_flag, LAYOUT__chroma_weight_l0_flag);}

    public short luma_weight_l1_flag() {return this.ptr.get(LAYOUT__luma_weight_l1_flag, OFFSET__luma_weight_l1_flag);}
    public void luma_weight_l1_flag(short value) {this.ptr.set(LAYOUT__luma_weight_l1_flag, OFFSET__luma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment $luma_weight_l1_flag() {return this.ptr.asSlice(OFFSET__luma_weight_l1_flag, LAYOUT__luma_weight_l1_flag);}

    public short chroma_weight_l1_flag() {return this.ptr.get(LAYOUT__chroma_weight_l1_flag, OFFSET__chroma_weight_l1_flag);}
    public void chroma_weight_l1_flag(short value) {this.ptr.set(LAYOUT__chroma_weight_l1_flag, OFFSET__chroma_weight_l1_flag, value);}
    public java.lang.foreign.MemorySegment $chroma_weight_l1_flag() {return this.ptr.asSlice(OFFSET__chroma_weight_l1_flag, LAYOUT__chroma_weight_l1_flag);}
}
