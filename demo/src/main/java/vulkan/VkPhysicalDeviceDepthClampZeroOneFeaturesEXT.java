package vulkan;

public record VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthClampZeroOne = java.lang.foreign.ValueLayout.JAVA_INT.withName("depthClampZeroOne");
    public static final long OFFSET__depthClampZeroOne = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__depthClampZeroOne,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceDepthClampZeroOneFeaturesEXT");

    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int depthClampZeroOne() {return this.ptr.get(LAYOUT__depthClampZeroOne, OFFSET__depthClampZeroOne);}
    public void depthClampZeroOne(int value) {this.ptr.set(LAYOUT__depthClampZeroOne, OFFSET__depthClampZeroOne, value);}
    public java.lang.foreign.MemorySegment $depthClampZeroOne() {return this.ptr.asSlice(OFFSET__depthClampZeroOne, LAYOUT__depthClampZeroOne);}
}
