package vulkan;

public record VkPhysicalDeviceOpacityMicromapPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxOpacity2StateSubdivisionLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxOpacity2StateSubdivisionLevel = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxOpacity4StateSubdivisionLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxOpacity4StateSubdivisionLevel = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxOpacity2StateSubdivisionLevel,
            LAYOUT$maxOpacity4StateSubdivisionLevel
    ).withName("VkPhysicalDeviceOpacityMicromapPropertiesEXT");

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxOpacity2StateSubdivisionLevel() {return this.ptr.get(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel);}
    public void maxOpacity2StateSubdivisionLevel(int value) {this.ptr.set(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel, value);}
    public java.lang.foreign.MemorySegment maxOpacity2StateSubdivisionLevel_ptr() {return this.ptr.asSlice(OFFSET$maxOpacity2StateSubdivisionLevel, LAYOUT$maxOpacity2StateSubdivisionLevel);}

    public int maxOpacity4StateSubdivisionLevel() {return this.ptr.get(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel);}
    public void maxOpacity4StateSubdivisionLevel(int value) {this.ptr.set(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel, value);}
    public java.lang.foreign.MemorySegment maxOpacity4StateSubdivisionLevel_ptr() {return this.ptr.asSlice(OFFSET$maxOpacity4StateSubdivisionLevel, LAYOUT$maxOpacity4StateSubdivisionLevel);}
}
