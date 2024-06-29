package vulkan;

public record VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderIntegerFunctions2 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderIntegerFunctions2 = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderIntegerFunctions2,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL");

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderIntegerFunctions2() {return this.ptr.get(LAYOUT__shaderIntegerFunctions2, OFFSET__shaderIntegerFunctions2);}
    public void shaderIntegerFunctions2(int value) {this.ptr.set(LAYOUT__shaderIntegerFunctions2, OFFSET__shaderIntegerFunctions2, value);}
    public java.lang.foreign.MemorySegment $shaderIntegerFunctions2() {return this.ptr.asSlice(OFFSET__shaderIntegerFunctions2, LAYOUT__shaderIntegerFunctions2);}
}
