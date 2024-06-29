package vulkan;

public record VkRenderPassCreateInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__attachmentCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAttachments = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pAttachments = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subpassCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__subpassCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSubpasses = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSubpasses = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dependencyCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dependencyCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDependencies = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDependencies = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__correlatedViewMaskCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__correlatedViewMaskCount = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCorrelatedViewMasks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCorrelatedViewMasks = 72;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__attachmentCount,
            LAYOUT__pAttachments,
            LAYOUT__subpassCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSubpasses,
            LAYOUT__dependencyCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDependencies,
            LAYOUT__correlatedViewMaskCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCorrelatedViewMasks
    ).withByteAlignment(8).withName("VkRenderPassCreateInfo2");

    public VkRenderPassCreateInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassCreateInfo2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassCreateInfo2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassCreateInfo2 value)
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

    public int attachmentCount() {return this.ptr.get(LAYOUT__attachmentCount, OFFSET__attachmentCount);}
    public void attachmentCount(int value) {this.ptr.set(LAYOUT__attachmentCount, OFFSET__attachmentCount, value);}
    public java.lang.foreign.MemorySegment $attachmentCount() {return this.ptr.asSlice(OFFSET__attachmentCount, LAYOUT__attachmentCount);}

    public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT__pAttachments, OFFSET__pAttachments);}
    public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAttachments, OFFSET__pAttachments, value);}
    public java.lang.foreign.MemorySegment $pAttachments() {return this.ptr.asSlice(OFFSET__pAttachments, LAYOUT__pAttachments);}

    public int subpassCount() {return this.ptr.get(LAYOUT__subpassCount, OFFSET__subpassCount);}
    public void subpassCount(int value) {this.ptr.set(LAYOUT__subpassCount, OFFSET__subpassCount, value);}
    public java.lang.foreign.MemorySegment $subpassCount() {return this.ptr.asSlice(OFFSET__subpassCount, LAYOUT__subpassCount);}

    public java.lang.foreign.MemorySegment pSubpasses() {return this.ptr.get(LAYOUT__pSubpasses, OFFSET__pSubpasses);}
    public void pSubpasses(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSubpasses, OFFSET__pSubpasses, value);}
    public java.lang.foreign.MemorySegment $pSubpasses() {return this.ptr.asSlice(OFFSET__pSubpasses, LAYOUT__pSubpasses);}

    public int dependencyCount() {return this.ptr.get(LAYOUT__dependencyCount, OFFSET__dependencyCount);}
    public void dependencyCount(int value) {this.ptr.set(LAYOUT__dependencyCount, OFFSET__dependencyCount, value);}
    public java.lang.foreign.MemorySegment $dependencyCount() {return this.ptr.asSlice(OFFSET__dependencyCount, LAYOUT__dependencyCount);}

    public java.lang.foreign.MemorySegment pDependencies() {return this.ptr.get(LAYOUT__pDependencies, OFFSET__pDependencies);}
    public void pDependencies(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDependencies, OFFSET__pDependencies, value);}
    public java.lang.foreign.MemorySegment $pDependencies() {return this.ptr.asSlice(OFFSET__pDependencies, LAYOUT__pDependencies);}

    public int correlatedViewMaskCount() {return this.ptr.get(LAYOUT__correlatedViewMaskCount, OFFSET__correlatedViewMaskCount);}
    public void correlatedViewMaskCount(int value) {this.ptr.set(LAYOUT__correlatedViewMaskCount, OFFSET__correlatedViewMaskCount, value);}
    public java.lang.foreign.MemorySegment $correlatedViewMaskCount() {return this.ptr.asSlice(OFFSET__correlatedViewMaskCount, LAYOUT__correlatedViewMaskCount);}

    public java.lang.foreign.MemorySegment pCorrelatedViewMasks() {return this.ptr.get(LAYOUT__pCorrelatedViewMasks, OFFSET__pCorrelatedViewMasks);}
    public void pCorrelatedViewMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCorrelatedViewMasks, OFFSET__pCorrelatedViewMasks, value);}
    public java.lang.foreign.MemorySegment $pCorrelatedViewMasks() {return this.ptr.asSlice(OFFSET__pCorrelatedViewMasks, LAYOUT__pCorrelatedViewMasks);}
}
