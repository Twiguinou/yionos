package vulkan;

public record VkPhysicalDeviceCustomBorderColorFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__customBorderColors = java.lang.foreign.ValueLayout.JAVA_INT.withName("customBorderColors");
    public static final long OFFSET__customBorderColors = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__customBorderColorWithoutFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("customBorderColorWithoutFormat");
    public static final long OFFSET__customBorderColorWithoutFormat = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__customBorderColors,
            LAYOUT__customBorderColorWithoutFormat
    ).withByteAlignment(8).withName("VkPhysicalDeviceCustomBorderColorFeaturesEXT");

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceCustomBorderColorFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int customBorderColors() {return this.ptr.get(LAYOUT__customBorderColors, OFFSET__customBorderColors);}
    public void customBorderColors(int value) {this.ptr.set(LAYOUT__customBorderColors, OFFSET__customBorderColors, value);}
    public java.lang.foreign.MemorySegment $customBorderColors() {return this.ptr.asSlice(OFFSET__customBorderColors, LAYOUT__customBorderColors);}

    public int customBorderColorWithoutFormat() {return this.ptr.get(LAYOUT__customBorderColorWithoutFormat, OFFSET__customBorderColorWithoutFormat);}
    public void customBorderColorWithoutFormat(int value) {this.ptr.set(LAYOUT__customBorderColorWithoutFormat, OFFSET__customBorderColorWithoutFormat, value);}
    public java.lang.foreign.MemorySegment $customBorderColorWithoutFormat() {return this.ptr.asSlice(OFFSET__customBorderColorWithoutFormat, LAYOUT__customBorderColorWithoutFormat);}
}
