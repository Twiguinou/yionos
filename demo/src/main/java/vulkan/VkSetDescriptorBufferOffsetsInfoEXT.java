package vulkan;

public record VkSetDescriptorBufferOffsetsInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageFlags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstSet = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$firstSet = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$setCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$setCount = 36L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pBufferIndices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pBufferIndices = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pOffsets = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pOffsets = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$layout,
            LAYOUT$firstSet,
            LAYOUT$setCount,
            LAYOUT$pBufferIndices,
            LAYOUT$pOffsets
    ).withName("VkSetDescriptorBufferOffsetsInfoEXT");

    public VkSetDescriptorBufferOffsetsInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkSetDescriptorBufferOffsetsInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int stageFlags() {return this.ptr.get(LAYOUT$stageFlags, OFFSET$stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);}
    public java.lang.foreign.MemorySegment stageFlags_ptr() {return this.ptr.asSlice(OFFSET$stageFlags, LAYOUT$stageFlags);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public int firstSet() {return this.ptr.get(LAYOUT$firstSet, OFFSET$firstSet);}
    public void firstSet(int value) {this.ptr.set(LAYOUT$firstSet, OFFSET$firstSet, value);}
    public java.lang.foreign.MemorySegment firstSet_ptr() {return this.ptr.asSlice(OFFSET$firstSet, LAYOUT$firstSet);}

    public int setCount() {return this.ptr.get(LAYOUT$setCount, OFFSET$setCount);}
    public void setCount(int value) {this.ptr.set(LAYOUT$setCount, OFFSET$setCount, value);}
    public java.lang.foreign.MemorySegment setCount_ptr() {return this.ptr.asSlice(OFFSET$setCount, LAYOUT$setCount);}

    public java.lang.foreign.MemorySegment pBufferIndices() {return this.ptr.get(LAYOUT$pBufferIndices, OFFSET$pBufferIndices);}
    public void pBufferIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBufferIndices, OFFSET$pBufferIndices, value);}
    public java.lang.foreign.MemorySegment pBufferIndices_ptr() {return this.ptr.asSlice(OFFSET$pBufferIndices, LAYOUT$pBufferIndices);}

    public java.lang.foreign.MemorySegment pOffsets() {return this.ptr.get(LAYOUT$pOffsets, OFFSET$pOffsets);}
    public void pOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pOffsets, OFFSET$pOffsets, value);}
    public java.lang.foreign.MemorySegment pOffsets_ptr() {return this.ptr.asSlice(OFFSET$pOffsets, LAYOUT$pOffsets);}
}
