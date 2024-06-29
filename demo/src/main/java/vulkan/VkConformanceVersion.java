package vulkan;

public record VkConformanceVersion(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__major = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__major = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__minor = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__minor = 1;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__subminor = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__subminor = 2;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__patch = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__patch = 3;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__major,
            LAYOUT__minor,
            LAYOUT__subminor,
            LAYOUT__patch
    ).withByteAlignment(1).withName("VkConformanceVersion");

    public VkConformanceVersion(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkConformanceVersion getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkConformanceVersion(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkConformanceVersion value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public byte major() {return this.ptr.get(LAYOUT__major, OFFSET__major);}
    public void major(byte value) {this.ptr.set(LAYOUT__major, OFFSET__major, value);}
    public java.lang.foreign.MemorySegment $major() {return this.ptr.asSlice(OFFSET__major, LAYOUT__major);}

    public byte minor() {return this.ptr.get(LAYOUT__minor, OFFSET__minor);}
    public void minor(byte value) {this.ptr.set(LAYOUT__minor, OFFSET__minor, value);}
    public java.lang.foreign.MemorySegment $minor() {return this.ptr.asSlice(OFFSET__minor, LAYOUT__minor);}

    public byte subminor() {return this.ptr.get(LAYOUT__subminor, OFFSET__subminor);}
    public void subminor(byte value) {this.ptr.set(LAYOUT__subminor, OFFSET__subminor, value);}
    public java.lang.foreign.MemorySegment $subminor() {return this.ptr.asSlice(OFFSET__subminor, LAYOUT__subminor);}

    public byte patch() {return this.ptr.get(LAYOUT__patch, OFFSET__patch);}
    public void patch(byte value) {this.ptr.set(LAYOUT__patch, OFFSET__patch, value);}
    public java.lang.foreign.MemorySegment $patch() {return this.ptr.asSlice(OFFSET__patch, LAYOUT__patch);}
}
