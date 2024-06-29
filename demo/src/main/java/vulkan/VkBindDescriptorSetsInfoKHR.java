package vulkan;

public record VkBindDescriptorSetsInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stageFlags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__layout = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstSet = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__firstSet = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorSetCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorSetCount = 36;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDescriptorSets = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDescriptorSets = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dynamicOffsetCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dynamicOffsetCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDynamicOffsets = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDynamicOffsets = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__layout,
            LAYOUT__firstSet,
            LAYOUT__descriptorSetCount,
            LAYOUT__pDescriptorSets,
            LAYOUT__dynamicOffsetCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDynamicOffsets
    ).withByteAlignment(8).withName("VkBindDescriptorSetsInfoKHR");

    public VkBindDescriptorSetsInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindDescriptorSetsInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindDescriptorSetsInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindDescriptorSetsInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stageFlags() {return this.ptr.get(LAYOUT__stageFlags, OFFSET__stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT__stageFlags, OFFSET__stageFlags, value);}
    public java.lang.foreign.MemorySegment $stageFlags() {return this.ptr.asSlice(OFFSET__stageFlags, LAYOUT__stageFlags);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public int firstSet() {return this.ptr.get(LAYOUT__firstSet, OFFSET__firstSet);}
    public void firstSet(int value) {this.ptr.set(LAYOUT__firstSet, OFFSET__firstSet, value);}
    public java.lang.foreign.MemorySegment $firstSet() {return this.ptr.asSlice(OFFSET__firstSet, LAYOUT__firstSet);}

    public int descriptorSetCount() {return this.ptr.get(LAYOUT__descriptorSetCount, OFFSET__descriptorSetCount);}
    public void descriptorSetCount(int value) {this.ptr.set(LAYOUT__descriptorSetCount, OFFSET__descriptorSetCount, value);}
    public java.lang.foreign.MemorySegment $descriptorSetCount() {return this.ptr.asSlice(OFFSET__descriptorSetCount, LAYOUT__descriptorSetCount);}

    public java.lang.foreign.MemorySegment pDescriptorSets() {return this.ptr.get(LAYOUT__pDescriptorSets, OFFSET__pDescriptorSets);}
    public void pDescriptorSets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDescriptorSets, OFFSET__pDescriptorSets, value);}
    public java.lang.foreign.MemorySegment $pDescriptorSets() {return this.ptr.asSlice(OFFSET__pDescriptorSets, LAYOUT__pDescriptorSets);}

    public int dynamicOffsetCount() {return this.ptr.get(LAYOUT__dynamicOffsetCount, OFFSET__dynamicOffsetCount);}
    public void dynamicOffsetCount(int value) {this.ptr.set(LAYOUT__dynamicOffsetCount, OFFSET__dynamicOffsetCount, value);}
    public java.lang.foreign.MemorySegment $dynamicOffsetCount() {return this.ptr.asSlice(OFFSET__dynamicOffsetCount, LAYOUT__dynamicOffsetCount);}

    public java.lang.foreign.MemorySegment pDynamicOffsets() {return this.ptr.get(LAYOUT__pDynamicOffsets, OFFSET__pDynamicOffsets);}
    public void pDynamicOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDynamicOffsets, OFFSET__pDynamicOffsets, value);}
    public java.lang.foreign.MemorySegment $pDynamicOffsets() {return this.ptr.asSlice(OFFSET__pDynamicOffsets, LAYOUT__pDynamicOffsets);}
}
