package vulkan;

public record VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceGeneratedCompute = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceGeneratedCompute");
    public static final long OFFSET__deviceGeneratedCompute = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceGeneratedComputePipelines = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceGeneratedComputePipelines");
    public static final long OFFSET__deviceGeneratedComputePipelines = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceGeneratedComputeCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT.withName("deviceGeneratedComputeCaptureReplay");
    public static final long OFFSET__deviceGeneratedComputeCaptureReplay = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__deviceGeneratedCompute,
            LAYOUT__deviceGeneratedComputePipelines,
            LAYOUT__deviceGeneratedComputeCaptureReplay,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV");

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int deviceGeneratedCompute() {return this.ptr.get(LAYOUT__deviceGeneratedCompute, OFFSET__deviceGeneratedCompute);}
    public void deviceGeneratedCompute(int value) {this.ptr.set(LAYOUT__deviceGeneratedCompute, OFFSET__deviceGeneratedCompute, value);}
    public java.lang.foreign.MemorySegment $deviceGeneratedCompute() {return this.ptr.asSlice(OFFSET__deviceGeneratedCompute, LAYOUT__deviceGeneratedCompute);}

    public int deviceGeneratedComputePipelines() {return this.ptr.get(LAYOUT__deviceGeneratedComputePipelines, OFFSET__deviceGeneratedComputePipelines);}
    public void deviceGeneratedComputePipelines(int value) {this.ptr.set(LAYOUT__deviceGeneratedComputePipelines, OFFSET__deviceGeneratedComputePipelines, value);}
    public java.lang.foreign.MemorySegment $deviceGeneratedComputePipelines() {return this.ptr.asSlice(OFFSET__deviceGeneratedComputePipelines, LAYOUT__deviceGeneratedComputePipelines);}

    public int deviceGeneratedComputeCaptureReplay() {return this.ptr.get(LAYOUT__deviceGeneratedComputeCaptureReplay, OFFSET__deviceGeneratedComputeCaptureReplay);}
    public void deviceGeneratedComputeCaptureReplay(int value) {this.ptr.set(LAYOUT__deviceGeneratedComputeCaptureReplay, OFFSET__deviceGeneratedComputeCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $deviceGeneratedComputeCaptureReplay() {return this.ptr.asSlice(OFFSET__deviceGeneratedComputeCaptureReplay, LAYOUT__deviceGeneratedComputeCaptureReplay);}
}
