package vulkan;

public record VkSetLatencyMarkerInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$presentID = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$presentID = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$marker = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$marker = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$presentID,
            LAYOUT$marker,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSetLatencyMarkerInfoNV");

    public VkSetLatencyMarkerInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSetLatencyMarkerInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSetLatencyMarkerInfoNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long presentID() {return this.ptr.get(LAYOUT$presentID, OFFSET$presentID);}
    public void presentID(long value) {this.ptr.set(LAYOUT$presentID, OFFSET$presentID, value);}
    public java.lang.foreign.MemorySegment presentID_ptr() {return this.ptr.asSlice(OFFSET$presentID, LAYOUT$presentID);}

    public int marker() {return this.ptr.get(LAYOUT$marker, OFFSET$marker);}
    public void marker(int value) {this.ptr.set(LAYOUT$marker, OFFSET$marker, value);}
    public java.lang.foreign.MemorySegment marker_ptr() {return this.ptr.asSlice(OFFSET$marker, LAYOUT$marker);}
}
