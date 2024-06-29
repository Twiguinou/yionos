package vulkan;

public record VkAccelerationStructureMatrixMotionInstanceNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__transformT0 = vulkan.VkTransformMatrixKHR.gRecordLayout;
    public static final long OFFSET__transformT0 = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__transformT1 = vulkan.VkTransformMatrixKHR.gRecordLayout;
    public static final long OFFSET__transformT1 = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__accelerationStructureReference = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__accelerationStructureReference = 104;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__transformT0,
            LAYOUT__transformT1,
            java.lang.foreign.MemoryLayout.paddingLayout(8),
            LAYOUT__accelerationStructureReference
    ).withByteAlignment(8).withName("VkAccelerationStructureMatrixMotionInstanceNV");

    public VkAccelerationStructureMatrixMotionInstanceNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureMatrixMotionInstanceNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureMatrixMotionInstanceNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkTransformMatrixKHR transformT0() {return new vulkan.VkTransformMatrixKHR(this.ptr.asSlice(OFFSET__transformT0, LAYOUT__transformT0));}
    public void transformT0(java.util.function.Consumer<vulkan.VkTransformMatrixKHR> consumer) {consumer.accept(this.transformT0());}
    public void transformT0(vulkan.VkTransformMatrixKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__transformT0, LAYOUT__transformT0.byteSize());}

    public vulkan.VkTransformMatrixKHR transformT1() {return new vulkan.VkTransformMatrixKHR(this.ptr.asSlice(OFFSET__transformT1, LAYOUT__transformT1));}
    public void transformT1(java.util.function.Consumer<vulkan.VkTransformMatrixKHR> consumer) {consumer.accept(this.transformT1());}
    public void transformT1(vulkan.VkTransformMatrixKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__transformT1, LAYOUT__transformT1.byteSize());}

    public long accelerationStructureReference() {return this.ptr.get(LAYOUT__accelerationStructureReference, OFFSET__accelerationStructureReference);}
    public void accelerationStructureReference(long value) {this.ptr.set(LAYOUT__accelerationStructureReference, OFFSET__accelerationStructureReference, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureReference() {return this.ptr.asSlice(OFFSET__accelerationStructureReference, LAYOUT__accelerationStructureReference);}
}
