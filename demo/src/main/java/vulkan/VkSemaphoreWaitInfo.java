package vulkan;

public record VkSemaphoreWaitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__semaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__semaphoreCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSemaphores = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSemaphores = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pValues = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pValues = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__semaphoreCount,
            LAYOUT__pSemaphores,
            LAYOUT__pValues
    ).withByteAlignment(8).withName("VkSemaphoreWaitInfo");

    public VkSemaphoreWaitInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSemaphoreWaitInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSemaphoreWaitInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSemaphoreWaitInfo value)
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

    public int semaphoreCount() {return this.ptr.get(LAYOUT__semaphoreCount, OFFSET__semaphoreCount);}
    public void semaphoreCount(int value) {this.ptr.set(LAYOUT__semaphoreCount, OFFSET__semaphoreCount, value);}
    public java.lang.foreign.MemorySegment $semaphoreCount() {return this.ptr.asSlice(OFFSET__semaphoreCount, LAYOUT__semaphoreCount);}

    public java.lang.foreign.MemorySegment pSemaphores() {return this.ptr.get(LAYOUT__pSemaphores, OFFSET__pSemaphores);}
    public void pSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSemaphores, OFFSET__pSemaphores, value);}
    public java.lang.foreign.MemorySegment $pSemaphores() {return this.ptr.asSlice(OFFSET__pSemaphores, LAYOUT__pSemaphores);}

    public java.lang.foreign.MemorySegment pValues() {return this.ptr.get(LAYOUT__pValues, OFFSET__pValues);}
    public void pValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pValues, OFFSET__pValues, value);}
    public java.lang.foreign.MemorySegment $pValues() {return this.ptr.asSlice(OFFSET__pValues, LAYOUT__pValues);}
}
