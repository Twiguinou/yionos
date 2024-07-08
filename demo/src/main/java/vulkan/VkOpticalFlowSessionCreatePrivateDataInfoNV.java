package vulkan;

public record VkOpticalFlowSessionCreatePrivateDataInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__id = java.lang.foreign.ValueLayout.JAVA_INT.withName("id");
    public static final long OFFSET__id = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_INT.withName("size");
    public static final long OFFSET__size = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPrivateData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPrivateData");
    public static final long OFFSET__pPrivateData = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__id,
            LAYOUT__size,
            LAYOUT__pPrivateData
    ).withByteAlignment(8).withName("VkOpticalFlowSessionCreatePrivateDataInfoNV");

    public VkOpticalFlowSessionCreatePrivateDataInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkOpticalFlowSessionCreatePrivateDataInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int id() {return this.ptr.get(LAYOUT__id, OFFSET__id);}
    public void id(int value) {this.ptr.set(LAYOUT__id, OFFSET__id, value);}
    public java.lang.foreign.MemorySegment $id() {return this.ptr.asSlice(OFFSET__id, LAYOUT__id);}

    public int size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(int value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public java.lang.foreign.MemorySegment pPrivateData() {return this.ptr.get(LAYOUT__pPrivateData, OFFSET__pPrivateData);}
    public void pPrivateData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPrivateData, OFFSET__pPrivateData, value);}
    public java.lang.foreign.MemorySegment $pPrivateData() {return this.ptr.asSlice(OFFSET__pPrivateData, LAYOUT__pPrivateData);}
}
