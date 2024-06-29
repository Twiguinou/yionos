package vulkan;

public record VkRenderPassMultiviewCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subpassCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subpassCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewMasks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pViewMasks = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dependencyCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dependencyCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewOffsets = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pViewOffsets = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__correlationMaskCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__correlationMaskCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCorrelationMasks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCorrelationMasks = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__subpassCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pViewMasks,
            LAYOUT__dependencyCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pViewOffsets,
            LAYOUT__correlationMaskCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCorrelationMasks
    ).withByteAlignment(8).withName("VkRenderPassMultiviewCreateInfo");

    public VkRenderPassMultiviewCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassMultiviewCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassMultiviewCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassMultiviewCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int subpassCount() {return this.ptr.get(LAYOUT__subpassCount, OFFSET__subpassCount);}
    public void subpassCount(int value) {this.ptr.set(LAYOUT__subpassCount, OFFSET__subpassCount, value);}
    public java.lang.foreign.MemorySegment $subpassCount() {return this.ptr.asSlice(OFFSET__subpassCount, LAYOUT__subpassCount);}

    public java.lang.foreign.MemorySegment pViewMasks() {return this.ptr.get(LAYOUT__pViewMasks, OFFSET__pViewMasks);}
    public void pViewMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewMasks, OFFSET__pViewMasks, value);}
    public java.lang.foreign.MemorySegment $pViewMasks() {return this.ptr.asSlice(OFFSET__pViewMasks, LAYOUT__pViewMasks);}

    public int dependencyCount() {return this.ptr.get(LAYOUT__dependencyCount, OFFSET__dependencyCount);}
    public void dependencyCount(int value) {this.ptr.set(LAYOUT__dependencyCount, OFFSET__dependencyCount, value);}
    public java.lang.foreign.MemorySegment $dependencyCount() {return this.ptr.asSlice(OFFSET__dependencyCount, LAYOUT__dependencyCount);}

    public java.lang.foreign.MemorySegment pViewOffsets() {return this.ptr.get(LAYOUT__pViewOffsets, OFFSET__pViewOffsets);}
    public void pViewOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewOffsets, OFFSET__pViewOffsets, value);}
    public java.lang.foreign.MemorySegment $pViewOffsets() {return this.ptr.asSlice(OFFSET__pViewOffsets, LAYOUT__pViewOffsets);}

    public int correlationMaskCount() {return this.ptr.get(LAYOUT__correlationMaskCount, OFFSET__correlationMaskCount);}
    public void correlationMaskCount(int value) {this.ptr.set(LAYOUT__correlationMaskCount, OFFSET__correlationMaskCount, value);}
    public java.lang.foreign.MemorySegment $correlationMaskCount() {return this.ptr.asSlice(OFFSET__correlationMaskCount, LAYOUT__correlationMaskCount);}

    public java.lang.foreign.MemorySegment pCorrelationMasks() {return this.ptr.get(LAYOUT__pCorrelationMasks, OFFSET__pCorrelationMasks);}
    public void pCorrelationMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCorrelationMasks, OFFSET__pCorrelationMasks, value);}
    public java.lang.foreign.MemorySegment $pCorrelationMasks() {return this.ptr.asSlice(OFFSET__pCorrelationMasks, LAYOUT__pCorrelationMasks);}
}
