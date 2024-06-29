package vulkan;

public record VkCopyImageInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__srcImage = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__srcImage = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcImageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcImageLayout = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstImage = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__dstImage = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstImageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstImageLayout = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__regionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__regionCount = 44;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRegions = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pRegions = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcImage,
            LAYOUT__srcImageLayout,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__dstImage,
            LAYOUT__dstImageLayout,
            LAYOUT__regionCount,
            LAYOUT__pRegions
    ).withByteAlignment(8).withName("VkCopyImageInfo2");

    public VkCopyImageInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCopyImageInfo2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCopyImageInfo2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCopyImageInfo2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment srcImage() {return this.ptr.get(LAYOUT__srcImage, OFFSET__srcImage);}
    public void srcImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__srcImage, OFFSET__srcImage, value);}
    public java.lang.foreign.MemorySegment $srcImage() {return this.ptr.asSlice(OFFSET__srcImage, LAYOUT__srcImage);}

    public int srcImageLayout() {return this.ptr.get(LAYOUT__srcImageLayout, OFFSET__srcImageLayout);}
    public void srcImageLayout(int value) {this.ptr.set(LAYOUT__srcImageLayout, OFFSET__srcImageLayout, value);}
    public java.lang.foreign.MemorySegment $srcImageLayout() {return this.ptr.asSlice(OFFSET__srcImageLayout, LAYOUT__srcImageLayout);}

    public java.lang.foreign.MemorySegment dstImage() {return this.ptr.get(LAYOUT__dstImage, OFFSET__dstImage);}
    public void dstImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__dstImage, OFFSET__dstImage, value);}
    public java.lang.foreign.MemorySegment $dstImage() {return this.ptr.asSlice(OFFSET__dstImage, LAYOUT__dstImage);}

    public int dstImageLayout() {return this.ptr.get(LAYOUT__dstImageLayout, OFFSET__dstImageLayout);}
    public void dstImageLayout(int value) {this.ptr.set(LAYOUT__dstImageLayout, OFFSET__dstImageLayout, value);}
    public java.lang.foreign.MemorySegment $dstImageLayout() {return this.ptr.asSlice(OFFSET__dstImageLayout, LAYOUT__dstImageLayout);}

    public int regionCount() {return this.ptr.get(LAYOUT__regionCount, OFFSET__regionCount);}
    public void regionCount(int value) {this.ptr.set(LAYOUT__regionCount, OFFSET__regionCount, value);}
    public java.lang.foreign.MemorySegment $regionCount() {return this.ptr.asSlice(OFFSET__regionCount, LAYOUT__regionCount);}

    public java.lang.foreign.MemorySegment pRegions() {return this.ptr.get(LAYOUT__pRegions, OFFSET__pRegions);}
    public void pRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRegions, OFFSET__pRegions, value);}
    public java.lang.foreign.MemorySegment $pRegions() {return this.ptr.asSlice(OFFSET__pRegions, LAYOUT__pRegions);}
}
