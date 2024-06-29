package vma;

public record VmaPoolCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryTypeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryTypeIndex = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 4;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__blockSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__blockSize = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minBlockCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__minBlockCount = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxBlockCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxBlockCount = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__priority = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__priority = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__minAllocationAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__minAllocationAlignment = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMemoryAllocateNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pMemoryAllocateNext = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__memoryTypeIndex,
            LAYOUT__flags,
            LAYOUT__blockSize,
            LAYOUT__minBlockCount,
            LAYOUT__maxBlockCount,
            LAYOUT__priority,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__minAllocationAlignment,
            LAYOUT__pMemoryAllocateNext
    ).withByteAlignment(8).withName("VmaPoolCreateInfo");

    public VmaPoolCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaPoolCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaPoolCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaPoolCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int memoryTypeIndex() {return this.ptr.get(LAYOUT__memoryTypeIndex, OFFSET__memoryTypeIndex);}
    public void memoryTypeIndex(int value) {this.ptr.set(LAYOUT__memoryTypeIndex, OFFSET__memoryTypeIndex, value);}
    public java.lang.foreign.MemorySegment $memoryTypeIndex() {return this.ptr.asSlice(OFFSET__memoryTypeIndex, LAYOUT__memoryTypeIndex);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public long blockSize() {return this.ptr.get(LAYOUT__blockSize, OFFSET__blockSize);}
    public void blockSize(long value) {this.ptr.set(LAYOUT__blockSize, OFFSET__blockSize, value);}
    public java.lang.foreign.MemorySegment $blockSize() {return this.ptr.asSlice(OFFSET__blockSize, LAYOUT__blockSize);}

    public long minBlockCount() {return this.ptr.get(LAYOUT__minBlockCount, OFFSET__minBlockCount);}
    public void minBlockCount(long value) {this.ptr.set(LAYOUT__minBlockCount, OFFSET__minBlockCount, value);}
    public java.lang.foreign.MemorySegment $minBlockCount() {return this.ptr.asSlice(OFFSET__minBlockCount, LAYOUT__minBlockCount);}

    public long maxBlockCount() {return this.ptr.get(LAYOUT__maxBlockCount, OFFSET__maxBlockCount);}
    public void maxBlockCount(long value) {this.ptr.set(LAYOUT__maxBlockCount, OFFSET__maxBlockCount, value);}
    public java.lang.foreign.MemorySegment $maxBlockCount() {return this.ptr.asSlice(OFFSET__maxBlockCount, LAYOUT__maxBlockCount);}

    public float priority() {return this.ptr.get(LAYOUT__priority, OFFSET__priority);}
    public void priority(float value) {this.ptr.set(LAYOUT__priority, OFFSET__priority, value);}
    public java.lang.foreign.MemorySegment $priority() {return this.ptr.asSlice(OFFSET__priority, LAYOUT__priority);}

    public long minAllocationAlignment() {return this.ptr.get(LAYOUT__minAllocationAlignment, OFFSET__minAllocationAlignment);}
    public void minAllocationAlignment(long value) {this.ptr.set(LAYOUT__minAllocationAlignment, OFFSET__minAllocationAlignment, value);}
    public java.lang.foreign.MemorySegment $minAllocationAlignment() {return this.ptr.asSlice(OFFSET__minAllocationAlignment, LAYOUT__minAllocationAlignment);}

    public java.lang.foreign.MemorySegment pMemoryAllocateNext() {return this.ptr.get(LAYOUT__pMemoryAllocateNext, OFFSET__pMemoryAllocateNext);}
    public void pMemoryAllocateNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMemoryAllocateNext, OFFSET__pMemoryAllocateNext, value);}
    public java.lang.foreign.MemorySegment $pMemoryAllocateNext() {return this.ptr.asSlice(OFFSET__pMemoryAllocateNext, LAYOUT__pMemoryAllocateNext);}
}
