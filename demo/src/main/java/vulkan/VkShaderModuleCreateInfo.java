package vulkan;

public record VkShaderModuleCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__codeSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__codeSize = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCode = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pCode = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__codeSize,
            LAYOUT__pCode
    ).withByteAlignment(8).withName("VkShaderModuleCreateInfo");

    public VkShaderModuleCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkShaderModuleCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkShaderModuleCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkShaderModuleCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int flags() {return this.ptr.get(LAYOUT__flags, OFFSET__flags);}
    public void flags(int value) {this.ptr.set(LAYOUT__flags, OFFSET__flags, value);}
    public java.lang.foreign.MemorySegment $flags() {return this.ptr.asSlice(OFFSET__flags, LAYOUT__flags);}

    public long codeSize() {return this.ptr.get(LAYOUT__codeSize, OFFSET__codeSize);}
    public void codeSize(long value) {this.ptr.set(LAYOUT__codeSize, OFFSET__codeSize, value);}
    public java.lang.foreign.MemorySegment $codeSize() {return this.ptr.asSlice(OFFSET__codeSize, LAYOUT__codeSize);}

    public java.lang.foreign.MemorySegment pCode() {return this.ptr.get(LAYOUT__pCode, OFFSET__pCode);}
    public void pCode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCode, OFFSET__pCode, value);}
    public java.lang.foreign.MemorySegment $pCode() {return this.ptr.asSlice(OFFSET__pCode, LAYOUT__pCode);}
}
