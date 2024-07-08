package vulkan;

public record VkComputePipelineCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__stage = vulkan.VkPipelineShaderStageCreateInfo.gRecordLayout.withName("stage");
    public static final long OFFSET__stage = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("layout");
    public static final long OFFSET__layout = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__basePipelineHandle = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("basePipelineHandle");
    public static final long OFFSET__basePipelineHandle = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__basePipelineIndex = java.lang.foreign.ValueLayout.JAVA_INT.withName("basePipelineIndex");
    public static final long OFFSET__basePipelineIndex = 88;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__stage,
            LAYOUT__layout,
            LAYOUT__basePipelineHandle,
            LAYOUT__basePipelineIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkComputePipelineCreateInfo");

    public VkComputePipelineCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkComputePipelineCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkComputePipelineCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkComputePipelineCreateInfo value)
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

    public vulkan.VkPipelineShaderStageCreateInfo stage() {return new vulkan.VkPipelineShaderStageCreateInfo(this.ptr.asSlice(OFFSET__stage, LAYOUT__stage));}
    public void stage(java.util.function.Consumer<vulkan.VkPipelineShaderStageCreateInfo> consumer) {consumer.accept(this.stage());}
    public void stage(vulkan.VkPipelineShaderStageCreateInfo value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__stage, LAYOUT__stage.byteSize());}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public java.lang.foreign.MemorySegment basePipelineHandle() {return this.ptr.get(LAYOUT__basePipelineHandle, OFFSET__basePipelineHandle);}
    public void basePipelineHandle(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__basePipelineHandle, OFFSET__basePipelineHandle, value);}
    public java.lang.foreign.MemorySegment $basePipelineHandle() {return this.ptr.asSlice(OFFSET__basePipelineHandle, LAYOUT__basePipelineHandle);}

    public int basePipelineIndex() {return this.ptr.get(LAYOUT__basePipelineIndex, OFFSET__basePipelineIndex);}
    public void basePipelineIndex(int value) {this.ptr.set(LAYOUT__basePipelineIndex, OFFSET__basePipelineIndex, value);}
    public java.lang.foreign.MemorySegment $basePipelineIndex() {return this.ptr.asSlice(OFFSET__basePipelineIndex, LAYOUT__basePipelineIndex);}
}
