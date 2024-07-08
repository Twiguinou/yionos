package vma;

public record VmaVirtualBlockCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAllocationCallbacks = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pAllocationCallbacks");
    public static final long OFFSET__pAllocationCallbacks = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__size,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pAllocationCallbacks
    ).withByteAlignment(8).withName("VmaVirtualBlockCreateInfo");

    public VmaVirtualBlockCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaVirtualBlockCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaVirtualBlockCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaVirtualBlockCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public java.lang.foreign.MemorySegment pAllocationCallbacks() {return this.ptr.get(LAYOUT__pAllocationCallbacks, OFFSET__pAllocationCallbacks);}
    public void pAllocationCallbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAllocationCallbacks, OFFSET__pAllocationCallbacks, value);}
    public java.lang.foreign.MemorySegment $pAllocationCallbacks() {return this.ptr.asSlice(OFFSET__pAllocationCallbacks, LAYOUT__pAllocationCallbacks);}
}
