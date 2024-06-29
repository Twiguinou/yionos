package vulkan;

public record VkPhysicalDeviceImageProcessingPropertiesQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxWeightFilterPhases = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxWeightFilterPhases = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__maxWeightFilterDimension = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxWeightFilterDimension = 20;
    public static final java.lang.foreign.StructLayout LAYOUT__maxBlockMatchRegion = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxBlockMatchRegion = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__maxBoxFilterBlockSize = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__maxBoxFilterBlockSize = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxWeightFilterPhases,
            LAYOUT__maxWeightFilterDimension,
            LAYOUT__maxBlockMatchRegion,
            LAYOUT__maxBoxFilterBlockSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceImageProcessingPropertiesQCOM");

    public VkPhysicalDeviceImageProcessingPropertiesQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceImageProcessingPropertiesQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxWeightFilterPhases() {return this.ptr.get(LAYOUT__maxWeightFilterPhases, OFFSET__maxWeightFilterPhases);}
    public void maxWeightFilterPhases(int value) {this.ptr.set(LAYOUT__maxWeightFilterPhases, OFFSET__maxWeightFilterPhases, value);}
    public java.lang.foreign.MemorySegment $maxWeightFilterPhases() {return this.ptr.asSlice(OFFSET__maxWeightFilterPhases, LAYOUT__maxWeightFilterPhases);}

    public vulkan.VkExtent2D maxWeightFilterDimension() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxWeightFilterDimension, LAYOUT__maxWeightFilterDimension));}
    public void maxWeightFilterDimension(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxWeightFilterDimension());}
    public void maxWeightFilterDimension(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxWeightFilterDimension, LAYOUT__maxWeightFilterDimension.byteSize());}

    public vulkan.VkExtent2D maxBlockMatchRegion() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxBlockMatchRegion, LAYOUT__maxBlockMatchRegion));}
    public void maxBlockMatchRegion(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxBlockMatchRegion());}
    public void maxBlockMatchRegion(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxBlockMatchRegion, LAYOUT__maxBlockMatchRegion.byteSize());}

    public vulkan.VkExtent2D maxBoxFilterBlockSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__maxBoxFilterBlockSize, LAYOUT__maxBoxFilterBlockSize));}
    public void maxBoxFilterBlockSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxBoxFilterBlockSize());}
    public void maxBoxFilterBlockSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxBoxFilterBlockSize, LAYOUT__maxBoxFilterBlockSize.byteSize());}
}
