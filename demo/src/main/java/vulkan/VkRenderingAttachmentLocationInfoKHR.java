package vulkan;

public record VkRenderingAttachmentLocationInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("colorAttachmentCount");
    public static final long OFFSET__colorAttachmentCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pColorAttachmentLocations = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pColorAttachmentLocations");
    public static final long OFFSET__pColorAttachmentLocations = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__colorAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pColorAttachmentLocations
    ).withByteAlignment(8).withName("VkRenderingAttachmentLocationInfoKHR");

    public VkRenderingAttachmentLocationInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderingAttachmentLocationInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderingAttachmentLocationInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderingAttachmentLocationInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT__colorAttachmentCount, OFFSET__colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment $colorAttachmentCount() {return this.ptr.asSlice(OFFSET__colorAttachmentCount, LAYOUT__colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachmentLocations() {return this.ptr.get(LAYOUT__pColorAttachmentLocations, OFFSET__pColorAttachmentLocations);}
    public void pColorAttachmentLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pColorAttachmentLocations, OFFSET__pColorAttachmentLocations, value);}
    public java.lang.foreign.MemorySegment $pColorAttachmentLocations() {return this.ptr.asSlice(OFFSET__pColorAttachmentLocations, LAYOUT__pColorAttachmentLocations);}
}
