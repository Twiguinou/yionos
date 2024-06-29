package vulkan;

public record VkQueryPoolCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queryType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queryType = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queryCount = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineStatistics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pipelineStatistics = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__queryType,
            LAYOUT__queryCount,
            LAYOUT__pipelineStatistics
    ).withByteAlignment(8).withName("VkQueryPoolCreateInfo");

    public VkQueryPoolCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkQueryPoolCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkQueryPoolCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkQueryPoolCreateInfo value)
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

    public int queryType() {return this.ptr.get(LAYOUT__queryType, OFFSET__queryType);}
    public void queryType(int value) {this.ptr.set(LAYOUT__queryType, OFFSET__queryType, value);}
    public java.lang.foreign.MemorySegment $queryType() {return this.ptr.asSlice(OFFSET__queryType, LAYOUT__queryType);}

    public int queryCount() {return this.ptr.get(LAYOUT__queryCount, OFFSET__queryCount);}
    public void queryCount(int value) {this.ptr.set(LAYOUT__queryCount, OFFSET__queryCount, value);}
    public java.lang.foreign.MemorySegment $queryCount() {return this.ptr.asSlice(OFFSET__queryCount, LAYOUT__queryCount);}

    public int pipelineStatistics() {return this.ptr.get(LAYOUT__pipelineStatistics, OFFSET__pipelineStatistics);}
    public void pipelineStatistics(int value) {this.ptr.set(LAYOUT__pipelineStatistics, OFFSET__pipelineStatistics, value);}
    public java.lang.foreign.MemorySegment $pipelineStatistics() {return this.ptr.asSlice(OFFSET__pipelineStatistics, LAYOUT__pipelineStatistics);}
}
