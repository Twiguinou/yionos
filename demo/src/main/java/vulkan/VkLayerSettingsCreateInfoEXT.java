package vulkan;

public record VkLayerSettingsCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$settingCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$settingCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSettings = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSettings = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$settingCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSettings
    ).withName("VkLayerSettingsCreateInfoEXT");

    public VkLayerSettingsCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkLayerSettingsCreateInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkLayerSettingsCreateInfoEXT(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int settingCount() {return this.ptr.get(LAYOUT$settingCount, OFFSET$settingCount);}
    public void settingCount(int value) {this.ptr.set(LAYOUT$settingCount, OFFSET$settingCount, value);}
    public java.lang.foreign.MemorySegment settingCount_ptr() {return this.ptr.asSlice(OFFSET$settingCount, LAYOUT$settingCount);}

    public java.lang.foreign.MemorySegment pSettings() {return this.ptr.get(LAYOUT$pSettings, OFFSET$pSettings);}
    public void pSettings(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSettings, OFFSET$pSettings, value);}
    public java.lang.foreign.MemorySegment pSettings_ptr() {return this.ptr.asSlice(OFFSET$pSettings, LAYOUT$pSettings);}
}
