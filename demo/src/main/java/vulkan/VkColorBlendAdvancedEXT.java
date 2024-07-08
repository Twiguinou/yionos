package vulkan;

public record VkColorBlendAdvancedEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__advancedBlendOp = java.lang.foreign.ValueLayout.JAVA_INT.withName("advancedBlendOp");
    public static final long OFFSET__advancedBlendOp = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT.withName("srcPremultiplied");
    public static final long OFFSET__srcPremultiplied = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstPremultiplied");
    public static final long OFFSET__dstPremultiplied = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blendOverlap = java.lang.foreign.ValueLayout.JAVA_INT.withName("blendOverlap");
    public static final long OFFSET__blendOverlap = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__clampResults = java.lang.foreign.ValueLayout.JAVA_INT.withName("clampResults");
    public static final long OFFSET__clampResults = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__advancedBlendOp,
            LAYOUT__srcPremultiplied,
            LAYOUT__dstPremultiplied,
            LAYOUT__blendOverlap,
            LAYOUT__clampResults
    ).withByteAlignment(4).withName("VkColorBlendAdvancedEXT");

    public VkColorBlendAdvancedEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkColorBlendAdvancedEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkColorBlendAdvancedEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkColorBlendAdvancedEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int advancedBlendOp() {return this.ptr.get(LAYOUT__advancedBlendOp, OFFSET__advancedBlendOp);}
    public void advancedBlendOp(int value) {this.ptr.set(LAYOUT__advancedBlendOp, OFFSET__advancedBlendOp, value);}
    public java.lang.foreign.MemorySegment $advancedBlendOp() {return this.ptr.asSlice(OFFSET__advancedBlendOp, LAYOUT__advancedBlendOp);}

    public int srcPremultiplied() {return this.ptr.get(LAYOUT__srcPremultiplied, OFFSET__srcPremultiplied);}
    public void srcPremultiplied(int value) {this.ptr.set(LAYOUT__srcPremultiplied, OFFSET__srcPremultiplied, value);}
    public java.lang.foreign.MemorySegment $srcPremultiplied() {return this.ptr.asSlice(OFFSET__srcPremultiplied, LAYOUT__srcPremultiplied);}

    public int dstPremultiplied() {return this.ptr.get(LAYOUT__dstPremultiplied, OFFSET__dstPremultiplied);}
    public void dstPremultiplied(int value) {this.ptr.set(LAYOUT__dstPremultiplied, OFFSET__dstPremultiplied, value);}
    public java.lang.foreign.MemorySegment $dstPremultiplied() {return this.ptr.asSlice(OFFSET__dstPremultiplied, LAYOUT__dstPremultiplied);}

    public int blendOverlap() {return this.ptr.get(LAYOUT__blendOverlap, OFFSET__blendOverlap);}
    public void blendOverlap(int value) {this.ptr.set(LAYOUT__blendOverlap, OFFSET__blendOverlap, value);}
    public java.lang.foreign.MemorySegment $blendOverlap() {return this.ptr.asSlice(OFFSET__blendOverlap, LAYOUT__blendOverlap);}

    public int clampResults() {return this.ptr.get(LAYOUT__clampResults, OFFSET__clampResults);}
    public void clampResults(int value) {this.ptr.set(LAYOUT__clampResults, OFFSET__clampResults, value);}
    public java.lang.foreign.MemorySegment $clampResults() {return this.ptr.asSlice(OFFSET__clampResults, LAYOUT__clampResults);}
}
