package vulkan;

public record VkGeometryAABBNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__aabbData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("aabbData");
    public static final long OFFSET__aabbData = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numAABBs = java.lang.foreign.ValueLayout.JAVA_INT.withName("numAABBs");
    public static final long OFFSET__numAABBs = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stride = java.lang.foreign.ValueLayout.JAVA_INT.withName("stride");
    public static final long OFFSET__stride = 28;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("offset");
    public static final long OFFSET__offset = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__aabbData,
            LAYOUT__numAABBs,
            LAYOUT__stride,
            LAYOUT__offset
    ).withByteAlignment(8).withName("VkGeometryAABBNV");

    public VkGeometryAABBNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGeometryAABBNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGeometryAABBNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGeometryAABBNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment aabbData() {return this.ptr.get(LAYOUT__aabbData, OFFSET__aabbData);}
    public void aabbData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__aabbData, OFFSET__aabbData, value);}
    public java.lang.foreign.MemorySegment $aabbData() {return this.ptr.asSlice(OFFSET__aabbData, LAYOUT__aabbData);}

    public int numAABBs() {return this.ptr.get(LAYOUT__numAABBs, OFFSET__numAABBs);}
    public void numAABBs(int value) {this.ptr.set(LAYOUT__numAABBs, OFFSET__numAABBs, value);}
    public java.lang.foreign.MemorySegment $numAABBs() {return this.ptr.asSlice(OFFSET__numAABBs, LAYOUT__numAABBs);}

    public int stride() {return this.ptr.get(LAYOUT__stride, OFFSET__stride);}
    public void stride(int value) {this.ptr.set(LAYOUT__stride, OFFSET__stride, value);}
    public java.lang.foreign.MemorySegment $stride() {return this.ptr.asSlice(OFFSET__stride, LAYOUT__stride);}

    public long offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(long value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}
}
