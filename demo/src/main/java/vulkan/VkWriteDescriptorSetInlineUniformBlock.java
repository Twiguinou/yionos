package vulkan;

public record VkWriteDescriptorSetInlineUniformBlock(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dataSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("dataSize");
    public static final long OFFSET__dataSize = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pData");
    public static final long OFFSET__pData = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__dataSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pData
    ).withByteAlignment(8).withName("VkWriteDescriptorSetInlineUniformBlock");

    public VkWriteDescriptorSetInlineUniformBlock(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkWriteDescriptorSetInlineUniformBlock getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkWriteDescriptorSetInlineUniformBlock(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkWriteDescriptorSetInlineUniformBlock value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int dataSize() {return this.ptr.get(LAYOUT__dataSize, OFFSET__dataSize);}
    public void dataSize(int value) {this.ptr.set(LAYOUT__dataSize, OFFSET__dataSize, value);}
    public java.lang.foreign.MemorySegment $dataSize() {return this.ptr.asSlice(OFFSET__dataSize, LAYOUT__dataSize);}

    public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT__pData, OFFSET__pData);}
    public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pData, OFFSET__pData, value);}
    public java.lang.foreign.MemorySegment $pData() {return this.ptr.asSlice(OFFSET__pData, LAYOUT__pData);}
}
