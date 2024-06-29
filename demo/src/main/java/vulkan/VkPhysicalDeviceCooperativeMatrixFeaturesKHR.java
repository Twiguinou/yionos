package vulkan;

public record VkPhysicalDeviceCooperativeMatrixFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cooperativeMatrix = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cooperativeMatrix = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cooperativeMatrixRobustBufferAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cooperativeMatrixRobustBufferAccess = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__cooperativeMatrix,
            LAYOUT__cooperativeMatrixRobustBufferAccess
    ).withByteAlignment(8).withName("VkPhysicalDeviceCooperativeMatrixFeaturesKHR");

    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceCooperativeMatrixFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int cooperativeMatrix() {return this.ptr.get(LAYOUT__cooperativeMatrix, OFFSET__cooperativeMatrix);}
    public void cooperativeMatrix(int value) {this.ptr.set(LAYOUT__cooperativeMatrix, OFFSET__cooperativeMatrix, value);}
    public java.lang.foreign.MemorySegment $cooperativeMatrix() {return this.ptr.asSlice(OFFSET__cooperativeMatrix, LAYOUT__cooperativeMatrix);}

    public int cooperativeMatrixRobustBufferAccess() {return this.ptr.get(LAYOUT__cooperativeMatrixRobustBufferAccess, OFFSET__cooperativeMatrixRobustBufferAccess);}
    public void cooperativeMatrixRobustBufferAccess(int value) {this.ptr.set(LAYOUT__cooperativeMatrixRobustBufferAccess, OFFSET__cooperativeMatrixRobustBufferAccess, value);}
    public java.lang.foreign.MemorySegment $cooperativeMatrixRobustBufferAccess() {return this.ptr.asSlice(OFFSET__cooperativeMatrixRobustBufferAccess, LAYOUT__cooperativeMatrixRobustBufferAccess);}
}
