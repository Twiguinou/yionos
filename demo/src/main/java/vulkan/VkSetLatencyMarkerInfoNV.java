package vulkan;

public record VkSetLatencyMarkerInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__presentID = java.lang.foreign.ValueLayout.JAVA_LONG.withName("presentID");
    public static final long OFFSET__presentID = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__marker = java.lang.foreign.ValueLayout.JAVA_INT.withName("marker");
    public static final long OFFSET__marker = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__presentID,
            LAYOUT__marker,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSetLatencyMarkerInfoNV");

    public VkSetLatencyMarkerInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSetLatencyMarkerInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSetLatencyMarkerInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSetLatencyMarkerInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long presentID() {return this.ptr.get(LAYOUT__presentID, OFFSET__presentID);}
    public void presentID(long value) {this.ptr.set(LAYOUT__presentID, OFFSET__presentID, value);}
    public java.lang.foreign.MemorySegment $presentID() {return this.ptr.asSlice(OFFSET__presentID, LAYOUT__presentID);}

    public int marker() {return this.ptr.get(LAYOUT__marker, OFFSET__marker);}
    public void marker(int value) {this.ptr.set(LAYOUT__marker, OFFSET__marker, value);}
    public java.lang.foreign.MemorySegment $marker() {return this.ptr.asSlice(OFFSET__marker, LAYOUT__marker);}
}
