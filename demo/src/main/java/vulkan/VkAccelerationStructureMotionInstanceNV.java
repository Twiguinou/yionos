package vulkan;

public record VkAccelerationStructureMotionInstanceNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 4;
    public static final java.lang.foreign.UnionLayout LAYOUT__data = vulkan.VkAccelerationStructureMotionInstanceDataNV.gRecordLayout.withName("data");
    public static final long OFFSET__data = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__type,
            LAYOUT__flags,
            LAYOUT__data
    ).withByteAlignment(8).withName("VkAccelerationStructureMotionInstanceNV");

    public VkAccelerationStructureMotionInstanceNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureMotionInstanceNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureMotionInstanceNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureMotionInstanceNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public vulkan.VkAccelerationStructureMotionInstanceDataNV data() {return new vulkan.VkAccelerationStructureMotionInstanceDataNV(this.ptr.asSlice(OFFSET__data, LAYOUT__data));}
    public void data(java.util.function.Consumer<vulkan.VkAccelerationStructureMotionInstanceDataNV> consumer) {consumer.accept(this.data());}
    public void data(vulkan.VkAccelerationStructureMotionInstanceDataNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__data, LAYOUT__data.byteSize());}
}
