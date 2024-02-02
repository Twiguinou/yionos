package vulkan;

public record VkQueueFamilyProperties2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$queueFamilyProperties = vulkan.VkQueueFamilyProperties.gStructLayout;
    public static final long OFFSET$queueFamilyProperties = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$queueFamilyProperties
    ).withName("VkQueueFamilyProperties2");

    public VkQueueFamilyProperties2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkQueueFamilyProperties2 getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkQueueFamilyProperties2(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkQueueFamilyProperties queueFamilyProperties() {return new vulkan.VkQueueFamilyProperties(this.ptr.asSlice(OFFSET$queueFamilyProperties, LAYOUT$queueFamilyProperties));}
    public void queueFamilyProperties(java.util.function.Consumer<vulkan.VkQueueFamilyProperties> consumer) {consumer.accept(this.queueFamilyProperties());}
    public void queueFamilyProperties(vulkan.VkQueueFamilyProperties value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$queueFamilyProperties, LAYOUT$queueFamilyProperties.byteSize());}
}
