package vulkan;

public record VkCudaFunctionCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__module = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__module = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pName = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__module,
            LAYOUT__pName
    ).withByteAlignment(8).withName("VkCudaFunctionCreateInfoNV");

    public VkCudaFunctionCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkCudaFunctionCreateInfoNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkCudaFunctionCreateInfoNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkCudaFunctionCreateInfoNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment module() {return this.ptr.get(LAYOUT__module, OFFSET__module);}
    public void module(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__module, OFFSET__module, value);}
    public java.lang.foreign.MemorySegment $module() {return this.ptr.asSlice(OFFSET__module, LAYOUT__module);}

    public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT__pName, OFFSET__pName);}
    public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pName, OFFSET__pName, value);}
    public java.lang.foreign.MemorySegment $pName() {return this.ptr.asSlice(OFFSET__pName, LAYOUT__pName);}
}
