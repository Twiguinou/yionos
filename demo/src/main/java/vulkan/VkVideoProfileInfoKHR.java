package vulkan;

public record VkVideoProfileInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__videoCodecOperation = java.lang.foreign.ValueLayout.JAVA_INT.withName("videoCodecOperation");
    public static final long OFFSET__videoCodecOperation = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chromaSubsampling = java.lang.foreign.ValueLayout.JAVA_INT.withName("chromaSubsampling");
    public static final long OFFSET__chromaSubsampling = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__lumaBitDepth = java.lang.foreign.ValueLayout.JAVA_INT.withName("lumaBitDepth");
    public static final long OFFSET__lumaBitDepth = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chromaBitDepth = java.lang.foreign.ValueLayout.JAVA_INT.withName("chromaBitDepth");
    public static final long OFFSET__chromaBitDepth = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__videoCodecOperation,
            LAYOUT__chromaSubsampling,
            LAYOUT__lumaBitDepth,
            LAYOUT__chromaBitDepth
    ).withByteAlignment(8).withName("VkVideoProfileInfoKHR");

    public VkVideoProfileInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoProfileInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoProfileInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoProfileInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int videoCodecOperation() {return this.ptr.get(LAYOUT__videoCodecOperation, OFFSET__videoCodecOperation);}
    public void videoCodecOperation(int value) {this.ptr.set(LAYOUT__videoCodecOperation, OFFSET__videoCodecOperation, value);}
    public java.lang.foreign.MemorySegment $videoCodecOperation() {return this.ptr.asSlice(OFFSET__videoCodecOperation, LAYOUT__videoCodecOperation);}

    public int chromaSubsampling() {return this.ptr.get(LAYOUT__chromaSubsampling, OFFSET__chromaSubsampling);}
    public void chromaSubsampling(int value) {this.ptr.set(LAYOUT__chromaSubsampling, OFFSET__chromaSubsampling, value);}
    public java.lang.foreign.MemorySegment $chromaSubsampling() {return this.ptr.asSlice(OFFSET__chromaSubsampling, LAYOUT__chromaSubsampling);}

    public int lumaBitDepth() {return this.ptr.get(LAYOUT__lumaBitDepth, OFFSET__lumaBitDepth);}
    public void lumaBitDepth(int value) {this.ptr.set(LAYOUT__lumaBitDepth, OFFSET__lumaBitDepth, value);}
    public java.lang.foreign.MemorySegment $lumaBitDepth() {return this.ptr.asSlice(OFFSET__lumaBitDepth, LAYOUT__lumaBitDepth);}

    public int chromaBitDepth() {return this.ptr.get(LAYOUT__chromaBitDepth, OFFSET__chromaBitDepth);}
    public void chromaBitDepth(int value) {this.ptr.set(LAYOUT__chromaBitDepth, OFFSET__chromaBitDepth, value);}
    public java.lang.foreign.MemorySegment $chromaBitDepth() {return this.ptr.asSlice(OFFSET__chromaBitDepth, LAYOUT__chromaBitDepth);}
}
