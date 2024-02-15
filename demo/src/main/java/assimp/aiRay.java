package assimp;

public record aiRay(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$pos = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$pos = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dir = assimp.aiVector3D.gStructLayout;
    public static final long OFFSET$dir = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$pos,
            LAYOUT$dir
    ).withName("aiRay");

    public aiRay(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiRay getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiRay(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public assimp.aiVector3D pos() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$pos, LAYOUT$pos));}
    public void pos(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.pos());}
    public void pos(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$pos, LAYOUT$pos.byteSize());}

    public assimp.aiVector3D dir() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET$dir, LAYOUT$dir));}
    public void dir(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.dir());}
    public void dir(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$dir, LAYOUT$dir.byteSize());}
}
