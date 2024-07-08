package vulkan;

public record VkImageCompressionPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageCompressionFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageCompressionFlags");
    public static final long OFFSET__imageCompressionFlags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageCompressionFixedRateFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageCompressionFixedRateFlags");
    public static final long OFFSET__imageCompressionFixedRateFlags = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__imageCompressionFlags,
            LAYOUT__imageCompressionFixedRateFlags
    ).withByteAlignment(8).withName("VkImageCompressionPropertiesEXT");

    public VkImageCompressionPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkImageCompressionPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkImageCompressionPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkImageCompressionPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int imageCompressionFlags() {return this.ptr.get(LAYOUT__imageCompressionFlags, OFFSET__imageCompressionFlags);}
    public void imageCompressionFlags(int value) {this.ptr.set(LAYOUT__imageCompressionFlags, OFFSET__imageCompressionFlags, value);}
    public java.lang.foreign.MemorySegment $imageCompressionFlags() {return this.ptr.asSlice(OFFSET__imageCompressionFlags, LAYOUT__imageCompressionFlags);}

    public int imageCompressionFixedRateFlags() {return this.ptr.get(LAYOUT__imageCompressionFixedRateFlags, OFFSET__imageCompressionFixedRateFlags);}
    public void imageCompressionFixedRateFlags(int value) {this.ptr.set(LAYOUT__imageCompressionFixedRateFlags, OFFSET__imageCompressionFixedRateFlags, value);}
    public java.lang.foreign.MemorySegment $imageCompressionFixedRateFlags() {return this.ptr.asSlice(OFFSET__imageCompressionFixedRateFlags, LAYOUT__imageCompressionFixedRateFlags);}
}
