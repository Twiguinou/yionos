package vulkan;

public record VkDisplayModeParametersKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__visibleRegion = vulkan.VkExtent2D.gRecordLayout.withName("visibleRegion");
    public static final long OFFSET__visibleRegion = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__refreshRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("refreshRate");
    public static final long OFFSET__refreshRate = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__visibleRegion,
            LAYOUT__refreshRate
    ).withByteAlignment(4).withName("VkDisplayModeParametersKHR");

    public VkDisplayModeParametersKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplayModeParametersKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplayModeParametersKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplayModeParametersKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkExtent2D visibleRegion() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__visibleRegion, LAYOUT__visibleRegion));}
    public void visibleRegion(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.visibleRegion());}
    public void visibleRegion(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__visibleRegion, LAYOUT__visibleRegion.byteSize());}

    public int refreshRate() {return this.ptr.get(LAYOUT__refreshRate, OFFSET__refreshRate);}
    public void refreshRate(int value) {this.ptr.set(LAYOUT__refreshRate, OFFSET__refreshRate, value);}
    public java.lang.foreign.MemorySegment $refreshRate() {return this.ptr.asSlice(OFFSET__refreshRate, LAYOUT__refreshRate);}
}
