package vulkan;

public record VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__formatRgba10x6WithoutYCbCrSampler = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__formatRgba10x6WithoutYCbCrSampler = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__formatRgba10x6WithoutYCbCrSampler,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT");

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int formatRgba10x6WithoutYCbCrSampler() {return this.ptr.get(LAYOUT__formatRgba10x6WithoutYCbCrSampler, OFFSET__formatRgba10x6WithoutYCbCrSampler);}
    public void formatRgba10x6WithoutYCbCrSampler(int value) {this.ptr.set(LAYOUT__formatRgba10x6WithoutYCbCrSampler, OFFSET__formatRgba10x6WithoutYCbCrSampler, value);}
    public java.lang.foreign.MemorySegment $formatRgba10x6WithoutYCbCrSampler() {return this.ptr.asSlice(OFFSET__formatRgba10x6WithoutYCbCrSampler, LAYOUT__formatRgba10x6WithoutYCbCrSampler);}
}
