package vulkan;

public record VkVideoPictureResourceInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__codedOffset = vulkan.VkOffset2D.gRecordLayout;
    public static final long OFFSET__codedOffset = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__codedExtent = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__codedExtent = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__baseArrayLayer = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__imageViewBinding = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__imageViewBinding = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__codedOffset,
            LAYOUT__codedExtent,
            LAYOUT__baseArrayLayer,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__imageViewBinding
    ).withByteAlignment(8).withName("VkVideoPictureResourceInfoKHR");

    public VkVideoPictureResourceInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoPictureResourceInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoPictureResourceInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoPictureResourceInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkOffset2D codedOffset() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__codedOffset, LAYOUT__codedOffset));}
    public void codedOffset(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.codedOffset());}
    public void codedOffset(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__codedOffset, LAYOUT__codedOffset.byteSize());}

    public vulkan.VkExtent2D codedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__codedExtent, LAYOUT__codedExtent));}
    public void codedExtent(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.codedExtent());}
    public void codedExtent(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__codedExtent, LAYOUT__codedExtent.byteSize());}

    public int baseArrayLayer() {return this.ptr.get(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer);}
    public void baseArrayLayer(int value) {this.ptr.set(LAYOUT__baseArrayLayer, OFFSET__baseArrayLayer, value);}
    public java.lang.foreign.MemorySegment $baseArrayLayer() {return this.ptr.asSlice(OFFSET__baseArrayLayer, LAYOUT__baseArrayLayer);}

    public java.lang.foreign.MemorySegment imageViewBinding() {return this.ptr.get(LAYOUT__imageViewBinding, OFFSET__imageViewBinding);}
    public void imageViewBinding(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__imageViewBinding, OFFSET__imageViewBinding, value);}
    public java.lang.foreign.MemorySegment $imageViewBinding() {return this.ptr.asSlice(OFFSET__imageViewBinding, LAYOUT__imageViewBinding);}
}
