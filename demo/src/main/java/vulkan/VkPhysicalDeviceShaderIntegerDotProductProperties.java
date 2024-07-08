package vulkan;

public record VkPhysicalDeviceShaderIntegerDotProductProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProduct8BitUnsignedAccelerated = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct8BitSignedAccelerated");
    public static final long OFFSET__integerDotProduct8BitSignedAccelerated = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProduct8BitMixedSignednessAccelerated = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated");
    public static final long OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated");
    public static final long OFFSET__integerDotProduct4x8BitPackedSignedAccelerated = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProduct16BitUnsignedAccelerated = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct16BitSignedAccelerated");
    public static final long OFFSET__integerDotProduct16BitSignedAccelerated = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProduct16BitMixedSignednessAccelerated = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProduct32BitUnsignedAccelerated = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct32BitSignedAccelerated");
    public static final long OFFSET__integerDotProduct32BitSignedAccelerated = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProduct32BitMixedSignednessAccelerated = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProduct64BitUnsignedAccelerated = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct64BitSignedAccelerated");
    public static final long OFFSET__integerDotProduct64BitSignedAccelerated = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProduct64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProduct64BitMixedSignednessAccelerated = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = 84;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = 88;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = 92;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = 96;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = 100;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated = 104;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = 108;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = 112;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated = 116;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = 120;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = 124;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated = 128;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated");
    public static final long OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = 132;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__integerDotProduct8BitUnsignedAccelerated,
            LAYOUT__integerDotProduct8BitSignedAccelerated,
            LAYOUT__integerDotProduct8BitMixedSignednessAccelerated,
            LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated,
            LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated,
            LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated,
            LAYOUT__integerDotProduct16BitUnsignedAccelerated,
            LAYOUT__integerDotProduct16BitSignedAccelerated,
            LAYOUT__integerDotProduct16BitMixedSignednessAccelerated,
            LAYOUT__integerDotProduct32BitUnsignedAccelerated,
            LAYOUT__integerDotProduct32BitSignedAccelerated,
            LAYOUT__integerDotProduct32BitMixedSignednessAccelerated,
            LAYOUT__integerDotProduct64BitUnsignedAccelerated,
            LAYOUT__integerDotProduct64BitSignedAccelerated,
            LAYOUT__integerDotProduct64BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated,
            LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
    ).withByteAlignment(8).withName("VkPhysicalDeviceShaderIntegerDotProductProperties");

    public VkPhysicalDeviceShaderIntegerDotProductProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceShaderIntegerDotProductProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int integerDotProduct8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct8BitUnsignedAccelerated, OFFSET__integerDotProduct8BitUnsignedAccelerated);}
    public void integerDotProduct8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct8BitUnsignedAccelerated, OFFSET__integerDotProduct8BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct8BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct8BitUnsignedAccelerated, LAYOUT__integerDotProduct8BitUnsignedAccelerated);}

    public int integerDotProduct8BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct8BitSignedAccelerated, OFFSET__integerDotProduct8BitSignedAccelerated);}
    public void integerDotProduct8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct8BitSignedAccelerated, OFFSET__integerDotProduct8BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct8BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct8BitSignedAccelerated, LAYOUT__integerDotProduct8BitSignedAccelerated);}

    public int integerDotProduct8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct8BitMixedSignednessAccelerated, OFFSET__integerDotProduct8BitMixedSignednessAccelerated);}
    public void integerDotProduct8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct8BitMixedSignednessAccelerated, OFFSET__integerDotProduct8BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct8BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct8BitMixedSignednessAccelerated, LAYOUT__integerDotProduct8BitMixedSignednessAccelerated);}

    public int integerDotProduct4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated);}
    public void integerDotProduct4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct4x8BitPackedUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct4x8BitPackedUnsignedAccelerated, LAYOUT__integerDotProduct4x8BitPackedUnsignedAccelerated);}

    public int integerDotProduct4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated, OFFSET__integerDotProduct4x8BitPackedSignedAccelerated);}
    public void integerDotProduct4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated, OFFSET__integerDotProduct4x8BitPackedSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct4x8BitPackedSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct4x8BitPackedSignedAccelerated, LAYOUT__integerDotProduct4x8BitPackedSignedAccelerated);}

    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated);}
    public void integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct4x8BitPackedMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct4x8BitPackedMixedSignednessAccelerated, LAYOUT__integerDotProduct4x8BitPackedMixedSignednessAccelerated);}

    public int integerDotProduct16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct16BitUnsignedAccelerated, OFFSET__integerDotProduct16BitUnsignedAccelerated);}
    public void integerDotProduct16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct16BitUnsignedAccelerated, OFFSET__integerDotProduct16BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct16BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct16BitUnsignedAccelerated, LAYOUT__integerDotProduct16BitUnsignedAccelerated);}

    public int integerDotProduct16BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct16BitSignedAccelerated, OFFSET__integerDotProduct16BitSignedAccelerated);}
    public void integerDotProduct16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct16BitSignedAccelerated, OFFSET__integerDotProduct16BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct16BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct16BitSignedAccelerated, LAYOUT__integerDotProduct16BitSignedAccelerated);}

    public int integerDotProduct16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct16BitMixedSignednessAccelerated, OFFSET__integerDotProduct16BitMixedSignednessAccelerated);}
    public void integerDotProduct16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct16BitMixedSignednessAccelerated, OFFSET__integerDotProduct16BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct16BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct16BitMixedSignednessAccelerated, LAYOUT__integerDotProduct16BitMixedSignednessAccelerated);}

    public int integerDotProduct32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct32BitUnsignedAccelerated, OFFSET__integerDotProduct32BitUnsignedAccelerated);}
    public void integerDotProduct32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct32BitUnsignedAccelerated, OFFSET__integerDotProduct32BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct32BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct32BitUnsignedAccelerated, LAYOUT__integerDotProduct32BitUnsignedAccelerated);}

    public int integerDotProduct32BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct32BitSignedAccelerated, OFFSET__integerDotProduct32BitSignedAccelerated);}
    public void integerDotProduct32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct32BitSignedAccelerated, OFFSET__integerDotProduct32BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct32BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct32BitSignedAccelerated, LAYOUT__integerDotProduct32BitSignedAccelerated);}

    public int integerDotProduct32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct32BitMixedSignednessAccelerated, OFFSET__integerDotProduct32BitMixedSignednessAccelerated);}
    public void integerDotProduct32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct32BitMixedSignednessAccelerated, OFFSET__integerDotProduct32BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct32BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct32BitMixedSignednessAccelerated, LAYOUT__integerDotProduct32BitMixedSignednessAccelerated);}

    public int integerDotProduct64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct64BitUnsignedAccelerated, OFFSET__integerDotProduct64BitUnsignedAccelerated);}
    public void integerDotProduct64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct64BitUnsignedAccelerated, OFFSET__integerDotProduct64BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct64BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct64BitUnsignedAccelerated, LAYOUT__integerDotProduct64BitUnsignedAccelerated);}

    public int integerDotProduct64BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct64BitSignedAccelerated, OFFSET__integerDotProduct64BitSignedAccelerated);}
    public void integerDotProduct64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct64BitSignedAccelerated, OFFSET__integerDotProduct64BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct64BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct64BitSignedAccelerated, LAYOUT__integerDotProduct64BitSignedAccelerated);}

    public int integerDotProduct64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProduct64BitMixedSignednessAccelerated, OFFSET__integerDotProduct64BitMixedSignednessAccelerated);}
    public void integerDotProduct64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProduct64BitMixedSignednessAccelerated, OFFSET__integerDotProduct64BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProduct64BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProduct64BitMixedSignednessAccelerated, LAYOUT__integerDotProduct64BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating8BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating8BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating8BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating16BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating16BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating16BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating32BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating32BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating32BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating64BitSignedAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating64BitSignedAccelerated, LAYOUT__integerDotProductAccumulatingSaturating64BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment $integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {return this.ptr.asSlice(OFFSET__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, LAYOUT__integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}
}
