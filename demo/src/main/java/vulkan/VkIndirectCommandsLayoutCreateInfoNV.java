package vulkan;

public record VkIndirectCommandsLayoutCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pipelineBindPoint = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tokenCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__tokenCount = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTokens = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pTokens = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__streamCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__streamCount = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStreamStrides = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStreamStrides = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            LAYOUT__pipelineBindPoint,
            LAYOUT__tokenCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pTokens,
            LAYOUT__streamCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStreamStrides
    ).withByteAlignment(8).withName("VkIndirectCommandsLayoutCreateInfoNV");

    public VkIndirectCommandsLayoutCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkIndirectCommandsLayoutCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkIndirectCommandsLayoutCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkIndirectCommandsLayoutCreateInfoNV value)
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

    public int pipelineBindPoint() {return this.ptr.get(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint);}
    public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint, value);}
    public java.lang.foreign.MemorySegment $pipelineBindPoint() {return this.ptr.asSlice(OFFSET__pipelineBindPoint, LAYOUT__pipelineBindPoint);}

    public int tokenCount() {return this.ptr.get(LAYOUT__tokenCount, OFFSET__tokenCount);}
    public void tokenCount(int value) {this.ptr.set(LAYOUT__tokenCount, OFFSET__tokenCount, value);}
    public java.lang.foreign.MemorySegment $tokenCount() {return this.ptr.asSlice(OFFSET__tokenCount, LAYOUT__tokenCount);}

    public java.lang.foreign.MemorySegment pTokens() {return this.ptr.get(LAYOUT__pTokens, OFFSET__pTokens);}
    public void pTokens(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTokens, OFFSET__pTokens, value);}
    public java.lang.foreign.MemorySegment $pTokens() {return this.ptr.asSlice(OFFSET__pTokens, LAYOUT__pTokens);}

    public int streamCount() {return this.ptr.get(LAYOUT__streamCount, OFFSET__streamCount);}
    public void streamCount(int value) {this.ptr.set(LAYOUT__streamCount, OFFSET__streamCount, value);}
    public java.lang.foreign.MemorySegment $streamCount() {return this.ptr.asSlice(OFFSET__streamCount, LAYOUT__streamCount);}

    public java.lang.foreign.MemorySegment pStreamStrides() {return this.ptr.get(LAYOUT__pStreamStrides, OFFSET__pStreamStrides);}
    public void pStreamStrides(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStreamStrides, OFFSET__pStreamStrides, value);}
    public java.lang.foreign.MemorySegment $pStreamStrides() {return this.ptr.asSlice(OFFSET__pStreamStrides, LAYOUT__pStreamStrides);}
}
