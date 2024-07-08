package vulkan;

public record VkPipelineColorBlendAdvancedStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__srcPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT.withName("srcPremultiplied");
    public static final long OFFSET__srcPremultiplied = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__dstPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT.withName("dstPremultiplied");
    public static final long OFFSET__dstPremultiplied = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blendOverlap = java.lang.foreign.ValueLayout.JAVA_INT.withName("blendOverlap");
    public static final long OFFSET__blendOverlap = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcPremultiplied,
            LAYOUT__dstPremultiplied,
            LAYOUT__blendOverlap,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPipelineColorBlendAdvancedStateCreateInfoEXT");

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPipelineColorBlendAdvancedStateCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int srcPremultiplied() {return this.ptr.get(LAYOUT__srcPremultiplied, OFFSET__srcPremultiplied);}
    public void srcPremultiplied(int value) {this.ptr.set(LAYOUT__srcPremultiplied, OFFSET__srcPremultiplied, value);}
    public java.lang.foreign.MemorySegment $srcPremultiplied() {return this.ptr.asSlice(OFFSET__srcPremultiplied, LAYOUT__srcPremultiplied);}

    public int dstPremultiplied() {return this.ptr.get(LAYOUT__dstPremultiplied, OFFSET__dstPremultiplied);}
    public void dstPremultiplied(int value) {this.ptr.set(LAYOUT__dstPremultiplied, OFFSET__dstPremultiplied, value);}
    public java.lang.foreign.MemorySegment $dstPremultiplied() {return this.ptr.asSlice(OFFSET__dstPremultiplied, LAYOUT__dstPremultiplied);}

    public int blendOverlap() {return this.ptr.get(LAYOUT__blendOverlap, OFFSET__blendOverlap);}
    public void blendOverlap(int value) {this.ptr.set(LAYOUT__blendOverlap, OFFSET__blendOverlap, value);}
    public java.lang.foreign.MemorySegment $blendOverlap() {return this.ptr.asSlice(OFFSET__blendOverlap, LAYOUT__blendOverlap);}
}
