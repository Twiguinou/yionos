package assimp;

public record aiSkeleton(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mName = assimp.aiString.gRecordLayout.withName("mName");
    public static final long OFFSET__mName = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumBones = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumBones");
    public static final long OFFSET__mNumBones = 1028;
    public static final java.lang.foreign.AddressLayout LAYOUT__mBones = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mBones");
    public static final long OFFSET__mBones = 1032;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mName,
            LAYOUT__mNumBones,
            LAYOUT__mBones
    ).withByteAlignment(8).withName("aiSkeleton");

    public aiSkeleton(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiSkeleton getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiSkeleton(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiSkeleton value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiString mName() {return new assimp.aiString(this.ptr.asSlice(OFFSET__mName, LAYOUT__mName));}
    public void mName(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.mName());}
    public void mName(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mName, LAYOUT__mName.byteSize());}

    public int mNumBones() {return this.ptr.get(LAYOUT__mNumBones, OFFSET__mNumBones);}
    public void mNumBones(int value) {this.ptr.set(LAYOUT__mNumBones, OFFSET__mNumBones, value);}
    public java.lang.foreign.MemorySegment $mNumBones() {return this.ptr.asSlice(OFFSET__mNumBones, LAYOUT__mNumBones);}

    public java.lang.foreign.MemorySegment mBones() {return this.ptr.get(LAYOUT__mBones, OFFSET__mBones);}
    public void mBones(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mBones, OFFSET__mBones, value);}
    public java.lang.foreign.MemorySegment $mBones() {return this.ptr.asSlice(OFFSET__mBones, LAYOUT__mBones);}
}
