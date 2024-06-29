package vulkan;

public record VkPipelineShaderStageModuleIdentifierCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__identifierSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__identifierSize = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pIdentifier = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pIdentifier = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__identifierSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pIdentifier
    ).withByteAlignment(8).withName("VkPipelineShaderStageModuleIdentifierCreateInfoEXT");

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineShaderStageModuleIdentifierCreateInfoEXT value)
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

    public java.lang.foreign.MemorySegment pIdentifier() {return this.ptr.get(LAYOUT__pIdentifier, OFFSET__pIdentifier);}
    public void pIdentifier(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pIdentifier, OFFSET__pIdentifier, value);}
    public java.lang.foreign.MemorySegment $pIdentifier() {return this.ptr.asSlice(OFFSET__pIdentifier, LAYOUT__pIdentifier);}
}
