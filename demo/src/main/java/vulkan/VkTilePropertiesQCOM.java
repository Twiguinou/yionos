package vulkan;

public record VkTilePropertiesQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__tileSize = vulkan.VkExtent3D.gRecordLayout;
    public static final long OFFSET__tileSize = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__apronSize = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__apronSize = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__origin = vulkan.VkOffset2D.gRecordLayout;
    public static final long OFFSET__origin = 36;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__tileSize,
            LAYOUT__apronSize,
            LAYOUT__origin,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkTilePropertiesQCOM");

    public VkTilePropertiesQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkTilePropertiesQCOM getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkTilePropertiesQCOM(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkTilePropertiesQCOM value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public vulkan.VkExtent3D tileSize() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET__tileSize, LAYOUT__tileSize));}
    public void tileSize(java.util.function.Consumer<vulkan.VkExtent3D> consumer) {consumer.accept(this.tileSize());}
    public void tileSize(vulkan.VkExtent3D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__tileSize, LAYOUT__tileSize.byteSize());}

    public vulkan.VkExtent2D apronSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__apronSize, LAYOUT__apronSize));}
    public void apronSize(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.apronSize());}
    public void apronSize(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__apronSize, LAYOUT__apronSize.byteSize());}

    public vulkan.VkOffset2D origin() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET__origin, LAYOUT__origin));}
    public void origin(java.util.function.Consumer<vulkan.VkOffset2D> consumer) {consumer.accept(this.origin());}
    public void origin(vulkan.VkOffset2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__origin, LAYOUT__origin.byteSize());}
}
