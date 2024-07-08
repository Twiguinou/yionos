package vulkan;

public record VkPhysicalDeviceFloatControlsProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__denormBehaviorIndependence = java.lang.foreign.ValueLayout.JAVA_INT.withName("denormBehaviorIndependence");
    public static final long OFFSET__denormBehaviorIndependence = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__roundingModeIndependence = java.lang.foreign.ValueLayout.JAVA_INT.withName("roundingModeIndependence");
    public static final long OFFSET__roundingModeIndependence = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSignedZeroInfNanPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16");
    public static final long OFFSET__shaderSignedZeroInfNanPreserveFloat16 = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSignedZeroInfNanPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32");
    public static final long OFFSET__shaderSignedZeroInfNanPreserveFloat32 = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderSignedZeroInfNanPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64");
    public static final long OFFSET__shaderSignedZeroInfNanPreserveFloat64 = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat16");
    public static final long OFFSET__shaderDenormPreserveFloat16 = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat32");
    public static final long OFFSET__shaderDenormPreserveFloat32 = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat64");
    public static final long OFFSET__shaderDenormPreserveFloat64 = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormFlushToZeroFloat16 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat16");
    public static final long OFFSET__shaderDenormFlushToZeroFloat16 = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormFlushToZeroFloat32 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat32");
    public static final long OFFSET__shaderDenormFlushToZeroFloat32 = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderDenormFlushToZeroFloat64 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat64");
    public static final long OFFSET__shaderDenormFlushToZeroFloat64 = 56;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTEFloat16 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat16");
    public static final long OFFSET__shaderRoundingModeRTEFloat16 = 60;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTEFloat32 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat32");
    public static final long OFFSET__shaderRoundingModeRTEFloat32 = 64;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTEFloat64 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat64");
    public static final long OFFSET__shaderRoundingModeRTEFloat64 = 68;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTZFloat16 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat16");
    public static final long OFFSET__shaderRoundingModeRTZFloat16 = 72;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTZFloat32 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat32");
    public static final long OFFSET__shaderRoundingModeRTZFloat32 = 76;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__shaderRoundingModeRTZFloat64 = java.lang.foreign.ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat64");
    public static final long OFFSET__shaderRoundingModeRTZFloat64 = 80;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__denormBehaviorIndependence,
            LAYOUT__roundingModeIndependence,
            LAYOUT__shaderSignedZeroInfNanPreserveFloat16,
            LAYOUT__shaderSignedZeroInfNanPreserveFloat32,
            LAYOUT__shaderSignedZeroInfNanPreserveFloat64,
            LAYOUT__shaderDenormPreserveFloat16,
            LAYOUT__shaderDenormPreserveFloat32,
            LAYOUT__shaderDenormPreserveFloat64,
            LAYOUT__shaderDenormFlushToZeroFloat16,
            LAYOUT__shaderDenormFlushToZeroFloat32,
            LAYOUT__shaderDenormFlushToZeroFloat64,
            LAYOUT__shaderRoundingModeRTEFloat16,
            LAYOUT__shaderRoundingModeRTEFloat32,
            LAYOUT__shaderRoundingModeRTEFloat64,
            LAYOUT__shaderRoundingModeRTZFloat16,
            LAYOUT__shaderRoundingModeRTZFloat32,
            LAYOUT__shaderRoundingModeRTZFloat64,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceFloatControlsProperties");

    public VkPhysicalDeviceFloatControlsProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceFloatControlsProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceFloatControlsProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceFloatControlsProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int denormBehaviorIndependence() {return this.ptr.get(LAYOUT__denormBehaviorIndependence, OFFSET__denormBehaviorIndependence);}
    public void denormBehaviorIndependence(int value) {this.ptr.set(LAYOUT__denormBehaviorIndependence, OFFSET__denormBehaviorIndependence, value);}
    public java.lang.foreign.MemorySegment $denormBehaviorIndependence() {return this.ptr.asSlice(OFFSET__denormBehaviorIndependence, LAYOUT__denormBehaviorIndependence);}

    public int roundingModeIndependence() {return this.ptr.get(LAYOUT__roundingModeIndependence, OFFSET__roundingModeIndependence);}
    public void roundingModeIndependence(int value) {this.ptr.set(LAYOUT__roundingModeIndependence, OFFSET__roundingModeIndependence, value);}
    public java.lang.foreign.MemorySegment $roundingModeIndependence() {return this.ptr.asSlice(OFFSET__roundingModeIndependence, LAYOUT__roundingModeIndependence);}

    public int shaderSignedZeroInfNanPreserveFloat16() {return this.ptr.get(LAYOUT__shaderSignedZeroInfNanPreserveFloat16, OFFSET__shaderSignedZeroInfNanPreserveFloat16);}
    public void shaderSignedZeroInfNanPreserveFloat16(int value) {this.ptr.set(LAYOUT__shaderSignedZeroInfNanPreserveFloat16, OFFSET__shaderSignedZeroInfNanPreserveFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderSignedZeroInfNanPreserveFloat16() {return this.ptr.asSlice(OFFSET__shaderSignedZeroInfNanPreserveFloat16, LAYOUT__shaderSignedZeroInfNanPreserveFloat16);}

    public int shaderSignedZeroInfNanPreserveFloat32() {return this.ptr.get(LAYOUT__shaderSignedZeroInfNanPreserveFloat32, OFFSET__shaderSignedZeroInfNanPreserveFloat32);}
    public void shaderSignedZeroInfNanPreserveFloat32(int value) {this.ptr.set(LAYOUT__shaderSignedZeroInfNanPreserveFloat32, OFFSET__shaderSignedZeroInfNanPreserveFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderSignedZeroInfNanPreserveFloat32() {return this.ptr.asSlice(OFFSET__shaderSignedZeroInfNanPreserveFloat32, LAYOUT__shaderSignedZeroInfNanPreserveFloat32);}

    public int shaderSignedZeroInfNanPreserveFloat64() {return this.ptr.get(LAYOUT__shaderSignedZeroInfNanPreserveFloat64, OFFSET__shaderSignedZeroInfNanPreserveFloat64);}
    public void shaderSignedZeroInfNanPreserveFloat64(int value) {this.ptr.set(LAYOUT__shaderSignedZeroInfNanPreserveFloat64, OFFSET__shaderSignedZeroInfNanPreserveFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderSignedZeroInfNanPreserveFloat64() {return this.ptr.asSlice(OFFSET__shaderSignedZeroInfNanPreserveFloat64, LAYOUT__shaderSignedZeroInfNanPreserveFloat64);}

    public int shaderDenormPreserveFloat16() {return this.ptr.get(LAYOUT__shaderDenormPreserveFloat16, OFFSET__shaderDenormPreserveFloat16);}
    public void shaderDenormPreserveFloat16(int value) {this.ptr.set(LAYOUT__shaderDenormPreserveFloat16, OFFSET__shaderDenormPreserveFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderDenormPreserveFloat16() {return this.ptr.asSlice(OFFSET__shaderDenormPreserveFloat16, LAYOUT__shaderDenormPreserveFloat16);}

    public int shaderDenormPreserveFloat32() {return this.ptr.get(LAYOUT__shaderDenormPreserveFloat32, OFFSET__shaderDenormPreserveFloat32);}
    public void shaderDenormPreserveFloat32(int value) {this.ptr.set(LAYOUT__shaderDenormPreserveFloat32, OFFSET__shaderDenormPreserveFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderDenormPreserveFloat32() {return this.ptr.asSlice(OFFSET__shaderDenormPreserveFloat32, LAYOUT__shaderDenormPreserveFloat32);}

    public int shaderDenormPreserveFloat64() {return this.ptr.get(LAYOUT__shaderDenormPreserveFloat64, OFFSET__shaderDenormPreserveFloat64);}
    public void shaderDenormPreserveFloat64(int value) {this.ptr.set(LAYOUT__shaderDenormPreserveFloat64, OFFSET__shaderDenormPreserveFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderDenormPreserveFloat64() {return this.ptr.asSlice(OFFSET__shaderDenormPreserveFloat64, LAYOUT__shaderDenormPreserveFloat64);}

    public int shaderDenormFlushToZeroFloat16() {return this.ptr.get(LAYOUT__shaderDenormFlushToZeroFloat16, OFFSET__shaderDenormFlushToZeroFloat16);}
    public void shaderDenormFlushToZeroFloat16(int value) {this.ptr.set(LAYOUT__shaderDenormFlushToZeroFloat16, OFFSET__shaderDenormFlushToZeroFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderDenormFlushToZeroFloat16() {return this.ptr.asSlice(OFFSET__shaderDenormFlushToZeroFloat16, LAYOUT__shaderDenormFlushToZeroFloat16);}

    public int shaderDenormFlushToZeroFloat32() {return this.ptr.get(LAYOUT__shaderDenormFlushToZeroFloat32, OFFSET__shaderDenormFlushToZeroFloat32);}
    public void shaderDenormFlushToZeroFloat32(int value) {this.ptr.set(LAYOUT__shaderDenormFlushToZeroFloat32, OFFSET__shaderDenormFlushToZeroFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderDenormFlushToZeroFloat32() {return this.ptr.asSlice(OFFSET__shaderDenormFlushToZeroFloat32, LAYOUT__shaderDenormFlushToZeroFloat32);}

    public int shaderDenormFlushToZeroFloat64() {return this.ptr.get(LAYOUT__shaderDenormFlushToZeroFloat64, OFFSET__shaderDenormFlushToZeroFloat64);}
    public void shaderDenormFlushToZeroFloat64(int value) {this.ptr.set(LAYOUT__shaderDenormFlushToZeroFloat64, OFFSET__shaderDenormFlushToZeroFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderDenormFlushToZeroFloat64() {return this.ptr.asSlice(OFFSET__shaderDenormFlushToZeroFloat64, LAYOUT__shaderDenormFlushToZeroFloat64);}

    public int shaderRoundingModeRTEFloat16() {return this.ptr.get(LAYOUT__shaderRoundingModeRTEFloat16, OFFSET__shaderRoundingModeRTEFloat16);}
    public void shaderRoundingModeRTEFloat16(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTEFloat16, OFFSET__shaderRoundingModeRTEFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTEFloat16() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTEFloat16, LAYOUT__shaderRoundingModeRTEFloat16);}

    public int shaderRoundingModeRTEFloat32() {return this.ptr.get(LAYOUT__shaderRoundingModeRTEFloat32, OFFSET__shaderRoundingModeRTEFloat32);}
    public void shaderRoundingModeRTEFloat32(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTEFloat32, OFFSET__shaderRoundingModeRTEFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTEFloat32() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTEFloat32, LAYOUT__shaderRoundingModeRTEFloat32);}

    public int shaderRoundingModeRTEFloat64() {return this.ptr.get(LAYOUT__shaderRoundingModeRTEFloat64, OFFSET__shaderRoundingModeRTEFloat64);}
    public void shaderRoundingModeRTEFloat64(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTEFloat64, OFFSET__shaderRoundingModeRTEFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTEFloat64() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTEFloat64, LAYOUT__shaderRoundingModeRTEFloat64);}

    public int shaderRoundingModeRTZFloat16() {return this.ptr.get(LAYOUT__shaderRoundingModeRTZFloat16, OFFSET__shaderRoundingModeRTZFloat16);}
    public void shaderRoundingModeRTZFloat16(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTZFloat16, OFFSET__shaderRoundingModeRTZFloat16, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTZFloat16() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTZFloat16, LAYOUT__shaderRoundingModeRTZFloat16);}

    public int shaderRoundingModeRTZFloat32() {return this.ptr.get(LAYOUT__shaderRoundingModeRTZFloat32, OFFSET__shaderRoundingModeRTZFloat32);}
    public void shaderRoundingModeRTZFloat32(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTZFloat32, OFFSET__shaderRoundingModeRTZFloat32, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTZFloat32() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTZFloat32, LAYOUT__shaderRoundingModeRTZFloat32);}

    public int shaderRoundingModeRTZFloat64() {return this.ptr.get(LAYOUT__shaderRoundingModeRTZFloat64, OFFSET__shaderRoundingModeRTZFloat64);}
    public void shaderRoundingModeRTZFloat64(int value) {this.ptr.set(LAYOUT__shaderRoundingModeRTZFloat64, OFFSET__shaderRoundingModeRTZFloat64, value);}
    public java.lang.foreign.MemorySegment $shaderRoundingModeRTZFloat64() {return this.ptr.asSlice(OFFSET__shaderRoundingModeRTZFloat64, LAYOUT__shaderRoundingModeRTZFloat64);}
}
