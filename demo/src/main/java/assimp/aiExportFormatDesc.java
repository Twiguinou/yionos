package assimp;

public record aiExportFormatDesc(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$id = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$id = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$description = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$description = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$fileExtension = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$fileExtension = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$id,
            LAYOUT$description,
            LAYOUT$fileExtension
    ).withName("aiExportFormatDesc");

    public aiExportFormatDesc(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiExportFormatDesc getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiExportFormatDesc(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment id() {return this.ptr.get(LAYOUT$id, OFFSET$id);}
    public void id(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$id, OFFSET$id, value);}
    public java.lang.foreign.MemorySegment id_ptr() {return this.ptr.asSlice(OFFSET$id, LAYOUT$id);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.get(LAYOUT$description, OFFSET$description);}
    public void description(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$description, OFFSET$description, value);}
    public java.lang.foreign.MemorySegment description_ptr() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}

    public java.lang.foreign.MemorySegment fileExtension() {return this.ptr.get(LAYOUT$fileExtension, OFFSET$fileExtension);}
    public void fileExtension(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$fileExtension, OFFSET$fileExtension, value);}
    public java.lang.foreign.MemorySegment fileExtension_ptr() {return this.ptr.asSlice(OFFSET$fileExtension, LAYOUT$fileExtension);}
}
