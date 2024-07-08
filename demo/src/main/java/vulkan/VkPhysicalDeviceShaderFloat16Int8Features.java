package vulkan;

public record VkPhysicalDeviceShaderFloat16Int8Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderFloat16 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderFloat16");
    public static final long OFFSET__shaderFloat16 = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderInt8 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderInt8");
    public static final long OFFSET__shaderInt8 = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderFloat16,
            LAYOUT__shaderInt8
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderFloat16Int8Features");

    public VkPhysicalDeviceShaderFloat16Int8Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderFloat16Int8Features(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderFloat16Int8Features value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderFloat16() {return this.ptr.get(LAYOUT__shaderFloat16, OFFSET__shaderFloat16);}
    public void shaderFloat16(int value) {this.ptr.set(LAYOUT__shaderFloat16, OFFSET__shaderFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderFloat16() {return this.ptr.asSlice(OFFSET__shaderFloat16, LAYOUT__shaderFloat16);}

    public int shaderInt8() {return this.ptr.get(LAYOUT__shaderInt8, OFFSET__shaderInt8);}
    public void shaderInt8(int value) {this.ptr.set(LAYOUT__shaderInt8, OFFSET__shaderInt8, value);}
    public java.lang.foreign.MemorySegment $shaderInt8() {return this.ptr.asSlice(OFFSET__shaderInt8, LAYOUT__shaderInt8);}
}
