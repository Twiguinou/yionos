package vulkan;

public record VkRenderingInputAttachmentIndexInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__colorAttachmentCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorAttachmentInputIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pColorAttachmentInputIndices = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDepthInputAttachmentIndex = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDepthInputAttachmentIndex = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStencilInputAttachmentIndex = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStencilInputAttachmentIndex = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__colorAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pColorAttachmentInputIndices,
            LAYOUT__pDepthInputAttachmentIndex,
            LAYOUT__pStencilInputAttachmentIndex
    ).withByteAlignment(8).withName("VkRenderingInputAttachmentIndexInfoKHR");

    public VkRenderingInputAttachmentIndexInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderingInputAttachmentIndexInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderingInputAttachmentIndexInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderingInputAttachmentIndexInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $colorAttachmentCount() {return this.ptr.asSlice(OFFSET__colorAttachmentCount, LAYOUT__colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachmentInputIndices() {return this.ptr.get(LAYOUT__pColorAttachmentInputIndices, OFFSET__pColorAttachmentInputIndices);}
    public void pColorAttachmentInputIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorAttachmentInputIndices, OFFSET__pColorAttachmentInputIndices, value);}
    public java.lang.foreign.MemorySegment $pColorAttachmentInputIndices() {return this.ptr.asSlice(OFFSET__pColorAttachmentInputIndices, LAYOUT__pColorAttachmentInputIndices);}

    public java.lang.foreign.MemorySegment pDepthInputAttachmentIndex() {return this.ptr.get(LAYOUT__pDepthInputAttachmentIndex, OFFSET__pDepthInputAttachmentIndex);}
    public void pDepthInputAttachmentIndex(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDepthInputAttachmentIndex, OFFSET__pDepthInputAttachmentIndex, value);}
    public java.lang.foreign.MemorySegment $pDepthInputAttachmentIndex() {return this.ptr.asSlice(OFFSET__pDepthInputAttachmentIndex, LAYOUT__pDepthInputAttachmentIndex);}

    public java.lang.foreign.MemorySegment pStencilInputAttachmentIndex() {return this.ptr.get(LAYOUT__pStencilInputAttachmentIndex, OFFSET__pStencilInputAttachmentIndex);}
    public void pStencilInputAttachmentIndex(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStencilInputAttachmentIndex, OFFSET__pStencilInputAttachmentIndex, value);}
    public java.lang.foreign.MemorySegment $pStencilInputAttachmentIndex() {return this.ptr.asSlice(OFFSET__pStencilInputAttachmentIndex, LAYOUT__pStencilInputAttachmentIndex);}
}
