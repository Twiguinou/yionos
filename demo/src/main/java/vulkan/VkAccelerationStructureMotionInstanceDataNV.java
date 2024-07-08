package vulkan;

public record VkAccelerationStructureMotionInstanceDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__staticInstance = vulkan.VkAccelerationStructureInstanceKHR.gRecordLayout.withName("staticInstance");
    public static final long OFFSET__staticInstance = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__matrixMotionInstance = vulkan.VkAccelerationStructureMatrixMotionInstanceNV.gRecordLayout.withName("matrixMotionInstance");
    public static final long OFFSET__matrixMotionInstance = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__srtMotionInstance = vulkan.VkAccelerationStructureSRTMotionInstanceNV.gRecordLayout.withName("srtMotionInstance");
    public static final long OFFSET__srtMotionInstance = 0;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__staticInstance,
            LAYOUT__matrixMotionInstance,
            LAYOUT__srtMotionInstance
    ).withByteAlignment(8).withName("VkAccelerationStructureMotionInstanceDataNV");

    public VkAccelerationStructureMotionInstanceDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureMotionInstanceDataNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureMotionInstanceDataNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureMotionInstanceDataNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkAccelerationStructureInstanceKHR staticInstance() {return new vulkan.VkAccelerationStructureInstanceKHR(this.ptr.asSlice(OFFSET__staticInstance, LAYOUT__staticInstance));}
    public void staticInstance(java.util.function.Consumer<vulkan.VkAccelerationStructureInstanceKHR> consumer) {consumer.accept(this.staticInstance());}
    public void staticInstance(vulkan.VkAccelerationStructureInstanceKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__staticInstance, LAYOUT__staticInstance.byteSize());}

    public vulkan.VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {return new vulkan.VkAccelerationStructureMatrixMotionInstanceNV(this.ptr.asSlice(OFFSET__matrixMotionInstance, LAYOUT__matrixMotionInstance));}
    public void matrixMotionInstance(java.util.function.Consumer<vulkan.VkAccelerationStructureMatrixMotionInstanceNV> consumer) {consumer.accept(this.matrixMotionInstance());}
    public void matrixMotionInstance(vulkan.VkAccelerationStructureMatrixMotionInstanceNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__matrixMotionInstance, LAYOUT__matrixMotionInstance.byteSize());}

    public vulkan.VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {return new vulkan.VkAccelerationStructureSRTMotionInstanceNV(this.ptr.asSlice(OFFSET__srtMotionInstance, LAYOUT__srtMotionInstance));}
    public void srtMotionInstance(java.util.function.Consumer<vulkan.VkAccelerationStructureSRTMotionInstanceNV> consumer) {consumer.accept(this.srtMotionInstance());}
    public void srtMotionInstance(vulkan.VkAccelerationStructureSRTMotionInstanceNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__srtMotionInstance, LAYOUT__srtMotionInstance.byteSize());}
}
