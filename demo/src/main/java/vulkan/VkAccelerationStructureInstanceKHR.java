package vulkan;

public record VkAccelerationStructureInstanceKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__transform = vulkan.VkTransformMatrixKHR.gRecordLayout;
    public static final long OFFSET__transform = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__accelerationStructureReference = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__accelerationStructureReference = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__transform,
            java.lang.foreign.MemoryLayout.paddingLayout(8),
            LAYOUT__accelerationStructureReference
    ).withByteAlignment(8).withName("VkAccelerationStructureInstanceKHR");

    public VkAccelerationStructureInstanceKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureInstanceKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureInstanceKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureInstanceKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkTransformMatrixKHR transform() {return new vulkan.VkTransformMatrixKHR(this.ptr.asSlice(OFFSET__transform, LAYOUT__transform));}
    public void transform(java.util.function.Consumer<vulkan.VkTransformMatrixKHR> consumer) {consumer.accept(this.transform());}
    public void transform(vulkan.VkTransformMatrixKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__transform, LAYOUT__transform.byteSize());}

    public long accelerationStructureReference() {return this.ptr.get(LAYOUT__accelerationStructureReference, OFFSET__accelerationStructureReference);}
    public void accelerationStructureReference(long value) {this.ptr.set(LAYOUT__accelerationStructureReference, OFFSET__accelerationStructureReference, value);}
    public java.lang.foreign.MemorySegment $accelerationStructureReference() {return this.ptr.asSlice(OFFSET__accelerationStructureReference, LAYOUT__accelerationStructureReference);}
}
