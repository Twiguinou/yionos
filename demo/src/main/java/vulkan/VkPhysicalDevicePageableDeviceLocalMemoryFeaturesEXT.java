package vulkan;

public record VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pageableDeviceLocalMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pageableDeviceLocalMemory = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pageableDeviceLocalMemory,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT");

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int pageableDeviceLocalMemory() {return this.ptr.get(LAYOUT__pageableDeviceLocalMemory, OFFSET__pageableDeviceLocalMemory);}
    public void pageableDeviceLocalMemory(int value) {this.ptr.set(LAYOUT__pageableDeviceLocalMemory, OFFSET__pageableDeviceLocalMemory, value);}
    public java.lang.foreign.MemorySegment $pageableDeviceLocalMemory() {return this.ptr.asSlice(OFFSET__pageableDeviceLocalMemory, LAYOUT__pageableDeviceLocalMemory);}
}
