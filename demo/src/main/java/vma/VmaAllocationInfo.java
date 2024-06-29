package vma;

public record VmaAllocationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__deviceMemory = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__deviceMemory = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__offset = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__size = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMappedData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pMappedData = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUserData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pUserData = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pName = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__memoryType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__deviceMemory,
            LAYOUT__offset,
            LAYOUT__size,
            LAYOUT__pMappedData,
            LAYOUT__pUserData,
            LAYOUT__pName
    ).withByteAlignment(8).withName("VmaAllocationInfo");

    public VmaAllocationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaAllocationInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaAllocationInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaAllocationInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int memoryType() {return this.ptr.get(LAYOUT__memoryType, OFFSET__memoryType);}
    public void memoryType(int value) {this.ptr.set(LAYOUT__memoryType, OFFSET__memoryType, value);}
    public java.lang.foreign.MemorySegment $memoryType() {return this.ptr.asSlice(OFFSET__memoryType, LAYOUT__memoryType);}

    public java.lang.foreign.MemorySegment deviceMemory() {return this.ptr.get(LAYOUT__deviceMemory, OFFSET__deviceMemory);}
    public void deviceMemory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__deviceMemory, OFFSET__deviceMemory, value);}
    public java.lang.foreign.MemorySegment $deviceMemory() {return this.ptr.asSlice(OFFSET__deviceMemory, LAYOUT__deviceMemory);}

    public long offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public java.lang.foreign.MemorySegment pMappedData() {return this.ptr.get(LAYOUT__pMappedData, OFFSET__pMappedData);}
    public void pMappedData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMappedData, OFFSET__pMappedData, value);}
    public java.lang.foreign.MemorySegment $pMappedData() {return this.ptr.asSlice(OFFSET__pMappedData, LAYOUT__pMappedData);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT__pUserData, OFFSET__pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUserData, OFFSET__pUserData, value);}
    public java.lang.foreign.MemorySegment $pUserData() {return this.ptr.asSlice(OFFSET__pUserData, LAYOUT__pUserData);}

    public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT__pName, OFFSET__pName);}
    public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pName, OFFSET__pName, value);}
    public java.lang.foreign.MemorySegment $pName() {return this.ptr.asSlice(OFFSET__pName, LAYOUT__pName);}
}
