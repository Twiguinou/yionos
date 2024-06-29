package vulkan;

public record VkPhysicalDeviceNestedCommandBufferFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nestedCommandBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__nestedCommandBuffer = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nestedCommandBufferRendering = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__nestedCommandBufferRendering = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nestedCommandBufferSimultaneousUse = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__nestedCommandBufferSimultaneousUse = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__nestedCommandBuffer,
            LAYOUT__nestedCommandBufferRendering,
            LAYOUT__nestedCommandBufferSimultaneousUse,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceNestedCommandBufferFeaturesEXT");

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceNestedCommandBufferFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int nestedCommandBuffer() {return this.ptr.get(LAYOUT__nestedCommandBuffer, OFFSET__nestedCommandBuffer);}
    public void nestedCommandBuffer(int value) {this.ptr.set(LAYOUT__nestedCommandBuffer, OFFSET__nestedCommandBuffer, value);}
    public java.lang.foreign.MemorySegment $nestedCommandBuffer() {return this.ptr.asSlice(OFFSET__nestedCommandBuffer, LAYOUT__nestedCommandBuffer);}

    public int nestedCommandBufferRendering() {return this.ptr.get(LAYOUT__nestedCommandBufferRendering, OFFSET__nestedCommandBufferRendering);}
    public void nestedCommandBufferRendering(int value) {this.ptr.set(LAYOUT__nestedCommandBufferRendering, OFFSET__nestedCommandBufferRendering, value);}
    public java.lang.foreign.MemorySegment $nestedCommandBufferRendering() {return this.ptr.asSlice(OFFSET__nestedCommandBufferRendering, LAYOUT__nestedCommandBufferRendering);}

    public int nestedCommandBufferSimultaneousUse() {return this.ptr.get(LAYOUT__nestedCommandBufferSimultaneousUse, OFFSET__nestedCommandBufferSimultaneousUse);}
    public void nestedCommandBufferSimultaneousUse(int value) {this.ptr.set(LAYOUT__nestedCommandBufferSimultaneousUse, OFFSET__nestedCommandBufferSimultaneousUse, value);}
    public java.lang.foreign.MemorySegment $nestedCommandBufferSimultaneousUse() {return this.ptr.asSlice(OFFSET__nestedCommandBufferSimultaneousUse, LAYOUT__nestedCommandBufferSimultaneousUse);}
}
