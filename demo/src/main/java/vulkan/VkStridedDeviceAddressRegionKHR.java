package vulkan;

public record VkStridedDeviceAddressRegionKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__deviceAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__deviceAddress = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__stride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__stride = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__size = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__deviceAddress,
            LAYOUT__stride,
            LAYOUT__size
    ).withByteAlignment(8).withName("VkStridedDeviceAddressRegionKHR");

    public VkStridedDeviceAddressRegionKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkStridedDeviceAddressRegionKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkStridedDeviceAddressRegionKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkStridedDeviceAddressRegionKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long deviceAddress() {return this.ptr.get(LAYOUT__deviceAddress, OFFSET__deviceAddress);}
    public void deviceAddress(long value) {this.ptr.set(LAYOUT__deviceAddress, OFFSET__deviceAddress, value);}
    public java.lang.foreign.MemorySegment $deviceAddress() {return this.ptr.asSlice(OFFSET__deviceAddress, LAYOUT__deviceAddress);}

    public long stride() {return this.ptr.get(LAYOUT__stride, OFFSET__stride);}
    public void stride(long value) {this.ptr.set(LAYOUT__stride, OFFSET__stride, value);}
    public java.lang.foreign.MemorySegment $stride() {return this.ptr.asSlice(OFFSET__stride, LAYOUT__stride);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
