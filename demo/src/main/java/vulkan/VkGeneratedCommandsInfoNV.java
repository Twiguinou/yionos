package vulkan;

public record VkGeneratedCommandsInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pipelineBindPoint = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pipeline = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pipeline = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__indirectCommandsLayout = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__indirectCommandsLayout = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__streamCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__streamCount = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStreams = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStreams = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sequencesCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sequencesCount = 56;
    public static final java.lang.foreign.AddressLayout LAYOUT__preprocessBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__preprocessBuffer = 64;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__preprocessOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__preprocessOffset = 72;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__preprocessSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__preprocessSize = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__sequencesCountBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__sequencesCountBuffer = 88;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__sequencesCountOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__sequencesCountOffset = 96;
    public static final java.lang.foreign.AddressLayout LAYOUT__sequencesIndexBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__sequencesIndexBuffer = 104;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__sequencesIndexOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__sequencesIndexOffset = 112;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pipelineBindPoint,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pipeline,
            LAYOUT__indirectCommandsLayout,
            LAYOUT__streamCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStreams,
            LAYOUT__sequencesCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__preprocessBuffer,
            LAYOUT__preprocessOffset,
            LAYOUT__preprocessSize,
            LAYOUT__sequencesCountBuffer,
            LAYOUT__sequencesCountOffset,
            LAYOUT__sequencesIndexBuffer,
            LAYOUT__sequencesIndexOffset
    ).withByteAlignment(8).withName("VkGeneratedCommandsInfoNV");

    public VkGeneratedCommandsInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkGeneratedCommandsInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkGeneratedCommandsInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkGeneratedCommandsInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int pipelineBindPoint() {return this.ptr.get(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint);}
    public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT__pipelineBindPoint, OFFSET__pipelineBindPoint, value);}
    public java.lang.foreign.MemorySegment $pipelineBindPoint() {return this.ptr.asSlice(OFFSET__pipelineBindPoint, LAYOUT__pipelineBindPoint);}

    public java.lang.foreign.MemorySegment pipeline() {return this.ptr.get(LAYOUT__pipeline, OFFSET__pipeline);}
    public void pipeline(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pipeline, OFFSET__pipeline, value);}
    public java.lang.foreign.MemorySegment $pipeline() {return this.ptr.asSlice(OFFSET__pipeline, LAYOUT__pipeline);}

    public java.lang.foreign.MemorySegment indirectCommandsLayout() {return this.ptr.get(LAYOUT__indirectCommandsLayout, OFFSET__indirectCommandsLayout);}
    public void indirectCommandsLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__indirectCommandsLayout, OFFSET__indirectCommandsLayout, value);}
    public java.lang.foreign.MemorySegment $indirectCommandsLayout() {return this.ptr.asSlice(OFFSET__indirectCommandsLayout, LAYOUT__indirectCommandsLayout);}

    public int streamCount() {return this.ptr.get(LAYOUT__streamCount, OFFSET__streamCount);}
    public void streamCount(int value) {this.ptr.set(LAYOUT__streamCount, OFFSET__streamCount, value);}
    public java.lang.foreign.MemorySegment $streamCount() {return this.ptr.asSlice(OFFSET__streamCount, LAYOUT__streamCount);}

    public java.lang.foreign.MemorySegment pStreams() {return this.ptr.get(LAYOUT__pStreams, OFFSET__pStreams);}
    public void pStreams(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStreams, OFFSET__pStreams, value);}
    public java.lang.foreign.MemorySegment $pStreams() {return this.ptr.asSlice(OFFSET__pStreams, LAYOUT__pStreams);}

    public int sequencesCount() {return this.ptr.get(LAYOUT__sequencesCount, OFFSET__sequencesCount);}
    public void sequencesCount(int value) {this.ptr.set(LAYOUT__sequencesCount, OFFSET__sequencesCount, value);}
    public java.lang.foreign.MemorySegment $sequencesCount() {return this.ptr.asSlice(OFFSET__sequencesCount, LAYOUT__sequencesCount);}

    public java.lang.foreign.MemorySegment preprocessBuffer() {return this.ptr.get(LAYOUT__preprocessBuffer, OFFSET__preprocessBuffer);}
    public void preprocessBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__preprocessBuffer, OFFSET__preprocessBuffer, value);}
    public java.lang.foreign.MemorySegment $preprocessBuffer() {return this.ptr.asSlice(OFFSET__preprocessBuffer, LAYOUT__preprocessBuffer);}

    public long preprocessOffset() {return this.ptr.get(LAYOUT__preprocessOffset, OFFSET__preprocessOffset);}
    public void preprocessOffset(long value) {this.ptr.set(LAYOUT__preprocessOffset, OFFSET__preprocessOffset, value);}
    public java.lang.foreign.MemorySegment $preprocessOffset() {return this.ptr.asSlice(OFFSET__preprocessOffset, LAYOUT__preprocessOffset);}

    public long preprocessSize() {return this.ptr.get(LAYOUT__preprocessSize, OFFSET__preprocessSize);}
    public void preprocessSize(long value) {this.ptr.set(LAYOUT__preprocessSize, OFFSET__preprocessSize, value);}
    public java.lang.foreign.MemorySegment $preprocessSize() {return this.ptr.asSlice(OFFSET__preprocessSize, LAYOUT__preprocessSize);}

    public java.lang.foreign.MemorySegment sequencesCountBuffer() {return this.ptr.get(LAYOUT__sequencesCountBuffer, OFFSET__sequencesCountBuffer);}
    public void sequencesCountBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__sequencesCountBuffer, OFFSET__sequencesCountBuffer, value);}
    public java.lang.foreign.MemorySegment $sequencesCountBuffer() {return this.ptr.asSlice(OFFSET__sequencesCountBuffer, LAYOUT__sequencesCountBuffer);}

    public long sequencesCountOffset() {return this.ptr.get(LAYOUT__sequencesCountOffset, OFFSET__sequencesCountOffset);}
    public void sequencesCountOffset(long value) {this.ptr.set(LAYOUT__sequencesCountOffset, OFFSET__sequencesCountOffset, value);}
    public java.lang.foreign.MemorySegment $sequencesCountOffset() {return this.ptr.asSlice(OFFSET__sequencesCountOffset, LAYOUT__sequencesCountOffset);}

    public java.lang.foreign.MemorySegment sequencesIndexBuffer() {return this.ptr.get(LAYOUT__sequencesIndexBuffer, OFFSET__sequencesIndexBuffer);}
    public void sequencesIndexBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__sequencesIndexBuffer, OFFSET__sequencesIndexBuffer, value);}
    public java.lang.foreign.MemorySegment $sequencesIndexBuffer() {return this.ptr.asSlice(OFFSET__sequencesIndexBuffer, LAYOUT__sequencesIndexBuffer);}

    public long sequencesIndexOffset() {return this.ptr.get(LAYOUT__sequencesIndexOffset, OFFSET__sequencesIndexOffset);}
    public void sequencesIndexOffset(long value) {this.ptr.set(LAYOUT__sequencesIndexOffset, OFFSET__sequencesIndexOffset, value);}
    public java.lang.foreign.MemorySegment $sequencesIndexOffset() {return this.ptr.asSlice(OFFSET__sequencesIndexOffset, LAYOUT__sequencesIndexOffset);}
}
