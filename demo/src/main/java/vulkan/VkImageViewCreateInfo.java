package vulkan;

public record VkImageViewCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__image = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("image");
    public static final long OFFSET__image = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewType = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewType");
    public static final long OFFSET__viewType = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 36;
    public static final java.lang.foreign.StructLayout LAYOUT__components = vulkan.VkComponentMapping.gRecordLayout.withName("components");
    public static final long OFFSET__components = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__subresourceRange = vulkan.VkImageSubresourceRange.gRecordLayout.withName("subresourceRange");
    public static final long OFFSET__subresourceRange = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__image,
            LAYOUT__viewType,
            LAYOUT__format,
            LAYOUT__components,
            LAYOUT__subresourceRange,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkImageViewCreateInfo");

    public VkImageViewCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageViewCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageViewCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageViewCreateInfo value)
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

    public java.lang.foreign.MemorySegment image() {return this.ptr.get(LAYOUT__image, OFFSET__image);}
    public void image(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__image, OFFSET__image, value);}
    public java.lang.foreign.MemorySegment $image() {return this.ptr.asSlice(OFFSET__image, LAYOUT__image);}

    public int viewType() {return this.ptr.get(LAYOUT__viewType, OFFSET__viewType);}
    public void viewType(int value) {this.ptr.set(LAYOUT__viewType, OFFSET__viewType, value);}
    public java.lang.foreign.MemorySegment $viewType() {return this.ptr.asSlice(OFFSET__viewType, LAYOUT__viewType);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public vulkan.VkComponentMapping components() {return new vulkan.VkComponentMapping(this.ptr.asSlice(OFFSET__components, LAYOUT__components));}
    public void components(java.util.function.Consumer<vulkan.VkComponentMapping> consumer) {consumer.accept(this.components());}
    public void components(vulkan.VkComponentMapping value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__components, LAYOUT__components.byteSize());}

    public vulkan.VkImageSubresourceRange subresourceRange() {return new vulkan.VkImageSubresourceRange(this.ptr.asSlice(OFFSET__subresourceRange, LAYOUT__subresourceRange));}
    public void subresourceRange(java.util.function.Consumer<vulkan.VkImageSubresourceRange> consumer) {consumer.accept(this.subresourceRange());}
    public void subresourceRange(vulkan.VkImageSubresourceRange value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__subresourceRange, LAYOUT__subresourceRange.byteSize());}
}
