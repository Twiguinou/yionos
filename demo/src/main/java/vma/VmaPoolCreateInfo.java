package vma;

public record VmaPoolCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryTypeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryTypeIndex = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 4L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$blockSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$blockSize = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minBlockCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minBlockCount = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxBlockCount = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxBlockCount = 24L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$priority = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$priority = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minAllocationAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minAllocationAlignment = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMemoryAllocateNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMemoryAllocateNext = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$memoryTypeIndex,
            LAYOUT$flags,
            LAYOUT$blockSize,
            LAYOUT$minBlockCount,
            LAYOUT$maxBlockCount,
            LAYOUT$priority,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$minAllocationAlignment,
            LAYOUT$pMemoryAllocateNext
    ).withName("VmaPoolCreateInfo");

    public VmaPoolCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaPoolCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaPoolCreateInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int memoryTypeIndex() {return this.ptr.get(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex);}
    public void memoryTypeIndex(int value) {this.ptr.set(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex, value);}
    public java.lang.foreign.MemorySegment memoryTypeIndex_ptr() {return this.ptr.asSlice(OFFSET$memoryTypeIndex, LAYOUT$memoryTypeIndex);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public long blockSize() {return this.ptr.get(LAYOUT$blockSize, OFFSET$blockSize);}
    public void blockSize(long value) {this.ptr.set(LAYOUT$blockSize, OFFSET$blockSize, value);}
    public java.lang.foreign.MemorySegment blockSize_ptr() {return this.ptr.asSlice(OFFSET$blockSize, LAYOUT$blockSize);}

    public long minBlockCount() {return this.ptr.get(LAYOUT$minBlockCount, OFFSET$minBlockCount);}
    public void minBlockCount(long value) {this.ptr.set(LAYOUT$minBlockCount, OFFSET$minBlockCount, value);}
    public java.lang.foreign.MemorySegment minBlockCount_ptr() {return this.ptr.asSlice(OFFSET$minBlockCount, LAYOUT$minBlockCount);}

    public long maxBlockCount() {return this.ptr.get(LAYOUT$maxBlockCount, OFFSET$maxBlockCount);}
    public void maxBlockCount(long value) {this.ptr.set(LAYOUT$maxBlockCount, OFFSET$maxBlockCount, value);}
    public java.lang.foreign.MemorySegment maxBlockCount_ptr() {return this.ptr.asSlice(OFFSET$maxBlockCount, LAYOUT$maxBlockCount);}

    public float priority() {return this.ptr.get(LAYOUT$priority, OFFSET$priority);}
    public void priority(float value) {this.ptr.set(LAYOUT$priority, OFFSET$priority, value);}
    public java.lang.foreign.MemorySegment priority_ptr() {return this.ptr.asSlice(OFFSET$priority, LAYOUT$priority);}

    public long minAllocationAlignment() {return this.ptr.get(LAYOUT$minAllocationAlignment, OFFSET$minAllocationAlignment);}
    public void minAllocationAlignment(long value) {this.ptr.set(LAYOUT$minAllocationAlignment, OFFSET$minAllocationAlignment, value);}
    public java.lang.foreign.MemorySegment minAllocationAlignment_ptr() {return this.ptr.asSlice(OFFSET$minAllocationAlignment, LAYOUT$minAllocationAlignment);}

    public java.lang.foreign.MemorySegment pMemoryAllocateNext() {return this.ptr.get(LAYOUT$pMemoryAllocateNext, OFFSET$pMemoryAllocateNext);}
    public void pMemoryAllocateNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMemoryAllocateNext, OFFSET$pMemoryAllocateNext, value);}
    public java.lang.foreign.MemorySegment pMemoryAllocateNext_ptr() {return this.ptr.asSlice(OFFSET$pMemoryAllocateNext, LAYOUT$pMemoryAllocateNext);}
}
