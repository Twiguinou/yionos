package assimp;

public record aiString(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__length = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__length = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__data = java.lang.foreign.MemoryLayout.sequenceLayout(1024, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__data = 4;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__length,
            LAYOUT__data
    ).withByteAlignment(4).withName("aiString");

    public aiString(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiString getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiString(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiString value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int length() {return this.ptr.get(LAYOUT__length, OFFSET__length);}
    public void length(int value) {this.ptr.set(LAYOUT__length, OFFSET__length, value);}
    public java.lang.foreign.MemorySegment $length() {return this.ptr.asSlice(OFFSET__length, LAYOUT__length);}

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}
    public byte data(int index) {return this.data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void data(int index, byte value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
