package vulkan;

public record VkVideoEncodeQualityLevelPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredRateControlMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredRateControlMode");
    public static final long OFFSET__preferredRateControlMode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredRateControlLayerCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("preferredRateControlLayerCount");
    public static final long OFFSET__preferredRateControlLayerCount = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__preferredRateControlMode,
            LAYOUT__preferredRateControlLayerCount
    ).withByteAlignment(8).withName("VkVideoEncodeQualityLevelPropertiesKHR");

    public VkVideoEncodeQualityLevelPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeQualityLevelPropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeQualityLevelPropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int preferredRateControlMode() {return this.ptr.get(LAYOUT__preferredRateControlMode, OFFSET__preferredRateControlMode);}
    public void preferredRateControlMode(int value) {this.ptr.set(LAYOUT__preferredRateControlMode, OFFSET__preferredRateControlMode, value);}
    public java.lang.foreign.MemorySegment $preferredRateControlMode() {return this.ptr.asSlice(OFFSET__preferredRateControlMode, LAYOUT__preferredRateControlMode);}

    public int preferredRateControlLayerCount() {return this.ptr.get(LAYOUT__preferredRateControlLayerCount, OFFSET__preferredRateControlLayerCount);}
    public void preferredRateControlLayerCount(int value) {this.ptr.set(LAYOUT__preferredRateControlLayerCount, OFFSET__preferredRateControlLayerCount, value);}
    public java.lang.foreign.MemorySegment $preferredRateControlLayerCount() {return this.ptr.asSlice(OFFSET__preferredRateControlLayerCount, LAYOUT__preferredRateControlLayerCount);}
}
