package vulkan;

public record VkVideoDecodeAV1PictureInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdPictureInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pStdPictureInfo");
    public static final long OFFSET__pStdPictureInfo = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__referenceNameSlotIndices = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_INT).withName("referenceNameSlotIndices");
    public static final long OFFSET__referenceNameSlotIndices = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frameHeaderOffset = java.lang.foreign.ValueLayout.JAVA_INT.withName("frameHeaderOffset");
    public static final long OFFSET__frameHeaderOffset = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tileCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("tileCount");
    public static final long OFFSET__tileCount = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTileOffsets = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pTileOffsets");
    public static final long OFFSET__pTileOffsets = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTileSizes = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pTileSizes");
    public static final long OFFSET__pTileSizes = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pStdPictureInfo,
            LAYOUT__referenceNameSlotIndices,
            LAYOUT__frameHeaderOffset,
            LAYOUT__tileCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pTileOffsets,
            LAYOUT__pTileSizes
    ).withByteAlignment(8).withName("VkVideoDecodeAV1PictureInfoKHR");

    public VkVideoDecodeAV1PictureInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoDecodeAV1PictureInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoDecodeAV1PictureInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoDecodeAV1PictureInfoKHR value)
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

    public java.lang.foreign.MemorySegment referenceNameSlotIndices() {return this.ptr.asSlice(OFFSET__referenceNameSlotIndices, LAYOUT__referenceNameSlotIndices);}
    public int referenceNameSlotIndices(int index) {return this.referenceNameSlotIndices().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void referenceNameSlotIndices(int index, int value) {this.referenceNameSlotIndices().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int frameHeaderOffset() {return this.ptr.get(LAYOUT__frameHeaderOffset, OFFSET__frameHeaderOffset);}
    public void frameHeaderOffset(int value) {this.ptr.set(LAYOUT__frameHeaderOffset, OFFSET__frameHeaderOffset, value);}
    public java.lang.foreign.MemorySegment $frameHeaderOffset() {return this.ptr.asSlice(OFFSET__frameHeaderOffset, LAYOUT__frameHeaderOffset);}

    public int tileCount() {return this.ptr.get(LAYOUT__tileCount, OFFSET__tileCount);}
    public void tileCount(int value) {this.ptr.set(LAYOUT__tileCount, OFFSET__tileCount, value);}
    public java.lang.foreign.MemorySegment $tileCount() {return this.ptr.asSlice(OFFSET__tileCount, LAYOUT__tileCount);}

    public java.lang.foreign.MemorySegment pTileOffsets() {return this.ptr.get(LAYOUT__pTileOffsets, OFFSET__pTileOffsets);}
    public void pTileOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTileOffsets, OFFSET__pTileOffsets, value);}
    public java.lang.foreign.MemorySegment $pTileOffsets() {return this.ptr.asSlice(OFFSET__pTileOffsets, LAYOUT__pTileOffsets);}

    public java.lang.foreign.MemorySegment pTileSizes() {return this.ptr.get(LAYOUT__pTileSizes, OFFSET__pTileSizes);}
    public void pTileSizes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTileSizes, OFFSET__pTileSizes, value);}
    public java.lang.foreign.MemorySegment $pTileSizes() {return this.ptr.asSlice(OFFSET__pTileSizes, LAYOUT__pTileSizes);}
}
