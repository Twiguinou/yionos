package vulkan;

public record VkRenderPassSampleLocationsBeginInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pNext");
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__attachmentInitialSampleLocationsCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("attachmentInitialSampleLocationsCount");
    public static final long OFFSET__attachmentInitialSampleLocationsCount = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__pAttachmentInitialSampleLocations = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pAttachmentInitialSampleLocations");
    public static final long OFFSET__pAttachmentInitialSampleLocations = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__postSubpassSampleLocationsCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("postSubpassSampleLocationsCount");
    public static final long OFFSET__postSubpassSampleLocationsCount = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__pPostSubpassSampleLocations = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pPostSubpassSampleLocations");
    public static final long OFFSET__pPostSubpassSampleLocations = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__attachmentInitialSampleLocationsCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pAttachmentInitialSampleLocations,
            LAYOUT__postSubpassSampleLocationsCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pPostSubpassSampleLocations
    ).withByteAlignment(8).withName("VkRenderPassSampleLocationsBeginInfoEXT");

    public VkRenderPassSampleLocationsBeginInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkRenderPassSampleLocationsBeginInfoEXT(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkRenderPassSampleLocationsBeginInfoEXT value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public int attachmentInitialSampleLocationsCount() {return this.ptr.get(LAYOUT__attachmentInitialSampleLocationsCount, OFFSET__attachmentInitialSampleLocationsCount);}
    public void attachmentInitialSampleLocationsCount(int value) {this.ptr.set(LAYOUT__attachmentInitialSampleLocationsCount, OFFSET__attachmentInitialSampleLocationsCount, value);}
    public java.lang.foreign.MemorySegment $attachmentInitialSampleLocationsCount() {return this.ptr.asSlice(OFFSET__attachmentInitialSampleLocationsCount, LAYOUT__attachmentInitialSampleLocationsCount);}

    public java.lang.foreign.MemorySegment pAttachmentInitialSampleLocations() {return this.ptr.get(LAYOUT__pAttachmentInitialSampleLocations, OFFSET__pAttachmentInitialSampleLocations);}
    public void pAttachmentInitialSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pAttachmentInitialSampleLocations, OFFSET__pAttachmentInitialSampleLocations, value);}
    public java.lang.foreign.MemorySegment $pAttachmentInitialSampleLocations() {return this.ptr.asSlice(OFFSET__pAttachmentInitialSampleLocations, LAYOUT__pAttachmentInitialSampleLocations);}

    public int postSubpassSampleLocationsCount() {return this.ptr.get(LAYOUT__postSubpassSampleLocationsCount, OFFSET__postSubpassSampleLocationsCount);}
    public void postSubpassSampleLocationsCount(int value) {this.ptr.set(LAYOUT__postSubpassSampleLocationsCount, OFFSET__postSubpassSampleLocationsCount, value);}
    public java.lang.foreign.MemorySegment $postSubpassSampleLocationsCount() {return this.ptr.asSlice(OFFSET__postSubpassSampleLocationsCount, LAYOUT__postSubpassSampleLocationsCount);}

    public java.lang.foreign.MemorySegment pPostSubpassSampleLocations() {return this.ptr.get(LAYOUT__pPostSubpassSampleLocations, OFFSET__pPostSubpassSampleLocations);}
    public void pPostSubpassSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pPostSubpassSampleLocations, OFFSET__pPostSubpassSampleLocations, value);}
    public java.lang.foreign.MemorySegment $pPostSubpassSampleLocations() {return this.ptr.asSlice(OFFSET__pPostSubpassSampleLocations, LAYOUT__pPostSubpassSampleLocations);}
}
