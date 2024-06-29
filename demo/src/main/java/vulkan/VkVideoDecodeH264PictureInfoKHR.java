package vulkan;

public record VkVideoDecodeH264PictureInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdPictureInfo = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStdPictureInfo = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sliceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sliceCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSliceOffsets = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSliceOffsets = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pStdPictureInfo,
            LAYOUT__sliceCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSliceOffsets
    ).withByteAlignment(8).withName("VkVideoDecodeH264PictureInfoKHR");

    public VkVideoDecodeH264PictureInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoDecodeH264PictureInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoDecodeH264PictureInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoDecodeH264PictureInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pStdPictureInfo() {return this.ptr.get(LAYOUT__pStdPictureInfo, OFFSET__pStdPictureInfo);}
    public void pStdPictureInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStdPictureInfo, OFFSET__pStdPictureInfo, value);}
    public java.lang.foreign.MemorySegment $pStdPictureInfo() {return this.ptr.asSlice(OFFSET__pStdPictureInfo, LAYOUT__pStdPictureInfo);}

    public int sliceCount() {return this.ptr.get(LAYOUT__sliceCount, OFFSET__sliceCount);}
    public void sliceCount(int value) {this.ptr.set(LAYOUT__sliceCount, OFFSET__sliceCount, value);}
    public java.lang.foreign.MemorySegment $sliceCount() {return this.ptr.asSlice(OFFSET__sliceCount, LAYOUT__sliceCount);}

    public java.lang.foreign.MemorySegment pSliceOffsets() {return this.ptr.get(LAYOUT__pSliceOffsets, OFFSET__pSliceOffsets);}
    public void pSliceOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSliceOffsets, OFFSET__pSliceOffsets, value);}
    public java.lang.foreign.MemorySegment $pSliceOffsets() {return this.ptr.asSlice(OFFSET__pSliceOffsets, LAYOUT__pSliceOffsets);}
}
