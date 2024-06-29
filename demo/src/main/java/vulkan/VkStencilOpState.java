package vulkan;

public record VkStencilOpState(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__failOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__failOp = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__passOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__passOp = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__depthFailOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__depthFailOp = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compareOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__compareOp = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__compareMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__compareMask = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__writeMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__writeMask = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__reference = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__reference = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__failOp,
            LAYOUT__passOp,
            LAYOUT__depthFailOp,
            LAYOUT__compareOp,
            LAYOUT__compareMask,
            LAYOUT__writeMask,
            LAYOUT__reference
    ).withByteAlignment(4).withName("VkStencilOpState");

    public VkStencilOpState(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkStencilOpState getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkStencilOpState(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkStencilOpState value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int failOp() {return this.ptr.get(LAYOUT__failOp, OFFSET__failOp);}
    public void failOp(int value) {this.ptr.set(LAYOUT__failOp, OFFSET__failOp, value);}
    public java.lang.foreign.MemorySegment $failOp() {return this.ptr.asSlice(OFFSET__failOp, LAYOUT__failOp);}

    public int passOp() {return this.ptr.get(LAYOUT__passOp, OFFSET__passOp);}
    public void passOp(int value) {this.ptr.set(LAYOUT__passOp, OFFSET__passOp, value);}
    public java.lang.foreign.MemorySegment $passOp() {return this.ptr.asSlice(OFFSET__passOp, LAYOUT__passOp);}

    public int depthFailOp() {return this.ptr.get(LAYOUT__depthFailOp, OFFSET__depthFailOp);}
    public void depthFailOp(int value) {this.ptr.set(LAYOUT__depthFailOp, OFFSET__depthFailOp, value);}
    public java.lang.foreign.MemorySegment $depthFailOp() {return this.ptr.asSlice(OFFSET__depthFailOp, LAYOUT__depthFailOp);}

    public int compareOp() {return this.ptr.get(LAYOUT__compareOp, OFFSET__compareOp);}
    public void compareOp(int value) {this.ptr.set(LAYOUT__compareOp, OFFSET__compareOp, value);}
    public java.lang.foreign.MemorySegment $compareOp() {return this.ptr.asSlice(OFFSET__compareOp, LAYOUT__compareOp);}

    public int compareMask() {return this.ptr.get(LAYOUT__compareMask, OFFSET__compareMask);}
    public void compareMask(int value) {this.ptr.set(LAYOUT__compareMask, OFFSET__compareMask, value);}
    public java.lang.foreign.MemorySegment $compareMask() {return this.ptr.asSlice(OFFSET__compareMask, LAYOUT__compareMask);}

    public int writeMask() {return this.ptr.get(LAYOUT__writeMask, OFFSET__writeMask);}
    public void writeMask(int value) {this.ptr.set(LAYOUT__writeMask, OFFSET__writeMask, value);}
    public java.lang.foreign.MemorySegment $writeMask() {return this.ptr.asSlice(OFFSET__writeMask, LAYOUT__writeMask);}

    public int reference() {return this.ptr.get(LAYOUT__reference, OFFSET__reference);}
    public void reference(int value) {this.ptr.set(LAYOUT__reference, OFFSET__reference, value);}
    public java.lang.foreign.MemorySegment $reference() {return this.ptr.asSlice(OFFSET__reference, LAYOUT__reference);}
}
