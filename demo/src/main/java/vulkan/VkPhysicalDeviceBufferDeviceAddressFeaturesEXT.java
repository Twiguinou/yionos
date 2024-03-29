package vulkan;

public record VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferDeviceAddress = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferDeviceAddress = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferDeviceAddressCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferDeviceAddressCaptureReplay = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferDeviceAddressMultiDevice = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferDeviceAddressMultiDevice = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$bufferDeviceAddress,
            LAYOUT$bufferDeviceAddressCaptureReplay,
            LAYOUT$bufferDeviceAddressMultiDevice,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceBufferDeviceAddressFeaturesEXT");

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int bufferDeviceAddress() {return this.ptr.get(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress);}
    public void bufferDeviceAddress(int value) {this.ptr.set(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress, value);}
    public java.lang.foreign.MemorySegment bufferDeviceAddress_ptr() {return this.ptr.asSlice(OFFSET$bufferDeviceAddress, LAYOUT$bufferDeviceAddress);}

    public int bufferDeviceAddressCaptureReplay() {return this.ptr.get(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay);}
    public void bufferDeviceAddressCaptureReplay(int value) {this.ptr.set(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay, value);}
    public java.lang.foreign.MemorySegment bufferDeviceAddressCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$bufferDeviceAddressCaptureReplay, LAYOUT$bufferDeviceAddressCaptureReplay);}

    public int bufferDeviceAddressMultiDevice() {return this.ptr.get(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice);}
    public void bufferDeviceAddressMultiDevice(int value) {this.ptr.set(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice, value);}
    public java.lang.foreign.MemorySegment bufferDeviceAddressMultiDevice_ptr() {return this.ptr.asSlice(OFFSET$bufferDeviceAddressMultiDevice, LAYOUT$bufferDeviceAddressMultiDevice);}
}
