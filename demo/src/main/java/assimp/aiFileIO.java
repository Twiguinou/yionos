package assimp;

public record aiFileIO(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__OpenProc = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("OpenProc");
    public static final long OFFSET__OpenProc = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__CloseProc = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("CloseProc");
    public static final long OFFSET__CloseProc = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__UserData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("UserData");
    public static final long OFFSET__UserData = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__OpenProc,
            LAYOUT__CloseProc,
            LAYOUT__UserData
    ).withByteAlignment(8).withName("aiFileIO");

    public aiFileIO(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiFileIO getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiFileIO(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiFileIO value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment OpenProc() {return this.ptr.get(LAYOUT__OpenProc, OFFSET__OpenProc);}
    public void OpenProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__OpenProc, OFFSET__OpenProc, value);}
    public java.lang.foreign.MemorySegment $OpenProc() {return this.ptr.asSlice(OFFSET__OpenProc, LAYOUT__OpenProc);}

    public java.lang.foreign.MemorySegment CloseProc() {return this.ptr.get(LAYOUT__CloseProc, OFFSET__CloseProc);}
    public void CloseProc(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__CloseProc, OFFSET__CloseProc, value);}
    public java.lang.foreign.MemorySegment $CloseProc() {return this.ptr.asSlice(OFFSET__CloseProc, LAYOUT__CloseProc);}

    public java.lang.foreign.MemorySegment UserData() {return this.ptr.get(LAYOUT__UserData, OFFSET__UserData);}
    public void UserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__UserData, OFFSET__UserData, value);}
    public java.lang.foreign.MemorySegment $UserData() {return this.ptr.asSlice(OFFSET__UserData, LAYOUT__UserData);}
}
