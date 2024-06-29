package vulkan;

public record VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__advancedBlendMaxColorAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__advancedBlendMaxColorAttachments = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__advancedBlendIndependentBlend = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__advancedBlendIndependentBlend = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__advancedBlendNonPremultipliedSrcColor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__advancedBlendNonPremultipliedSrcColor = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__advancedBlendNonPremultipliedDstColor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__advancedBlendNonPremultipliedDstColor = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__advancedBlendCorrelatedOverlap = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__advancedBlendCorrelatedOverlap = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__advancedBlendAllOperations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__advancedBlendAllOperations = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__advancedBlendMaxColorAttachments,
            LAYOUT__advancedBlendIndependentBlend,
            LAYOUT__advancedBlendNonPremultipliedSrcColor,
            LAYOUT__advancedBlendNonPremultipliedDstColor,
            LAYOUT__advancedBlendCorrelatedOverlap,
            LAYOUT__advancedBlendAllOperations
    ).withByteAlignment(8).withName("VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT");

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int advancedBlendMaxColorAttachments() {return this.ptr.get(LAYOUT__advancedBlendMaxColorAttachments, OFFSET__advancedBlendMaxColorAttachments);}
    public void advancedBlendMaxColorAttachments(int value) {this.ptr.set(LAYOUT__advancedBlendMaxColorAttachments, OFFSET__advancedBlendMaxColorAttachments, value);}
    public java.lang.foreign.MemorySegment $advancedBlendMaxColorAttachments() {return this.ptr.asSlice(OFFSET__advancedBlendMaxColorAttachments, LAYOUT__advancedBlendMaxColorAttachments);}

    public int advancedBlendIndependentBlend() {return this.ptr.get(LAYOUT__advancedBlendIndependentBlend, OFFSET__advancedBlendIndependentBlend);}
    public void advancedBlendIndependentBlend(int value) {this.ptr.set(LAYOUT__advancedBlendIndependentBlend, OFFSET__advancedBlendIndependentBlend, value);}
    public java.lang.foreign.MemorySegment $advancedBlendIndependentBlend() {return this.ptr.asSlice(OFFSET__advancedBlendIndependentBlend, LAYOUT__advancedBlendIndependentBlend);}

    public int advancedBlendNonPremultipliedSrcColor() {return this.ptr.get(LAYOUT__advancedBlendNonPremultipliedSrcColor, OFFSET__advancedBlendNonPremultipliedSrcColor);}
    public void advancedBlendNonPremultipliedSrcColor(int value) {this.ptr.set(LAYOUT__advancedBlendNonPremultipliedSrcColor, OFFSET__advancedBlendNonPremultipliedSrcColor, value);}
    public java.lang.foreign.MemorySegment $advancedBlendNonPremultipliedSrcColor() {return this.ptr.asSlice(OFFSET__advancedBlendNonPremultipliedSrcColor, LAYOUT__advancedBlendNonPremultipliedSrcColor);}

    public int advancedBlendNonPremultipliedDstColor() {return this.ptr.get(LAYOUT__advancedBlendNonPremultipliedDstColor, OFFSET__advancedBlendNonPremultipliedDstColor);}
    public void advancedBlendNonPremultipliedDstColor(int value) {this.ptr.set(LAYOUT__advancedBlendNonPremultipliedDstColor, OFFSET__advancedBlendNonPremultipliedDstColor, value);}
    public java.lang.foreign.MemorySegment $advancedBlendNonPremultipliedDstColor() {return this.ptr.asSlice(OFFSET__advancedBlendNonPremultipliedDstColor, LAYOUT__advancedBlendNonPremultipliedDstColor);}

    public int advancedBlendCorrelatedOverlap() {return this.ptr.get(LAYOUT__advancedBlendCorrelatedOverlap, OFFSET__advancedBlendCorrelatedOverlap);}
    public void advancedBlendCorrelatedOverlap(int value) {this.ptr.set(LAYOUT__advancedBlendCorrelatedOverlap, OFFSET__advancedBlendCorrelatedOverlap, value);}
    public java.lang.foreign.MemorySegment $advancedBlendCorrelatedOverlap() {return this.ptr.asSlice(OFFSET__advancedBlendCorrelatedOverlap, LAYOUT__advancedBlendCorrelatedOverlap);}

    public int advancedBlendAllOperations() {return this.ptr.get(LAYOUT__advancedBlendAllOperations, OFFSET__advancedBlendAllOperations);}
    public void advancedBlendAllOperations(int value) {this.ptr.set(LAYOUT__advancedBlendAllOperations, OFFSET__advancedBlendAllOperations, value);}
    public java.lang.foreign.MemorySegment $advancedBlendAllOperations() {return this.ptr.asSlice(OFFSET__advancedBlendAllOperations, LAYOUT__advancedBlendAllOperations);}
}
