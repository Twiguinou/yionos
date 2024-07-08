package vulkan;

public record StdVideoDecodeH265ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoDecodeH265ReferenceInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT.withName("PicOrderCntVal");
    public static final long OFFSET__PicOrderCntVal = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__PicOrderCntVal
    ).withByteAlignment(4).withName("StdVideoDecodeH265ReferenceInfo");

    public StdVideoDecodeH265ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoDecodeH265ReferenceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoDecodeH265ReferenceInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoDecodeH265ReferenceInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoDecodeH265ReferenceInfoFlags flags() {return new vulkan.StdVideoDecodeH265ReferenceInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoDecodeH265ReferenceInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoDecodeH265ReferenceInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int PicOrderCntVal() {return this.ptr.get(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal);}
    public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal, value);}
    public java.lang.foreign.MemorySegment $PicOrderCntVal() {return this.ptr.asSlice(OFFSET__PicOrderCntVal, LAYOUT__PicOrderCntVal);}
}
