package vulkan;

public record VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingMaintenance1 = java.lang.foreign.ValueLayout.JAVA_INT.withName("rayTracingMaintenance1");
    public static final long OFFSET__rayTracingMaintenance1 = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingPipelineTraceRaysIndirect2 = java.lang.foreign.ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2");
    public static final long OFFSET__rayTracingPipelineTraceRaysIndirect2 = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__rayTracingMaintenance1,
            LAYOUT__rayTracingPipelineTraceRaysIndirect2
    ).withByteAlignment(8).withName("VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR");

    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int rayTracingMaintenance1() {return this.ptr.get(LAYOUT__rayTracingMaintenance1, OFFSET__rayTracingMaintenance1);}
    public void rayTracingMaintenance1(int value) {this.ptr.set(LAYOUT__rayTracingMaintenance1, OFFSET__rayTracingMaintenance1, value);}
    public java.lang.foreign.MemorySegment $rayTracingMaintenance1() {return this.ptr.asSlice(OFFSET__rayTracingMaintenance1, LAYOUT__rayTracingMaintenance1);}

    public int rayTracingPipelineTraceRaysIndirect2() {return this.ptr.get(LAYOUT__rayTracingPipelineTraceRaysIndirect2, OFFSET__rayTracingPipelineTraceRaysIndirect2);}
    public void rayTracingPipelineTraceRaysIndirect2(int value) {this.ptr.set(LAYOUT__rayTracingPipelineTraceRaysIndirect2, OFFSET__rayTracingPipelineTraceRaysIndirect2, value);}
    public java.lang.foreign.MemorySegment $rayTracingPipelineTraceRaysIndirect2() {return this.ptr.asSlice(OFFSET__rayTracingPipelineTraceRaysIndirect2, LAYOUT__rayTracingPipelineTraceRaysIndirect2);}
}
