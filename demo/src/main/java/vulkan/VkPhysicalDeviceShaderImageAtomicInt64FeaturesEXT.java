package vulkan;

public record VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderImageInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderImageInt64Atomics");
    public static final long OFFSET__shaderImageInt64Atomics = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseImageInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("sparseImageInt64Atomics");
    public static final long OFFSET__sparseImageInt64Atomics = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderImageInt64Atomics,
            LAYOUT__sparseImageInt64Atomics
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT");

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderImageInt64Atomics() {return this.ptr.get(LAYOUT__shaderImageInt64Atomics, OFFSET__shaderImageInt64Atomics);}
    public void shaderImageInt64Atomics(int value) {this.ptr.set(LAYOUT__shaderImageInt64Atomics, OFFSET__shaderImageInt64Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderImageInt64Atomics() {return this.ptr.asSlice(OFFSET__shaderImageInt64Atomics, LAYOUT__shaderImageInt64Atomics);}

    public int sparseImageInt64Atomics() {return this.ptr.get(LAYOUT__sparseImageInt64Atomics, OFFSET__sparseImageInt64Atomics);}
    public void sparseImageInt64Atomics(int value) {this.ptr.set(LAYOUT__sparseImageInt64Atomics, OFFSET__sparseImageInt64Atomics, value);}
    public java.lang.foreign.MemorySegment $sparseImageInt64Atomics() {return this.ptr.asSlice(OFFSET__sparseImageInt64Atomics, LAYOUT__sparseImageInt64Atomics);}
}
