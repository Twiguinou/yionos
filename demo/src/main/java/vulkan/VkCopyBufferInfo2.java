package vulkan;

public record VkCopyBufferInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__srcBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__srcBuffer = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__dstBuffer = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__dstBuffer = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__regionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__regionCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pRegions = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pRegions = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__srcBuffer,
            LAYOUT__dstBuffer,
            LAYOUT__regionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pRegions
    ).withByteAlignment(8).withName("VkCopyBufferInfo2");

    public VkCopyBufferInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCopyBufferInfo2 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCopyBufferInfo2(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCopyBufferInfo2 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment srcBuffer() {return this.ptr.get(LAYOUT__srcBuffer, OFFSET__srcBuffer);}
    public void srcBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__srcBuffer, OFFSET__srcBuffer, value);}
    public java.lang.foreign.MemorySegment $srcBuffer() {return this.ptr.asSlice(OFFSET__srcBuffer, LAYOUT__srcBuffer);}

    public java.lang.foreign.MemorySegment dstBuffer() {return this.ptr.get(LAYOUT__dstBuffer, OFFSET__dstBuffer);}
    public void dstBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__dstBuffer, OFFSET__dstBuffer, value);}
    public java.lang.foreign.MemorySegment $dstBuffer() {return this.ptr.asSlice(OFFSET__dstBuffer, LAYOUT__dstBuffer);}

    public int regionCount() {return this.ptr.get(LAYOUT__regionCount, OFFSET__regionCount);}
    public void regionCount(int value) {this.ptr.set(LAYOUT__regionCount, OFFSET__regionCount, value);}
    public java.lang.foreign.MemorySegment $regionCount() {return this.ptr.asSlice(OFFSET__regionCount, LAYOUT__regionCount);}

    public java.lang.foreign.MemorySegment pRegions() {return this.ptr.get(LAYOUT__pRegions, OFFSET__pRegions);}
    public void pRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pRegions, OFFSET__pRegions, value);}
    public java.lang.foreign.MemorySegment $pRegions() {return this.ptr.asSlice(OFFSET__pRegions, LAYOUT__pRegions);}
}
