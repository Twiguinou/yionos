package vulkan;

public record VkPhysicalDeviceShadingRateImagePropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$shadingRateTexelSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$shadingRateTexelSize = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRatePaletteSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shadingRatePaletteSize = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRateMaxCoarseSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shadingRateMaxCoarseSamples = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shadingRateTexelSize,
            LAYOUT$shadingRatePaletteSize,
            LAYOUT$shadingRateMaxCoarseSamples
    ).withName("VkPhysicalDeviceShadingRateImagePropertiesNV");

    public VkPhysicalDeviceShadingRateImagePropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkExtent2D shadingRateTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$shadingRateTexelSize, LAYOUT$shadingRateTexelSize));}
    public void shadingRateTexelSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.shadingRateTexelSize());}
    public void shadingRateTexelSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$shadingRateTexelSize, LAYOUT$shadingRateTexelSize.byteSize());}

    public int shadingRatePaletteSize() {return this.ptr.get(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize);}
    public void shadingRatePaletteSize(int value) {this.ptr.set(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize, value);}
    public java.lang.foreign.MemorySegment shadingRatePaletteSize_ptr() {return this.ptr.asSlice(OFFSET$shadingRatePaletteSize, LAYOUT$shadingRatePaletteSize);}

    public int shadingRateMaxCoarseSamples() {return this.ptr.get(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples);}
    public void shadingRateMaxCoarseSamples(int value) {this.ptr.set(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples, value);}
    public java.lang.foreign.MemorySegment shadingRateMaxCoarseSamples_ptr() {return this.ptr.asSlice(OFFSET$shadingRateMaxCoarseSamples, LAYOUT$shadingRateMaxCoarseSamples);}
}
