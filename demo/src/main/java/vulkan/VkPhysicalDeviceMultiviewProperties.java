package vulkan;

public record VkPhysicalDeviceMultiviewProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxMultiviewViewCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMultiviewInstanceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxMultiviewInstanceIndex = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxMultiviewViewCount,
            LAYOUT__maxMultiviewInstanceIndex
    ).withByteAlignment(8).withName("VkPhysicalDeviceMultiviewProperties");

    public VkPhysicalDeviceMultiviewProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMultiviewProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMultiviewProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMultiviewProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxMultiviewViewCount() {return this.ptr.get(LAYOUT__maxMultiviewViewCount, OFFSET__maxMultiviewViewCount);}
    public void maxMultiviewViewCount(int value) {this.ptr.set(LAYOUT__maxMultiviewViewCount, OFFSET__maxMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment $maxMultiviewViewCount() {return this.ptr.asSlice(OFFSET__maxMultiviewViewCount, LAYOUT__maxMultiviewViewCount);}

    public int maxMultiviewInstanceIndex() {return this.ptr.get(LAYOUT__maxMultiviewInstanceIndex, OFFSET__maxMultiviewInstanceIndex);}
    public void maxMultiviewInstanceIndex(int value) {this.ptr.set(LAYOUT__maxMultiviewInstanceIndex, OFFSET__maxMultiviewInstanceIndex, value);}
    public java.lang.foreign.MemorySegment $maxMultiviewInstanceIndex() {return this.ptr.asSlice(OFFSET__maxMultiviewInstanceIndex, LAYOUT__maxMultiviewInstanceIndex);}
}
