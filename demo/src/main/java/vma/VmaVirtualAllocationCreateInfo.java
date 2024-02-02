package vma;

public record VmaVirtualAllocationCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$alignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$alignment = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$size,
            LAYOUT$alignment,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pUserData
    ).withName("VmaVirtualAllocationCreateInfo");

    public VmaVirtualAllocationCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaVirtualAllocationCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaVirtualAllocationCreateInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public long alignment() {return this.ptr.get(LAYOUT$alignment, OFFSET$alignment);}
    public void alignment(long value) {this.ptr.set(LAYOUT$alignment, OFFSET$alignment, value);}
    public java.lang.foreign.MemorySegment alignment_ptr() {return this.ptr.asSlice(OFFSET$alignment, LAYOUT$alignment);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}
}
