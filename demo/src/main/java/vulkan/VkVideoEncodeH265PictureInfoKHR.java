package vulkan;

public record VkVideoEncodeH265PictureInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__naluSliceSegmentEntryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__naluSliceSegmentEntryCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNaluSliceSegmentEntries = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNaluSliceSegmentEntries = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdPictureInfo = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStdPictureInfo = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__naluSliceSegmentEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNaluSliceSegmentEntries,
            LAYOUT__pStdPictureInfo
    ).withByteAlignment(8).withName("VkVideoEncodeH265PictureInfoKHR");

    public VkVideoEncodeH265PictureInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH265PictureInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH265PictureInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH265PictureInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int naluSliceSegmentEntryCount() {return this.ptr.get(LAYOUT__naluSliceSegmentEntryCount, OFFSET__naluSliceSegmentEntryCount);}
    public void naluSliceSegmentEntryCount(int value) {this.ptr.set(LAYOUT__naluSliceSegmentEntryCount, OFFSET__naluSliceSegmentEntryCount, value);}
    public java.lang.foreign.MemorySegment $naluSliceSegmentEntryCount() {return this.ptr.asSlice(OFFSET__naluSliceSegmentEntryCount, LAYOUT__naluSliceSegmentEntryCount);}

    public java.lang.foreign.MemorySegment pNaluSliceSegmentEntries() {return this.ptr.get(LAYOUT__pNaluSliceSegmentEntries, OFFSET__pNaluSliceSegmentEntries);}
    public void pNaluSliceSegmentEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNaluSliceSegmentEntries, OFFSET__pNaluSliceSegmentEntries, value);}
    public java.lang.foreign.MemorySegment $pNaluSliceSegmentEntries() {return this.ptr.asSlice(OFFSET__pNaluSliceSegmentEntries, LAYOUT__pNaluSliceSegmentEntries);}

    public java.lang.foreign.MemorySegment pStdPictureInfo() {return this.ptr.get(LAYOUT__pStdPictureInfo, OFFSET__pStdPictureInfo);}
    public void pStdPictureInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStdPictureInfo, OFFSET__pStdPictureInfo, value);}
    public java.lang.foreign.MemorySegment $pStdPictureInfo() {return this.ptr.asSlice(OFFSET__pStdPictureInfo, LAYOUT__pStdPictureInfo);}
}
