package vulkan;

public record VkPhysicalDeviceMeshShaderFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__taskShader = java.lang.foreign.ValueLayout.JAVA_INT.withName("taskShader");
    public static final long OFFSET__taskShader = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__meshShader = java.lang.foreign.ValueLayout.JAVA_INT.withName("meshShader");
    public static final long OFFSET__meshShader = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__taskShader,
            LAYOUT__meshShader
    ).withByteAlignment(8).withName("VkPhysicalDeviceMeshShaderFeaturesNV");

    public VkPhysicalDeviceMeshShaderFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMeshShaderFeaturesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int taskShader() {return this.ptr.get(LAYOUT__taskShader, OFFSET__taskShader);}
    public void taskShader(int value) {this.ptr.set(LAYOUT__taskShader, OFFSET__taskShader, value);}
    public java.lang.foreign.MemorySegment $taskShader() {return this.ptr.asSlice(OFFSET__taskShader, LAYOUT__taskShader);}

    public int meshShader() {return this.ptr.get(LAYOUT__meshShader, OFFSET__meshShader);}
    public void meshShader(int value) {this.ptr.set(LAYOUT__meshShader, OFFSET__meshShader, value);}
    public java.lang.foreign.MemorySegment $meshShader() {return this.ptr.asSlice(OFFSET__meshShader, LAYOUT__meshShader);}
}
