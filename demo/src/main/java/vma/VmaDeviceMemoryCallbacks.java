package vma;

public record VmaDeviceMemoryCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnAllocate = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnAllocate");
    public static final long OFFSET__pfnAllocate = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnFree = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnFree");
    public static final long OFFSET__pfnFree = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUserData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pUserData");
    public static final long OFFSET__pUserData = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__pfnAllocate,
            LAYOUT__pfnFree,
            LAYOUT__pUserData
    ).withByteAlignment(8).withName("VmaDeviceMemoryCallbacks");

    public VmaDeviceMemoryCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaDeviceMemoryCallbacks getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaDeviceMemoryCallbacks(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaDeviceMemoryCallbacks value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment pfnAllocate() {return this.ptr.get(LAYOUT__pfnAllocate, OFFSET__pfnAllocate);}
    public void pfnAllocate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnAllocate, OFFSET__pfnAllocate, value);}
    public java.lang.foreign.MemorySegment $pfnAllocate() {return this.ptr.asSlice(OFFSET__pfnAllocate, LAYOUT__pfnAllocate);}

    public java.lang.foreign.MemorySegment pfnFree() {return this.ptr.get(LAYOUT__pfnFree, OFFSET__pfnFree);}
    public void pfnFree(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnFree, OFFSET__pfnFree, value);}
    public java.lang.foreign.MemorySegment $pfnFree() {return this.ptr.asSlice(OFFSET__pfnFree, LAYOUT__pfnFree);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT__pUserData, OFFSET__pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUserData, OFFSET__pUserData, value);}
    public java.lang.foreign.MemorySegment $pUserData() {return this.ptr.asSlice(OFFSET__pUserData, LAYOUT__pUserData);}
}
