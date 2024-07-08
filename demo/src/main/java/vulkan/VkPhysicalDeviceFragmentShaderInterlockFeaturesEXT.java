package vulkan;

public record VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShaderSampleInterlock = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock");
    public static final long OFFSET__fragmentShaderSampleInterlock = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShaderPixelInterlock = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock");
    public static final long OFFSET__fragmentShaderPixelInterlock = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__fragmentShaderShadingRateInterlock = java.lang.foreign.ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock");
    public static final long OFFSET__fragmentShaderShadingRateInterlock = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__fragmentShaderSampleInterlock,
            LAYOUT__fragmentShaderPixelInterlock,
            LAYOUT__fragmentShaderShadingRateInterlock,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT");

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int fragmentShaderSampleInterlock() {return this.ptr.get(LAYOUT__fragmentShaderSampleInterlock, OFFSET__fragmentShaderSampleInterlock);}
    public void fragmentShaderSampleInterlock(int value) {this.ptr.set(LAYOUT__fragmentShaderSampleInterlock, OFFSET__fragmentShaderSampleInterlock, value);}
    public java.lang.foreign.MemorySegment $fragmentShaderSampleInterlock() {return this.ptr.asSlice(OFFSET__fragmentShaderSampleInterlock, LAYOUT__fragmentShaderSampleInterlock);}

    public int fragmentShaderPixelInterlock() {return this.ptr.get(LAYOUT__fragmentShaderPixelInterlock, OFFSET__fragmentShaderPixelInterlock);}
    public void fragmentShaderPixelInterlock(int value) {this.ptr.set(LAYOUT__fragmentShaderPixelInterlock, OFFSET__fragmentShaderPixelInterlock, value);}
    public java.lang.foreign.MemorySegment $fragmentShaderPixelInterlock() {return this.ptr.asSlice(OFFSET__fragmentShaderPixelInterlock, LAYOUT__fragmentShaderPixelInterlock);}

    public int fragmentShaderShadingRateInterlock() {return this.ptr.get(LAYOUT__fragmentShaderShadingRateInterlock, OFFSET__fragmentShaderShadingRateInterlock);}
    public void fragmentShaderShadingRateInterlock(int value) {this.ptr.set(LAYOUT__fragmentShaderShadingRateInterlock, OFFSET__fragmentShaderShadingRateInterlock, value);}
    public java.lang.foreign.MemorySegment $fragmentShaderShadingRateInterlock() {return this.ptr.asSlice(OFFSET__fragmentShaderShadingRateInterlock, LAYOUT__fragmentShaderShadingRateInterlock);}
}
