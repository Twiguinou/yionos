package vulkan;

public record VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSMCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSMCount");
    public static final long OFFSET__shaderSMCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderWarpsPerSM = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderWarpsPerSM");
    public static final long OFFSET__shaderWarpsPerSM = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderSMCount,
            LAYOUT__shaderWarpsPerSM
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderSMBuiltinsPropertiesNV");

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderSMBuiltinsPropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderSMCount() {return this.ptr.get(LAYOUT__shaderSMCount, OFFSET__shaderSMCount);}
    public void shaderSMCount(int value) {this.ptr.set(LAYOUT__shaderSMCount, OFFSET__shaderSMCount, value);}
    public java.lang.foreign.MemorySegment $shaderSMCount() {return this.ptr.asSlice(OFFSET__shaderSMCount, LAYOUT__shaderSMCount);}

    public int shaderWarpsPerSM() {return this.ptr.get(LAYOUT__shaderWarpsPerSM, OFFSET__shaderWarpsPerSM);}
    public void shaderWarpsPerSM(int value) {this.ptr.set(LAYOUT__shaderWarpsPerSM, OFFSET__shaderWarpsPerSM, value);}
    public java.lang.foreign.MemorySegment $shaderWarpsPerSM() {return this.ptr.asSlice(OFFSET__shaderWarpsPerSM, LAYOUT__shaderWarpsPerSM);}
}
