package vulkan;

public record VkCopyMemoryToImageIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__srcAddress = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferRowLength = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferRowLength = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bufferImageHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bufferImageHeight = 12;
    public static final java.lang.foreign.StructLayout LAYOUT__imageSubresource = vulkan.VkImageSubresourceLayers.gRecordLayout;
    public static final long OFFSET__imageSubresource = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__imageOffset = vulkan.VkOffset3D.gRecordLayout;
    public static final long OFFSET__imageOffset = 32;
    public static final java.lang.foreign.StructLayout LAYOUT__imageExtent = vulkan.VkExtent3D.gRecordLayout;
    public static final long OFFSET__imageExtent = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__srcAddress,
            LAYOUT__bufferRowLength,
            LAYOUT__bufferImageHeight,
            LAYOUT__imageSubresource,
            LAYOUT__imageOffset,
            LAYOUT__imageExtent
    ).withByteAlignment(8).withName("VkCopyMemoryToImageIndirectCommandNV");

    public VkCopyMemoryToImageIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCopyMemoryToImageIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCopyMemoryToImageIndirectCommandNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCopyMemoryToImageIndirectCommandNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long srcAddress() {return this.ptr.get(LAYOUT__srcAddress, OFFSET__srcAddress);}
    public void srcAddress(long value) {this.ptr.set(LAYOUT__srcAddress, OFFSET__srcAddress, value);}
    public java.lang.foreign.MemorySegment $srcAddress() {return this.ptr.asSlice(OFFSET__srcAddress, LAYOUT__srcAddress);}

    public int bufferRowLength() {return this.ptr.get(LAYOUT__bufferRowLength, OFFSET__bufferRowLength);}
    public void bufferRowLength(int value) {this.ptr.set(LAYOUT__bufferRowLength, OFFSET__bufferRowLength, value);}
    public java.lang.foreign.MemorySegment $bufferRowLength() {return this.ptr.asSlice(OFFSET__bufferRowLength, LAYOUT__bufferRowLength);}

    public int bufferImageHeight() {return this.ptr.get(LAYOUT__bufferImageHeight, OFFSET__bufferImageHeight);}
    public void bufferImageHeight(int value) {this.ptr.set(LAYOUT__bufferImageHeight, OFFSET__bufferImageHeight, value);}
    public java.lang.foreign.MemorySegment $bufferImageHeight() {return this.ptr.asSlice(OFFSET__bufferImageHeight, LAYOUT__bufferImageHeight);}

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
