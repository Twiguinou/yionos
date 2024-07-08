package vulkan;

public record VkVideoDecodeH264ProfileInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stdProfileIdc = java.lang.foreign.ValueLayout.JAVA_INT.withName("stdProfileIdc");
    public static final long OFFSET__stdProfileIdc = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pictureLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("pictureLayout");
    public static final long OFFSET__pictureLayout = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stdProfileIdc,
            LAYOUT__pictureLayout
    ).withByteAlignment(8).withName("VkVideoDecodeH264ProfileInfoKHR");

    public VkVideoDecodeH264ProfileInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoDecodeH264ProfileInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoDecodeH264ProfileInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoDecodeH264ProfileInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stdProfileIdc() {return this.ptr.get(LAYOUT__stdProfileIdc, OFFSET__stdProfileIdc);}
    public void stdProfileIdc(int value) {this.ptr.set(LAYOUT__stdProfileIdc, OFFSET__stdProfileIdc, value);}
    public java.lang.foreign.MemorySegment $stdProfileIdc() {return this.ptr.asSlice(OFFSET__stdProfileIdc, LAYOUT__stdProfileIdc);}

    public int pictureLayout() {return this.ptr.get(LAYOUT__pictureLayout, OFFSET__pictureLayout);}
    public void pictureLayout(int value) {this.ptr.set(LAYOUT__pictureLayout, OFFSET__pictureLayout, value);}
    public java.lang.foreign.MemorySegment $pictureLayout() {return this.ptr.asSlice(OFFSET__pictureLayout, LAYOUT__pictureLayout);}
}
