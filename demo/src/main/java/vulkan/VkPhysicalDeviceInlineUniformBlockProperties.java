package vulkan;

public record VkPhysicalDeviceInlineUniformBlockProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxInlineUniformBlockSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxInlineUniformBlockSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorInlineUniformBlocks = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetInlineUniformBlocks = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxInlineUniformBlockSize,
            LAYOUT__maxPerStageDescriptorInlineUniformBlocks,
            LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks,
            LAYOUT__maxDescriptorSetInlineUniformBlocks,
            LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceInlineUniformBlockProperties");

    public VkPhysicalDeviceInlineUniformBlockProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceInlineUniformBlockProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceInlineUniformBlockProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceInlineUniformBlockProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxInlineUniformBlockSize() {return this.ptr.get(LAYOUT__maxInlineUniformBlockSize, OFFSET__maxInlineUniformBlockSize);}
    public void maxInlineUniformBlockSize(int value) {this.ptr.set(LAYOUT__maxInlineUniformBlockSize, OFFSET__maxInlineUniformBlockSize, value);}
    public java.lang.foreign.MemorySegment $maxInlineUniformBlockSize() {return this.ptr.asSlice(OFFSET__maxInlineUniformBlockSize, LAYOUT__maxInlineUniformBlockSize);}

    public int maxPerStageDescriptorInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxPerStageDescriptorInlineUniformBlocks, OFFSET__maxPerStageDescriptorInlineUniformBlocks);}
    public void maxPerStageDescriptorInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorInlineUniformBlocks, OFFSET__maxPerStageDescriptorInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorInlineUniformBlocks, LAYOUT__maxPerStageDescriptorInlineUniformBlocks);}

    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}
    public void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, LAYOUT__maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}

    public int maxDescriptorSetInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxDescriptorSetInlineUniformBlocks, OFFSET__maxDescriptorSetInlineUniformBlocks);}
    public void maxDescriptorSetInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxDescriptorSetInlineUniformBlocks, OFFSET__maxDescriptorSetInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxDescriptorSetInlineUniformBlocks, LAYOUT__maxDescriptorSetInlineUniformBlocks);}

    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}
    public void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment $maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {return this.ptr.asSlice(OFFSET__maxDescriptorSetUpdateAfterBindInlineUniformBlocks, LAYOUT__maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}
}
