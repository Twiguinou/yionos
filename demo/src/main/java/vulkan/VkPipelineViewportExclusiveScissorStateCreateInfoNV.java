package vulkan;

public record VkPipelineViewportExclusiveScissorStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__exclusiveScissorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("exclusiveScissorCount");
    public static final long OFFSET__exclusiveScissorCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pExclusiveScissors = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pExclusiveScissors");
    public static final long OFFSET__pExclusiveScissors = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__exclusiveScissorCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pExclusiveScissors
    ).withByteAlignment(8).withName("VkPipelineViewportExclusiveScissorStateCreateInfoNV");

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineViewportExclusiveScissorStateCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int exclusiveScissorCount() {return this.ptr.get(LAYOUT__exclusiveScissorCount, OFFSET__exclusiveScissorCount);}
    public void exclusiveScissorCount(int value) {this.ptr.set(LAYOUT__exclusiveScissorCount, OFFSET__exclusiveScissorCount, value);}
    public java.lang.foreign.MemorySegment $exclusiveScissorCount() {return this.ptr.asSlice(OFFSET__exclusiveScissorCount, LAYOUT__exclusiveScissorCount);}

    public java.lang.foreign.MemorySegment pExclusiveScissors() {return this.ptr.get(LAYOUT__pExclusiveScissors, OFFSET__pExclusiveScissors);}
    public void pExclusiveScissors(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pExclusiveScissors, OFFSET__pExclusiveScissors, value);}
    public java.lang.foreign.MemorySegment $pExclusiveScissors() {return this.ptr.asSlice(OFFSET__pExclusiveScissors, LAYOUT__pExclusiveScissors);}
}
