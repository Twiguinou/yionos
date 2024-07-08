package vulkan;

public record VkLatencySleepInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__signalSemaphore = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("signalSemaphore");
    public static final long OFFSET__signalSemaphore = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__value = java.lang.foreign.ValueLayout.JAVA_LONG.withName("value");
    public static final long OFFSET__value = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__signalSemaphore,
            LAYOUT__value
    ).withByteAlignment(8).withName("VkLatencySleepInfoNV");

    public VkLatencySleepInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkLatencySleepInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkLatencySleepInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkLatencySleepInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment signalSemaphore() {return this.ptr.get(LAYOUT__signalSemaphore, OFFSET__signalSemaphore);}
    public void signalSemaphore(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__signalSemaphore, OFFSET__signalSemaphore, value);}
    public java.lang.foreign.MemorySegment $signalSemaphore() {return this.ptr.asSlice(OFFSET__signalSemaphore, LAYOUT__signalSemaphore);}

    public long value() {return this.ptr.get(LAYOUT__value, OFFSET__value);}
    public void value(long value) {this.ptr.set(LAYOUT__value, OFFSET__value, value);}
    public java.lang.foreign.MemorySegment $value() {return this.ptr.asSlice(OFFSET__value, LAYOUT__value);}
}
