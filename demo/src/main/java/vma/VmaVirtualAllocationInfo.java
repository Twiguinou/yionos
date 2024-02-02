package vma;

public record VmaVirtualAllocationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$offset,
            LAYOUT$size,
            LAYOUT$pUserData
    ).withName("VmaVirtualAllocationInfo");

    public VmaVirtualAllocationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaVirtualAllocationInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaVirtualAllocationInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}
}
