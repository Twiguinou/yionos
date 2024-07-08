package vulkan;

public record VkImageCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageType = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageType");
    public static final long OFFSET__imageType = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__extent = vulkan.VkExtent3D.gRecordLayout.withName("extent");
    public static final long OFFSET__extent = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mipLevels = java.lang.foreign.ValueLayout.JAVA_INT.withName("mipLevels");
    public static final long OFFSET__mipLevels = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__arrayLayers = java.lang.foreign.ValueLayout.JAVA_INT.withName("arrayLayers");
    public static final long OFFSET__arrayLayers = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samples = java.lang.foreign.ValueLayout.JAVA_INT.withName("samples");
    public static final long OFFSET__samples = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tiling = java.lang.foreign.ValueLayout.JAVA_INT.withName("tiling");
    public static final long OFFSET__tiling = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__usage = java.lang.foreign.ValueLayout.JAVA_INT.withName("usage");
    public static final long OFFSET__usage = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sharingMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("sharingMode");
    public static final long OFFSET__sharingMode = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("queueFamilyIndexCount");
    public static final long OFFSET__queueFamilyIndexCount = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQueueFamilyIndices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pQueueFamilyIndices");
    public static final long OFFSET__pQueueFamilyIndices = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__initialLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("initialLayout");
    public static final long OFFSET__initialLayout = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__imageType,
            LAYOUT__format,
            LAYOUT__extent,
            LAYOUT__mipLevels,
            LAYOUT__arrayLayers,
            LAYOUT__samples,
            LAYOUT__tiling,
            LAYOUT__usage,
            LAYOUT__sharingMode,
            LAYOUT__queueFamilyIndexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pQueueFamilyIndices,
            LAYOUT__initialLayout,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkImageCreateInfo");

    public VkImageCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int imageType() {return this.ptr.get(LAYOUT__imageType, OFFSET__imageType);}
    public void imageType(int value) {this.ptr.set(LAYOUT__imageType, OFFSET__imageType, value);}
    public java.lang.foreign.MemorySegment $imageType() {return this.ptr.asSlice(OFFSET__imageType, LAYOUT__imageType);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public vulkan.VkExtent3D extent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__extent, LAYOUT__extent));}
    public void extent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.extent());}
    public void extent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__extent, LAYOUT__extent.byteSize());}

    public int mipLevels() {return this.ptr.get(LAYOUT__mipLevels, OFFSET__mipLevels);}
    public void mipLevels(int value) {this.ptr.set(LAYOUT__mipLevels, OFFSET__mipLevels, value);}
    public java.lang.foreign.MemorySegment $mipLevels() {return this.ptr.asSlice(OFFSET__mipLevels, LAYOUT__mipLevels);}

    public int arrayLayers() {return this.ptr.get(LAYOUT__arrayLayers, OFFSET__arrayLayers);}
    public void arrayLayers(int value) {this.ptr.set(LAYOUT__arrayLayers, OFFSET__arrayLayers, value);}
    public java.lang.foreign.MemorySegment $arrayLayers() {return this.ptr.asSlice(OFFSET__arrayLayers, LAYOUT__arrayLayers);}

    public int samples() {return this.ptr.get(LAYOUT__samples, OFFSET__samples);}
    public void samples(int value) {this.ptr.set(LAYOUT__samples, OFFSET__samples, value);}
    public java.lang.foreign.MemorySegment $samples() {return this.ptr.asSlice(OFFSET__samples, LAYOUT__samples);}

    public int tiling() {return this.ptr.get(LAYOUT__tiling, OFFSET__tiling);}
    public void tiling(int value) {this.ptr.set(LAYOUT__tiling, OFFSET__tiling, value);}
    public java.lang.foreign.MemorySegment $tiling() {return this.ptr.asSlice(OFFSET__tiling, LAYOUT__tiling);}

    public int usage() {return this.ptr.get(LAYOUT__usage, OFFSET__usage);}
    public void usage(int value) {this.ptr.set(LAYOUT__usage, OFFSET__usage, value);}
    public java.lang.foreign.MemorySegment $usage() {return this.ptr.asSlice(OFFSET__usage, LAYOUT__usage);}

    public int sharingMode() {return this.ptr.get(LAYOUT__sharingMode, OFFSET__sharingMode);}
    public void sharingMode(int value) {this.ptr.set(LAYOUT__sharingMode, OFFSET__sharingMode, value);}
    public java.lang.foreign.MemorySegment $sharingMode() {return this.ptr.asSlice(OFFSET__sharingMode, LAYOUT__sharingMode);}

    public int queueFamilyIndexCount() {return this.ptr.get(LAYOUT__queueFamilyIndexCount, OFFSET__queueFamilyIndexCount);}
    public void queueFamilyIndexCount(int value) {this.ptr.set(LAYOUT__queueFamilyIndexCount, OFFSET__queueFamilyIndexCount, value);}
    public java.lang.foreign.MemorySegment $queueFamilyIndexCount() {return this.ptr.asSlice(OFFSET__queueFamilyIndexCount, LAYOUT__queueFamilyIndexCount);}

    public java.lang.foreign.MemorySegment pQueueFamilyIndices() {return this.ptr.get(LAYOUT__pQueueFamilyIndices, OFFSET__pQueueFamilyIndices);}
    public void pQueueFamilyIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pQueueFamilyIndices, OFFSET__pQueueFamilyIndices, value);}
    public java.lang.foreign.MemorySegment $pQueueFamilyIndices() {return this.ptr.asSlice(OFFSET__pQueueFamilyIndices, LAYOUT__pQueueFamilyIndices);}

    public int initialLayout() {return this.ptr.get(LAYOUT__initialLayout, OFFSET__initialLayout);}
    public void initialLayout(int value) {this.ptr.set(LAYOUT__initialLayout, OFFSET__initialLayout, value);}
    public java.lang.foreign.MemorySegment $initialLayout() {return this.ptr.asSlice(OFFSET__initialLayout, LAYOUT__initialLayout);}
}
