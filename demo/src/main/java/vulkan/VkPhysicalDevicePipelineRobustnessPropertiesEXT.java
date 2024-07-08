package vulkan;

public record VkPhysicalDevicePipelineRobustnessPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__defaultRobustnessStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers");
    public static final long OFFSET__defaultRobustnessStorageBuffers = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__defaultRobustnessUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers");
    public static final long OFFSET__defaultRobustnessUniformBuffers = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__defaultRobustnessVertexInputs = java.lang.foreign.ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs");
    public static final long OFFSET__defaultRobustnessVertexInputs = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__defaultRobustnessImages = java.lang.foreign.ValueLayout.JAVA_INT.withName("defaultRobustnessImages");
    public static final long OFFSET__defaultRobustnessImages = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__defaultRobustnessStorageBuffers,
            LAYOUT__defaultRobustnessUniformBuffers,
            LAYOUT__defaultRobustnessVertexInputs,
            LAYOUT__defaultRobustnessImages
    ).withByteAlignment(8).withName("VkPhysicalDevicePipelineRobustnessPropertiesEXT");

    public VkPhysicalDevicePipelineRobustnessPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevicePipelineRobustnessPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int defaultRobustnessStorageBuffers() {return this.ptr.get(LAYOUT__defaultRobustnessStorageBuffers, OFFSET__defaultRobustnessStorageBuffers);}
    public void defaultRobustnessStorageBuffers(int value) {this.ptr.set(LAYOUT__defaultRobustnessStorageBuffers, OFFSET__defaultRobustnessStorageBuffers, value);}
    public java.lang.foreign.MemorySegment $defaultRobustnessStorageBuffers() {return this.ptr.asSlice(OFFSET__defaultRobustnessStorageBuffers, LAYOUT__defaultRobustnessStorageBuffers);}

    public int defaultRobustnessUniformBuffers() {return this.ptr.get(LAYOUT__defaultRobustnessUniformBuffers, OFFSET__defaultRobustnessUniformBuffers);}
    public void defaultRobustnessUniformBuffers(int value) {this.ptr.set(LAYOUT__defaultRobustnessUniformBuffers, OFFSET__defaultRobustnessUniformBuffers, value);}
    public java.lang.foreign.MemorySegment $defaultRobustnessUniformBuffers() {return this.ptr.asSlice(OFFSET__defaultRobustnessUniformBuffers, LAYOUT__defaultRobustnessUniformBuffers);}

    public int defaultRobustnessVertexInputs() {return this.ptr.get(LAYOUT__defaultRobustnessVertexInputs, OFFSET__defaultRobustnessVertexInputs);}
    public void defaultRobustnessVertexInputs(int value) {this.ptr.set(LAYOUT__defaultRobustnessVertexInputs, OFFSET__defaultRobustnessVertexInputs, value);}
    public java.lang.foreign.MemorySegment $defaultRobustnessVertexInputs() {return this.ptr.asSlice(OFFSET__defaultRobustnessVertexInputs, LAYOUT__defaultRobustnessVertexInputs);}

    public int defaultRobustnessImages() {return this.ptr.get(LAYOUT__defaultRobustnessImages, OFFSET__defaultRobustnessImages);}
    public void defaultRobustnessImages(int value) {this.ptr.set(LAYOUT__defaultRobustnessImages, OFFSET__defaultRobustnessImages, value);}
    public java.lang.foreign.MemorySegment $defaultRobustnessImages() {return this.ptr.asSlice(OFFSET__defaultRobustnessImages, LAYOUT__defaultRobustnessImages);}
}
