package vulkan;

public record VkPhysicalDeviceVariablePointersFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__variablePointersStorageBuffer = java.lang.foreign.ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer");
    public static final long OFFSET__variablePointersStorageBuffer = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__variablePointers = java.lang.foreign.ValueLayout.JAVA_INT.withName("variablePointers");
    public static final long OFFSET__variablePointers = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__variablePointersStorageBuffer,
            LAYOUT__variablePointers
    ).withByteAlignment(8).withName("VkPhysicalDeviceVariablePointersFeatures");

    public VkPhysicalDeviceVariablePointersFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceVariablePointersFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceVariablePointersFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceVariablePointersFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int variablePointersStorageBuffer() {return this.ptr.get(LAYOUT__variablePointersStorageBuffer, OFFSET__variablePointersStorageBuffer);}
    public void variablePointersStorageBuffer(int value) {this.ptr.set(LAYOUT__variablePointersStorageBuffer, OFFSET__variablePointersStorageBuffer, value);}
    public java.lang.foreign.MemorySegment $variablePointersStorageBuffer() {return this.ptr.asSlice(OFFSET__variablePointersStorageBuffer, LAYOUT__variablePointersStorageBuffer);}

    public int variablePointers() {return this.ptr.get(LAYOUT__variablePointers, OFFSET__variablePointers);}
    public void variablePointers(int value) {this.ptr.set(LAYOUT__variablePointers, OFFSET__variablePointers, value);}
    public java.lang.foreign.MemorySegment $variablePointers() {return this.ptr.asSlice(OFFSET__variablePointers, LAYOUT__variablePointers);}
}
