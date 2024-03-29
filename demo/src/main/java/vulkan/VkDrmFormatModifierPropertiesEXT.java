package vulkan;

public record VkDrmFormatModifierPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$drmFormatModifier = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$drmFormatModifier = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$drmFormatModifierPlaneCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$drmFormatModifierPlaneCount = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$drmFormatModifierTilingFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$drmFormatModifierTilingFeatures = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$drmFormatModifier,
            LAYOUT$drmFormatModifierPlaneCount,
            LAYOUT$drmFormatModifierTilingFeatures
    ).withName("VkDrmFormatModifierPropertiesEXT");

    public VkDrmFormatModifierPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDrmFormatModifierPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDrmFormatModifierPropertiesEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long drmFormatModifier() {return this.ptr.get(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier);}
    public void drmFormatModifier(long value) {this.ptr.set(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier, value);}
    public java.lang.foreign.MemorySegment drmFormatModifier_ptr() {return this.ptr.asSlice(OFFSET$drmFormatModifier, LAYOUT$drmFormatModifier);}

    public int drmFormatModifierPlaneCount() {return this.ptr.get(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount);}
    public void drmFormatModifierPlaneCount(int value) {this.ptr.set(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount, value);}
    public java.lang.foreign.MemorySegment drmFormatModifierPlaneCount_ptr() {return this.ptr.asSlice(OFFSET$drmFormatModifierPlaneCount, LAYOUT$drmFormatModifierPlaneCount);}

    public int drmFormatModifierTilingFeatures() {return this.ptr.get(LAYOUT$drmFormatModifierTilingFeatures, OFFSET$drmFormatModifierTilingFeatures);}
    public void drmFormatModifierTilingFeatures(int value) {this.ptr.set(LAYOUT$drmFormatModifierTilingFeatures, OFFSET$drmFormatModifierTilingFeatures, value);}
    public java.lang.foreign.MemorySegment drmFormatModifierTilingFeatures_ptr() {return this.ptr.asSlice(OFFSET$drmFormatModifierTilingFeatures, LAYOUT$drmFormatModifierTilingFeatures);}
}
