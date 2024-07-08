package vulkan;

public record VkPhysicalDeviceSubgroupSizeControlFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__subgroupSizeControl = java.lang.foreign.ValueLayout.JAVA_INT.withName("subgroupSizeControl");
    public static final long OFFSET__subgroupSizeControl = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__computeFullSubgroups = java.lang.foreign.ValueLayout.JAVA_INT.withName("computeFullSubgroups");
    public static final long OFFSET__computeFullSubgroups = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__subgroupSizeControl,
            LAYOUT__computeFullSubgroups
    ).withByteAlignment(8).withName("VkPhysicalDeviceSubgroupSizeControlFeatures");

    public VkPhysicalDeviceSubgroupSizeControlFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceSubgroupSizeControlFeatures getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceSubgroupSizeControlFeatures(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceSubgroupSizeControlFeatures value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int subgroupSizeControl() {return this.ptr.get(LAYOUT__subgroupSizeControl, OFFSET__subgroupSizeControl);}
    public void subgroupSizeControl(int value) {this.ptr.set(LAYOUT__subgroupSizeControl, OFFSET__subgroupSizeControl, value);}
    public java.lang.foreign.MemorySegment $subgroupSizeControl() {return this.ptr.asSlice(OFFSET__subgroupSizeControl, LAYOUT__subgroupSizeControl);}

    public int computeFullSubgroups() {return this.ptr.get(LAYOUT__computeFullSubgroups, OFFSET__computeFullSubgroups);}
    public void computeFullSubgroups(int value) {this.ptr.set(LAYOUT__computeFullSubgroups, OFFSET__computeFullSubgroups, value);}
    public java.lang.foreign.MemorySegment $computeFullSubgroups() {return this.ptr.asSlice(OFFSET__computeFullSubgroups, LAYOUT__computeFullSubgroups);}
}
