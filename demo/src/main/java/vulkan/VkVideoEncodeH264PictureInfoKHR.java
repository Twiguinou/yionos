package vulkan;

public record VkVideoEncodeH264PictureInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$naluSliceEntryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$naluSliceEntryCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNaluSliceEntries = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNaluSliceEntries = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStdPictureInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStdPictureInfo = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$generatePrefixNalu = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$generatePrefixNalu = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$naluSliceEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNaluSliceEntries,
            LAYOUT$pStdPictureInfo,
            LAYOUT$generatePrefixNalu,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoEncodeH264PictureInfoKHR");

    public VkVideoEncodeH264PictureInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH264PictureInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH264PictureInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int naluSliceEntryCount() {return this.ptr.get(LAYOUT$naluSliceEntryCount, OFFSET$naluSliceEntryCount);}
    public void naluSliceEntryCount(int value) {this.ptr.set(LAYOUT$naluSliceEntryCount, OFFSET$naluSliceEntryCount, value);}
    public java.lang.foreign.MemorySegment naluSliceEntryCount_ptr() {return this.ptr.asSlice(OFFSET$naluSliceEntryCount, LAYOUT$naluSliceEntryCount);}

    public java.lang.foreign.MemorySegment pNaluSliceEntries() {return this.ptr.get(LAYOUT$pNaluSliceEntries, OFFSET$pNaluSliceEntries);}
    public void pNaluSliceEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNaluSliceEntries, OFFSET$pNaluSliceEntries, value);}
    public java.lang.foreign.MemorySegment pNaluSliceEntries_ptr() {return this.ptr.asSlice(OFFSET$pNaluSliceEntries, LAYOUT$pNaluSliceEntries);}

    public java.lang.foreign.MemorySegment pStdPictureInfo() {return this.ptr.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);}
    public void pStdPictureInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);}
    public java.lang.foreign.MemorySegment pStdPictureInfo_ptr() {return this.ptr.asSlice(OFFSET$pStdPictureInfo, LAYOUT$pStdPictureInfo);}

    public int generatePrefixNalu() {return this.ptr.get(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu);}
    public void generatePrefixNalu(int value) {this.ptr.set(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu, value);}
    public java.lang.foreign.MemorySegment generatePrefixNalu_ptr() {return this.ptr.asSlice(OFFSET$generatePrefixNalu, LAYOUT$generatePrefixNalu);}
}
