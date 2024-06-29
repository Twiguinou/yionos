package assimp;

public record aiFile(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__ReadProc = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__ReadProc = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__WriteProc = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__WriteProc = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__TellProc = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__TellProc = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__FileSizeProc = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__FileSizeProc = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__SeekProc = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__SeekProc = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__FlushProc = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__FlushProc = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__UserData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__UserData = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__ReadProc,
            LAYOUT__WriteProc,
            LAYOUT__TellProc,
            LAYOUT__FileSizeProc,
            LAYOUT__SeekProc,
            LAYOUT__FlushProc,
            LAYOUT__UserData
    ).withByteAlignment(8).withName("aiFile");

    public aiFile(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiFile getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiFile(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiFile value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment ReadProc() {return this.ptr.get(LAYOUT__ReadProc, OFFSET__ReadProc);}
    public void ReadProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ReadProc, OFFSET__ReadProc, value);}
    public java.lang.foreign.MemorySegment $ReadProc() {return this.ptr.asSlice(OFFSET__ReadProc, LAYOUT__ReadProc);}

    public java.lang.foreign.MemorySegment WriteProc() {return this.ptr.get(LAYOUT__WriteProc, OFFSET__WriteProc);}
    public void WriteProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__WriteProc, OFFSET__WriteProc, value);}
    public java.lang.foreign.MemorySegment $WriteProc() {return this.ptr.asSlice(OFFSET__WriteProc, LAYOUT__WriteProc);}

    public java.lang.foreign.MemorySegment TellProc() {return this.ptr.get(LAYOUT__TellProc, OFFSET__TellProc);}
    public void TellProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__TellProc, OFFSET__TellProc, value);}
    public java.lang.foreign.MemorySegment $TellProc() {return this.ptr.asSlice(OFFSET__TellProc, LAYOUT__TellProc);}

    public java.lang.foreign.MemorySegment FileSizeProc() {return this.ptr.get(LAYOUT__FileSizeProc, OFFSET__FileSizeProc);}
    public void FileSizeProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__FileSizeProc, OFFSET__FileSizeProc, value);}
    public java.lang.foreign.MemorySegment $FileSizeProc() {return this.ptr.asSlice(OFFSET__FileSizeProc, LAYOUT__FileSizeProc);}

    public java.lang.foreign.MemorySegment SeekProc() {return this.ptr.get(LAYOUT__SeekProc, OFFSET__SeekProc);}
    public void SeekProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__SeekProc, OFFSET__SeekProc, value);}
    public java.lang.foreign.MemorySegment $SeekProc() {return this.ptr.asSlice(OFFSET__SeekProc, LAYOUT__SeekProc);}

    public java.lang.foreign.MemorySegment FlushProc() {return this.ptr.get(LAYOUT__FlushProc, OFFSET__FlushProc);}
    public void FlushProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__FlushProc, OFFSET__FlushProc, value);}
    public java.lang.foreign.MemorySegment $FlushProc() {return this.ptr.asSlice(OFFSET__FlushProc, LAYOUT__FlushProc);}

    public java.lang.foreign.MemorySegment UserData() {return this.ptr.get(LAYOUT__UserData, OFFSET__UserData);}
    public void UserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__UserData, OFFSET__UserData, value);}
    public java.lang.foreign.MemorySegment $UserData() {return this.ptr.asSlice(OFFSET__UserData, LAYOUT__UserData);}
}
