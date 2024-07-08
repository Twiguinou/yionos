package vulkan;

public record VkDrmFormatModifierPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__drmFormatModifier = java.lang.foreign.ValueLayout.JAVA_LONG.withName("drmFormatModifier");
    public static final long OFFSET__drmFormatModifier = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__drmFormatModifierPlaneCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount");
    public static final long OFFSET__drmFormatModifierPlaneCount = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__drmFormatModifierTilingFeatures = java.lang.foreign.ValueLayout.JAVA_INT.withName("drmFormatModifierTilingFeatures");
    public static final long OFFSET__drmFormatModifierTilingFeatures = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__drmFormatModifier,
            LAYOUT__drmFormatModifierPlaneCount,
            LAYOUT__drmFormatModifierTilingFeatures
    ).withByteAlignment(8).withName("VkDrmFormatModifierPropertiesEXT");

    public VkDrmFormatModifierPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDrmFormatModifierPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDrmFormatModifierPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDrmFormatModifierPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long drmFormatModifier() {return this.ptr.get(LAYOUT__drmFormatModifier, OFFSET__drmFormatModifier);}
    public void drmFormatModifier(long value) {this.ptr.set(LAYOUT__drmFormatModifier, OFFSET__drmFormatModifier, value);}
    public java.lang.foreign.MemorySegment $drmFormatModifier() {return this.ptr.asSlice(OFFSET__drmFormatModifier, LAYOUT__drmFormatModifier);}

    public int drmFormatModifierPlaneCount() {return this.ptr.get(LAYOUT__drmFormatModifierPlaneCount, OFFSET__drmFormatModifierPlaneCount);}
    public void drmFormatModifierPlaneCount(int value) {this.ptr.set(LAYOUT__drmFormatModifierPlaneCount, OFFSET__drmFormatModifierPlaneCount, value);}
    public java.lang.foreign.MemorySegment $drmFormatModifierPlaneCount() {return this.ptr.asSlice(OFFSET__drmFormatModifierPlaneCount, LAYOUT__drmFormatModifierPlaneCount);}

    public int drmFormatModifierTilingFeatures() {return this.ptr.get(LAYOUT__drmFormatModifierTilingFeatures, OFFSET__drmFormatModifierTilingFeatures);}
    public void drmFormatModifierTilingFeatures(int value) {this.ptr.set(LAYOUT__drmFormatModifierTilingFeatures, OFFSET__drmFormatModifierTilingFeatures, value);}
    public java.lang.foreign.MemorySegment $drmFormatModifierTilingFeatures() {return this.ptr.asSlice(OFFSET__drmFormatModifierTilingFeatures, LAYOUT__drmFormatModifierTilingFeatures);}
}
