package vulkan;

public record VkLatencyTimingsFrameReportNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__sType = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__pNext = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__pNext = 8;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__presentID = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__presentID = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__inputSampleTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__inputSampleTimeUs = 24;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__simStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__simStartTimeUs = 32;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__simEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__simEndTimeUs = 40;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__renderSubmitStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__renderSubmitStartTimeUs = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__renderSubmitEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__renderSubmitEndTimeUs = 56;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__presentStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__presentStartTimeUs = 64;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__presentEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__presentEndTimeUs = 72;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__driverStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__driverStartTimeUs = 80;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__driverEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__driverEndTimeUs = 88;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__osRenderQueueStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__osRenderQueueStartTimeUs = 96;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__osRenderQueueEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__osRenderQueueEndTimeUs = 104;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__gpuRenderStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__gpuRenderStartTimeUs = 112;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__gpuRenderEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__gpuRenderEndTimeUs = 120;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__pNext,
            LAYOUT__presentID,
            LAYOUT__inputSampleTimeUs,
            LAYOUT__simStartTimeUs,
            LAYOUT__simEndTimeUs,
            LAYOUT__renderSubmitStartTimeUs,
            LAYOUT__renderSubmitEndTimeUs,
            LAYOUT__presentStartTimeUs,
            LAYOUT__presentEndTimeUs,
            LAYOUT__driverStartTimeUs,
            LAYOUT__driverEndTimeUs,
            LAYOUT__osRenderQueueStartTimeUs,
            LAYOUT__osRenderQueueEndTimeUs,
            LAYOUT__gpuRenderStartTimeUs,
            LAYOUT__gpuRenderEndTimeUs
    ).withByteAlignment(8).withName("VkLatencyTimingsFrameReportNV");

    public VkLatencyTimingsFrameReportNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkLatencyTimingsFrameReportNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkLatencyTimingsFrameReportNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkLatencyTimingsFrameReportNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int sType() {return this.ptr.get(LAYOUT__sType, OFFSET__sType);}
    public void sType(int value) {this.ptr.set(LAYOUT__sType, OFFSET__sType, value);}
    public java.lang.foreign.MemorySegment $sType() {return this.ptr.asSlice(OFFSET__sType, LAYOUT__sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT__pNext, OFFSET__pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pNext, OFFSET__pNext, value);}
    public java.lang.foreign.MemorySegment $pNext() {return this.ptr.asSlice(OFFSET__pNext, LAYOUT__pNext);}

    public long presentID() {return this.ptr.get(LAYOUT__presentID, OFFSET__presentID);}
    public void presentID(long value) {this.ptr.set(LAYOUT__presentID, OFFSET__presentID, value);}
    public java.lang.foreign.MemorySegment $presentID() {return this.ptr.asSlice(OFFSET__presentID, LAYOUT__presentID);}

    public long inputSampleTimeUs() {return this.ptr.get(LAYOUT__inputSampleTimeUs, OFFSET__inputSampleTimeUs);}
    public void inputSampleTimeUs(long value) {this.ptr.set(LAYOUT__inputSampleTimeUs, OFFSET__inputSampleTimeUs, value);}
    public java.lang.foreign.MemorySegment $inputSampleTimeUs() {return this.ptr.asSlice(OFFSET__inputSampleTimeUs, LAYOUT__inputSampleTimeUs);}

    public long simStartTimeUs() {return this.ptr.get(LAYOUT__simStartTimeUs, OFFSET__simStartTimeUs);}
    public void simStartTimeUs(long value) {this.ptr.set(LAYOUT__simStartTimeUs, OFFSET__simStartTimeUs, value);}
    public java.lang.foreign.MemorySegment $simStartTimeUs() {return this.ptr.asSlice(OFFSET__simStartTimeUs, LAYOUT__simStartTimeUs);}

    public long simEndTimeUs() {return this.ptr.get(LAYOUT__simEndTimeUs, OFFSET__simEndTimeUs);}
    public void simEndTimeUs(long value) {this.ptr.set(LAYOUT__simEndTimeUs, OFFSET__simEndTimeUs, value);}
    public java.lang.foreign.MemorySegment $simEndTimeUs() {return this.ptr.asSlice(OFFSET__simEndTimeUs, LAYOUT__simEndTimeUs);}

    public long renderSubmitStartTimeUs() {return this.ptr.get(LAYOUT__renderSubmitStartTimeUs, OFFSET__renderSubmitStartTimeUs);}
    public void renderSubmitStartTimeUs(long value) {this.ptr.set(LAYOUT__renderSubmitStartTimeUs, OFFSET__renderSubmitStartTimeUs, value);}
    public java.lang.foreign.MemorySegment $renderSubmitStartTimeUs() {return this.ptr.asSlice(OFFSET__renderSubmitStartTimeUs, LAYOUT__renderSubmitStartTimeUs);}

    public long renderSubmitEndTimeUs() {return this.ptr.get(LAYOUT__renderSubmitEndTimeUs, OFFSET__renderSubmitEndTimeUs);}
    public void renderSubmitEndTimeUs(long value) {this.ptr.set(LAYOUT__renderSubmitEndTimeUs, OFFSET__renderSubmitEndTimeUs, value);}
    public java.lang.foreign.MemorySegment $renderSubmitEndTimeUs() {return this.ptr.asSlice(OFFSET__renderSubmitEndTimeUs, LAYOUT__renderSubmitEndTimeUs);}

    public long presentStartTimeUs() {return this.ptr.get(LAYOUT__presentStartTimeUs, OFFSET__presentStartTimeUs);}
    public void presentStartTimeUs(long value) {this.ptr.set(LAYOUT__presentStartTimeUs, OFFSET__presentStartTimeUs, value);}
    public java.lang.foreign.MemorySegment $presentStartTimeUs() {return this.ptr.asSlice(OFFSET__presentStartTimeUs, LAYOUT__presentStartTimeUs);}

    public long presentEndTimeUs() {return this.ptr.get(LAYOUT__presentEndTimeUs, OFFSET__presentEndTimeUs);}
    public void presentEndTimeUs(long value) {this.ptr.set(LAYOUT__presentEndTimeUs, OFFSET__presentEndTimeUs, value);}
    public java.lang.foreign.MemorySegment $presentEndTimeUs() {return this.ptr.asSlice(OFFSET__presentEndTimeUs, LAYOUT__presentEndTimeUs);}

    public long driverStartTimeUs() {return this.ptr.get(LAYOUT__driverStartTimeUs, OFFSET__driverStartTimeUs);}
    public void driverStartTimeUs(long value) {this.ptr.set(LAYOUT__driverStartTimeUs, OFFSET__driverStartTimeUs, value);}
    public java.lang.foreign.MemorySegment $driverStartTimeUs() {return this.ptr.asSlice(OFFSET__driverStartTimeUs, LAYOUT__driverStartTimeUs);}

    public long driverEndTimeUs() {return this.ptr.get(LAYOUT__driverEndTimeUs, OFFSET__driverEndTimeUs);}
    public void driverEndTimeUs(long value) {this.ptr.set(LAYOUT__driverEndTimeUs, OFFSET__driverEndTimeUs, value);}
    public java.lang.foreign.MemorySegment $driverEndTimeUs() {return this.ptr.asSlice(OFFSET__driverEndTimeUs, LAYOUT__driverEndTimeUs);}

    public long osRenderQueueStartTimeUs() {return this.ptr.get(LAYOUT__osRenderQueueStartTimeUs, OFFSET__osRenderQueueStartTimeUs);}
    public void osRenderQueueStartTimeUs(long value) {this.ptr.set(LAYOUT__osRenderQueueStartTimeUs, OFFSET__osRenderQueueStartTimeUs, value);}
    public java.lang.foreign.MemorySegment $osRenderQueueStartTimeUs() {return this.ptr.asSlice(OFFSET__osRenderQueueStartTimeUs, LAYOUT__osRenderQueueStartTimeUs);}

    public long osRenderQueueEndTimeUs() {return this.ptr.get(LAYOUT__osRenderQueueEndTimeUs, OFFSET__osRenderQueueEndTimeUs);}
    public void osRenderQueueEndTimeUs(long value) {this.ptr.set(LAYOUT__osRenderQueueEndTimeUs, OFFSET__osRenderQueueEndTimeUs, value);}
    public java.lang.foreign.MemorySegment $osRenderQueueEndTimeUs() {return this.ptr.asSlice(OFFSET__osRenderQueueEndTimeUs, LAYOUT__osRenderQueueEndTimeUs);}

    public long gpuRenderStartTimeUs() {return this.ptr.get(LAYOUT__gpuRenderStartTimeUs, OFFSET__gpuRenderStartTimeUs);}
    public void gpuRenderStartTimeUs(long value) {this.ptr.set(LAYOUT__gpuRenderStartTimeUs, OFFSET__gpuRenderStartTimeUs, value);}
    public java.lang.foreign.MemorySegment $gpuRenderStartTimeUs() {return this.ptr.asSlice(OFFSET__gpuRenderStartTimeUs, LAYOUT__gpuRenderStartTimeUs);}

    public long gpuRenderEndTimeUs() {return this.ptr.get(LAYOUT__gpuRenderEndTimeUs, OFFSET__gpuRenderEndTimeUs);}
    public void gpuRenderEndTimeUs(long value) {this.ptr.set(LAYOUT__gpuRenderEndTimeUs, OFFSET__gpuRenderEndTimeUs, value);}
    public java.lang.foreign.MemorySegment $gpuRenderEndTimeUs() {return this.ptr.asSlice(OFFSET__gpuRenderEndTimeUs, LAYOUT__gpuRenderEndTimeUs);}
}
