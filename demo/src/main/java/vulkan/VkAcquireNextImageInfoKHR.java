package vulkan;

public record VkAcquireNextImageInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__swapchain = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__swapchain = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__timeout = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__timeout = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__semaphore = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__semaphore = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__fence = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__fence = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__deviceMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__deviceMask = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__swapchain,
            LAYOUT__timeout,
            LAYOUT__semaphore,
            LAYOUT__fence,
            LAYOUT__deviceMask,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkAcquireNextImageInfoKHR");

    public VkAcquireNextImageInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAcquireNextImageInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAcquireNextImageInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAcquireNextImageInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment swapchain() {return this.ptr.get(LAYOUT__swapchain, OFFSET__swapchain);}
    public void swapchain(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__swapchain, OFFSET__swapchain, value);}
    public java.lang.foreign.MemorySegment $swapchain() {return this.ptr.asSlice(OFFSET__swapchain, LAYOUT__swapchain);}

    public long timeout() {return this.ptr.get(LAYOUT__timeout, OFFSET__timeout);}
    public void timeout(long value) {this.ptr.set(LAYOUT__timeout, OFFSET__timeout, value);}
    public java.lang.foreign.MemorySegment $timeout() {return this.ptr.asSlice(OFFSET__timeout, LAYOUT__timeout);}

    public java.lang.foreign.MemorySegment semaphore() {return this.ptr.get(LAYOUT__semaphore, OFFSET__semaphore);}
    public void semaphore(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__semaphore, OFFSET__semaphore, value);}
    public java.lang.foreign.MemorySegment $semaphore() {return this.ptr.asSlice(OFFSET__semaphore, LAYOUT__semaphore);}

    public java.lang.foreign.MemorySegment fence() {return this.ptr.get(LAYOUT__fence, OFFSET__fence);}
    public void fence(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__fence, OFFSET__fence, value);}
    public java.lang.foreign.MemorySegment $fence() {return this.ptr.asSlice(OFFSET__fence, LAYOUT__fence);}

    public int deviceMask() {return this.ptr.get(LAYOUT__deviceMask, OFFSET__deviceMask);}
    public void deviceMask(int value) {this.ptr.set(LAYOUT__deviceMask, OFFSET__deviceMask, value);}
    public java.lang.foreign.MemorySegment $deviceMask() {return this.ptr.asSlice(OFFSET__deviceMask, LAYOUT__deviceMask);}
}
