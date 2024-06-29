package vulkan;

public record VkImageViewSlicedCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sliceOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sliceOffset = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sliceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sliceCount = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__sliceOffset,
            LAYOUT__sliceCount
    ).withByteAlignment(8).withName("VkImageViewSlicedCreateInfoEXT");

    public VkImageViewSlicedCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageViewSlicedCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageViewSlicedCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageViewSlicedCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int sliceOffset() {return this.ptr.get(LAYOUT__sliceOffset, OFFSET__sliceOffset);}
    public void sliceOffset(int value) {this.ptr.set(LAYOUT__sliceOffset, OFFSET__sliceOffset, value);}
    public java.lang.foreign.MemorySegment $sliceOffset() {return this.ptr.asSlice(OFFSET__sliceOffset, LAYOUT__sliceOffset);}

    public int sliceCount() {return this.ptr.get(LAYOUT__sliceCount, OFFSET__sliceCount);}
    public void sliceCount(int value) {this.ptr.set(LAYOUT__sliceCount, OFFSET__sliceCount, value);}
    public java.lang.foreign.MemorySegment $sliceCount() {return this.ptr.asSlice(OFFSET__sliceCount, LAYOUT__sliceCount);}
}
