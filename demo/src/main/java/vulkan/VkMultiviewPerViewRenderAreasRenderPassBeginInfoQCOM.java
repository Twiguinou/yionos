package vulkan;

public record VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__perViewRenderAreaCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("perViewRenderAreaCount");
    public static final long OFFSET__perViewRenderAreaCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPerViewRenderAreas = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPerViewRenderAreas");
    public static final long OFFSET__pPerViewRenderAreas = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__perViewRenderAreaCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPerViewRenderAreas
    ).withByteAlignment(8).withName("VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM");

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int perViewRenderAreaCount() {return this.ptr.get(LAYOUT__perViewRenderAreaCount, OFFSET__perViewRenderAreaCount);}
    public void perViewRenderAreaCount(int value) {this.ptr.set(LAYOUT__perViewRenderAreaCount, OFFSET__perViewRenderAreaCount, value);}
    public java.lang.foreign.MemorySegment $perViewRenderAreaCount() {return this.ptr.asSlice(OFFSET__perViewRenderAreaCount, LAYOUT__perViewRenderAreaCount);}

    public java.lang.foreign.MemorySegment pPerViewRenderAreas() {return this.ptr.get(LAYOUT__pPerViewRenderAreas, OFFSET__pPerViewRenderAreas);}
    public void pPerViewRenderAreas(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPerViewRenderAreas, OFFSET__pPerViewRenderAreas, value);}
    public java.lang.foreign.MemorySegment $pPerViewRenderAreas() {return this.ptr.asSlice(OFFSET__pPerViewRenderAreas, LAYOUT__pPerViewRenderAreas);}
}
