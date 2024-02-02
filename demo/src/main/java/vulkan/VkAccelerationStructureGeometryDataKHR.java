package vulkan;

public record VkAccelerationStructureGeometryDataKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$triangles = vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.gStructLayout;
    public static final long OFFSET$triangles = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$aabbs = vulkan.VkAccelerationStructureGeometryAabbsDataKHR.gStructLayout;
    public static final long OFFSET$aabbs = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$instances = vulkan.VkAccelerationStructureGeometryInstancesDataKHR.gStructLayout;
    public static final long OFFSET$instances = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$triangles,
            LAYOUT$aabbs,
            LAYOUT$instances
    ).withName("VkAccelerationStructureGeometryDataKHR");

    public VkAccelerationStructureGeometryDataKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkAccelerationStructureGeometryDataKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkAccelerationStructureGeometryDataKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkAccelerationStructureGeometryTrianglesDataKHR triangles() {return new vulkan.VkAccelerationStructureGeometryTrianglesDataKHR(this.ptr.asSlice(OFFSET$triangles, LAYOUT$triangles));}
    public void triangles(java.util.function.Consumer<vulkan.VkAccelerationStructureGeometryTrianglesDataKHR> consumer) {consumer.accept(this.triangles());}
    public void triangles(vulkan.VkAccelerationStructureGeometryTrianglesDataKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$triangles, LAYOUT$triangles.byteSize());}

    public vulkan.VkAccelerationStructureGeometryAabbsDataKHR aabbs() {return new vulkan.VkAccelerationStructureGeometryAabbsDataKHR(this.ptr.asSlice(OFFSET$aabbs, LAYOUT$aabbs));}
    public void aabbs(java.util.function.Consumer<vulkan.VkAccelerationStructureGeometryAabbsDataKHR> consumer) {consumer.accept(this.aabbs());}
    public void aabbs(vulkan.VkAccelerationStructureGeometryAabbsDataKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$aabbs, LAYOUT$aabbs.byteSize());}

    public vulkan.VkAccelerationStructureGeometryInstancesDataKHR instances() {return new vulkan.VkAccelerationStructureGeometryInstancesDataKHR(this.ptr.asSlice(OFFSET$instances, LAYOUT$instances));}
    public void instances(java.util.function.Consumer<vulkan.VkAccelerationStructureGeometryInstancesDataKHR> consumer) {consumer.accept(this.instances());}
    public void instances(vulkan.VkAccelerationStructureGeometryInstancesDataKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$instances, LAYOUT$instances.byteSize());}
}
