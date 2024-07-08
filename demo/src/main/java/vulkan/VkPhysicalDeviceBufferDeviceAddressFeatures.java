package vulkan;

public record VkPhysicalDeviceBufferDeviceAddressFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferDeviceAddress = java.lang.foreign.ValueLayout.JAVA_INT.withName("bufferDeviceAddress");
    public static final long OFFSET__bufferDeviceAddress = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferDeviceAddressCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay");
    public static final long OFFSET__bufferDeviceAddressCaptureReplay = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferDeviceAddressMultiDevice = java.lang.foreign.ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice");
    public static final long OFFSET__bufferDeviceAddressMultiDevice = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__bufferDeviceAddress,
            LAYOUT__bufferDeviceAddressCaptureReplay,
            LAYOUT__bufferDeviceAddressMultiDevice,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceBufferDeviceAddressFeatures");

    public VkPhysicalDeviceBufferDeviceAddressFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceBufferDeviceAddressFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int bufferDeviceAddress() {return this.ptr.get(LAYOUT__bufferDeviceAddress, OFFSET__bufferDeviceAddress);}
    public void bufferDeviceAddress(int value) {this.ptr.set(LAYOUT__bufferDeviceAddress, OFFSET__bufferDeviceAddress, value);}
    public java.lang.foreign.MemorySegment $bufferDeviceAddress() {return this.ptr.asSlice(OFFSET__bufferDeviceAddress, LAYOUT__bufferDeviceAddress);}

    public int bufferDeviceAddressCaptureReplay() {return this.ptr.get(LAYOUT__bufferDeviceAddressCaptureReplay, OFFSET__bufferDeviceAddressCaptureReplay);}
    public void bufferDeviceAddressCaptureReplay(int value) {this.ptr.set(LAYOUT__bufferDeviceAddressCaptureReplay, OFFSET__bufferDeviceAddressCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $bufferDeviceAddressCaptureReplay() {return this.ptr.asSlice(OFFSET__bufferDeviceAddressCaptureReplay, LAYOUT__bufferDeviceAddressCaptureReplay);}

    public int bufferDeviceAddressMultiDevice() {return this.ptr.get(LAYOUT__bufferDeviceAddressMultiDevice, OFFSET__bufferDeviceAddressMultiDevice);}
    public void bufferDeviceAddressMultiDevice(int value) {this.ptr.set(LAYOUT__bufferDeviceAddressMultiDevice, OFFSET__bufferDeviceAddressMultiDevice, value);}
    public java.lang.foreign.MemorySegment $bufferDeviceAddressMultiDevice() {return this.ptr.asSlice(OFFSET__bufferDeviceAddressMultiDevice, LAYOUT__bufferDeviceAddressMultiDevice);}
}
