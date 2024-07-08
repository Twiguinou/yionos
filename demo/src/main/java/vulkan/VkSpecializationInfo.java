package vulkan;

public record VkSpecializationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mapEntryCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("mapEntryCount");
    public static final long OFFSET__mapEntryCount = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMapEntries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pMapEntries");
    public static final long OFFSET__pMapEntries = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dataSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dataSize");
    public static final long OFFSET__dataSize = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pData");
    public static final long OFFSET__pData = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mapEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pMapEntries,
            LAYOUT__dataSize,
            LAYOUT__pData
    ).withByteAlignment(8).withName("VkSpecializationInfo");

    public VkSpecializationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSpecializationInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSpecializationInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSpecializationInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mapEntryCount() {return this.ptr.get(LAYOUT__mapEntryCount, OFFSET__mapEntryCount);}
    public void mapEntryCount(int value) {this.ptr.set(LAYOUT__mapEntryCount, OFFSET__mapEntryCount, value);}
    public java.lang.foreign.MemorySegment $mapEntryCount() {return this.ptr.asSlice(OFFSET__mapEntryCount, LAYOUT__mapEntryCount);}

    public java.lang.foreign.MemorySegment pMapEntries() {return this.ptr.get(LAYOUT__pMapEntries, OFFSET__pMapEntries);}
    public void pMapEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMapEntries, OFFSET__pMapEntries, value);}
    public java.lang.foreign.MemorySegment $pMapEntries() {return this.ptr.asSlice(OFFSET__pMapEntries, LAYOUT__pMapEntries);}

    public long dataSize() {return this.ptr.get(LAYOUT__dataSize, OFFSET__dataSize);}
    public void dataSize(long value) {this.ptr.set(LAYOUT__dataSize, OFFSET__dataSize, value);}
    public java.lang.foreign.MemorySegment $dataSize() {return this.ptr.asSlice(OFFSET__dataSize, LAYOUT__dataSize);}

    public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT__pData, OFFSET__pData);}
    public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pData, OFFSET__pData, value);}
    public java.lang.foreign.MemorySegment $pData() {return this.ptr.asSlice(OFFSET__pData, LAYOUT__pData);}
}
