package vulkan;

public record VkVideoSessionParametersCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__videoSessionParametersTemplate = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__videoSessionParametersTemplate = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__videoSession = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__videoSession = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__videoSessionParametersTemplate,
            LAYOUT__videoSession
    ).withByteAlignment(8).withName("VkVideoSessionParametersCreateInfoKHR");

    public VkVideoSessionParametersCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkVideoSessionParametersCreateInfoKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkVideoSessionParametersCreateInfoKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkVideoSessionParametersCreateInfoKHR value)
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

    public java.lang.foreign.MemorySegment videoSessionParametersTemplate() {return this.ptr.get(LAYOUT__videoSessionParametersTemplate, OFFSET__videoSessionParametersTemplate);}
    public void videoSessionParametersTemplate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__videoSessionParametersTemplate, OFFSET__videoSessionParametersTemplate, value);}
    public java.lang.foreign.MemorySegment $videoSessionParametersTemplate() {return this.ptr.asSlice(OFFSET__videoSessionParametersTemplate, LAYOUT__videoSessionParametersTemplate);}

    public java.lang.foreign.MemorySegment videoSession() {return this.ptr.get(LAYOUT__videoSession, OFFSET__videoSession);}
    public void videoSession(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__videoSession, OFFSET__videoSession, value);}
    public java.lang.foreign.MemorySegment $videoSession() {return this.ptr.asSlice(OFFSET__videoSession, LAYOUT__videoSession);}
}
