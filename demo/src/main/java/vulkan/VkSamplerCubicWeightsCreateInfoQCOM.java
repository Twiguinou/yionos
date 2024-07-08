package vulkan;

public record VkSamplerCubicWeightsCreateInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cubicWeights = java.lang.foreign.ValueLayout.JAVA_INT.withName("cubicWeights");
    public static final long OFFSET__cubicWeights = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__cubicWeights,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSamplerCubicWeightsCreateInfoQCOM");

    public VkSamplerCubicWeightsCreateInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSamplerCubicWeightsCreateInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSamplerCubicWeightsCreateInfoQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSamplerCubicWeightsCreateInfoQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int cubicWeights() {return this.ptr.get(LAYOUT__cubicWeights, OFFSET__cubicWeights);}
    public void cubicWeights(int value) {this.ptr.set(LAYOUT__cubicWeights, OFFSET__cubicWeights, value);}
    public java.lang.foreign.MemorySegment $cubicWeights() {return this.ptr.asSlice(OFFSET__cubicWeights, LAYOUT__cubicWeights);}
}
