package vulkan;

public record VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryMapPlaced = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryMapPlaced");
    public static final long OFFSET__memoryMapPlaced = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryMapRangePlaced = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryMapRangePlaced");
    public static final long OFFSET__memoryMapRangePlaced = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryUnmapReserve = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryUnmapReserve");
    public static final long OFFSET__memoryUnmapReserve = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__memoryMapPlaced,
            LAYOUT__memoryMapRangePlaced,
            LAYOUT__memoryUnmapReserve,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceMapMemoryPlacedFeaturesEXT");

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int memoryMapPlaced() {return this.ptr.get(LAYOUT__memoryMapPlaced, OFFSET__memoryMapPlaced);}
    public void memoryMapPlaced(int value) {this.ptr.set(LAYOUT__memoryMapPlaced, OFFSET__memoryMapPlaced, value);}
    public java.lang.foreign.MemorySegment $memoryMapPlaced() {return this.ptr.asSlice(OFFSET__memoryMapPlaced, LAYOUT__memoryMapPlaced);}

    public int memoryMapRangePlaced() {return this.ptr.get(LAYOUT__memoryMapRangePlaced, OFFSET__memoryMapRangePlaced);}
    public void memoryMapRangePlaced(int value) {this.ptr.set(LAYOUT__memoryMapRangePlaced, OFFSET__memoryMapRangePlaced, value);}
    public java.lang.foreign.MemorySegment $memoryMapRangePlaced() {return this.ptr.asSlice(OFFSET__memoryMapRangePlaced, LAYOUT__memoryMapRangePlaced);}

    public int memoryUnmapReserve() {return this.ptr.get(LAYOUT__memoryUnmapReserve, OFFSET__memoryUnmapReserve);}
    public void memoryUnmapReserve(int value) {this.ptr.set(LAYOUT__memoryUnmapReserve, OFFSET__memoryUnmapReserve, value);}
    public java.lang.foreign.MemorySegment $memoryUnmapReserve() {return this.ptr.asSlice(OFFSET__memoryUnmapReserve, LAYOUT__memoryUnmapReserve);}
}
