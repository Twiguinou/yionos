package vulkan;

public record VkDisplayPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__display = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__display = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__displayName = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__displayName = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__physicalDimensions = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__physicalDimensions = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__physicalResolution = vulkan.VkExtent2D.gRecordLayout;
    public static final long OFFSET__physicalResolution = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__supportedTransforms = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__supportedTransforms = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__planeReorderPossible = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__planeReorderPossible = 36;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__persistentContent = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__persistentContent = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__display,
            LAYOUT__displayName,
            LAYOUT__physicalDimensions,
            LAYOUT__physicalResolution,
            LAYOUT__supportedTransforms,
            LAYOUT__planeReorderPossible,
            LAYOUT__persistentContent,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkDisplayPropertiesKHR");

    public VkDisplayPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkDisplayPropertiesKHR getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkDisplayPropertiesKHR(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkDisplayPropertiesKHR value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment display() {return this.ptr.get(LAYOUT__display, OFFSET__display);}
    public void display(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__display, OFFSET__display, value);}
    public java.lang.foreign.MemorySegment $display() {return this.ptr.asSlice(OFFSET__display, LAYOUT__display);}

    public java.lang.foreign.MemorySegment displayName() {return this.ptr.get(LAYOUT__displayName, OFFSET__displayName);}
    public void displayName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__displayName, OFFSET__displayName, value);}
    public java.lang.foreign.MemorySegment $displayName() {return this.ptr.asSlice(OFFSET__displayName, LAYOUT__displayName);}

    public vulkan.VkExtent2D physicalDimensions() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__physicalDimensions, LAYOUT__physicalDimensions));}
    public void physicalDimensions(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.physicalDimensions());}
    public void physicalDimensions(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__physicalDimensions, LAYOUT__physicalDimensions.byteSize());}

    public vulkan.VkExtent2D physicalResolution() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET__physicalResolution, LAYOUT__physicalResolution));}
    public void physicalResolution(java.util.function.Consumer<vulkan.VkExtent2D> consumer) {consumer.accept(this.physicalResolution());}
    public void physicalResolution(vulkan.VkExtent2D value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__physicalResolution, LAYOUT__physicalResolution.byteSize());}

    public int supportedTransforms() {return this.ptr.get(LAYOUT__supportedTransforms, OFFSET__supportedTransforms);}
    public void supportedTransforms(int value) {this.ptr.set(LAYOUT__supportedTransforms, OFFSET__supportedTransforms, value);}
    public java.lang.foreign.MemorySegment $supportedTransforms() {return this.ptr.asSlice(OFFSET__supportedTransforms, LAYOUT__supportedTransforms);}

    public int planeReorderPossible() {return this.ptr.get(LAYOUT__planeReorderPossible, OFFSET__planeReorderPossible);}
    public void planeReorderPossible(int value) {this.ptr.set(LAYOUT__planeReorderPossible, OFFSET__planeReorderPossible, value);}
    public java.lang.foreign.MemorySegment $planeReorderPossible() {return this.ptr.asSlice(OFFSET__planeReorderPossible, LAYOUT__planeReorderPossible);}

    public int persistentContent() {return this.ptr.get(LAYOUT__persistentContent, OFFSET__persistentContent);}
    public void persistentContent(int value) {this.ptr.set(LAYOUT__persistentContent, OFFSET__persistentContent, value);}
    public java.lang.foreign.MemorySegment $persistentContent() {return this.ptr.asSlice(OFFSET__persistentContent, LAYOUT__persistentContent);}
}
