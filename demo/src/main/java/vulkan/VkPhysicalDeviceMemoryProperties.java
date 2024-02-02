package vulkan;

public record VkPhysicalDeviceMemoryProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryTypeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryTypeCount = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$memoryTypes = java.lang.foreign.MemoryLayout.sequenceLayout(32, vulkan.VkMemoryType.gStructLayout);
    public static final long OFFSET$memoryTypes = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryHeapCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryHeapCount = 260L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$memoryHeaps = java.lang.foreign.MemoryLayout.sequenceLayout(16, vulkan.VkMemoryHeap.gStructLayout);
    public static final long OFFSET$memoryHeaps = 264L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$memoryTypeCount,
            LAYOUT$memoryTypes,
            LAYOUT$memoryHeapCount,
            LAYOUT$memoryHeaps
    ).withName("VkPhysicalDeviceMemoryProperties");

    public VkPhysicalDeviceMemoryProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceMemoryProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceMemoryProperties(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int memoryTypeCount() {return this.ptr.get(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount);}
    public void memoryTypeCount(int value) {this.ptr.set(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount, value);}
    public java.lang.foreign.MemorySegment memoryTypeCount_ptr() {return this.ptr.asSlice(OFFSET$memoryTypeCount, LAYOUT$memoryTypeCount);}

    public java.lang.foreign.MemorySegment memoryTypes() {return this.ptr.asSlice(OFFSET$memoryTypes, LAYOUT$memoryTypes);}
    public vulkan.VkMemoryType memoryTypes(int i) {return new vulkan.VkMemoryType(this.ptr.asSlice(OFFSET$memoryTypes + i * LAYOUT$memoryTypes.byteSize(), LAYOUT$memoryTypes));}
    public void memoryTypes(int i, java.util.function.Consumer<vulkan.VkMemoryType> consumer) {consumer.accept(this.memoryTypes(i));}
    public void memoryTypes(int i, vulkan.VkMemoryType value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$memoryTypes + i * LAYOUT$memoryTypes.byteSize(), LAYOUT$memoryTypes.byteSize());}

    public int memoryHeapCount() {return this.ptr.get(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount);}
    public void memoryHeapCount(int value) {this.ptr.set(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount, value);}
    public java.lang.foreign.MemorySegment memoryHeapCount_ptr() {return this.ptr.asSlice(OFFSET$memoryHeapCount, LAYOUT$memoryHeapCount);}

    public java.lang.foreign.MemorySegment memoryHeaps() {return this.ptr.asSlice(OFFSET$memoryHeaps, LAYOUT$memoryHeaps);}
    public vulkan.VkMemoryHeap memoryHeaps(int i) {return new vulkan.VkMemoryHeap(this.ptr.asSlice(OFFSET$memoryHeaps + i * LAYOUT$memoryHeaps.byteSize(), LAYOUT$memoryHeaps));}
    public void memoryHeaps(int i, java.util.function.Consumer<vulkan.VkMemoryHeap> consumer) {consumer.accept(this.memoryHeaps(i));}
    public void memoryHeaps(int i, vulkan.VkMemoryHeap value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$memoryHeaps + i * LAYOUT$memoryHeaps.byteSize(), LAYOUT$memoryHeaps.byteSize());}
}
