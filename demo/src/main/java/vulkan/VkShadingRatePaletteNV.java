package vulkan;

public record VkShadingRatePaletteNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shadingRatePaletteEntryCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount");
    public static final long OFFSET__shadingRatePaletteEntryCount = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pShadingRatePaletteEntries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pShadingRatePaletteEntries");
    public static final long OFFSET__pShadingRatePaletteEntries = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__shadingRatePaletteEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pShadingRatePaletteEntries
    ).withByteAlignment(8).withName("VkShadingRatePaletteNV");

    public VkShadingRatePaletteNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkShadingRatePaletteNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkShadingRatePaletteNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkShadingRatePaletteNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int shadingRatePaletteEntryCount() {return this.ptr.get(LAYOUT__shadingRatePaletteEntryCount, OFFSET__shadingRatePaletteEntryCount);}
    public void shadingRatePaletteEntryCount(int value) {this.ptr.set(LAYOUT__shadingRatePaletteEntryCount, OFFSET__shadingRatePaletteEntryCount, value);}
    public java.lang.foreign.MemorySegment $shadingRatePaletteEntryCount() {return this.ptr.asSlice(OFFSET__shadingRatePaletteEntryCount, LAYOUT__shadingRatePaletteEntryCount);}

    public java.lang.foreign.MemorySegment pShadingRatePaletteEntries() {return this.ptr.get(LAYOUT__pShadingRatePaletteEntries, OFFSET__pShadingRatePaletteEntries);}
    public void pShadingRatePaletteEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pShadingRatePaletteEntries, OFFSET__pShadingRatePaletteEntries, value);}
    public java.lang.foreign.MemorySegment $pShadingRatePaletteEntries() {return this.ptr.asSlice(OFFSET__pShadingRatePaletteEntries, LAYOUT__pShadingRatePaletteEntries);}
}
