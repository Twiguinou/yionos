package vulkan;

public record VkDeviceFaultCountsEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__addressInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__addressInfoCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vendorInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vendorInfoCount = 20;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vendorBinarySize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__vendorBinarySize = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__addressInfoCount,
            LAYOUT__vendorInfoCount,
            LAYOUT__vendorBinarySize
    ).withByteAlignment(8).withName("VkDeviceFaultCountsEXT");

    public VkDeviceFaultCountsEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceFaultCountsEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceFaultCountsEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceFaultCountsEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int addressInfoCount() {return this.ptr.get(LAYOUT__addressInfoCount, OFFSET__addressInfoCount);}
    public void addressInfoCount(int value) {this.ptr.set(LAYOUT__addressInfoCount, OFFSET__addressInfoCount, value);}
    public java.lang.foreign.MemorySegment $addressInfoCount() {return this.ptr.asSlice(OFFSET__addressInfoCount, LAYOUT__addressInfoCount);}

    public int vendorInfoCount() {return this.ptr.get(LAYOUT__vendorInfoCount, OFFSET__vendorInfoCount);}
    public void vendorInfoCount(int value) {this.ptr.set(LAYOUT__vendorInfoCount, OFFSET__vendorInfoCount, value);}
    public java.lang.foreign.MemorySegment $vendorInfoCount() {return this.ptr.asSlice(OFFSET__vendorInfoCount, LAYOUT__vendorInfoCount);}

    public long vendorBinarySize() {return this.ptr.get(LAYOUT__vendorBinarySize, OFFSET__vendorBinarySize);}
    public void vendorBinarySize(long value) {this.ptr.set(LAYOUT__vendorBinarySize, OFFSET__vendorBinarySize, value);}
    public java.lang.foreign.MemorySegment $vendorBinarySize() {return this.ptr.asSlice(OFFSET__vendorBinarySize, LAYOUT__vendorBinarySize);}
}
