package vulkan;

public record VkAccelerationStructureTrianglesOpacityMicromapEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexType = java.lang.foreign.ValueLayout.JAVA_INT.withName("indexType");
    public static final long OFFSET__indexType = 16;
    public static final java.lang.foreign.UnionLayout LAYOUT__indexBuffer = vulkan.VkDeviceOrHostAddressConstKHR.gRecordLayout.withName("indexBuffer");
    public static final long OFFSET__indexBuffer = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__indexStride = java.lang.foreign.ValueLayout.JAVA_LONG.withName("indexStride");
    public static final long OFFSET__indexStride = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__baseTriangle = java.lang.foreign.ValueLayout.JAVA_INT.withName("baseTriangle");
    public static final long OFFSET__baseTriangle = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__usageCountsCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("usageCountsCount");
    public static final long OFFSET__usageCountsCount = 44;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUsageCounts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pUsageCounts");
    public static final long OFFSET__pUsageCounts = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__ppUsageCounts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ppUsageCounts");
    public static final long OFFSET__ppUsageCounts = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__micromap = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("micromap");
    public static final long OFFSET__micromap = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__indexType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__indexBuffer,
            LAYOUT__indexStride,
            LAYOUT__baseTriangle,
            LAYOUT__usageCountsCount,
            LAYOUT__pUsageCounts,
            LAYOUT__ppUsageCounts,
            LAYOUT__micromap
    ).withByteAlignment(8).withName("VkAccelerationStructureTrianglesOpacityMicromapEXT");

    public VkAccelerationStructureTrianglesOpacityMicromapEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureTrianglesOpacityMicromapEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int indexType() {return this.ptr.get(LAYOUT__indexType, OFFSET__indexType);}
    public void indexType(int value) {this.ptr.set(LAYOUT__indexType, OFFSET__indexType, value);}
    public java.lang.foreign.MemorySegment $indexType() {return this.ptr.asSlice(OFFSET__indexType, LAYOUT__indexType);}

    public vulkan.VkDeviceOrHostAddressConstKHR indexBuffer() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET__indexBuffer, LAYOUT__indexBuffer));}
    public void indexBuffer(java.util.function.Consumer<vulkan.VkDeviceOrHostAddressConstKHR> consumer) {consumer.accept(this.indexBuffer());}
    public void indexBuffer(vulkan.VkDeviceOrHostAddressConstKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__indexBuffer, LAYOUT__indexBuffer.byteSize());}

    public long indexStride() {return this.ptr.get(LAYOUT__indexStride, OFFSET__indexStride);}
    public void indexStride(long value) {this.ptr.set(LAYOUT__indexStride, OFFSET__indexStride, value);}
    public java.lang.foreign.MemorySegment $indexStride() {return this.ptr.asSlice(OFFSET__indexStride, LAYOUT__indexStride);}

    public int baseTriangle() {return this.ptr.get(LAYOUT__baseTriangle, OFFSET__baseTriangle);}
    public void baseTriangle(int value) {this.ptr.set(LAYOUT__baseTriangle, OFFSET__baseTriangle, value);}
    public java.lang.foreign.MemorySegment $baseTriangle() {return this.ptr.asSlice(OFFSET__baseTriangle, LAYOUT__baseTriangle);}

    public int usageCountsCount() {return this.ptr.get(LAYOUT__usageCountsCount, OFFSET__usageCountsCount);}
    public void usageCountsCount(int value) {this.ptr.set(LAYOUT__usageCountsCount, OFFSET__usageCountsCount, value);}
    public java.lang.foreign.MemorySegment $usageCountsCount() {return this.ptr.asSlice(OFFSET__usageCountsCount, LAYOUT__usageCountsCount);}

    public java.lang.foreign.MemorySegment pUsageCounts() {return this.ptr.get(LAYOUT__pUsageCounts, OFFSET__pUsageCounts);}
    public void pUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUsageCounts, OFFSET__pUsageCounts, value);}
    public java.lang.foreign.MemorySegment $pUsageCounts() {return this.ptr.asSlice(OFFSET__pUsageCounts, LAYOUT__pUsageCounts);}

    public java.lang.foreign.MemorySegment ppUsageCounts() {return this.ptr.get(LAYOUT__ppUsageCounts, OFFSET__ppUsageCounts);}
    public void ppUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ppUsageCounts, OFFSET__ppUsageCounts, value);}
    public java.lang.foreign.MemorySegment $ppUsageCounts() {return this.ptr.asSlice(OFFSET__ppUsageCounts, LAYOUT__ppUsageCounts);}

    public java.lang.foreign.MemorySegment micromap() {return this.ptr.get(LAYOUT__micromap, OFFSET__micromap);}
    public void micromap(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__micromap, OFFSET__micromap, value);}
    public java.lang.foreign.MemorySegment $micromap() {return this.ptr.asSlice(OFFSET__micromap, LAYOUT__micromap);}
}
