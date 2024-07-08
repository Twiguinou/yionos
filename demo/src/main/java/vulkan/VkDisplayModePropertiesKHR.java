package vulkan;

public record VkDisplayModePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__displayMode = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("displayMode");
    public static final long OFFSET__displayMode = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__parameters = vulkan.VkDisplayModeParametersKHR.gRecordLayout.withName("parameters");
    public static final long OFFSET__parameters = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__displayMode,
            LAYOUT__parameters,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDisplayModePropertiesKHR");

    public VkDisplayModePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplayModePropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplayModePropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplayModePropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment displayMode() {return this.ptr.get(LAYOUT__displayMode, OFFSET__displayMode);}
    public void displayMode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__displayMode, OFFSET__displayMode, value);}
    public java.lang.foreign.MemorySegment $displayMode() {return this.ptr.asSlice(OFFSET__displayMode, LAYOUT__displayMode);}

    public vulkan.VkDisplayModeParametersKHR parameters() {return new vulkan.VkDisplayModeParametersKHR(this.ptr.asSlice(OFFSET__parameters, LAYOUT__parameters));}
    public void parameters(java.util.function.Consumer<vulkan.VkDisplayModeParametersKHR> consumer) {consumer.accept(this.parameters());}
    public void parameters(vulkan.VkDisplayModeParametersKHR value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__parameters, LAYOUT__parameters.byteSize());}
}
