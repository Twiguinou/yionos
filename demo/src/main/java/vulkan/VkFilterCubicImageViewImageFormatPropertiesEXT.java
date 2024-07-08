package vulkan;

public record VkFilterCubicImageViewImageFormatPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__filterCubic = java.lang.foreign.ValueLayout.JAVA_INT.withName("filterCubic");
    public static final long OFFSET__filterCubic = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__filterCubicMinmax = java.lang.foreign.ValueLayout.JAVA_INT.withName("filterCubicMinmax");
    public static final long OFFSET__filterCubicMinmax = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__filterCubic,
            LAYOUT__filterCubicMinmax
    ).withByteAlignment(8).withName("VkFilterCubicImageViewImageFormatPropertiesEXT");

    public VkFilterCubicImageViewImageFormatPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkFilterCubicImageViewImageFormatPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkFilterCubicImageViewImageFormatPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int filterCubic() {return this.ptr.get(LAYOUT__filterCubic, OFFSET__filterCubic);}
    public void filterCubic(int value) {this.ptr.set(LAYOUT__filterCubic, OFFSET__filterCubic, value);}
    public java.lang.foreign.MemorySegment $filterCubic() {return this.ptr.asSlice(OFFSET__filterCubic, LAYOUT__filterCubic);}

    public int filterCubicMinmax() {return this.ptr.get(LAYOUT__filterCubicMinmax, OFFSET__filterCubicMinmax);}
    public void filterCubicMinmax(int value) {this.ptr.set(LAYOUT__filterCubicMinmax, OFFSET__filterCubicMinmax, value);}
    public java.lang.foreign.MemorySegment $filterCubicMinmax() {return this.ptr.asSlice(OFFSET__filterCubicMinmax, LAYOUT__filterCubicMinmax);}
}
