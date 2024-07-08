package vulkan;

public record VkPhysicalDeviceHostImageCopyPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__copySrcLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("copySrcLayoutCount");
    public static final long OFFSET__copySrcLayoutCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCopySrcLayouts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCopySrcLayouts");
    public static final long OFFSET__pCopySrcLayouts = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__copyDstLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("copyDstLayoutCount");
    public static final long OFFSET__copyDstLayoutCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCopyDstLayouts = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCopyDstLayouts");
    public static final long OFFSET__pCopyDstLayouts = 40;
    public static final java.lang.foreign.SequenceLayout LAYOUT__optimalTilingLayoutUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID");
    public static final long OFFSET__optimalTilingLayoutUUID = 48;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__identicalMemoryTypeRequirements = java.lang.foreign.ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements");
    public static final long OFFSET__identicalMemoryTypeRequirements = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__copySrcLayoutCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCopySrcLayouts,
            LAYOUT__copyDstLayoutCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pCopyDstLayouts,
            LAYOUT__optimalTilingLayoutUUID,
            LAYOUT__identicalMemoryTypeRequirements,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("VkPhysicalDeviceHostImageCopyPropertiesEXT");

    public VkPhysicalDeviceHostImageCopyPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkPhysicalDeviceHostImageCopyPropertiesEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int copySrcLayoutCount() {return this.ptr.get(LAYOUT__copySrcLayoutCount, OFFSET__copySrcLayoutCount);}
    public void copySrcLayoutCount(int value) {this.ptr.set(LAYOUT__copySrcLayoutCount, OFFSET__copySrcLayoutCount, value);}
    public java.lang.foreign.MemorySegment $copySrcLayoutCount() {return this.ptr.asSlice(OFFSET__copySrcLayoutCount, LAYOUT__copySrcLayoutCount);}

    public java.lang.foreign.MemorySegment pCopySrcLayouts() {return this.ptr.get(LAYOUT__pCopySrcLayouts, OFFSET__pCopySrcLayouts);}
    public void pCopySrcLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCopySrcLayouts, OFFSET__pCopySrcLayouts, value);}
    public java.lang.foreign.MemorySegment $pCopySrcLayouts() {return this.ptr.asSlice(OFFSET__pCopySrcLayouts, LAYOUT__pCopySrcLayouts);}

    public int copyDstLayoutCount() {return this.ptr.get(LAYOUT__copyDstLayoutCount, OFFSET__copyDstLayoutCount);}
    public void copyDstLayoutCount(int value) {this.ptr.set(LAYOUT__copyDstLayoutCount, OFFSET__copyDstLayoutCount, value);}
    public java.lang.foreign.MemorySegment $copyDstLayoutCount() {return this.ptr.asSlice(OFFSET__copyDstLayoutCount, LAYOUT__copyDstLayoutCount);}

    public java.lang.foreign.MemorySegment pCopyDstLayouts() {return this.ptr.get(LAYOUT__pCopyDstLayouts, OFFSET__pCopyDstLayouts);}
    public void pCopyDstLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCopyDstLayouts, OFFSET__pCopyDstLayouts, value);}
    public java.lang.foreign.MemorySegment $pCopyDstLayouts() {return this.ptr.asSlice(OFFSET__pCopyDstLayouts, LAYOUT__pCopyDstLayouts);}

    public java.lang.foreign.MemorySegment optimalTilingLayoutUUID() {return this.ptr.asSlice(OFFSET__optimalTilingLayoutUUID, LAYOUT__optimalTilingLayoutUUID);}
    public byte optimalTilingLayoutUUID(int index) {return this.optimalTilingLayoutUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void optimalTilingLayoutUUID(int index, byte value) {this.optimalTilingLayoutUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public int identicalMemoryTypeRequirements() {return this.ptr.get(LAYOUT__identicalMemoryTypeRequirements, OFFSET__identicalMemoryTypeRequirements);}
    public void identicalMemoryTypeRequirements(int value) {this.ptr.set(LAYOUT__identicalMemoryTypeRequirements, OFFSET__identicalMemoryTypeRequirements, value);}
    public java.lang.foreign.MemorySegment $identicalMemoryTypeRequirements() {return this.ptr.asSlice(OFFSET__identicalMemoryTypeRequirements, LAYOUT__identicalMemoryTypeRequirements);}
}
