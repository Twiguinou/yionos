package vulkan;

public record VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderBufferFloat32Atomics");
    public static final long OFFSET__shaderBufferFloat32Atomics = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicAdd");
    public static final long OFFSET__shaderBufferFloat32AtomicAdd = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat64Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderBufferFloat64Atomics");
    public static final long OFFSET__shaderBufferFloat64Atomics = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderBufferFloat64AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicAdd");
    public static final long OFFSET__shaderBufferFloat64AtomicAdd = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSharedFloat32Atomics");
    public static final long OFFSET__shaderSharedFloat32Atomics = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicAdd");
    public static final long OFFSET__shaderSharedFloat32AtomicAdd = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat64Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSharedFloat64Atomics");
    public static final long OFFSET__shaderSharedFloat64Atomics = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSharedFloat64AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicAdd");
    public static final long OFFSET__shaderSharedFloat64AtomicAdd = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderImageFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderImageFloat32Atomics");
    public static final long OFFSET__shaderImageFloat32Atomics = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderImageFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicAdd");
    public static final long OFFSET__shaderImageFloat32AtomicAdd = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseImageFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT.withName("sparseImageFloat32Atomics");
    public static final long OFFSET__sparseImageFloat32Atomics = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sparseImageFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicAdd");
    public static final long OFFSET__sparseImageFloat32AtomicAdd = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__shaderBufferFloat32Atomics,
            LAYOUT__shaderBufferFloat32AtomicAdd,
            LAYOUT__shaderBufferFloat64Atomics,
            LAYOUT__shaderBufferFloat64AtomicAdd,
            LAYOUT__shaderSharedFloat32Atomics,
            LAYOUT__shaderSharedFloat32AtomicAdd,
            LAYOUT__shaderSharedFloat64Atomics,
            LAYOUT__shaderSharedFloat64AtomicAdd,
            LAYOUT__shaderImageFloat32Atomics,
            LAYOUT__shaderImageFloat32AtomicAdd,
            LAYOUT__sparseImageFloat32Atomics,
            LAYOUT__sparseImageFloat32AtomicAdd
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderAtomicFloatFeaturesEXT");

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int shaderBufferFloat32Atomics() {return this.ptr.get(LAYOUT__shaderBufferFloat32Atomics, OFFSET__shaderBufferFloat32Atomics);}
    public void shaderBufferFloat32Atomics(int value) {this.ptr.set(LAYOUT__shaderBufferFloat32Atomics, OFFSET__shaderBufferFloat32Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat32Atomics() {return this.ptr.asSlice(OFFSET__shaderBufferFloat32Atomics, LAYOUT__shaderBufferFloat32Atomics);}

    public int shaderBufferFloat32AtomicAdd() {return this.ptr.get(LAYOUT__shaderBufferFloat32AtomicAdd, OFFSET__shaderBufferFloat32AtomicAdd);}
    public void shaderBufferFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT__shaderBufferFloat32AtomicAdd, OFFSET__shaderBufferFloat32AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat32AtomicAdd() {return this.ptr.asSlice(OFFSET__shaderBufferFloat32AtomicAdd, LAYOUT__shaderBufferFloat32AtomicAdd);}

    public int shaderBufferFloat64Atomics() {return this.ptr.get(LAYOUT__shaderBufferFloat64Atomics, OFFSET__shaderBufferFloat64Atomics);}
    public void shaderBufferFloat64Atomics(int value) {this.ptr.set(LAYOUT__shaderBufferFloat64Atomics, OFFSET__shaderBufferFloat64Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat64Atomics() {return this.ptr.asSlice(OFFSET__shaderBufferFloat64Atomics, LAYOUT__shaderBufferFloat64Atomics);}

    public int shaderBufferFloat64AtomicAdd() {return this.ptr.get(LAYOUT__shaderBufferFloat64AtomicAdd, OFFSET__shaderBufferFloat64AtomicAdd);}
    public void shaderBufferFloat64AtomicAdd(int value) {this.ptr.set(LAYOUT__shaderBufferFloat64AtomicAdd, OFFSET__shaderBufferFloat64AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $shaderBufferFloat64AtomicAdd() {return this.ptr.asSlice(OFFSET__shaderBufferFloat64AtomicAdd, LAYOUT__shaderBufferFloat64AtomicAdd);}

    public int shaderSharedFloat32Atomics() {return this.ptr.get(LAYOUT__shaderSharedFloat32Atomics, OFFSET__shaderSharedFloat32Atomics);}
    public void shaderSharedFloat32Atomics(int value) {this.ptr.set(LAYOUT__shaderSharedFloat32Atomics, OFFSET__shaderSharedFloat32Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat32Atomics() {return this.ptr.asSlice(OFFSET__shaderSharedFloat32Atomics, LAYOUT__shaderSharedFloat32Atomics);}

    public int shaderSharedFloat32AtomicAdd() {return this.ptr.get(LAYOUT__shaderSharedFloat32AtomicAdd, OFFSET__shaderSharedFloat32AtomicAdd);}
    public void shaderSharedFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT__shaderSharedFloat32AtomicAdd, OFFSET__shaderSharedFloat32AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat32AtomicAdd() {return this.ptr.asSlice(OFFSET__shaderSharedFloat32AtomicAdd, LAYOUT__shaderSharedFloat32AtomicAdd);}

    public int shaderSharedFloat64Atomics() {return this.ptr.get(LAYOUT__shaderSharedFloat64Atomics, OFFSET__shaderSharedFloat64Atomics);}
    public void shaderSharedFloat64Atomics(int value) {this.ptr.set(LAYOUT__shaderSharedFloat64Atomics, OFFSET__shaderSharedFloat64Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat64Atomics() {return this.ptr.asSlice(OFFSET__shaderSharedFloat64Atomics, LAYOUT__shaderSharedFloat64Atomics);}

    public int shaderSharedFloat64AtomicAdd() {return this.ptr.get(LAYOUT__shaderSharedFloat64AtomicAdd, OFFSET__shaderSharedFloat64AtomicAdd);}
    public void shaderSharedFloat64AtomicAdd(int value) {this.ptr.set(LAYOUT__shaderSharedFloat64AtomicAdd, OFFSET__shaderSharedFloat64AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $shaderSharedFloat64AtomicAdd() {return this.ptr.asSlice(OFFSET__shaderSharedFloat64AtomicAdd, LAYOUT__shaderSharedFloat64AtomicAdd);}

    public int shaderImageFloat32Atomics() {return this.ptr.get(LAYOUT__shaderImageFloat32Atomics, OFFSET__shaderImageFloat32Atomics);}
    public void shaderImageFloat32Atomics(int value) {this.ptr.set(LAYOUT__shaderImageFloat32Atomics, OFFSET__shaderImageFloat32Atomics, value);}
    public java.lang.foreign.MemorySegment $shaderImageFloat32Atomics() {return this.ptr.asSlice(OFFSET__shaderImageFloat32Atomics, LAYOUT__shaderImageFloat32Atomics);}

    public int shaderImageFloat32AtomicAdd() {return this.ptr.get(LAYOUT__shaderImageFloat32AtomicAdd, OFFSET__shaderImageFloat32AtomicAdd);}
    public void shaderImageFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT__shaderImageFloat32AtomicAdd, OFFSET__shaderImageFloat32AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $shaderImageFloat32AtomicAdd() {return this.ptr.asSlice(OFFSET__shaderImageFloat32AtomicAdd, LAYOUT__shaderImageFloat32AtomicAdd);}

    public int sparseImageFloat32Atomics() {return this.ptr.get(LAYOUT__sparseImageFloat32Atomics, OFFSET__sparseImageFloat32Atomics);}
    public void sparseImageFloat32Atomics(int value) {this.ptr.set(LAYOUT__sparseImageFloat32Atomics, OFFSET__sparseImageFloat32Atomics, value);}
    public java.lang.foreign.MemorySegment $sparseImageFloat32Atomics() {return this.ptr.asSlice(OFFSET__sparseImageFloat32Atomics, LAYOUT__sparseImageFloat32Atomics);}

    public int sparseImageFloat32AtomicAdd() {return this.ptr.get(LAYOUT__sparseImageFloat32AtomicAdd, OFFSET__sparseImageFloat32AtomicAdd);}
    public void sparseImageFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT__sparseImageFloat32AtomicAdd, OFFSET__sparseImageFloat32AtomicAdd, value);}
    public java.lang.foreign.MemorySegment $sparseImageFloat32AtomicAdd() {return this.ptr.asSlice(OFFSET__sparseImageFloat32AtomicAdd, LAYOUT__sparseImageFloat32AtomicAdd);}
}
