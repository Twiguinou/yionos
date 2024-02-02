package vulkan;

public record VkVideoEncodeRateControlInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rateControlMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rateControlMode = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$layerCount = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pLayers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pLayers = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$virtualBufferSizeInMs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$virtualBufferSizeInMs = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$initialVirtualBufferSizeInMs = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$initialVirtualBufferSizeInMs = 44L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$rateControlMode,
            LAYOUT$layerCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pLayers,
            LAYOUT$virtualBufferSizeInMs,
            LAYOUT$initialVirtualBufferSizeInMs
    ).withName("VkVideoEncodeRateControlInfoKHR");

    public VkVideoEncodeRateControlInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeRateControlInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeRateControlInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int rateControlMode() {return this.ptr.get(LAYOUT$rateControlMode, OFFSET$rateControlMode);}
    public void rateControlMode(int value) {this.ptr.set(LAYOUT$rateControlMode, OFFSET$rateControlMode, value);}
    public java.lang.foreign.MemorySegment rateControlMode_ptr() {return this.ptr.asSlice(OFFSET$rateControlMode, LAYOUT$rateControlMode);}

    public int layerCount() {return this.ptr.get(LAYOUT$layerCount, OFFSET$layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT$layerCount, OFFSET$layerCount, value);}
    public java.lang.foreign.MemorySegment layerCount_ptr() {return this.ptr.asSlice(OFFSET$layerCount, LAYOUT$layerCount);}

    public java.lang.foreign.MemorySegment pLayers() {return this.ptr.get(LAYOUT$pLayers, OFFSET$pLayers);}
    public void pLayers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pLayers, OFFSET$pLayers, value);}
    public java.lang.foreign.MemorySegment pLayers_ptr() {return this.ptr.asSlice(OFFSET$pLayers, LAYOUT$pLayers);}

    public int virtualBufferSizeInMs() {return this.ptr.get(LAYOUT$virtualBufferSizeInMs, OFFSET$virtualBufferSizeInMs);}
    public void virtualBufferSizeInMs(int value) {this.ptr.set(LAYOUT$virtualBufferSizeInMs, OFFSET$virtualBufferSizeInMs, value);}
    public java.lang.foreign.MemorySegment virtualBufferSizeInMs_ptr() {return this.ptr.asSlice(OFFSET$virtualBufferSizeInMs, LAYOUT$virtualBufferSizeInMs);}

    public int initialVirtualBufferSizeInMs() {return this.ptr.get(LAYOUT$initialVirtualBufferSizeInMs, OFFSET$initialVirtualBufferSizeInMs);}
    public void initialVirtualBufferSizeInMs(int value) {this.ptr.set(LAYOUT$initialVirtualBufferSizeInMs, OFFSET$initialVirtualBufferSizeInMs, value);}
    public java.lang.foreign.MemorySegment initialVirtualBufferSizeInMs_ptr() {return this.ptr.asSlice(OFFSET$initialVirtualBufferSizeInMs, LAYOUT$initialVirtualBufferSizeInMs);}
}
