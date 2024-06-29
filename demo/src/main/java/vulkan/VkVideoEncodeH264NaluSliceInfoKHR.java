package vulkan;

public record VkVideoEncodeH264NaluSliceInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__constantQp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__constantQp = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pStdSliceHeader = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pStdSliceHeader = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__constantQp,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pStdSliceHeader
    ).withByteAlignment(8).withName("VkVideoEncodeH264NaluSliceInfoKHR");

    public VkVideoEncodeH264NaluSliceInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH264NaluSliceInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH264NaluSliceInfoKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int constantQp() {return this.ptr.get(LAYOUT__constantQp, OFFSET__constantQp);}
    public void constantQp(int value) {this.ptr.set(LAYOUT__constantQp, OFFSET__constantQp, value);}
    public java.lang.foreign.MemorySegment $constantQp() {return this.ptr.asSlice(OFFSET__constantQp, LAYOUT__constantQp);}

    public java.lang.foreign.MemorySegment pStdSliceHeader() {return this.ptr.get(LAYOUT__pStdSliceHeader, OFFSET__pStdSliceHeader);}
    public void pStdSliceHeader(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pStdSliceHeader, OFFSET__pStdSliceHeader, value);}
    public java.lang.foreign.MemorySegment $pStdSliceHeader() {return this.ptr.asSlice(OFFSET__pStdSliceHeader, LAYOUT__pStdSliceHeader);}
}
