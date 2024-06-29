package vulkan;

public record VkDeviceOrHostAddressConstKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__deviceAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final java.lang.foreign.AddressLayout LAYOUT__hostAddress = jpgen.NativeTypes.UNBOUNDED_POINTER;

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

    public long deviceAddress() {return this.ptr.get(LAYOUT__deviceAddress, 0);}
    public void deviceAddress(long value) {this.ptr.set(LAYOUT__deviceAddress, 0, value);}
    public java.lang.foreign.MemorySegment $deviceAddress() {return this.ptr.asSlice(0, LAYOUT__deviceAddress);}

    public java.lang.foreign.MemorySegment hostAddress() {return this.ptr.get(LAYOUT__hostAddress, 0);}
    public void hostAddress(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__hostAddress, 0, value);}
    public java.lang.foreign.MemorySegment $hostAddress() {return this.ptr.asSlice(0, LAYOUT__hostAddress);}
}
