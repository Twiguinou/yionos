package vulkan;

public record VkQueueFamilyProperties2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__queueFamilyProperties = vulkan.VkQueueFamilyProperties.gRecordLayout.withName("queueFamilyProperties");
    public static final long OFFSET__queueFamilyProperties = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__queueFamilyProperties
    ).withByteAlignment(8).withName("VkQueueFamilyProperties2");

    public VkQueueFamilyProperties2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkQueueFamilyProperties2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkQueueFamilyProperties2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkQueueFamilyProperties2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkQueueFamilyProperties queueFamilyProperties() {return new vulkan.VkQueueFamilyProperties(this.ptr.asSlice(OFFSET__queueFamilyProperties, LAYOUT__queueFamilyProperties));}
    public void queueFamilyProperties(java.util.function.Consumer<vulkan.VkQueueFamilyProperties> consumer) {consumer.accept(this.queueFamilyProperties());}
    public void queueFamilyProperties(vulkan.VkQueueFamilyProperties value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__queueFamilyProperties, LAYOUT__queueFamilyProperties.byteSize());}
}
