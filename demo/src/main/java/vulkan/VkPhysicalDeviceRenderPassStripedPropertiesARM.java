package vulkan;

public record VkPhysicalDeviceRenderPassStripedPropertiesARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__renderPassStripeGranularity = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__renderPassStripeGranularity = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxRenderPassStripes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxRenderPassStripes = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__renderPassStripeGranularity,
            LAYOUT__maxRenderPassStripes,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceRenderPassStripedPropertiesARM");

    public VkPhysicalDeviceRenderPassStripedPropertiesARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceRenderPassStripedPropertiesARM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkExtent2D renderPassStripeGranularity() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__renderPassStripeGranularity, LAYOUT__renderPassStripeGranularity));}
    public void renderPassStripeGranularity(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.renderPassStripeGranularity());}
    public void renderPassStripeGranularity(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__renderPassStripeGranularity, LAYOUT__renderPassStripeGranularity.byteSize());}

    public int maxRenderPassStripes() {return this.ptr.get(LAYOUT__maxRenderPassStripes, OFFSET__maxRenderPassStripes);}
    public void maxRenderPassStripes(int value) {this.ptr.set(LAYOUT__maxRenderPassStripes, OFFSET__maxRenderPassStripes, value);}
    public java.lang.foreign.MemorySegment $maxRenderPassStripes() {return this.ptr.asSlice(OFFSET__maxRenderPassStripes, LAYOUT__maxRenderPassStripes);}
}
