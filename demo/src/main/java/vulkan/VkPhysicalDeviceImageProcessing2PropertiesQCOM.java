package vulkan;

public record VkPhysicalDeviceImageProcessing2PropertiesQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxBlockMatchWindow = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxBlockMatchWindow = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxBlockMatchWindow
    ).withName("VkPhysicalDeviceImageProcessing2PropertiesQCOM");

    public VkPhysicalDeviceImageProcessing2PropertiesQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkExtent2D maxBlockMatchWindow() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxBlockMatchWindow, LAYOUT$maxBlockMatchWindow));}
    public void maxBlockMatchWindow(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.maxBlockMatchWindow());}
    public void maxBlockMatchWindow(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$maxBlockMatchWindow, LAYOUT$maxBlockMatchWindow.byteSize());}
}
