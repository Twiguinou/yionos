package vulkan;

public record VkPhysicalDeviceShaderClockFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSubgroupClock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSubgroupClock = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDeviceClock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderDeviceClock = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderSubgroupClock,
            LAYOUT__shaderDeviceClock
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderClockFeaturesKHR");

    public VkPhysicalDeviceShaderClockFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderClockFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderSubgroupClock() {return this.ptr.get(LAYOUT__shaderSubgroupClock, OFFSET__shaderSubgroupClock);}
    public void shaderSubgroupClock(int value) {this.ptr.set(LAYOUT__shaderSubgroupClock, OFFSET__shaderSubgroupClock, value);}
    public java.lang.foreign.MemorySegment $shaderSubgroupClock() {return this.ptr.asSlice(OFFSET__shaderSubgroupClock, LAYOUT__shaderSubgroupClock);}

    public int shaderDeviceClock() {return this.ptr.get(LAYOUT__shaderDeviceClock, OFFSET__shaderDeviceClock);}
    public void shaderDeviceClock(int value) {this.ptr.set(LAYOUT__shaderDeviceClock, OFFSET__shaderDeviceClock, value);}
    public java.lang.foreign.MemorySegment $shaderDeviceClock() {return this.ptr.asSlice(OFFSET__shaderDeviceClock, LAYOUT__shaderDeviceClock);}
}
