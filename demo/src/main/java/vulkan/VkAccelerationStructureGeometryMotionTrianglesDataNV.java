package vulkan;

public record VkAccelerationStructureGeometryMotionTrianglesDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$vertexData = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
    public static final long OFFSET$vertexData = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$vertexData
    ).withName("VkAccelerationStructureGeometryMotionTrianglesDataNV");

    public VkAccelerationStructureGeometryMotionTrianglesDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkDeviceOrHostAddressConstKHR vertexData() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$vertexData, LAYOUT$vertexData));}
    public void vertexData(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.vertexData());}
    public void vertexData(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$vertexData, LAYOUT$vertexData.byteSize());}
}
