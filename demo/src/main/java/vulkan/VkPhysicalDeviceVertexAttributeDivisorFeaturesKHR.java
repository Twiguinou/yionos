package vulkan;

public record VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexAttributeInstanceRateDivisor = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor");
    public static final long OFFSET__vertexAttributeInstanceRateDivisor = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexAttributeInstanceRateZeroDivisor = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor");
    public static final long OFFSET__vertexAttributeInstanceRateZeroDivisor = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__vertexAttributeInstanceRateDivisor,
            LAYOUT__vertexAttributeInstanceRateZeroDivisor
    ).withByteAlignment(8).withName("VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR");

    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int vertexAttributeInstanceRateDivisor() {return this.ptr.get(LAYOUT__vertexAttributeInstanceRateDivisor, OFFSET__vertexAttributeInstanceRateDivisor);}
    public void vertexAttributeInstanceRateDivisor(int value) {this.ptr.set(LAYOUT__vertexAttributeInstanceRateDivisor, OFFSET__vertexAttributeInstanceRateDivisor, value);}
    public java.lang.foreign.MemorySegment $vertexAttributeInstanceRateDivisor() {return this.ptr.asSlice(OFFSET__vertexAttributeInstanceRateDivisor, LAYOUT__vertexAttributeInstanceRateDivisor);}

    public int vertexAttributeInstanceRateZeroDivisor() {return this.ptr.get(LAYOUT__vertexAttributeInstanceRateZeroDivisor, OFFSET__vertexAttributeInstanceRateZeroDivisor);}
    public void vertexAttributeInstanceRateZeroDivisor(int value) {this.ptr.set(LAYOUT__vertexAttributeInstanceRateZeroDivisor, OFFSET__vertexAttributeInstanceRateZeroDivisor, value);}
    public java.lang.foreign.MemorySegment $vertexAttributeInstanceRateZeroDivisor() {return this.ptr.asSlice(OFFSET__vertexAttributeInstanceRateZeroDivisor, LAYOUT__vertexAttributeInstanceRateZeroDivisor);}
}
