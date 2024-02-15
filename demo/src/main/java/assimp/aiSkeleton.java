package assimp;

public record aiSkeleton(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumBones = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumBones = 1028L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mBones = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mBones = 1032L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            LAYOUT$mNumBones,
            LAYOUT$mBones
    ).withName("aiSkeleton");

    public aiSkeleton(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiSkeleton getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiSkeleton(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public int mNumBones() {return this.ptr.get(LAYOUT$mNumBones, OFFSET$mNumBones);}
    public void mNumBones(int value) {this.ptr.set(LAYOUT$mNumBones, OFFSET$mNumBones, value);}
    public java.lang.foreign.MemorySegment mNumBones_ptr() {return this.ptr.asSlice(OFFSET$mNumBones, LAYOUT$mNumBones);}

    public java.lang.foreign.MemorySegment mBones() {return this.ptr.get(LAYOUT$mBones, OFFSET$mBones);}
    public void mBones(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mBones, OFFSET$mBones, value);}
    public java.lang.foreign.MemorySegment mBones_ptr() {return this.ptr.asSlice(OFFSET$mBones, LAYOUT$mBones);}
}
