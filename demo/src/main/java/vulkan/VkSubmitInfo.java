package vulkan;

public record VkSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__waitSemaphoreCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWaitSemaphores = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pWaitSemaphores = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWaitDstStageMask = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pWaitDstStageMask = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__commandBufferCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__commandBufferCount = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCommandBuffers = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCommandBuffers = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__signalSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__signalSemaphoreCount = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSignalSemaphores = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSignalSemaphores = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__waitSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pWaitSemaphores,
            LAYOUT__pWaitDstStageMask,
            LAYOUT__commandBufferCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCommandBuffers,
            LAYOUT__signalSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSignalSemaphores
    ).withByteAlignment(8).withName("VkSubmitInfo");

    public VkSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubmitInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubmitInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubmitInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int waitSemaphoreCount() {return this.ptr.get(LAYOUT__waitSemaphoreCount, OFFSET__waitSemaphoreCount);}
    public void waitSemaphoreCount(int value) {this.ptr.set(LAYOUT__waitSemaphoreCount, OFFSET__waitSemaphoreCount, value);}
    public java.lang.foreign.MemorySegment $waitSemaphoreCount() {return this.ptr.asSlice(OFFSET__waitSemaphoreCount, LAYOUT__waitSemaphoreCount);}

    public java.lang.foreign.MemorySegment pWaitSemaphores() {return this.ptr.get(LAYOUT__pWaitSemaphores, OFFSET__pWaitSemaphores);}
    public void pWaitSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWaitSemaphores, OFFSET__pWaitSemaphores, value);}
    public java.lang.foreign.MemorySegment $pWaitSemaphores() {return this.ptr.asSlice(OFFSET__pWaitSemaphores, LAYOUT__pWaitSemaphores);}

    public java.lang.foreign.MemorySegment pWaitDstStageMask() {return this.ptr.get(LAYOUT__pWaitDstStageMask, OFFSET__pWaitDstStageMask);}
    public void pWaitDstStageMask(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWaitDstStageMask, OFFSET__pWaitDstStageMask, value);}
    public java.lang.foreign.MemorySegment $pWaitDstStageMask() {return this.ptr.asSlice(OFFSET__pWaitDstStageMask, LAYOUT__pWaitDstStageMask);}

    public int commandBufferCount() {return this.ptr.get(LAYOUT__commandBufferCount, OFFSET__commandBufferCount);}
    public void commandBufferCount(int value) {this.ptr.set(LAYOUT__commandBufferCount, OFFSET__commandBufferCount, value);}
    public java.lang.foreign.MemorySegment $commandBufferCount() {return this.ptr.asSlice(OFFSET__commandBufferCount, LAYOUT__commandBufferCount);}

    public java.lang.foreign.MemorySegment pCommandBuffers() {return this.ptr.get(LAYOUT__pCommandBuffers, OFFSET__pCommandBuffers);}
    public void pCommandBuffers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCommandBuffers, OFFSET__pCommandBuffers, value);}
    public java.lang.foreign.MemorySegment $pCommandBuffers() {return this.ptr.asSlice(OFFSET__pCommandBuffers, LAYOUT__pCommandBuffers);}

    public int signalSemaphoreCount() {return this.ptr.get(LAYOUT__signalSemaphoreCount, OFFSET__signalSemaphoreCount);}
    public void signalSemaphoreCount(int value) {this.ptr.set(LAYOUT__signalSemaphoreCount, OFFSET__signalSemaphoreCount, value);}
    public java.lang.foreign.MemorySegment $signalSemaphoreCount() {return this.ptr.asSlice(OFFSET__signalSemaphoreCount, LAYOUT__signalSemaphoreCount);}

    public java.lang.foreign.MemorySegment pSignalSemaphores() {return this.ptr.get(LAYOUT__pSignalSemaphores, OFFSET__pSignalSemaphores);}
    public void pSignalSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSignalSemaphores, OFFSET__pSignalSemaphores, value);}
    public java.lang.foreign.MemorySegment $pSignalSemaphores() {return this.ptr.asSlice(OFFSET__pSignalSemaphores, LAYOUT__pSignalSemaphores);}
}
