package vulkan;

public record VkPipelineRobustnessCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storageBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("storageBuffers");
    public static final long OFFSET__storageBuffers = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT.withName("uniformBuffers");
    public static final long OFFSET__uniformBuffers = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexInputs = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexInputs");
    public static final long OFFSET__vertexInputs = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__images = java.lang.foreign.ValueLayout.JAVA_INT.withName("images");
    public static final long OFFSET__images = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__storageBuffers,
            LAYOUT__uniformBuffers,
            LAYOUT__vertexInputs,
            LAYOUT__images
    ).withByteAlignment(8).withName("VkPipelineRobustnessCreateInfoEXT");

    public VkPipelineRobustnessCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineRobustnessCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineRobustnessCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineRobustnessCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int storageBuffers() {return this.ptr.get(LAYOUT__storageBuffers, OFFSET__storageBuffers);}
    public void storageBuffers(int value) {this.ptr.set(LAYOUT__storageBuffers, OFFSET__storageBuffers, value);}
    public java.lang.foreign.MemorySegment $storageBuffers() {return this.ptr.asSlice(OFFSET__storageBuffers, LAYOUT__storageBuffers);}

    public int uniformBuffers() {return this.ptr.get(LAYOUT__uniformBuffers, OFFSET__uniformBuffers);}
    public void uniformBuffers(int value) {this.ptr.set(LAYOUT__uniformBuffers, OFFSET__uniformBuffers, value);}
    public java.lang.foreign.MemorySegment $uniformBuffers() {return this.ptr.asSlice(OFFSET__uniformBuffers, LAYOUT__uniformBuffers);}

    public int vertexInputs() {return this.ptr.get(LAYOUT__vertexInputs, OFFSET__vertexInputs);}
    public void vertexInputs(int value) {this.ptr.set(LAYOUT__vertexInputs, OFFSET__vertexInputs, value);}
    public java.lang.foreign.MemorySegment $vertexInputs() {return this.ptr.asSlice(OFFSET__vertexInputs, LAYOUT__vertexInputs);}

    public int images() {return this.ptr.get(LAYOUT__images, OFFSET__images);}
    public void images(int value) {this.ptr.set(LAYOUT__images, OFFSET__images, value);}
    public java.lang.foreign.MemorySegment $images() {return this.ptr.asSlice(OFFSET__images, LAYOUT__images);}
}
