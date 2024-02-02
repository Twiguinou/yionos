package vulkan;

public record VkBindDescriptorSetsInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageFlags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstSet = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$firstSet = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorSetCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorSetCount = 36L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDescriptorSets = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDescriptorSets = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dynamicOffsetCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dynamicOffsetCount = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDynamicOffsets = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDynamicOffsets = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$layout,
            LAYOUT$firstSet,
            LAYOUT$descriptorSetCount,
            LAYOUT$pDescriptorSets,
            LAYOUT$dynamicOffsetCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDynamicOffsets
    ).withName("VkBindDescriptorSetsInfoKHR");

    public VkBindDescriptorSetsInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkBindDescriptorSetsInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkBindDescriptorSetsInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int stageFlags() {return this.ptr.get(LAYOUT$stageFlags, OFFSET$stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);}
    public java.lang.foreign.MemorySegment stageFlags_ptr() {return this.ptr.asSlice(OFFSET$stageFlags, LAYOUT$stageFlags);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public int firstSet() {return this.ptr.get(LAYOUT$firstSet, OFFSET$firstSet);}
    public void firstSet(int value) {this.ptr.set(LAYOUT$firstSet, OFFSET$firstSet, value);}
    public java.lang.foreign.MemorySegment firstSet_ptr() {return this.ptr.asSlice(OFFSET$firstSet, LAYOUT$firstSet);}

    public int descriptorSetCount() {return this.ptr.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);}
    public void descriptorSetCount(int value) {this.ptr.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);}
    public java.lang.foreign.MemorySegment descriptorSetCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorSetCount, LAYOUT$descriptorSetCount);}

    public java.lang.foreign.MemorySegment pDescriptorSets() {return this.ptr.get(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets);}
    public void pDescriptorSets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDescriptorSets, OFFSET$pDescriptorSets, value);}
    public java.lang.foreign.MemorySegment pDescriptorSets_ptr() {return this.ptr.asSlice(OFFSET$pDescriptorSets, LAYOUT$pDescriptorSets);}

    public int dynamicOffsetCount() {return this.ptr.get(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount);}
    public void dynamicOffsetCount(int value) {this.ptr.set(LAYOUT$dynamicOffsetCount, OFFSET$dynamicOffsetCount, value);}
    public java.lang.foreign.MemorySegment dynamicOffsetCount_ptr() {return this.ptr.asSlice(OFFSET$dynamicOffsetCount, LAYOUT$dynamicOffsetCount);}

    public java.lang.foreign.MemorySegment pDynamicOffsets() {return this.ptr.get(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets);}
    public void pDynamicOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDynamicOffsets, OFFSET$pDynamicOffsets, value);}
    public java.lang.foreign.MemorySegment pDynamicOffsets_ptr() {return this.ptr.asSlice(OFFSET$pDynamicOffsets, LAYOUT$pDynamicOffsets);}
}
