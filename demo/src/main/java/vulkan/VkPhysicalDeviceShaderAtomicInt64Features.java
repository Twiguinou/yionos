package vulkan;

public record VkPhysicalDeviceShaderAtomicInt64Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics");
    public static final long OFFSET__shaderBufferInt64Atomics = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics");
    public static final long OFFSET__shaderSharedInt64Atomics = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderBufferInt64Atomics,
            LAYOUT__shaderSharedInt64Atomics
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderAtomicInt64Features");

    public VkPhysicalDeviceShaderAtomicInt64Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderAtomicInt64Features getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderAtomicInt64Features(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderAtomicInt64Features value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderBufferInt64Atomics() {return this.ptr.get(LAYOUT__shaderBufferInt64Atomics, OFFSET__shaderBufferInt64Atomics);}
    public void shaderBufferInt64Atomics(int value) {this.ptr.set(LAYOUT__shaderBufferInt64Atomics, OFFSET__shaderBufferInt64Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderBufferInt64Atomics() {return this.ptr.asSlice(OFFSET__shaderBufferInt64Atomics, LAYOUT__shaderBufferInt64Atomics);}

    public int shaderSharedInt64Atomics() {return this.ptr.get(LAYOUT__shaderSharedInt64Atomics, OFFSET__shaderSharedInt64Atomics);}
    public void shaderSharedInt64Atomics(int value) {this.ptr.set(LAYOUT__shaderSharedInt64Atomics, OFFSET__shaderSharedInt64Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderSharedInt64Atomics() {return this.ptr.asSlice(OFFSET__shaderSharedInt64Atomics, LAYOUT__shaderSharedInt64Atomics);}
}
