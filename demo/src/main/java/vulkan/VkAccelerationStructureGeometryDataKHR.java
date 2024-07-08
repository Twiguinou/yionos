package vulkan;

public record VkAccelerationStructureGeometryDataKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__triangles = vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.gRecordLayout.withName("triangles");
    public static final long OFFSET__triangles = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__aabbs = vulkan.VkAccelerationStructureGeometryAabbsDataKHR.gRecordLayout.withName("aabbs");
    public static final long OFFSET__aabbs = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__instances = vulkan.VkAccelerationStructureGeometryInstancesDataKHR.gRecordLayout.withName("instances");
    public static final long OFFSET__instances = 0;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__triangles,
            LAYOUT__aabbs,
            LAYOUT__instances
    ).withByteAlignment(8).withName("VkAccelerationStructureGeometryDataKHR");

    public VkAccelerationStructureGeometryDataKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureGeometryDataKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureGeometryDataKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureGeometryDataKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkAccelerationStructureGeometryTrianglesDataKHR triangles() {return new vulkan.VkAccelerationStructureGeometryTrianglesDataKHR(this.ptr.asSlice(OFFSET__triangles, LAYOUT__triangles));}
    public void triangles(java.util.function.Consumer<vulkan.VkAccelerationStructureGeometryTrianglesDataKHR> consumer) {consumer.accept(this.triangles());}
    public void triangles(vulkan.VkAccelerationStructureGeometryTrianglesDataKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__triangles, LAYOUT__triangles.byteSize());}

    public vulkan.VkAccelerationStructureGeometryAabbsDataKHR aabbs() {return new vulkan.VkAccelerationStructureGeometryAabbsDataKHR(this.ptr.asSlice(OFFSET__aabbs, LAYOUT__aabbs));}
    public void aabbs(java.util.function.Consumer<vulkan.VkAccelerationStructureGeometryAabbsDataKHR> consumer) {consumer.accept(this.aabbs());}
    public void aabbs(vulkan.VkAccelerationStructureGeometryAabbsDataKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__aabbs, LAYOUT__aabbs.byteSize());}

    public vulkan.VkAccelerationStructureGeometryInstancesDataKHR instances() {return new vulkan.VkAccelerationStructureGeometryInstancesDataKHR(this.ptr.asSlice(OFFSET__instances, LAYOUT__instances));}
    public void instances(java.util.function.Consumer<vulkan.VkAccelerationStructureGeometryInstancesDataKHR> consumer) {consumer.accept(this.instances());}
    public void instances(vulkan.VkAccelerationStructureGeometryInstancesDataKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__instances, LAYOUT__instances.byteSize());}
}
