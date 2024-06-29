package vulkan;

public record VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__graphicsPipelineLibraryFastLinking = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__graphicsPipelineLibraryFastLinking = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__graphicsPipelineLibraryIndependentInterpolationDecoration = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__graphicsPipelineLibraryIndependentInterpolationDecoration = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__graphicsPipelineLibraryFastLinking,
            LAYOUT__graphicsPipelineLibraryIndependentInterpolationDecoration
    ).withByteAlignment(8).withName("VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT");

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int graphicsPipelineLibraryFastLinking() {return this.ptr.get(LAYOUT__graphicsPipelineLibraryFastLinking, OFFSET__graphicsPipelineLibraryFastLinking);}
    public void graphicsPipelineLibraryFastLinking(int value) {this.ptr.set(LAYOUT__graphicsPipelineLibraryFastLinking, OFFSET__graphicsPipelineLibraryFastLinking, value);}
    public java.lang.foreign.MemorySegment $graphicsPipelineLibraryFastLinking() {return this.ptr.asSlice(OFFSET__graphicsPipelineLibraryFastLinking, LAYOUT__graphicsPipelineLibraryFastLinking);}

    public int graphicsPipelineLibraryIndependentInterpolationDecoration() {return this.ptr.get(LAYOUT__graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET__graphicsPipelineLibraryIndependentInterpolationDecoration);}
    public void graphicsPipelineLibraryIndependentInterpolationDecoration(int value) {this.ptr.set(LAYOUT__graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET__graphicsPipelineLibraryIndependentInterpolationDecoration, value);}
    public java.lang.foreign.MemorySegment $graphicsPipelineLibraryIndependentInterpolationDecoration() {return this.ptr.asSlice(OFFSET__graphicsPipelineLibraryIndependentInterpolationDecoration, LAYOUT__graphicsPipelineLibraryIndependentInterpolationDecoration);}
}
