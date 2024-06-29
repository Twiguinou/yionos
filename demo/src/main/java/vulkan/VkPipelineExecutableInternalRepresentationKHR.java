package vulkan;

public record VkPipelineExecutableInternalRepresentationKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__name = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__description = 272;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isText = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__isText = 528;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__dataSize = 536;
    public static final java.lang.foreign.AddressLayout LAYOUT__pData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pData = 544;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__name,
            LAYOUT__description,
            LAYOUT__isText,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__dataSize,
            LAYOUT__pData
    ).withByteAlignment(8).withName("VkPipelineExecutableInternalRepresentationKHR");

    public VkPipelineExecutableInternalRepresentationKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineExecutableInternalRepresentationKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineExecutableInternalRepresentationKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineExecutableInternalRepresentationKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment name() {return this.ptr.asSlice(OFFSET__name, LAYOUT__name);}
    public byte name(int index) {return this.name().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void name(int index, byte value) {this.name().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET__description, LAYOUT__description);}
    public byte description(int index) {return this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void description(int index, byte value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int isText() {return this.ptr.get(LAYOUT__isText, OFFSET__isText);}
    public void isText(int value) {this.ptr.set(LAYOUT__isText, OFFSET__isText, value);}
    public java.lang.foreign.MemorySegment $isText() {return this.ptr.asSlice(OFFSET__isText, LAYOUT__isText);}

    public long dataSize() {return this.ptr.get(LAYOUT__dataSize, OFFSET__dataSize);}
    public void dataSize(long value) {this.ptr.set(LAYOUT__dataSize, OFFSET__dataSize, value);}
    public java.lang.foreign.MemorySegment $dataSize() {return this.ptr.asSlice(OFFSET__dataSize, LAYOUT__dataSize);}

    public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT__pData, OFFSET__pData);}
    public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pData, OFFSET__pData, value);}
    public java.lang.foreign.MemorySegment $pData() {return this.ptr.asSlice(OFFSET__pData, LAYOUT__pData);}
}
