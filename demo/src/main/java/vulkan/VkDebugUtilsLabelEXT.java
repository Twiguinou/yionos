package vulkan;

public record VkDebugUtilsLabelEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLabelName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pLabelName = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__color = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET__color = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__pLabelName,
            LAYOUT__color
    ).withByteAlignment(8).withName("VkDebugUtilsLabelEXT");

    public VkDebugUtilsLabelEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDebugUtilsLabelEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDebugUtilsLabelEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDebugUtilsLabelEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment pLabelName() {return this.ptr.get(LAYOUT__pLabelName, OFFSET__pLabelName);}
    public void pLabelName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLabelName, OFFSET__pLabelName, value);}
    public java.lang.foreign.MemorySegment $pLabelName() {return this.ptr.asSlice(OFFSET__pLabelName, LAYOUT__pLabelName);}

    public java.lang.foreign.MemorySegment color() {return this.ptr.asSlice(OFFSET__color, LAYOUT__color);}
    public float color(int index) {return this.color().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index);}
    public void color(int index, float value) {this.color().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, index, value);}
}
