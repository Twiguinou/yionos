package vulkan;

public record VkDeviceAddressBindingCallbackDataEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$baseAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$baseAddress = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bindingType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bindingType = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$baseAddress,
            LAYOUT$size,
            LAYOUT$bindingType,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkDeviceAddressBindingCallbackDataEXT");

    public VkDeviceAddressBindingCallbackDataEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkDeviceAddressBindingCallbackDataEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkDeviceAddressBindingCallbackDataEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
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

    public long baseAddress() {return this.ptr.get(LAYOUT$baseAddress, OFFSET$baseAddress);}
    public void baseAddress(long value) {this.ptr.set(LAYOUT$baseAddress, OFFSET$baseAddress, value);}
    public java.lang.foreign.MemorySegment baseAddress_ptr() {return this.ptr.asSlice(OFFSET$baseAddress, LAYOUT$baseAddress);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public int bindingType() {return this.ptr.get(LAYOUT$bindingType, OFFSET$bindingType);}
    public void bindingType(int value) {this.ptr.set(LAYOUT$bindingType, OFFSET$bindingType, value);}
    public java.lang.foreign.MemorySegment bindingType_ptr() {return this.ptr.asSlice(OFFSET$bindingType, LAYOUT$bindingType);}
}
