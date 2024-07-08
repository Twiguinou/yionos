package vulkan;

public record VkPipelineViewportStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__viewportCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("viewportCount");
    public static final long OFFSET__viewportCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pViewports = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pViewports");
    public static final long OFFSET__pViewports = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__scissorCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("scissorCount");
    public static final long OFFSET__scissorCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pScissors = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pScissors");
    public static final long OFFSET__pScissors = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__viewportCount,
            LAYOUT__pViewports,
            LAYOUT__scissorCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pScissors
    ).withByteAlignment(8).withName("VkPipelineViewportStateCreateInfo");

    public VkPipelineViewportStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineViewportStateCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineViewportStateCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineViewportStateCreateInfo value)
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

    public int viewportCount() {return this.ptr.get(LAYOUT__viewportCount, OFFSET__viewportCount);}
    public void viewportCount(int value) {this.ptr.set(LAYOUT__viewportCount, OFFSET__viewportCount, value);}
    public java.lang.foreign.MemorySegment $viewportCount() {return this.ptr.asSlice(OFFSET__viewportCount, LAYOUT__viewportCount);}

    public java.lang.foreign.MemorySegment pViewports() {return this.ptr.get(LAYOUT__pViewports, OFFSET__pViewports);}
    public void pViewports(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pViewports, OFFSET__pViewports, value);}
    public java.lang.foreign.MemorySegment $pViewports() {return this.ptr.asSlice(OFFSET__pViewports, LAYOUT__pViewports);}

    public int scissorCount() {return this.ptr.get(LAYOUT__scissorCount, OFFSET__scissorCount);}
    public void scissorCount(int value) {this.ptr.set(LAYOUT__scissorCount, OFFSET__scissorCount, value);}
    public java.lang.foreign.MemorySegment $scissorCount() {return this.ptr.asSlice(OFFSET__scissorCount, LAYOUT__scissorCount);}

    public java.lang.foreign.MemorySegment pScissors() {return this.ptr.get(LAYOUT__pScissors, OFFSET__pScissors);}
    public void pScissors(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pScissors, OFFSET__pScissors, value);}
    public java.lang.foreign.MemorySegment $pScissors() {return this.ptr.asSlice(OFFSET__pScissors, LAYOUT__pScissors);}
}
