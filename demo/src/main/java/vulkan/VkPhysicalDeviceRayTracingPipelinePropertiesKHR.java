package vulkan;

public record VkPhysicalDeviceRayTracingPipelinePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderGroupHandleSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderGroupHandleSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxRayRecursionDepth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxRayRecursionDepth = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxShaderGroupStride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxShaderGroupStride = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderGroupBaseAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderGroupBaseAlignment = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderGroupHandleCaptureReplaySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderGroupHandleCaptureReplaySize = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxRayDispatchInvocationCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxRayDispatchInvocationCount = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderGroupHandleAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderGroupHandleAlignment = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxRayHitAttributeSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxRayHitAttributeSize = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderGroupHandleSize,
            LAYOUT__maxRayRecursionDepth,
            LAYOUT__maxShaderGroupStride,
            LAYOUT__shaderGroupBaseAlignment,
            LAYOUT__shaderGroupHandleCaptureReplaySize,
            LAYOUT__maxRayDispatchInvocationCount,
            LAYOUT__shaderGroupHandleAlignment,
            LAYOUT__maxRayHitAttributeSize
    ).withByteAlignment(8).withName("VkPhysicalDeviceRayTracingPipelinePropertiesKHR");

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRayTracingPipelinePropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderGroupHandleSize() {return this.ptr.get(LAYOUT__shaderGroupHandleSize, OFFSET__shaderGroupHandleSize);}
    public void shaderGroupHandleSize(int value) {this.ptr.set(LAYOUT__shaderGroupHandleSize, OFFSET__shaderGroupHandleSize, value);}
    public java.lang.foreign.MemorySegment $shaderGroupHandleSize() {return this.ptr.asSlice(OFFSET__shaderGroupHandleSize, LAYOUT__shaderGroupHandleSize);}

    public int maxRayRecursionDepth() {return this.ptr.get(LAYOUT__maxRayRecursionDepth, OFFSET__maxRayRecursionDepth);}
    public void maxRayRecursionDepth(int value) {this.ptr.set(LAYOUT__maxRayRecursionDepth, OFFSET__maxRayRecursionDepth, value);}
    public java.lang.foreign.MemorySegment $maxRayRecursionDepth() {return this.ptr.asSlice(OFFSET__maxRayRecursionDepth, LAYOUT__maxRayRecursionDepth);}

    public int maxShaderGroupStride() {return this.ptr.get(LAYOUT__maxShaderGroupStride, OFFSET__maxShaderGroupStride);}
    public void maxShaderGroupStride(int value) {this.ptr.set(LAYOUT__maxShaderGroupStride, OFFSET__maxShaderGroupStride, value);}
    public java.lang.foreign.MemorySegment $maxShaderGroupStride() {return this.ptr.asSlice(OFFSET__maxShaderGroupStride, LAYOUT__maxShaderGroupStride);}

    public int shaderGroupBaseAlignment() {return this.ptr.get(LAYOUT__shaderGroupBaseAlignment, OFFSET__shaderGroupBaseAlignment);}
    public void shaderGroupBaseAlignment(int value) {this.ptr.set(LAYOUT__shaderGroupBaseAlignment, OFFSET__shaderGroupBaseAlignment, value);}
    public java.lang.foreign.MemorySegment $shaderGroupBaseAlignment() {return this.ptr.asSlice(OFFSET__shaderGroupBaseAlignment, LAYOUT__shaderGroupBaseAlignment);}

    public int shaderGroupHandleCaptureReplaySize() {return this.ptr.get(LAYOUT__shaderGroupHandleCaptureReplaySize, OFFSET__shaderGroupHandleCaptureReplaySize);}
    public void shaderGroupHandleCaptureReplaySize(int value) {this.ptr.set(LAYOUT__shaderGroupHandleCaptureReplaySize, OFFSET__shaderGroupHandleCaptureReplaySize, value);}
    public java.lang.foreign.MemorySegment $shaderGroupHandleCaptureReplaySize() {return this.ptr.asSlice(OFFSET__shaderGroupHandleCaptureReplaySize, LAYOUT__shaderGroupHandleCaptureReplaySize);}

    public int maxRayDispatchInvocationCount() {return this.ptr.get(LAYOUT__maxRayDispatchInvocationCount, OFFSET__maxRayDispatchInvocationCount);}
    public void maxRayDispatchInvocationCount(int value) {this.ptr.set(LAYOUT__maxRayDispatchInvocationCount, OFFSET__maxRayDispatchInvocationCount, value);}
    public java.lang.foreign.MemorySegment $maxRayDispatchInvocationCount() {return this.ptr.asSlice(OFFSET__maxRayDispatchInvocationCount, LAYOUT__maxRayDispatchInvocationCount);}

    public int shaderGroupHandleAlignment() {return this.ptr.get(LAYOUT__shaderGroupHandleAlignment, OFFSET__shaderGroupHandleAlignment);}
    public void shaderGroupHandleAlignment(int value) {this.ptr.set(LAYOUT__shaderGroupHandleAlignment, OFFSET__shaderGroupHandleAlignment, value);}
    public java.lang.foreign.MemorySegment $shaderGroupHandleAlignment() {return this.ptr.asSlice(OFFSET__shaderGroupHandleAlignment, LAYOUT__shaderGroupHandleAlignment);}

    public int maxRayHitAttributeSize() {return this.ptr.get(LAYOUT__maxRayHitAttributeSize, OFFSET__maxRayHitAttributeSize);}
    public void maxRayHitAttributeSize(int value) {this.ptr.set(LAYOUT__maxRayHitAttributeSize, OFFSET__maxRayHitAttributeSize, value);}
    public java.lang.foreign.MemorySegment $maxRayHitAttributeSize() {return this.ptr.asSlice(OFFSET__maxRayHitAttributeSize, LAYOUT__maxRayHitAttributeSize);}
}
