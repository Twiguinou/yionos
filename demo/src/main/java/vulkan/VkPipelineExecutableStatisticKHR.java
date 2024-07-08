package vulkan;

public record VkPipelineExecutableStatisticKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("name");
    public static final long OFFSET__name = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("description");
    public static final long OFFSET__description = 272;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 528;
    public static final java.lang.foreign.UnionLayout LAYOUT__value = vulkan.VkPipelineExecutableStatisticValueKHR.gRecordLayout.withName("value");
    public static final long OFFSET__value = 536;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__name,
            LAYOUT__description,
            LAYOUT__format,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__value
    ).withByteAlignment(8).withName("VkPipelineExecutableStatisticKHR");

    public VkPipelineExecutableStatisticKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineExecutableStatisticKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineExecutableStatisticKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineExecutableStatisticKHR value)
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

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public vulkan.VkPipelineExecutableStatisticValueKHR value() {return new vulkan.VkPipelineExecutableStatisticValueKHR(this.ptr.asSlice(OFFSET__value, LAYOUT__value));}
    public void value(java.util.function.Consumer<vulkan.VkPipelineExecutableStatisticValueKHR> consumer) {consumer.accept(this.value());}
    public void value(vulkan.VkPipelineExecutableStatisticValueKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__value, LAYOUT__value.byteSize());}
}
