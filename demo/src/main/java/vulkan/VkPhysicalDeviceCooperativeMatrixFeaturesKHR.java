package vulkan;

public record VkPhysicalDeviceCooperativeMatrixFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cooperativeMatrix = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cooperativeMatrix = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cooperativeMatrixRobustBufferAccess = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cooperativeMatrixRobustBufferAccess = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$cooperativeMatrix,
            LAYOUT$cooperativeMatrixRobustBufferAccess
    ).withName("VkPhysicalDeviceCooperativeMatrixFeaturesKHR");

    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int cooperativeMatrix() {return this.ptr.get(LAYOUT$cooperativeMatrix, OFFSET$cooperativeMatrix);}
    public void cooperativeMatrix(int value) {this.ptr.set(LAYOUT$cooperativeMatrix, OFFSET$cooperativeMatrix, value);}
    public java.lang.foreign.MemorySegment cooperativeMatrix_ptr() {return this.ptr.asSlice(OFFSET$cooperativeMatrix, LAYOUT$cooperativeMatrix);}

    public int cooperativeMatrixRobustBufferAccess() {return this.ptr.get(LAYOUT$cooperativeMatrixRobustBufferAccess, OFFSET$cooperativeMatrixRobustBufferAccess);}
    public void cooperativeMatrixRobustBufferAccess(int value) {this.ptr.set(LAYOUT$cooperativeMatrixRobustBufferAccess, OFFSET$cooperativeMatrixRobustBufferAccess, value);}
    public java.lang.foreign.MemorySegment cooperativeMatrixRobustBufferAccess_ptr() {return this.ptr.asSlice(OFFSET$cooperativeMatrixRobustBufferAccess, LAYOUT$cooperativeMatrixRobustBufferAccess);}
}
