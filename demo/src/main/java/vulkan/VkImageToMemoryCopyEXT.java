package vulkan;

public record VkImageToMemoryCopyEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pHostPointer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pHostPointer");
    public static final long OFFSET__pHostPointer = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryRowLength = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryRowLength");
    public static final long OFFSET__memoryRowLength = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryImageHeight = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryImageHeight");
    public static final long OFFSET__memoryImageHeight = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__imageSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout.withName("imageSubresource");
    public static final long OFFSET__imageSubresource = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__imageOffset = vulkan.VkOffset3D.gRecordLayout.withName("imageOffset");
    public static final long OFFSET__imageOffset = 48;
    public static final java.lang.foreign.StructLayout LAYOUT__imageExtent = vulkan.VkExtent3D.gRecordLayout.withName("imageExtent");
    public static final long OFFSET__imageExtent = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pHostPointer,
            LAYOUT__memoryRowLength,
            LAYOUT__memoryImageHeight,
            LAYOUT__imageSubresource,
            LAYOUT__imageOffset,
            LAYOUT__imageExtent
    ).withByteAlignment(8).withName("VkImageToMemoryCopyEXT");

    public VkImageToMemoryCopyEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageToMemoryCopyEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageToMemoryCopyEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageToMemoryCopyEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pHostPointer() {return this.ptr.get(LAYOUT__pHostPointer, OFFSET__pHostPointer);}
    public void pHostPointer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pHostPointer, OFFSET__pHostPointer, value);}
    public java.lang.foreign.MemorySegment $pHostPointer() {return this.ptr.asSlice(OFFSET__pHostPointer, LAYOUT__pHostPointer);}

    public int memoryRowLength() {return this.ptr.get(LAYOUT__memoryRowLength, OFFSET__memoryRowLength);}
    public void memoryRowLength(int value) {this.ptr.set(LAYOUT__memoryRowLength, OFFSET__memoryRowLength, value);}
    public java.lang.foreign.MemorySegment $memoryRowLength() {return this.ptr.asSlice(OFFSET__memoryRowLength, LAYOUT__memoryRowLength);}

    public int memoryImageHeight() {return this.ptr.get(LAYOUT__memoryImageHeight, OFFSET__memoryImageHeight);}
    public void memoryImageHeight(int value) {this.ptr.set(LAYOUT__memoryImageHeight, OFFSET__memoryImageHeight, value);}
    public java.lang.foreign.MemorySegment $memoryImageHeight() {return this.ptr.asSlice(OFFSET__memoryImageHeight, LAYOUT__memoryImageHeight);}

    public vulkan.VkImageSubresourceLayers imageSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET__imageSubresource, LAYOUT__imageSubresource));}
    public void imageSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.imageSubresource());}
    public void imageSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageSubresource, LAYOUT__imageSubresource.byteSize());}

    public vulkan.VkOffset3D imageOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET__imageOffset, LAYOUT__imageOffset));}
    public void imageOffset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.imageOffset());}
    public void imageOffset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageOffset, LAYOUT__imageOffset.byteSize());}

    public vulkan.VkExtent3D imageExtent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__imageExtent, LAYOUT__imageExtent));}
    public void imageExtent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.imageExtent());}
    public void imageExtent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__imageExtent, LAYOUT__imageExtent.byteSize());}
}
