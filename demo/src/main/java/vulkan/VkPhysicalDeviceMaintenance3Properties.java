package vulkan;

public record VkPhysicalDeviceMaintenance3Properties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerSetDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerSetDescriptors = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxMemoryAllocationSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxMemoryAllocationSize = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxPerSetDescriptors,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$maxMemoryAllocationSize
    ).withName("VkPhysicalDeviceMaintenance3Properties");

    public VkPhysicalDeviceMaintenance3Properties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceMaintenance3Properties getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceMaintenance3Properties(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxPerSetDescriptors() {return this.ptr.get(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors);}
    public void maxPerSetDescriptors(int value) {this.ptr.set(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors, value);}
    public java.lang.foreign.MemorySegment maxPerSetDescriptors_ptr() {return this.ptr.asSlice(OFFSET$maxPerSetDescriptors, LAYOUT$maxPerSetDescriptors);}

    public long maxMemoryAllocationSize() {return this.ptr.get(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize);}
    public void maxMemoryAllocationSize(long value) {this.ptr.set(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize, value);}
    public java.lang.foreign.MemorySegment maxMemoryAllocationSize_ptr() {return this.ptr.asSlice(OFFSET$maxMemoryAllocationSize, LAYOUT$maxMemoryAllocationSize);}
}
