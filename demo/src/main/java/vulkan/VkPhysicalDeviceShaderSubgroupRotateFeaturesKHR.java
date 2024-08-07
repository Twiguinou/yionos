package vulkan;

public record VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSubgroupRotate = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSubgroupRotate");
    public static final long OFFSET__shaderSubgroupRotate = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSubgroupRotateClustered = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered");
    public static final long OFFSET__shaderSubgroupRotateClustered = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderSubgroupRotate,
            LAYOUT__shaderSubgroupRotateClustered
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR");

    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderSubgroupRotate() {return this.ptr.get(LAYOUT__shaderSubgroupRotate, OFFSET__shaderSubgroupRotate);}
    public void shaderSubgroupRotate(int value) {this.ptr.set(LAYOUT__shaderSubgroupRotate, OFFSET__shaderSubgroupRotate, value);}
    public java.lang.foreign.MemorySegment $shaderSubgroupRotate() {return this.ptr.asSlice(OFFSET__shaderSubgroupRotate, LAYOUT__shaderSubgroupRotate);}

    public int shaderSubgroupRotateClustered() {return this.ptr.get(LAYOUT__shaderSubgroupRotateClustered, OFFSET__shaderSubgroupRotateClustered);}
    public void shaderSubgroupRotateClustered(int value) {this.ptr.set(LAYOUT__shaderSubgroupRotateClustered, OFFSET__shaderSubgroupRotateClustered, value);}
    public java.lang.foreign.MemorySegment $shaderSubgroupRotateClustered() {return this.ptr.asSlice(OFFSET__shaderSubgroupRotateClustered, LAYOUT__shaderSubgroupRotateClustered);}
}
