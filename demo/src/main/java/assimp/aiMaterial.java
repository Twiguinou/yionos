package assimp;

public record aiMaterial(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__mProperties = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("mProperties");
    public static final long OFFSET__mProperties = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumProperties = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumProperties");
    public static final long OFFSET__mNumProperties = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__mNumAllocated = java.lang.foreign.ValueLayout.JAVA_INT.withName("mNumAllocated");
    public static final long OFFSET__mNumAllocated = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__mProperties,
            LAYOUT__mNumProperties,
            LAYOUT__mNumAllocated
    ).withByteAlignment(8).withName("aiMaterial");

    public aiMaterial(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMaterial getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMaterial(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMaterial value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment mProperties() {return this.ptr.get(LAYOUT__mProperties, OFFSET__mProperties);}
    public void mProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__mProperties, OFFSET__mProperties, value);}
    public java.lang.foreign.MemorySegment $mProperties() {return this.ptr.asSlice(OFFSET__mProperties, LAYOUT__mProperties);}

    public int mNumProperties() {return this.ptr.get(LAYOUT__mNumProperties, OFFSET__mNumProperties);}
    public void mNumProperties(int value) {this.ptr.set(LAYOUT__mNumProperties, OFFSET__mNumProperties, value);}
    public java.lang.foreign.MemorySegment $mNumProperties() {return this.ptr.asSlice(OFFSET__mNumProperties, LAYOUT__mNumProperties);}

    public int mNumAllocated() {return this.ptr.get(LAYOUT__mNumAllocated, OFFSET__mNumAllocated);}
    public void mNumAllocated(int value) {this.ptr.set(LAYOUT__mNumAllocated, OFFSET__mNumAllocated, value);}
    public java.lang.foreign.MemorySegment $mNumAllocated() {return this.ptr.asSlice(OFFSET__mNumAllocated, LAYOUT__mNumAllocated);}
}
