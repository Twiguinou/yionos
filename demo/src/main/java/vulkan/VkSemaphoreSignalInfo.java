package vulkan;

public record VkSemaphoreSignalInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__semaphore = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("semaphore");
    public static final long OFFSET__semaphore = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__value = java.lang.foreign.ValueLayout.JAVA_LONG.withName("value");
    public static final long OFFSET__value = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__semaphore,
            LAYOUT__value
    ).withByteAlignment(8).withName("VkSemaphoreSignalInfo");

    public VkSemaphoreSignalInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSemaphoreSignalInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSemaphoreSignalInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSemaphoreSignalInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment semaphore() {return this.ptr.get(LAYOUT__semaphore, OFFSET__semaphore);}
    public void semaphore(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__semaphore, OFFSET__semaphore, value);}
    public java.lang.foreign.MemorySegment $semaphore() {return this.ptr.asSlice(OFFSET__semaphore, LAYOUT__semaphore);}

    public long value() {return this.ptr.get(LAYOUT__value, OFFSET__value);}
    public void value(long value) {this.ptr.set(LAYOUT__value, OFFSET__value, value);}
    public java.lang.foreign.MemorySegment $value() {return this.ptr.asSlice(OFFSET__value, LAYOUT__value);}
}
