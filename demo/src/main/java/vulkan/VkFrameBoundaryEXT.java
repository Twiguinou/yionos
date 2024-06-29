package vulkan;

public record VkFrameBoundaryEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__frameID = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__frameID = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImages = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pImages = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBuffers = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pBuffers = 56;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__tagName = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__tagName = 64;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__tagSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__tagSize = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTag = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pTag = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__frameID,
            LAYOUT__imageCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pImages,
            LAYOUT__bufferCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pBuffers,
            LAYOUT__tagName,
            LAYOUT__tagSize,
            LAYOUT__pTag
    ).withByteAlignment(8).withName("VkFrameBoundaryEXT");

    public VkFrameBoundaryEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFrameBoundaryEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFrameBoundaryEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFrameBoundaryEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public long frameID() {return this.ptr.get(LAYOUT__frameID, OFFSET__frameID);}
    public void frameID(long value) {this.ptr.set(LAYOUT__frameID, OFFSET__frameID, value);}
    public java.lang.foreign.MemorySegment $frameID() {return this.ptr.asSlice(OFFSET__frameID, LAYOUT__frameID);}

    public int imageCount() {return this.ptr.get(LAYOUT__imageCount, OFFSET__imageCount);}
    public void imageCount(int value) {this.ptr.set(LAYOUT__imageCount, OFFSET__imageCount, value);}
    public java.lang.foreign.MemorySegment $imageCount() {return this.ptr.asSlice(OFFSET__imageCount, LAYOUT__imageCount);}

    public java.lang.foreign.MemorySegment pImages() {return this.ptr.get(LAYOUT__pImages, OFFSET__pImages);}
    public void pImages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImages, OFFSET__pImages, value);}
    public java.lang.foreign.MemorySegment $pImages() {return this.ptr.asSlice(OFFSET__pImages, LAYOUT__pImages);}

    public int bufferCount() {return this.ptr.get(LAYOUT__bufferCount, OFFSET__bufferCount);}
    public void bufferCount(int value) {this.ptr.set(LAYOUT__bufferCount, OFFSET__bufferCount, value);}
    public java.lang.foreign.MemorySegment $bufferCount() {return this.ptr.asSlice(OFFSET__bufferCount, LAYOUT__bufferCount);}

    public java.lang.foreign.MemorySegment pBuffers() {return this.ptr.get(LAYOUT__pBuffers, OFFSET__pBuffers);}
    public void pBuffers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBuffers, OFFSET__pBuffers, value);}
    public java.lang.foreign.MemorySegment $pBuffers() {return this.ptr.asSlice(OFFSET__pBuffers, LAYOUT__pBuffers);}

    public long tagName() {return this.ptr.get(LAYOUT__tagName, OFFSET__tagName);}
    public void tagName(long value) {this.ptr.set(LAYOUT__tagName, OFFSET__tagName, value);}
    public java.lang.foreign.MemorySegment $tagName() {return this.ptr.asSlice(OFFSET__tagName, LAYOUT__tagName);}

    public long tagSize() {return this.ptr.get(LAYOUT__tagSize, OFFSET__tagSize);}
    public void tagSize(long value) {this.ptr.set(LAYOUT__tagSize, OFFSET__tagSize, value);}
    public java.lang.foreign.MemorySegment $tagSize() {return this.ptr.asSlice(OFFSET__tagSize, LAYOUT__tagSize);}

    public java.lang.foreign.MemorySegment pTag() {return this.ptr.get(LAYOUT__pTag, OFFSET__pTag);}
    public void pTag(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTag, OFFSET__pTag, value);}
    public java.lang.foreign.MemorySegment $pTag() {return this.ptr.asSlice(OFFSET__pTag, LAYOUT__pTag);}
}
