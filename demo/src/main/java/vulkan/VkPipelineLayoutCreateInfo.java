package vulkan;

public record VkPipelineLayoutCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__setLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__setLayoutCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSetLayouts = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSetLayouts = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pushConstantRangeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pushConstantRangeCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPushConstantRanges = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pPushConstantRanges = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__setLayoutCount,
            LAYOUT__pSetLayouts,
            LAYOUT__pushConstantRangeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPushConstantRanges
    ).withByteAlignment(8).withName("VkPipelineLayoutCreateInfo");

    public VkPipelineLayoutCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineLayoutCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineLayoutCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineLayoutCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int setLayoutCount() {return this.ptr.get(LAYOUT__setLayoutCount, OFFSET__setLayoutCount);}
    public void setLayoutCount(int value) {this.ptr.set(LAYOUT__setLayoutCount, OFFSET__setLayoutCount, value);}
    public java.lang.foreign.MemorySegment $setLayoutCount() {return this.ptr.asSlice(OFFSET__setLayoutCount, LAYOUT__setLayoutCount);}

    public java.lang.foreign.MemorySegment pSetLayouts() {return this.ptr.get(LAYOUT__pSetLayouts, OFFSET__pSetLayouts);}
    public void pSetLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSetLayouts, OFFSET__pSetLayouts, value);}
    public java.lang.foreign.MemorySegment $pSetLayouts() {return this.ptr.asSlice(OFFSET__pSetLayouts, LAYOUT__pSetLayouts);}

    public int pushConstantRangeCount() {return this.ptr.get(LAYOUT__pushConstantRangeCount, OFFSET__pushConstantRangeCount);}
    public void pushConstantRangeCount(int value) {this.ptr.set(LAYOUT__pushConstantRangeCount, OFFSET__pushConstantRangeCount, value);}
    public java.lang.foreign.MemorySegment $pushConstantRangeCount() {return this.ptr.asSlice(OFFSET__pushConstantRangeCount, LAYOUT__pushConstantRangeCount);}

    public java.lang.foreign.MemorySegment pPushConstantRanges() {return this.ptr.get(LAYOUT__pPushConstantRanges, OFFSET__pPushConstantRanges);}
    public void pPushConstantRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPushConstantRanges, OFFSET__pPushConstantRanges, value);}
    public java.lang.foreign.MemorySegment $pPushConstantRanges() {return this.ptr.asSlice(OFFSET__pPushConstantRanges, LAYOUT__pPushConstantRanges);}
}
