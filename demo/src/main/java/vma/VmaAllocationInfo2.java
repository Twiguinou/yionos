package vma;

public record VmaAllocationInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__allocationInfo = vma.VmaAllocationInfo.gRecordLayout;
    public static final long OFFSET__allocationInfo = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__blockSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__blockSize = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dedicatedMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dedicatedMemory = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__allocationInfo,
            LAYOUT__blockSize,
            LAYOUT__dedicatedMemory,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VmaAllocationInfo2");

    public VmaAllocationInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaAllocationInfo2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaAllocationInfo2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaAllocationInfo2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vma.VmaAllocationInfo allocationInfo() {return new vma.VmaAllocationInfo(this.ptr.asSlice(OFFSET__allocationInfo, LAYOUT__allocationInfo));}
    public void allocationInfo(java.util.function.Consumer<vma.VmaAllocationInfo> consumer) {consumer.accept(this.allocationInfo());}
    public void allocationInfo(vma.VmaAllocationInfo value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__allocationInfo, LAYOUT__allocationInfo.byteSize());}

    public long blockSize() {return this.ptr.get(LAYOUT__blockSize, OFFSET__blockSize);}
    public void blockSize(long value) {this.ptr.set(LAYOUT__blockSize, OFFSET__blockSize, value);}
    public java.lang.foreign.MemorySegment $blockSize() {return this.ptr.asSlice(OFFSET__blockSize, LAYOUT__blockSize);}

    public int dedicatedMemory() {return this.ptr.get(LAYOUT__dedicatedMemory, OFFSET__dedicatedMemory);}
    public void dedicatedMemory(int value) {this.ptr.set(LAYOUT__dedicatedMemory, OFFSET__dedicatedMemory, value);}
    public java.lang.foreign.MemorySegment $dedicatedMemory() {return this.ptr.asSlice(OFFSET__dedicatedMemory, LAYOUT__dedicatedMemory);}
}
