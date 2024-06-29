package vulkan;

public record VkPhysicalDeviceDepthBiasControlFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBiasControl = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthBiasControl = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__leastRepresentableValueForceUnormRepresentation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__leastRepresentableValueForceUnormRepresentation = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__floatRepresentation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__floatRepresentation = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthBiasExact = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthBiasExact = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__depthBiasControl,
            LAYOUT__leastRepresentableValueForceUnormRepresentation,
            LAYOUT__floatRepresentation,
            LAYOUT__depthBiasExact
    ).withByteAlignment(8).withName("VkPhysicalDeviceDepthBiasControlFeaturesEXT");

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDepthBiasControlFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int depthBiasControl() {return this.ptr.get(LAYOUT__depthBiasControl, OFFSET__depthBiasControl);}
    public void depthBiasControl(int value) {this.ptr.set(LAYOUT__depthBiasControl, OFFSET__depthBiasControl, value);}
    public java.lang.foreign.MemorySegment $depthBiasControl() {return this.ptr.asSlice(OFFSET__depthBiasControl, LAYOUT__depthBiasControl);}

    public int leastRepresentableValueForceUnormRepresentation() {return this.ptr.get(LAYOUT__leastRepresentableValueForceUnormRepresentation, OFFSET__leastRepresentableValueForceUnormRepresentation);}
    public void leastRepresentableValueForceUnormRepresentation(int value) {this.ptr.set(LAYOUT__leastRepresentableValueForceUnormRepresentation, OFFSET__leastRepresentableValueForceUnormRepresentation, value);}
    public java.lang.foreign.MemorySegment $leastRepresentableValueForceUnormRepresentation() {return this.ptr.asSlice(OFFSET__leastRepresentableValueForceUnormRepresentation, LAYOUT__leastRepresentableValueForceUnormRepresentation);}

    public int floatRepresentation() {return this.ptr.get(LAYOUT__floatRepresentation, OFFSET__floatRepresentation);}
    public void floatRepresentation(int value) {this.ptr.set(LAYOUT__floatRepresentation, OFFSET__floatRepresentation, value);}
    public java.lang.foreign.MemorySegment $floatRepresentation() {return this.ptr.asSlice(OFFSET__floatRepresentation, LAYOUT__floatRepresentation);}

    public int depthBiasExact() {return this.ptr.get(LAYOUT__depthBiasExact, OFFSET__depthBiasExact);}
    public void depthBiasExact(int value) {this.ptr.set(LAYOUT__depthBiasExact, OFFSET__depthBiasExact, value);}
    public java.lang.foreign.MemorySegment $depthBiasExact() {return this.ptr.asSlice(OFFSET__depthBiasExact, LAYOUT__depthBiasExact);}
}
