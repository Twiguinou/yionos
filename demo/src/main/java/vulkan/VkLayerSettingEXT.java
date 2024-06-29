package vulkan;

public record VkLayerSettingEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__pLayerName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pLayerName = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSettingName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pSettingName = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__type = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__valueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__valueCount = 20;
    public static final java.lang.foreign.AddressLayout LAYOUT__pValues = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pValues = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__pLayerName,
            LAYOUT__pSettingName,
            LAYOUT__type,
            LAYOUT__valueCount,
            LAYOUT__pValues
    ).withByteAlignment(8).withName("VkLayerSettingEXT");

    public VkLayerSettingEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkLayerSettingEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkLayerSettingEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkLayerSettingEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment pLayerName() {return this.ptr.get(LAYOUT__pLayerName, OFFSET__pLayerName);}
    public void pLayerName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLayerName, OFFSET__pLayerName, value);}
    public java.lang.foreign.MemorySegment $pLayerName() {return this.ptr.asSlice(OFFSET__pLayerName, LAYOUT__pLayerName);}

    public java.lang.foreign.MemorySegment pSettingName() {return this.ptr.get(LAYOUT__pSettingName, OFFSET__pSettingName);}
    public void pSettingName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSettingName, OFFSET__pSettingName, value);}
    public java.lang.foreign.MemorySegment $pSettingName() {return this.ptr.asSlice(OFFSET__pSettingName, LAYOUT__pSettingName);}

    public int type() {return this.ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this.ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this.ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int valueCount() {return this.ptr.get(LAYOUT__valueCount, OFFSET__valueCount);}
    public void valueCount(int value) {this.ptr.set(LAYOUT__valueCount, OFFSET__valueCount, value);}
    public java.lang.foreign.MemorySegment $valueCount() {return this.ptr.asSlice(OFFSET__valueCount, LAYOUT__valueCount);}

    public java.lang.foreign.MemorySegment pValues() {return this.ptr.get(LAYOUT__pValues, OFFSET__pValues);}
    public void pValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pValues, OFFSET__pValues, value);}
    public java.lang.foreign.MemorySegment $pValues() {return this.ptr.asSlice(OFFSET__pValues, LAYOUT__pValues);}
}
