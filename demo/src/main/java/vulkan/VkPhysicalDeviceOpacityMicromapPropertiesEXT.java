package vulkan;

public record VkPhysicalDeviceOpacityMicromapPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxOpacity2StateSubdivisionLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxOpacity2StateSubdivisionLevel = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxOpacity4StateSubdivisionLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__maxOpacity4StateSubdivisionLevel = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__maxOpacity2StateSubdivisionLevel,
            LAYOUT__maxOpacity4StateSubdivisionLevel
    ).withByteAlignment(8).withName("VkPhysicalDeviceOpacityMicromapPropertiesEXT");

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceOpacityMicromapPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int maxOpacity2StateSubdivisionLevel() {return this.ptr.get(LAYOUT__maxOpacity2StateSubdivisionLevel, OFFSET__maxOpacity2StateSubdivisionLevel);}
    public void maxOpacity2StateSubdivisionLevel(int value) {this.ptr.set(LAYOUT__maxOpacity2StateSubdivisionLevel, OFFSET__maxOpacity2StateSubdivisionLevel, value);}
    public java.lang.foreign.MemorySegment $maxOpacity2StateSubdivisionLevel() {return this.ptr.asSlice(OFFSET__maxOpacity2StateSubdivisionLevel, LAYOUT__maxOpacity2StateSubdivisionLevel);}

    public int maxOpacity4StateSubdivisionLevel() {return this.ptr.get(LAYOUT__maxOpacity4StateSubdivisionLevel, OFFSET__maxOpacity4StateSubdivisionLevel);}
    public void maxOpacity4StateSubdivisionLevel(int value) {this.ptr.set(LAYOUT__maxOpacity4StateSubdivisionLevel, OFFSET__maxOpacity4StateSubdivisionLevel, value);}
    public java.lang.foreign.MemorySegment $maxOpacity4StateSubdivisionLevel() {return this.ptr.asSlice(OFFSET__maxOpacity4StateSubdivisionLevel, LAYOUT__maxOpacity4StateSubdivisionLevel);}
}
