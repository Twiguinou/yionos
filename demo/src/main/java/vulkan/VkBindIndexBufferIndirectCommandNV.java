package vulkan;

public record VkBindIndexBufferIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bufferAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bufferAddress = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$indexType = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$bufferAddress,
            LAYOUT$size,
            LAYOUT$indexType
    ).withName("VkBindIndexBufferIndirectCommandNV");

    public VkBindIndexBufferIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkBindIndexBufferIndirectCommandNV getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkBindIndexBufferIndirectCommandNV(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long bufferAddress() {return this.ptr.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);}
    public void bufferAddress(long value) {this.ptr.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);}
    public java.lang.foreign.MemorySegment bufferAddress_ptr() {return this.ptr.asSlice(OFFSET$bufferAddress, LAYOUT$bufferAddress);}

    public int size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public int indexType() {return this.ptr.get(LAYOUT$indexType, OFFSET$indexType);}
    public void indexType(int value) {this.ptr.set(LAYOUT$indexType, OFFSET$indexType, value);}
    public java.lang.foreign.MemorySegment indexType_ptr() {return this.ptr.asSlice(OFFSET$indexType, LAYOUT$indexType);}
}
