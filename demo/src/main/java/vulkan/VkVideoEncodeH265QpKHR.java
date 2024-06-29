package vulkan;

public record VkVideoEncodeH265QpKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__qpI = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__qpI = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__qpP = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__qpP = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__qpB = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__qpB = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__qpI,
            LAYOUT__qpP,
            LAYOUT__qpB
    ).withByteAlignment(4).withName("VkVideoEncodeH265QpKHR");

    public VkVideoEncodeH265QpKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoEncodeH265QpKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoEncodeH265QpKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoEncodeH265QpKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int qpI() {return this.ptr.get(LAYOUT__qpI, OFFSET__qpI);}
    public void qpI(int value) {this.ptr.set(LAYOUT__qpI, OFFSET__qpI, value);}
    public java.lang.foreign.MemorySegment $qpI() {return this.ptr.asSlice(OFFSET__qpI, LAYOUT__qpI);}

    public int qpP() {return this.ptr.get(LAYOUT__qpP, OFFSET__qpP);}
    public void qpP(int value) {this.ptr.set(LAYOUT__qpP, OFFSET__qpP, value);}
    public java.lang.foreign.MemorySegment $qpP() {return this.ptr.asSlice(OFFSET__qpP, LAYOUT__qpP);}

    public int qpB() {return this.ptr.get(LAYOUT__qpB, OFFSET__qpB);}
    public void qpB(int value) {this.ptr.set(LAYOUT__qpB, OFFSET__qpB, value);}
    public java.lang.foreign.MemorySegment $qpB() {return this.ptr.asSlice(OFFSET__qpB, LAYOUT__qpB);}
}
