package vulkan;

public record VkSamplerYcbcrConversionCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__format = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__ycbcrModel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__ycbcrModel = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__ycbcrRange = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__ycbcrRange = 24;
    public static final java.lang.foreign.StructLayout LAYOUT__components = vulkan.VkComponentMapping.gRecordLayout;
    public static final long OFFSET__components = 28;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__xChromaOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__xChromaOffset = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__yChromaOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__yChromaOffset = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__chromaFilter = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__chromaFilter = 52;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__forceExplicitReconstruction = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__forceExplicitReconstruction = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__format,
            LAYOUT__ycbcrModel,
            LAYOUT__ycbcrRange,
            LAYOUT__components,
            LAYOUT__xChromaOffset,
            LAYOUT__yChromaOffset,
            LAYOUT__chromaFilter,
            LAYOUT__forceExplicitReconstruction,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkSamplerYcbcrConversionCreateInfo");

    public VkSamplerYcbcrConversionCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSamplerYcbcrConversionCreateInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSamplerYcbcrConversionCreateInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSamplerYcbcrConversionCreateInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int format() {return this.ptr.get(LAYOUT__format, OFFSET__format);}
    public void format(int value) {this.ptr.set(LAYOUT__format, OFFSET__format, value);}
    public java.lang.foreign.MemorySegment $format() {return this.ptr.asSlice(OFFSET__format, LAYOUT__format);}

    public int ycbcrModel() {return this.ptr.get(LAYOUT__ycbcrModel, OFFSET__ycbcrModel);}
    public void ycbcrModel(int value) {this.ptr.set(LAYOUT__ycbcrModel, OFFSET__ycbcrModel, value);}
    public java.lang.foreign.MemorySegment $ycbcrModel() {return this.ptr.asSlice(OFFSET__ycbcrModel, LAYOUT__ycbcrModel);}

    public int ycbcrRange() {return this.ptr.get(LAYOUT__ycbcrRange, OFFSET__ycbcrRange);}
    public void ycbcrRange(int value) {this.ptr.set(LAYOUT__ycbcrRange, OFFSET__ycbcrRange, value);}
    public java.lang.foreign.MemorySegment $ycbcrRange() {return this.ptr.asSlice(OFFSET__ycbcrRange, LAYOUT__ycbcrRange);}

    public vulkan.VkComponentMapping components() {return new vulkan.VkComponentMapping(this.ptr.asSlice(OFFSET__components, LAYOUT__components));}
    public void components(java.util.function.Consumer<vulkan.VkComponentMapping> consumer) {consumer.accept(this.components());}
    public void components(vulkan.VkComponentMapping value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__components, LAYOUT__components.byteSize());}

    public int xChromaOffset() {return this.ptr.get(LAYOUT__xChromaOffset, OFFSET__xChromaOffset);}
    public void xChromaOffset(int value) {this.ptr.set(LAYOUT__xChromaOffset, OFFSET__xChromaOffset, value);}
    public java.lang.foreign.MemorySegment $xChromaOffset() {return this.ptr.asSlice(OFFSET__xChromaOffset, LAYOUT__xChromaOffset);}

    public int yChromaOffset() {return this.ptr.get(LAYOUT__yChromaOffset, OFFSET__yChromaOffset);}
    public void yChromaOffset(int value) {this.ptr.set(LAYOUT__yChromaOffset, OFFSET__yChromaOffset, value);}
    public java.lang.foreign.MemorySegment $yChromaOffset() {return this.ptr.asSlice(OFFSET__yChromaOffset, LAYOUT__yChromaOffset);}

    public int chromaFilter() {return this.ptr.get(LAYOUT__chromaFilter, OFFSET__chromaFilter);}
    public void chromaFilter(int value) {this.ptr.set(LAYOUT__chromaFilter, OFFSET__chromaFilter, value);}
    public java.lang.foreign.MemorySegment $chromaFilter() {return this.ptr.asSlice(OFFSET__chromaFilter, LAYOUT__chromaFilter);}

    public int forceExplicitReconstruction() {return this.ptr.get(LAYOUT__forceExplicitReconstruction, OFFSET__forceExplicitReconstruction);}
    public void forceExplicitReconstruction(int value) {this.ptr.set(LAYOUT__forceExplicitReconstruction, OFFSET__forceExplicitReconstruction, value);}
    public java.lang.foreign.MemorySegment $forceExplicitReconstruction() {return this.ptr.asSlice(OFFSET__forceExplicitReconstruction, LAYOUT__forceExplicitReconstruction);}
}
