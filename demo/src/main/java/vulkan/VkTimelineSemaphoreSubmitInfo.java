package vulkan;

public record VkTimelineSemaphoreSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__waitSemaphoreValueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__waitSemaphoreValueCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWaitSemaphoreValues = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pWaitSemaphoreValues = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__signalSemaphoreValueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__signalSemaphoreValueCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSignalSemaphoreValues = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSignalSemaphoreValues = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__waitSemaphoreValueCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pWaitSemaphoreValues,
            LAYOUT__signalSemaphoreValueCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSignalSemaphoreValues
    ).withByteAlignment(8).withName("VkTimelineSemaphoreSubmitInfo");

    public VkTimelineSemaphoreSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkTimelineSemaphoreSubmitInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkTimelineSemaphoreSubmitInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkTimelineSemaphoreSubmitInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int waitSemaphoreValueCount() {return this.ptr.get(LAYOUT__waitSemaphoreValueCount, OFFSET__waitSemaphoreValueCount);}
    public void waitSemaphoreValueCount(int value) {this.ptr.set(LAYOUT__waitSemaphoreValueCount, OFFSET__waitSemaphoreValueCount, value);}
    public java.lang.foreign.MemorySegment $waitSemaphoreValueCount() {return this.ptr.asSlice(OFFSET__waitSemaphoreValueCount, LAYOUT__waitSemaphoreValueCount);}

    public java.lang.foreign.MemorySegment pWaitSemaphoreValues() {return this.ptr.get(LAYOUT__pWaitSemaphoreValues, OFFSET__pWaitSemaphoreValues);}
    public void pWaitSemaphoreValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWaitSemaphoreValues, OFFSET__pWaitSemaphoreValues, value);}
    public java.lang.foreign.MemorySegment $pWaitSemaphoreValues() {return this.ptr.asSlice(OFFSET__pWaitSemaphoreValues, LAYOUT__pWaitSemaphoreValues);}

    public int signalSemaphoreValueCount() {return this.ptr.get(LAYOUT__signalSemaphoreValueCount, OFFSET__signalSemaphoreValueCount);}
    public void signalSemaphoreValueCount(int value) {this.ptr.set(LAYOUT__signalSemaphoreValueCount, OFFSET__signalSemaphoreValueCount, value);}
    public java.lang.foreign.MemorySegment $signalSemaphoreValueCount() {return this.ptr.asSlice(OFFSET__signalSemaphoreValueCount, LAYOUT__signalSemaphoreValueCount);}

    public java.lang.foreign.MemorySegment pSignalSemaphoreValues() {return this.ptr.get(LAYOUT__pSignalSemaphoreValues, OFFSET__pSignalSemaphoreValues);}
    public void pSignalSemaphoreValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSignalSemaphoreValues, OFFSET__pSignalSemaphoreValues, value);}
    public java.lang.foreign.MemorySegment $pSignalSemaphoreValues() {return this.ptr.asSlice(OFFSET__pSignalSemaphoreValues, LAYOUT__pSignalSemaphoreValues);}
}
