package vulkan;

public record VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__fragmentDensityOffsetGranularity = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__fragmentDensityOffsetGranularity = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__fragmentDensityOffsetGranularity
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM");

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkExtent2D fragmentDensityOffsetGranularity() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__fragmentDensityOffsetGranularity, LAYOUT__fragmentDensityOffsetGranularity));}
    public void fragmentDensityOffsetGranularity(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.fragmentDensityOffsetGranularity());}
    public void fragmentDensityOffsetGranularity(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__fragmentDensityOffsetGranularity, LAYOUT__fragmentDensityOffsetGranularity.byteSize());}
}
