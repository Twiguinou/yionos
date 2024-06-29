package vulkan;

public record VkSparseImageMemoryRequirements(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__formatProperties = vulkan.VkSparseImageFormatProperties.gRecordLayout;
    public static final long OFFSET__formatProperties = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageMipTailFirstLod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageMipTailFirstLod = 20;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__imageMipTailSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__imageMipTailSize = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__imageMipTailOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__imageMipTailOffset = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__imageMipTailStride = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__imageMipTailStride = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__formatProperties,
            LAYOUT__imageMipTailFirstLod,
            LAYOUT__imageMipTailSize,
            LAYOUT__imageMipTailOffset,
            LAYOUT__imageMipTailStride
    ).withByteAlignment(8).withName("VkSparseImageMemoryRequirements");

    public VkSparseImageMemoryRequirements(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSparseImageMemoryRequirements getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSparseImageMemoryRequirements(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSparseImageMemoryRequirements value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.VkSparseImageFormatProperties formatProperties() {return new vulkan.VkSparseImageFormatProperties(this.ptr.asSlice(OFFSET__formatProperties, LAYOUT__formatProperties));}
    public void formatProperties(java.util.function.Consumer<vulkan.VkSparseImageFormatProperties> consumer) {consumer.accept(this.formatProperties());}
    public void formatProperties(vulkan.VkSparseImageFormatProperties value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__formatProperties, LAYOUT__formatProperties.byteSize());}

    public int imageMipTailFirstLod() {return this.ptr.get(LAYOUT__imageMipTailFirstLod, OFFSET__imageMipTailFirstLod);}
    public void imageMipTailFirstLod(int value) {this.ptr.set(LAYOUT__imageMipTailFirstLod, OFFSET__imageMipTailFirstLod, value);}
    public java.lang.foreign.MemorySegment $imageMipTailFirstLod() {return this.ptr.asSlice(OFFSET__imageMipTailFirstLod, LAYOUT__imageMipTailFirstLod);}

    public long imageMipTailSize() {return this.ptr.get(LAYOUT__imageMipTailSize, OFFSET__imageMipTailSize);}
    public void imageMipTailSize(long value) {this.ptr.set(LAYOUT__imageMipTailSize, OFFSET__imageMipTailSize, value);}
    public java.lang.foreign.MemorySegment $imageMipTailSize() {return this.ptr.asSlice(OFFSET__imageMipTailSize, LAYOUT__imageMipTailSize);}

    public long imageMipTailOffset() {return this.ptr.get(LAYOUT__imageMipTailOffset, OFFSET__imageMipTailOffset);}
    public void imageMipTailOffset(long value) {this.ptr.set(LAYOUT__imageMipTailOffset, OFFSET__imageMipTailOffset, value);}
    public java.lang.foreign.MemorySegment $imageMipTailOffset() {return this.ptr.asSlice(OFFSET__imageMipTailOffset, LAYOUT__imageMipTailOffset);}

    public long imageMipTailStride() {return this.ptr.get(LAYOUT__imageMipTailStride, OFFSET__imageMipTailStride);}
    public void imageMipTailStride(long value) {this.ptr.set(LAYOUT__imageMipTailStride, OFFSET__imageMipTailStride, value);}
    public java.lang.foreign.MemorySegment $imageMipTailStride() {return this.ptr.asSlice(OFFSET__imageMipTailStride, LAYOUT__imageMipTailStride);}
}
