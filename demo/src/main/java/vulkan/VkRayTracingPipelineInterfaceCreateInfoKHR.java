package vulkan;

public record VkRayTracingPipelineInterfaceCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPipelineRayPayloadSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPipelineRayPayloadSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPipelineRayHitAttributeSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPipelineRayHitAttributeSize = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxPipelineRayPayloadSize,
            LAYOUT__maxPipelineRayHitAttributeSize
    ).withByteAlignment(8).withName("VkRayTracingPipelineInterfaceCreateInfoKHR");

    public VkRayTracingPipelineInterfaceCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRayTracingPipelineInterfaceCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxPipelineRayPayloadSize() {return this.ptr.get(LAYOUT__maxPipelineRayPayloadSize, OFFSET__maxPipelineRayPayloadSize);}
    public void maxPipelineRayPayloadSize(int value) {this.ptr.set(LAYOUT__maxPipelineRayPayloadSize, OFFSET__maxPipelineRayPayloadSize, value);}
    public java.lang.foreign.MemorySegment $maxPipelineRayPayloadSize() {return this.ptr.asSlice(OFFSET__maxPipelineRayPayloadSize, LAYOUT__maxPipelineRayPayloadSize);}

    public int maxPipelineRayHitAttributeSize() {return this.ptr.get(LAYOUT__maxPipelineRayHitAttributeSize, OFFSET__maxPipelineRayHitAttributeSize);}
    public void maxPipelineRayHitAttributeSize(int value) {this.ptr.set(LAYOUT__maxPipelineRayHitAttributeSize, OFFSET__maxPipelineRayHitAttributeSize, value);}
    public java.lang.foreign.MemorySegment $maxPipelineRayHitAttributeSize() {return this.ptr.asSlice(OFFSET__maxPipelineRayHitAttributeSize, LAYOUT__maxPipelineRayHitAttributeSize);}
}
