package vulkan;

public record VkDescriptorSetVariableDescriptorCountAllocateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorSetCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("descriptorSetCount");
    public static final long OFFSET__descriptorSetCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDescriptorCounts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDescriptorCounts");
    public static final long OFFSET__pDescriptorCounts = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__descriptorSetCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDescriptorCounts
    ).withByteAlignment(8).withName("VkDescriptorSetVariableDescriptorCountAllocateInfo");

    public VkDescriptorSetVariableDescriptorCountAllocateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorSetVariableDescriptorCountAllocateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int descriptorSetCount() {return this.ptr.get(LAYOUT__descriptorSetCount, OFFSET__descriptorSetCount);}
    public void descriptorSetCount(int value) {this.ptr.set(LAYOUT__descriptorSetCount, OFFSET__descriptorSetCount, value);}
    public java.lang.foreign.MemorySegment $descriptorSetCount() {return this.ptr.asSlice(OFFSET__descriptorSetCount, LAYOUT__descriptorSetCount);}

    public java.lang.foreign.MemorySegment pDescriptorCounts() {return this.ptr.get(LAYOUT__pDescriptorCounts, OFFSET__pDescriptorCounts);}
    public void pDescriptorCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDescriptorCounts, OFFSET__pDescriptorCounts, value);}
    public java.lang.foreign.MemorySegment $pDescriptorCounts() {return this.ptr.asSlice(OFFSET__pDescriptorCounts, LAYOUT__pDescriptorCounts);}
}
