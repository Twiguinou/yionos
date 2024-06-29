package vulkan;

public record VkPhysicalDeviceRayTracingPipelineFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingPipeline = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__rayTracingPipeline = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplay = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplayMixed = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplayMixed = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTracingPipelineTraceRaysIndirect = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__rayTracingPipelineTraceRaysIndirect = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rayTraversalPrimitiveCulling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__rayTraversalPrimitiveCulling = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__rayTracingPipeline,
            LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplay,
            LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplayMixed,
            LAYOUT__rayTracingPipelineTraceRaysIndirect,
            LAYOUT__rayTraversalPrimitiveCulling,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceRayTracingPipelineFeaturesKHR");

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRayTracingPipelineFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int rayTracingPipeline() {return this.ptr.get(LAYOUT__rayTracingPipeline, OFFSET__rayTracingPipeline);}
    public void rayTracingPipeline(int value) {this.ptr.set(LAYOUT__rayTracingPipeline, OFFSET__rayTracingPipeline, value);}
    public java.lang.foreign.MemorySegment $rayTracingPipeline() {return this.ptr.asSlice(OFFSET__rayTracingPipeline, LAYOUT__rayTracingPipeline);}

    public int rayTracingPipelineShaderGroupHandleCaptureReplay() {return this.ptr.get(LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplay);}
    public void rayTracingPipelineShaderGroupHandleCaptureReplay(int value) {this.ptr.set(LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplay, value);}
    public java.lang.foreign.MemorySegment $rayTracingPipelineShaderGroupHandleCaptureReplay() {return this.ptr.asSlice(OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplay, LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplay);}

    public int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {return this.ptr.get(LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplayMixed);}
    public void rayTracingPipelineShaderGroupHandleCaptureReplayMixed(int value) {this.ptr.set(LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplayMixed, value);}
    public java.lang.foreign.MemorySegment $rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {return this.ptr.asSlice(OFFSET__rayTracingPipelineShaderGroupHandleCaptureReplayMixed, LAYOUT__rayTracingPipelineShaderGroupHandleCaptureReplayMixed);}

    public int rayTracingPipelineTraceRaysIndirect() {return this.ptr.get(LAYOUT__rayTracingPipelineTraceRaysIndirect, OFFSET__rayTracingPipelineTraceRaysIndirect);}
    public void rayTracingPipelineTraceRaysIndirect(int value) {this.ptr.set(LAYOUT__rayTracingPipelineTraceRaysIndirect, OFFSET__rayTracingPipelineTraceRaysIndirect, value);}
    public java.lang.foreign.MemorySegment $rayTracingPipelineTraceRaysIndirect() {return this.ptr.asSlice(OFFSET__rayTracingPipelineTraceRaysIndirect, LAYOUT__rayTracingPipelineTraceRaysIndirect);}

    public int rayTraversalPrimitiveCulling() {return this.ptr.get(LAYOUT__rayTraversalPrimitiveCulling, OFFSET__rayTraversalPrimitiveCulling);}
    public void rayTraversalPrimitiveCulling(int value) {this.ptr.set(LAYOUT__rayTraversalPrimitiveCulling, OFFSET__rayTraversalPrimitiveCulling, value);}
    public java.lang.foreign.MemorySegment $rayTraversalPrimitiveCulling() {return this.ptr.asSlice(OFFSET__rayTraversalPrimitiveCulling, LAYOUT__rayTraversalPrimitiveCulling);}
}
