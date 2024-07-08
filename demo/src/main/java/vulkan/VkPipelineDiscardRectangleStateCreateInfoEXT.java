package vulkan;

public record VkPipelineDiscardRectangleStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__discardRectangleMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("discardRectangleMode");
    public static final long OFFSET__discardRectangleMode = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__discardRectangleCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("discardRectangleCount");
    public static final long OFFSET__discardRectangleCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDiscardRectangles = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pDiscardRectangles");
    public static final long OFFSET__pDiscardRectangles = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__discardRectangleMode,
            LAYOUT__discardRectangleCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDiscardRectangles
    ).withByteAlignment(8).withName("VkPipelineDiscardRectangleStateCreateInfoEXT");

    public VkPipelineDiscardRectangleStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineDiscardRectangleStateCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int discardRectangleMode() {return this.ptr.get(LAYOUT__discardRectangleMode, OFFSET__discardRectangleMode);}
    public void discardRectangleMode(int value) {this.ptr.set(LAYOUT__discardRectangleMode, OFFSET__discardRectangleMode, value);}
    public java.lang.foreign.MemorySegment $discardRectangleMode() {return this.ptr.asSlice(OFFSET__discardRectangleMode, LAYOUT__discardRectangleMode);}

    public int discardRectangleCount() {return this.ptr.get(LAYOUT__discardRectangleCount, OFFSET__discardRectangleCount);}
    public void discardRectangleCount(int value) {this.ptr.set(LAYOUT__discardRectangleCount, OFFSET__discardRectangleCount, value);}
    public java.lang.foreign.MemorySegment $discardRectangleCount() {return this.ptr.asSlice(OFFSET__discardRectangleCount, LAYOUT__discardRectangleCount);}

    public java.lang.foreign.MemorySegment pDiscardRectangles() {return this.ptr.get(LAYOUT__pDiscardRectangles, OFFSET__pDiscardRectangles);}
    public void pDiscardRectangles(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDiscardRectangles, OFFSET__pDiscardRectangles, value);}
    public java.lang.foreign.MemorySegment $pDiscardRectangles() {return this.ptr.asSlice(OFFSET__pDiscardRectangles, LAYOUT__pDiscardRectangles);}
}
