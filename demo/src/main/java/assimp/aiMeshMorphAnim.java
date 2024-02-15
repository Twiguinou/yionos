package assimp;

public record aiMeshMorphAnim(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mName = assimp.aiString.gStructLayout;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumKeys = 1028L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mKeys = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mKeys = 1032L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            LAYOUT$mNumKeys,
            LAYOUT$mKeys
    ).withName("aiMeshMorphAnim");

    public aiMeshMorphAnim(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMeshMorphAnim getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMeshMorphAnim(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET$mName, LAYOUT$mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mName, LAYOUT$mName.byteSize());}

    public int mNumKeys() {return this.ptr.get(LAYOUT$mNumKeys, OFFSET$mNumKeys);}
    public void mNumKeys(int value) {this.ptr.set(LAYOUT$mNumKeys, OFFSET$mNumKeys, value);}
    public java.lang.foreign.MemorySegment mNumKeys_ptr() {return this.ptr.asSlice(OFFSET$mNumKeys, LAYOUT$mNumKeys);}

    public java.lang.foreign.MemorySegment mKeys() {return this.ptr.get(LAYOUT$mKeys, OFFSET$mKeys);}
    public void mKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mKeys, OFFSET$mKeys, value);}
    public java.lang.foreign.MemorySegment mKeys_ptr() {return this.ptr.asSlice(OFFSET$mKeys, LAYOUT$mKeys);}
}
