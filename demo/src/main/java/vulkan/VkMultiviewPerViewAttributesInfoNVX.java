package vulkan;

public record VkMultiviewPerViewAttributesInfoNVX(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__perViewAttributes = java.lang.foreign.ValueLayout.JAVA_INT.withName("perViewAttributes");
    public static final long OFFSET__perViewAttributes = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__perViewAttributesPositionXOnly = java.lang.foreign.ValueLayout.JAVA_INT.withName("perViewAttributesPositionXOnly");
    public static final long OFFSET__perViewAttributesPositionXOnly = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__perViewAttributes,
            LAYOUT__perViewAttributesPositionXOnly
    ).withByteAlignment(8).withName("VkMultiviewPerViewAttributesInfoNVX");

    public VkMultiviewPerViewAttributesInfoNVX(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMultiviewPerViewAttributesInfoNVX getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMultiviewPerViewAttributesInfoNVX(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMultiviewPerViewAttributesInfoNVX value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int perViewAttributes() {return this.ptr.get(LAYOUT__perViewAttributes, OFFSET__perViewAttributes);}
    public void perViewAttributes(int value) {this.ptr.set(LAYOUT__perViewAttributes, OFFSET__perViewAttributes, value);}
    public java.lang.foreign.MemorySegment $perViewAttributes() {return this.ptr.asSlice(OFFSET__perViewAttributes, LAYOUT__perViewAttributes);}

    public int perViewAttributesPositionXOnly() {return this.ptr.get(LAYOUT__perViewAttributesPositionXOnly, OFFSET__perViewAttributesPositionXOnly);}
    public void perViewAttributesPositionXOnly(int value) {this.ptr.set(LAYOUT__perViewAttributesPositionXOnly, OFFSET__perViewAttributesPositionXOnly, value);}
    public java.lang.foreign.MemorySegment $perViewAttributesPositionXOnly() {return this.ptr.asSlice(OFFSET__perViewAttributesPositionXOnly, LAYOUT__perViewAttributesPositionXOnly);}
}
