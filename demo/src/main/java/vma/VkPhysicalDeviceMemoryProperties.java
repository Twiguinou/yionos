package vma;

public record VkPhysicalDeviceMemoryProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryTypeCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryTypeCount");
    public static final long OFFSET__memoryTypeCount = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__memoryTypes = java.lang.foreign.MemoryLayout.sequenceLayout(32, vma.VkMemoryType.gRecordLayout).withName("memoryTypes");
    public static final long OFFSET__memoryTypes = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryHeapCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryHeapCount");
    public static final long OFFSET__memoryHeapCount = 260;
    public static final java.lang.foreign.SequenceLayout LAYOUT__memoryHeaps = java.lang.foreign.MemoryLayout.sequenceLayout(16, vma.VkMemoryHeap.gRecordLayout).withName("memoryHeaps");
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
    public vma.VkMemoryType memoryTypes(int index) {return vma.VkMemoryType.getAtIndex(this.memoryTypes(), index);}
    public void memoryTypes(int index, java.util.function.Consumer<vma.VkMemoryType> consumer) {consumer.accept(this.memoryTypes(index));}
    public void memoryTypes(int index, vma.VkMemoryType value) {vma.VkMemoryType.setAtIndex(this.memoryTypes(), index, value);}

    public int memoryHeapCount() {return this.ptr.get(LAYOUT__memoryHeapCount, OFFSET__memoryHeapCount);}
    public void memoryHeapCount(int value) {this.ptr.set(LAYOUT__memoryHeapCount, OFFSET__memoryHeapCount, value);}
    public java.lang.foreign.MemorySegment $memoryHeapCount() {return this.ptr.asSlice(OFFSET__memoryHeapCount, LAYOUT__memoryHeapCount);}

    public java.lang.foreign.MemorySegment memoryHeaps() {return this.ptr.asSlice(OFFSET__memoryHeaps, LAYOUT__memoryHeaps);}
    public vma.VkMemoryHeap memoryHeaps(int index) {return vma.VkMemoryHeap.getAtIndex(this.memoryHeaps(), index);}
    public void memoryHeaps(int index, java.util.function.Consumer<vma.VkMemoryHeap> consumer) {consumer.accept(this.memoryHeaps(index));}
    public void memoryHeaps(int index, vma.VkMemoryHeap value) {vma.VkMemoryHeap.setAtIndex(this.memoryHeaps(), index, value);}
}
