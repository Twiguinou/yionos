package assimp;

public record aiTexture(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mWidth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mWidth = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mHeight = 4L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$achFormatHint = java.lang.foreign.MemoryLayout.sequenceLayout(9, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$achFormatHint = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pcData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pcData = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mFilename = assimp.aiString.gStructLayout;
    public static final long OFFSET$mFilename = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mWidth,
            LAYOUT$mHeight,
            LAYOUT$achFormatHint,
            java.lang.foreign.MemoryLayout.paddingLayout(7),
            LAYOUT$pcData,
            LAYOUT$mFilename,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("aiTexture");

    public aiTexture(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiTexture getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiTexture(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int mWidth() {return this.ptr.get(LAYOUT$mWidth, OFFSET$mWidth);}
    public void mWidth(int value) {this.ptr.set(LAYOUT$mWidth, OFFSET$mWidth, value);}
    public java.lang.foreign.MemorySegment mWidth_ptr() {return this.ptr.asSlice(OFFSET$mWidth, LAYOUT$mWidth);}

    public int mHeight() {return this.ptr.get(LAYOUT$mHeight, OFFSET$mHeight);}
    public void mHeight(int value) {this.ptr.set(LAYOUT$mHeight, OFFSET$mHeight, value);}
    public java.lang.foreign.MemorySegment mHeight_ptr() {return this.ptr.asSlice(OFFSET$mHeight, LAYOUT$mHeight);}

    public java.lang.foreign.MemorySegment achFormatHint() {return this.ptr.asSlice(OFFSET$achFormatHint, LAYOUT$achFormatHint);}
    public char achFormatHint(int i) {return (char)this.achFormatHint().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void achFormatHint(int i, char value) {this.achFormatHint().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment pcData() {return this.ptr.get(LAYOUT$pcData, OFFSET$pcData);}
    public void pcData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pcData, OFFSET$pcData, value);}
    public java.lang.foreign.MemorySegment pcData_ptr() {return this.ptr.asSlice(OFFSET$pcData, LAYOUT$pcData);}

    public assimp.aiString mFilename() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mFilename, LAYOUT$mFilename));}
    public void mFilename(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mFilename());}
    public void mFilename(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mFilename, LAYOUT$mFilename.byteSize());}
}
