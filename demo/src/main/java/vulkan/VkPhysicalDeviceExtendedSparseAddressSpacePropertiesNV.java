package vulkan;

public record VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__extendedSparseAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("extendedSparseAddressSpaceSize");
    public static final long OFFSET__extendedSparseAddressSpaceSize = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedSparseImageUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedSparseImageUsageFlags");
    public static final long OFFSET__extendedSparseImageUsageFlags = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__extendedSparseBufferUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("extendedSparseBufferUsageFlags");
    public static final long OFFSET__extendedSparseBufferUsageFlags = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__extendedSparseAddressSpaceSize,
            LAYOUT__extendedSparseImageUsageFlags,
            LAYOUT__extendedSparseBufferUsageFlags
    ).withByteAlignment(8).withName("VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV");

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long extendedSparseAddressSpaceSize() {return this.ptr.get(LAYOUT__extendedSparseAddressSpaceSize, OFFSET__extendedSparseAddressSpaceSize);}
    public void extendedSparseAddressSpaceSize(long value) {this.ptr.set(LAYOUT__extendedSparseAddressSpaceSize, OFFSET__extendedSparseAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment $extendedSparseAddressSpaceSize() {return this.ptr.asSlice(OFFSET__extendedSparseAddressSpaceSize, LAYOUT__extendedSparseAddressSpaceSize);}

    public int extendedSparseImageUsageFlags() {return this.ptr.get(LAYOUT__extendedSparseImageUsageFlags, OFFSET__extendedSparseImageUsageFlags);}
    public void extendedSparseImageUsageFlags(int value) {this.ptr.set(LAYOUT__extendedSparseImageUsageFlags, OFFSET__extendedSparseImageUsageFlags, value);}
    public java.lang.foreign.MemorySegment $extendedSparseImageUsageFlags() {return this.ptr.asSlice(OFFSET__extendedSparseImageUsageFlags, LAYOUT__extendedSparseImageUsageFlags);}

    public int extendedSparseBufferUsageFlags() {return this.ptr.get(LAYOUT__extendedSparseBufferUsageFlags, OFFSET__extendedSparseBufferUsageFlags);}
    public void extendedSparseBufferUsageFlags(int value) {this.ptr.set(LAYOUT__extendedSparseBufferUsageFlags, OFFSET__extendedSparseBufferUsageFlags, value);}
    public java.lang.foreign.MemorySegment $extendedSparseBufferUsageFlags() {return this.ptr.asSlice(OFFSET__extendedSparseBufferUsageFlags, LAYOUT__extendedSparseBufferUsageFlags);}
}
