package vulkan;

public record VkPhysicalDevice4444FormatsFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__formatA4R4G4B4 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__formatA4R4G4B4 = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__formatA4B4G4R4 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__formatA4B4G4R4 = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__formatA4R4G4B4,
            LAYOUT__formatA4B4G4R4
    ).withByteAlignment(8).withName("VkPhysicalDevice4444FormatsFeaturesEXT");

    public VkPhysicalDevice4444FormatsFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDevice4444FormatsFeaturesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int formatA4R4G4B4() {return this.ptr.get(LAYOUT__formatA4R4G4B4, OFFSET__formatA4R4G4B4);}
    public void formatA4R4G4B4(int value) {this.ptr.set(LAYOUT__formatA4R4G4B4, OFFSET__formatA4R4G4B4, value);}
    public java.lang.foreign.MemorySegment $formatA4R4G4B4() {return this.ptr.asSlice(OFFSET__formatA4R4G4B4, LAYOUT__formatA4R4G4B4);}

    public int formatA4B4G4R4() {return this.ptr.get(LAYOUT__formatA4B4G4R4, OFFSET__formatA4B4G4R4);}
    public void formatA4B4G4R4(int value) {this.ptr.set(LAYOUT__formatA4B4G4R4, OFFSET__formatA4B4G4R4, value);}
    public java.lang.foreign.MemorySegment $formatA4B4G4R4() {return this.ptr.asSlice(OFFSET__formatA4B4G4R4, LAYOUT__formatA4B4G4R4);}
}
