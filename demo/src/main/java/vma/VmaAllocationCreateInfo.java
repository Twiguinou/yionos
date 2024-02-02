package vma;

public record VmaAllocationCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$usage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$usage = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$requiredFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$requiredFlags = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preferredFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preferredFlags = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryTypeBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryTypeBits = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pool = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pool = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pUserData = 32L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$priority = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$priority = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$usage,
            LAYOUT$requiredFlags,
            LAYOUT$preferredFlags,
            LAYOUT$memoryTypeBits,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pool,
            LAYOUT$pUserData,
            LAYOUT$priority,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VmaAllocationCreateInfo");

    public VmaAllocationCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaAllocationCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaAllocationCreateInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int usage() {return this.ptr.get(LAYOUT$usage, OFFSET$usage);}
    public void usage(int value) {this.ptr.set(LAYOUT$usage, OFFSET$usage, value);}
    public java.lang.foreign.MemorySegment usage_ptr() {return this.ptr.asSlice(OFFSET$usage, LAYOUT$usage);}

    public int requiredFlags() {return this.ptr.get(LAYOUT$requiredFlags, OFFSET$requiredFlags);}
    public void requiredFlags(int value) {this.ptr.set(LAYOUT$requiredFlags, OFFSET$requiredFlags, value);}
    public java.lang.foreign.MemorySegment requiredFlags_ptr() {return this.ptr.asSlice(OFFSET$requiredFlags, LAYOUT$requiredFlags);}

    public int preferredFlags() {return this.ptr.get(LAYOUT$preferredFlags, OFFSET$preferredFlags);}
    public void preferredFlags(int value) {this.ptr.set(LAYOUT$preferredFlags, OFFSET$preferredFlags, value);}
    public java.lang.foreign.MemorySegment preferredFlags_ptr() {return this.ptr.asSlice(OFFSET$preferredFlags, LAYOUT$preferredFlags);}

    public int memoryTypeBits() {return this.ptr.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);}
    public void memoryTypeBits(int value) {this.ptr.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);}
    public java.lang.foreign.MemorySegment memoryTypeBits_ptr() {return this.ptr.asSlice(OFFSET$memoryTypeBits, LAYOUT$memoryTypeBits);}

    public java.lang.foreign.MemorySegment pool() {return this.ptr.get(LAYOUT$pool, OFFSET$pool);}
    public void pool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pool, OFFSET$pool, value);}
    public java.lang.foreign.MemorySegment pool_ptr() {return this.ptr.asSlice(OFFSET$pool, LAYOUT$pool);}

    public java.lang.foreign.MemorySegment pUserData() {return this.ptr.get(LAYOUT$pUserData, OFFSET$pUserData);}
    public void pUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUserData, OFFSET$pUserData, value);}
    public java.lang.foreign.MemorySegment pUserData_ptr() {return this.ptr.asSlice(OFFSET$pUserData, LAYOUT$pUserData);}

    public float priority() {return this.ptr.get(LAYOUT$priority, OFFSET$priority);}
    public void priority(float value) {this.ptr.set(LAYOUT$priority, OFFSET$priority, value);}
    public java.lang.foreign.MemorySegment priority_ptr() {return this.ptr.asSlice(OFFSET$priority, LAYOUT$priority);}
}
