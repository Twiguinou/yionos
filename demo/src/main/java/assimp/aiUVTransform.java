package assimp;

public record aiUVTransform(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mTranslation = assimp.aiVector2D.gStructLayout;
    public static final long OFFSET$mTranslation = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mScaling = assimp.aiVector2D.gStructLayout;
    public static final long OFFSET$mScaling = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$mRotation = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$mRotation = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mTranslation,
            LAYOUT$mScaling,
            LAYOUT$mRotation
    ).withName("aiUVTransform");

    public aiUVTransform(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiUVTransform getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiUVTransform(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiVector2D mTranslation() {return new assimp.aiVector2D(this.ptr.asSlice(OFFSET$mTranslation, LAYOUT$mTranslation));}
    public void mTranslation(java.util.function.Consumer<assimp.aiVector2D> consumer) {consumer.accept(this.mTranslation());}
    public void mTranslation(assimp.aiVector2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mTranslation, LAYOUT$mTranslation.byteSize());}

    public assimp.aiVector2D mScaling() {return new assimp.aiVector2D(this.ptr.asSlice(OFFSET$mScaling, LAYOUT$mScaling));}
    public void mScaling(java.util.function.Consumer<assimp.aiVector2D> consumer) {consumer.accept(this.mScaling());}
    public void mScaling(assimp.aiVector2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mScaling, LAYOUT$mScaling.byteSize());}

    public float mRotation() {return this.ptr.get(LAYOUT$mRotation, OFFSET$mRotation);}
    public void mRotation(float value) {this.ptr.set(LAYOUT$mRotation, OFFSET$mRotation, value);}
    public java.lang.foreign.MemorySegment mRotation_ptr() {return this.ptr.asSlice(OFFSET$mRotation, LAYOUT$mRotation);}
}
