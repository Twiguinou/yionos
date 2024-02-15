package assimp;

public record aiAABB(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$mMin = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mMin = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$mMax = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$mMax = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mMin,
            LAYOUT$mMax
    ).withName("aiAABB");

    public aiAABB(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiAABB getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiAABB(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiVector3D mMin() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mMin, LAYOUT$mMin));}
    public void mMin(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mMin());}
    public void mMin(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mMin, LAYOUT$mMin.byteSize());}

    public assimp.aiVector3D mMax() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$mMax, LAYOUT$mMax));}
    public void mMax(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.mMax());}
    public void mMax(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$mMax, LAYOUT$mMax.byteSize());}
}
