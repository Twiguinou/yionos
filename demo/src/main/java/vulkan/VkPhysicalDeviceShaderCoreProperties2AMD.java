package vulkan;

public record VkPhysicalDeviceShaderCoreProperties2AMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderCoreFeatures = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderCoreFeatures");
    public static final long OFFSET__shaderCoreFeatures = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__activeComputeUnitCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("activeComputeUnitCount");
    public static final long OFFSET__activeComputeUnitCount = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderCoreFeatures,
            LAYOUT__activeComputeUnitCount
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderCoreProperties2AMD");

    public VkPhysicalDeviceShaderCoreProperties2AMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderCoreProperties2AMD(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderCoreProperties2AMD value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderCoreFeatures() {return this.ptr.get(LAYOUT__shaderCoreFeatures, OFFSET__shaderCoreFeatures);}
    public void shaderCoreFeatures(int value) {this.ptr.set(LAYOUT__shaderCoreFeatures, OFFSET__shaderCoreFeatures, value);}
    public java.lang.foreign.MemorySegment $shaderCoreFeatures() {return this.ptr.asSlice(OFFSET__shaderCoreFeatures, LAYOUT__shaderCoreFeatures);}

    public int activeComputeUnitCount() {return this.ptr.get(LAYOUT__activeComputeUnitCount, OFFSET__activeComputeUnitCount);}
    public void activeComputeUnitCount(int value) {this.ptr.set(LAYOUT__activeComputeUnitCount, OFFSET__activeComputeUnitCount, value);}
    public java.lang.foreign.MemorySegment $activeComputeUnitCount() {return this.ptr.asSlice(OFFSET__activeComputeUnitCount, LAYOUT__activeComputeUnitCount);}
}
