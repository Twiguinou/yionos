package vulkan;

public record VkPhysicalDeviceCooperativeMatrixPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cooperativeMatrixSupportedStages = java.lang.foreign.ValueLayout.JAVA_INT.withName("cooperativeMatrixSupportedStages");
    public static final long OFFSET__cooperativeMatrixSupportedStages = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__cooperativeMatrixSupportedStages,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceCooperativeMatrixPropertiesNV");

    public VkPhysicalDeviceCooperativeMatrixPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceCooperativeMatrixPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceCooperativeMatrixPropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int cooperativeMatrixSupportedStages() {return this.ptr.get(LAYOUT__cooperativeMatrixSupportedStages, OFFSET__cooperativeMatrixSupportedStages);}
    public void cooperativeMatrixSupportedStages(int value) {this.ptr.set(LAYOUT__cooperativeMatrixSupportedStages, OFFSET__cooperativeMatrixSupportedStages, value);}
    public java.lang.foreign.MemorySegment $cooperativeMatrixSupportedStages() {return this.ptr.asSlice(OFFSET__cooperativeMatrixSupportedStages, LAYOUT__cooperativeMatrixSupportedStages);}
}
