package vma;

public record VkAllocationCallbacks(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__pUserData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pUserData");
    public static final long OFFSET__pUserData = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnAllocation = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnAllocation");
    public static final long OFFSET__pfnAllocation = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnReallocation = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnReallocation");
    public static final long OFFSET__pfnReallocation = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnFree = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnFree");
    public static final long OFFSET__pfnFree = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnInternalAllocation = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnInternalAllocation");
    public static final long OFFSET__pfnInternalAllocation = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnInternalFree = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnInternalFree");
    public static final long OFFSET__pfnInternalFree = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__pUserData,
            LAYOUT__pfnAllocation,
            LAYOUT__pfnReallocation,
            LAYOUT__pfnFree,
            LAYOUT__pfnInternalAllocation,
            LAYOUT__pfnInternalFree
    ).withByteAlignment(8).withName("VkAllocationCallbacks");

    public VkAllocationCallbacks(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAllocationCallbacks getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAllocationCallbacks(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAllocationCallbacks value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT__pUserData, OFFSET__pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUserData, OFFSET__pUserData, value);}
    public java.lang.foreign.MemorySegment $pUserData() {return this.ptr.asSlice(OFFSET__pUserData, LAYOUT__pUserData);}

    public java.lang.foreign.MemorySegment pfnAllocation() {return this.ptr.get(LAYOUT__pfnAllocation, OFFSET__pfnAllocation);}
    public void pfnAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnAllocation, OFFSET__pfnAllocation, value);}
    public java.lang.foreign.MemorySegment $pfnAllocation() {return this.ptr.asSlice(OFFSET__pfnAllocation, LAYOUT__pfnAllocation);}

    public java.lang.foreign.MemorySegment pfnReallocation() {return this.ptr.get(LAYOUT__pfnReallocation, OFFSET__pfnReallocation);}
    public void pfnReallocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnReallocation, OFFSET__pfnReallocation, value);}
    public java.lang.foreign.MemorySegment $pfnReallocation() {return this.ptr.asSlice(OFFSET__pfnReallocation, LAYOUT__pfnReallocation);}

    public java.lang.foreign.MemorySegment pfnFree() {return this.ptr.get(LAYOUT__pfnFree, OFFSET__pfnFree);}
    public void pfnFree(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnFree, OFFSET__pfnFree, value);}
    public java.lang.foreign.MemorySegment $pfnFree() {return this.ptr.asSlice(OFFSET__pfnFree, LAYOUT__pfnFree);}

    public java.lang.foreign.MemorySegment pfnInternalAllocation() {return this.ptr.get(LAYOUT__pfnInternalAllocation, OFFSET__pfnInternalAllocation);}
    public void pfnInternalAllocation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnInternalAllocation, OFFSET__pfnInternalAllocation, value);}
    public java.lang.foreign.MemorySegment $pfnInternalAllocation() {return this.ptr.asSlice(OFFSET__pfnInternalAllocation, LAYOUT__pfnInternalAllocation);}

    public java.lang.foreign.MemorySegment pfnInternalFree() {return this.ptr.get(LAYOUT__pfnInternalFree, OFFSET__pfnInternalFree);}
    public void pfnInternalFree(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnInternalFree, OFFSET__pfnInternalFree, value);}
    public java.lang.foreign.MemorySegment $pfnInternalFree() {return this.ptr.asSlice(OFFSET__pfnInternalFree, LAYOUT__pfnInternalFree);}
}
