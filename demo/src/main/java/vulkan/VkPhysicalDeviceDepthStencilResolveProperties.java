package vulkan;

public record VkPhysicalDeviceDepthStencilResolveProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedDepthResolveModes = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedDepthResolveModes");
    public static final long OFFSET__supportedDepthResolveModes = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedStencilResolveModes = java.lang.foreign.ValueLayout.JAVA_INT.withName("supportedStencilResolveModes");
    public static final long OFFSET__supportedStencilResolveModes = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__independentResolveNone = java.lang.foreign.ValueLayout.JAVA_INT.withName("independentResolveNone");
    public static final long OFFSET__independentResolveNone = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__independentResolve = java.lang.foreign.ValueLayout.JAVA_INT.withName("independentResolve");
    public static final long OFFSET__independentResolve = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__supportedDepthResolveModes,
            LAYOUT__supportedStencilResolveModes,
            LAYOUT__independentResolveNone,
            LAYOUT__independentResolve
    ).withByteAlignment(8).withName("VkPhysicalDeviceDepthStencilResolveProperties");

    public VkPhysicalDeviceDepthStencilResolveProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceDepthStencilResolveProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceDepthStencilResolveProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int supportedDepthResolveModes() {return this.ptr.get(LAYOUT__supportedDepthResolveModes, OFFSET__supportedDepthResolveModes);}
    public void supportedDepthResolveModes(int value) {this.ptr.set(LAYOUT__supportedDepthResolveModes, OFFSET__supportedDepthResolveModes, value);}
    public java.lang.foreign.MemorySegment $supportedDepthResolveModes() {return this.ptr.asSlice(OFFSET__supportedDepthResolveModes, LAYOUT__supportedDepthResolveModes);}

    public int supportedStencilResolveModes() {return this.ptr.get(LAYOUT__supportedStencilResolveModes, OFFSET__supportedStencilResolveModes);}
    public void supportedStencilResolveModes(int value) {this.ptr.set(LAYOUT__supportedStencilResolveModes, OFFSET__supportedStencilResolveModes, value);}
    public java.lang.foreign.MemorySegment $supportedStencilResolveModes() {return this.ptr.asSlice(OFFSET__supportedStencilResolveModes, LAYOUT__supportedStencilResolveModes);}

    public int independentResolveNone() {return this.ptr.get(LAYOUT__independentResolveNone, OFFSET__independentResolveNone);}
    public void independentResolveNone(int value) {this.ptr.set(LAYOUT__independentResolveNone, OFFSET__independentResolveNone, value);}
    public java.lang.foreign.MemorySegment $independentResolveNone() {return this.ptr.asSlice(OFFSET__independentResolveNone, LAYOUT__independentResolveNone);}

    public int independentResolve() {return this.ptr.get(LAYOUT__independentResolve, OFFSET__independentResolve);}
    public void independentResolve(int value) {this.ptr.set(LAYOUT__independentResolve, OFFSET__independentResolve, value);}
    public java.lang.foreign.MemorySegment $independentResolve() {return this.ptr.asSlice(OFFSET__independentResolve, LAYOUT__independentResolve);}
}
