package vulkan;

public record VkPipelineDepthStencilStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthTestEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthTestEnable");
    public static final long OFFSET__depthTestEnable = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthWriteEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthWriteEnable");
    public static final long OFFSET__depthWriteEnable = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthCompareOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthCompareOp");
    public static final long OFFSET__depthCompareOp = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBoundsTestEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthBoundsTestEnable");
    public static final long OFFSET__depthBoundsTestEnable = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stencilTestEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("stencilTestEnable");
    public static final long OFFSET__stencilTestEnable = 36;
    public static final java.lang.foreign.StructLayout LAYOUT__front = vulkan.VkStencilOpState.gRecordLayout.withName("front");
    public static final long OFFSET__front = 40;
    public static final java.lang.foreign.StructLayout LAYOUT__back = vulkan.VkStencilOpState.gRecordLayout.withName("back");
    public static final long OFFSET__back = 68;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__minDepthBounds = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("minDepthBounds");
    public static final long OFFSET__minDepthBounds = 96;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__maxDepthBounds = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("maxDepthBounds");
    public static final long OFFSET__maxDepthBounds = 100;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__depthTestEnable,
            LAYOUT__depthWriteEnable,
            LAYOUT__depthCompareOp,
            LAYOUT__depthBoundsTestEnable,
            LAYOUT__stencilTestEnable,
            LAYOUT__front,
            LAYOUT__back,
            LAYOUT__minDepthBounds,
            LAYOUT__maxDepthBounds
    ).withByteAlignment(8).withName("VkPipelineDepthStencilStateCreateInfo");

    public VkPipelineDepthStencilStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineDepthStencilStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineDepthStencilStateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineDepthStencilStateCreateInfo value)
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

    public int depthTestEnable() {return this.ptr.get(LAYOUT__depthTestEnable, OFFSET__depthTestEnable);}
    public void depthTestEnable(int value) {this.ptr.set(LAYOUT__depthTestEnable, OFFSET__depthTestEnable, value);}
    public java.lang.foreign.MemorySegment $depthTestEnable() {return this.ptr.asSlice(OFFSET__depthTestEnable, LAYOUT__depthTestEnable);}

    public int depthWriteEnable() {return this.ptr.get(LAYOUT__depthWriteEnable, OFFSET__depthWriteEnable);}
    public void depthWriteEnable(int value) {this.ptr.set(LAYOUT__depthWriteEnable, OFFSET__depthWriteEnable, value);}
    public java.lang.foreign.MemorySegment $depthWriteEnable() {return this.ptr.asSlice(OFFSET__depthWriteEnable, LAYOUT__depthWriteEnable);}

    public int depthCompareOp() {return this.ptr.get(LAYOUT__depthCompareOp, OFFSET__depthCompareOp);}
    public void depthCompareOp(int value) {this.ptr.set(LAYOUT__depthCompareOp, OFFSET__depthCompareOp, value);}
    public java.lang.foreign.MemorySegment $depthCompareOp() {return this.ptr.asSlice(OFFSET__depthCompareOp, LAYOUT__depthCompareOp);}

    public int depthBoundsTestEnable() {return this.ptr.get(LAYOUT__depthBoundsTestEnable, OFFSET__depthBoundsTestEnable);}
    public void depthBoundsTestEnable(int value) {this.ptr.set(LAYOUT__depthBoundsTestEnable, OFFSET__depthBoundsTestEnable, value);}
    public java.lang.foreign.MemorySegment $depthBoundsTestEnable() {return this.ptr.asSlice(OFFSET__depthBoundsTestEnable, LAYOUT__depthBoundsTestEnable);}

    public int stencilTestEnable() {return this.ptr.get(LAYOUT__stencilTestEnable, OFFSET__stencilTestEnable);}
    public void stencilTestEnable(int value) {this.ptr.set(LAYOUT__stencilTestEnable, OFFSET__stencilTestEnable, value);}
    public java.lang.foreign.MemorySegment $stencilTestEnable() {return this.ptr.asSlice(OFFSET__stencilTestEnable, LAYOUT__stencilTestEnable);}

    public vulkan.VkStencilOpState front() {return new vulkan.VkStencilOpState(this.ptr.asSlice(OFFSET__front, LAYOUT__front));}
    public void front(java.util.function.Consumer<vulkan.VkStencilOpState> consumer) {consumer.accept(this.front());}
    public void front(vulkan.VkStencilOpState value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__front, LAYOUT__front.byteSize());}

    public vulkan.VkStencilOpState back() {return new vulkan.VkStencilOpState(this.ptr.asSlice(OFFSET__back, LAYOUT__back));}
    public void back(java.util.function.Consumer<vulkan.VkStencilOpState> consumer) {consumer.accept(this.back());}
    public void back(vulkan.VkStencilOpState value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__back, LAYOUT__back.byteSize());}

    public float minDepthBounds() {return this.ptr.get(LAYOUT__minDepthBounds, OFFSET__minDepthBounds);}
    public void minDepthBounds(float value) {this.ptr.set(LAYOUT__minDepthBounds, OFFSET__minDepthBounds, value);}
    public java.lang.foreign.MemorySegment $minDepthBounds() {return this.ptr.asSlice(OFFSET__minDepthBounds, LAYOUT__minDepthBounds);}

    public float maxDepthBounds() {return this.ptr.get(LAYOUT__maxDepthBounds, OFFSET__maxDepthBounds);}
    public void maxDepthBounds(float value) {this.ptr.set(LAYOUT__maxDepthBounds, OFFSET__maxDepthBounds, value);}
    public java.lang.foreign.MemorySegment $maxDepthBounds() {return this.ptr.asSlice(OFFSET__maxDepthBounds, LAYOUT__maxDepthBounds);}
}
