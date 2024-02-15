package assimp;

public record aiMaterial(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$mProperties = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mProperties = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumProperties = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumProperties = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mNumAllocated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mNumAllocated = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mProperties,
            LAYOUT$mNumProperties,
            LAYOUT$mNumAllocated
    ).withName("aiMaterial");

    public aiMaterial(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMaterial getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMaterial(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment mProperties() {return this.ptr.get(LAYOUT$mProperties, OFFSET$mProperties);}
    public void mProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mProperties, OFFSET$mProperties, value);}
    public java.lang.foreign.MemorySegment mProperties_ptr() {return this.ptr.asSlice(OFFSET$mProperties, LAYOUT$mProperties);}

    public int mNumProperties() {return this.ptr.get(LAYOUT$mNumProperties, OFFSET$mNumProperties);}
    public void mNumProperties(int value) {this.ptr.set(LAYOUT$mNumProperties, OFFSET$mNumProperties, value);}
    public java.lang.foreign.MemorySegment mNumProperties_ptr() {return this.ptr.asSlice(OFFSET$mNumProperties, LAYOUT$mNumProperties);}

    public int mNumAllocated() {return this.ptr.get(LAYOUT$mNumAllocated, OFFSET$mNumAllocated);}
    public void mNumAllocated(int value) {this.ptr.set(LAYOUT$mNumAllocated, OFFSET$mNumAllocated, value);}
    public java.lang.foreign.MemorySegment mNumAllocated_ptr() {return this.ptr.asSlice(OFFSET$mNumAllocated, LAYOUT$mNumAllocated);}
}
