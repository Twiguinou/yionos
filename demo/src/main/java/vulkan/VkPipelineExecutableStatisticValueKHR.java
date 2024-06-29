package vulkan;

public record VkPipelineExecutableStatisticValueKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__b32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__i64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__u64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT__f64 = java.lang.foreign.ValueLayout.JAVA_DOUBLE;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__b32,
            LAYOUT__i64,
            LAYOUT__u64,
            LAYOUT__f64
    ).withByteAlignment(8).withName("VkPipelineExecutableStatisticValueKHR");

    public VkPipelineExecutableStatisticValueKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineExecutableStatisticValueKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineExecutableStatisticValueKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineExecutableStatisticValueKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int b32() {return this.ptr.get(LAYOUT__b32, 0);}
    public void b32(int value) {this.ptr.set(LAYOUT__b32, 0, value);}
    public java.lang.foreign.MemorySegment $b32() {return this.ptr.asSlice(0, LAYOUT__b32);}

    public long i64() {return this.ptr.get(LAYOUT__i64, 0);}
    public void i64(long value) {this.ptr.set(LAYOUT__i64, 0, value);}
    public java.lang.foreign.MemorySegment $i64() {return this.ptr.asSlice(0, LAYOUT__i64);}

    public long u64() {return this.ptr.get(LAYOUT__u64, 0);}
    public void u64(long value) {this.ptr.set(LAYOUT__u64, 0, value);}
    public java.lang.foreign.MemorySegment $u64() {return this.ptr.asSlice(0, LAYOUT__u64);}

    public double f64() {return this.ptr.get(LAYOUT__f64, 0);}
    public void f64(double value) {this.ptr.set(LAYOUT__f64, 0, value);}
    public java.lang.foreign.MemorySegment $f64() {return this.ptr.asSlice(0, LAYOUT__f64);}
}
