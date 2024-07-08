package vulkan;

public record VkPipelineViewportWScalingStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewportWScalingEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewportWScalingEnable");
    public static final long OFFSET__viewportWScalingEnable = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewportCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewportCount");
    public static final long OFFSET__viewportCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewportWScalings = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pViewportWScalings");
    public static final long OFFSET__pViewportWScalings = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__viewportWScalingEnable,
            LAYOUT__viewportCount,
            LAYOUT__pViewportWScalings
    ).withByteAlignment(8).withName("VkPipelineViewportWScalingStateCreateInfoNV");

    public VkPipelineViewportWScalingStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineViewportWScalingStateCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineViewportWScalingStateCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int viewportWScalingEnable() {return this.ptr.get(LAYOUT__viewportWScalingEnable, OFFSET__viewportWScalingEnable);}
    public void viewportWScalingEnable(int value) {this.ptr.set(LAYOUT__viewportWScalingEnable, OFFSET__viewportWScalingEnable, value);}
    public java.lang.foreign.MemorySegment $viewportWScalingEnable() {return this.ptr.asSlice(OFFSET__viewportWScalingEnable, LAYOUT__viewportWScalingEnable);}

    public int viewportCount() {return this.ptr.get(LAYOUT__viewportCount, OFFSET__viewportCount);}
    public void viewportCount(int value) {this.ptr.set(LAYOUT__viewportCount, OFFSET__viewportCount, value);}
    public java.lang.foreign.MemorySegment $viewportCount() {return this.ptr.asSlice(OFFSET__viewportCount, LAYOUT__viewportCount);}

    public java.lang.foreign.MemorySegment pViewportWScalings() {return this.ptr.get(LAYOUT__pViewportWScalings, OFFSET__pViewportWScalings);}
    public void pViewportWScalings(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewportWScalings, OFFSET__pViewportWScalings, value);}
    public java.lang.foreign.MemorySegment $pViewportWScalings() {return this.ptr.asSlice(OFFSET__pViewportWScalings, LAYOUT__pViewportWScalings);}
}
