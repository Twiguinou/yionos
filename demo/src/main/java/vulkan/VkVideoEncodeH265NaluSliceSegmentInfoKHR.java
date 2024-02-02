package vulkan;

public record VkVideoEncodeH265NaluSliceSegmentInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$constantQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$constantQp = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStdSliceSegmentHeader = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStdSliceSegmentHeader = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$constantQp,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pStdSliceSegmentHeader
    ).withName("VkVideoEncodeH265NaluSliceSegmentInfoKHR");

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int constantQp() {return this.ptr.get(LAYOUT$constantQp, OFFSET$constantQp);}
    public void constantQp(int value) {this.ptr.set(LAYOUT$constantQp, OFFSET$constantQp, value);}
    public java.lang.foreign.MemorySegment constantQp_ptr() {return this.ptr.asSlice(OFFSET$constantQp, LAYOUT$constantQp);}

    public java.lang.foreign.MemorySegment pStdSliceSegmentHeader() {return this.ptr.get(LAYOUT$pStdSliceSegmentHeader, OFFSET$pStdSliceSegmentHeader);}
    public void pStdSliceSegmentHeader(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdSliceSegmentHeader, OFFSET$pStdSliceSegmentHeader, value);}
    public java.lang.foreign.MemorySegment pStdSliceSegmentHeader_ptr() {return this.ptr.asSlice(OFFSET$pStdSliceSegmentHeader, LAYOUT$pStdSliceSegmentHeader);}
}
