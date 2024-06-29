package assimp;

public record aiMeshMorphAnim(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout;
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumKeys = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__mNumKeys = 1028;
    public static final java.lang.foreign.AddressLayout LAYOUT__mKeys = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__mKeys = 1032;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            LAYOUT__mNumKeys,
            LAYOUT__mKeys
    ).withByteAlignment(8).withName("aiMeshMorphAnim");

    public aiMeshMorphAnim(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMeshMorphAnim getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMeshMorphAnim(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMeshMorphAnim value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public int mNumKeys() {return this.ptr.get(LAYOUT__mNumKeys, OFFSET__mNumKeys);}
    public void mNumKeys(int value) {this.ptr.set(LAYOUT__mNumKeys, OFFSET__mNumKeys, value);}
    public java.lang.foreign.MemorySegment $mNumKeys() {return this.ptr.asSlice(OFFSET__mNumKeys, LAYOUT__mNumKeys);}

    public java.lang.foreign.MemorySegment mKeys() {return this.ptr.get(LAYOUT__mKeys, OFFSET__mKeys);}
    public void mKeys(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mKeys, OFFSET__mKeys, value);}
    public java.lang.foreign.MemorySegment $mKeys() {return this.ptr.asSlice(OFFSET__mKeys, LAYOUT__mKeys);}
}
