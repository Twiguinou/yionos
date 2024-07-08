package vulkan;

public record VkVideoEncodeH264PictureInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__naluSliceEntryCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("naluSliceEntryCount");
    public static final long OFFSET__naluSliceEntryCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNaluSliceEntries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNaluSliceEntries");
    public static final long OFFSET__pNaluSliceEntries = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdPictureInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStdPictureInfo");
    public static final long OFFSET__pStdPictureInfo = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__generatePrefixNalu = java.lang.foreign.ValueLayout.JAVA_INT.withName("generatePrefixNalu");
    public static final long OFFSET__generatePrefixNalu = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__naluSliceEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNaluSliceEntries,
            LAYOUT__pStdPictureInfo,
            LAYOUT__generatePrefixNalu,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkVideoEncodeH264PictureInfoKHR");

    public VkVideoEncodeH264PictureInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264PictureInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264PictureInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264PictureInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int naluSliceEntryCount() {return this.ptr.get(LAYOUT__naluSliceEntryCount, OFFSET__naluSliceEntryCount);}
    public void naluSliceEntryCount(int value) {this.ptr.set(LAYOUT__naluSliceEntryCount, OFFSET__naluSliceEntryCount, value);}
    public java.lang.foreign.MemorySegment $naluSliceEntryCount() {return this.ptr.asSlice(OFFSET__naluSliceEntryCount, LAYOUT__naluSliceEntryCount);}

    public java.lang.foreign.MemorySegment pNaluSliceEntries() {return this.ptr.get(LAYOUT__pNaluSliceEntries, OFFSET__pNaluSliceEntries);}
    public void pNaluSliceEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNaluSliceEntries, OFFSET__pNaluSliceEntries, value);}
    public java.lang.foreign.MemorySegment $pNaluSliceEntries() {return this.ptr.asSlice(OFFSET__pNaluSliceEntries, LAYOUT__pNaluSliceEntries);}

    public java.lang.foreign.MemorySegment pStdPictureInfo() {return this.ptr.get(LAYOUT__pStdPictureInfo, OFFSET__pStdPictureInfo);}
    public void pStdPictureInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStdPictureInfo, OFFSET__pStdPictureInfo, value);}
    public java.lang.foreign.MemorySegment $pStdPictureInfo() {return this.ptr.asSlice(OFFSET__pStdPictureInfo, LAYOUT__pStdPictureInfo);}

    public int generatePrefixNalu() {return this.ptr.get(LAYOUT__generatePrefixNalu, OFFSET__generatePrefixNalu);}
    public void generatePrefixNalu(int value) {this.ptr.set(LAYOUT__generatePrefixNalu, OFFSET__generatePrefixNalu, value);}
    public java.lang.foreign.MemorySegment $generatePrefixNalu() {return this.ptr.asSlice(OFFSET__generatePrefixNalu, LAYOUT__generatePrefixNalu);}
}
