package vulkan;

public record VkQueueFamilyGlobalPriorityPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__priorityCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("priorityCount");
    public static final long OFFSET__priorityCount = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__priorities = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_INT).withName("priorities");
    public static final long OFFSET__priorities = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__priorityCount,
            LAYOUT__priorities,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkQueueFamilyGlobalPriorityPropertiesKHR");

    public VkQueueFamilyGlobalPriorityPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkQueueFamilyGlobalPriorityPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkQueueFamilyGlobalPriorityPropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int priorityCount() {return this.ptr.get(LAYOUT__priorityCount, OFFSET__priorityCount);}
    public void priorityCount(int value) {this.ptr.set(LAYOUT__priorityCount, OFFSET__priorityCount, value);}
    public java.lang.foreign.MemorySegment $priorityCount() {return this.ptr.asSlice(OFFSET__priorityCount, LAYOUT__priorityCount);}

    public java.lang.foreign.MemorySegment priorities() {return this.ptr.asSlice(OFFSET__priorities, LAYOUT__priorities);}
    public int priorities(int index) {return this.priorities().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void priorities(int index, int value) {this.priorities().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}
}
