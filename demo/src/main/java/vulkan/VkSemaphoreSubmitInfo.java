package vulkan;

public record VkSemaphoreSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__semaphore = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__semaphore = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__value = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__value = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__stageMask = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__stageMask = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceIndex = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__semaphore,
            LAYOUT__value,
            LAYOUT__stageMask,
            LAYOUT__deviceIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSemaphoreSubmitInfo");

    public VkSemaphoreSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSemaphoreSubmitInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSemaphoreSubmitInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSemaphoreSubmitInfo value)
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

    public long stageMask() {return this.ptr.get(LAYOUT__stageMask, OFFSET__stageMask);}
    public void stageMask(long value) {this.ptr.set(LAYOUT__stageMask, OFFSET__stageMask, value);}
    public java.lang.foreign.MemorySegment $stageMask() {return this.ptr.asSlice(OFFSET__stageMask, LAYOUT__stageMask);}

    public int deviceIndex() {return this.ptr.get(LAYOUT__deviceIndex, OFFSET__deviceIndex);}
    public void deviceIndex(int value) {this.ptr.set(LAYOUT__deviceIndex, OFFSET__deviceIndex, value);}
    public java.lang.foreign.MemorySegment $deviceIndex() {return this.ptr.asSlice(OFFSET__deviceIndex, LAYOUT__deviceIndex);}
}
