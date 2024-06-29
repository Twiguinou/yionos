package vulkan;

public record VkDisplayPlanePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__currentDisplay = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__currentDisplay = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__currentStackIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__currentStackIndex = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__currentDisplay,
            LAYOUT__currentStackIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDisplayPlanePropertiesKHR");

    public VkDisplayPlanePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplayPlanePropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplayPlanePropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplayPlanePropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment currentDisplay() {return this.ptr.get(LAYOUT__currentDisplay, OFFSET__currentDisplay);}
    public void currentDisplay(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__currentDisplay, OFFSET__currentDisplay, value);}
    public java.lang.foreign.MemorySegment $currentDisplay() {return this.ptr.asSlice(OFFSET__currentDisplay, LAYOUT__currentDisplay);}

    public int currentStackIndex() {return this.ptr.get(LAYOUT__currentStackIndex, OFFSET__currentStackIndex);}
    public void currentStackIndex(int value) {this.ptr.set(LAYOUT__currentStackIndex, OFFSET__currentStackIndex, value);}
    public java.lang.foreign.MemorySegment $currentStackIndex() {return this.ptr.asSlice(OFFSET__currentStackIndex, LAYOUT__currentStackIndex);}
}
