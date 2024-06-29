package vulkan;

public record VkPhysicalDeviceRayTracingPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderGroupHandleSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderGroupHandleSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxRecursionDepth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxRecursionDepth = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxShaderGroupStride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxShaderGroupStride = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderGroupBaseAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderGroupBaseAlignment = 28;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxGeometryCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxGeometryCount = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxInstanceCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxInstanceCount = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxTriangleCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxTriangleCount = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetAccelerationStructures = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderGroupHandleSize,
            LAYOUT__maxRecursionDepth,
            LAYOUT__maxShaderGroupStride,
            LAYOUT__shaderGroupBaseAlignment,
            LAYOUT__maxGeometryCount,
            LAYOUT__maxInstanceCount,
            LAYOUT__maxTriangleCount,
            LAYOUT__maxDescriptorSetAccelerationStructures,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceRayTracingPropertiesNV");

    public VkPhysicalDeviceRayTracingPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRayTracingPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRayTracingPropertiesNV value)
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

    public int maxRecursionDepth() {return this.ptr.get(LAYOUT__maxRecursionDepth, OFFSET__maxRecursionDepth);}
    public void maxRecursionDepth(int value) {this.ptr.set(LAYOUT__maxRecursionDepth, OFFSET__maxRecursionDepth, value);}
    public java.lang.foreign.MemorySegment $maxRecursionDepth() {return this.ptr.asSlice(OFFSET__maxRecursionDepth, LAYOUT__maxRecursionDepth);}

    public int maxShaderGroupStride() {return this.ptr.get(LAYOUT__maxShaderGroupStride, OFFSET__maxShaderGroupStride);}
    public void maxShaderGroupStride(int value) {this.ptr.set(LAYOUT__maxShaderGroupStride, OFFSET__maxShaderGroupStride, value);}
    public java.lang.foreign.MemorySegment $maxShaderGroupStride() {return this.ptr.asSlice(OFFSET__maxShaderGroupStride, LAYOUT__maxShaderGroupStride);}

    public int shaderGroupBaseAlignment() {return this.ptr.get(LAYOUT__shaderGroupBaseAlignment, OFFSET__shaderGroupBaseAlignment);}
    public void shaderGroupBaseAlignment(int value) {this.ptr.set(LAYOUT__shaderGroupBaseAlignment, OFFSET__shaderGroupBaseAlignment, value);}
    public java.lang.foreign.MemorySegment $shaderGroupBaseAlignment() {return this.ptr.asSlice(OFFSET__shaderGroupBaseAlignment, LAYOUT__shaderGroupBaseAlignment);}

    public long maxGeometryCount() {return this.ptr.get(LAYOUT__maxGeometryCount, OFFSET__maxGeometryCount);}
    public void maxGeometryCount(long value) {this.ptr.set(LAYOUT__maxGeometryCount, OFFSET__maxGeometryCount, value);}
    public java.lang.foreign.MemorySegment $maxGeometryCount() {return this.ptr.asSlice(OFFSET__maxGeometryCount, LAYOUT__maxGeometryCount);}

    public long maxInstanceCount() {return this.ptr.get(LAYOUT__maxInstanceCount, OFFSET__maxInstanceCount);}
    public void maxInstanceCount(long value) {this.ptr.set(LAYOUT__maxInstanceCount, OFFSET__maxInstanceCount, value);}
    public java.lang.foreign.MemorySegment $maxInstanceCount() {return this.ptr.asSlice(OFFSET__maxInstanceCount, LAYOUT__maxInstanceCount);}

    public long maxTriangleCount() {return this.ptr.get(LAYOUT__maxTriangleCount, OFFSET__maxTriangleCount);}
    public void maxTriangleCount(long value) {this.ptr.set(LAYOUT__maxTriangleCount, OFFSET__maxTriangleCount, value);}
    public java.lang.foreign.MemorySegment $maxTriangleCount() {return this.ptr.asSlice(OFFSET__maxTriangleCount, LAYOUT__maxTriangleCount);}

    public int maxDescriptorSetAccelerationStructures() {return this.ptr.get(LAYOUT__maxDescriptorSetAccelerationStructures, OFFSET__maxDescriptorSetAccelerationStructures);}
    public void maxDescriptorSetAccelerationStructures(int value) {this.ptr.set(LAYOUT__maxDescriptorSetAccelerationStructures, OFFSET__maxDescriptorSetAccelerationStructures, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetAccelerationStructures() {return this.ptr.asSlice(OFFSET__maxDescriptorSetAccelerationStructures, LAYOUT__maxDescriptorSetAccelerationStructures);}
}
