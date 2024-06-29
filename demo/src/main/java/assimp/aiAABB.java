package assimp;

public record aiAABB(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__mMin = assimp.aiVector3D.gRecordLayout;
    public static final long OFFSET__mMin = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__mMax = assimp.aiVector3D.gRecordLayout;
    public static final long OFFSET__mMax = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mMin,
            LAYOUT__mMax
    ).withByteAlignment(4).withName("aiAABB");

    public aiAABB(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiAABB getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiAABB(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiAABB value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiVector3D mMin() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mMin, LAYOUT__mMin));}
    public void mMin(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mMin());}
    public void mMin(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mMin, LAYOUT__mMin.byteSize());}

    public assimp.aiVector3D mMax() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__mMax, LAYOUT__mMax));}
    public void mMax(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mMax());}
    public void mMax(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__mMax, LAYOUT__mMax.byteSize());}
}
