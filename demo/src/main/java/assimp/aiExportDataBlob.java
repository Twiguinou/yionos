package assimp;

public record aiExportDataBlob(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$data = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$data = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$name = assimp.aiString.gStructLayout;
    public static final long OFFSET$name = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$next = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$next = 1048L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$size,
            LAYOUT$data,
            LAYOUT$name,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$next
    ).withName("aiExportDataBlob");

    public aiExportDataBlob(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiExportDataBlob getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiExportDataBlob(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public java.lang.foreign.MemorySegment data() {return this.ptr.get(LAYOUT$data, OFFSET$data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$data, OFFSET$data, value);}
    public java.lang.foreign.MemorySegment data_ptr() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}

    public assimp.aiString name() {return new assimp.aiString(this.ptr.asSlice(OFFSET$name, LAYOUT$name));}
    public void name(java.util.function.Consumer<assimp.aiString> consumer) {consumer.accept(this.name());}
    public void name(assimp.aiString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$name, LAYOUT$name.byteSize());}

    public java.lang.foreign.MemorySegment next() {return this.ptr.get(LAYOUT$next, OFFSET$next);}
    public void next(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$next, OFFSET$next, value);}
    public java.lang.foreign.MemorySegment next_ptr() {return this.ptr.asSlice(OFFSET$next, LAYOUT$next);}
}
