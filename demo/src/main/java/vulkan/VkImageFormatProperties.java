package vulkan;

public record VkImageFormatProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__maxExtent = vulkan.VkExtent3D.gRecordLayout.withName("maxExtent");
    public static final long OFFSET__maxExtent = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMipLevels = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMipLevels");
    public static final long OFFSET__maxMipLevels = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxArrayLayers");
    public static final long OFFSET__maxArrayLayers = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sampleCounts = java.lang.foreign.ValueLayout.JAVA_INT.withName("sampleCounts");
    public static final long OFFSET__sampleCounts = 20;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxResourceSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("maxResourceSize");
    public static final long OFFSET__maxResourceSize = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__maxExtent,
            LAYOUT__maxMipLevels,
            LAYOUT__maxArrayLayers,
            LAYOUT__sampleCounts,
            LAYOUT__maxResourceSize
    ).withByteAlignment(8).withName("VkImageFormatProperties");

    public VkImageFormatProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageFormatProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageFormatProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageFormatProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkExtent3D maxExtent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__maxExtent, LAYOUT__maxExtent));}
    public void maxExtent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.maxExtent());}
    public void maxExtent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__maxExtent, LAYOUT__maxExtent.byteSize());}

    public int maxMipLevels() {return this.ptr.get(LAYOUT__maxMipLevels, OFFSET__maxMipLevels);}
    public void maxMipLevels(int value) {this.ptr.set(LAYOUT__maxMipLevels, OFFSET__maxMipLevels, value);}
    public java.lang.foreign.MemorySegment $maxMipLevels() {return this.ptr.asSlice(OFFSET__maxMipLevels, LAYOUT__maxMipLevels);}

    public int maxArrayLayers() {return this.ptr.get(LAYOUT__maxArrayLayers, OFFSET__maxArrayLayers);}
    public void maxArrayLayers(int value) {this.ptr.set(LAYOUT__maxArrayLayers, OFFSET__maxArrayLayers, value);}
    public java.lang.foreign.MemorySegment $maxArrayLayers() {return this.ptr.asSlice(OFFSET__maxArrayLayers, LAYOUT__maxArrayLayers);}

    public int sampleCounts() {return this.ptr.get(LAYOUT__sampleCounts, OFFSET__sampleCounts);}
    public void sampleCounts(int value) {this.ptr.set(LAYOUT__sampleCounts, OFFSET__sampleCounts, value);}
    public java.lang.foreign.MemorySegment $sampleCounts() {return this.ptr.asSlice(OFFSET__sampleCounts, LAYOUT__sampleCounts);}

    public long maxResourceSize() {return this.ptr.get(LAYOUT__maxResourceSize, OFFSET__maxResourceSize);}
    public void maxResourceSize(long value) {this.ptr.set(LAYOUT__maxResourceSize, OFFSET__maxResourceSize, value);}
    public java.lang.foreign.MemorySegment $maxResourceSize() {return this.ptr.asSlice(OFFSET__maxResourceSize, LAYOUT__maxResourceSize);}
}
