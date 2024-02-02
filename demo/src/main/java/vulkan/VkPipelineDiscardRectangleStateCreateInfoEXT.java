package vulkan;

public record VkPipelineDiscardRectangleStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$discardRectangleMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$discardRectangleMode = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$discardRectangleCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$discardRectangleCount = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDiscardRectangles = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDiscardRectangles = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$discardRectangleMode,
            LAYOUT$discardRectangleCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDiscardRectangles
    ).withName("VkPipelineDiscardRectangleStateCreateInfoEXT");

    public VkPipelineDiscardRectangleStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int discardRectangleMode() {return this.ptr.get(LAYOUT$discardRectangleMode, OFFSET$discardRectangleMode);}
    public void discardRectangleMode(int value) {this.ptr.set(LAYOUT$discardRectangleMode, OFFSET$discardRectangleMode, value);}
    public java.lang.foreign.MemorySegment discardRectangleMode_ptr() {return this.ptr.asSlice(OFFSET$discardRectangleMode, LAYOUT$discardRectangleMode);}

    public int discardRectangleCount() {return this.ptr.get(LAYOUT$discardRectangleCount, OFFSET$discardRectangleCount);}
    public void discardRectangleCount(int value) {this.ptr.set(LAYOUT$discardRectangleCount, OFFSET$discardRectangleCount, value);}
    public java.lang.foreign.MemorySegment discardRectangleCount_ptr() {return this.ptr.asSlice(OFFSET$discardRectangleCount, LAYOUT$discardRectangleCount);}

    public java.lang.foreign.MemorySegment pDiscardRectangles() {return this.ptr.get(LAYOUT$pDiscardRectangles, OFFSET$pDiscardRectangles);}
    public void pDiscardRectangles(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDiscardRectangles, OFFSET$pDiscardRectangles, value);}
    public java.lang.foreign.MemorySegment pDiscardRectangles_ptr() {return this.ptr.asSlice(OFFSET$pDiscardRectangles, LAYOUT$pDiscardRectangles);}
}