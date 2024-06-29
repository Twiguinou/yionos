package vulkan;

public record VkCoarseSampleLocationNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pixelX = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pixelX = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__pixelY = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__pixelY = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sample = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sample = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__pixelX,
            LAYOUT__pixelY,
            LAYOUT__sample
    ).withByteAlignment(4).withName("VkCoarseSampleLocationNV");

    public VkCoarseSampleLocationNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCoarseSampleLocationNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCoarseSampleLocationNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCoarseSampleLocationNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int pixelX() {return this.ptr.get(LAYOUT__pixelX, OFFSET__pixelX);}
    public void pixelX(int value) {this.ptr.set(LAYOUT__pixelX, OFFSET__pixelX, value);}
    public java.lang.foreign.MemorySegment $pixelX() {return this.ptr.asSlice(OFFSET__pixelX, LAYOUT__pixelX);}

    public int pixelY() {return this.ptr.get(LAYOUT__pixelY, OFFSET__pixelY);}
    public void pixelY(int value) {this.ptr.set(LAYOUT__pixelY, OFFSET__pixelY, value);}
    public java.lang.foreign.MemorySegment $pixelY() {return this.ptr.asSlice(OFFSET__pixelY, LAYOUT__pixelY);}

    public int sample() {return this.ptr.get(LAYOUT__sample, OFFSET__sample);}
    public void sample(int value) {this.ptr.set(LAYOUT__sample, OFFSET__sample, value);}
    public java.lang.foreign.MemorySegment $sample() {return this.ptr.asSlice(OFFSET__sample, LAYOUT__sample);}
}
