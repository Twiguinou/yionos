package vulkan;

public record VkViewportWScalingNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__xcoeff = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("xcoeff");
    public static final long OFFSET__xcoeff = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__ycoeff = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("ycoeff");
    public static final long OFFSET__ycoeff = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__xcoeff,
            LAYOUT__ycoeff
    ).withByteAlignment(4).withName("VkViewportWScalingNV");

    public VkViewportWScalingNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkViewportWScalingNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkViewportWScalingNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkViewportWScalingNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float xcoeff() {return this.ptr.get(LAYOUT__xcoeff, OFFSET__xcoeff);}
    public void xcoeff(float value) {this.ptr.set(LAYOUT__xcoeff, OFFSET__xcoeff, value);}
    public java.lang.foreign.MemorySegment $xcoeff() {return this.ptr.asSlice(OFFSET__xcoeff, LAYOUT__xcoeff);}

    public float ycoeff() {return this.ptr.get(LAYOUT__ycoeff, OFFSET__ycoeff);}
    public void ycoeff(float value) {this.ptr.set(LAYOUT__ycoeff, OFFSET__ycoeff, value);}
    public java.lang.foreign.MemorySegment $ycoeff() {return this.ptr.asSlice(OFFSET__ycoeff, LAYOUT__ycoeff);}
}
