package vulkan;

public record VkDisplayProperties2KHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$displayProperties = vulkan.VkDisplayPropertiesKHR.gStructLayout;
    public static final long OFFSET$displayProperties = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$displayProperties
    ).withName("VkDisplayProperties2KHR");

    public VkDisplayProperties2KHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDisplayProperties2KHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDisplayProperties2KHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkDisplayPropertiesKHR displayProperties() {return new vulkan.VkDisplayPropertiesKHR(this.ptr.asSlice(OFFSET$displayProperties, LAYOUT$displayProperties));}
    public void displayProperties(java.util.function.Consumer<vulkan.VkDisplayPropertiesKHR> consumer) {consumer.accept(this.displayProperties());}
    public void displayProperties(vulkan.VkDisplayPropertiesKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$displayProperties, LAYOUT$displayProperties.byteSize());}
}
