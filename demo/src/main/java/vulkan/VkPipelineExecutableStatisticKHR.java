package vulkan;

public record VkPipelineExecutableStatisticKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$name = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$description = 272L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$format = 528L;
    public static final java.lang.foreign.GroupLayout LAYOUT$value = vulkan.VkPipelineExecutableStatisticValueKHR.gStructLayout;
    public static final long OFFSET$value = 536L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$name,
            LAYOUT$description,
            LAYOUT$format,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$value
    ).withName("VkPipelineExecutableStatisticKHR");

    public VkPipelineExecutableStatisticKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPipelineExecutableStatisticKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPipelineExecutableStatisticKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment name() {return this.ptr.asSlice(OFFSET$name, LAYOUT$name);}
    public char name(int i) {return (char)this.name().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void name(int i, char value) {this.name().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
    public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
    public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
    public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

    public vulkan.VkPipelineExecutableStatisticValueKHR value() {return new vulkan.VkPipelineExecutableStatisticValueKHR(this.ptr.asSlice(OFFSET$value, LAYOUT$value));}
    public void value(java.util.function.Consumer<vulkan.VkPipelineExecutableStatisticValueKHR> consumer) {consumer.accept(this.value());}
    public void value(vulkan.VkPipelineExecutableStatisticValueKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$value, LAYOUT$value.byteSize());}
}
