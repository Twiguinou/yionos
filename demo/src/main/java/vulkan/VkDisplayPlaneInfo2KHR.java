package vulkan;

public record VkDisplayPlaneInfo2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__mode = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__planeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__planeIndex = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__mode,
            LAYOUT__planeIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDisplayPlaneInfo2KHR");

    public VkDisplayPlaneInfo2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplayPlaneInfo2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplayPlaneInfo2KHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplayPlaneInfo2KHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment mode() {return this.ptr.get(LAYOUT__mode, OFFSET__mode);}
    public void mode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mode, OFFSET__mode, value);}
    public java.lang.foreign.MemorySegment $mode() {return this.ptr.asSlice(OFFSET__mode, LAYOUT__mode);}

    public int planeIndex() {return this.ptr.get(LAYOUT__planeIndex, OFFSET__planeIndex);}
    public void planeIndex(int value) {this.ptr.set(LAYOUT__planeIndex, OFFSET__planeIndex, value);}
    public java.lang.foreign.MemorySegment $planeIndex() {return this.ptr.asSlice(OFFSET__planeIndex, LAYOUT__planeIndex);}
}
