package vulkan;

public record VkPhysicalDeviceMeshShaderPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxDrawMeshTasksCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxDrawMeshTasksCount");
    public static final long OFFSET__maxDrawMeshTasksCount = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations");
    public static final long OFFSET__maxTaskWorkGroupInvocations = 20;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxTaskWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize");
    public static final long OFFSET__maxTaskWorkGroupSize = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskTotalMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskTotalMemorySize");
    public static final long OFFSET__maxTaskTotalMemorySize = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxTaskOutputCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxTaskOutputCount");
    public static final long OFFSET__maxTaskOutputCount = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations");
    public static final long OFFSET__maxMeshWorkGroupInvocations = 44;
    public static final java.lang.foreign.SequenceLayout LAYOUT__maxMeshWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize");
    public static final long OFFSET__maxMeshWorkGroupSize = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshTotalMemorySize = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshTotalMemorySize");
    public static final long OFFSET__maxMeshTotalMemorySize = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshOutputVertices = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshOutputVertices");
    public static final long OFFSET__maxMeshOutputVertices = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshOutputPrimitives = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives");
    public static final long OFFSET__maxMeshOutputPrimitives = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxMeshMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount");
    public static final long OFFSET__maxMeshMultiviewViewCount = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__meshOutputPerVertexGranularity = java.lang.foreign.ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity");
    public static final long OFFSET__meshOutputPerVertexGranularity = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__meshOutputPerPrimitiveGranularity = java.lang.foreign.ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity");
    public static final long OFFSET__meshOutputPerPrimitiveGranularity = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxDrawMeshTasksCount,
            LAYOUT__maxTaskWorkGroupInvocations,
            LAYOUT__maxTaskWorkGroupSize,
            LAYOUT__maxTaskTotalMemorySize,
            LAYOUT__maxTaskOutputCount,
            LAYOUT__maxMeshWorkGroupInvocations,
            LAYOUT__maxMeshWorkGroupSize,
            LAYOUT__maxMeshTotalMemorySize,
            LAYOUT__maxMeshOutputVertices,
            LAYOUT__maxMeshOutputPrimitives,
            LAYOUT__maxMeshMultiviewViewCount,
            LAYOUT__meshOutputPerVertexGranularity,
            LAYOUT__meshOutputPerPrimitiveGranularity,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceMeshShaderPropertiesNV");

    public VkPhysicalDeviceMeshShaderPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMeshShaderPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMeshShaderPropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxDrawMeshTasksCount() {return this.ptr.get(LAYOUT__maxDrawMeshTasksCount, OFFSET__maxDrawMeshTasksCount);}
    public void maxDrawMeshTasksCount(int value) {this.ptr.set(LAYOUT__maxDrawMeshTasksCount, OFFSET__maxDrawMeshTasksCount, value);}
    public java.lang.foreign.MemorySegment $maxDrawMeshTasksCount() {return this.ptr.asSlice(OFFSET__maxDrawMeshTasksCount, LAYOUT__maxDrawMeshTasksCount);}

    public int maxTaskWorkGroupInvocations() {return this.ptr.get(LAYOUT__maxTaskWorkGroupInvocations, OFFSET__maxTaskWorkGroupInvocations);}
    public void maxTaskWorkGroupInvocations(int value) {this.ptr.set(LAYOUT__maxTaskWorkGroupInvocations, OFFSET__maxTaskWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment $maxTaskWorkGroupInvocations() {return this.ptr.asSlice(OFFSET__maxTaskWorkGroupInvocations, LAYOUT__maxTaskWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxTaskWorkGroupSize() {return this.ptr.asSlice(OFFSET__maxTaskWorkGroupSize, LAYOUT__maxTaskWorkGroupSize);}
    public int maxTaskWorkGroupSize(int index) {return this.maxTaskWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxTaskWorkGroupSize(int index, int value) {this.maxTaskWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxTaskTotalMemorySize() {return this.ptr.get(LAYOUT__maxTaskTotalMemorySize, OFFSET__maxTaskTotalMemorySize);}
    public void maxTaskTotalMemorySize(int value) {this.ptr.set(LAYOUT__maxTaskTotalMemorySize, OFFSET__maxTaskTotalMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxTaskTotalMemorySize() {return this.ptr.asSlice(OFFSET__maxTaskTotalMemorySize, LAYOUT__maxTaskTotalMemorySize);}

    public int maxTaskOutputCount() {return this.ptr.get(LAYOUT__maxTaskOutputCount, OFFSET__maxTaskOutputCount);}
    public void maxTaskOutputCount(int value) {this.ptr.set(LAYOUT__maxTaskOutputCount, OFFSET__maxTaskOutputCount, value);}
    public java.lang.foreign.MemorySegment $maxTaskOutputCount() {return this.ptr.asSlice(OFFSET__maxTaskOutputCount, LAYOUT__maxTaskOutputCount);}

    public int maxMeshWorkGroupInvocations() {return this.ptr.get(LAYOUT__maxMeshWorkGroupInvocations, OFFSET__maxMeshWorkGroupInvocations);}
    public void maxMeshWorkGroupInvocations(int value) {this.ptr.set(LAYOUT__maxMeshWorkGroupInvocations, OFFSET__maxMeshWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment $maxMeshWorkGroupInvocations() {return this.ptr.asSlice(OFFSET__maxMeshWorkGroupInvocations, LAYOUT__maxMeshWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxMeshWorkGroupSize() {return this.ptr.asSlice(OFFSET__maxMeshWorkGroupSize, LAYOUT__maxMeshWorkGroupSize);}
    public int maxMeshWorkGroupSize(int index) {return this.maxMeshWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void maxMeshWorkGroupSize(int index, int value) {this.maxMeshWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public int maxMeshTotalMemorySize() {return this.ptr.get(LAYOUT__maxMeshTotalMemorySize, OFFSET__maxMeshTotalMemorySize);}
    public void maxMeshTotalMemorySize(int value) {this.ptr.set(LAYOUT__maxMeshTotalMemorySize, OFFSET__maxMeshTotalMemorySize, value);}
    public java.lang.foreign.MemorySegment $maxMeshTotalMemorySize() {return this.ptr.asSlice(OFFSET__maxMeshTotalMemorySize, LAYOUT__maxMeshTotalMemorySize);}

    public int maxMeshOutputVertices() {return this.ptr.get(LAYOUT__maxMeshOutputVertices, OFFSET__maxMeshOutputVertices);}
    public void maxMeshOutputVertices(int value) {this.ptr.set(LAYOUT__maxMeshOutputVertices, OFFSET__maxMeshOutputVertices, value);}
    public java.lang.foreign.MemorySegment $maxMeshOutputVertices() {return this.ptr.asSlice(OFFSET__maxMeshOutputVertices, LAYOUT__maxMeshOutputVertices);}

    public int maxMeshOutputPrimitives() {return this.ptr.get(LAYOUT__maxMeshOutputPrimitives, OFFSET__maxMeshOutputPrimitives);}
    public void maxMeshOutputPrimitives(int value) {this.ptr.set(LAYOUT__maxMeshOutputPrimitives, OFFSET__maxMeshOutputPrimitives, value);}
    public java.lang.foreign.MemorySegment $maxMeshOutputPrimitives() {return this.ptr.asSlice(OFFSET__maxMeshOutputPrimitives, LAYOUT__maxMeshOutputPrimitives);}

    public int maxMeshMultiviewViewCount() {return this.ptr.get(LAYOUT__maxMeshMultiviewViewCount, OFFSET__maxMeshMultiviewViewCount);}
    public void maxMeshMultiviewViewCount(int value) {this.ptr.set(LAYOUT__maxMeshMultiviewViewCount, OFFSET__maxMeshMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment $maxMeshMultiviewViewCount() {return this.ptr.asSlice(OFFSET__maxMeshMultiviewViewCount, LAYOUT__maxMeshMultiviewViewCount);}

    public int meshOutputPerVertexGranularity() {return this.ptr.get(LAYOUT__meshOutputPerVertexGranularity, OFFSET__meshOutputPerVertexGranularity);}
    public void meshOutputPerVertexGranularity(int value) {this.ptr.set(LAYOUT__meshOutputPerVertexGranularity, OFFSET__meshOutputPerVertexGranularity, value);}
    public java.lang.foreign.MemorySegment $meshOutputPerVertexGranularity() {return this.ptr.asSlice(OFFSET__meshOutputPerVertexGranularity, LAYOUT__meshOutputPerVertexGranularity);}

    public int meshOutputPerPrimitiveGranularity() {return this.ptr.get(LAYOUT__meshOutputPerPrimitiveGranularity, OFFSET__meshOutputPerPrimitiveGranularity);}
    public void meshOutputPerPrimitiveGranularity(int value) {this.ptr.set(LAYOUT__meshOutputPerPrimitiveGranularity, OFFSET__meshOutputPerPrimitiveGranularity, value);}
    public java.lang.foreign.MemorySegment $meshOutputPerPrimitiveGranularity() {return this.ptr.asSlice(OFFSET__meshOutputPerPrimitiveGranularity, LAYOUT__meshOutputPerPrimitiveGranularity);}
}
