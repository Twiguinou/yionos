package vulkan;

public record VkPipelineRasterizationLineStateCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__lineRasterizationMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("lineRasterizationMode");
    public static final long OFFSET__lineRasterizationMode = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stippledLineEnable = java.lang.foreign.ValueLayout.JAVA_INT.withName("stippledLineEnable");
    public static final long OFFSET__stippledLineEnable = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__lineStippleFactor = java.lang.foreign.ValueLayout.JAVA_INT.withName("lineStippleFactor");
    public static final long OFFSET__lineStippleFactor = 24;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__lineStipplePattern = java.lang.foreign.ValueLayout.JAVA_SHORT.withName("lineStipplePattern");
    public static final long OFFSET__lineStipplePattern = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__lineRasterizationMode,
            LAYOUT__stippledLineEnable,
            LAYOUT__lineStippleFactor,
            LAYOUT__lineStipplePattern,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withByteAlignment(8).withName("VkPipelineRasterizationLineStateCreateInfoKHR");

    public VkPipelineRasterizationLineStateCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineRasterizationLineStateCreateInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int lineRasterizationMode() {return this.ptr.get(LAYOUT__lineRasterizationMode, OFFSET__lineRasterizationMode);}
    public void lineRasterizationMode(int value) {this.ptr.set(LAYOUT__lineRasterizationMode, OFFSET__lineRasterizationMode, value);}
    public java.lang.foreign.MemorySegment $lineRasterizationMode() {return this.ptr.asSlice(OFFSET__lineRasterizationMode, LAYOUT__lineRasterizationMode);}

    public int stippledLineEnable() {return this.ptr.get(LAYOUT__stippledLineEnable, OFFSET__stippledLineEnable);}
    public void stippledLineEnable(int value) {this.ptr.set(LAYOUT__stippledLineEnable, OFFSET__stippledLineEnable, value);}
    public java.lang.foreign.MemorySegment $stippledLineEnable() {return this.ptr.asSlice(OFFSET__stippledLineEnable, LAYOUT__stippledLineEnable);}

    public int lineStippleFactor() {return this.ptr.get(LAYOUT__lineStippleFactor, OFFSET__lineStippleFactor);}
    public void lineStippleFactor(int value) {this.ptr.set(LAYOUT__lineStippleFactor, OFFSET__lineStippleFactor, value);}
    public java.lang.foreign.MemorySegment $lineStippleFactor() {return this.ptr.asSlice(OFFSET__lineStippleFactor, LAYOUT__lineStippleFactor);}

    public short lineStipplePattern() {return this.ptr.get(LAYOUT__lineStipplePattern, OFFSET__lineStipplePattern);}
    public void lineStipplePattern(short value) {this.ptr.set(LAYOUT__lineStipplePattern, OFFSET__lineStipplePattern, value);}
    public java.lang.foreign.MemorySegment $lineStipplePattern() {return this.ptr.asSlice(OFFSET__lineStipplePattern, LAYOUT__lineStipplePattern);}
}
