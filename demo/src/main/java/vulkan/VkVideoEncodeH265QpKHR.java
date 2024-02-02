package vulkan;

public record VkVideoEncodeH265QpKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$qpI = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$qpI = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$qpP = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$qpP = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$qpB = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$qpB = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$qpI,
            LAYOUT$qpP,
            LAYOUT$qpB
    ).withName("VkVideoEncodeH265QpKHR");

    public VkVideoEncodeH265QpKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH265QpKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH265QpKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int qpI() {return this.ptr.get(LAYOUT$qpI, OFFSET$qpI);}
    public void qpI(int value) {this.ptr.set(LAYOUT$qpI, OFFSET$qpI, value);}
    public java.lang.foreign.MemorySegment qpI_ptr() {return this.ptr.asSlice(OFFSET$qpI, LAYOUT$qpI);}

    public int qpP() {return this.ptr.get(LAYOUT$qpP, OFFSET$qpP);}
    public void qpP(int value) {this.ptr.set(LAYOUT$qpP, OFFSET$qpP, value);}
    public java.lang.foreign.MemorySegment qpP_ptr() {return this.ptr.asSlice(OFFSET$qpP, LAYOUT$qpP);}

    public int qpB() {return this.ptr.get(LAYOUT$qpB, OFFSET$qpB);}
    public void qpB(int value) {this.ptr.set(LAYOUT$qpB, OFFSET$qpB, value);}
    public java.lang.foreign.MemorySegment qpB_ptr() {return this.ptr.asSlice(OFFSET$qpB, LAYOUT$qpB);}
}
