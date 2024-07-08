package vulkan;

public record VkAmigoProfilingSubmitInfoSEC(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__firstDrawTimestamp = java.lang.foreign.ValueLayout.JAVA_LONG.withName("firstDrawTimestamp");
    public static final long OFFSET__firstDrawTimestamp = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__swapBufferTimestamp = java.lang.foreign.ValueLayout.JAVA_LONG.withName("swapBufferTimestamp");
    public static final long OFFSET__swapBufferTimestamp = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__firstDrawTimestamp,
            LAYOUT__swapBufferTimestamp
    ).withByteAlignment(8).withName("VkAmigoProfilingSubmitInfoSEC");

    public VkAmigoProfilingSubmitInfoSEC(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkAmigoProfilingSubmitInfoSEC getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkAmigoProfilingSubmitInfoSEC(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkAmigoProfilingSubmitInfoSEC value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long firstDrawTimestamp() {return this.ptr.get(LAYOUT__firstDrawTimestamp, OFFSET__firstDrawTimestamp);}
    public void firstDrawTimestamp(long value) {this.ptr.set(LAYOUT__firstDrawTimestamp, OFFSET__firstDrawTimestamp, value);}
    public java.lang.foreign.MemorySegment $firstDrawTimestamp() {return this.ptr.asSlice(OFFSET__firstDrawTimestamp, LAYOUT__firstDrawTimestamp);}

    public long swapBufferTimestamp() {return this.ptr.get(LAYOUT__swapBufferTimestamp, OFFSET__swapBufferTimestamp);}
    public void swapBufferTimestamp(long value) {this.ptr.set(LAYOUT__swapBufferTimestamp, OFFSET__swapBufferTimestamp, value);}
    public java.lang.foreign.MemorySegment $swapBufferTimestamp() {return this.ptr.asSlice(OFFSET__swapBufferTimestamp, LAYOUT__swapBufferTimestamp);}
}
