package vulkan;

public record VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxWorkGroupCount");
    public static final long OFFSET__maxWorkGroupCount = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxWorkGroupSize");
    public static final long OFFSET__maxWorkGroupSize = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxOutputClusterCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxOutputClusterCount");
    public static final long OFFSET__maxOutputClusterCount = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__indirectBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment");
    public static final long OFFSET__indirectBufferOffsetAlignment = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxWorkGroupCount,
            LAYOUT__maxWorkGroupSize,
            LAYOUT__maxOutputClusterCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__indirectBufferOffsetAlignment
    ).withByteAlignment(8).withName("VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI");

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment maxWorkGroupCount() {return this.ptr.asSlice(OFFSET__maxWorkGroupCount, LAYOUT__maxWorkGroupCount);}
    public int maxWorkGroupCount(int index) {return this.maxWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxWorkGroupCount(int index, int value) {this.maxWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment maxWorkGroupSize() {return this.ptr.asSlice(OFFSET__maxWorkGroupSize, LAYOUT__maxWorkGroupSize);}
    public int maxWorkGroupSize(int index) {return this.maxWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxWorkGroupSize(int index, int value) {this.maxWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxOutputClusterCount() {return this.ptr.get(LAYOUT__maxOutputClusterCount, OFFSET__maxOutputClusterCount);}
    public void maxOutputClusterCount(int value) {this.ptr.set(LAYOUT__maxOutputClusterCount, OFFSET__maxOutputClusterCount, value);}
    public java.lang.foreign.MemorySegment $maxOutputClusterCount() {return this.ptr.asSlice(OFFSET__maxOutputClusterCount, LAYOUT__maxOutputClusterCount);}

    public long indirectBufferOffsetAlignment() {return this.ptr.get(LAYOUT__indirectBufferOffsetAlignment, OFFSET__indirectBufferOffsetAlignment);}
    public void indirectBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT__indirectBufferOffsetAlignment, OFFSET__indirectBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $indirectBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__indirectBufferOffsetAlignment, LAYOUT__indirectBufferOffsetAlignment);}
}
