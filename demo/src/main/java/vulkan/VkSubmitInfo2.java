package vulkan;

public record VkSubmitInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__waitSemaphoreInfoCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("waitSemaphoreInfoCount");
    public static final long OFFSET__waitSemaphoreInfoCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWaitSemaphoreInfos = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pWaitSemaphoreInfos");
    public static final long OFFSET__pWaitSemaphoreInfos = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__commandBufferInfoCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("commandBufferInfoCount");
    public static final long OFFSET__commandBufferInfoCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCommandBufferInfos = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCommandBufferInfos");
    public static final long OFFSET__pCommandBufferInfos = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__signalSemaphoreInfoCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("signalSemaphoreInfoCount");
    public static final long OFFSET__signalSemaphoreInfoCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSignalSemaphoreInfos = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSignalSemaphoreInfos");
    public static final long OFFSET__pSignalSemaphoreInfos = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__waitSemaphoreInfoCount,
            LAYOUT__pWaitSemaphoreInfos,
            LAYOUT__commandBufferInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCommandBufferInfos,
            LAYOUT__signalSemaphoreInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSignalSemaphoreInfos
    ).withByteAlignment(8).withName("VkSubmitInfo2");

    public VkSubmitInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSubmitInfo2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSubmitInfo2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSubmitInfo2 value)
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

    public int waitSemaphoreInfoCount() {return this.ptr.get(LAYOUT__waitSemaphoreInfoCount, OFFSET__waitSemaphoreInfoCount);}
    public void waitSemaphoreInfoCount(int value) {this.ptr.set(LAYOUT__waitSemaphoreInfoCount, OFFSET__waitSemaphoreInfoCount, value);}
    public java.lang.foreign.MemorySegment $waitSemaphoreInfoCount() {return this.ptr.asSlice(OFFSET__waitSemaphoreInfoCount, LAYOUT__waitSemaphoreInfoCount);}

    public java.lang.foreign.MemorySegment pWaitSemaphoreInfos() {return this.ptr.get(LAYOUT__pWaitSemaphoreInfos, OFFSET__pWaitSemaphoreInfos);}
    public void pWaitSemaphoreInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWaitSemaphoreInfos, OFFSET__pWaitSemaphoreInfos, value);}
    public java.lang.foreign.MemorySegment $pWaitSemaphoreInfos() {return this.ptr.asSlice(OFFSET__pWaitSemaphoreInfos, LAYOUT__pWaitSemaphoreInfos);}

    public int commandBufferInfoCount() {return this.ptr.get(LAYOUT__commandBufferInfoCount, OFFSET__commandBufferInfoCount);}
    public void commandBufferInfoCount(int value) {this.ptr.set(LAYOUT__commandBufferInfoCount, OFFSET__commandBufferInfoCount, value);}
    public java.lang.foreign.MemorySegment $commandBufferInfoCount() {return this.ptr.asSlice(OFFSET__commandBufferInfoCount, LAYOUT__commandBufferInfoCount);}

    public java.lang.foreign.MemorySegment pCommandBufferInfos() {return this.ptr.get(LAYOUT__pCommandBufferInfos, OFFSET__pCommandBufferInfos);}
    public void pCommandBufferInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCommandBufferInfos, OFFSET__pCommandBufferInfos, value);}
    public java.lang.foreign.MemorySegment $pCommandBufferInfos() {return this.ptr.asSlice(OFFSET__pCommandBufferInfos, LAYOUT__pCommandBufferInfos);}

    public int signalSemaphoreInfoCount() {return this.ptr.get(LAYOUT__signalSemaphoreInfoCount, OFFSET__signalSemaphoreInfoCount);}
    public void signalSemaphoreInfoCount(int value) {this.ptr.set(LAYOUT__signalSemaphoreInfoCount, OFFSET__signalSemaphoreInfoCount, value);}
    public java.lang.foreign.MemorySegment $signalSemaphoreInfoCount() {return this.ptr.asSlice(OFFSET__signalSemaphoreInfoCount, LAYOUT__signalSemaphoreInfoCount);}

    public java.lang.foreign.MemorySegment pSignalSemaphoreInfos() {return this.ptr.get(LAYOUT__pSignalSemaphoreInfos, OFFSET__pSignalSemaphoreInfos);}
    public void pSignalSemaphoreInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSignalSemaphoreInfos, OFFSET__pSignalSemaphoreInfos, value);}
    public java.lang.foreign.MemorySegment $pSignalSemaphoreInfos() {return this.ptr.asSlice(OFFSET__pSignalSemaphoreInfos, LAYOUT__pSignalSemaphoreInfos);}
}
