package vulkan;

public record VkPipelineVertexInputDivisorStateCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexBindingDivisorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount");
    public static final long OFFSET__vertexBindingDivisorCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVertexBindingDivisors = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pVertexBindingDivisors");
    public static final long OFFSET__pVertexBindingDivisors = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__vertexBindingDivisorCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pVertexBindingDivisors
    ).withByteAlignment(8).withName("VkPipelineVertexInputDivisorStateCreateInfoKHR");

    public VkPipelineVertexInputDivisorStateCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineVertexInputDivisorStateCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineVertexInputDivisorStateCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int vertexBindingDivisorCount() {return this.ptr.get(LAYOUT__vertexBindingDivisorCount, OFFSET__vertexBindingDivisorCount);}
    public void vertexBindingDivisorCount(int value) {this.ptr.set(LAYOUT__vertexBindingDivisorCount, OFFSET__vertexBindingDivisorCount, value);}
    public java.lang.foreign.MemorySegment $vertexBindingDivisorCount() {return this.ptr.asSlice(OFFSET__vertexBindingDivisorCount, LAYOUT__vertexBindingDivisorCount);}

    public java.lang.foreign.MemorySegment pVertexBindingDivisors() {return this.ptr.get(LAYOUT__pVertexBindingDivisors, OFFSET__pVertexBindingDivisors);}
    public void pVertexBindingDivisors(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVertexBindingDivisors, OFFSET__pVertexBindingDivisors, value);}
    public java.lang.foreign.MemorySegment $pVertexBindingDivisors() {return this.ptr.asSlice(OFFSET__pVertexBindingDivisors, LAYOUT__pVertexBindingDivisors);}
}
