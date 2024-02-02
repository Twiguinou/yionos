package vulkan;

public record VkVideoInlineQueryInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$queryPool = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$queryPool = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstQuery = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$firstQuery = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queryCount = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$queryPool,
            LAYOUT$firstQuery,
            LAYOUT$queryCount
    ).withName("VkVideoInlineQueryInfoKHR");

    public VkVideoInlineQueryInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoInlineQueryInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoInlineQueryInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment queryPool() {return this.ptr.get(LAYOUT$queryPool, OFFSET$queryPool);}
    public void queryPool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$queryPool, OFFSET$queryPool, value);}
    public java.lang.foreign.MemorySegment queryPool_ptr() {return this.ptr.asSlice(OFFSET$queryPool, LAYOUT$queryPool);}

    public int firstQuery() {return this.ptr.get(LAYOUT$firstQuery, OFFSET$firstQuery);}
    public void firstQuery(int value) {this.ptr.set(LAYOUT$firstQuery, OFFSET$firstQuery, value);}
    public java.lang.foreign.MemorySegment firstQuery_ptr() {return this.ptr.asSlice(OFFSET$firstQuery, LAYOUT$firstQuery);}

    public int queryCount() {return this.ptr.get(LAYOUT$queryCount, OFFSET$queryCount);}
    public void queryCount(int value) {this.ptr.set(LAYOUT$queryCount, OFFSET$queryCount, value);}
    public java.lang.foreign.MemorySegment queryCount_ptr() {return this.ptr.asSlice(OFFSET$queryCount, LAYOUT$queryCount);}
}
