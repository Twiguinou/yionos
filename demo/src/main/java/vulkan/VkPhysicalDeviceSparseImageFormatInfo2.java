package vulkan;

public record VkPhysicalDeviceSparseImageFormatInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT.withName("format");
    public static final long OFFSET__format = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__samples = java.lang.foreign.ValueLayout.JAVA_INT.withName("samples");
    public static final long OFFSET__samples = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__usage = java.lang.foreign.ValueLayout.JAVA_INT.withName("usage");
    public static final long OFFSET__usage = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__tiling = java.lang.foreign.ValueLayout.JAVA_INT.withName("tiling");
    public static final long OFFSET__tiling = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__format,
            LAYOUT__type,
            LAYOUT__samples,
            LAYOUT__usage,
            LAYOUT__tiling,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceSparseImageFormatInfo2");

    public VkPhysicalDeviceSparseImageFormatInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceSparseImageFormatInfo2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceSparseImageFormatInfo2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int samples() {return this.ptr.get(LAYOUT__samples, OFFSET__samples);}
    public void samples(int value) {this.ptr.set(LAYOUT__samples, OFFSET__samples, value);}
    public java.lang.foreign.MemorySegment $samples() {return this.ptr.asSlice(OFFSET__samples, LAYOUT__samples);}

    public int usage() {return this.ptr.get(LAYOUT__usage, OFFSET__usage);}
    public void usage(int value) {this.ptr.set(LAYOUT__usage, OFFSET__usage, value);}
    public java.lang.foreign.MemorySegment $usage() {return this.ptr.asSlice(OFFSET__usage, LAYOUT__usage);}

    public int tiling() {return this.ptr.get(LAYOUT__tiling, OFFSET__tiling);}
    public void tiling(int value) {this.ptr.set(LAYOUT__tiling, OFFSET__tiling, value);}
    public java.lang.foreign.MemorySegment $tiling() {return this.ptr.asSlice(OFFSET__tiling, LAYOUT__tiling);}
}
