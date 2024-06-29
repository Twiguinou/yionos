package vulkan;

public record VkSparseImageOpaqueMemoryBindInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__image = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__image = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bindCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__bindCount = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBinds = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pBinds = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__image,
            LAYOUT__bindCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pBinds
    ).withByteAlignment(8).withName("VkSparseImageOpaqueMemoryBindInfo");

    public VkSparseImageOpaqueMemoryBindInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSparseImageOpaqueMemoryBindInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSparseImageOpaqueMemoryBindInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSparseImageOpaqueMemoryBindInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment image() {return this.ptr.get(LAYOUT__image, OFFSET__image);}
    public void image(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__image, OFFSET__image, value);}
    public java.lang.foreign.MemorySegment $image() {return this.ptr.asSlice(OFFSET__image, LAYOUT__image);}

    public int bindCount() {return this.ptr.get(LAYOUT__bindCount, OFFSET__bindCount);}
    public void bindCount(int value) {this.ptr.set(LAYOUT__bindCount, OFFSET__bindCount, value);}
    public java.lang.foreign.MemorySegment $bindCount() {return this.ptr.asSlice(OFFSET__bindCount, LAYOUT__bindCount);}

    public java.lang.foreign.MemorySegment pBinds() {return this.ptr.get(LAYOUT__pBinds, OFFSET__pBinds);}
    public void pBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBinds, OFFSET__pBinds, value);}
    public java.lang.foreign.MemorySegment $pBinds() {return this.ptr.asSlice(OFFSET__pBinds, LAYOUT__pBinds);}
}
