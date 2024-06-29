package vulkan;

public record VkDescriptorImageInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__sampler = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__sampler = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__imageView = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__imageView = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__imageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__imageLayout = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sampler,
            LAYOUT__imageView,
            LAYOUT__imageLayout,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDescriptorImageInfo");

    public VkDescriptorImageInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDescriptorImageInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDescriptorImageInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDescriptorImageInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment sampler() {return this.ptr.get(LAYOUT__sampler, OFFSET__sampler);}
    public void sampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__sampler, OFFSET__sampler, value);}
    public java.lang.foreign.MemorySegment $sampler() {return this.ptr.asSlice(OFFSET__sampler, LAYOUT__sampler);}

    public java.lang.foreign.MemorySegment imageView() {return this.ptr.get(LAYOUT__imageView, OFFSET__imageView);}
    public void imageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__imageView, OFFSET__imageView, value);}
    public java.lang.foreign.MemorySegment $imageView() {return this.ptr.asSlice(OFFSET__imageView, LAYOUT__imageView);}

    public int imageLayout() {return this.ptr.get(LAYOUT__imageLayout, OFFSET__imageLayout);}
    public void imageLayout(int value) {this.ptr.set(LAYOUT__imageLayout, OFFSET__imageLayout, value);}
    public java.lang.foreign.MemorySegment $imageLayout() {return this.ptr.asSlice(OFFSET__imageLayout, LAYOUT__imageLayout);}
}
