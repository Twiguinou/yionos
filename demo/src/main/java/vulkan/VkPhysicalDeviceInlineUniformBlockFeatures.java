package vulkan;

public record VkPhysicalDeviceInlineUniformBlockFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inlineUniformBlock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__inlineUniformBlock = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__inlineUniformBlock,
            LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind
    ).withByteAlignment(8).withName("VkPhysicalDeviceInlineUniformBlockFeatures");

    public VkPhysicalDeviceInlineUniformBlockFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceInlineUniformBlockFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceInlineUniformBlockFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int inlineUniformBlock() {return this.ptr.get(LAYOUT__inlineUniformBlock, OFFSET__inlineUniformBlock);}
    public void inlineUniformBlock(int value) {this.ptr.set(LAYOUT__inlineUniformBlock, OFFSET__inlineUniformBlock, value);}
    public java.lang.foreign.MemorySegment $inlineUniformBlock() {return this.ptr.asSlice(OFFSET__inlineUniformBlock, LAYOUT__inlineUniformBlock);}

    public int descriptorBindingInlineUniformBlockUpdateAfterBind() {return this.ptr.get(LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind);}
    public void descriptorBindingInlineUniformBlockUpdateAfterBind(int value) {this.ptr.set(LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment $descriptorBindingInlineUniformBlockUpdateAfterBind() {return this.ptr.asSlice(OFFSET__descriptorBindingInlineUniformBlockUpdateAfterBind, LAYOUT__descriptorBindingInlineUniformBlockUpdateAfterBind);}
}
