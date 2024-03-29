package vulkan;

public record VkDisplayModePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$displayMode = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$displayMode = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$parameters = vulkan.VkDisplayModeParametersKHR.gStructLayout;
    public static final long OFFSET$parameters = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$displayMode,
            LAYOUT$parameters,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkDisplayModePropertiesKHR");

    public VkDisplayModePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDisplayModePropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDisplayModePropertiesKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment displayMode() {return this.ptr.get(LAYOUT$displayMode, OFFSET$displayMode);}
    public void displayMode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$displayMode, OFFSET$displayMode, value);}
    public java.lang.foreign.MemorySegment displayMode_ptr() {return this.ptr.asSlice(OFFSET$displayMode, LAYOUT$displayMode);}

    public vulkan.VkDisplayModeParametersKHR parameters() {return new vulkan.VkDisplayModeParametersKHR(this.ptr.asSlice(OFFSET$parameters, LAYOUT$parameters));}
    public void parameters(java.util.function.Consumer<vulkan.VkDisplayModeParametersKHR> consumer) {consumer.accept(this.parameters());}
    public void parameters(vulkan.VkDisplayModeParametersKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$parameters, LAYOUT$parameters.byteSize());}
}
