package vulkan;

public record StdVideoAV1TileInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoAV1TileInfoFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__TileCols = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__TileCols = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__TileRows = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__TileRows = 5;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT__context_update_tile_id = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET__context_update_tile_id = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__tile_size_bytes_minus_1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__tile_size_bytes_minus_1 = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__reserved1 = 9;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMiColStarts = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pMiColStarts = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pMiRowStarts = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pMiRowStarts = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pWidthInSbsMinus1 = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pWidthInSbsMinus1 = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pHeightInSbsMinus1 = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pHeightInSbsMinus1 = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__TileCols,
            LAYOUT__TileRows,
            LAYOUT__context_update_tile_id,
            LAYOUT__tile_size_bytes_minus_1,
            LAYOUT__reserved1,
            LAYOUT__pMiColStarts,
            LAYOUT__pMiRowStarts,
            LAYOUT__pWidthInSbsMinus1,
            LAYOUT__pHeightInSbsMinus1
    ).withByteAlignment(8).withName("StdVideoAV1TileInfo");

    public StdVideoAV1TileInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1TileInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1TileInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1TileInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoAV1TileInfoFlags flags() {return new vulkan.StdVideoAV1TileInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoAV1TileInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoAV1TileInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte TileCols() {return this.ptr.get(LAYOUT__TileCols, OFFSET__TileCols);}
    public void TileCols(byte value) {this.ptr.set(LAYOUT__TileCols, OFFSET__TileCols, value);}
    public java.lang.foreign.MemorySegment $TileCols() {return this.ptr.asSlice(OFFSET__TileCols, LAYOUT__TileCols);}

    public byte TileRows() {return this.ptr.get(LAYOUT__TileRows, OFFSET__TileRows);}
    public void TileRows(byte value) {this.ptr.set(LAYOUT__TileRows, OFFSET__TileRows, value);}
    public java.lang.foreign.MemorySegment $TileRows() {return this.ptr.asSlice(OFFSET__TileRows, LAYOUT__TileRows);}

    public short context_update_tile_id() {return this.ptr.get(LAYOUT__context_update_tile_id, OFFSET__context_update_tile_id);}
    public void context_update_tile_id(short value) {this.ptr.set(LAYOUT__context_update_tile_id, OFFSET__context_update_tile_id, value);}
    public java.lang.foreign.MemorySegment $context_update_tile_id() {return this.ptr.asSlice(OFFSET__context_update_tile_id, LAYOUT__context_update_tile_id);}

    public byte tile_size_bytes_minus_1() {return this.ptr.get(LAYOUT__tile_size_bytes_minus_1, OFFSET__tile_size_bytes_minus_1);}
    public void tile_size_bytes_minus_1(byte value) {this.ptr.set(LAYOUT__tile_size_bytes_minus_1, OFFSET__tile_size_bytes_minus_1, value);}
    public java.lang.foreign.MemorySegment $tile_size_bytes_minus_1() {return this.ptr.asSlice(OFFSET__tile_size_bytes_minus_1, LAYOUT__tile_size_bytes_minus_1);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}
    public byte reserved1(int index) {return this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void reserved1(int index, byte value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pMiColStarts() {return this.ptr.get(LAYOUT__pMiColStarts, OFFSET__pMiColStarts);}
    public void pMiColStarts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMiColStarts, OFFSET__pMiColStarts, value);}
    public java.lang.foreign.MemorySegment $pMiColStarts() {return this.ptr.asSlice(OFFSET__pMiColStarts, LAYOUT__pMiColStarts);}

    public java.lang.foreign.MemorySegment pMiRowStarts() {return this.ptr.get(LAYOUT__pMiRowStarts, OFFSET__pMiRowStarts);}
    public void pMiRowStarts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pMiRowStarts, OFFSET__pMiRowStarts, value);}
    public java.lang.foreign.MemorySegment $pMiRowStarts() {return this.ptr.asSlice(OFFSET__pMiRowStarts, LAYOUT__pMiRowStarts);}

    public java.lang.foreign.MemorySegment pWidthInSbsMinus1() {return this.ptr.get(LAYOUT__pWidthInSbsMinus1, OFFSET__pWidthInSbsMinus1);}
    public void pWidthInSbsMinus1(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pWidthInSbsMinus1, OFFSET__pWidthInSbsMinus1, value);}
    public java.lang.foreign.MemorySegment $pWidthInSbsMinus1() {return this.ptr.asSlice(OFFSET__pWidthInSbsMinus1, LAYOUT__pWidthInSbsMinus1);}

    public java.lang.foreign.MemorySegment pHeightInSbsMinus1() {return this.ptr.get(LAYOUT__pHeightInSbsMinus1, OFFSET__pHeightInSbsMinus1);}
    public void pHeightInSbsMinus1(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pHeightInSbsMinus1, OFFSET__pHeightInSbsMinus1, value);}
    public java.lang.foreign.MemorySegment $pHeightInSbsMinus1() {return this.ptr.asSlice(OFFSET__pHeightInSbsMinus1, LAYOUT__pHeightInSbsMinus1);}
}
