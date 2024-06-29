package vulkan;

public record VkDeviceFaultAddressInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__addressType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__addressType = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__reportedAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__reportedAddress = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__addressPrecision = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__addressPrecision = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__addressType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__reportedAddress,
            LAYOUT__addressPrecision
    ).withByteAlignment(8).withName("VkDeviceFaultAddressInfoEXT");

    public VkDeviceFaultAddressInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceFaultAddressInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceFaultAddressInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceFaultAddressInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int addressType() {return this.ptr.get(LAYOUT__addressType, OFFSET__addressType);}
    public void addressType(int value) {this.ptr.set(LAYOUT__addressType, OFFSET__addressType, value);}
    public java.lang.foreign.MemorySegment $addressType() {return this.ptr.asSlice(OFFSET__addressType, LAYOUT__addressType);}

    public long reportedAddress() {return this.ptr.get(LAYOUT__reportedAddress, OFFSET__reportedAddress);}
    public void reportedAddress(long value) {this.ptr.set(LAYOUT__reportedAddress, OFFSET__reportedAddress, value);}
    public java.lang.foreign.MemorySegment $reportedAddress() {return this.ptr.asSlice(OFFSET__reportedAddress, LAYOUT__reportedAddress);}

    public long addressPrecision() {return this.ptr.get(LAYOUT__addressPrecision, OFFSET__addressPrecision);}
    public void addressPrecision(long value) {this.ptr.set(LAYOUT__addressPrecision, OFFSET__addressPrecision, value);}
    public java.lang.foreign.MemorySegment $addressPrecision() {return this.ptr.asSlice(OFFSET__addressPrecision, LAYOUT__addressPrecision);}
}
