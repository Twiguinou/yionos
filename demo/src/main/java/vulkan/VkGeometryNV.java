package vulkan;

public record VkGeometryNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__geometryType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__geometryType = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__geometry = vulkan.VkGeometryDataNV.gRecordLayout;
    public static final long OFFSET__geometry = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 160;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__geometryType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__geometry,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkGeometryNV");

    public VkGeometryNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGeometryNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGeometryNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGeometryNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int geometryType() {return this.ptr.get(LAYOUT__geometryType, OFFSET__geometryType);}
    public void geometryType(int value) {this.ptr.set(LAYOUT__geometryType, OFFSET__geometryType, value);}
    public java.lang.foreign.MemorySegment $geometryType() {return this.ptr.asSlice(OFFSET__geometryType, LAYOUT__geometryType);}

    public vulkan.VkGeometryDataNV geometry() {return new vulkan.VkGeometryDataNV(this.ptr.asSlice(OFFSET__geometry, LAYOUT__geometry));}
    public void geometry(java.util.function.Consumer<vulkan.VkGeometryDataNV> consumer) {consumer.accept(this.geometry());}
    public void geometry(vulkan.VkGeometryDataNV value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__geometry, LAYOUT__geometry.byteSize());}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}
}
