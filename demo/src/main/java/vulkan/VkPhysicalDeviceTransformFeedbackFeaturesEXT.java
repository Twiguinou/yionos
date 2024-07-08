package vulkan;

public record VkPhysicalDeviceTransformFeedbackFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformFeedback = java.lang.foreign.ValueLayout.JAVA_INT.withName("transformFeedback");
    public static final long OFFSET__transformFeedback = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__geometryStreams = java.lang.foreign.ValueLayout.JAVA_INT.withName("geometryStreams");
    public static final long OFFSET__geometryStreams = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__transformFeedback,
            LAYOUT__geometryStreams
    ).withByteAlignment(8).withName("VkPhysicalDeviceTransformFeedbackFeaturesEXT");

    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceTransformFeedbackFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int transformFeedback() {return this.ptr.get(LAYOUT__transformFeedback, OFFSET__transformFeedback);}
    public void transformFeedback(int value) {this.ptr.set(LAYOUT__transformFeedback, OFFSET__transformFeedback, value);}
    public java.lang.foreign.MemorySegment $transformFeedback() {return this.ptr.asSlice(OFFSET__transformFeedback, LAYOUT__transformFeedback);}

    public int geometryStreams() {return this.ptr.get(LAYOUT__geometryStreams, OFFSET__geometryStreams);}
    public void geometryStreams(int value) {this.ptr.set(LAYOUT__geometryStreams, OFFSET__geometryStreams, value);}
    public java.lang.foreign.MemorySegment $geometryStreams() {return this.ptr.asSlice(OFFSET__geometryStreams, LAYOUT__geometryStreams);}
}
