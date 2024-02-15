package assimp;

public record aiFileIO(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$OpenProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$OpenProc = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$CloseProc = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$CloseProc = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$UserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$UserData = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$OpenProc,
            LAYOUT$CloseProc,
            LAYOUT$UserData
    ).withName("aiFileIO");

    public aiFileIO(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiFileIO getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiFileIO(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment OpenProc() {return this.ptr.get(LAYOUT$OpenProc, OFFSET$OpenProc);}
    public void OpenProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$OpenProc, OFFSET$OpenProc, value);}
    public java.lang.foreign.MemorySegment OpenProc_ptr() {return this.ptr.asSlice(OFFSET$OpenProc, LAYOUT$OpenProc);}

    public java.lang.foreign.MemorySegment CloseProc() {return this.ptr.get(LAYOUT$CloseProc, OFFSET$CloseProc);}
    public void CloseProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$CloseProc, OFFSET$CloseProc, value);}
    public java.lang.foreign.MemorySegment CloseProc_ptr() {return this.ptr.asSlice(OFFSET$CloseProc, LAYOUT$CloseProc);}

    public java.lang.foreign.MemorySegment UserData() {return this.ptr.get(LAYOUT$UserData, OFFSET$UserData);}
    public void UserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$UserData, OFFSET$UserData, value);}
    public java.lang.foreign.MemorySegment UserData_ptr() {return this.ptr.asSlice(OFFSET$UserData, LAYOUT$UserData);}
}
