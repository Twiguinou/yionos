package vulkan;

public record VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderFloat16VectorAtomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderFloat16VectorAtomics");
    public static final long OFFSET__shaderFloat16VectorAtomics = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderFloat16VectorAtomics,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV");

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderFloat16VectorAtomics() {return this.ptr.get(LAYOUT__shaderFloat16VectorAtomics, OFFSET__shaderFloat16VectorAtomics);}
    public void shaderFloat16VectorAtomics(int value) {this.ptr.set(LAYOUT__shaderFloat16VectorAtomics, OFFSET__shaderFloat16VectorAtomics, value);}
    public java.lang.foreign.MemorySegment $shaderFloat16VectorAtomics() {return this.ptr.asSlice(OFFSET__shaderFloat16VectorAtomics, LAYOUT__shaderFloat16VectorAtomics);}
}
