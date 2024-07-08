package vulkan;

public record VkOpticalFlowSessionCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_INT.withName("width");
    public static final long OFFSET__width = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_INT.withName("height");
    public static final long OFFSET__height = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("imageFormat");
    public static final long OFFSET__imageFormat = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flowVectorFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("flowVectorFormat");
    public static final long OFFSET__flowVectorFormat = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__costFormat = java.lang.foreign.ValueLayout.JAVA_INT.withName("costFormat");
    public static final long OFFSET__costFormat = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__outputGridSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("outputGridSize");
    public static final long OFFSET__outputGridSize = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__hintGridSize = java.lang.foreign.ValueLayout.JAVA_INT.withName("hintGridSize");
    public static final long OFFSET__hintGridSize = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__performanceLevel = java.lang.foreign.ValueLayout.JAVA_INT.withName("performanceLevel");
    public static final long OFFSET__performanceLevel = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__imageFormat,
            LAYOUT__flowVectorFormat,
            LAYOUT__costFormat,
            LAYOUT__outputGridSize,
            LAYOUT__hintGridSize,
            LAYOUT__performanceLevel,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkOpticalFlowSessionCreateInfoNV");

    public VkOpticalFlowSessionCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkOpticalFlowSessionCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkOpticalFlowSessionCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkOpticalFlowSessionCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(int value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public int height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(int value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public int imageFormat() {return this.ptr.get(LAYOUT__imageFormat, OFFSET__imageFormat);}
    public void imageFormat(int value) {this.ptr.set(LAYOUT__imageFormat, OFFSET__imageFormat, value);}
    public java.lang.foreign.MemorySegment $imageFormat() {return this.ptr.asSlice(OFFSET__imageFormat, LAYOUT__imageFormat);}

    public int flowVectorFormat() {return this.ptr.get(LAYOUT__flowVectorFormat, OFFSET__flowVectorFormat);}
    public void flowVectorFormat(int value) {this.ptr.set(LAYOUT__flowVectorFormat, OFFSET__flowVectorFormat, value);}
    public java.lang.foreign.MemorySegment $flowVectorFormat() {return this.ptr.asSlice(OFFSET__flowVectorFormat, LAYOUT__flowVectorFormat);}

    public int costFormat() {return this.ptr.get(LAYOUT__costFormat, OFFSET__costFormat);}
    public void costFormat(int value) {this.ptr.set(LAYOUT__costFormat, OFFSET__costFormat, value);}
    public java.lang.foreign.MemorySegment $costFormat() {return this.ptr.asSlice(OFFSET__costFormat, LAYOUT__costFormat);}

    public int outputGridSize() {return this.ptr.get(LAYOUT__outputGridSize, OFFSET__outputGridSize);}
    public void outputGridSize(int value) {this.ptr.set(LAYOUT__outputGridSize, OFFSET__outputGridSize, value);}
    public java.lang.foreign.MemorySegment $outputGridSize() {return this.ptr.asSlice(OFFSET__outputGridSize, LAYOUT__outputGridSize);}

    public int hintGridSize() {return this.ptr.get(LAYOUT__hintGridSize, OFFSET__hintGridSize);}
    public void hintGridSize(int value) {this.ptr.set(LAYOUT__hintGridSize, OFFSET__hintGridSize, value);}
    public java.lang.foreign.MemorySegment $hintGridSize() {return this.ptr.asSlice(OFFSET__hintGridSize, LAYOUT__hintGridSize);}

    public int performanceLevel() {return this.ptr.get(LAYOUT__performanceLevel, OFFSET__performanceLevel);}
    public void performanceLevel(int value) {this.ptr.set(LAYOUT__performanceLevel, OFFSET__performanceLevel, value);}
    public java.lang.foreign.MemorySegment $performanceLevel() {return this.ptr.asSlice(OFFSET__performanceLevel, LAYOUT__performanceLevel);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}
}
