package vulkan;

public record VkCheckpointData2NV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$stage = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$stage = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pCheckpointMarker = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pCheckpointMarker = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stage,
            LAYOUT$pCheckpointMarker
    ).withName("VkCheckpointData2NV");

    public VkCheckpointData2NV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkCheckpointData2NV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkCheckpointData2NV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long stage() {return this.ptr.get(LAYOUT$stage, OFFSET$stage);}
    public void stage(long value) {this.ptr.set(LAYOUT$stage, OFFSET$stage, value);}
    public java.lang.foreign.MemorySegment stage_ptr() {return this.ptr.asSlice(OFFSET$stage, LAYOUT$stage);}

    public java.lang.foreign.MemorySegment pCheckpointMarker() {return this.ptr.get(LAYOUT$pCheckpointMarker, OFFSET$pCheckpointMarker);}
    public void pCheckpointMarker(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCheckpointMarker, OFFSET$pCheckpointMarker, value);}
    public java.lang.foreign.MemorySegment pCheckpointMarker_ptr() {return this.ptr.asSlice(OFFSET$pCheckpointMarker, LAYOUT$pCheckpointMarker);}
}
