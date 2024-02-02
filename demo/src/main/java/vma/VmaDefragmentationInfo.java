package vma;

public record VmaDefragmentationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pool = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pool = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxBytesPerPass = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxBytesPerPass = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxAllocationsPerPass = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxAllocationsPerPass = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pfnBreakCallback = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pfnBreakCallback = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pBreakCallbackUserData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pBreakCallbackUserData = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pool,
            LAYOUT$maxBytesPerPass,
            LAYOUT$maxAllocationsPerPass,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pfnBreakCallback,
            LAYOUT$pBreakCallbackUserData
    ).withName("VmaDefragmentationInfo");

    public VmaDefragmentationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VmaDefragmentationInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VmaDefragmentationInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment pool() {return this.ptr.get(LAYOUT$pool, OFFSET$pool);}
    public void pool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pool, OFFSET$pool, value);}
    public java.lang.foreign.MemorySegment pool_ptr() {return this.ptr.asSlice(OFFSET$pool, LAYOUT$pool);}

    public long maxBytesPerPass() {return this.ptr.get(LAYOUT$maxBytesPerPass, OFFSET$maxBytesPerPass);}
    public void maxBytesPerPass(long value) {this.ptr.set(LAYOUT$maxBytesPerPass, OFFSET$maxBytesPerPass, value);}
    public java.lang.foreign.MemorySegment maxBytesPerPass_ptr() {return this.ptr.asSlice(OFFSET$maxBytesPerPass, LAYOUT$maxBytesPerPass);}

    public int maxAllocationsPerPass() {return this.ptr.get(LAYOUT$maxAllocationsPerPass, OFFSET$maxAllocationsPerPass);}
    public void maxAllocationsPerPass(int value) {this.ptr.set(LAYOUT$maxAllocationsPerPass, OFFSET$maxAllocationsPerPass, value);}
    public java.lang.foreign.MemorySegment maxAllocationsPerPass_ptr() {return this.ptr.asSlice(OFFSET$maxAllocationsPerPass, LAYOUT$maxAllocationsPerPass);}

    public java.lang.foreign.MemorySegment pfnBreakCallback() {return this.ptr.get(LAYOUT$pfnBreakCallback, OFFSET$pfnBreakCallback);}
    public void pfnBreakCallback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pfnBreakCallback, OFFSET$pfnBreakCallback, value);}
    public java.lang.foreign.MemorySegment pfnBreakCallback_ptr() {return this.ptr.asSlice(OFFSET$pfnBreakCallback, LAYOUT$pfnBreakCallback);}

    public java.lang.foreign.MemorySegment pBreakCallbackUserData() {return this.ptr.get(LAYOUT$pBreakCallbackUserData, OFFSET$pBreakCallbackUserData);}
    public void pBreakCallbackUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBreakCallbackUserData, OFFSET$pBreakCallbackUserData, value);}
    public java.lang.foreign.MemorySegment pBreakCallbackUserData_ptr() {return this.ptr.asSlice(OFFSET$pBreakCallbackUserData, LAYOUT$pBreakCallbackUserData);}
}
