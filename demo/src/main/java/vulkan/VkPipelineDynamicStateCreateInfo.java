package vulkan;

public record VkPipelineDynamicStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dynamicStateCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("dynamicStateCount");
    public static final long OFFSET__dynamicStateCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDynamicStates = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDynamicStates");
    public static final long OFFSET__pDynamicStates = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__dynamicStateCount,
            LAYOUT__pDynamicStates
    ).withByteAlignment(8).withName("VkPipelineDynamicStateCreateInfo");

    public VkPipelineDynamicStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineDynamicStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineDynamicStateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineDynamicStateCreateInfo value)
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

    public int dynamicStateCount() {return this.ptr.get(LAYOUT__dynamicStateCount, OFFSET__dynamicStateCount);}
    public void dynamicStateCount(int value) {this.ptr.set(LAYOUT__dynamicStateCount, OFFSET__dynamicStateCount, value);}
    public java.lang.foreign.MemorySegment $dynamicStateCount() {return this.ptr.asSlice(OFFSET__dynamicStateCount, LAYOUT__dynamicStateCount);}

    public java.lang.foreign.MemorySegment pDynamicStates() {return this.ptr.get(LAYOUT__pDynamicStates, OFFSET__pDynamicStates);}
    public void pDynamicStates(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDynamicStates, OFFSET__pDynamicStates, value);}
    public java.lang.foreign.MemorySegment $pDynamicStates() {return this.ptr.asSlice(OFFSET__pDynamicStates, LAYOUT__pDynamicStates);}
}
