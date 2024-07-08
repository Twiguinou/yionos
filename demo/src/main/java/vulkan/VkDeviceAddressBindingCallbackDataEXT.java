package vulkan;

public record VkDeviceAddressBindingCallbackDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("flags");
    public static final long OFFSET__flags = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__baseAddress = java.lang.foreign.ValueLayout.JAVA_LONG.withName("baseAddress");
    public static final long OFFSET__baseAddress = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__bindingType = java.lang.foreign.ValueLayout.JAVA_INT.withName("bindingType");
    public static final long OFFSET__bindingType = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__baseAddress,
            LAYOUT__size,
            LAYOUT__bindingType,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDeviceAddressBindingCallbackDataEXT");

    public VkDeviceAddressBindingCallbackDataEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDeviceAddressBindingCallbackDataEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDeviceAddressBindingCallbackDataEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDeviceAddressBindingCallbackDataEXT value)
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

    public long baseAddress() {return this.ptr.get(LAYOUT__baseAddress, OFFSET__baseAddress);}
    public void baseAddress(long value) {this.ptr.set(LAYOUT__baseAddress, OFFSET__baseAddress, value);}
    public java.lang.foreign.MemorySegment $baseAddress() {return this.ptr.asSlice(OFFSET__baseAddress, LAYOUT__baseAddress);}

    public long size() {return this.ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this.ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this.ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public int bindingType() {return this.ptr.get(LAYOUT__bindingType, OFFSET__bindingType);}
    public void bindingType(int value) {this.ptr.set(LAYOUT__bindingType, OFFSET__bindingType, value);}
    public java.lang.foreign.MemorySegment $bindingType() {return this.ptr.asSlice(OFFSET__bindingType, LAYOUT__bindingType);}
}
