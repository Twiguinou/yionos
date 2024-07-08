package vulkan;

public record VkPipelineCacheCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__initialDataSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("initialDataSize");
    public static final long OFFSET__initialDataSize = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pInitialData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pInitialData");
    public static final long OFFSET__pInitialData = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__initialDataSize,
            LAYOUT__pInitialData
    ).withByteAlignment(8).withName("VkPipelineCacheCreateInfo");

    public VkPipelineCacheCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineCacheCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineCacheCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineCacheCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public long initialDataSize() {return this.ptr.get(LAYOUT__initialDataSize, OFFSET__initialDataSize);}
    public void initialDataSize(long value) {this.ptr.set(LAYOUT__initialDataSize, OFFSET__initialDataSize, value);}
    public java.lang.foreign.MemorySegment $initialDataSize() {return this.ptr.asSlice(OFFSET__initialDataSize, LAYOUT__initialDataSize);}

    public java.lang.foreign.MemorySegment pInitialData() {return this.ptr.get(LAYOUT__pInitialData, OFFSET__pInitialData);}
    public void pInitialData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pInitialData, OFFSET__pInitialData, value);}
    public java.lang.foreign.MemorySegment $pInitialData() {return this.ptr.asSlice(OFFSET__pInitialData, LAYOUT__pInitialData);}
}
