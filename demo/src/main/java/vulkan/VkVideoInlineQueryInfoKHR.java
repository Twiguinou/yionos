package vulkan;

public record VkVideoInlineQueryInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__queryPool = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("queryPool");
    public static final long OFFSET__queryPool = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstQuery = java.lang.foreign.ValueLayout.JAVA_INT.withName("firstQuery");
    public static final long OFFSET__firstQuery = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queryCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("queryCount");
    public static final long OFFSET__queryCount = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__queryPool,
            LAYOUT__firstQuery,
            LAYOUT__queryCount
    ).withByteAlignment(8).withName("VkVideoInlineQueryInfoKHR");

    public VkVideoInlineQueryInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoInlineQueryInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoInlineQueryInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoInlineQueryInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment queryPool() {return this.ptr.get(LAYOUT__queryPool, OFFSET__queryPool);}
    public void queryPool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__queryPool, OFFSET__queryPool, value);}
    public java.lang.foreign.MemorySegment $queryPool() {return this.ptr.asSlice(OFFSET__queryPool, LAYOUT__queryPool);}

    public int firstQuery() {return this.ptr.get(LAYOUT__firstQuery, OFFSET__firstQuery);}
    public void firstQuery(int value) {this.ptr.set(LAYOUT__firstQuery, OFFSET__firstQuery, value);}
    public java.lang.foreign.MemorySegment $firstQuery() {return this.ptr.asSlice(OFFSET__firstQuery, LAYOUT__firstQuery);}

    public int queryCount() {return this.ptr.get(LAYOUT__queryCount, OFFSET__queryCount);}
    public void queryCount(int value) {this.ptr.set(LAYOUT__queryCount, OFFSET__queryCount, value);}
    public java.lang.foreign.MemorySegment $queryCount() {return this.ptr.asSlice(OFFSET__queryCount, LAYOUT__queryCount);}
}
