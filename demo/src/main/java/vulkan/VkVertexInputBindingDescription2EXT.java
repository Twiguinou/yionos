package vulkan;

public record VkVertexInputBindingDescription2EXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__binding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__binding = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__stride = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__inputRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__inputRate = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__divisor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__divisor = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__binding,
            LAYOUT__stride,
            LAYOUT__inputRate,
            LAYOUT__divisor
    ).withByteAlignment(8).withName("VkVertexInputBindingDescription2EXT");

    public VkVertexInputBindingDescription2EXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVertexInputBindingDescription2EXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVertexInputBindingDescription2EXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVertexInputBindingDescription2EXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int binding() {return this.ptr.get(LAYOUT__binding, OFFSET__binding);}
    public void binding(int value) {this.ptr.set(LAYOUT__binding, OFFSET__binding, value);}
    public java.lang.foreign.MemorySegment $binding() {return this.ptr.asSlice(OFFSET__binding, LAYOUT__binding);}

    public int stride() {return this.ptr.get(LAYOUT__stride, OFFSET__stride);}
    public void stride(int value) {this.ptr.set(LAYOUT__stride, OFFSET__stride, value);}
    public java.lang.foreign.MemorySegment $stride() {return this.ptr.asSlice(OFFSET__stride, LAYOUT__stride);}

    public int inputRate() {return this.ptr.get(LAYOUT__inputRate, OFFSET__inputRate);}
    public void inputRate(int value) {this.ptr.set(LAYOUT__inputRate, OFFSET__inputRate, value);}
    public java.lang.foreign.MemorySegment $inputRate() {return this.ptr.asSlice(OFFSET__inputRate, LAYOUT__inputRate);}

    public int divisor() {return this.ptr.get(LAYOUT__divisor, OFFSET__divisor);}
    public void divisor(int value) {this.ptr.set(LAYOUT__divisor, OFFSET__divisor, value);}
    public java.lang.foreign.MemorySegment $divisor() {return this.ptr.asSlice(OFFSET__divisor, LAYOUT__divisor);}
}
