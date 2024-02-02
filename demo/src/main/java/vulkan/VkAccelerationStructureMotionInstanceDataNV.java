package vulkan;

public record VkAccelerationStructureMotionInstanceDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$staticInstance = vulkan.VkAccelerationStructureInstanceKHR.gStructLayout;
    public static final long OFFSET$staticInstance = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$matrixMotionInstance = vulkan.VkAccelerationStructureMatrixMotionInstanceNV.gStructLayout;
    public static final long OFFSET$matrixMotionInstance = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$srtMotionInstance = vulkan.VkAccelerationStructureSRTMotionInstanceNV.gStructLayout;
    public static final long OFFSET$srtMotionInstance = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$staticInstance,
            LAYOUT$matrixMotionInstance,
            LAYOUT$srtMotionInstance
    ).withName("VkAccelerationStructureMotionInstanceDataNV");

    public VkAccelerationStructureMotionInstanceDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkAccelerationStructureMotionInstanceDataNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkAccelerationStructureMotionInstanceDataNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkAccelerationStructureInstanceKHR staticInstance() {return new vulkan.VkAccelerationStructureInstanceKHR(this.ptr.asSlice(OFFSET$staticInstance, LAYOUT$staticInstance));}
    public void staticInstance(java.util.function.Consumer<vulkan.VkAccelerationStructureInstanceKHR> consumer) {consumer.accept(this.staticInstance());}
    public void staticInstance(vulkan.VkAccelerationStructureInstanceKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$staticInstance, LAYOUT$staticInstance.byteSize());}

    public vulkan.VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {return new vulkan.VkAccelerationStructureMatrixMotionInstanceNV(this.ptr.asSlice(OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance));}
    public void matrixMotionInstance(java.util.function.Consumer<vulkan.VkAccelerationStructureMatrixMotionInstanceNV> consumer) {consumer.accept(this.matrixMotionInstance());}
    public void matrixMotionInstance(vulkan.VkAccelerationStructureMatrixMotionInstanceNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance.byteSize());}

    public vulkan.VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {return new vulkan.VkAccelerationStructureSRTMotionInstanceNV(this.ptr.asSlice(OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance));}
    public void srtMotionInstance(java.util.function.Consumer<vulkan.VkAccelerationStructureSRTMotionInstanceNV> consumer) {consumer.accept(this.srtMotionInstance());}
    public void srtMotionInstance(vulkan.VkAccelerationStructureSRTMotionInstanceNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance.byteSize());}
}
