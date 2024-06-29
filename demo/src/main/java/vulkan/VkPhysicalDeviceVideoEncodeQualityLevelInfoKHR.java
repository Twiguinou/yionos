package vulkan;

public record VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pVideoProfile = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pVideoProfile = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__qualityLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__qualityLevel = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pVideoProfile,
            LAYOUT__qualityLevel,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR");

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pVideoProfile() {return this.ptr.get(LAYOUT__pVideoProfile, OFFSET__pVideoProfile);}
    public void pVideoProfile(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pVideoProfile, OFFSET__pVideoProfile, value);}
    public java.lang.foreign.MemorySegment $pVideoProfile() {return this.ptr.asSlice(OFFSET__pVideoProfile, LAYOUT__pVideoProfile);}

    public int qualityLevel() {return this.ptr.get(LAYOUT__qualityLevel, OFFSET__qualityLevel);}
    public void qualityLevel(int value) {this.ptr.set(LAYOUT__qualityLevel, OFFSET__qualityLevel, value);}
    public java.lang.foreign.MemorySegment $qualityLevel() {return this.ptr.asSlice(OFFSET__qualityLevel, LAYOUT__qualityLevel);}
}
