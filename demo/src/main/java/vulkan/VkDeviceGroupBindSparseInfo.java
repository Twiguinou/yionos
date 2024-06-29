package vulkan;

public record VkDeviceGroupBindSparseInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__resourceDeviceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__resourceDeviceIndex = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryDeviceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryDeviceIndex = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__resourceDeviceIndex,
            LAYOUT__memoryDeviceIndex
    ).withByteAlignment(8).withName("VkDeviceGroupBindSparseInfo");

    public VkDeviceGroupBindSparseInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceGroupBindSparseInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceGroupBindSparseInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceGroupBindSparseInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int resourceDeviceIndex() {return this.ptr.get(LAYOUT__resourceDeviceIndex, OFFSET__resourceDeviceIndex);}
    public void resourceDeviceIndex(int value) {this.ptr.set(LAYOUT__resourceDeviceIndex, OFFSET__resourceDeviceIndex, value);}
    public java.lang.foreign.MemorySegment $resourceDeviceIndex() {return this.ptr.asSlice(OFFSET__resourceDeviceIndex, LAYOUT__resourceDeviceIndex);}

    public int memoryDeviceIndex() {return this.ptr.get(LAYOUT__memoryDeviceIndex, OFFSET__memoryDeviceIndex);}
    public void memoryDeviceIndex(int value) {this.ptr.set(LAYOUT__memoryDeviceIndex, OFFSET__memoryDeviceIndex, value);}
    public java.lang.foreign.MemorySegment $memoryDeviceIndex() {return this.ptr.asSlice(OFFSET__memoryDeviceIndex, LAYOUT__memoryDeviceIndex);}
}
