package assimp;

public record aiPropertyStore(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__sentinel = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("sentinel");
    public static final long OFFSET__sentinel = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sentinel
    ).withByteAlignment(1).withName("aiPropertyStore");

    public aiPropertyStore(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiPropertyStore getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiPropertyStore(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiPropertyStore value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public byte sentinel() {return this.ptr.get(LAYOUT__sentinel, OFFSET__sentinel);}
    public void sentinel(byte value) {this.ptr.set(LAYOUT__sentinel, OFFSET__sentinel, value);}
    public java.lang.foreign.MemorySegment $sentinel() {return this.ptr.asSlice(OFFSET__sentinel, LAYOUT__sentinel);}
}
