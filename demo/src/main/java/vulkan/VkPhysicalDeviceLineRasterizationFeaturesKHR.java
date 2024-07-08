package vulkan;

public record VkPhysicalDeviceLineRasterizationFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__rectangularLines = java.lang.foreign.ValueLayout.JAVA_INT.withName("rectangularLines");
    public static final long OFFSET__rectangularLines = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bresenhamLines = java.lang.foreign.ValueLayout.JAVA_INT.withName("bresenhamLines");
    public static final long OFFSET__bresenhamLines = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__smoothLines = java.lang.foreign.ValueLayout.JAVA_INT.withName("smoothLines");
    public static final long OFFSET__smoothLines = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stippledRectangularLines = java.lang.foreign.ValueLayout.JAVA_INT.withName("stippledRectangularLines");
    public static final long OFFSET__stippledRectangularLines = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stippledBresenhamLines = java.lang.foreign.ValueLayout.JAVA_INT.withName("stippledBresenhamLines");
    public static final long OFFSET__stippledBresenhamLines = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stippledSmoothLines = java.lang.foreign.ValueLayout.JAVA_INT.withName("stippledSmoothLines");
    public static final long OFFSET__stippledSmoothLines = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__rectangularLines,
            LAYOUT__bresenhamLines,
            LAYOUT__smoothLines,
            LAYOUT__stippledRectangularLines,
            LAYOUT__stippledBresenhamLines,
            LAYOUT__stippledSmoothLines
    ).withByteAlignment(8).withName("VkPhysicalDeviceLineRasterizationFeaturesKHR");

    public VkPhysicalDeviceLineRasterizationFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceLineRasterizationFeaturesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int rectangularLines() {return this.ptr.get(LAYOUT__rectangularLines, OFFSET__rectangularLines);}
    public void rectangularLines(int value) {this.ptr.set(LAYOUT__rectangularLines, OFFSET__rectangularLines, value);}
    public java.lang.foreign.MemorySegment $rectangularLines() {return this.ptr.asSlice(OFFSET__rectangularLines, LAYOUT__rectangularLines);}

    public int bresenhamLines() {return this.ptr.get(LAYOUT__bresenhamLines, OFFSET__bresenhamLines);}
    public void bresenhamLines(int value) {this.ptr.set(LAYOUT__bresenhamLines, OFFSET__bresenhamLines, value);}
    public java.lang.foreign.MemorySegment $bresenhamLines() {return this.ptr.asSlice(OFFSET__bresenhamLines, LAYOUT__bresenhamLines);}

    public int smoothLines() {return this.ptr.get(LAYOUT__smoothLines, OFFSET__smoothLines);}
    public void smoothLines(int value) {this.ptr.set(LAYOUT__smoothLines, OFFSET__smoothLines, value);}
    public java.lang.foreign.MemorySegment $smoothLines() {return this.ptr.asSlice(OFFSET__smoothLines, LAYOUT__smoothLines);}

    public int stippledRectangularLines() {return this.ptr.get(LAYOUT__stippledRectangularLines, OFFSET__stippledRectangularLines);}
    public void stippledRectangularLines(int value) {this.ptr.set(LAYOUT__stippledRectangularLines, OFFSET__stippledRectangularLines, value);}
    public java.lang.foreign.MemorySegment $stippledRectangularLines() {return this.ptr.asSlice(OFFSET__stippledRectangularLines, LAYOUT__stippledRectangularLines);}

    public int stippledBresenhamLines() {return this.ptr.get(LAYOUT__stippledBresenhamLines, OFFSET__stippledBresenhamLines);}
    public void stippledBresenhamLines(int value) {this.ptr.set(LAYOUT__stippledBresenhamLines, OFFSET__stippledBresenhamLines, value);}
    public java.lang.foreign.MemorySegment $stippledBresenhamLines() {return this.ptr.asSlice(OFFSET__stippledBresenhamLines, LAYOUT__stippledBresenhamLines);}

    public int stippledSmoothLines() {return this.ptr.get(LAYOUT__stippledSmoothLines, OFFSET__stippledSmoothLines);}
    public void stippledSmoothLines(int value) {this.ptr.set(LAYOUT__stippledSmoothLines, OFFSET__stippledSmoothLines, value);}
    public java.lang.foreign.MemorySegment $stippledSmoothLines() {return this.ptr.asSlice(OFFSET__stippledSmoothLines, LAYOUT__stippledSmoothLines);}
}
