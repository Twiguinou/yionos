package vma;

public record VkBindBufferMemoryInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__buffer = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("buffer");
    public static final long OFFSET__buffer = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__memory = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("memory");
    public static final long OFFSET__memory = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__memoryOffset = java.lang.foreign.ValueLayout.JAVA_LONG.withName("memoryOffset");
    public static final long OFFSET__memoryOffset = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__buffer,
            LAYOUT__memory,
            LAYOUT__memoryOffset
    ).withByteAlignment(8).withName("VkBindBufferMemoryInfo");

    public VkBindBufferMemoryInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkBindBufferMemoryInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkBindBufferMemoryInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkBindBufferMemoryInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT__buffer, OFFSET__buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__buffer, OFFSET__buffer, value);}
    public java.lang.foreign.MemorySegment $buffer() {return this.ptr.asSlice(OFFSET__buffer, LAYOUT__buffer);}

    public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT__memory, OFFSET__memory);}
    public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__memory, OFFSET__memory, value);}
    public java.lang.foreign.MemorySegment $memory() {return this.ptr.asSlice(OFFSET__memory, LAYOUT__memory);}

    public long memoryOffset() {return this.ptr.get(LAYOUT__memoryOffset, OFFSET__memoryOffset);}
    public void memoryOffset(long value) {this.ptr.set(LAYOUT__memoryOffset, OFFSET__memoryOffset, value);}
    public java.lang.foreign.MemorySegment $memoryOffset() {return this.ptr.asSlice(OFFSET__memoryOffset, LAYOUT__memoryOffset);}
}
