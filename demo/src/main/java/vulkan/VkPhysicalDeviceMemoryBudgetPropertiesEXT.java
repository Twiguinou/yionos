package vulkan;

public record VkPhysicalDeviceMemoryBudgetPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__heapBudget = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_LONG);
    public static final long OFFSET__heapBudget = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__heapUsage = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_LONG);
    public static final long OFFSET__heapUsage = 144;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__heapBudget,
            LAYOUT__heapUsage
    ).withByteAlignment(8).withName("VkPhysicalDeviceMemoryBudgetPropertiesEXT");

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMemoryBudgetPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment heapBudget() {return this.ptr.asSlice(OFFSET__heapBudget, LAYOUT__heapBudget);}
    public long heapBudget(int index) {return this.heapBudget().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index);}
    public void heapBudget(int index, long value) {this.heapBudget().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index, value);}

    public java.lang.foreign.MemorySegment heapUsage() {return this.ptr.asSlice(OFFSET__heapUsage, LAYOUT__heapUsage);}
    public long heapUsage(int index) {return this.heapUsage().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index);}
    public void heapUsage(int index, long value) {this.heapUsage().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index, value);}
}
