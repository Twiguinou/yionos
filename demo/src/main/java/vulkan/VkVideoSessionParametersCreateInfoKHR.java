package vulkan;

public record VkVideoSessionParametersCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$videoSessionParametersTemplate = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$videoSessionParametersTemplate = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$videoSession = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$videoSession = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$videoSessionParametersTemplate,
            LAYOUT$videoSession
    ).withName("VkVideoSessionParametersCreateInfoKHR");

    public VkVideoSessionParametersCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkVideoSessionParametersCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkVideoSessionParametersCreateInfoKHR(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment videoSessionParametersTemplate() {return this.ptr.get(LAYOUT$videoSessionParametersTemplate, OFFSET$videoSessionParametersTemplate);}
    public void videoSessionParametersTemplate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$videoSessionParametersTemplate, OFFSET$videoSessionParametersTemplate, value);}
    public java.lang.foreign.MemorySegment videoSessionParametersTemplate_ptr() {return this.ptr.asSlice(OFFSET$videoSessionParametersTemplate, LAYOUT$videoSessionParametersTemplate);}

    public java.lang.foreign.MemorySegment videoSession() {return this.ptr.get(LAYOUT$videoSession, OFFSET$videoSession);}
    public void videoSession(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$videoSession, OFFSET$videoSession, value);}
    public java.lang.foreign.MemorySegment videoSession_ptr() {return this.ptr.asSlice(OFFSET$videoSession, LAYOUT$videoSession);}
}