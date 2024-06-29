package vulkan;

public record VkSetDescriptorBufferOffsetsInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stageFlags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__layout = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__layout = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__firstSet = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__firstSet = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__setCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__setCount = 36;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBufferIndices = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pBufferIndices = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pOffsets = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pOffsets = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__stageFlags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__layout,
            LAYOUT__firstSet,
            LAYOUT__setCount,
            LAYOUT__pBufferIndices,
            LAYOUT__pOffsets
    ).withByteAlignment(8).withName("VkSetDescriptorBufferOffsetsInfoEXT");

    public VkSetDescriptorBufferOffsetsInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSetDescriptorBufferOffsetsInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSetDescriptorBufferOffsetsInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int stageFlags() {return this.ptr.get(LAYOUT__stageFlags, OFFSET__stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT__stageFlags, OFFSET__stageFlags, value);}
    public java.lang.foreign.MemorySegment $stageFlags() {return this.ptr.asSlice(OFFSET__stageFlags, LAYOUT__stageFlags);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT__layout, OFFSET__layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__layout, OFFSET__layout, value);}
    public java.lang.foreign.MemorySegment $layout() {return this.ptr.asSlice(OFFSET__layout, LAYOUT__layout);}

    public int firstSet() {return this.ptr.get(LAYOUT__firstSet, OFFSET__firstSet);}
    public void firstSet(int value) {this.ptr.set(LAYOUT__firstSet, OFFSET__firstSet, value);}
    public java.lang.foreign.MemorySegment $firstSet() {return this.ptr.asSlice(OFFSET__firstSet, LAYOUT__firstSet);}

    public int setCount() {return this.ptr.get(LAYOUT__setCount, OFFSET__setCount);}
    public void setCount(int value) {this.ptr.set(LAYOUT__setCount, OFFSET__setCount, value);}
    public java.lang.foreign.MemorySegment $setCount() {return this.ptr.asSlice(OFFSET__setCount, LAYOUT__setCount);}

    public java.lang.foreign.MemorySegment pBufferIndices() {return this.ptr.get(LAYOUT__pBufferIndices, OFFSET__pBufferIndices);}
    public void pBufferIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBufferIndices, OFFSET__pBufferIndices, value);}
    public java.lang.foreign.MemorySegment $pBufferIndices() {return this.ptr.asSlice(OFFSET__pBufferIndices, LAYOUT__pBufferIndices);}

    public java.lang.foreign.MemorySegment pOffsets() {return this.ptr.get(LAYOUT__pOffsets, OFFSET__pOffsets);}
    public void pOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pOffsets, OFFSET__pOffsets, value);}
    public java.lang.foreign.MemorySegment $pOffsets() {return this.ptr.asSlice(OFFSET__pOffsets, LAYOUT__pOffsets);}
}
