package vulkan;

public record VkBufferImageCopy(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bufferOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bufferOffset = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferRowLength = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferRowLength = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferImageHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferImageHeight = 12L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$imageSubresource = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$imageOffset = 32L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageExtent = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$imageExtent = 44L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$bufferOffset,
            LAYOUT$bufferRowLength,
            LAYOUT$bufferImageHeight,
            LAYOUT$imageSubresource,
            LAYOUT$imageOffset,
            LAYOUT$imageExtent
    ).withName("VkBufferImageCopy");

    public VkBufferImageCopy(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkBufferImageCopy getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkBufferImageCopy(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long bufferOffset() {return this.ptr.get(LAYOUT$bufferOffset, OFFSET$bufferOffset);}
    public void bufferOffset(long value) {this.ptr.set(LAYOUT$bufferOffset, OFFSET$bufferOffset, value);}
    public java.lang.foreign.MemorySegment bufferOffset_ptr() {return this.ptr.asSlice(OFFSET$bufferOffset, LAYOUT$bufferOffset);}

    public int bufferRowLength() {return this.ptr.get(LAYOUT$bufferRowLength, OFFSET$bufferRowLength);}
    public void bufferRowLength(int value) {this.ptr.set(LAYOUT$bufferRowLength, OFFSET$bufferRowLength, value);}
    public java.lang.foreign.MemorySegment bufferRowLength_ptr() {return this.ptr.asSlice(OFFSET$bufferRowLength, LAYOUT$bufferRowLength);}

    public int bufferImageHeight() {return this.ptr.get(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight);}
    public void bufferImageHeight(int value) {this.ptr.set(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight, value);}
    public java.lang.foreign.MemorySegment bufferImageHeight_ptr() {return this.ptr.asSlice(OFFSET$bufferImageHeight, LAYOUT$bufferImageHeight);}

    public vulkan.VkImageSubresourceLayers imageSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));}
    public void imageSubresource(java.util.function.Consumer<vulkan.VkImageSubresourceLayers> consumer) {consumer.accept(this.imageSubresource());}
    public void imageSubresource(vulkan.VkImageSubresourceLayers value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$imageSubresource, LAYOUT$imageSubresource.byteSize());}

    public vulkan.VkOffset3D imageOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$imageOffset, LAYOUT$imageOffset));}
    public void imageOffset(java.util.function.Consumer<vulkan.VkOffset3D> consumer) {consumer.accept(this.imageOffset());}
    public void imageOffset(vulkan.VkOffset3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$imageOffset, LAYOUT$imageOffset.byteSize());}

    public vulkan.VkExtent3D imageExtent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));}
    public void imageExtent(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.imageExtent());}
    public void imageExtent(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$imageExtent, LAYOUT$imageExtent.byteSize());}
}
