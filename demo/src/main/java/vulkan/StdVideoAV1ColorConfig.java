package vulkan;

public record StdVideoAV1ColorConfig(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoAV1ColorConfigFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__BitDepth = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("BitDepth");
    public static final long OFFSET__BitDepth = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__subsampling_x = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("subsampling_x");
    public static final long OFFSET__subsampling_x = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__subsampling_y = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("subsampling_y");
    public static final long OFFSET__subsampling_y = 6;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final long OFFSET__reserved1 = 7;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__color_primaries = java.lang.foreign.ValueLayout.JAVA_INT.withName("color_primaries");
    public static final long OFFSET__color_primaries = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__transfer_characteristics = java.lang.foreign.ValueLayout.JAVA_INT.withName("transfer_characteristics");
    public static final long OFFSET__transfer_characteristics = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__matrix_coefficients = java.lang.foreign.ValueLayout.JAVA_INT.withName("matrix_coefficients");
    public static final long OFFSET__matrix_coefficients = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chroma_sample_position = java.lang.foreign.ValueLayout.JAVA_INT.withName("chroma_sample_position");
    public static final long OFFSET__chroma_sample_position = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__BitDepth,
            LAYOUT__subsampling_x,
            LAYOUT__subsampling_y,
            LAYOUT__reserved1,
            LAYOUT__color_primaries,
            LAYOUT__transfer_characteristics,
            LAYOUT__matrix_coefficients,
            LAYOUT__chroma_sample_position
    ).withByteAlignment(4).withName("StdVideoAV1ColorConfig");

    public StdVideoAV1ColorConfig(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoAV1ColorConfig getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoAV1ColorConfig(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoAV1ColorConfig value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoAV1ColorConfigFlags flags() {return new vulkan.StdVideoAV1ColorConfigFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoAV1ColorConfigFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoAV1ColorConfigFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte BitDepth() {return this.ptr.get(LAYOUT__BitDepth, OFFSET__BitDepth);}
    public void BitDepth(byte value) {this.ptr.set(LAYOUT__BitDepth, OFFSET__BitDepth, value);}
    public java.lang.foreign.MemorySegment $BitDepth() {return this.ptr.asSlice(OFFSET__BitDepth, LAYOUT__BitDepth);}

    public byte subsampling_x() {return this.ptr.get(LAYOUT__subsampling_x, OFFSET__subsampling_x);}
    public void subsampling_x(byte value) {this.ptr.set(LAYOUT__subsampling_x, OFFSET__subsampling_x, value);}
    public java.lang.foreign.MemorySegment $subsampling_x() {return this.ptr.asSlice(OFFSET__subsampling_x, LAYOUT__subsampling_x);}

    public byte subsampling_y() {return this.ptr.get(LAYOUT__subsampling_y, OFFSET__subsampling_y);}
    public void subsampling_y(byte value) {this.ptr.set(LAYOUT__subsampling_y, OFFSET__subsampling_y, value);}
    public java.lang.foreign.MemorySegment $subsampling_y() {return this.ptr.asSlice(OFFSET__subsampling_y, LAYOUT__subsampling_y);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public int color_primaries() {return this.ptr.get(LAYOUT__color_primaries, OFFSET__color_primaries);}
    public void color_primaries(int value) {this.ptr.set(LAYOUT__color_primaries, OFFSET__color_primaries, value);}
    public java.lang.foreign.MemorySegment $color_primaries() {return this.ptr.asSlice(OFFSET__color_primaries, LAYOUT__color_primaries);}

    public int transfer_characteristics() {return this.ptr.get(LAYOUT__transfer_characteristics, OFFSET__transfer_characteristics);}
    public void transfer_characteristics(int value) {this.ptr.set(LAYOUT__transfer_characteristics, OFFSET__transfer_characteristics, value);}
    public java.lang.foreign.MemorySegment $transfer_characteristics() {return this.ptr.asSlice(OFFSET__transfer_characteristics, LAYOUT__transfer_characteristics);}

    public int matrix_coefficients() {return this.ptr.get(LAYOUT__matrix_coefficients, OFFSET__matrix_coefficients);}
    public void matrix_coefficients(int value) {this.ptr.set(LAYOUT__matrix_coefficients, OFFSET__matrix_coefficients, value);}
    public java.lang.foreign.MemorySegment $matrix_coefficients() {return this.ptr.asSlice(OFFSET__matrix_coefficients, LAYOUT__matrix_coefficients);}

    public int chroma_sample_position() {return this.ptr.get(LAYOUT__chroma_sample_position, OFFSET__chroma_sample_position);}
    public void chroma_sample_position(int value) {this.ptr.set(LAYOUT__chroma_sample_position, OFFSET__chroma_sample_position, value);}
    public java.lang.foreign.MemorySegment $chroma_sample_position() {return this.ptr.asSlice(OFFSET__chroma_sample_position, LAYOUT__chroma_sample_position);}
}
