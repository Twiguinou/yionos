package vulkan;

public record VkDecompressMemoryRegionNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__srcAddress = java.lang.foreign.ValueLayout.JAVA_LONG.withName("srcAddress");
    public static final long OFFSET__srcAddress = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__dstAddress = java.lang.foreign.ValueLayout.JAVA_LONG.withName("dstAddress");
    public static final long OFFSET__dstAddress = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__compressedSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("compressedSize");
    public static final long OFFSET__compressedSize = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__decompressedSize = java.lang.foreign.ValueLayout.JAVA_LONG.withName("decompressedSize");
    public static final long OFFSET__decompressedSize = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__decompressionMethod = java.lang.foreign.ValueLayout.JAVA_LONG.withName("decompressionMethod");
    public static final long OFFSET__decompressionMethod = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__srcAddress,
            LAYOUT__dstAddress,
            LAYOUT__compressedSize,
            LAYOUT__decompressedSize,
            LAYOUT__decompressionMethod
    ).withByteAlignment(8).withName("VkDecompressMemoryRegionNV");

    public VkDecompressMemoryRegionNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDecompressMemoryRegionNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDecompressMemoryRegionNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDecompressMemoryRegionNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public long srcAddress() {return this.ptr.get(LAYOUT__srcAddress, OFFSET__srcAddress);}
    public void srcAddress(long value) {this.ptr.set(LAYOUT__srcAddress, OFFSET__srcAddress, value);}
    public java.lang.foreign.MemorySegment $srcAddress() {return this.ptr.asSlice(OFFSET__srcAddress, LAYOUT__srcAddress);}

    public long dstAddress() {return this.ptr.get(LAYOUT__dstAddress, OFFSET__dstAddress);}
    public void dstAddress(long value) {this.ptr.set(LAYOUT__dstAddress, OFFSET__dstAddress, value);}
    public java.lang.foreign.MemorySegment $dstAddress() {return this.ptr.asSlice(OFFSET__dstAddress, LAYOUT__dstAddress);}

    public long compressedSize() {return this.ptr.get(LAYOUT__compressedSize, OFFSET__compressedSize);}
    public void compressedSize(long value) {this.ptr.set(LAYOUT__compressedSize, OFFSET__compressedSize, value);}
    public java.lang.foreign.MemorySegment $compressedSize() {return this.ptr.asSlice(OFFSET__compressedSize, LAYOUT__compressedSize);}

    public long decompressedSize() {return this.ptr.get(LAYOUT__decompressedSize, OFFSET__decompressedSize);}
    public void decompressedSize(long value) {this.ptr.set(LAYOUT__decompressedSize, OFFSET__decompressedSize, value);}
    public java.lang.foreign.MemorySegment $decompressedSize() {return this.ptr.asSlice(OFFSET__decompressedSize, LAYOUT__decompressedSize);}

    public long decompressionMethod() {return this.ptr.get(LAYOUT__decompressionMethod, OFFSET__decompressionMethod);}
    public void decompressionMethod(long value) {this.ptr.set(LAYOUT__decompressionMethod, OFFSET__decompressionMethod, value);}
    public java.lang.foreign.MemorySegment $decompressionMethod() {return this.ptr.asSlice(OFFSET__decompressionMethod, LAYOUT__decompressionMethod);}
}
