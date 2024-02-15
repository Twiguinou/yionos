package assimp;

public record aiFile(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$ReadProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ReadProc = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$WriteProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$WriteProc = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$TellProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$TellProc = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$FileSizeProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$FileSizeProc = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$SeekProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$SeekProc = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$FlushProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$FlushProc = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$UserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$UserData = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$ReadProc,
            LAYOUT$WriteProc,
            LAYOUT$TellProc,
            LAYOUT$FileSizeProc,
            LAYOUT$SeekProc,
            LAYOUT$FlushProc,
            LAYOUT$UserData
    ).withName("aiFile");

    public aiFile(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiFile getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiFile(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment ReadProc() {return this.ptr.get(LAYOUT$ReadProc, OFFSET$ReadProc);}
    public void ReadProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ReadProc, OFFSET$ReadProc, value);}
    public java.lang.foreign.MemorySegment ReadProc_ptr() {return this.ptr.asSlice(OFFSET$ReadProc, LAYOUT$ReadProc);}

    public java.lang.foreign.MemorySegment WriteProc() {return this.ptr.get(LAYOUT$WriteProc, OFFSET$WriteProc);}
    public void WriteProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$WriteProc, OFFSET$WriteProc, value);}
    public java.lang.foreign.MemorySegment WriteProc_ptr() {return this.ptr.asSlice(OFFSET$WriteProc, LAYOUT$WriteProc);}

    public java.lang.foreign.MemorySegment TellProc() {return this.ptr.get(LAYOUT$TellProc, OFFSET$TellProc);}
    public void TellProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$TellProc, OFFSET$TellProc, value);}
    public java.lang.foreign.MemorySegment TellProc_ptr() {return this.ptr.asSlice(OFFSET$TellProc, LAYOUT$TellProc);}

    public java.lang.foreign.MemorySegment FileSizeProc() {return this.ptr.get(LAYOUT$FileSizeProc, OFFSET$FileSizeProc);}
    public void FileSizeProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$FileSizeProc, OFFSET$FileSizeProc, value);}
    public java.lang.foreign.MemorySegment FileSizeProc_ptr() {return this.ptr.asSlice(OFFSET$FileSizeProc, LAYOUT$FileSizeProc);}

    public java.lang.foreign.MemorySegment SeekProc() {return this.ptr.get(LAYOUT$SeekProc, OFFSET$SeekProc);}
    public void SeekProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$SeekProc, OFFSET$SeekProc, value);}
    public java.lang.foreign.MemorySegment SeekProc_ptr() {return this.ptr.asSlice(OFFSET$SeekProc, LAYOUT$SeekProc);}

    public java.lang.foreign.MemorySegment FlushProc() {return this.ptr.get(LAYOUT$FlushProc, OFFSET$FlushProc);}
    public void FlushProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$FlushProc, OFFSET$FlushProc, value);}
    public java.lang.foreign.MemorySegment FlushProc_ptr() {return this.ptr.asSlice(OFFSET$FlushProc, LAYOUT$FlushProc);}

    public java.lang.foreign.MemorySegment UserData() {return this.ptr.get(LAYOUT$UserData, OFFSET$UserData);}
    public void UserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$UserData, OFFSET$UserData, value);}
    public java.lang.foreign.MemorySegment UserData_ptr() {return this.ptr.asSlice(OFFSET$UserData, LAYOUT$UserData);}
}
