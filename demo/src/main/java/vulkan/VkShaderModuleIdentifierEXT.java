package vulkan;

public record VkShaderModuleIdentifierEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__identifierSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__identifierSize = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__identifier = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__identifier = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__identifierSize,
            LAYOUT__identifier,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkShaderModuleIdentifierEXT");

    public VkShaderModuleIdentifierEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkShaderModuleIdentifierEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkShaderModuleIdentifierEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkShaderModuleIdentifierEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int identifierSize() {return this.ptr.get(LAYOUT__identifierSize, OFFSET__identifierSize);}
    public void identifierSize(int value) {this.ptr.set(LAYOUT__identifierSize, OFFSET__identifierSize, value);}
    public java.lang.foreign.MemorySegment $identifierSize() {return this.ptr.asSlice(OFFSET__identifierSize, LAYOUT__identifierSize);}

    public java.lang.foreign.MemorySegment identifier() {return this.ptr.asSlice(OFFSET__identifier, LAYOUT__identifier);}
    public byte identifier(int index) {return this.identifier().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void identifier(int index, byte value) {this.identifier().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
