package assimp;

public record aiRay(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__pos = assimp.aiVector3D.gRecordLayout;
    public static final long OFFSET__pos = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__dir = assimp.aiVector3D.gRecordLayout;
    public static final long OFFSET__dir = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__pos,
            LAYOUT__dir
    ).withByteAlignment(4).withName("aiRay");

    public aiRay(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiRay getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiRay(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiRay value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public assimp.aiVector3D pos() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__pos, LAYOUT__pos));}
    public void pos(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.pos());}
    public void pos(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__pos, LAYOUT__pos.byteSize());}

    public assimp.aiVector3D dir() {return new assimp.aiVector3D(this.ptr.asSlice(OFFSET__dir, LAYOUT__dir));}
    public void dir(java.util.function.Consumer<assimp.aiVector3D> consumer) {consumer.accept(this.dir());}
    public void dir(assimp.aiVector3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__dir, LAYOUT__dir.byteSize());}
}
