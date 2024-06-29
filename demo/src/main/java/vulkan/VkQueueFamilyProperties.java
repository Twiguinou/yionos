package vulkan;

public record VkQueueFamilyProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queueFlags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__queueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__queueCount = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__timestampValidBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__timestampValidBits = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__minImageTransferGranularity = vulkan.VkExtent3D.gRecordLayout;
    public static final long OFFSET__minImageTransferGranularity = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__queueFlags,
            LAYOUT__queueCount,
            LAYOUT__timestampValidBits,
            LAYOUT__minImageTransferGranularity
    ).withByteAlignment(4).withName("VkQueueFamilyProperties");

    public VkQueueFamilyProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkQueueFamilyProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkQueueFamilyProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkQueueFamilyProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int queueFlags() {return this.ptr.get(LAYOUT__queueFlags, OFFSET__queueFlags);}
    public void queueFlags(int value) {this.ptr.set(LAYOUT__queueFlags, OFFSET__queueFlags, value);}
    public java.lang.foreign.MemorySegment $queueFlags() {return this.ptr.asSlice(OFFSET__queueFlags, LAYOUT__queueFlags);}

    public int queueCount() {return this.ptr.get(LAYOUT__queueCount, OFFSET__queueCount);}
    public void queueCount(int value) {this.ptr.set(LAYOUT__queueCount, OFFSET__queueCount, value);}
    public java.lang.foreign.MemorySegment $queueCount() {return this.ptr.asSlice(OFFSET__queueCount, LAYOUT__queueCount);}

    public int timestampValidBits() {return this.ptr.get(LAYOUT__timestampValidBits, OFFSET__timestampValidBits);}
    public void timestampValidBits(int value) {this.ptr.set(LAYOUT__timestampValidBits, OFFSET__timestampValidBits, value);}
    public java.lang.foreign.MemorySegment $timestampValidBits() {return this.ptr.asSlice(OFFSET__timestampValidBits, LAYOUT__timestampValidBits);}

    public vulkan.VkExtent3D minImageTransferGranularity() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__minImageTransferGranularity, LAYOUT__minImageTransferGranularity));}
    public void minImageTransferGranularity(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.minImageTransferGranularity());}
    public void minImageTransferGranularity(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__minImageTransferGranularity, LAYOUT__minImageTransferGranularity.byteSize());}
}
