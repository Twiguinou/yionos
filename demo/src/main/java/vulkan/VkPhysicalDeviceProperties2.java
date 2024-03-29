package vulkan;

public record VkPhysicalDeviceProperties2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$properties = vulkan.VkPhysicalDeviceProperties.gStructLayout;
    public static final long OFFSET$properties = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$properties
    ).withName("VkPhysicalDeviceProperties2");

    public VkPhysicalDeviceProperties2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceProperties2 getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceProperties2(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkPhysicalDeviceProperties properties() {return new vulkan.VkPhysicalDeviceProperties(this.ptr.asSlice(OFFSET$properties, LAYOUT$properties));}
    public void properties(java.util.function.Consumer<vulkan.VkPhysicalDeviceProperties> consumer) {consumer.accept(this.properties());}
    public void properties(vulkan.VkPhysicalDeviceProperties value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$properties, LAYOUT$properties.byteSize());}
}
