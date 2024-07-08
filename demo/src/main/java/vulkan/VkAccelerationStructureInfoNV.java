package vulkan;

public record VkAccelerationStructureInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__instanceCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("instanceCount");
    public static final long OFFSET__instanceCount = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__geometryCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("geometryCount");
    public static final long OFFSET__geometryCount = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pGeometries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pGeometries");
    public static final long OFFSET__pGeometries = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__type,
            LAYOUT__flags,
            LAYOUT__instanceCount,
            LAYOUT__geometryCount,
            LAYOUT__pGeometries
    ).withByteAlignment(8).withName("VkAccelerationStructureInfoNV");

    public VkAccelerationStructureInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAccelerationStructureInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAccelerationStructureInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAccelerationStructureInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int instanceCount() {return this.ptr.get(LAYOUT__instanceCount, OFFSET__instanceCount);}
    public void instanceCount(int value) {this.ptr.set(LAYOUT__instanceCount, OFFSET__instanceCount, value);}
    public java.lang.foreign.MemorySegment $instanceCount() {return this.ptr.asSlice(OFFSET__instanceCount, LAYOUT__instanceCount);}

    public int geometryCount() {return this.ptr.get(LAYOUT__geometryCount, OFFSET__geometryCount);}
    public void geometryCount(int value) {this.ptr.set(LAYOUT__geometryCount, OFFSET__geometryCount, value);}
    public java.lang.foreign.MemorySegment $geometryCount() {return this.ptr.asSlice(OFFSET__geometryCount, LAYOUT__geometryCount);}

    public java.lang.foreign.MemorySegment pGeometries() {return this.ptr.get(LAYOUT__pGeometries, OFFSET__pGeometries);}
    public void pGeometries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pGeometries, OFFSET__pGeometries, value);}
    public java.lang.foreign.MemorySegment $pGeometries() {return this.ptr.asSlice(OFFSET__pGeometries, LAYOUT__pGeometries);}
}
