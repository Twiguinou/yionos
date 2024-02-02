package vma;

public record VmaDeviceMemoryCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnAllocate = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnAllocate = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnFree = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnFree = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$pfnAllocate,
            LAYOUT$pfnFree,
            LAYOUT$pUserData
    ).withName("VmaDeviceMemoryCallbacks");

    public VmaDeviceMemoryCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaDeviceMemoryCallbacks getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaDeviceMemoryCallbacks(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment pfnAllocate() {return this.ptr.get(LAYOUT$pfnAllocate, OFFSET$pfnAllocate);}
    public void pfnAllocate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnAllocate, OFFSET$pfnAllocate, value);}
    public java.lang.foreign.MemorySegment pfnAllocate_ptr() {return this.ptr.asSlice(OFFSET$pfnAllocate, LAYOUT$pfnAllocate);}

    public java.lang.foreign.MemorySegment pfnFree() {return this.ptr.get(LAYOUT$pfnFree, OFFSET$pfnFree);}
    public void pfnFree(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnFree, OFFSET$pfnFree, value);}
    public java.lang.foreign.MemorySegment pfnFree_ptr() {return this.ptr.asSlice(OFFSET$pfnFree, LAYOUT$pfnFree);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}
}
