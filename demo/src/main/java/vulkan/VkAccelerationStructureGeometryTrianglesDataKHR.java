package vulkan;

public record VkAccelerationStructureGeometryTrianglesDataKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__vertexFormat = 16;
    public static final java.lang.foreign.UnionLayout LAYOUT__vertexData = vulkan.VkDeviceOrHostAddressConstKHR.gRecordLayout;
    public static final long OFFSET__vertexData = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vertexStride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__vertexStride = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVertex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxVertex = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__indexType = 44;
    public static final java.lang.foreign.UnionLayout LAYOUT__indexData = vulkan.VkDeviceOrHostAddressConstKHR.gRecordLayout;
    public static final long OFFSET__indexData = 48;
    public static final java.lang.foreign.UnionLayout LAYOUT__transformData = vulkan.VkDeviceOrHostAddressConstKHR.gRecordLayout;
    public static final long OFFSET__transformData = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__vertexFormat,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__vertexData,
            LAYOUT__vertexStride,
            LAYOUT__maxVertex,
            LAYOUT__indexType,
            LAYOUT__indexData,
            LAYOUT__transformData
    ).withByteAlignment(8).withName("VkAccelerationStructureGeometryTrianglesDataKHR");

    public VkAccelerationStructureGeometryTrianglesDataKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureGeometryTrianglesDataKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int vertexFormat() {return this.ptr.get(LAYOUT__vertexFormat, OFFSET__vertexFormat);}
    public void vertexFormat(int value) {this.ptr.set(LAYOUT__vertexFormat, OFFSET__vertexFormat, value);}
    public java.lang.foreign.MemorySegment $vertexFormat() {return this.ptr.asSlice(OFFSET__vertexFormat, LAYOUT__vertexFormat);}

    public vulkan.VkDeviceOrHostAddressConstKHR vertexData() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET__vertexData, LAYOUT__vertexData));}
    public void vertexData(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.vertexData());}
    public void vertexData(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__vertexData, LAYOUT__vertexData.byteSize());}

    public long vertexStride() {return this.ptr.get(LAYOUT__vertexStride, OFFSET__vertexStride);}
    public void vertexStride(long value) {this.ptr.set(LAYOUT__vertexStride, OFFSET__vertexStride, value);}
    public java.lang.foreign.MemorySegment $vertexStride() {return this.ptr.asSlice(OFFSET__vertexStride, LAYOUT__vertexStride);}

    public int maxVertex() {return this.ptr.get(LAYOUT__maxVertex, OFFSET__maxVertex);}
    public void maxVertex(int value) {this.ptr.set(LAYOUT__maxVertex, OFFSET__maxVertex, value);}
    public java.lang.foreign.MemorySegment $maxVertex() {return this.ptr.asSlice(OFFSET__maxVertex, LAYOUT__maxVertex);}

    public int indexType() {return this.ptr.get(LAYOUT__indexType, OFFSET__indexType);}
    public void indexType(int value) {this.ptr.set(LAYOUT__indexType, OFFSET__indexType, value);}
    public java.lang.foreign.MemorySegment $indexType() {return this.ptr.asSlice(OFFSET__indexType, LAYOUT__indexType);}

    public vulkan.VkDeviceOrHostAddressConstKHR indexData() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET__indexData, LAYOUT__indexData));}
    public void indexData(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.indexData());}
    public void indexData(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__indexData, LAYOUT__indexData.byteSize());}

    public vulkan.VkDeviceOrHostAddressConstKHR transformData() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET__transformData, LAYOUT__transformData));}
    public void transformData(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.transformData());}
    public void transformData(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__transformData, LAYOUT__transformData.byteSize());}
}
