package vulkan;

public record VkMemoryAllocateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__allocationSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__allocationSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryTypeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryTypeIndex = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__allocationSize,
            LAYOUT__memoryTypeIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkMemoryAllocateInfo");

    public VkMemoryAllocateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMemoryAllocateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMemoryAllocateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMemoryAllocateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long allocationSize() {return this.ptr.get(LAYOUT__allocationSize, OFFSET__allocationSize);}
    public void allocationSize(long value) {this.ptr.set(LAYOUT__allocationSize, OFFSET__allocationSize, value);}
    public java.lang.foreign.MemorySegment $allocationSize() {return this.ptr.asSlice(OFFSET__allocationSize, LAYOUT__allocationSize);}

    public int memoryTypeIndex() {return this.ptr.get(LAYOUT__memoryTypeIndex, OFFSET__memoryTypeIndex);}
    public void memoryTypeIndex(int value) {this.ptr.set(LAYOUT__memoryTypeIndex, OFFSET__memoryTypeIndex, value);}
    public java.lang.foreign.MemorySegment $memoryTypeIndex() {return this.ptr.asSlice(OFFSET__memoryTypeIndex, LAYOUT__memoryTypeIndex);}
}
