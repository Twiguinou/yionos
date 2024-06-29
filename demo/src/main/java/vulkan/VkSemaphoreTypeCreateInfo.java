package vulkan;

public record VkSemaphoreTypeCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__semaphoreType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__semaphoreType = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__initialValue = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__initialValue = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__semaphoreType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__initialValue
    ).withByteAlignment(8).withName("VkSemaphoreTypeCreateInfo");

    public VkSemaphoreTypeCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSemaphoreTypeCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSemaphoreTypeCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSemaphoreTypeCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int semaphoreType() {return this.ptr.get(LAYOUT__semaphoreType, OFFSET__semaphoreType);}
    public void semaphoreType(int value) {this.ptr.set(LAYOUT__semaphoreType, OFFSET__semaphoreType, value);}
    public java.lang.foreign.MemorySegment $semaphoreType() {return this.ptr.asSlice(OFFSET__semaphoreType, LAYOUT__semaphoreType);}

    public long initialValue() {return this.ptr.get(LAYOUT__initialValue, OFFSET__initialValue);}
    public void initialValue(long value) {this.ptr.set(LAYOUT__initialValue, OFFSET__initialValue, value);}
    public java.lang.foreign.MemorySegment $initialValue() {return this.ptr.asSlice(OFFSET__initialValue, LAYOUT__initialValue);}
}
