package vulkan;

public record VkDisplayModeParametersKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$visibleRegion = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$visibleRegion = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$refreshRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$refreshRate = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$visibleRegion,
            LAYOUT$refreshRate
    ).withName("VkDisplayModeParametersKHR");

    public VkDisplayModeParametersKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDisplayModeParametersKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDisplayModeParametersKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.VkExtent2D visibleRegion() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$visibleRegion, LAYOUT$visibleRegion));}
    public void visibleRegion(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.visibleRegion());}
    public void visibleRegion(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$visibleRegion, LAYOUT$visibleRegion.byteSize());}

    public int refreshRate() {return this.ptr.get(LAYOUT$refreshRate, OFFSET$refreshRate);}
    public void refreshRate(int value) {this.ptr.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);}
    public java.lang.foreign.MemorySegment refreshRate_ptr() {return this.ptr.asSlice(OFFSET$refreshRate, LAYOUT$refreshRate);}
}
