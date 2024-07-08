package vulkan;

public record VkPipelineFragmentShadingRateEnumStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRateType = java.lang.foreign.ValueLayout.JAVA_INT.withName("shadingRateType");
    public static final long OFFSET__shadingRateType = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("shadingRate");
    public static final long OFFSET__shadingRate = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__combinerOps = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT).withName("combinerOps");
    public static final long OFFSET__combinerOps = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shadingRateType,
            LAYOUT__shadingRate,
            LAYOUT__combinerOps
    ).withByteAlignment(8).withName("VkPipelineFragmentShadingRateEnumStateCreateInfoNV");

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineFragmentShadingRateEnumStateCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shadingRateType() {return this.ptr.get(LAYOUT__shadingRateType, OFFSET__shadingRateType);}
    public void shadingRateType(int value) {this.ptr.set(LAYOUT__shadingRateType, OFFSET__shadingRateType, value);}
    public java.lang.foreign.MemorySegment $shadingRateType() {return this.ptr.asSlice(OFFSET__shadingRateType, LAYOUT__shadingRateType);}

    public int shadingRate() {return this.ptr.get(LAYOUT__shadingRate, OFFSET__shadingRate);}
    public void shadingRate(int value) {this.ptr.set(LAYOUT__shadingRate, OFFSET__shadingRate, value);}
    public java.lang.foreign.MemorySegment $shadingRate() {return this.ptr.asSlice(OFFSET__shadingRate, LAYOUT__shadingRate);}

    public java.lang.foreign.MemorySegment combinerOps() {return this.ptr.asSlice(OFFSET__combinerOps, LAYOUT__combinerOps);}
    public int combinerOps(int index) {return this.combinerOps().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void combinerOps(int index, int value) {this.combinerOps().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}
}
