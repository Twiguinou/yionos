package vulkan;

public record VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dynamicPrimitiveTopologyUnrestricted = java.lang.foreign.ValueLayout.JAVA_INT.withName("dynamicPrimitiveTopologyUnrestricted");
    public static final long OFFSET__dynamicPrimitiveTopologyUnrestricted = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__dynamicPrimitiveTopologyUnrestricted,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceExtendedDynamicState3PropertiesEXT");

    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceExtendedDynamicState3PropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int dynamicPrimitiveTopologyUnrestricted() {return this.ptr.get(LAYOUT__dynamicPrimitiveTopologyUnrestricted, OFFSET__dynamicPrimitiveTopologyUnrestricted);}
    public void dynamicPrimitiveTopologyUnrestricted(int value) {this.ptr.set(LAYOUT__dynamicPrimitiveTopologyUnrestricted, OFFSET__dynamicPrimitiveTopologyUnrestricted, value);}
    public java.lang.foreign.MemorySegment $dynamicPrimitiveTopologyUnrestricted() {return this.ptr.asSlice(OFFSET__dynamicPrimitiveTopologyUnrestricted, LAYOUT__dynamicPrimitiveTopologyUnrestricted);}
}
