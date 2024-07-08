package vulkan;

public record VkGeometryTrianglesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__vertexData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("vertexData");
    public static final long OFFSET__vertexData = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vertexOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("vertexOffset");
    public static final long OFFSET__vertexOffset = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexCount");
    public static final long OFFSET__vertexCount = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__vertexStride = java.lang.foreign.ValueLayout.JAVA_LONG.withName("vertexStride");
    public static final long OFFSET__vertexStride = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__vertexFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("vertexFormat");
    public static final long OFFSET__vertexFormat = 48;
    public static final java.lang.foreign.AddressLayout LAYOUT__indexData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("indexData");
    public static final long OFFSET__indexData = 56;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__indexOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("indexOffset");
    public static final long OFFSET__indexOffset = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("indexCount");
    public static final long OFFSET__indexCount = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__indexType = java.lang.foreign.ValueLayout.JAVA_INT.withName("indexType");
    public static final long OFFSET__indexType = 76;
    public static final java.lang.foreign.AddressLayout LAYOUT__transformData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("transformData");
    public static final long OFFSET__transformData = 80;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__transformOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("transformOffset");
    public static final long OFFSET__transformOffset = 88;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__vertexData,
            LAYOUT__vertexOffset,
            LAYOUT__vertexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__vertexStride,
            LAYOUT__vertexFormat,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__indexData,
            LAYOUT__indexOffset,
            LAYOUT__indexCount,
            LAYOUT__indexType,
            LAYOUT__transformData,
            LAYOUT__transformOffset
    ).withByteAlignment(8).withName("VkGeometryTrianglesNV");

    public VkGeometryTrianglesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGeometryTrianglesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGeometryTrianglesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGeometryTrianglesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment vertexData() {return this.ptr.get(LAYOUT__vertexData, OFFSET__vertexData);}
    public void vertexData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__vertexData, OFFSET__vertexData, value);}
    public java.lang.foreign.MemorySegment $vertexData() {return this.ptr.asSlice(OFFSET__vertexData, LAYOUT__vertexData);}

    public long vertexOffset() {return this.ptr.get(LAYOUT__vertexOffset, OFFSET__vertexOffset);}
    public void vertexOffset(long value) {this.ptr.set(LAYOUT__vertexOffset, OFFSET__vertexOffset, value);}
    public java.lang.foreign.MemorySegment $vertexOffset() {return this.ptr.asSlice(OFFSET__vertexOffset, LAYOUT__vertexOffset);}

    public int vertexCount() {return this.ptr.get(LAYOUT__vertexCount, OFFSET__vertexCount);}
    public void vertexCount(int value) {this.ptr.set(LAYOUT__vertexCount, OFFSET__vertexCount, value);}
    public java.lang.foreign.MemorySegment $vertexCount() {return this.ptr.asSlice(OFFSET__vertexCount, LAYOUT__vertexCount);}

    public long vertexStride() {return this.ptr.get(LAYOUT__vertexStride, OFFSET__vertexStride);}
    public void vertexStride(long value) {this.ptr.set(LAYOUT__vertexStride, OFFSET__vertexStride, value);}
    public java.lang.foreign.MemorySegment $vertexStride() {return this.ptr.asSlice(OFFSET__vertexStride, LAYOUT__vertexStride);}

    public int vertexFormat() {return this.ptr.get(LAYOUT__vertexFormat, OFFSET__vertexFormat);}
    public void vertexFormat(int value) {this.ptr.set(LAYOUT__vertexFormat, OFFSET__vertexFormat, value);}
    public java.lang.foreign.MemorySegment $vertexFormat() {return this.ptr.asSlice(OFFSET__vertexFormat, LAYOUT__vertexFormat);}

    public java.lang.foreign.MemorySegment indexData() {return this.ptr.get(LAYOUT__indexData, OFFSET__indexData);}
    public void indexData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__indexData, OFFSET__indexData, value);}
    public java.lang.foreign.MemorySegment $indexData() {return this.ptr.asSlice(OFFSET__indexData, LAYOUT__indexData);}

    public long indexOffset() {return this.ptr.get(LAYOUT__indexOffset, OFFSET__indexOffset);}
    public void indexOffset(long value) {this.ptr.set(LAYOUT__indexOffset, OFFSET__indexOffset, value);}
    public java.lang.foreign.MemorySegment $indexOffset() {return this.ptr.asSlice(OFFSET__indexOffset, LAYOUT__indexOffset);}

    public int indexCount() {return this.ptr.get(LAYOUT__indexCount, OFFSET__indexCount);}
    public void indexCount(int value) {this.ptr.set(LAYOUT__indexCount, OFFSET__indexCount, value);}
    public java.lang.foreign.MemorySegment $indexCount() {return this.ptr.asSlice(OFFSET__indexCount, LAYOUT__indexCount);}

    public int indexType() {return this.ptr.get(LAYOUT__indexType, OFFSET__indexType);}
    public void indexType(int value) {this.ptr.set(LAYOUT__indexType, OFFSET__indexType, value);}
    public java.lang.foreign.MemorySegment $indexType() {return this.ptr.asSlice(OFFSET__indexType, LAYOUT__indexType);}

    public java.lang.foreign.MemorySegment transformData() {return this.ptr.get(LAYOUT__transformData, OFFSET__transformData);}
    public void transformData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__transformData, OFFSET__transformData, value);}
    public java.lang.foreign.MemorySegment $transformData() {return this.ptr.asSlice(OFFSET__transformData, LAYOUT__transformData);}

    public long transformOffset() {return this.ptr.get(LAYOUT__transformOffset, OFFSET__transformOffset);}
    public void transformOffset(long value) {this.ptr.set(LAYOUT__transformOffset, OFFSET__transformOffset, value);}
    public java.lang.foreign.MemorySegment $transformOffset() {return this.ptr.asSlice(OFFSET__transformOffset, LAYOUT__transformOffset);}
}
