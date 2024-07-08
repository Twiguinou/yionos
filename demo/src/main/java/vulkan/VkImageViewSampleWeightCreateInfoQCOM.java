package vulkan;

public record VkImageViewSampleWeightCreateInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__filterCenter = vulkan.VkOffset2D.gRecordLayout.withName("filterCenter");
    public static final long OFFSET__filterCenter = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__filterSize = vulkan.VkExtent2D.gRecordLayout.withName("filterSize");
    public static final long OFFSET__filterSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numPhases = java.lang.foreign.ValueLayout.JAVA_INT.withName("numPhases");
    public static final long OFFSET__numPhases = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__filterCenter,
            LAYOUT__filterSize,
            LAYOUT__numPhases,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkImageViewSampleWeightCreateInfoQCOM");

    public VkImageViewSampleWeightCreateInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageViewSampleWeightCreateInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageViewSampleWeightCreateInfoQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageViewSampleWeightCreateInfoQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkOffset2D filterCenter() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__filterCenter, LAYOUT__filterCenter));}
    public void filterCenter(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.filterCenter());}
    public void filterCenter(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__filterCenter, LAYOUT__filterCenter.byteSize());}

    public vulkan.VkExtent2D filterSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__filterSize, LAYOUT__filterSize));}
    public void filterSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.filterSize());}
    public void filterSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__filterSize, LAYOUT__filterSize.byteSize());}

    public int numPhases() {return this.ptr.get(LAYOUT__numPhases, OFFSET__numPhases);}
    public void numPhases(int value) {this.ptr.set(LAYOUT__numPhases, OFFSET__numPhases, value);}
    public java.lang.foreign.MemorySegment $numPhases() {return this.ptr.asSlice(OFFSET__numPhases, LAYOUT__numPhases);}
}
