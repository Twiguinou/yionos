package vulkan;

public record VkComputePipelineIndirectBufferInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__deviceAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__deviceAddress = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__size = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__pipelineDeviceAddressCaptureReplay = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__pipelineDeviceAddressCaptureReplay = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__deviceAddress,
            LAYOUT__size,
            LAYOUT__pipelineDeviceAddressCaptureReplay
    ).withByteAlignment(8).withName("VkComputePipelineIndirectBufferInfoNV");

    public VkComputePipelineIndirectBufferInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkComputePipelineIndirectBufferInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkComputePipelineIndirectBufferInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkComputePipelineIndirectBufferInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long deviceAddress() {return this.ptr.get(LAYOUT__deviceAddress, OFFSET__deviceAddress);}
    public void deviceAddress(long value) {this.ptr.set(LAYOUT__deviceAddress, OFFSET__deviceAddress, value);}
    public java.lang.foreign.MemorySegment $deviceAddress() {return this.ptr.asSlice(OFFSET__deviceAddress, LAYOUT__deviceAddress);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public long pipelineDeviceAddressCaptureReplay() {return this.ptr.get(LAYOUT__pipelineDeviceAddressCaptureReplay, OFFSET__pipelineDeviceAddressCaptureReplay);}
    public void pipelineDeviceAddressCaptureReplay(long value) {this.ptr.set(LAYOUT__pipelineDeviceAddressCaptureReplay, OFFSET__pipelineDeviceAddressCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $pipelineDeviceAddressCaptureReplay() {return this.ptr.asSlice(OFFSET__pipelineDeviceAddressCaptureReplay, LAYOUT__pipelineDeviceAddressCaptureReplay);}
}
