package vulkan;

public record StdVideoEncodeH265ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH265ReferenceInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pic_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pic_type = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$PicOrderCntVal = 8L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$TemporalId = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$TemporalId = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$pic_type,
            LAYOUT$PicOrderCntVal,
            LAYOUT$TemporalId,
            java.lang.foreign.MemoryLayout.paddingLayout(3)
    ).withName("StdVideoEncodeH265ReferenceInfo");

    public StdVideoEncodeH265ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH265ReferenceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH265ReferenceInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH265ReferenceInfoFlags flags() {return new vulkan.StdVideoEncodeH265ReferenceInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH265ReferenceInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH265ReferenceInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public int pic_type() {return this.ptr.get(LAYOUT$pic_type, OFFSET$pic_type);}
    public void pic_type(int value) {this.ptr.set(LAYOUT$pic_type, OFFSET$pic_type, value);}
    public java.lang.foreign.MemorySegment pic_type_ptr() {return this.ptr.asSlice(OFFSET$pic_type, LAYOUT$pic_type);}

    public int PicOrderCntVal() {return this.ptr.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);}
    public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);}
    public java.lang.foreign.MemorySegment PicOrderCntVal_ptr() {return this.ptr.asSlice(OFFSET$PicOrderCntVal, LAYOUT$PicOrderCntVal);}

    public char TemporalId() {return (char)this.ptr.get(LAYOUT$TemporalId, OFFSET$TemporalId);}
    public void TemporalId(char value) {this.ptr.set(LAYOUT$TemporalId, OFFSET$TemporalId, (byte)value);}
    public java.lang.foreign.MemorySegment TemporalId_ptr() {return this.ptr.asSlice(OFFSET$TemporalId, LAYOUT$TemporalId);}
}
