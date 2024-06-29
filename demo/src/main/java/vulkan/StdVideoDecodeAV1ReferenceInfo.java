package vulkan;

public record StdVideoDecodeAV1ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoDecodeAV1ReferenceInfoFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__frame_type = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__frame_type = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__RefFrameSignBias = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__RefFrameSignBias = 5;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__OrderHint = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET__OrderHint = 6;
    public static final java.lang.foreign.SequenceLayout LAYOUT__SavedOrderHints = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET__SavedOrderHints = 7;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__frame_type,
            LAYOUT__RefFrameSignBias,
            LAYOUT__OrderHint,
            LAYOUT__SavedOrderHints,
            java.lang.foreign.MemoryLayout.paddingLayout(1)
    ).withByteAlignment(4).withName("StdVideoDecodeAV1ReferenceInfo");

    public StdVideoDecodeAV1ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoDecodeAV1ReferenceInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoDecodeAV1ReferenceInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoDecodeAV1ReferenceInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoDecodeAV1ReferenceInfoFlags flags() {return new vulkan.StdVideoDecodeAV1ReferenceInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoDecodeAV1ReferenceInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoDecodeAV1ReferenceInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public byte frame_type() {return this.ptr.get(LAYOUT__frame_type, OFFSET__frame_type);}
    public void frame_type(byte value) {this.ptr.set(LAYOUT__frame_type, OFFSET__frame_type, value);}
    public java.lang.foreign.MemorySegment $frame_type() {return this.ptr.asSlice(OFFSET__frame_type, LAYOUT__frame_type);}

    public byte RefFrameSignBias() {return this.ptr.get(LAYOUT__RefFrameSignBias, OFFSET__RefFrameSignBias);}
    public void RefFrameSignBias(byte value) {this.ptr.set(LAYOUT__RefFrameSignBias, OFFSET__RefFrameSignBias, value);}
    public java.lang.foreign.MemorySegment $RefFrameSignBias() {return this.ptr.asSlice(OFFSET__RefFrameSignBias, LAYOUT__RefFrameSignBias);}

    public byte OrderHint() {return this.ptr.get(LAYOUT__OrderHint, OFFSET__OrderHint);}
    public void OrderHint(byte value) {this.ptr.set(LAYOUT__OrderHint, OFFSET__OrderHint, value);}
    public java.lang.foreign.MemorySegment $OrderHint() {return this.ptr.asSlice(OFFSET__OrderHint, LAYOUT__OrderHint);}

    public java.lang.foreign.MemorySegment SavedOrderHints() {return this.ptr.asSlice(OFFSET__SavedOrderHints, LAYOUT__SavedOrderHints);}
    public byte SavedOrderHints(int index) {return this.SavedOrderHints().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void SavedOrderHints(int index, byte value) {this.SavedOrderHints().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}
}
