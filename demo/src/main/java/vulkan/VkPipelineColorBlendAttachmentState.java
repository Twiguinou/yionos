package vulkan;

public record VkPipelineColorBlendAttachmentState(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blendEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__blendEnable = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcColorBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcColorBlendFactor = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstColorBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstColorBlendFactor = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorBlendOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__colorBlendOp = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcAlphaBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__srcAlphaBlendFactor = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstAlphaBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__dstAlphaBlendFactor = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__alphaBlendOp = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__alphaBlendOp = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__colorWriteMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__colorWriteMask = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__blendEnable,
            LAYOUT__srcColorBlendFactor,
            LAYOUT__dstColorBlendFactor,
            LAYOUT__colorBlendOp,
            LAYOUT__srcAlphaBlendFactor,
            LAYOUT__dstAlphaBlendFactor,
            LAYOUT__alphaBlendOp,
            LAYOUT__colorWriteMask
    ).withByteAlignment(4).withName("VkPipelineColorBlendAttachmentState");

    public VkPipelineColorBlendAttachmentState(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineColorBlendAttachmentState getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineColorBlendAttachmentState(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineColorBlendAttachmentState value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int blendEnable() {return this.ptr.get(LAYOUT__blendEnable, OFFSET__blendEnable);}
    public void blendEnable(int value) {this.ptr.set(LAYOUT__blendEnable, OFFSET__blendEnable, value);}
    public java.lang.foreign.MemorySegment $blendEnable() {return this.ptr.asSlice(OFFSET__blendEnable, LAYOUT__blendEnable);}

    public int srcColorBlendFactor() {return this.ptr.get(LAYOUT__srcColorBlendFactor, OFFSET__srcColorBlendFactor);}
    public void srcColorBlendFactor(int value) {this.ptr.set(LAYOUT__srcColorBlendFactor, OFFSET__srcColorBlendFactor, value);}
    public java.lang.foreign.MemorySegment $srcColorBlendFactor() {return this.ptr.asSlice(OFFSET__srcColorBlendFactor, LAYOUT__srcColorBlendFactor);}

    public int dstColorBlendFactor() {return this.ptr.get(LAYOUT__dstColorBlendFactor, OFFSET__dstColorBlendFactor);}
    public void dstColorBlendFactor(int value) {this.ptr.set(LAYOUT__dstColorBlendFactor, OFFSET__dstColorBlendFactor, value);}
    public java.lang.foreign.MemorySegment $dstColorBlendFactor() {return this.ptr.asSlice(OFFSET__dstColorBlendFactor, LAYOUT__dstColorBlendFactor);}

    public int colorBlendOp() {return this.ptr.get(LAYOUT__colorBlendOp, OFFSET__colorBlendOp);}
    public void colorBlendOp(int value) {this.ptr.set(LAYOUT__colorBlendOp, OFFSET__colorBlendOp, value);}
    public java.lang.foreign.MemorySegment $colorBlendOp() {return this.ptr.asSlice(OFFSET__colorBlendOp, LAYOUT__colorBlendOp);}

    public int srcAlphaBlendFactor() {return this.ptr.get(LAYOUT__srcAlphaBlendFactor, OFFSET__srcAlphaBlendFactor);}
    public void srcAlphaBlendFactor(int value) {this.ptr.set(LAYOUT__srcAlphaBlendFactor, OFFSET__srcAlphaBlendFactor, value);}
    public java.lang.foreign.MemorySegment $srcAlphaBlendFactor() {return this.ptr.asSlice(OFFSET__srcAlphaBlendFactor, LAYOUT__srcAlphaBlendFactor);}

    public int dstAlphaBlendFactor() {return this.ptr.get(LAYOUT__dstAlphaBlendFactor, OFFSET__dstAlphaBlendFactor);}
    public void dstAlphaBlendFactor(int value) {this.ptr.set(LAYOUT__dstAlphaBlendFactor, OFFSET__dstAlphaBlendFactor, value);}
    public java.lang.foreign.MemorySegment $dstAlphaBlendFactor() {return this.ptr.asSlice(OFFSET__dstAlphaBlendFactor, LAYOUT__dstAlphaBlendFactor);}

    public int alphaBlendOp() {return this.ptr.get(LAYOUT__alphaBlendOp, OFFSET__alphaBlendOp);}
    public void alphaBlendOp(int value) {this.ptr.set(LAYOUT__alphaBlendOp, OFFSET__alphaBlendOp, value);}
    public java.lang.foreign.MemorySegment $alphaBlendOp() {return this.ptr.asSlice(OFFSET__alphaBlendOp, LAYOUT__alphaBlendOp);}

    public int colorWriteMask() {return this.ptr.get(LAYOUT__colorWriteMask, OFFSET__colorWriteMask);}
    public void colorWriteMask(int value) {this.ptr.set(LAYOUT__colorWriteMask, OFFSET__colorWriteMask, value);}
    public java.lang.foreign.MemorySegment $colorWriteMask() {return this.ptr.asSlice(OFFSET__colorWriteMask, LAYOUT__colorWriteMask);}
}
