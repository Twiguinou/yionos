package vulkan;

public record VkMutableDescriptorTypeCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mutableDescriptorTypeListCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("mutableDescriptorTypeListCount");
    public static final long OFFSET__mutableDescriptorTypeListCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMutableDescriptorTypeLists = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pMutableDescriptorTypeLists");
    public static final long OFFSET__pMutableDescriptorTypeLists = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__mutableDescriptorTypeListCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pMutableDescriptorTypeLists
    ).withByteAlignment(8).withName("VkMutableDescriptorTypeCreateInfoEXT");

    public VkMutableDescriptorTypeCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMutableDescriptorTypeCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMutableDescriptorTypeCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMutableDescriptorTypeCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int mutableDescriptorTypeListCount() {return this.ptr.get(LAYOUT__mutableDescriptorTypeListCount, OFFSET__mutableDescriptorTypeListCount);}
    public void mutableDescriptorTypeListCount(int value) {this.ptr.set(LAYOUT__mutableDescriptorTypeListCount, OFFSET__mutableDescriptorTypeListCount, value);}
    public java.lang.foreign.MemorySegment $mutableDescriptorTypeListCount() {return this.ptr.asSlice(OFFSET__mutableDescriptorTypeListCount, LAYOUT__mutableDescriptorTypeListCount);}

    public java.lang.foreign.MemorySegment pMutableDescriptorTypeLists() {return this.ptr.get(LAYOUT__pMutableDescriptorTypeLists, OFFSET__pMutableDescriptorTypeLists);}
    public void pMutableDescriptorTypeLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMutableDescriptorTypeLists, OFFSET__pMutableDescriptorTypeLists, value);}
    public java.lang.foreign.MemorySegment $pMutableDescriptorTypeLists() {return this.ptr.asSlice(OFFSET__pMutableDescriptorTypeLists, LAYOUT__pMutableDescriptorTypeLists);}
}
