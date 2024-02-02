package vulkan;

public record VkGeometryDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$triangles = vulkan.VkGeometryTrianglesNV.gStructLayout;
    public static final long OFFSET$triangles = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$aabbs = vulkan.VkGeometryAABBNV.gStructLayout;
    public static final long OFFSET$aabbs = 96L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$triangles,
            LAYOUT$aabbs
    ).withName("VkGeometryDataNV");

    public VkGeometryDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkGeometryDataNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkGeometryDataNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkGeometryTrianglesNV triangles() {return new vulkan.VkGeometryTrianglesNV(this.ptr.asSlice(OFFSET$triangles, LAYOUT$triangles));}
    public void triangles(java.util.function.Consumer<vulkan.VkGeometryTrianglesNV> consumer) {consumer.accept(this.triangles());}
    public void triangles(vulkan.VkGeometryTrianglesNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$triangles, LAYOUT$triangles.byteSize());}

    public vulkan.VkGeometryAABBNV aabbs() {return new vulkan.VkGeometryAABBNV(this.ptr.asSlice(OFFSET$aabbs, LAYOUT$aabbs));}
    public void aabbs(java.util.function.Consumer<vulkan.VkGeometryAABBNV> consumer) {consumer.accept(this.aabbs());}
    public void aabbs(vulkan.VkGeometryAABBNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$aabbs, LAYOUT$aabbs.byteSize());}
}
