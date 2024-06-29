package vulkan;

public record VkPhysicalDeviceMemoryProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryTypeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryTypeCount = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__memoryTypes = java.lang.foreign.MemoryLayout.sequenceLayout(32, vulkan.VkMemoryType.gRecordLayout);
    public static final long OFFSET__memoryTypes = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryHeapCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryHeapCount = 260;
    public static final java.lang.foreign.SequenceLayout LAYOUT__memoryHeaps = java.lang.foreign.MemoryLayout.sequenceLayout(16, vulkan.VkMemoryHeap.gRecordLayout);
    public static final long OFFSET__memoryHeaps = 264;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__memoryTypeCount,
            LAYOUT__memoryTypes,
            LAYOUT__memoryHeapCount,
            LAYOUT__memoryHeaps
    ).withByteAlignment(8).withName("VkPhysicalDeviceMemoryProperties");

    public VkPhysicalDeviceMemoryProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceMemoryProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceMemoryProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceMemoryProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int memoryTypeCount() {return this.ptr.get(LAYOUT__memoryTypeCount, OFFSET__memoryTypeCount);}
    public void memoryTypeCount(int value) {this.ptr.set(LAYOUT__memoryTypeCount, OFFSET__memoryTypeCount, value);}
    public java.lang.foreign.MemorySegment $memoryTypeCount() {return this.ptr.asSlice(OFFSET__memoryTypeCount, LAYOUT__memoryTypeCount);}

    public java.lang.foreign.MemorySegment memoryTypes() {return this.ptr.asSlice(OFFSET__memoryTypes, LAYOUT__memoryTypes);}
    public vulkan.VkMemoryType memoryTypes(int index) {return vulkan.VkMemoryType.getAtIndex(this.memoryTypes(), index);}
    public void memoryTypes(int index, java.util.function.Consumer<vulkan.VkMemoryType> consumer) {consumer.accept(this.memoryTypes(index));}
    public void memoryTypes(int index, vulkan.VkMemoryType value) {vulkan.VkMemoryType.setAtIndex(this.memoryTypes(), index, value);}

    public int memoryHeapCount() {return this.ptr.get(LAYOUT__memoryHeapCount, OFFSET__memoryHeapCount);}
    public void memoryHeapCount(int value) {this.ptr.set(LAYOUT__memoryHeapCount, OFFSET__memoryHeapCount, value);}
    public java.lang.foreign.MemorySegment $memoryHeapCount() {return this.ptr.asSlice(OFFSET__memoryHeapCount, LAYOUT__memoryHeapCount);}

    public java.lang.foreign.MemorySegment memoryHeaps() {return this.ptr.asSlice(OFFSET__memoryHeaps, LAYOUT__memoryHeaps);}
    public vulkan.VkMemoryHeap memoryHeaps(int index) {return vulkan.VkMemoryHeap.getAtIndex(this.memoryHeaps(), index);}
    public void memoryHeaps(int index, java.util.function.Consumer<vulkan.VkMemoryHeap> consumer) {consumer.accept(this.memoryHeaps(index));}
    public void memoryHeaps(int index, vulkan.VkMemoryHeap value) {vulkan.VkMemoryHeap.setAtIndex(this.memoryHeaps(), index, value);}
}
