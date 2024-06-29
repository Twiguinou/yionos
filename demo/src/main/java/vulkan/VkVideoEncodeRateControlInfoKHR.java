package vulkan;

public record VkVideoEncodeRateControlInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rateControlMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__rateControlMode = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__layerCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLayers = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pLayers = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__virtualBufferSizeInMs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__virtualBufferSizeInMs = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__initialVirtualBufferSizeInMs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__initialVirtualBufferSizeInMs = 44;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__rateControlMode,
            LAYOUT__layerCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pLayers,
            LAYOUT__virtualBufferSizeInMs,
            LAYOUT__initialVirtualBufferSizeInMs
    ).withByteAlignment(8).withName("VkVideoEncodeRateControlInfoKHR");

    public VkVideoEncodeRateControlInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeRateControlInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeRateControlInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeRateControlInfoKHR value)
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

    public int rateControlMode() {return this.ptr.get(LAYOUT__rateControlMode, OFFSET__rateControlMode);}
    public void rateControlMode(int value) {this.ptr.set(LAYOUT__rateControlMode, OFFSET__rateControlMode, value);}
    public java.lang.foreign.MemorySegment $rateControlMode() {return this.ptr.asSlice(OFFSET__rateControlMode, LAYOUT__rateControlMode);}

    public int layerCount() {return this.ptr.get(LAYOUT__layerCount, OFFSET__layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT__layerCount, OFFSET__layerCount, value);}
    public java.lang.foreign.MemorySegment $layerCount() {return this.ptr.asSlice(OFFSET__layerCount, LAYOUT__layerCount);}

    public java.lang.foreign.MemorySegment pLayers() {return this.ptr.get(LAYOUT__pLayers, OFFSET__pLayers);}
    public void pLayers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLayers, OFFSET__pLayers, value);}
    public java.lang.foreign.MemorySegment $pLayers() {return this.ptr.asSlice(OFFSET__pLayers, LAYOUT__pLayers);}

    public int virtualBufferSizeInMs() {return this.ptr.get(LAYOUT__virtualBufferSizeInMs, OFFSET__virtualBufferSizeInMs);}
    public void virtualBufferSizeInMs(int value) {this.ptr.set(LAYOUT__virtualBufferSizeInMs, OFFSET__virtualBufferSizeInMs, value);}
    public java.lang.foreign.MemorySegment $virtualBufferSizeInMs() {return this.ptr.asSlice(OFFSET__virtualBufferSizeInMs, LAYOUT__virtualBufferSizeInMs);}

    public int initialVirtualBufferSizeInMs() {return this.ptr.get(LAYOUT__initialVirtualBufferSizeInMs, OFFSET__initialVirtualBufferSizeInMs);}
    public void initialVirtualBufferSizeInMs(int value) {this.ptr.set(LAYOUT__initialVirtualBufferSizeInMs, OFFSET__initialVirtualBufferSizeInMs, value);}
    public java.lang.foreign.MemorySegment $initialVirtualBufferSizeInMs() {return this.ptr.asSlice(OFFSET__initialVirtualBufferSizeInMs, LAYOUT__initialVirtualBufferSizeInMs);}
}
