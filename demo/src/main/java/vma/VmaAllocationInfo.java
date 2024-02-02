package vma;

public record VmaAllocationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$deviceMemory = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$deviceMemory = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMappedData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMappedData = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pName = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$memoryType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$deviceMemory,
            LAYOUT$offset,
            LAYOUT$size,
            LAYOUT$pMappedData,
            LAYOUT$pUserData,
            LAYOUT$pName
    ).withName("VmaAllocationInfo");

    public VmaAllocationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaAllocationInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaAllocationInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int memoryType() {return this.ptr.get(LAYOUT$memoryType, OFFSET$memoryType);}
    public void memoryType(int value) {this.ptr.set(LAYOUT$memoryType, OFFSET$memoryType, value);}
    public java.lang.foreign.MemorySegment memoryType_ptr() {return this.ptr.asSlice(OFFSET$memoryType, LAYOUT$memoryType);}

    public java.lang.foreign.MemorySegment deviceMemory() {return this.ptr.get(LAYOUT$deviceMemory, OFFSET$deviceMemory);}
    public void deviceMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$deviceMemory, OFFSET$deviceMemory, value);}
    public java.lang.foreign.MemorySegment deviceMemory_ptr() {return this.ptr.asSlice(OFFSET$deviceMemory, LAYOUT$deviceMemory);}

    public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment pMappedData() {return this.ptr.get(LAYOUT$pMappedData, OFFSET$pMappedData);}
    public void pMappedData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMappedData, OFFSET$pMappedData, value);}
    public java.lang.foreign.MemorySegment pMappedData_ptr() {return this.ptr.asSlice(OFFSET$pMappedData, LAYOUT$pMappedData);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}

    public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT$pName, OFFSET$pName);}
    public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pName, OFFSET$pName, value);}
    public java.lang.foreign.MemorySegment pName_ptr() {return this.ptr.asSlice(OFFSET$pName, LAYOUT$pName);}
}
