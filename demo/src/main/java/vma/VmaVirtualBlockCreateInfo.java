package vma;

public record VmaVirtualBlockCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAllocationCallbacks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAllocationCallbacks = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$size,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pAllocationCallbacks
    ).withName("VmaVirtualBlockCreateInfo");

    public VmaVirtualBlockCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaVirtualBlockCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaVirtualBlockCreateInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment pAllocationCallbacks() {return this.ptr.get(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks);}
    public void pAllocationCallbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks, value);}
    public java.lang.foreign.MemorySegment pAllocationCallbacks_ptr() {return this.ptr.asSlice(OFFSET$pAllocationCallbacks, LAYOUT$pAllocationCallbacks);}
}
