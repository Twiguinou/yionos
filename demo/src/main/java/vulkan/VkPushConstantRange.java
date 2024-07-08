package vulkan;

public record VkPushConstantRange(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__stageFlags = java.lang.foreign.ValueLayout.JAVA_INT.withName("stageFlags");
    public static final long OFFSET__stageFlags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__offset = java.lang.foreign.ValueLayout.JAVA_INT.withName("offset");
    public static final long OFFSET__offset = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_INT.withName("size");
    public static final long OFFSET__size = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__stageFlags,
            LAYOUT__offset,
            LAYOUT__size
    ).withByteAlignment(4).withName("VkPushConstantRange");

    public VkPushConstantRange(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPushConstantRange getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPushConstantRange(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPushConstantRange value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int stageFlags() {return this.ptr.get(LAYOUT__stageFlags, OFFSET__stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT__stageFlags, OFFSET__stageFlags, value);}
    public java.lang.foreign.MemorySegment $stageFlags() {return this.ptr.asSlice(OFFSET__stageFlags, LAYOUT__stageFlags);}

    public int offset() {return this.ptr.get(LAYOUT__offset, OFFSET__offset);}
    public void offset(int value) {this.ptr.set(LAYOUT__offset, OFFSET__offset, value);}
    public java.lang.foreign.MemorySegment $offset() {return this.ptr.asSlice(OFFSET__offset, LAYOUT__offset);}

    public int size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(int value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}
}
