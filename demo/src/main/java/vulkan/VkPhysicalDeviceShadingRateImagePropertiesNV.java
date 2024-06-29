package vulkan;

public record VkPhysicalDeviceShadingRateImagePropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__shadingRateTexelSize = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__shadingRateTexelSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRatePaletteSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shadingRatePaletteSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRateMaxCoarseSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shadingRateMaxCoarseSamples = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shadingRateTexelSize,
            LAYOUT__shadingRatePaletteSize,
            LAYOUT__shadingRateMaxCoarseSamples
    ).withByteAlignment(8).withName("VkPhysicalDeviceShadingRateImagePropertiesNV");

    public VkPhysicalDeviceShadingRateImagePropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShadingRateImagePropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkExtent2D shadingRateTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__shadingRateTexelSize, LAYOUT__shadingRateTexelSize));}
    public void shadingRateTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.shadingRateTexelSize());}
    public void shadingRateTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__shadingRateTexelSize, LAYOUT__shadingRateTexelSize.byteSize());}

    public int shadingRatePaletteSize() {return this.ptr.get(LAYOUT__shadingRatePaletteSize, OFFSET__shadingRatePaletteSize);}
    public void shadingRatePaletteSize(int value) {this.ptr.set(LAYOUT__shadingRatePaletteSize, OFFSET__shadingRatePaletteSize, value);}
    public java.lang.foreign.MemorySegment $shadingRatePaletteSize() {return this.ptr.asSlice(OFFSET__shadingRatePaletteSize, LAYOUT__shadingRatePaletteSize);}

    public int shadingRateMaxCoarseSamples() {return this.ptr.get(LAYOUT__shadingRateMaxCoarseSamples, OFFSET__shadingRateMaxCoarseSamples);}
    public void shadingRateMaxCoarseSamples(int value) {this.ptr.set(LAYOUT__shadingRateMaxCoarseSamples, OFFSET__shadingRateMaxCoarseSamples, value);}
    public java.lang.foreign.MemorySegment $shadingRateMaxCoarseSamples() {return this.ptr.asSlice(OFFSET__shadingRateMaxCoarseSamples, LAYOUT__shadingRateMaxCoarseSamples);}
}
