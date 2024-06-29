package vulkan;

public record VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleOrderType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sampleOrderType = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__customSampleOrderCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__customSampleOrderCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCustomSampleOrders = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCustomSampleOrders = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__sampleOrderType,
            LAYOUT__customSampleOrderCount,
            LAYOUT__pCustomSampleOrders
    ).withByteAlignment(8).withName("VkPipelineViewportCoarseSampleOrderStateCreateInfoNV");

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineViewportCoarseSampleOrderStateCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int sampleOrderType() {return this.ptr.get(LAYOUT__sampleOrderType, OFFSET__sampleOrderType);}
    public void sampleOrderType(int value) {this.ptr.set(LAYOUT__sampleOrderType, OFFSET__sampleOrderType, value);}
    public java.lang.foreign.MemorySegment $sampleOrderType() {return this.ptr.asSlice(OFFSET__sampleOrderType, LAYOUT__sampleOrderType);}

    public int customSampleOrderCount() {return this.ptr.get(LAYOUT__customSampleOrderCount, OFFSET__customSampleOrderCount);}
    public void customSampleOrderCount(int value) {this.ptr.set(LAYOUT__customSampleOrderCount, OFFSET__customSampleOrderCount, value);}
    public java.lang.foreign.MemorySegment $customSampleOrderCount() {return this.ptr.asSlice(OFFSET__customSampleOrderCount, LAYOUT__customSampleOrderCount);}

    public java.lang.foreign.MemorySegment pCustomSampleOrders() {return this.ptr.get(LAYOUT__pCustomSampleOrders, OFFSET__pCustomSampleOrders);}
    public void pCustomSampleOrders(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCustomSampleOrders, OFFSET__pCustomSampleOrders, value);}
    public java.lang.foreign.MemorySegment $pCustomSampleOrders() {return this.ptr.asSlice(OFFSET__pCustomSampleOrders, LAYOUT__pCustomSampleOrders);}
}
