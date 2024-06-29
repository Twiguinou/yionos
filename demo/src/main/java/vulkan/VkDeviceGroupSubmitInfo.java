package vulkan;

public record VkDeviceGroupSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__waitSemaphoreCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWaitSemaphoreDeviceIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pWaitSemaphoreDeviceIndices = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__commandBufferCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__commandBufferCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCommandBufferDeviceMasks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCommandBufferDeviceMasks = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__signalSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__signalSemaphoreCount = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSignalSemaphoreDeviceIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSignalSemaphoreDeviceIndices = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__waitSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pWaitSemaphoreDeviceIndices,
            LAYOUT__commandBufferCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCommandBufferDeviceMasks,
            LAYOUT__signalSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSignalSemaphoreDeviceIndices
    ).withByteAlignment(8).withName("VkDeviceGroupSubmitInfo");

    public VkDeviceGroupSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceGroupSubmitInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceGroupSubmitInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceGroupSubmitInfo value)
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

    public java.lang.foreign.MemorySegment pWaitSemaphoreDeviceIndices() {return this.ptr.get(LAYOUT__pWaitSemaphoreDeviceIndices, OFFSET__pWaitSemaphoreDeviceIndices);}
    public void pWaitSemaphoreDeviceIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWaitSemaphoreDeviceIndices, OFFSET__pWaitSemaphoreDeviceIndices, value);}
    public java.lang.foreign.MemorySegment $pWaitSemaphoreDeviceIndices() {return this.ptr.asSlice(OFFSET__pWaitSemaphoreDeviceIndices, LAYOUT__pWaitSemaphoreDeviceIndices);}

    public int commandBufferCount() {return this.ptr.get(LAYOUT__commandBufferCount, OFFSET__commandBufferCount);}
    public void commandBufferCount(int value) {this.ptr.set(LAYOUT__commandBufferCount, OFFSET__commandBufferCount, value);}
    public java.lang.foreign.MemorySegment $commandBufferCount() {return this.ptr.asSlice(OFFSET__commandBufferCount, LAYOUT__commandBufferCount);}

    public java.lang.foreign.MemorySegment pCommandBufferDeviceMasks() {return this.ptr.get(LAYOUT__pCommandBufferDeviceMasks, OFFSET__pCommandBufferDeviceMasks);}
    public void pCommandBufferDeviceMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCommandBufferDeviceMasks, OFFSET__pCommandBufferDeviceMasks, value);}
    public java.lang.foreign.MemorySegment $pCommandBufferDeviceMasks() {return this.ptr.asSlice(OFFSET__pCommandBufferDeviceMasks, LAYOUT__pCommandBufferDeviceMasks);}

    public int signalSemaphoreCount() {return this.ptr.get(LAYOUT__signalSemaphoreCount, OFFSET__signalSemaphoreCount);}
    public void signalSemaphoreCount(int value) {this.ptr.set(LAYOUT__signalSemaphoreCount, OFFSET__signalSemaphoreCount, value);}
    public java.lang.foreign.MemorySegment $signalSemaphoreCount() {return this.ptr.asSlice(OFFSET__signalSemaphoreCount, LAYOUT__signalSemaphoreCount);}

    public java.lang.foreign.MemorySegment pSignalSemaphoreDeviceIndices() {return this.ptr.get(LAYOUT__pSignalSemaphoreDeviceIndices, OFFSET__pSignalSemaphoreDeviceIndices);}
    public void pSignalSemaphoreDeviceIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSignalSemaphoreDeviceIndices, OFFSET__pSignalSemaphoreDeviceIndices, value);}
    public java.lang.foreign.MemorySegment $pSignalSemaphoreDeviceIndices() {return this.ptr.asSlice(OFFSET__pSignalSemaphoreDeviceIndices, LAYOUT__pSignalSemaphoreDeviceIndices);}
}
