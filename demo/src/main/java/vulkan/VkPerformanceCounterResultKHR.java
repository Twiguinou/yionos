package vulkan;

public record VkPerformanceCounterResultKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__int32 = java.lang.foreign.ValueLayout.JAVA_INT.withName("int32");
    public static final long OFFSET__int32 = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__int64 = java.lang.foreign.ValueLayout.JAVA_LONG.withName("int64");
    public static final long OFFSET__int64 = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__uint32 = java.lang.foreign.ValueLayout.JAVA_INT.withName("uint32");
    public static final long OFFSET__uint32 = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__uint64 = java.lang.foreign.ValueLayout.JAVA_LONG.withName("uint64");
    public static final long OFFSET__uint64 = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__float32 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("float32");
    public static final long OFFSET__float32 = 0;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT__float64 = java.lang.foreign.ValueLayout.JAVA_DOUBLE.withName("float64");
    public static final long OFFSET__float64 = 0;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__int32,
            LAYOUT__int64,
            LAYOUT__uint32,
            LAYOUT__uint64,
            LAYOUT__float32,
            LAYOUT__float64
    ).withByteAlignment(8).withName("VkPerformanceCounterResultKHR");

    public VkPerformanceCounterResultKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPerformanceCounterResultKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPerformanceCounterResultKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPerformanceCounterResultKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int int32() {return this.ptr.get(LAYOUT__int32, OFFSET__int32);}
    public void int32(int value) {this.ptr.set(LAYOUT__int32, OFFSET__int32, value);}
    public java.lang.foreign.MemorySegment $int32() {return this.ptr.asSlice(OFFSET__int32, LAYOUT__int32);}

    public long int64() {return this.ptr.get(LAYOUT__int64, OFFSET__int64);}
    public void int64(long value) {this.ptr.set(LAYOUT__int64, OFFSET__int64, value);}
    public java.lang.foreign.MemorySegment $int64() {return this.ptr.asSlice(OFFSET__int64, LAYOUT__int64);}

    public int uint32() {return this.ptr.get(LAYOUT__uint32, OFFSET__uint32);}
    public void uint32(int value) {this.ptr.set(LAYOUT__uint32, OFFSET__uint32, value);}
    public java.lang.foreign.MemorySegment $uint32() {return this.ptr.asSlice(OFFSET__uint32, LAYOUT__uint32);}

    public long uint64() {return this.ptr.get(LAYOUT__uint64, OFFSET__uint64);}
    public void uint64(long value) {this.ptr.set(LAYOUT__uint64, OFFSET__uint64, value);}
    public java.lang.foreign.MemorySegment $uint64() {return this.ptr.asSlice(OFFSET__uint64, LAYOUT__uint64);}

    public float float32() {return this.ptr.get(LAYOUT__float32, OFFSET__float32);}
    public void float32(float value) {this.ptr.set(LAYOUT__float32, OFFSET__float32, value);}
    public java.lang.foreign.MemorySegment $float32() {return this.ptr.asSlice(OFFSET__float32, LAYOUT__float32);}

    public double float64() {return this.ptr.get(LAYOUT__float64, OFFSET__float64);}
    public void float64(double value) {this.ptr.set(LAYOUT__float64, OFFSET__float64, value);}
    public java.lang.foreign.MemorySegment $float64() {return this.ptr.asSlice(OFFSET__float64, LAYOUT__float64);}
}
