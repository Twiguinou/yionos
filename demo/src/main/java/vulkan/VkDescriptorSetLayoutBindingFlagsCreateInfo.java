package vulkan;

public record VkDescriptorSetLayoutBindingFlagsCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bindingCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("bindingCount");
    public static final long OFFSET__bindingCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBindingFlags = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pBindingFlags");
    public static final long OFFSET__pBindingFlags = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__bindingCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pBindingFlags
    ).withByteAlignment(8).withName("VkDescriptorSetLayoutBindingFlagsCreateInfo");

    public VkDescriptorSetLayoutBindingFlagsCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorSetLayoutBindingFlagsCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int bindingCount() {return this.ptr.get(LAYOUT__bindingCount, OFFSET__bindingCount);}
    public void bindingCount(int value) {this.ptr.set(LAYOUT__bindingCount, OFFSET__bindingCount, value);}
    public java.lang.foreign.MemorySegment $bindingCount() {return this.ptr.asSlice(OFFSET__bindingCount, LAYOUT__bindingCount);}

    public java.lang.foreign.MemorySegment pBindingFlags() {return this.ptr.get(LAYOUT__pBindingFlags, OFFSET__pBindingFlags);}
    public void pBindingFlags(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBindingFlags, OFFSET__pBindingFlags, value);}
    public java.lang.foreign.MemorySegment $pBindingFlags() {return this.ptr.asSlice(OFFSET__pBindingFlags, LAYOUT__pBindingFlags);}
}
