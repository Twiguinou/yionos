package vulkan;

public record VkCheckpointData2NV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__stage = java.lang.foreign.ValueLayout.JAVA_LONG.withName("stage");
    public static final long OFFSET__stage = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCheckpointMarker = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCheckpointMarker");
    public static final long OFFSET__pCheckpointMarker = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stage,
            LAYOUT__pCheckpointMarker
    ).withByteAlignment(8).withName("VkCheckpointData2NV");

    public VkCheckpointData2NV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCheckpointData2NV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCheckpointData2NV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCheckpointData2NV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long stage() {return this.ptr.get(LAYOUT__stage, OFFSET__stage);}
    public void stage(long value) {this.ptr.set(LAYOUT__stage, OFFSET__stage, value);}
    public java.lang.foreign.MemorySegment $stage() {return this.ptr.asSlice(OFFSET__stage, LAYOUT__stage);}

    public java.lang.foreign.MemorySegment pCheckpointMarker() {return this.ptr.get(LAYOUT__pCheckpointMarker, OFFSET__pCheckpointMarker);}
    public void pCheckpointMarker(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCheckpointMarker, OFFSET__pCheckpointMarker, value);}
    public java.lang.foreign.MemorySegment $pCheckpointMarker() {return this.ptr.asSlice(OFFSET__pCheckpointMarker, LAYOUT__pCheckpointMarker);}
}
