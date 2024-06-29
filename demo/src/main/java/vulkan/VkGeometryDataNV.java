package vulkan;

public record VkGeometryDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__triangles = vulkan.VkGeometryTrianglesNV.gRecordLayout;
    public static final long OFFSET__triangles = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__aabbs = vulkan.VkGeometryAABBNV.gRecordLayout;
    public static final long OFFSET__aabbs = 96;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__triangles,
            LAYOUT__aabbs
    ).withByteAlignment(8).withName("VkGeometryDataNV");

    public VkGeometryDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGeometryDataNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGeometryDataNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGeometryDataNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkGeometryTrianglesNV triangles() {return new vulkan.VkGeometryTrianglesNV(this.ptr.asSlice(OFFSET__triangles, LAYOUT__triangles));}
    public void triangles(java.util.function.Consumer<vulkan.VkGeometryTrianglesNV> consumer) {consumer.accept(this.triangles());}
    public void triangles(vulkan.VkGeometryTrianglesNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__triangles, LAYOUT__triangles.byteSize());}

    public vulkan.VkGeometryAABBNV aabbs() {return new vulkan.VkGeometryAABBNV(this.ptr.asSlice(OFFSET__aabbs, LAYOUT__aabbs));}
    public void aabbs(java.util.function.Consumer<vulkan.VkGeometryAABBNV> consumer) {consumer.accept(this.aabbs());}
    public void aabbs(vulkan.VkGeometryAABBNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__aabbs, LAYOUT__aabbs.byteSize());}
}
