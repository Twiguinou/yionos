package vulkan;

public record VkDepthBiasInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__depthBiasConstantFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__depthBiasConstantFactor = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__depthBiasClamp = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__depthBiasClamp = 20;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__depthBiasSlopeFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__depthBiasSlopeFactor = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__depthBiasConstantFactor,
            LAYOUT__depthBiasClamp,
            LAYOUT__depthBiasSlopeFactor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDepthBiasInfoEXT");

    public VkDepthBiasInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDepthBiasInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDepthBiasInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDepthBiasInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public float depthBiasConstantFactor() {return this.ptr.get(LAYOUT__depthBiasConstantFactor, OFFSET__depthBiasConstantFactor);}
    public void depthBiasConstantFactor(float value) {this.ptr.set(LAYOUT__depthBiasConstantFactor, OFFSET__depthBiasConstantFactor, value);}
    public java.lang.foreign.MemorySegment $depthBiasConstantFactor() {return this.ptr.asSlice(OFFSET__depthBiasConstantFactor, LAYOUT__depthBiasConstantFactor);}

    public float depthBiasClamp() {return this.ptr.get(LAYOUT__depthBiasClamp, OFFSET__depthBiasClamp);}
    public void depthBiasClamp(float value) {this.ptr.set(LAYOUT__depthBiasClamp, OFFSET__depthBiasClamp, value);}
    public java.lang.foreign.MemorySegment $depthBiasClamp() {return this.ptr.asSlice(OFFSET__depthBiasClamp, LAYOUT__depthBiasClamp);}

    public float depthBiasSlopeFactor() {return this.ptr.get(LAYOUT__depthBiasSlopeFactor, OFFSET__depthBiasSlopeFactor);}
    public void depthBiasSlopeFactor(float value) {this.ptr.set(LAYOUT__depthBiasSlopeFactor, OFFSET__depthBiasSlopeFactor, value);}
    public java.lang.foreign.MemorySegment $depthBiasSlopeFactor() {return this.ptr.asSlice(OFFSET__depthBiasSlopeFactor, LAYOUT__depthBiasSlopeFactor);}
}
