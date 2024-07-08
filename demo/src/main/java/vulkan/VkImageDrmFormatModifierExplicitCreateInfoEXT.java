package vulkan;

public record VkImageDrmFormatModifierExplicitCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__drmFormatModifier = java.lang.foreign.ValueLayout.JAVA_LONG.withName("drmFormatModifier");
    public static final long OFFSET__drmFormatModifier = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__drmFormatModifierPlaneCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount");
    public static final long OFFSET__drmFormatModifierPlaneCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPlaneLayouts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPlaneLayouts");
    public static final long OFFSET__pPlaneLayouts = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__drmFormatModifier,
            LAYOUT__drmFormatModifierPlaneCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPlaneLayouts
    ).withByteAlignment(8).withName("VkImageDrmFormatModifierExplicitCreateInfoEXT");

    public VkImageDrmFormatModifierExplicitCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageDrmFormatModifierExplicitCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long drmFormatModifier() {return this.ptr.get(LAYOUT__drmFormatModifier, OFFSET__drmFormatModifier);}
    public void drmFormatModifier(long value) {this.ptr.set(LAYOUT__drmFormatModifier, OFFSET__drmFormatModifier, value);}
    public java.lang.foreign.MemorySegment $drmFormatModifier() {return this.ptr.asSlice(OFFSET__drmFormatModifier, LAYOUT__drmFormatModifier);}

    public int drmFormatModifierPlaneCount() {return this.ptr.get(LAYOUT__drmFormatModifierPlaneCount, OFFSET__drmFormatModifierPlaneCount);}
    public void drmFormatModifierPlaneCount(int value) {this.ptr.set(LAYOUT__drmFormatModifierPlaneCount, OFFSET__drmFormatModifierPlaneCount, value);}
    public java.lang.foreign.MemorySegment $drmFormatModifierPlaneCount() {return this.ptr.asSlice(OFFSET__drmFormatModifierPlaneCount, LAYOUT__drmFormatModifierPlaneCount);}

    public java.lang.foreign.MemorySegment pPlaneLayouts() {return this.ptr.get(LAYOUT__pPlaneLayouts, OFFSET__pPlaneLayouts);}
    public void pPlaneLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPlaneLayouts, OFFSET__pPlaneLayouts, value);}
    public java.lang.foreign.MemorySegment $pPlaneLayouts() {return this.ptr.asSlice(OFFSET__pPlaneLayouts, LAYOUT__pPlaneLayouts);}
}
