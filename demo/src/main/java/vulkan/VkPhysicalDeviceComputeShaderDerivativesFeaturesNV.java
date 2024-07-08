package vulkan;

public record VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__computeDerivativeGroupQuads = java.lang.foreign.ValueLayout.JAVA_INT.withName("computeDerivativeGroupQuads");
    public static final long OFFSET__computeDerivativeGroupQuads = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__computeDerivativeGroupLinear = java.lang.foreign.ValueLayout.JAVA_INT.withName("computeDerivativeGroupLinear");
    public static final long OFFSET__computeDerivativeGroupLinear = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__computeDerivativeGroupQuads,
            LAYOUT__computeDerivativeGroupLinear
    ).withByteAlignment(8).withName("VkPhysicalDeviceComputeShaderDerivativesFeaturesNV");

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int computeDerivativeGroupQuads() {return this.ptr.get(LAYOUT__computeDerivativeGroupQuads, OFFSET__computeDerivativeGroupQuads);}
    public void computeDerivativeGroupQuads(int value) {this.ptr.set(LAYOUT__computeDerivativeGroupQuads, OFFSET__computeDerivativeGroupQuads, value);}
    public java.lang.foreign.MemorySegment $computeDerivativeGroupQuads() {return this.ptr.asSlice(OFFSET__computeDerivativeGroupQuads, LAYOUT__computeDerivativeGroupQuads);}

    public int computeDerivativeGroupLinear() {return this.ptr.get(LAYOUT__computeDerivativeGroupLinear, OFFSET__computeDerivativeGroupLinear);}
    public void computeDerivativeGroupLinear(int value) {this.ptr.set(LAYOUT__computeDerivativeGroupLinear, OFFSET__computeDerivativeGroupLinear, value);}
    public java.lang.foreign.MemorySegment $computeDerivativeGroupLinear() {return this.ptr.asSlice(OFFSET__computeDerivativeGroupLinear, LAYOUT__computeDerivativeGroupLinear);}
}
