package vulkan;

public record VkLayerSettingEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$pLayerName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pLayerName = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSettingName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSettingName = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$valueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$valueCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pValues = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pValues = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$pLayerName,
            LAYOUT$pSettingName,
            LAYOUT$type,
            LAYOUT$valueCount,
            LAYOUT$pValues
    ).withName("VkLayerSettingEXT");

    public VkLayerSettingEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkLayerSettingEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkLayerSettingEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment pLayerName() {return this.ptr.get(LAYOUT$pLayerName, OFFSET$pLayerName);}
    public void pLayerName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pLayerName, OFFSET$pLayerName, value);}
    public java.lang.foreign.MemorySegment pLayerName_ptr() {return this.ptr.asSlice(OFFSET$pLayerName, LAYOUT$pLayerName);}

    public java.lang.foreign.MemorySegment pSettingName() {return this.ptr.get(LAYOUT$pSettingName, OFFSET$pSettingName);}
    public void pSettingName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSettingName, OFFSET$pSettingName, value);}
    public java.lang.foreign.MemorySegment pSettingName_ptr() {return this.ptr.asSlice(OFFSET$pSettingName, LAYOUT$pSettingName);}

    public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public int valueCount() {return this.ptr.get(LAYOUT$valueCount, OFFSET$valueCount);}
    public void valueCount(int value) {this.ptr.set(LAYOUT$valueCount, OFFSET$valueCount, value);}
    public java.lang.foreign.MemorySegment valueCount_ptr() {return this.ptr.asSlice(OFFSET$valueCount, LAYOUT$valueCount);}

    public java.lang.foreign.MemorySegment pValues() {return this.ptr.get(LAYOUT$pValues, OFFSET$pValues);}
    public void pValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pValues, OFFSET$pValues, value);}
    public java.lang.foreign.MemorySegment pValues_ptr() {return this.ptr.asSlice(OFFSET$pValues, LAYOUT$pValues);}
}
