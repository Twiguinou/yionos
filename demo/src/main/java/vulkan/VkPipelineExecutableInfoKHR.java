package vulkan;

public record VkPipelineExecutableInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pipeline = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pipeline = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__executableIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__executableIndex = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pipeline,
            LAYOUT__executableIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPipelineExecutableInfoKHR");

    public VkPipelineExecutableInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineExecutableInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineExecutableInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineExecutableInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pipeline() {return this.ptr.get(LAYOUT__pipeline, OFFSET__pipeline);}
    public void pipeline(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pipeline, OFFSET__pipeline, value);}
    public java.lang.foreign.MemorySegment $pipeline() {return this.ptr.asSlice(OFFSET__pipeline, LAYOUT__pipeline);}

    public int executableIndex() {return this.ptr.get(LAYOUT__executableIndex, OFFSET__executableIndex);}
    public void executableIndex(int value) {this.ptr.set(LAYOUT__executableIndex, OFFSET__executableIndex, value);}
    public java.lang.foreign.MemorySegment $executableIndex() {return this.ptr.asSlice(OFFSET__executableIndex, LAYOUT__executableIndex);}
}
