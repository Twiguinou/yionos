package vulkan;

public record VkDeviceOrHostAddressConstKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__deviceAddress = java.lang.foreign.ValueLayout.JAVA_LONG.withName("deviceAddress");
    public static final long OFFSET__deviceAddress = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__hostAddress = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("hostAddress");
    public static final long OFFSET__hostAddress = 0;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__deviceAddress,
            LAYOUT__hostAddress
    ).withByteAlignment(8).withName("VkDeviceOrHostAddressConstKHR");

    public VkDeviceOrHostAddressConstKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceOrHostAddressConstKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceOrHostAddressConstKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceOrHostAddressConstKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long deviceAddress() {return this.ptr.get(LAYOUT__deviceAddress, OFFSET__deviceAddress);}
    public void deviceAddress(long value) {this.ptr.set(LAYOUT__deviceAddress, OFFSET__deviceAddress, value);}
    public java.lang.foreign.MemorySegment $deviceAddress() {return this.ptr.asSlice(OFFSET__deviceAddress, LAYOUT__deviceAddress);}

    public java.lang.foreign.MemorySegment hostAddress() {return this.ptr.get(LAYOUT__hostAddress, OFFSET__hostAddress);}
    public void hostAddress(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__hostAddress, OFFSET__hostAddress, value);}
    public java.lang.foreign.MemorySegment $hostAddress() {return this.ptr.asSlice(OFFSET__hostAddress, LAYOUT__hostAddress);}
}
