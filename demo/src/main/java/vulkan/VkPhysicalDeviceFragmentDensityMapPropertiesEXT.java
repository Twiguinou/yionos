package vulkan;

public record VkPhysicalDeviceFragmentDensityMapPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__minFragmentDensityTexelSize = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__minFragmentDensityTexelSize = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__maxFragmentDensityTexelSize = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxFragmentDensityTexelSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentDensityInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__fragmentDensityInvocations = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__minFragmentDensityTexelSize,
            LAYOUT__maxFragmentDensityTexelSize,
            LAYOUT__fragmentDensityInvocations,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentDensityMapPropertiesEXT");

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentDensityMapPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkExtent2D minFragmentDensityTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__minFragmentDensityTexelSize, LAYOUT__minFragmentDensityTexelSize));}
    public void minFragmentDensityTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.minFragmentDensityTexelSize());}
    public void minFragmentDensityTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minFragmentDensityTexelSize, LAYOUT__minFragmentDensityTexelSize.byteSize());}

    public vulkan.VkExtent2D maxFragmentDensityTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxFragmentDensityTexelSize, LAYOUT__maxFragmentDensityTexelSize));}
    public void maxFragmentDensityTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxFragmentDensityTexelSize());}
    public void maxFragmentDensityTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxFragmentDensityTexelSize, LAYOUT__maxFragmentDensityTexelSize.byteSize());}

    public int fragmentDensityInvocations() {return this.ptr.get(LAYOUT__fragmentDensityInvocations, OFFSET__fragmentDensityInvocations);}
    public void fragmentDensityInvocations(int value) {this.ptr.set(LAYOUT__fragmentDensityInvocations, OFFSET__fragmentDensityInvocations, value);}
    public java.lang.foreign.MemorySegment $fragmentDensityInvocations() {return this.ptr.asSlice(OFFSET__fragmentDensityInvocations, LAYOUT__fragmentDensityInvocations);}
}
