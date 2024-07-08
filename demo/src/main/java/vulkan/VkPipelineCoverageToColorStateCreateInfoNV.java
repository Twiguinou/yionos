package vulkan;

public record VkPipelineCoverageToColorStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__coverageToColorEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("coverageToColorEnable");
    public static final long OFFSET__coverageToColorEnable = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__coverageToColorLocation = java.lang.foreign.ValueLayout.JAVA_INT.withName("coverageToColorLocation");
    public static final long OFFSET__coverageToColorLocation = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__coverageToColorEnable,
            LAYOUT__coverageToColorLocation,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPipelineCoverageToColorStateCreateInfoNV");

    public VkPipelineCoverageToColorStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineCoverageToColorStateCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineCoverageToColorStateCreateInfoNV value)
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

    public int coverageToColorEnable() {return this.ptr.get(LAYOUT__coverageToColorEnable, OFFSET__coverageToColorEnable);}
    public void coverageToColorEnable(int value) {this.ptr.set(LAYOUT__coverageToColorEnable, OFFSET__coverageToColorEnable, value);}
    public java.lang.foreign.MemorySegment $coverageToColorEnable() {return this.ptr.asSlice(OFFSET__coverageToColorEnable, LAYOUT__coverageToColorEnable);}

    public int coverageToColorLocation() {return this.ptr.get(LAYOUT__coverageToColorLocation, OFFSET__coverageToColorLocation);}
    public void coverageToColorLocation(int value) {this.ptr.set(LAYOUT__coverageToColorLocation, OFFSET__coverageToColorLocation, value);}
    public java.lang.foreign.MemorySegment $coverageToColorLocation() {return this.ptr.asSlice(OFFSET__coverageToColorLocation, LAYOUT__coverageToColorLocation);}
}
