package vulkan;

public record VkCommandBufferInheritanceRenderPassTransformInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transform = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transform = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__renderArea = vulkan.VkRect2D.gRecordLayout;
    public static final long OFFSET__renderArea = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__transform,
            LAYOUT__renderArea,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkCommandBufferInheritanceRenderPassTransformInfoQCOM");

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCommandBufferInheritanceRenderPassTransformInfoQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int transform() {return this.ptr.get(LAYOUT__transform, OFFSET__transform);}
    public void transform(int value) {this.ptr.set(LAYOUT__transform, OFFSET__transform, value);}
    public java.lang.foreign.MemorySegment $transform() {return this.ptr.asSlice(OFFSET__transform, LAYOUT__transform);}

    public vulkan.VkRect2D renderArea() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET__renderArea, LAYOUT__renderArea));}
    public void renderArea(java.util.function.Consumer<vulkan.VkRect2D> consumer) {consumer.accept(this.renderArea());}
    public void renderArea(vulkan.VkRect2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__renderArea, LAYOUT__renderArea.byteSize());}
}
