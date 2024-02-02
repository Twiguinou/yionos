package vulkan;

public record VkPushConstantsInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageFlags = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$offset = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pValues = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pValues = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$layout,
            LAYOUT$stageFlags,
            LAYOUT$offset,
            LAYOUT$size,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pValues
    ).withName("VkPushConstantsInfoKHR");

    public VkPushConstantsInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPushConstantsInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPushConstantsInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public int stageFlags() {return this.ptr.get(LAYOUT$stageFlags, OFFSET$stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);}
    public java.lang.foreign.MemorySegment stageFlags_ptr() {return this.ptr.asSlice(OFFSET$stageFlags, LAYOUT$stageFlags);}

    public int offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(int value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

    public int size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment pValues() {return this.ptr.get(LAYOUT$pValues, OFFSET$pValues);}
    public void pValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pValues, OFFSET$pValues, value);}
    public java.lang.foreign.MemorySegment pValues_ptr() {return this.ptr.asSlice(OFFSET$pValues, LAYOUT$pValues);}
}
