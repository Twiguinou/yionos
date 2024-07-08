package vulkan;

public record VkPhysicalDeviceOpticalFlowPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedOutputGridSizes = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedOutputGridSizes");
    public static final long OFFSET__supportedOutputGridSizes = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedHintGridSizes = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedHintGridSizes");
    public static final long OFFSET__supportedHintGridSizes = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hintSupported = java.lang.foreign.ValueLayout.JAVA_INT.withName("hintSupported");
    public static final long OFFSET__hintSupported = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__costSupported = java.lang.foreign.ValueLayout.JAVA_INT.withName("costSupported");
    public static final long OFFSET__costSupported = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bidirectionalFlowSupported = java.lang.foreign.ValueLayout.JAVA_INT.withName("bidirectionalFlowSupported");
    public static final long OFFSET__bidirectionalFlowSupported = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__globalFlowSupported = java.lang.foreign.ValueLayout.JAVA_INT.withName("globalFlowSupported");
    public static final long OFFSET__globalFlowSupported = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minWidth = java.lang.foreign.ValueLayout.JAVA_INT.withName("minWidth");
    public static final long OFFSET__minWidth = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__minHeight = java.lang.foreign.ValueLayout.JAVA_INT.withName("minHeight");
    public static final long OFFSET__minHeight = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxWidth = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxWidth");
    public static final long OFFSET__maxWidth = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxHeight = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxHeight");
    public static final long OFFSET__maxHeight = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxNumRegionsOfInterest = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxNumRegionsOfInterest");
    public static final long OFFSET__maxNumRegionsOfInterest = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__supportedOutputGridSizes,
            LAYOUT__supportedHintGridSizes,
            LAYOUT__hintSupported,
            LAYOUT__costSupported,
            LAYOUT__bidirectionalFlowSupported,
            LAYOUT__globalFlowSupported,
            LAYOUT__minWidth,
            LAYOUT__minHeight,
            LAYOUT__maxWidth,
            LAYOUT__maxHeight,
            LAYOUT__maxNumRegionsOfInterest,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceOpticalFlowPropertiesNV");

    public VkPhysicalDeviceOpticalFlowPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceOpticalFlowPropertiesNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int supportedOutputGridSizes() {return this.ptr.get(LAYOUT__supportedOutputGridSizes, OFFSET__supportedOutputGridSizes);}
    public void supportedOutputGridSizes(int value) {this.ptr.set(LAYOUT__supportedOutputGridSizes, OFFSET__supportedOutputGridSizes, value);}
    public java.lang.foreign.MemorySegment $supportedOutputGridSizes() {return this.ptr.asSlice(OFFSET__supportedOutputGridSizes, LAYOUT__supportedOutputGridSizes);}

    public int supportedHintGridSizes() {return this.ptr.get(LAYOUT__supportedHintGridSizes, OFFSET__supportedHintGridSizes);}
    public void supportedHintGridSizes(int value) {this.ptr.set(LAYOUT__supportedHintGridSizes, OFFSET__supportedHintGridSizes, value);}
    public java.lang.foreign.MemorySegment $supportedHintGridSizes() {return this.ptr.asSlice(OFFSET__supportedHintGridSizes, LAYOUT__supportedHintGridSizes);}

    public int hintSupported() {return this.ptr.get(LAYOUT__hintSupported, OFFSET__hintSupported);}
    public void hintSupported(int value) {this.ptr.set(LAYOUT__hintSupported, OFFSET__hintSupported, value);}
    public java.lang.foreign.MemorySegment $hintSupported() {return this.ptr.asSlice(OFFSET__hintSupported, LAYOUT__hintSupported);}

    public int costSupported() {return this.ptr.get(LAYOUT__costSupported, OFFSET__costSupported);}
    public void costSupported(int value) {this.ptr.set(LAYOUT__costSupported, OFFSET__costSupported, value);}
    public java.lang.foreign.MemorySegment $costSupported() {return this.ptr.asSlice(OFFSET__costSupported, LAYOUT__costSupported);}

    public int bidirectionalFlowSupported() {return this.ptr.get(LAYOUT__bidirectionalFlowSupported, OFFSET__bidirectionalFlowSupported);}
    public void bidirectionalFlowSupported(int value) {this.ptr.set(LAYOUT__bidirectionalFlowSupported, OFFSET__bidirectionalFlowSupported, value);}
    public java.lang.foreign.MemorySegment $bidirectionalFlowSupported() {return this.ptr.asSlice(OFFSET__bidirectionalFlowSupported, LAYOUT__bidirectionalFlowSupported);}

    public int globalFlowSupported() {return this.ptr.get(LAYOUT__globalFlowSupported, OFFSET__globalFlowSupported);}
    public void globalFlowSupported(int value) {this.ptr.set(LAYOUT__globalFlowSupported, OFFSET__globalFlowSupported, value);}
    public java.lang.foreign.MemorySegment $globalFlowSupported() {return this.ptr.asSlice(OFFSET__globalFlowSupported, LAYOUT__globalFlowSupported);}

    public int minWidth() {return this.ptr.get(LAYOUT__minWidth, OFFSET__minWidth);}
    public void minWidth(int value) {this.ptr.set(LAYOUT__minWidth, OFFSET__minWidth, value);}
    public java.lang.foreign.MemorySegment $minWidth() {return this.ptr.asSlice(OFFSET__minWidth, LAYOUT__minWidth);}

    public int minHeight() {return this.ptr.get(LAYOUT__minHeight, OFFSET__minHeight);}
    public void minHeight(int value) {this.ptr.set(LAYOUT__minHeight, OFFSET__minHeight, value);}
    public java.lang.foreign.MemorySegment $minHeight() {return this.ptr.asSlice(OFFSET__minHeight, LAYOUT__minHeight);}

    public int maxWidth() {return this.ptr.get(LAYOUT__maxWidth, OFFSET__maxWidth);}
    public void maxWidth(int value) {this.ptr.set(LAYOUT__maxWidth, OFFSET__maxWidth, value);}
    public java.lang.foreign.MemorySegment $maxWidth() {return this.ptr.asSlice(OFFSET__maxWidth, LAYOUT__maxWidth);}

    public int maxHeight() {return this.ptr.get(LAYOUT__maxHeight, OFFSET__maxHeight);}
    public void maxHeight(int value) {this.ptr.set(LAYOUT__maxHeight, OFFSET__maxHeight, value);}
    public java.lang.foreign.MemorySegment $maxHeight() {return this.ptr.asSlice(OFFSET__maxHeight, LAYOUT__maxHeight);}

    public int maxNumRegionsOfInterest() {return this.ptr.get(LAYOUT__maxNumRegionsOfInterest, OFFSET__maxNumRegionsOfInterest);}
    public void maxNumRegionsOfInterest(int value) {this.ptr.set(LAYOUT__maxNumRegionsOfInterest, OFFSET__maxNumRegionsOfInterest, value);}
    public java.lang.foreign.MemorySegment $maxNumRegionsOfInterest() {return this.ptr.asSlice(OFFSET__maxNumRegionsOfInterest, LAYOUT__maxNumRegionsOfInterest);}
}
