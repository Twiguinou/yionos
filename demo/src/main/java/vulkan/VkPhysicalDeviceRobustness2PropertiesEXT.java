package vulkan;

public record VkPhysicalDeviceRobustness2PropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__robustStorageBufferAccessSizeAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment");
    public static final long OFFSET__robustStorageBufferAccessSizeAlignment = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__robustUniformBufferAccessSizeAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment");
    public static final long OFFSET__robustUniformBufferAccessSizeAlignment = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__robustStorageBufferAccessSizeAlignment,
            LAYOUT__robustUniformBufferAccessSizeAlignment
    ).withByteAlignment(8).withName("VkPhysicalDeviceRobustness2PropertiesEXT");

    public VkPhysicalDeviceRobustness2PropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRobustness2PropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long robustStorageBufferAccessSizeAlignment() {return this.ptr.get(LAYOUT__robustStorageBufferAccessSizeAlignment, OFFSET__robustStorageBufferAccessSizeAlignment);}
    public void robustStorageBufferAccessSizeAlignment(long value) {this.ptr.set(LAYOUT__robustStorageBufferAccessSizeAlignment, OFFSET__robustStorageBufferAccessSizeAlignment, value);}
    public java.lang.foreign.MemorySegment $robustStorageBufferAccessSizeAlignment() {return this.ptr.asSlice(OFFSET__robustStorageBufferAccessSizeAlignment, LAYOUT__robustStorageBufferAccessSizeAlignment);}

    public long robustUniformBufferAccessSizeAlignment() {return this.ptr.get(LAYOUT__robustUniformBufferAccessSizeAlignment, OFFSET__robustUniformBufferAccessSizeAlignment);}
    public void robustUniformBufferAccessSizeAlignment(long value) {this.ptr.set(LAYOUT__robustUniformBufferAccessSizeAlignment, OFFSET__robustUniformBufferAccessSizeAlignment, value);}
    public java.lang.foreign.MemorySegment $robustUniformBufferAccessSizeAlignment() {return this.ptr.asSlice(OFFSET__robustUniformBufferAccessSizeAlignment, LAYOUT__robustUniformBufferAccessSizeAlignment);}
}
