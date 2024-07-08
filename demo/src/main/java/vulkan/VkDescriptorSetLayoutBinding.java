package vulkan;

public record VkDescriptorSetLayoutBinding(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__binding = java.lang.foreign.ValueLayout.JAVA_INT.withName("binding");
    public static final long OFFSET__binding = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorType = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorType");
    public static final long OFFSET__descriptorType = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorCount");
    public static final long OFFSET__descriptorCount = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("stageFlags");
    public static final long OFFSET__stageFlags = 12;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImmutableSamplers = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pImmutableSamplers");
    public static final long OFFSET__pImmutableSamplers = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__binding,
            LAYOUT__descriptorType,
            LAYOUT__descriptorCount,
            LAYOUT__stageFlags,
            LAYOUT__pImmutableSamplers
    ).withByteAlignment(8).withName("VkDescriptorSetLayoutBinding");

    public VkDescriptorSetLayoutBinding(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorSetLayoutBinding getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorSetLayoutBinding(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorSetLayoutBinding value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int binding() {return this.ptr.get(LAYOUT__binding, OFFSET__binding);}
    public void binding(int value) {this.ptr.set(LAYOUT__binding, OFFSET__binding, value);}
    public java.lang.foreign.MemorySegment $binding() {return this.ptr.asSlice(OFFSET__binding, LAYOUT__binding);}

    public int descriptorType() {return this.ptr.get(LAYOUT__descriptorType, OFFSET__descriptorType);}
    public void descriptorType(int value) {this.ptr.set(LAYOUT__descriptorType, OFFSET__descriptorType, value);}
    public java.lang.foreign.MemorySegment $descriptorType() {return this.ptr.asSlice(OFFSET__descriptorType, LAYOUT__descriptorType);}

    public int descriptorCount() {return this.ptr.get(LAYOUT__descriptorCount, OFFSET__descriptorCount);}
    public void descriptorCount(int value) {this.ptr.set(LAYOUT__descriptorCount, OFFSET__descriptorCount, value);}
    public java.lang.foreign.MemorySegment $descriptorCount() {return this.ptr.asSlice(OFFSET__descriptorCount, LAYOUT__descriptorCount);}

    public int stageFlags() {return this.ptr.get(LAYOUT__stageFlags, OFFSET__stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT__stageFlags, OFFSET__stageFlags, value);}
    public java.lang.foreign.MemorySegment $stageFlags() {return this.ptr.asSlice(OFFSET__stageFlags, LAYOUT__stageFlags);}

    public java.lang.foreign.MemorySegment pImmutableSamplers() {return this.ptr.get(LAYOUT__pImmutableSamplers, OFFSET__pImmutableSamplers);}
    public void pImmutableSamplers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImmutableSamplers, OFFSET__pImmutableSamplers, value);}
    public java.lang.foreign.MemorySegment $pImmutableSamplers() {return this.ptr.asSlice(OFFSET__pImmutableSamplers, LAYOUT__pImmutableSamplers);}
}
