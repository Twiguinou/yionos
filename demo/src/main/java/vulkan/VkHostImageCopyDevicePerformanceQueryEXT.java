package vulkan;

public record VkHostImageCopyDevicePerformanceQueryEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__optimalDeviceAccess = java.lang.foreign.ValueLayout.JAVA_INT.withName("optimalDeviceAccess");
    public static final long OFFSET__optimalDeviceAccess = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__identicalMemoryLayout = java.lang.foreign.ValueLayout.JAVA_INT.withName("identicalMemoryLayout");
    public static final long OFFSET__identicalMemoryLayout = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__optimalDeviceAccess,
            LAYOUT__identicalMemoryLayout
    ).withByteAlignment(8).withName("VkHostImageCopyDevicePerformanceQueryEXT");

    public VkHostImageCopyDevicePerformanceQueryEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkHostImageCopyDevicePerformanceQueryEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkHostImageCopyDevicePerformanceQueryEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int optimalDeviceAccess() {return this.ptr.get(LAYOUT__optimalDeviceAccess, OFFSET__optimalDeviceAccess);}
    public void optimalDeviceAccess(int value) {this.ptr.set(LAYOUT__optimalDeviceAccess, OFFSET__optimalDeviceAccess, value);}
    public java.lang.foreign.MemorySegment $optimalDeviceAccess() {return this.ptr.asSlice(OFFSET__optimalDeviceAccess, LAYOUT__optimalDeviceAccess);}

    public int identicalMemoryLayout() {return this.ptr.get(LAYOUT__identicalMemoryLayout, OFFSET__identicalMemoryLayout);}
    public void identicalMemoryLayout(int value) {this.ptr.set(LAYOUT__identicalMemoryLayout, OFFSET__identicalMemoryLayout, value);}
    public java.lang.foreign.MemorySegment $identicalMemoryLayout() {return this.ptr.asSlice(OFFSET__identicalMemoryLayout, LAYOUT__identicalMemoryLayout);}
}
