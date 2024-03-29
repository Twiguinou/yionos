package vulkan;

public record VkSemaphoreGetFdInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$semaphore = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$semaphore = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$handleType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$handleType = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$semaphore,
            LAYOUT$handleType,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSemaphoreGetFdInfoKHR");

    public VkSemaphoreGetFdInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSemaphoreGetFdInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSemaphoreGetFdInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment semaphore() {return this.ptr.get(LAYOUT$semaphore, OFFSET$semaphore);}
    public void semaphore(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$semaphore, OFFSET$semaphore, value);}
    public java.lang.foreign.MemorySegment semaphore_ptr() {return this.ptr.asSlice(OFFSET$semaphore, LAYOUT$semaphore);}

    public int handleType() {return this.ptr.get(LAYOUT$handleType, OFFSET$handleType);}
    public void handleType(int value) {this.ptr.set(LAYOUT$handleType, OFFSET$handleType, value);}
    public java.lang.foreign.MemorySegment handleType_ptr() {return this.ptr.asSlice(OFFSET$handleType, LAYOUT$handleType);}
}
