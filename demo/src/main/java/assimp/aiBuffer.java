package assimp;

public record aiBuffer(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__data = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("data");
    public static final long OFFSET__data = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__end = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("end");
    public static final long OFFSET__end = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__data,
            LAYOUT__end
    ).withByteAlignment(8).withName("aiBuffer");

    public aiBuffer(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiBuffer getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiBuffer(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiBuffer value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment data() {return this.ptr.get(LAYOUT__data, OFFSET__data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__data, OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}

    public java.lang.foreign.MemorySegment end() {return this.ptr.get(LAYOUT__end, OFFSET__end);}
    public void end(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__end, OFFSET__end, value);}
    public java.lang.foreign.MemorySegment $end() {return this.ptr.asSlice(OFFSET__end, LAYOUT__end);}
}
