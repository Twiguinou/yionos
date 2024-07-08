package vulkan;

public record VkCopyImageToMemoryInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__srcImage = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("srcImage");
    public static final long OFFSET__srcImage = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcImageLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("srcImageLayout");
    public static final long OFFSET__srcImageLayout = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__regionCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("regionCount");
    public static final long OFFSET__regionCount = 36;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRegions = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pRegions");
    public static final long OFFSET__pRegions = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__srcImage,
            LAYOUT__srcImageLayout,
            LAYOUT__regionCount,
            LAYOUT__pRegions
    ).withByteAlignment(8).withName("VkCopyImageToMemoryInfoEXT");

    public VkCopyImageToMemoryInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCopyImageToMemoryInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCopyImageToMemoryInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCopyImageToMemoryInfoEXT value)
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

    public java.lang.foreign.MemorySegment srcImage() {return this.ptr.get(LAYOUT__srcImage, OFFSET__srcImage);}
    public void srcImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__srcImage, OFFSET__srcImage, value);}
    public java.lang.foreign.MemorySegment $srcImage() {return this.ptr.asSlice(OFFSET__srcImage, LAYOUT__srcImage);}

    public int srcImageLayout() {return this.ptr.get(LAYOUT__srcImageLayout, OFFSET__srcImageLayout);}
    public void srcImageLayout(int value) {this.ptr.set(LAYOUT__srcImageLayout, OFFSET__srcImageLayout, value);}
    public java.lang.foreign.MemorySegment $srcImageLayout() {return this.ptr.asSlice(OFFSET__srcImageLayout, LAYOUT__srcImageLayout);}

    public int regionCount() {return this.ptr.get(LAYOUT__regionCount, OFFSET__regionCount);}
    public void regionCount(int value) {this.ptr.set(LAYOUT__regionCount, OFFSET__regionCount, value);}
    public java.lang.foreign.MemorySegment $regionCount() {return this.ptr.asSlice(OFFSET__regionCount, LAYOUT__regionCount);}

    public java.lang.foreign.MemorySegment pRegions() {return this.ptr.get(LAYOUT__pRegions, OFFSET__pRegions);}
    public void pRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRegions, OFFSET__pRegions, value);}
    public java.lang.foreign.MemorySegment $pRegions() {return this.ptr.asSlice(OFFSET__pRegions, LAYOUT__pRegions);}
}
