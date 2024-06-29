package vulkan;

public record VkRenderPassBeginInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__renderPass = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__renderPass = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__framebuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__framebuffer = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__renderArea = vulkan.VkRect2D.gRecordLayout;
    public static final long OFFSET__renderArea = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__clearValueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__clearValueCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pClearValues = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pClearValues = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__renderPass,
            LAYOUT__framebuffer,
            LAYOUT__renderArea,
            LAYOUT__clearValueCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pClearValues
    ).withByteAlignment(8).withName("VkRenderPassBeginInfo");

    public VkRenderPassBeginInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassBeginInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassBeginInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassBeginInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment renderPass() {return this.ptr.get(LAYOUT__renderPass, OFFSET__renderPass);}
    public void renderPass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__renderPass, OFFSET__renderPass, value);}
    public java.lang.foreign.MemorySegment $renderPass() {return this.ptr.asSlice(OFFSET__renderPass, LAYOUT__renderPass);}

    public java.lang.foreign.MemorySegment framebuffer() {return this.ptr.get(LAYOUT__framebuffer, OFFSET__framebuffer);}
    public void framebuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__framebuffer, OFFSET__framebuffer, value);}
    public java.lang.foreign.MemorySegment $framebuffer() {return this.ptr.asSlice(OFFSET__framebuffer, LAYOUT__framebuffer);}

    public vulkan.VkRect2D renderArea() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET__renderArea, LAYOUT__renderArea));}
    public void renderArea(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.renderArea());}
    public void renderArea(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__renderArea, LAYOUT__renderArea.byteSize());}

    public int clearValueCount() {return this.ptr.get(LAYOUT__clearValueCount, OFFSET__clearValueCount);}
    public void clearValueCount(int value) {this.ptr.set(LAYOUT__clearValueCount, OFFSET__clearValueCount, value);}
    public java.lang.foreign.MemorySegment $clearValueCount() {return this.ptr.asSlice(OFFSET__clearValueCount, LAYOUT__clearValueCount);}

    public java.lang.foreign.MemorySegment pClearValues() {return this.ptr.get(LAYOUT__pClearValues, OFFSET__pClearValues);}
    public void pClearValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pClearValues, OFFSET__pClearValues, value);}
    public java.lang.foreign.MemorySegment $pClearValues() {return this.ptr.asSlice(OFFSET__pClearValues, LAYOUT__pClearValues);}
}
