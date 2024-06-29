package vulkan;

public record VkDepthBiasRepresentationInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBiasRepresentation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthBiasRepresentation = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBiasExact = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthBiasExact = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__depthBiasRepresentation,
            LAYOUT__depthBiasExact
    ).withByteAlignment(8).withName("VkDepthBiasRepresentationInfoEXT");

    public VkDepthBiasRepresentationInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDepthBiasRepresentationInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDepthBiasRepresentationInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDepthBiasRepresentationInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int depthBiasRepresentation() {return this.ptr.get(LAYOUT__depthBiasRepresentation, OFFSET__depthBiasRepresentation);}
    public void depthBiasRepresentation(int value) {this.ptr.set(LAYOUT__depthBiasRepresentation, OFFSET__depthBiasRepresentation, value);}
    public java.lang.foreign.MemorySegment $depthBiasRepresentation() {return this.ptr.asSlice(OFFSET__depthBiasRepresentation, LAYOUT__depthBiasRepresentation);}

    public int depthBiasExact() {return this.ptr.get(LAYOUT__depthBiasExact, OFFSET__depthBiasExact);}
    public void depthBiasExact(int value) {this.ptr.set(LAYOUT__depthBiasExact, OFFSET__depthBiasExact, value);}
    public java.lang.foreign.MemorySegment $depthBiasExact() {return this.ptr.asSlice(OFFSET__depthBiasExact, LAYOUT__depthBiasExact);}
}
