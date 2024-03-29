package vulkan;

public record VkValidationFlagsEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$disabledValidationCheckCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$disabledValidationCheckCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDisabledValidationChecks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDisabledValidationChecks = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$disabledValidationCheckCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDisabledValidationChecks
    ).withName("VkValidationFlagsEXT");

    public VkValidationFlagsEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkValidationFlagsEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkValidationFlagsEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int disabledValidationCheckCount() {return this.ptr.get(LAYOUT$disabledValidationCheckCount, OFFSET$disabledValidationCheckCount);}
    public void disabledValidationCheckCount(int value) {this.ptr.set(LAYOUT$disabledValidationCheckCount, OFFSET$disabledValidationCheckCount, value);}
    public java.lang.foreign.MemorySegment disabledValidationCheckCount_ptr() {return this.ptr.asSlice(OFFSET$disabledValidationCheckCount, LAYOUT$disabledValidationCheckCount);}

    public java.lang.foreign.MemorySegment pDisabledValidationChecks() {return this.ptr.get(LAYOUT$pDisabledValidationChecks, OFFSET$pDisabledValidationChecks);}
    public void pDisabledValidationChecks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDisabledValidationChecks, OFFSET$pDisabledValidationChecks, value);}
    public java.lang.foreign.MemorySegment pDisabledValidationChecks_ptr() {return this.ptr.asSlice(OFFSET$pDisabledValidationChecks, LAYOUT$pDisabledValidationChecks);}
}
