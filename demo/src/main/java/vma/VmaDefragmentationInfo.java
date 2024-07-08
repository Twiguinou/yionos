package vma;

public record VmaDefragmentationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pool = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pool");
    public static final long OFFSET__pool = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__maxBytesPerPass = java.lang.foreign.ValueLayout.JAVA_LONG.withName("maxBytesPerPass");
    public static final long OFFSET__maxBytesPerPass = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__maxAllocationsPerPass = java.lang.foreign.ValueLayout.JAVA_INT.withName("maxAllocationsPerPass");
    public static final long OFFSET__maxAllocationsPerPass = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pfnBreakCallback = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pfnBreakCallback");
    public static final long OFFSET__pfnBreakCallback = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pBreakCallbackUserData = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pBreakCallbackUserData");
    public static final long OFFSET__pBreakCallbackUserData = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pool,
            LAYOUT__maxBytesPerPass,
            LAYOUT__maxAllocationsPerPass,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pfnBreakCallback,
            LAYOUT__pBreakCallbackUserData
    ).withByteAlignment(8).withName("VmaDefragmentationInfo");

    public VmaDefragmentationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VmaDefragmentationInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VmaDefragmentationInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VmaDefragmentationInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public java.lang.foreign.MemorySegment pool() {return this.ptr.get(LAYOUT__pool, OFFSET__pool);}
    public void pool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pool, OFFSET__pool, value);}
    public java.lang.foreign.MemorySegment $pool() {return this.ptr.asSlice(OFFSET__pool, LAYOUT__pool);}

    public long maxBytesPerPass() {return this.ptr.get(LAYOUT__maxBytesPerPass, OFFSET__maxBytesPerPass);}
    public void maxBytesPerPass(long value) {this.ptr.set(LAYOUT__maxBytesPerPass, OFFSET__maxBytesPerPass, value);}
    public java.lang.foreign.MemorySegment $maxBytesPerPass() {return this.ptr.asSlice(OFFSET__maxBytesPerPass, LAYOUT__maxBytesPerPass);}

    public int maxAllocationsPerPass() {return this.ptr.get(LAYOUT__maxAllocationsPerPass, OFFSET__maxAllocationsPerPass);}
    public void maxAllocationsPerPass(int value) {this.ptr.set(LAYOUT__maxAllocationsPerPass, OFFSET__maxAllocationsPerPass, value);}
    public java.lang.foreign.MemorySegment $maxAllocationsPerPass() {return this.ptr.asSlice(OFFSET__maxAllocationsPerPass, LAYOUT__maxAllocationsPerPass);}

    public java.lang.foreign.MemorySegment pfnBreakCallback() {return this.ptr.get(LAYOUT__pfnBreakCallback, OFFSET__pfnBreakCallback);}
    public void pfnBreakCallback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pfnBreakCallback, OFFSET__pfnBreakCallback, value);}
    public java.lang.foreign.MemorySegment $pfnBreakCallback() {return this.ptr.asSlice(OFFSET__pfnBreakCallback, LAYOUT__pfnBreakCallback);}

    public java.lang.foreign.MemorySegment pBreakCallbackUserData() {return this.ptr.get(LAYOUT__pBreakCallbackUserData, OFFSET__pBreakCallbackUserData);}
    public void pBreakCallbackUserData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pBreakCallbackUserData, OFFSET__pBreakCallbackUserData, value);}
    public java.lang.foreign.MemorySegment $pBreakCallbackUserData() {return this.ptr.asSlice(OFFSET__pBreakCallbackUserData, LAYOUT__pBreakCallbackUserData);}
}
