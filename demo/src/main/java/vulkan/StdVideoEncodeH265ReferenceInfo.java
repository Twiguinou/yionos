package vulkan;

public record StdVideoEncodeH265ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoEncodeH265ReferenceInfoFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pic_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pic_type = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__PicOrderCntVal = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__TemporalId = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__TemporalId = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__pic_type,
            LAYOUT__PicOrderCntVal,
            LAYOUT__TemporalId,
            java.lang.foreign.MemoryLayout.paddingLayout(3)
    ).withByteAlignment(4).withName("StdVideoEncodeH265ReferenceInfo");

    public StdVideoEncodeH265ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoEncodeH265ReferenceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoEncodeH265ReferenceInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoEncodeH265ReferenceInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoEncodeH265ReferenceInfoFlags flags() {return new vulkan.StdVideoEncodeH265ReferenceInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265ReferenceInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265ReferenceInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int pic_type() {return this.ptr.get(LAYOUT__pic_type, OFFSET__pic_type);}
    public void pic_type(int value) {this.ptr.set(LAYOUT__pic_type, OFFSET__pic_type, value);}
    public java.lang.foreign.MemorySegment $pic_type() {return this.ptr.asSlice(OFFSET__pic_type, LAYOUT__pic_type);}

    public int PicOrderCntVal() {return this.ptr.get(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal);}
    public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT__PicOrderCntVal, OFFSET__PicOrderCntVal, value);}
    public java.lang.foreign.MemorySegment $PicOrderCntVal() {return this.ptr.asSlice(OFFSET__PicOrderCntVal, LAYOUT__PicOrderCntVal);}

    public byte TemporalId() {return this.ptr.get(LAYOUT__TemporalId, OFFSET__TemporalId);}
    public void TemporalId(byte value) {this.ptr.set(LAYOUT__TemporalId, OFFSET__TemporalId, value);}
    public java.lang.foreign.MemorySegment $TemporalId() {return this.ptr.asSlice(OFFSET__TemporalId, LAYOUT__TemporalId);}
}
