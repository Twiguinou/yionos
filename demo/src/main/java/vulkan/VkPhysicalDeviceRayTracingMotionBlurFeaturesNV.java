package vulkan;

public record VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingMotionBlur = java.lang.foreign.ValueLayout.JAVA_INT.withName("rayTracingMotionBlur");
    public static final long OFFSET__rayTracingMotionBlur = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingMotionBlurPipelineTraceRaysIndirect = java.lang.foreign.ValueLayout.JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect");
    public static final long OFFSET__rayTracingMotionBlurPipelineTraceRaysIndirect = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__rayTracingMotionBlur,
            LAYOUT__rayTracingMotionBlurPipelineTraceRaysIndirect
    ).withByteAlignment(8).withName("VkPhysicalDeviceRayTracingMotionBlurFeaturesNV");

    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int rayTracingMotionBlur() {return this.ptr.get(LAYOUT__rayTracingMotionBlur, OFFSET__rayTracingMotionBlur);}
    public void rayTracingMotionBlur(int value) {this.ptr.set(LAYOUT__rayTracingMotionBlur, OFFSET__rayTracingMotionBlur, value);}
    public java.lang.foreign.MemorySegment $rayTracingMotionBlur() {return this.ptr.asSlice(OFFSET__rayTracingMotionBlur, LAYOUT__rayTracingMotionBlur);}

    public int rayTracingMotionBlurPipelineTraceRaysIndirect() {return this.ptr.get(LAYOUT__rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET__rayTracingMotionBlurPipelineTraceRaysIndirect);}
    public void rayTracingMotionBlurPipelineTraceRaysIndirect(int value) {this.ptr.set(LAYOUT__rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET__rayTracingMotionBlurPipelineTraceRaysIndirect, value);}
    public java.lang.foreign.MemorySegment $rayTracingMotionBlurPipelineTraceRaysIndirect() {return this.ptr.asSlice(OFFSET__rayTracingMotionBlurPipelineTraceRaysIndirect, LAYOUT__rayTracingMotionBlurPipelineTraceRaysIndirect);}
}
