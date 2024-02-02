package vulkan;

public record VkVideoEncodeQualityLevelPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredRateControlMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredRateControlMode = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredRateControlLayerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredRateControlLayerCount = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$preferredRateControlMode,
            LAYOUT$preferredRateControlLayerCount
    ).withName("VkVideoEncodeQualityLevelPropertiesKHR");

    public VkVideoEncodeQualityLevelPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeQualityLevelPropertiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int preferredRateControlMode() {return this.ptr.get(LAYOUT$preferredRateControlMode, OFFSET$preferredRateControlMode);}
    public void preferredRateControlMode(int value) {this.ptr.set(LAYOUT$preferredRateControlMode, OFFSET$preferredRateControlMode, value);}
    public java.lang.foreign.MemorySegment preferredRateControlMode_ptr() {return this.ptr.asSlice(OFFSET$preferredRateControlMode, LAYOUT$preferredRateControlMode);}

    public int preferredRateControlLayerCount() {return this.ptr.get(LAYOUT$preferredRateControlLayerCount, OFFSET$preferredRateControlLayerCount);}
    public void preferredRateControlLayerCount(int value) {this.ptr.set(LAYOUT$preferredRateControlLayerCount, OFFSET$preferredRateControlLayerCount, value);}
    public java.lang.foreign.MemorySegment preferredRateControlLayerCount_ptr() {return this.ptr.asSlice(OFFSET$preferredRateControlLayerCount, LAYOUT$preferredRateControlLayerCount);}
}
