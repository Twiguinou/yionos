package vulkan;

public record VkPhysicalDeviceProvokingVertexPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__provokingVertexModePerPipeline = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__provokingVertexModePerPipeline = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transformFeedbackPreservesTriangleFanProvokingVertex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__transformFeedbackPreservesTriangleFanProvokingVertex = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__provokingVertexModePerPipeline,
            LAYOUT__transformFeedbackPreservesTriangleFanProvokingVertex
    ).withByteAlignment(8).withName("VkPhysicalDeviceProvokingVertexPropertiesEXT");

    public VkPhysicalDeviceProvokingVertexPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceProvokingVertexPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int provokingVertexModePerPipeline() {return this.ptr.get(LAYOUT__provokingVertexModePerPipeline, OFFSET__provokingVertexModePerPipeline);}
    public void provokingVertexModePerPipeline(int value) {this.ptr.set(LAYOUT__provokingVertexModePerPipeline, OFFSET__provokingVertexModePerPipeline, value);}
    public java.lang.foreign.MemorySegment $provokingVertexModePerPipeline() {return this.ptr.asSlice(OFFSET__provokingVertexModePerPipeline, LAYOUT__provokingVertexModePerPipeline);}

    public int transformFeedbackPreservesTriangleFanProvokingVertex() {return this.ptr.get(LAYOUT__transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET__transformFeedbackPreservesTriangleFanProvokingVertex);}
    public void transformFeedbackPreservesTriangleFanProvokingVertex(int value) {this.ptr.set(LAYOUT__transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET__transformFeedbackPreservesTriangleFanProvokingVertex, value);}
    public java.lang.foreign.MemorySegment $transformFeedbackPreservesTriangleFanProvokingVertex() {return this.ptr.asSlice(OFFSET__transformFeedbackPreservesTriangleFanProvokingVertex, LAYOUT__transformFeedbackPreservesTriangleFanProvokingVertex);}
}
