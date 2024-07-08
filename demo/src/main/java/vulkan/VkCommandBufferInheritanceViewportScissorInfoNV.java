package vulkan;

public record VkCommandBufferInheritanceViewportScissorInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewportScissor2D = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewportScissor2D");
    public static final long OFFSET__viewportScissor2D = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewportDepthCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewportDepthCount");
    public static final long OFFSET__viewportDepthCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewportDepths = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pViewportDepths");
    public static final long OFFSET__pViewportDepths = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__viewportScissor2D,
            LAYOUT__viewportDepthCount,
            LAYOUT__pViewportDepths
    ).withByteAlignment(8).withName("VkCommandBufferInheritanceViewportScissorInfoNV");

    public VkCommandBufferInheritanceViewportScissorInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCommandBufferInheritanceViewportScissorInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int viewportScissor2D() {return this.ptr.get(LAYOUT__viewportScissor2D, OFFSET__viewportScissor2D);}
    public void viewportScissor2D(int value) {this.ptr.set(LAYOUT__viewportScissor2D, OFFSET__viewportScissor2D, value);}
    public java.lang.foreign.MemorySegment $viewportScissor2D() {return this.ptr.asSlice(OFFSET__viewportScissor2D, LAYOUT__viewportScissor2D);}

    public int viewportDepthCount() {return this.ptr.get(LAYOUT__viewportDepthCount, OFFSET__viewportDepthCount);}
    public void viewportDepthCount(int value) {this.ptr.set(LAYOUT__viewportDepthCount, OFFSET__viewportDepthCount, value);}
    public java.lang.foreign.MemorySegment $viewportDepthCount() {return this.ptr.asSlice(OFFSET__viewportDepthCount, LAYOUT__viewportDepthCount);}

    public java.lang.foreign.MemorySegment pViewportDepths() {return this.ptr.get(LAYOUT__pViewportDepths, OFFSET__pViewportDepths);}
    public void pViewportDepths(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewportDepths, OFFSET__pViewportDepths, value);}
    public java.lang.foreign.MemorySegment $pViewportDepths() {return this.ptr.asSlice(OFFSET__pViewportDepths, LAYOUT__pViewportDepths);}
}
