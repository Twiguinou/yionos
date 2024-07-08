package vulkan;

public record VkPhysicalDeviceConditionalRenderingFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__conditionalRendering = java.lang.foreign.ValueLayout.JAVA_INT.withName("conditionalRendering");
    public static final long OFFSET__conditionalRendering = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inheritedConditionalRendering = java.lang.foreign.ValueLayout.JAVA_INT.withName("inheritedConditionalRendering");
    public static final long OFFSET__inheritedConditionalRendering = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__conditionalRendering,
            LAYOUT__inheritedConditionalRendering
    ).withByteAlignment(8).withName("VkPhysicalDeviceConditionalRenderingFeaturesEXT");

    public VkPhysicalDeviceConditionalRenderingFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceConditionalRenderingFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int conditionalRendering() {return this.ptr.get(LAYOUT__conditionalRendering, OFFSET__conditionalRendering);}
    public void conditionalRendering(int value) {this.ptr.set(LAYOUT__conditionalRendering, OFFSET__conditionalRendering, value);}
    public java.lang.foreign.MemorySegment $conditionalRendering() {return this.ptr.asSlice(OFFSET__conditionalRendering, LAYOUT__conditionalRendering);}

    public int inheritedConditionalRendering() {return this.ptr.get(LAYOUT__inheritedConditionalRendering, OFFSET__inheritedConditionalRendering);}
    public void inheritedConditionalRendering(int value) {this.ptr.set(LAYOUT__inheritedConditionalRendering, OFFSET__inheritedConditionalRendering, value);}
    public java.lang.foreign.MemorySegment $inheritedConditionalRendering() {return this.ptr.asSlice(OFFSET__inheritedConditionalRendering, LAYOUT__inheritedConditionalRendering);}
}
