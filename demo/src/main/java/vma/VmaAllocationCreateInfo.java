package vma;

public record VmaAllocationCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__usage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__usage = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__requiredFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__requiredFlags = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__preferredFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__preferredFlags = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__memoryTypeBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__memoryTypeBits = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pool = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pool = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pUserData = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pUserData = 32;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__priority = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__priority = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__usage,
            LAYOUT__requiredFlags,
            LAYOUT__preferredFlags,
            LAYOUT__memoryTypeBits,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pool,
            LAYOUT__pUserData,
            LAYOUT__priority,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VmaAllocationCreateInfo");

    public VmaAllocationCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaAllocationCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaAllocationCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaAllocationCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public int usage() {return this.ptr.get(LAYOUT__usage, OFFSET__usage);}
    public void usage(int value) {this.ptr.set(LAYOUT__usage, OFFSET__usage, value);}
    public java.lang.foreign.MemorySegment $usage() {return this.ptr.asSlice(OFFSET__usage, LAYOUT__usage);}

    public int requiredFlags() {return this.ptr.get(LAYOUT__requiredFlags, OFFSET__requiredFlags);}
    public void requiredFlags(int value) {this.ptr.set(LAYOUT__requiredFlags, OFFSET__requiredFlags, value);}
    public java.lang.foreign.MemorySegment $requiredFlags() {return this.ptr.asSlice(OFFSET__requiredFlags, LAYOUT__requiredFlags);}

    public int preferredFlags() {return this.ptr.get(LAYOUT__preferredFlags, OFFSET__preferredFlags);}
    public void preferredFlags(int value) {this.ptr.set(LAYOUT__preferredFlags, OFFSET__preferredFlags, value);}
    public java.lang.foreign.MemorySegment $preferredFlags() {return this.ptr.asSlice(OFFSET__preferredFlags, LAYOUT__preferredFlags);}

    public int memoryTypeBits() {return this.ptr.get(LAYOUT__memoryTypeBits, OFFSET__memoryTypeBits);}
    public void memoryTypeBits(int value) {this.ptr.set(LAYOUT__memoryTypeBits, OFFSET__memoryTypeBits, value);}
    public java.lang.foreign.MemorySegment $memoryTypeBits() {return this.ptr.asSlice(OFFSET__memoryTypeBits, LAYOUT__memoryTypeBits);}

    public java.lang.foreign.MemorySegment pool() {return this.ptr.get(LAYOUT__pool, OFFSET__pool);}
    public void pool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pool, OFFSET__pool, value);}
    public java.lang.foreign.MemorySegment $pool() {return this.ptr.asSlice(OFFSET__pool, LAYOUT__pool);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT__pUserData, OFFSET__pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pUserData, OFFSET__pUserData, value);}
    public java.lang.foreign.MemorySegment $pUserData() {return this.ptr.asSlice(OFFSET__pUserData, LAYOUT__pUserData);}

    public float priority() {return this.ptr.get(LAYOUT__priority, OFFSET__priority);}
    public void priority(float value) {this.ptr.set(LAYOUT__priority, OFFSET__priority, value);}
    public java.lang.foreign.MemorySegment $priority() {return this.ptr.asSlice(OFFSET__priority, LAYOUT__priority);}
}
