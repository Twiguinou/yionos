package vulkan;

public record VkPipelineRasterizationConservativeStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conservativeRasterizationMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__conservativeRasterizationMode = 20;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__extraPrimitiveOverestimationSize = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__extraPrimitiveOverestimationSize = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__conservativeRasterizationMode,
            LAYOUT__extraPrimitiveOverestimationSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPipelineRasterizationConservativeStateCreateInfoEXT");

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineRasterizationConservativeStateCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int conservativeRasterizationMode() {return this.ptr.get(LAYOUT__conservativeRasterizationMode, OFFSET__conservativeRasterizationMode);}
    public void conservativeRasterizationMode(int value) {this.ptr.set(LAYOUT__conservativeRasterizationMode, OFFSET__conservativeRasterizationMode, value);}
    public java.lang.foreign.MemorySegment $conservativeRasterizationMode() {return this.ptr.asSlice(OFFSET__conservativeRasterizationMode, LAYOUT__conservativeRasterizationMode);}

    public float extraPrimitiveOverestimationSize() {return this.ptr.get(LAYOUT__extraPrimitiveOverestimationSize, OFFSET__extraPrimitiveOverestimationSize);}
    public void extraPrimitiveOverestimationSize(float value) {this.ptr.set(LAYOUT__extraPrimitiveOverestimationSize, OFFSET__extraPrimitiveOverestimationSize, value);}
    public java.lang.foreign.MemorySegment $extraPrimitiveOverestimationSize() {return this.ptr.asSlice(OFFSET__extraPrimitiveOverestimationSize, LAYOUT__extraPrimitiveOverestimationSize);}
}
