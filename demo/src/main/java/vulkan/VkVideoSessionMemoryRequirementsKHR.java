package vulkan;

public record VkVideoSessionMemoryRequirementsKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryBindIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryBindIndex = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__memoryRequirements = vulkan.VkMemoryRequirements.gRecordLayout;
    public static final long OFFSET__memoryRequirements = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__memoryBindIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__memoryRequirements
    ).withByteAlignment(8).withName("VkVideoSessionMemoryRequirementsKHR");

    public VkVideoSessionMemoryRequirementsKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoSessionMemoryRequirementsKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoSessionMemoryRequirementsKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoSessionMemoryRequirementsKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int memoryBindIndex() {return this.ptr.get(LAYOUT__memoryBindIndex, OFFSET__memoryBindIndex);}
    public void memoryBindIndex(int value) {this.ptr.set(LAYOUT__memoryBindIndex, OFFSET__memoryBindIndex, value);}
    public java.lang.foreign.MemorySegment $memoryBindIndex() {return this.ptr.asSlice(OFFSET__memoryBindIndex, LAYOUT__memoryBindIndex);}

    public vulkan.VkMemoryRequirements memoryRequirements() {return new vulkan.VkMemoryRequirements(this.ptr.asSlice(OFFSET__memoryRequirements, LAYOUT__memoryRequirements));}
    public void memoryRequirements(java.util.function.Consumer<vulkan.VkMemoryRequirements> consumer) {consumer.accept(this.memoryRequirements());}
    public void memoryRequirements(vulkan.VkMemoryRequirements value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__memoryRequirements, LAYOUT__memoryRequirements.byteSize());}
}
