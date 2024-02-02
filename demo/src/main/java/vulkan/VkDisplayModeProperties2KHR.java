package vulkan;

public record VkDisplayModeProperties2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$displayModeProperties = vulkan.VkDisplayModePropertiesKHR.gStructLayout;
    public static final long OFFSET$displayModeProperties = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$displayModeProperties
    ).withName("VkDisplayModeProperties2KHR");

    public VkDisplayModeProperties2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDisplayModeProperties2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDisplayModeProperties2KHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkDisplayModePropertiesKHR displayModeProperties() {return new vulkan.VkDisplayModePropertiesKHR(this.ptr.asSlice(OFFSET$displayModeProperties, LAYOUT$displayModeProperties));}
    public void displayModeProperties(java.util.function.Consumer<vulkan.VkDisplayModePropertiesKHR> consumer) {consumer.accept(this.displayModeProperties());}
    public void displayModeProperties(vulkan.VkDisplayModePropertiesKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$displayModeProperties, LAYOUT$displayModeProperties.byteSize());}
}
