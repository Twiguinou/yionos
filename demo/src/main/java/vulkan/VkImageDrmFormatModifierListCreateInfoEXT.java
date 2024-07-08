package vulkan;

public record VkImageDrmFormatModifierListCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__drmFormatModifierCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("drmFormatModifierCount");
    public static final long OFFSET__drmFormatModifierCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDrmFormatModifiers = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDrmFormatModifiers");
    public static final long OFFSET__pDrmFormatModifiers = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__drmFormatModifierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDrmFormatModifiers
    ).withByteAlignment(8).withName("VkImageDrmFormatModifierListCreateInfoEXT");

    public VkImageDrmFormatModifierListCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageDrmFormatModifierListCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageDrmFormatModifierListCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int drmFormatModifierCount() {return this.ptr.get(LAYOUT__drmFormatModifierCount, OFFSET__drmFormatModifierCount);}
    public void drmFormatModifierCount(int value) {this.ptr.set(LAYOUT__drmFormatModifierCount, OFFSET__drmFormatModifierCount, value);}
    public java.lang.foreign.MemorySegment $drmFormatModifierCount() {return this.ptr.asSlice(OFFSET__drmFormatModifierCount, LAYOUT__drmFormatModifierCount);}

    public java.lang.foreign.MemorySegment pDrmFormatModifiers() {return this.ptr.get(LAYOUT__pDrmFormatModifiers, OFFSET__pDrmFormatModifiers);}
    public void pDrmFormatModifiers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDrmFormatModifiers, OFFSET__pDrmFormatModifiers, value);}
    public java.lang.foreign.MemorySegment $pDrmFormatModifiers() {return this.ptr.asSlice(OFFSET__pDrmFormatModifiers, LAYOUT__pDrmFormatModifiers);}
}
