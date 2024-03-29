package vulkan;

public record VkWriteDescriptorSetInlineUniformBlock(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dataSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dataSize = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pData = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$dataSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pData
    ).withName("VkWriteDescriptorSetInlineUniformBlock");

    public VkWriteDescriptorSetInlineUniformBlock(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkWriteDescriptorSetInlineUniformBlock getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkWriteDescriptorSetInlineUniformBlock(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int dataSize() {return this.ptr.get(LAYOUT$dataSize, OFFSET$dataSize);}
    public void dataSize(int value) {this.ptr.set(LAYOUT$dataSize, OFFSET$dataSize, value);}
    public java.lang.foreign.MemorySegment dataSize_ptr() {return this.ptr.asSlice(OFFSET$dataSize, LAYOUT$dataSize);}

    public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT$pData, OFFSET$pData);}
    public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pData, OFFSET$pData, value);}
    public java.lang.foreign.MemorySegment pData_ptr() {return this.ptr.asSlice(OFFSET$pData, LAYOUT$pData);}
}
