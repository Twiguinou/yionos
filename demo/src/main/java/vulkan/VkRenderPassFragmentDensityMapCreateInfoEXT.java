package vulkan;

public record VkRenderPassFragmentDensityMapCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$fragmentDensityMapAttachment = vulkan.VkAttachmentReference.gStructLayout;
    public static final long OFFSET$fragmentDensityMapAttachment = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$fragmentDensityMapAttachment
    ).withName("VkRenderPassFragmentDensityMapCreateInfoEXT");

    public VkRenderPassFragmentDensityMapCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkAttachmentReference fragmentDensityMapAttachment() {return new vulkan.VkAttachmentReference(this.ptr.asSlice(OFFSET$fragmentDensityMapAttachment, LAYOUT$fragmentDensityMapAttachment));}
    public void fragmentDensityMapAttachment(java.util.function.Consumer<vulkan.VkAttachmentReference> consumer) {consumer.accept(this.fragmentDensityMapAttachment());}
    public void fragmentDensityMapAttachment(vulkan.VkAttachmentReference value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$fragmentDensityMapAttachment, LAYOUT$fragmentDensityMapAttachment.byteSize());}
}
