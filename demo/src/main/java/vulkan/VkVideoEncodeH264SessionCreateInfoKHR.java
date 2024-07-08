package vulkan;

public record VkVideoEncodeH264SessionCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__useMaxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT.withName("useMaxLevelIdc");
    public static final long OFFSET__useMaxLevelIdc = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxLevelIdc");
    public static final long OFFSET__maxLevelIdc = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__useMaxLevelIdc,
            LAYOUT__maxLevelIdc
    ).withByteAlignment(8).withName("VkVideoEncodeH264SessionCreateInfoKHR");

    public VkVideoEncodeH264SessionCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264SessionCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264SessionCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264SessionCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int useMaxLevelIdc() {return this.ptr.get(LAYOUT__useMaxLevelIdc, OFFSET__useMaxLevelIdc);}
    public void useMaxLevelIdc(int value) {this.ptr.set(LAYOUT__useMaxLevelIdc, OFFSET__useMaxLevelIdc, value);}
    public java.lang.foreign.MemorySegment $useMaxLevelIdc() {return this.ptr.asSlice(OFFSET__useMaxLevelIdc, LAYOUT__useMaxLevelIdc);}

    public int maxLevelIdc() {return this.ptr.get(LAYOUT__maxLevelIdc, OFFSET__maxLevelIdc);}
    public void maxLevelIdc(int value) {this.ptr.set(LAYOUT__maxLevelIdc, OFFSET__maxLevelIdc, value);}
    public java.lang.foreign.MemorySegment $maxLevelIdc() {return this.ptr.asSlice(OFFSET__maxLevelIdc, LAYOUT__maxLevelIdc);}
}
