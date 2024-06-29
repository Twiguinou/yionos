package vulkan;

public record VkVertexInputBindingDivisorDescriptionKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__binding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__binding = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__divisor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__divisor = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__binding,
            LAYOUT__divisor
    ).withByteAlignment(4).withName("VkVertexInputBindingDivisorDescriptionKHR");

    public VkVertexInputBindingDivisorDescriptionKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVertexInputBindingDivisorDescriptionKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVertexInputBindingDivisorDescriptionKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVertexInputBindingDivisorDescriptionKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int binding() {return this.ptr.get(LAYOUT__binding, OFFSET__binding);}
    public void binding(int value) {this.ptr.set(LAYOUT__binding, OFFSET__binding, value);}
    public java.lang.foreign.MemorySegment $binding() {return this.ptr.asSlice(OFFSET__binding, LAYOUT__binding);}

    public int divisor() {return this.ptr.get(LAYOUT__divisor, OFFSET__divisor);}
    public void divisor(int value) {this.ptr.set(LAYOUT__divisor, OFFSET__divisor, value);}
    public java.lang.foreign.MemorySegment $divisor() {return this.ptr.asSlice(OFFSET__divisor, LAYOUT__divisor);}
}
