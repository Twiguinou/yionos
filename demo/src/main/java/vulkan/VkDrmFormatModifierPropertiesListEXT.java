package vulkan;

public record VkDrmFormatModifierPropertiesListEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__drmFormatModifierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__drmFormatModifierCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDrmFormatModifierProperties = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDrmFormatModifierProperties = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__drmFormatModifierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDrmFormatModifierProperties
    ).withByteAlignment(8).withName("VkDrmFormatModifierPropertiesListEXT");

    public VkDrmFormatModifierPropertiesListEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDrmFormatModifierPropertiesListEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDrmFormatModifierPropertiesListEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDrmFormatModifierPropertiesListEXT value)
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

    public java.lang.foreign.MemorySegment pDrmFormatModifierProperties() {return this.ptr.get(LAYOUT__pDrmFormatModifierProperties, OFFSET__pDrmFormatModifierProperties);}
    public void pDrmFormatModifierProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDrmFormatModifierProperties, OFFSET__pDrmFormatModifierProperties, value);}
    public java.lang.foreign.MemorySegment $pDrmFormatModifierProperties() {return this.ptr.asSlice(OFFSET__pDrmFormatModifierProperties, LAYOUT__pDrmFormatModifierProperties);}
}
