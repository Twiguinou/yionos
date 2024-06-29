package vulkan;

public record VkMemoryDedicatedRequirements(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__prefersDedicatedAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__prefersDedicatedAllocation = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__requiresDedicatedAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__requiresDedicatedAllocation = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__prefersDedicatedAllocation,
            LAYOUT__requiresDedicatedAllocation
    ).withByteAlignment(8).withName("VkMemoryDedicatedRequirements");

    public VkMemoryDedicatedRequirements(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMemoryDedicatedRequirements getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMemoryDedicatedRequirements(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMemoryDedicatedRequirements value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int prefersDedicatedAllocation() {return this.ptr.get(LAYOUT__prefersDedicatedAllocation, OFFSET__prefersDedicatedAllocation);}
    public void prefersDedicatedAllocation(int value) {this.ptr.set(LAYOUT__prefersDedicatedAllocation, OFFSET__prefersDedicatedAllocation, value);}
    public java.lang.foreign.MemorySegment $prefersDedicatedAllocation() {return this.ptr.asSlice(OFFSET__prefersDedicatedAllocation, LAYOUT__prefersDedicatedAllocation);}

    public int requiresDedicatedAllocation() {return this.ptr.get(LAYOUT__requiresDedicatedAllocation, OFFSET__requiresDedicatedAllocation);}
    public void requiresDedicatedAllocation(int value) {this.ptr.set(LAYOUT__requiresDedicatedAllocation, OFFSET__requiresDedicatedAllocation, value);}
    public java.lang.foreign.MemorySegment $requiresDedicatedAllocation() {return this.ptr.asSlice(OFFSET__requiresDedicatedAllocation, LAYOUT__requiresDedicatedAllocation);}
}
