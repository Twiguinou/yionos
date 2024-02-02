package vulkan;

public record VkVideoEncodeH265PictureInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$naluSliceSegmentEntryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$naluSliceSegmentEntryCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNaluSliceSegmentEntries = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNaluSliceSegmentEntries = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStdPictureInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStdPictureInfo = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$naluSliceSegmentEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNaluSliceSegmentEntries,
            LAYOUT$pStdPictureInfo
    ).withName("VkVideoEncodeH265PictureInfoKHR");

    public VkVideoEncodeH265PictureInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH265PictureInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH265PictureInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int naluSliceSegmentEntryCount() {return this.ptr.get(LAYOUT$naluSliceSegmentEntryCount, OFFSET$naluSliceSegmentEntryCount);}
    public void naluSliceSegmentEntryCount(int value) {this.ptr.set(LAYOUT$naluSliceSegmentEntryCount, OFFSET$naluSliceSegmentEntryCount, value);}
    public java.lang.foreign.MemorySegment naluSliceSegmentEntryCount_ptr() {return this.ptr.asSlice(OFFSET$naluSliceSegmentEntryCount, LAYOUT$naluSliceSegmentEntryCount);}

    public java.lang.foreign.MemorySegment pNaluSliceSegmentEntries() {return this.ptr.get(LAYOUT$pNaluSliceSegmentEntries, OFFSET$pNaluSliceSegmentEntries);}
    public void pNaluSliceSegmentEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNaluSliceSegmentEntries, OFFSET$pNaluSliceSegmentEntries, value);}
    public java.lang.foreign.MemorySegment pNaluSliceSegmentEntries_ptr() {return this.ptr.asSlice(OFFSET$pNaluSliceSegmentEntries, LAYOUT$pNaluSliceSegmentEntries);}

    public java.lang.foreign.MemorySegment pStdPictureInfo() {return this.ptr.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);}
    public void pStdPictureInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);}
    public java.lang.foreign.MemorySegment pStdPictureInfo_ptr() {return this.ptr.asSlice(OFFSET$pStdPictureInfo, LAYOUT$pStdPictureInfo);}
}
