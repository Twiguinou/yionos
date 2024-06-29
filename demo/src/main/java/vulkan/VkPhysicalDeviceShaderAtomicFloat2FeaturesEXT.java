package vulkan;

public record VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat16Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderBufferFloat16Atomics = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat16AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderBufferFloat16AtomicAdd = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat16AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderBufferFloat16AtomicMinMax = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderBufferFloat32AtomicMinMax = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat64AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderBufferFloat64AtomicMinMax = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat16Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSharedFloat16Atomics = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat16AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSharedFloat16AtomicAdd = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat16AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSharedFloat16AtomicMinMax = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSharedFloat32AtomicMinMax = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat64AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderSharedFloat64AtomicMinMax = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderImageFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__shaderImageFloat32AtomicMinMax = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseImageFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sparseImageFloat32AtomicMinMax = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderBufferFloat16Atomics,
            LAYOUT__shaderBufferFloat16AtomicAdd,
            LAYOUT__shaderBufferFloat16AtomicMinMax,
            LAYOUT__shaderBufferFloat32AtomicMinMax,
            LAYOUT__shaderBufferFloat64AtomicMinMax,
            LAYOUT__shaderSharedFloat16Atomics,
            LAYOUT__shaderSharedFloat16AtomicAdd,
            LAYOUT__shaderSharedFloat16AtomicMinMax,
            LAYOUT__shaderSharedFloat32AtomicMinMax,
            LAYOUT__shaderSharedFloat64AtomicMinMax,
            LAYOUT__shaderImageFloat32AtomicMinMax,
            LAYOUT__sparseImageFloat32AtomicMinMax
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT");

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderBufferFloat16Atomics() {return this.ptr.get(LAYOUT__shaderBufferFloat16Atomics, OFFSET__shaderBufferFloat16Atomics);}
    public void shaderBufferFloat16Atomics(int value) {this.ptr.set(LAYOUT__shaderBufferFloat16Atomics, OFFSET__shaderBufferFloat16Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat16Atomics() {return this.ptr.asSlice(OFFSET__shaderBufferFloat16Atomics, LAYOUT__shaderBufferFloat16Atomics);}

    public int shaderBufferFloat16AtomicAdd() {return this.ptr.get(LAYOUT__shaderBufferFloat16AtomicAdd, OFFSET__shaderBufferFloat16AtomicAdd);}
    public void shaderBufferFloat16AtomicAdd(int value) {this.ptr.set(LAYOUT__shaderBufferFloat16AtomicAdd, OFFSET__shaderBufferFloat16AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat16AtomicAdd() {return this.ptr.asSlice(OFFSET__shaderBufferFloat16AtomicAdd, LAYOUT__shaderBufferFloat16AtomicAdd);}

    public int shaderBufferFloat16AtomicMinMax() {return this.ptr.get(LAYOUT__shaderBufferFloat16AtomicMinMax, OFFSET__shaderBufferFloat16AtomicMinMax);}
    public void shaderBufferFloat16AtomicMinMax(int value) {this.ptr.set(LAYOUT__shaderBufferFloat16AtomicMinMax, OFFSET__shaderBufferFloat16AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat16AtomicMinMax() {return this.ptr.asSlice(OFFSET__shaderBufferFloat16AtomicMinMax, LAYOUT__shaderBufferFloat16AtomicMinMax);}

    public int shaderBufferFloat32AtomicMinMax() {return this.ptr.get(LAYOUT__shaderBufferFloat32AtomicMinMax, OFFSET__shaderBufferFloat32AtomicMinMax);}
    public void shaderBufferFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT__shaderBufferFloat32AtomicMinMax, OFFSET__shaderBufferFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat32AtomicMinMax() {return this.ptr.asSlice(OFFSET__shaderBufferFloat32AtomicMinMax, LAYOUT__shaderBufferFloat32AtomicMinMax);}

    public int shaderBufferFloat64AtomicMinMax() {return this.ptr.get(LAYOUT__shaderBufferFloat64AtomicMinMax, OFFSET__shaderBufferFloat64AtomicMinMax);}
    public void shaderBufferFloat64AtomicMinMax(int value) {this.ptr.set(LAYOUT__shaderBufferFloat64AtomicMinMax, OFFSET__shaderBufferFloat64AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat64AtomicMinMax() {return this.ptr.asSlice(OFFSET__shaderBufferFloat64AtomicMinMax, LAYOUT__shaderBufferFloat64AtomicMinMax);}

    public int shaderSharedFloat16Atomics() {return this.ptr.get(LAYOUT__shaderSharedFloat16Atomics, OFFSET__shaderSharedFloat16Atomics);}
    public void shaderSharedFloat16Atomics(int value) {this.ptr.set(LAYOUT__shaderSharedFloat16Atomics, OFFSET__shaderSharedFloat16Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat16Atomics() {return this.ptr.asSlice(OFFSET__shaderSharedFloat16Atomics, LAYOUT__shaderSharedFloat16Atomics);}

    public int shaderSharedFloat16AtomicAdd() {return this.ptr.get(LAYOUT__shaderSharedFloat16AtomicAdd, OFFSET__shaderSharedFloat16AtomicAdd);}
    public void shaderSharedFloat16AtomicAdd(int value) {this.ptr.set(LAYOUT__shaderSharedFloat16AtomicAdd, OFFSET__shaderSharedFloat16AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat16AtomicAdd() {return this.ptr.asSlice(OFFSET__shaderSharedFloat16AtomicAdd, LAYOUT__shaderSharedFloat16AtomicAdd);}

    public int shaderSharedFloat16AtomicMinMax() {return this.ptr.get(LAYOUT__shaderSharedFloat16AtomicMinMax, OFFSET__shaderSharedFloat16AtomicMinMax);}
    public void shaderSharedFloat16AtomicMinMax(int value) {this.ptr.set(LAYOUT__shaderSharedFloat16AtomicMinMax, OFFSET__shaderSharedFloat16AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat16AtomicMinMax() {return this.ptr.asSlice(OFFSET__shaderSharedFloat16AtomicMinMax, LAYOUT__shaderSharedFloat16AtomicMinMax);}

    public int shaderSharedFloat32AtomicMinMax() {return this.ptr.get(LAYOUT__shaderSharedFloat32AtomicMinMax, OFFSET__shaderSharedFloat32AtomicMinMax);}
    public void shaderSharedFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT__shaderSharedFloat32AtomicMinMax, OFFSET__shaderSharedFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat32AtomicMinMax() {return this.ptr.asSlice(OFFSET__shaderSharedFloat32AtomicMinMax, LAYOUT__shaderSharedFloat32AtomicMinMax);}

    public int shaderSharedFloat64AtomicMinMax() {return this.ptr.get(LAYOUT__shaderSharedFloat64AtomicMinMax, OFFSET__shaderSharedFloat64AtomicMinMax);}
    public void shaderSharedFloat64AtomicMinMax(int value) {this.ptr.set(LAYOUT__shaderSharedFloat64AtomicMinMax, OFFSET__shaderSharedFloat64AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat64AtomicMinMax() {return this.ptr.asSlice(OFFSET__shaderSharedFloat64AtomicMinMax, LAYOUT__shaderSharedFloat64AtomicMinMax);}

    public int shaderImageFloat32AtomicMinMax() {return this.ptr.get(LAYOUT__shaderImageFloat32AtomicMinMax, OFFSET__shaderImageFloat32AtomicMinMax);}
    public void shaderImageFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT__shaderImageFloat32AtomicMinMax, OFFSET__shaderImageFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $shaderImageFloat32AtomicMinMax() {return this.ptr.asSlice(OFFSET__shaderImageFloat32AtomicMinMax, LAYOUT__shaderImageFloat32AtomicMinMax);}

    public int sparseImageFloat32AtomicMinMax() {return this.ptr.get(LAYOUT__sparseImageFloat32AtomicMinMax, OFFSET__sparseImageFloat32AtomicMinMax);}
    public void sparseImageFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT__sparseImageFloat32AtomicMinMax, OFFSET__sparseImageFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment $sparseImageFloat32AtomicMinMax() {return this.ptr.asSlice(OFFSET__sparseImageFloat32AtomicMinMax, LAYOUT__sparseImageFloat32AtomicMinMax);}
}
