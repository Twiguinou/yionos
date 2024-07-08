package vulkan;

public record VkDescriptorSetVariableDescriptorCountLayoutSupport(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxVariableDescriptorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxVariableDescriptorCount");
    public static final long OFFSET__maxVariableDescriptorCount = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxVariableDescriptorCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDescriptorSetVariableDescriptorCountLayoutSupport");

    public VkDescriptorSetVariableDescriptorCountLayoutSupport(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorSetVariableDescriptorCountLayoutSupport value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxVariableDescriptorCount() {return this.ptr.get(LAYOUT__maxVariableDescriptorCount, OFFSET__maxVariableDescriptorCount);}
    public void maxVariableDescriptorCount(int value) {this.ptr.set(LAYOUT__maxVariableDescriptorCount, OFFSET__maxVariableDescriptorCount, value);}
    public java.lang.foreign.MemorySegment $maxVariableDescriptorCount() {return this.ptr.asSlice(OFFSET__maxVariableDescriptorCount, LAYOUT__maxVariableDescriptorCount);}
}
