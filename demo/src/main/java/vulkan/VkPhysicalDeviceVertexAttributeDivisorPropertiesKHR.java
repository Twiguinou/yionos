package vulkan;

public record VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVertexAttribDivisor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxVertexAttribDivisor = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportsNonZeroFirstInstance = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportsNonZeroFirstInstance = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxVertexAttribDivisor,
            LAYOUT__supportsNonZeroFirstInstance
    ).withByteAlignment(8).withName("VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR");

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxVertexAttribDivisor() {return this.ptr.get(LAYOUT__maxVertexAttribDivisor, OFFSET__maxVertexAttribDivisor);}
    public void maxVertexAttribDivisor(int value) {this.ptr.set(LAYOUT__maxVertexAttribDivisor, OFFSET__maxVertexAttribDivisor, value);}
    public java.lang.foreign.MemorySegment $maxVertexAttribDivisor() {return this.ptr.asSlice(OFFSET__maxVertexAttribDivisor, LAYOUT__maxVertexAttribDivisor);}

    public int supportsNonZeroFirstInstance() {return this.ptr.get(LAYOUT__supportsNonZeroFirstInstance, OFFSET__supportsNonZeroFirstInstance);}
    public void supportsNonZeroFirstInstance(int value) {this.ptr.set(LAYOUT__supportsNonZeroFirstInstance, OFFSET__supportsNonZeroFirstInstance, value);}
    public java.lang.foreign.MemorySegment $supportsNonZeroFirstInstance() {return this.ptr.asSlice(OFFSET__supportsNonZeroFirstInstance, LAYOUT__supportsNonZeroFirstInstance);}
}
