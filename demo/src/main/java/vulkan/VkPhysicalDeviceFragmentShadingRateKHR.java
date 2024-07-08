package vulkan;

public record VkPhysicalDeviceFragmentShadingRateKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampleCounts");
    public static final long OFFSET__sampleCounts = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__fragmentSize = vulkan.VkExtent2D.gRecordLayout.withName("fragmentSize");
    public static final long OFFSET__fragmentSize = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__sampleCounts,
            LAYOUT__fragmentSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentShadingRateKHR");

    public VkPhysicalDeviceFragmentShadingRateKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentShadingRateKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentShadingRateKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentShadingRateKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int sampleCounts() {return this.ptr.get(LAYOUT__sampleCounts, OFFSET__sampleCounts);}
    public void sampleCounts(int value) {this.ptr.set(LAYOUT__sampleCounts, OFFSET__sampleCounts, value);}
    public java.lang.foreign.MemorySegment $sampleCounts() {return this.ptr.asSlice(OFFSET__sampleCounts, LAYOUT__sampleCounts);}

    public vulkan.VkExtent2D fragmentSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__fragmentSize, LAYOUT__fragmentSize));}
    public void fragmentSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.fragmentSize());}
    public void fragmentSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__fragmentSize, LAYOUT__fragmentSize.byteSize());}
}
