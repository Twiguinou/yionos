package vulkan;

public record VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxGraphicsShaderGroupCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxGraphicsShaderGroupCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxIndirectSequenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxIndirectSequenceCount = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxIndirectCommandsTokenCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxIndirectCommandsTokenCount = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxIndirectCommandsStreamCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxIndirectCommandsStreamCount = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxIndirectCommandsTokenOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxIndirectCommandsTokenOffset = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxIndirectCommandsStreamStride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxIndirectCommandsStreamStride = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minSequencesCountBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minSequencesCountBufferOffsetAlignment = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minSequencesIndexBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minSequencesIndexBufferOffsetAlignment = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minIndirectCommandsBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__minIndirectCommandsBufferOffsetAlignment = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxGraphicsShaderGroupCount,
            LAYOUT__maxIndirectSequenceCount,
            LAYOUT__maxIndirectCommandsTokenCount,
            LAYOUT__maxIndirectCommandsStreamCount,
            LAYOUT__maxIndirectCommandsTokenOffset,
            LAYOUT__maxIndirectCommandsStreamStride,
            LAYOUT__minSequencesCountBufferOffsetAlignment,
            LAYOUT__minSequencesIndexBufferOffsetAlignment,
            LAYOUT__minIndirectCommandsBufferOffsetAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV");

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxGraphicsShaderGroupCount() {return this.ptr.get(LAYOUT__maxGraphicsShaderGroupCount, OFFSET__maxGraphicsShaderGroupCount);}
    public void maxGraphicsShaderGroupCount(int value) {this.ptr.set(LAYOUT__maxGraphicsShaderGroupCount, OFFSET__maxGraphicsShaderGroupCount, value);}
    public java.lang.foreign.MemorySegment $maxGraphicsShaderGroupCount() {return this.ptr.asSlice(OFFSET__maxGraphicsShaderGroupCount, LAYOUT__maxGraphicsShaderGroupCount);}

    public int maxIndirectSequenceCount() {return this.ptr.get(LAYOUT__maxIndirectSequenceCount, OFFSET__maxIndirectSequenceCount);}
    public void maxIndirectSequenceCount(int value) {this.ptr.set(LAYOUT__maxIndirectSequenceCount, OFFSET__maxIndirectSequenceCount, value);}
    public java.lang.foreign.MemorySegment $maxIndirectSequenceCount() {return this.ptr.asSlice(OFFSET__maxIndirectSequenceCount, LAYOUT__maxIndirectSequenceCount);}

    public int maxIndirectCommandsTokenCount() {return this.ptr.get(LAYOUT__maxIndirectCommandsTokenCount, OFFSET__maxIndirectCommandsTokenCount);}
    public void maxIndirectCommandsTokenCount(int value) {this.ptr.set(LAYOUT__maxIndirectCommandsTokenCount, OFFSET__maxIndirectCommandsTokenCount, value);}
    public java.lang.foreign.MemorySegment $maxIndirectCommandsTokenCount() {return this.ptr.asSlice(OFFSET__maxIndirectCommandsTokenCount, LAYOUT__maxIndirectCommandsTokenCount);}

    public int maxIndirectCommandsStreamCount() {return this.ptr.get(LAYOUT__maxIndirectCommandsStreamCount, OFFSET__maxIndirectCommandsStreamCount);}
    public void maxIndirectCommandsStreamCount(int value) {this.ptr.set(LAYOUT__maxIndirectCommandsStreamCount, OFFSET__maxIndirectCommandsStreamCount, value);}
    public java.lang.foreign.MemorySegment $maxIndirectCommandsStreamCount() {return this.ptr.asSlice(OFFSET__maxIndirectCommandsStreamCount, LAYOUT__maxIndirectCommandsStreamCount);}

    public int maxIndirectCommandsTokenOffset() {return this.ptr.get(LAYOUT__maxIndirectCommandsTokenOffset, OFFSET__maxIndirectCommandsTokenOffset);}
    public void maxIndirectCommandsTokenOffset(int value) {this.ptr.set(LAYOUT__maxIndirectCommandsTokenOffset, OFFSET__maxIndirectCommandsTokenOffset, value);}
    public java.lang.foreign.MemorySegment $maxIndirectCommandsTokenOffset() {return this.ptr.asSlice(OFFSET__maxIndirectCommandsTokenOffset, LAYOUT__maxIndirectCommandsTokenOffset);}

    public int maxIndirectCommandsStreamStride() {return this.ptr.get(LAYOUT__maxIndirectCommandsStreamStride, OFFSET__maxIndirectCommandsStreamStride);}
    public void maxIndirectCommandsStreamStride(int value) {this.ptr.set(LAYOUT__maxIndirectCommandsStreamStride, OFFSET__maxIndirectCommandsStreamStride, value);}
    public java.lang.foreign.MemorySegment $maxIndirectCommandsStreamStride() {return this.ptr.asSlice(OFFSET__maxIndirectCommandsStreamStride, LAYOUT__maxIndirectCommandsStreamStride);}

    public int minSequencesCountBufferOffsetAlignment() {return this.ptr.get(LAYOUT__minSequencesCountBufferOffsetAlignment, OFFSET__minSequencesCountBufferOffsetAlignment);}
    public void minSequencesCountBufferOffsetAlignment(int value) {this.ptr.set(LAYOUT__minSequencesCountBufferOffsetAlignment, OFFSET__minSequencesCountBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minSequencesCountBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__minSequencesCountBufferOffsetAlignment, LAYOUT__minSequencesCountBufferOffsetAlignment);}

    public int minSequencesIndexBufferOffsetAlignment() {return this.ptr.get(LAYOUT__minSequencesIndexBufferOffsetAlignment, OFFSET__minSequencesIndexBufferOffsetAlignment);}
    public void minSequencesIndexBufferOffsetAlignment(int value) {this.ptr.set(LAYOUT__minSequencesIndexBufferOffsetAlignment, OFFSET__minSequencesIndexBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minSequencesIndexBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__minSequencesIndexBufferOffsetAlignment, LAYOUT__minSequencesIndexBufferOffsetAlignment);}

    public int minIndirectCommandsBufferOffsetAlignment() {return this.ptr.get(LAYOUT__minIndirectCommandsBufferOffsetAlignment, OFFSET__minIndirectCommandsBufferOffsetAlignment);}
    public void minIndirectCommandsBufferOffsetAlignment(int value) {this.ptr.set(LAYOUT__minIndirectCommandsBufferOffsetAlignment, OFFSET__minIndirectCommandsBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment $minIndirectCommandsBufferOffsetAlignment() {return this.ptr.asSlice(OFFSET__minIndirectCommandsBufferOffsetAlignment, LAYOUT__minIndirectCommandsBufferOffsetAlignment);}
}
