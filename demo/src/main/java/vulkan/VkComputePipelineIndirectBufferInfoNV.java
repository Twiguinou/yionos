package vulkan;

public record VkComputePipelineIndirectBufferInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$deviceAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$deviceAddress = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$pipelineDeviceAddressCaptureReplay = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$pipelineDeviceAddressCaptureReplay = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$deviceAddress,
            LAYOUT$size,
            LAYOUT$pipelineDeviceAddressCaptureReplay
    ).withName("VkComputePipelineIndirectBufferInfoNV");

    public VkComputePipelineIndirectBufferInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkComputePipelineIndirectBufferInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkComputePipelineIndirectBufferInfoNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long deviceAddress() {return this.ptr.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);}
    public void deviceAddress(long value) {this.ptr.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);}
    public java.lang.foreign.MemorySegment deviceAddress_ptr() {return this.ptr.asSlice(OFFSET$deviceAddress, LAYOUT$deviceAddress);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public long pipelineDeviceAddressCaptureReplay() {return this.ptr.get(LAYOUT$pipelineDeviceAddressCaptureReplay, OFFSET$pipelineDeviceAddressCaptureReplay);}
    public void pipelineDeviceAddressCaptureReplay(long value) {this.ptr.set(LAYOUT$pipelineDeviceAddressCaptureReplay, OFFSET$pipelineDeviceAddressCaptureReplay, value);}
    public java.lang.foreign.MemorySegment pipelineDeviceAddressCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$pipelineDeviceAddressCaptureReplay, LAYOUT$pipelineDeviceAddressCaptureReplay);}
}
