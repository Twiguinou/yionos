package vulkan;

public record VkRenderingAttachmentInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__imageView = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("imageView");
    public static final long OFFSET__imageView = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageLayout");
    public static final long OFFSET__imageLayout = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__resolveMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("resolveMode");
    public static final long OFFSET__resolveMode = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__resolveImageView = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("resolveImageView");
    public static final long OFFSET__resolveImageView = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__resolveImageLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("resolveImageLayout");
    public static final long OFFSET__resolveImageLayout = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__loadOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("loadOp");
    public static final long OFFSET__loadOp = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__storeOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("storeOp");
    public static final long OFFSET__storeOp = 48;
    public static final java.lang.foreign.UnionLayout LAYOUT__clearValue = vulkan.VkClearValue.gRecordLayout.withName("clearValue");
    public static final long OFFSET__clearValue = 52;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__imageView,
            LAYOUT__imageLayout,
            LAYOUT__resolveMode,
            LAYOUT__resolveImageView,
            LAYOUT__resolveImageLayout,
            LAYOUT__loadOp,
            LAYOUT__storeOp,
            LAYOUT__clearValue,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkRenderingAttachmentInfo");

    public VkRenderingAttachmentInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderingAttachmentInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderingAttachmentInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderingAttachmentInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment imageView() {return this.ptr.get(LAYOUT__imageView, OFFSET__imageView);}
    public void imageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__imageView, OFFSET__imageView, value);}
    public java.lang.foreign.MemorySegment $imageView() {return this.ptr.asSlice(OFFSET__imageView, LAYOUT__imageView);}

    public int imageLayout() {return this.ptr.get(LAYOUT__imageLayout, OFFSET__imageLayout);}
    public void imageLayout(int value) {this.ptr.set(LAYOUT__imageLayout, OFFSET__imageLayout, value);}
    public java.lang.foreign.MemorySegment $imageLayout() {return this.ptr.asSlice(OFFSET__imageLayout, LAYOUT__imageLayout);}

    public int resolveMode() {return this.ptr.get(LAYOUT__resolveMode, OFFSET__resolveMode);}
    public void resolveMode(int value) {this.ptr.set(LAYOUT__resolveMode, OFFSET__resolveMode, value);}
    public java.lang.foreign.MemorySegment $resolveMode() {return this.ptr.asSlice(OFFSET__resolveMode, LAYOUT__resolveMode);}

    public java.lang.foreign.MemorySegment resolveImageView() {return this.ptr.get(LAYOUT__resolveImageView, OFFSET__resolveImageView);}
    public void resolveImageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__resolveImageView, OFFSET__resolveImageView, value);}
    public java.lang.foreign.MemorySegment $resolveImageView() {return this.ptr.asSlice(OFFSET__resolveImageView, LAYOUT__resolveImageView);}

    public int resolveImageLayout() {return this.ptr.get(LAYOUT__resolveImageLayout, OFFSET__resolveImageLayout);}
    public void resolveImageLayout(int value) {this.ptr.set(LAYOUT__resolveImageLayout, OFFSET__resolveImageLayout, value);}
    public java.lang.foreign.MemorySegment $resolveImageLayout() {return this.ptr.asSlice(OFFSET__resolveImageLayout, LAYOUT__resolveImageLayout);}

    public int loadOp() {return this.ptr.get(LAYOUT__loadOp, OFFSET__loadOp);}
    public void loadOp(int value) {this.ptr.set(LAYOUT__loadOp, OFFSET__loadOp, value);}
    public java.lang.foreign.MemorySegment $loadOp() {return this.ptr.asSlice(OFFSET__loadOp, LAYOUT__loadOp);}

    public int storeOp() {return this.ptr.get(LAYOUT__storeOp, OFFSET__storeOp);}
    public void storeOp(int value) {this.ptr.set(LAYOUT__storeOp, OFFSET__storeOp, value);}
    public java.lang.foreign.MemorySegment $storeOp() {return this.ptr.asSlice(OFFSET__storeOp, LAYOUT__storeOp);}

    public vulkan.VkClearValue clearValue() {return new vulkan.VkClearValue(this.ptr.asSlice(OFFSET__clearValue, LAYOUT__clearValue));}
    public void clearValue(java.util.function.Consumer<vulkan.VkClearValue> consumer) {consumer.accept(this.clearValue());}
    public void clearValue(vulkan.VkClearValue value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__clearValue, LAYOUT__clearValue.byteSize());}
}
