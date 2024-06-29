package vulkan;

public record VkPhysicalDeviceTransformFeedbackPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTransformFeedbackStreams = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxTransformFeedbackStreams = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTransformFeedbackBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxTransformFeedbackBuffers = 20;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxTransformFeedbackBufferSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__maxTransformFeedbackBufferSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTransformFeedbackStreamDataSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxTransformFeedbackStreamDataSize = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTransformFeedbackBufferDataSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxTransformFeedbackBufferDataSize = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTransformFeedbackBufferDataStride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxTransformFeedbackBufferDataStride = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformFeedbackQueries = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transformFeedbackQueries = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformFeedbackStreamsLinesTriangles = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transformFeedbackStreamsLinesTriangles = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformFeedbackRasterizationStreamSelect = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transformFeedbackRasterizationStreamSelect = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformFeedbackDraw = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transformFeedbackDraw = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxTransformFeedbackStreams,
            LAYOUT__maxTransformFeedbackBuffers,
            LAYOUT__maxTransformFeedbackBufferSize,
            LAYOUT__maxTransformFeedbackStreamDataSize,
            LAYOUT__maxTransformFeedbackBufferDataSize,
            LAYOUT__maxTransformFeedbackBufferDataStride,
            LAYOUT__transformFeedbackQueries,
            LAYOUT__transformFeedbackStreamsLinesTriangles,
            LAYOUT__transformFeedbackRasterizationStreamSelect,
            LAYOUT__transformFeedbackDraw,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceTransformFeedbackPropertiesEXT");

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceTransformFeedbackPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxTransformFeedbackStreams() {return this.ptr.get(LAYOUT__maxTransformFeedbackStreams, OFFSET__maxTransformFeedbackStreams);}
    public void maxTransformFeedbackStreams(int value) {this.ptr.set(LAYOUT__maxTransformFeedbackStreams, OFFSET__maxTransformFeedbackStreams, value);}
    public java.lang.foreign.MemorySegment $maxTransformFeedbackStreams() {return this.ptr.asSlice(OFFSET__maxTransformFeedbackStreams, LAYOUT__maxTransformFeedbackStreams);}

    public int maxTransformFeedbackBuffers() {return this.ptr.get(LAYOUT__maxTransformFeedbackBuffers, OFFSET__maxTransformFeedbackBuffers);}
    public void maxTransformFeedbackBuffers(int value) {this.ptr.set(LAYOUT__maxTransformFeedbackBuffers, OFFSET__maxTransformFeedbackBuffers, value);}
    public java.lang.foreign.MemorySegment $maxTransformFeedbackBuffers() {return this.ptr.asSlice(OFFSET__maxTransformFeedbackBuffers, LAYOUT__maxTransformFeedbackBuffers);}

    public long maxTransformFeedbackBufferSize() {return this.ptr.get(LAYOUT__maxTransformFeedbackBufferSize, OFFSET__maxTransformFeedbackBufferSize);}
    public void maxTransformFeedbackBufferSize(long value) {this.ptr.set(LAYOUT__maxTransformFeedbackBufferSize, OFFSET__maxTransformFeedbackBufferSize, value);}
    public java.lang.foreign.MemorySegment $maxTransformFeedbackBufferSize() {return this.ptr.asSlice(OFFSET__maxTransformFeedbackBufferSize, LAYOUT__maxTransformFeedbackBufferSize);}

    public int maxTransformFeedbackStreamDataSize() {return this.ptr.get(LAYOUT__maxTransformFeedbackStreamDataSize, OFFSET__maxTransformFeedbackStreamDataSize);}
    public void maxTransformFeedbackStreamDataSize(int value) {this.ptr.set(LAYOUT__maxTransformFeedbackStreamDataSize, OFFSET__maxTransformFeedbackStreamDataSize, value);}
    public java.lang.foreign.MemorySegment $maxTransformFeedbackStreamDataSize() {return this.ptr.asSlice(OFFSET__maxTransformFeedbackStreamDataSize, LAYOUT__maxTransformFeedbackStreamDataSize);}

    public int maxTransformFeedbackBufferDataSize() {return this.ptr.get(LAYOUT__maxTransformFeedbackBufferDataSize, OFFSET__maxTransformFeedbackBufferDataSize);}
    public void maxTransformFeedbackBufferDataSize(int value) {this.ptr.set(LAYOUT__maxTransformFeedbackBufferDataSize, OFFSET__maxTransformFeedbackBufferDataSize, value);}
    public java.lang.foreign.MemorySegment $maxTransformFeedbackBufferDataSize() {return this.ptr.asSlice(OFFSET__maxTransformFeedbackBufferDataSize, LAYOUT__maxTransformFeedbackBufferDataSize);}

    public int maxTransformFeedbackBufferDataStride() {return this.ptr.get(LAYOUT__maxTransformFeedbackBufferDataStride, OFFSET__maxTransformFeedbackBufferDataStride);}
    public void maxTransformFeedbackBufferDataStride(int value) {this.ptr.set(LAYOUT__maxTransformFeedbackBufferDataStride, OFFSET__maxTransformFeedbackBufferDataStride, value);}
    public java.lang.foreign.MemorySegment $maxTransformFeedbackBufferDataStride() {return this.ptr.asSlice(OFFSET__maxTransformFeedbackBufferDataStride, LAYOUT__maxTransformFeedbackBufferDataStride);}

    public int transformFeedbackQueries() {return this.ptr.get(LAYOUT__transformFeedbackQueries, OFFSET__transformFeedbackQueries);}
    public void transformFeedbackQueries(int value) {this.ptr.set(LAYOUT__transformFeedbackQueries, OFFSET__transformFeedbackQueries, value);}
    public java.lang.foreign.MemorySegment $transformFeedbackQueries() {return this.ptr.asSlice(OFFSET__transformFeedbackQueries, LAYOUT__transformFeedbackQueries);}

    public int transformFeedbackStreamsLinesTriangles() {return this.ptr.get(LAYOUT__transformFeedbackStreamsLinesTriangles, OFFSET__transformFeedbackStreamsLinesTriangles);}
    public void transformFeedbackStreamsLinesTriangles(int value) {this.ptr.set(LAYOUT__transformFeedbackStreamsLinesTriangles, OFFSET__transformFeedbackStreamsLinesTriangles, value);}
    public java.lang.foreign.MemorySegment $transformFeedbackStreamsLinesTriangles() {return this.ptr.asSlice(OFFSET__transformFeedbackStreamsLinesTriangles, LAYOUT__transformFeedbackStreamsLinesTriangles);}

    public int transformFeedbackRasterizationStreamSelect() {return this.ptr.get(LAYOUT__transformFeedbackRasterizationStreamSelect, OFFSET__transformFeedbackRasterizationStreamSelect);}
    public void transformFeedbackRasterizationStreamSelect(int value) {this.ptr.set(LAYOUT__transformFeedbackRasterizationStreamSelect, OFFSET__transformFeedbackRasterizationStreamSelect, value);}
    public java.lang.foreign.MemorySegment $transformFeedbackRasterizationStreamSelect() {return this.ptr.asSlice(OFFSET__transformFeedbackRasterizationStreamSelect, LAYOUT__transformFeedbackRasterizationStreamSelect);}

    public int transformFeedbackDraw() {return this.ptr.get(LAYOUT__transformFeedbackDraw, OFFSET__transformFeedbackDraw);}
    public void transformFeedbackDraw(int value) {this.ptr.set(LAYOUT__transformFeedbackDraw, OFFSET__transformFeedbackDraw, value);}
    public java.lang.foreign.MemorySegment $transformFeedbackDraw() {return this.ptr.asSlice(OFFSET__transformFeedbackDraw, LAYOUT__transformFeedbackDraw);}
}
