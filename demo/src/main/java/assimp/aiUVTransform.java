package assimp;

public record aiUVTransform(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mTranslation = assimp.aiVector2D.gRecordLayout;
    public static final long OFFSET__mTranslation = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__mScaling = assimp.aiVector2D.gRecordLayout;
    public static final long OFFSET__mScaling = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__mRotation = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__mRotation = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mTranslation,
            LAYOUT__mScaling,
            LAYOUT__mRotation
    ).withByteAlignment(4).withName("aiUVTransform");

    public aiUVTransform(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiUVTransform getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiUVTransform(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiUVTransform value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiVector2D mTranslation() {return new assimp.aiVector2D(this.ptr.asSlice(OFFSET__mTranslation, LAYOUT__mTranslation));}
    public void mTranslation(java.util.function.Consumer<assimp.aiVector2D> consumer) {consumer.accept(this.mTranslation());}
    public void mTranslation(assimp.aiVector2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mTranslation, LAYOUT__mTranslation.byteSize());}

    public assimp.aiVector2D mScaling() {return new assimp.aiVector2D(this.ptr.asSlice(OFFSET__mScaling, LAYOUT__mScaling));}
    public void mScaling(java.util.function.Consumer<assimp.aiVector2D> consumer) {consumer.accept(this.mScaling());}
    public void mScaling(assimp.aiVector2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mScaling, LAYOUT__mScaling.byteSize());}

    public float mRotation() {return this.ptr.get(LAYOUT__mRotation, OFFSET__mRotation);}
    public void mRotation(float value) {this.ptr.set(LAYOUT__mRotation, OFFSET__mRotation, value);}
    public java.lang.foreign.MemorySegment $mRotation() {return this.ptr.asSlice(OFFSET__mRotation, LAYOUT__mRotation);}
}
