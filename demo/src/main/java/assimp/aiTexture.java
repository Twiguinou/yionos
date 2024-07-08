package assimp;

public record aiTexture(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mWidth = java.lang.foreign.ValueLayout.JAVA_INT.withName("mWidth");
    public static final long OFFSET__mWidth = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mHeight = java.lang.foreign.ValueLayout.JAVA_INT.withName("mHeight");
    public static final long OFFSET__mHeight = 4;
    public static final java.lang.foreign.SequenceLayout LAYOUT__achFormatHint = java.lang.foreign.MemoryLayout.sequenceLayout(9, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("achFormatHint");
    public static final long OFFSET__achFormatHint = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__pcData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pcData");
    public static final long OFFSET__pcData = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__mFilename = assimp.aiString.gRecordLayout.withName("mFilename");
    public static final long OFFSET__mFilename = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mWidth,
            LAYOUT__mHeight,
            LAYOUT__achFormatHint,
            java.lang.foreign.MemoryLayout.paddingLayout(7),
            LAYOUT__pcData,
            LAYOUT__mFilename,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("aiTexture");

    public aiTexture(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiTexture getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiTexture(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiTexture value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int mWidth() {return this.ptr.get(LAYOUT__mWidth, OFFSET__mWidth);}
    public void mWidth(int value) {this.ptr.set(LAYOUT__mWidth, OFFSET__mWidth, value);}
    public java.lang.foreign.MemorySegment $mWidth() {return this.ptr.asSlice(OFFSET__mWidth, LAYOUT__mWidth);}

    public int mHeight() {return this.ptr.get(LAYOUT__mHeight, OFFSET__mHeight);}
    public void mHeight(int value) {this.ptr.set(LAYOUT__mHeight, OFFSET__mHeight, value);}
    public java.lang.foreign.MemorySegment $mHeight() {return this.ptr.asSlice(OFFSET__mHeight, LAYOUT__mHeight);}

    public java.lang.foreign.MemorySegment achFormatHint() {return this.ptr.asSlice(OFFSET__achFormatHint, LAYOUT__achFormatHint);}
    public byte achFormatHint(int index) {return this.achFormatHint().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void achFormatHint(int index, byte value) {this.achFormatHint().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment pcData() {return this.ptr.get(LAYOUT__pcData, OFFSET__pcData);}
    public void pcData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pcData, OFFSET__pcData, value);}
    public java.lang.foreign.MemorySegment $pcData() {return this.ptr.asSlice(OFFSET__pcData, LAYOUT__pcData);}

    public assimp.aiString mFilename() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mFilename, LAYOUT__mFilename));}
    public void mFilename(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mFilename());}
    public void mFilename(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mFilename, LAYOUT__mFilename.byteSize());}
}
