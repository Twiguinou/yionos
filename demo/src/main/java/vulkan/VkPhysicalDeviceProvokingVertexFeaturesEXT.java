package vulkan;

public record VkPhysicalDeviceProvokingVertexFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__provokingVertexLast = java.lang.foreign.ValueLayout.JAVA_INT.withName("provokingVertexLast");
    public static final long OFFSET__provokingVertexLast = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformFeedbackPreservesProvokingVertex = java.lang.foreign.ValueLayout.JAVA_INT.withName("transformFeedbackPreservesProvokingVertex");
    public static final long OFFSET__transformFeedbackPreservesProvokingVertex = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__provokingVertexLast,
            LAYOUT__transformFeedbackPreservesProvokingVertex
    ).withByteAlignment(8).withName("VkPhysicalDeviceProvokingVertexFeaturesEXT");

    public VkPhysicalDeviceProvokingVertexFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceProvokingVertexFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int provokingVertexLast() {return this.ptr.get(LAYOUT__provokingVertexLast, OFFSET__provokingVertexLast);}
    public void provokingVertexLast(int value) {this.ptr.set(LAYOUT__provokingVertexLast, OFFSET__provokingVertexLast, value);}
    public java.lang.foreign.MemorySegment $provokingVertexLast() {return this.ptr.asSlice(OFFSET__provokingVertexLast, LAYOUT__provokingVertexLast);}

    public int transformFeedbackPreservesProvokingVertex() {return this.ptr.get(LAYOUT__transformFeedbackPreservesProvokingVertex, OFFSET__transformFeedbackPreservesProvokingVertex);}
    public void transformFeedbackPreservesProvokingVertex(int value) {this.ptr.set(LAYOUT__transformFeedbackPreservesProvokingVertex, OFFSET__transformFeedbackPreservesProvokingVertex, value);}
    public java.lang.foreign.MemorySegment $transformFeedbackPreservesProvokingVertex() {return this.ptr.asSlice(OFFSET__transformFeedbackPreservesProvokingVertex, LAYOUT__transformFeedbackPreservesProvokingVertex);}
}
