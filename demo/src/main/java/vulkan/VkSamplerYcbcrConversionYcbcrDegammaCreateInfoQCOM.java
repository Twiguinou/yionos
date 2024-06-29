package vulkan;

public record VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enableYDegamma = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__enableYDegamma = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__enableCbCrDegamma = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__enableCbCrDegamma = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__enableYDegamma,
            LAYOUT__enableCbCrDegamma
    ).withByteAlignment(8).withName("VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM");

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int enableYDegamma() {return this.ptr.get(LAYOUT__enableYDegamma, OFFSET__enableYDegamma);}
    public void enableYDegamma(int value) {this.ptr.set(LAYOUT__enableYDegamma, OFFSET__enableYDegamma, value);}
    public java.lang.foreign.MemorySegment $enableYDegamma() {return this.ptr.asSlice(OFFSET__enableYDegamma, LAYOUT__enableYDegamma);}

    public int enableCbCrDegamma() {return this.ptr.get(LAYOUT__enableCbCrDegamma, OFFSET__enableCbCrDegamma);}
    public void enableCbCrDegamma(int value) {this.ptr.set(LAYOUT__enableCbCrDegamma, OFFSET__enableCbCrDegamma, value);}
    public java.lang.foreign.MemorySegment $enableCbCrDegamma() {return this.ptr.asSlice(OFFSET__enableCbCrDegamma, LAYOUT__enableCbCrDegamma);}
}
