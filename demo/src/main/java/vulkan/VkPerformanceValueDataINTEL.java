package vulkan;

public record VkPerformanceValueDataINTEL(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__value32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__value64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__valueFloat = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__valueBool = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final java.lang.foreign.AddressLayout LAYOUT__valueString = jpgen.NativeTypes.UNBOUNDED_POINTER;

    public static final java.lang.foreign.UnionLayout gRecordLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT__value32,
            LAYOUT__value64,
            LAYOUT__valueFloat,
            LAYOUT__valueBool,
            LAYOUT__valueString
    ).withByteAlignment(8).withName("VkPerformanceValueDataINTEL");

    public VkPerformanceValueDataINTEL(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPerformanceValueDataINTEL getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPerformanceValueDataINTEL(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPerformanceValueDataINTEL value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int value32() {return this.ptr.get(LAYOUT__value32, 0);}
    public void value32(int value) {this.ptr.set(LAYOUT__value32, 0, value);}
    public java.lang.foreign.MemorySegment $value32() {return this.ptr.asSlice(0, LAYOUT__value32);}

    public long value64() {return this.ptr.get(LAYOUT__value64, 0);}
    public void value64(long value) {this.ptr.set(LAYOUT__value64, 0, value);}
    public java.lang.foreign.MemorySegment $value64() {return this.ptr.asSlice(0, LAYOUT__value64);}

    public float valueFloat() {return this.ptr.get(LAYOUT__valueFloat, 0);}
    public void valueFloat(float value) {this.ptr.set(LAYOUT__valueFloat, 0, value);}
    public java.lang.foreign.MemorySegment $valueFloat() {return this.ptr.asSlice(0, LAYOUT__valueFloat);}

    public int valueBool() {return this.ptr.get(LAYOUT__valueBool, 0);}
    public void valueBool(int value) {this.ptr.set(LAYOUT__valueBool, 0, value);}
    public java.lang.foreign.MemorySegment $valueBool() {return this.ptr.asSlice(0, LAYOUT__valueBool);}

    public java.lang.foreign.MemorySegment valueString() {return this.ptr.get(LAYOUT__valueString, 0);}
    public void valueString(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__valueString, 0, value);}
    public java.lang.foreign.MemorySegment $valueString() {return this.ptr.asSlice(0, LAYOUT__valueString);}
}
