package vulkan;

public record VkPresentInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("waitSemaphoreCount");
    public static final long OFFSET__waitSemaphoreCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWaitSemaphores = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pWaitSemaphores");
    public static final long OFFSET__pWaitSemaphores = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__swapchainCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("swapchainCount");
    public static final long OFFSET__swapchainCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSwapchains = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSwapchains");
    public static final long OFFSET__pSwapchains = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pImageIndices = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pImageIndices");
    public static final long OFFSET__pImageIndices = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pResults = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pResults");
    public static final long OFFSET__pResults = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__waitSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pWaitSemaphores,
            LAYOUT__swapchainCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSwapchains,
            LAYOUT__pImageIndices,
            LAYOUT__pResults
    ).withByteAlignment(8).withName("VkPresentInfoKHR");

    public VkPresentInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPresentInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPresentInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPresentInfoKHR value)
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

    public int swapchainCount() {return this.ptr.get(LAYOUT__swapchainCount, OFFSET__swapchainCount);}
    public void swapchainCount(int value) {this.ptr.set(LAYOUT__swapchainCount, OFFSET__swapchainCount, value);}
    public java.lang.foreign.MemorySegment $swapchainCount() {return this.ptr.asSlice(OFFSET__swapchainCount, LAYOUT__swapchainCount);}

    public java.lang.foreign.MemorySegment pSwapchains() {return this.ptr.get(LAYOUT__pSwapchains, OFFSET__pSwapchains);}
    public void pSwapchains(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSwapchains, OFFSET__pSwapchains, value);}
    public java.lang.foreign.MemorySegment $pSwapchains() {return this.ptr.asSlice(OFFSET__pSwapchains, LAYOUT__pSwapchains);}

    public java.lang.foreign.MemorySegment pImageIndices() {return this.ptr.get(LAYOUT__pImageIndices, OFFSET__pImageIndices);}
    public void pImageIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pImageIndices, OFFSET__pImageIndices, value);}
    public java.lang.foreign.MemorySegment $pImageIndices() {return this.ptr.asSlice(OFFSET__pImageIndices, LAYOUT__pImageIndices);}

    public java.lang.foreign.MemorySegment pResults() {return this.ptr.get(LAYOUT__pResults, OFFSET__pResults);}
    public void pResults(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pResults, OFFSET__pResults, value);}
    public java.lang.foreign.MemorySegment $pResults() {return this.ptr.asSlice(OFFSET__pResults, LAYOUT__pResults);}
}
