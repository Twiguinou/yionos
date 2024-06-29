package vulkan;

public record VkValidationFlagsEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__disabledValidationCheckCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__disabledValidationCheckCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pDisabledValidationChecks = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pDisabledValidationChecks = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__disabledValidationCheckCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pDisabledValidationChecks
    ).withByteAlignment(8).withName("VkValidationFlagsEXT");

    public VkValidationFlagsEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkValidationFlagsEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkValidationFlagsEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkValidationFlagsEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int disabledValidationCheckCount() {return this.ptr.get(LAYOUT__disabledValidationCheckCount, OFFSET__disabledValidationCheckCount);}
    public void disabledValidationCheckCount(int value) {this.ptr.set(LAYOUT__disabledValidationCheckCount, OFFSET__disabledValidationCheckCount, value);}
    public java.lang.foreign.MemorySegment $disabledValidationCheckCount() {return this.ptr.asSlice(OFFSET__disabledValidationCheckCount, LAYOUT__disabledValidationCheckCount);}

    public java.lang.foreign.MemorySegment pDisabledValidationChecks() {return this.ptr.get(LAYOUT__pDisabledValidationChecks, OFFSET__pDisabledValidationChecks);}
    public void pDisabledValidationChecks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pDisabledValidationChecks, OFFSET__pDisabledValidationChecks, value);}
    public java.lang.foreign.MemorySegment $pDisabledValidationChecks() {return this.ptr.asSlice(OFFSET__pDisabledValidationChecks, LAYOUT__pDisabledValidationChecks);}
}
