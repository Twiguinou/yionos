package vulkan;

public record VkPipelineVertexInputStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexBindingDescriptionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vertexBindingDescriptionCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVertexBindingDescriptions = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pVertexBindingDescriptions = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexAttributeDescriptionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vertexAttributeDescriptionCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVertexAttributeDescriptions = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pVertexAttributeDescriptions = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__vertexBindingDescriptionCount,
            LAYOUT__pVertexBindingDescriptions,
            LAYOUT__vertexAttributeDescriptionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pVertexAttributeDescriptions
    ).withByteAlignment(8).withName("VkPipelineVertexInputStateCreateInfo");

    public VkPipelineVertexInputStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineVertexInputStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineVertexInputStateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineVertexInputStateCreateInfo value)
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

    public int vertexBindingDescriptionCount() {return this.ptr.get(LAYOUT__vertexBindingDescriptionCount, OFFSET__vertexBindingDescriptionCount);}
    public void vertexBindingDescriptionCount(int value) {this.ptr.set(LAYOUT__vertexBindingDescriptionCount, OFFSET__vertexBindingDescriptionCount, value);}
    public java.lang.foreign.MemorySegment $vertexBindingDescriptionCount() {return this.ptr.asSlice(OFFSET__vertexBindingDescriptionCount, LAYOUT__vertexBindingDescriptionCount);}

    public java.lang.foreign.MemorySegment pVertexBindingDescriptions() {return this.ptr.get(LAYOUT__pVertexBindingDescriptions, OFFSET__pVertexBindingDescriptions);}
    public void pVertexBindingDescriptions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVertexBindingDescriptions, OFFSET__pVertexBindingDescriptions, value);}
    public java.lang.foreign.MemorySegment $pVertexBindingDescriptions() {return this.ptr.asSlice(OFFSET__pVertexBindingDescriptions, LAYOUT__pVertexBindingDescriptions);}

    public int vertexAttributeDescriptionCount() {return this.ptr.get(LAYOUT__vertexAttributeDescriptionCount, OFFSET__vertexAttributeDescriptionCount);}
    public void vertexAttributeDescriptionCount(int value) {this.ptr.set(LAYOUT__vertexAttributeDescriptionCount, OFFSET__vertexAttributeDescriptionCount, value);}
    public java.lang.foreign.MemorySegment $vertexAttributeDescriptionCount() {return this.ptr.asSlice(OFFSET__vertexAttributeDescriptionCount, LAYOUT__vertexAttributeDescriptionCount);}

    public java.lang.foreign.MemorySegment pVertexAttributeDescriptions() {return this.ptr.get(LAYOUT__pVertexAttributeDescriptions, OFFSET__pVertexAttributeDescriptions);}
    public void pVertexAttributeDescriptions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVertexAttributeDescriptions, OFFSET__pVertexAttributeDescriptions, value);}
    public java.lang.foreign.MemorySegment $pVertexAttributeDescriptions() {return this.ptr.asSlice(OFFSET__pVertexAttributeDescriptions, LAYOUT__pVertexAttributeDescriptions);}
}
