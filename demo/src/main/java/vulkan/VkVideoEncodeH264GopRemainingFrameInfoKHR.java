package vulkan;

public record VkVideoEncodeH264GopRemainingFrameInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$useGopRemainingFrames = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$useGopRemainingFrames = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$gopRemainingI = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$gopRemainingI = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$gopRemainingP = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$gopRemainingP = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$gopRemainingB = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$gopRemainingB = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$useGopRemainingFrames,
            LAYOUT$gopRemainingI,
            LAYOUT$gopRemainingP,
            LAYOUT$gopRemainingB
    ).withName("VkVideoEncodeH264GopRemainingFrameInfoKHR");

    public VkVideoEncodeH264GopRemainingFrameInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoEncodeH264GopRemainingFrameInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoEncodeH264GopRemainingFrameInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int useGopRemainingFrames() {return this.ptr.get(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames);}
    public void useGopRemainingFrames(int value) {this.ptr.set(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames, value);}
    public java.lang.foreign.MemorySegment useGopRemainingFrames_ptr() {return this.ptr.asSlice(OFFSET$useGopRemainingFrames, LAYOUT$useGopRemainingFrames);}

    public int gopRemainingI() {return this.ptr.get(LAYOUT$gopRemainingI, OFFSET$gopRemainingI);}
    public void gopRemainingI(int value) {this.ptr.set(LAYOUT$gopRemainingI, OFFSET$gopRemainingI, value);}
    public java.lang.foreign.MemorySegment gopRemainingI_ptr() {return this.ptr.asSlice(OFFSET$gopRemainingI, LAYOUT$gopRemainingI);}

    public int gopRemainingP() {return this.ptr.get(LAYOUT$gopRemainingP, OFFSET$gopRemainingP);}
    public void gopRemainingP(int value) {this.ptr.set(LAYOUT$gopRemainingP, OFFSET$gopRemainingP, value);}
    public java.lang.foreign.MemorySegment gopRemainingP_ptr() {return this.ptr.asSlice(OFFSET$gopRemainingP, LAYOUT$gopRemainingP);}

    public int gopRemainingB() {return this.ptr.get(LAYOUT$gopRemainingB, OFFSET$gopRemainingB);}
    public void gopRemainingB(int value) {this.ptr.set(LAYOUT$gopRemainingB, OFFSET$gopRemainingB, value);}
    public java.lang.foreign.MemorySegment gopRemainingB_ptr() {return this.ptr.asSlice(OFFSET$gopRemainingB, LAYOUT$gopRemainingB);}
}
