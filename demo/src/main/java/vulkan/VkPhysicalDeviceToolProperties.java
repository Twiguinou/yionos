package vulkan;

public record VkPhysicalDeviceToolProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.SequenceLayout LAYOUT__name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__name = 16;
    public static final java.lang.foreign.SequenceLayout LAYOUT__version = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__version = 272;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__purposes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__purposes = 528;
    public static final java.lang.foreign.SequenceLayout LAYOUT__description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__description = 532;
    public static final java.lang.foreign.SequenceLayout LAYOUT__layer = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__layer = 788;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__name,
            LAYOUT__version,
            LAYOUT__purposes,
            LAYOUT__description,
            LAYOUT__layer,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceToolProperties");

    public VkPhysicalDeviceToolProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceToolProperties getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceToolProperties(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceToolProperties value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public java.lang.foreign.MemorySegment name() {return this.ptr.asSlice(OFFSET__name, LAYOUT__name);}
    public byte name(int index) {return this.name().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void name(int index, byte value) {this.name().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment version() {return this.ptr.asSlice(OFFSET__version, LAYOUT__version);}
    public byte version(int index) {return this.version().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void version(int index, byte value) {this.version().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int purposes() {return this.ptr.get(LAYOUT__purposes, OFFSET__purposes);}
    public void purposes(int value) {this.ptr.set(LAYOUT__purposes, OFFSET__purposes, value);}
    public java.lang.foreign.MemorySegment $purposes() {return this.ptr.asSlice(OFFSET__purposes, LAYOUT__purposes);}

    public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET__description, LAYOUT__description);}
    public byte description(int index) {return this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void description(int index, byte value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment layer() {return this.ptr.asSlice(OFFSET__layer, LAYOUT__layer);}
    public byte layer(int index) {return this.layer().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void layer(int index, byte value) {this.layer().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
