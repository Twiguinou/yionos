package vulkan;

public record VkFramebufferCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__renderPass = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__renderPass = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__attachmentCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pAttachments = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__width = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__height = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__layers = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__renderPass,
            LAYOUT__attachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pAttachments,
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__layers,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkFramebufferCreateInfo");

    public VkFramebufferCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFramebufferCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFramebufferCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFramebufferCreateInfo value)
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

    public java.lang.foreign.MemorySegment renderPass() {return this.ptr.get(LAYOUT__renderPass, OFFSET__renderPass);}
    public void renderPass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__renderPass, OFFSET__renderPass, value);}
    public java.lang.foreign.MemorySegment $renderPass() {return this.ptr.asSlice(OFFSET__renderPass, LAYOUT__renderPass);}

    public int attachmentCount() {return this.ptr.get(LAYOUT__attachmentCount, OFFSET__attachmentCount);}
    public void attachmentCount(int value) {this.ptr.set(LAYOUT__attachmentCount, OFFSET__attachmentCount, value);}
    public java.lang.foreign.MemorySegment $attachmentCount() {return this.ptr.asSlice(OFFSET__attachmentCount, LAYOUT__attachmentCount);}

    public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT__pAttachments, OFFSET__pAttachments);}
    public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAttachments, OFFSET__pAttachments, value);}
    public java.lang.foreign.MemorySegment $pAttachments() {return this.ptr.asSlice(OFFSET__pAttachments, LAYOUT__pAttachments);}

    public int width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(int value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public int height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(int value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public int layers() {return this.ptr.get(LAYOUT__layers, OFFSET__layers);}
    public void layers(int value) {this.ptr.set(LAYOUT__layers, OFFSET__layers, value);}
    public java.lang.foreign.MemorySegment $layers() {return this.ptr.asSlice(OFFSET__layers, LAYOUT__layers);}
}
