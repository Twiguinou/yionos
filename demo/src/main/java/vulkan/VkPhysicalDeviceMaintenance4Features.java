package vulkan;

public record VkPhysicalDeviceMaintenance4Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maintenance4 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maintenance4 = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maintenance4,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceMaintenance4Features");

    public VkPhysicalDeviceMaintenance4Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceMaintenance4Features getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceMaintenance4Features(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maintenance4() {return this.ptr.get(LAYOUT$maintenance4, OFFSET$maintenance4);}
    public void maintenance4(int value) {this.ptr.set(LAYOUT$maintenance4, OFFSET$maintenance4, value);}
    public java.lang.foreign.MemorySegment maintenance4_ptr() {return this.ptr.asSlice(OFFSET$maintenance4, LAYOUT$maintenance4);}
}
