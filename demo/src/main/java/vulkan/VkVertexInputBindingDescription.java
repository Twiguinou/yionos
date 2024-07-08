package vulkan;

public record VkVertexInputBindingDescription(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__binding = java.lang.foreign.ValueLayout.JAVA_INT.withName("binding");
    public static final long OFFSET__binding = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stride = java.lang.foreign.ValueLayout.JAVA_INT.withName("stride");
    public static final long OFFSET__stride = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inputRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("inputRate");
    public static final long OFFSET__inputRate = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__binding,
            LAYOUT__stride,
            LAYOUT__inputRate
    ).withByteAlignment(4).withName("VkVertexInputBindingDescription");

    public VkVertexInputBindingDescription(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVertexInputBindingDescription getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVertexInputBindingDescription(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVertexInputBindingDescription value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int binding() {return this.ptr.get(LAYOUT__binding, OFFSET__binding);}
    public void binding(int value) {this.ptr.set(LAYOUT__binding, OFFSET__binding, value);}
    public java.lang.foreign.MemorySegment $binding() {return this.ptr.asSlice(OFFSET__binding, LAYOUT__binding);}

    public int stride() {return this.ptr.get(LAYOUT__stride, OFFSET__stride);}
    public void stride(int value) {this.ptr.set(LAYOUT__stride, OFFSET__stride, value);}
    public java.lang.foreign.MemorySegment $stride() {return this.ptr.asSlice(OFFSET__stride, LAYOUT__stride);}

    public int inputRate() {return this.ptr.get(LAYOUT__inputRate, OFFSET__inputRate);}
    public void inputRate(int value) {this.ptr.set(LAYOUT__inputRate, OFFSET__inputRate, value);}
    public java.lang.foreign.MemorySegment $inputRate() {return this.ptr.asSlice(OFFSET__inputRate, LAYOUT__inputRate);}
}
