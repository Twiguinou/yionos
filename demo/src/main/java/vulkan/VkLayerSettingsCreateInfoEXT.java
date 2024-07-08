package vulkan;

public record VkLayerSettingsCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__settingCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("settingCount");
    public static final long OFFSET__settingCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSettings = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSettings");
    public static final long OFFSET__pSettings = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__settingCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pSettings
    ).withByteAlignment(8).withName("VkLayerSettingsCreateInfoEXT");

    public VkLayerSettingsCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkLayerSettingsCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkLayerSettingsCreateInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkLayerSettingsCreateInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int settingCount() {return this.ptr.get(LAYOUT__settingCount, OFFSET__settingCount);}
    public void settingCount(int value) {this.ptr.set(LAYOUT__settingCount, OFFSET__settingCount, value);}
    public java.lang.foreign.MemorySegment $settingCount() {return this.ptr.asSlice(OFFSET__settingCount, LAYOUT__settingCount);}

    public java.lang.foreign.MemorySegment pSettings() {return this.ptr.get(LAYOUT__pSettings, OFFSET__pSettings);}
    public void pSettings(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSettings, OFFSET__pSettings, value);}
    public java.lang.foreign.MemorySegment $pSettings() {return this.ptr.asSlice(OFFSET__pSettings, LAYOUT__pSettings);}
}
