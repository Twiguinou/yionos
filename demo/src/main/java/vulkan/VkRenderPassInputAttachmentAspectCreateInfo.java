package vulkan;

public record VkRenderPassInputAttachmentAspectCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__aspectReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__aspectReferenceCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAspectReferences = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pAspectReferences = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__aspectReferenceCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pAspectReferences
    ).withByteAlignment(8).withName("VkRenderPassInputAttachmentAspectCreateInfo");

    public VkRenderPassInputAttachmentAspectCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassInputAttachmentAspectCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassInputAttachmentAspectCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassInputAttachmentAspectCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int aspectReferenceCount() {return this.ptr.get(LAYOUT__aspectReferenceCount, OFFSET__aspectReferenceCount);}
    public void aspectReferenceCount(int value) {this.ptr.set(LAYOUT__aspectReferenceCount, OFFSET__aspectReferenceCount, value);}
    public java.lang.foreign.MemorySegment $aspectReferenceCount() {return this.ptr.asSlice(OFFSET__aspectReferenceCount, LAYOUT__aspectReferenceCount);}

    public java.lang.foreign.MemorySegment pAspectReferences() {return this.ptr.get(LAYOUT__pAspectReferences, OFFSET__pAspectReferences);}
    public void pAspectReferences(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAspectReferences, OFFSET__pAspectReferences, value);}
    public java.lang.foreign.MemorySegment $pAspectReferences() {return this.ptr.asSlice(OFFSET__pAspectReferences, LAYOUT__pAspectReferences);}
}
