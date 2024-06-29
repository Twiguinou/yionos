package vulkan;

public record VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__shaderCoreMask = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__shaderCoreMask = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderCoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderCoreCount = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderWarpsPerCore = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderWarpsPerCore = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderCoreMask,
            LAYOUT__shaderCoreCount,
            LAYOUT__shaderWarpsPerCore
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM");

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long shaderCoreMask() {return this.ptr.get(LAYOUT__shaderCoreMask, OFFSET__shaderCoreMask);}
    public void shaderCoreMask(long value) {this.ptr.set(LAYOUT__shaderCoreMask, OFFSET__shaderCoreMask, value);}
    public java.lang.foreign.MemorySegment $shaderCoreMask() {return this.ptr.asSlice(OFFSET__shaderCoreMask, LAYOUT__shaderCoreMask);}

    public int shaderCoreCount() {return this.ptr.get(LAYOUT__shaderCoreCount, OFFSET__shaderCoreCount);}
    public void shaderCoreCount(int value) {this.ptr.set(LAYOUT__shaderCoreCount, OFFSET__shaderCoreCount, value);}
    public java.lang.foreign.MemorySegment $shaderCoreCount() {return this.ptr.asSlice(OFFSET__shaderCoreCount, LAYOUT__shaderCoreCount);}

    public int shaderWarpsPerCore() {return this.ptr.get(LAYOUT__shaderWarpsPerCore, OFFSET__shaderWarpsPerCore);}
    public void shaderWarpsPerCore(int value) {this.ptr.set(LAYOUT__shaderWarpsPerCore, OFFSET__shaderWarpsPerCore, value);}
    public java.lang.foreign.MemorySegment $shaderWarpsPerCore() {return this.ptr.asSlice(OFFSET__shaderWarpsPerCore, LAYOUT__shaderWarpsPerCore);}
}
