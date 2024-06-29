package vulkan;

public record VkPhysicalDeviceMaintenance3Properties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxPerSetDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxPerSetDescriptors = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxMemoryAllocationSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxMemoryAllocationSize = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxPerSetDescriptors,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__maxMemoryAllocationSize
    ).withByteAlignment(8).withName("VkPhysicalDeviceMaintenance3Properties");

    public VkPhysicalDeviceMaintenance3Properties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMaintenance3Properties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMaintenance3Properties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMaintenance3Properties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxPerSetDescriptors() {return this.ptr.get(LAYOUT__maxPerSetDescriptors, OFFSET__maxPerSetDescriptors);}
    public void maxPerSetDescriptors(int value) {this.ptr.set(LAYOUT__maxPerSetDescriptors, OFFSET__maxPerSetDescriptors, value);}
    public java.lang.foreign.MemorySegment $maxPerSetDescriptors() {return this.ptr.asSlice(OFFSET__maxPerSetDescriptors, LAYOUT__maxPerSetDescriptors);}

    public long maxMemoryAllocationSize() {return this.ptr.get(LAYOUT__maxMemoryAllocationSize, OFFSET__maxMemoryAllocationSize);}
    public void maxMemoryAllocationSize(long value) {this.ptr.set(LAYOUT__maxMemoryAllocationSize, OFFSET__maxMemoryAllocationSize, value);}
    public java.lang.foreign.MemorySegment $maxMemoryAllocationSize() {return this.ptr.asSlice(OFFSET__maxMemoryAllocationSize, LAYOUT__maxMemoryAllocationSize);}
}
