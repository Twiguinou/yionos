package vulkan;

public record VkDisplayPlaneProperties2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$displayPlaneProperties = vulkan.VkDisplayPlanePropertiesKHR.gStructLayout;
    public static final long OFFSET$displayPlaneProperties = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$displayPlaneProperties
    ).withName("VkDisplayPlaneProperties2KHR");

    public VkDisplayPlaneProperties2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDisplayPlaneProperties2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDisplayPlaneProperties2KHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkDisplayPlanePropertiesKHR displayPlaneProperties() {return new vulkan.VkDisplayPlanePropertiesKHR(this.ptr.asSlice(OFFSET$displayPlaneProperties, LAYOUT$displayPlaneProperties));}
    public void displayPlaneProperties(java.util.function.Consumer<vulkan.VkDisplayPlanePropertiesKHR> consumer) {consumer.accept(this.displayPlaneProperties());}
    public void displayPlaneProperties(vulkan.VkDisplayPlanePropertiesKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$displayPlaneProperties, LAYOUT$displayPlaneProperties.byteSize());}
}
