package vulkan;

public record StdVideoDecodeAV1PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoDecodeAV1PictureInfoFlags.gRecordLayout.withName("flags");
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__frame_type = java.lang.foreign.ValueLayout.JAVA_INT.withName("frame_type");
    public static final long OFFSET__frame_type = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__current_frame_id = java.lang.foreign.ValueLayout.JAVA_INT.withName("current_frame_id");
    public static final long OFFSET__current_frame_id = 8;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__OrderHint = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("OrderHint");
    public static final long OFFSET__OrderHint = 12;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__primary_ref_frame = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("primary_ref_frame");
    public static final long OFFSET__primary_ref_frame = 13;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__refresh_frame_flags = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("refresh_frame_flags");
    public static final long OFFSET__refresh_frame_flags = 14;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final long OFFSET__reserved1 = 15;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__interpolation_filter = java.lang.foreign.ValueLayout.JAVA_INT.withName("interpolation_filter");
    public static final long OFFSET__interpolation_filter = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__TxMode = java.lang.foreign.ValueLayout.JAVA_INT.withName("TxMode");
    public static final long OFFSET__TxMode = 20;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__delta_q_res = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("delta_q_res");
    public static final long OFFSET__delta_q_res = 24;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__delta_lf_res = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("delta_lf_res");
    public static final long OFFSET__delta_lf_res = 25;
    public static final java.lang.foreign.SequenceLayout LAYOUT__SkipModeFrame = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("SkipModeFrame");
    public static final long OFFSET__SkipModeFrame = 26;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__coded_denom = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("coded_denom");
    public static final long OFFSET__coded_denom = 28;
    public static final java.lang.foreign.SequenceLayout LAYOUT__reserved2 = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("reserved2");
    public static final long OFFSET__reserved2 = 29;
    public static final java.lang.foreign.SequenceLayout LAYOUT__OrderHints = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE).withName("OrderHints");
    public static final long OFFSET__OrderHints = 32;
    public static final java.lang.foreign.SequenceLayout LAYOUT__expectedFrameId = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_INT).withName("expectedFrameId");
    public static final long OFFSET__expectedFrameId = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__pTileInfo = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pTileInfo");
    public static final long OFFSET__pTileInfo = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__pQuantization = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pQuantization");
    public static final long OFFSET__pQuantization = 80;
    public static final java.lang.foreign.AddressLayout LAYOUT__pSegmentation = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pSegmentation");
    public static final long OFFSET__pSegmentation = 88;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLoopFilter = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pLoopFilter");
    public static final long OFFSET__pLoopFilter = 96;
    public static final java.lang.foreign.AddressLayout LAYOUT__pCDEF = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pCDEF");
    public static final long OFFSET__pCDEF = 104;
    public static final java.lang.foreign.AddressLayout LAYOUT__pLoopRestoration = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pLoopRestoration");
    public static final long OFFSET__pLoopRestoration = 112;
    public static final java.lang.foreign.AddressLayout LAYOUT__pGlobalMotion = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pGlobalMotion");
    public static final long OFFSET__pGlobalMotion = 120;
    public static final java.lang.foreign.AddressLayout LAYOUT__pFilmGrain = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pFilmGrain");
    public static final long OFFSET__pFilmGrain = 128;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__frame_type,
            LAYOUT__current_frame_id,
            LAYOUT__OrderHint,
            LAYOUT__primary_ref_frame,
            LAYOUT__refresh_frame_flags,
            LAYOUT__reserved1,
            LAYOUT__interpolation_filter,
            LAYOUT__TxMode,
            LAYOUT__delta_q_res,
            LAYOUT__delta_lf_res,
            LAYOUT__SkipModeFrame,
            LAYOUT__coded_denom,
            LAYOUT__reserved2,
            LAYOUT__OrderHints,
            LAYOUT__expectedFrameId,
            LAYOUT__pTileInfo,
            LAYOUT__pQuantization,
            LAYOUT__pSegmentation,
            LAYOUT__pLoopFilter,
            LAYOUT__pCDEF,
            LAYOUT__pLoopRestoration,
            LAYOUT__pGlobalMotion,
            LAYOUT__pFilmGrain
    ).withByteAlignment(8).withName("StdVideoDecodeAV1PictureInfo");

    public StdVideoDecodeAV1PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoDecodeAV1PictureInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoDecodeAV1PictureInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoDecodeAV1PictureInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoDecodeAV1PictureInfoFlags flags() {return new vulkan.StdVideoDecodeAV1PictureInfoFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoDecodeAV1PictureInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoDecodeAV1PictureInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int frame_type() {return this.ptr.get(LAYOUT__frame_type, OFFSET__frame_type);}
    public void frame_type(int value) {this.ptr.set(LAYOUT__frame_type, OFFSET__frame_type, value);}
    public java.lang.foreign.MemorySegment $frame_type() {return this.ptr.asSlice(OFFSET__frame_type, LAYOUT__frame_type);}

    public int current_frame_id() {return this.ptr.get(LAYOUT__current_frame_id, OFFSET__current_frame_id);}
    public void current_frame_id(int value) {this.ptr.set(LAYOUT__current_frame_id, OFFSET__current_frame_id, value);}
    public java.lang.foreign.MemorySegment $current_frame_id() {return this.ptr.asSlice(OFFSET__current_frame_id, LAYOUT__current_frame_id);}

    public byte OrderHint() {return this.ptr.get(LAYOUT__OrderHint, OFFSET__OrderHint);}
    public void OrderHint(byte value) {this.ptr.set(LAYOUT__OrderHint, OFFSET__OrderHint, value);}
    public java.lang.foreign.MemorySegment $OrderHint() {return this.ptr.asSlice(OFFSET__OrderHint, LAYOUT__OrderHint);}

    public byte primary_ref_frame() {return this.ptr.get(LAYOUT__primary_ref_frame, OFFSET__primary_ref_frame);}
    public void primary_ref_frame(byte value) {this.ptr.set(LAYOUT__primary_ref_frame, OFFSET__primary_ref_frame, value);}
    public java.lang.foreign.MemorySegment $primary_ref_frame() {return this.ptr.asSlice(OFFSET__primary_ref_frame, LAYOUT__primary_ref_frame);}

    public byte refresh_frame_flags() {return this.ptr.get(LAYOUT__refresh_frame_flags, OFFSET__refresh_frame_flags);}
    public void refresh_frame_flags(byte value) {this.ptr.set(LAYOUT__refresh_frame_flags, OFFSET__refresh_frame_flags, value);}
    public java.lang.foreign.MemorySegment $refresh_frame_flags() {return this.ptr.asSlice(OFFSET__refresh_frame_flags, LAYOUT__refresh_frame_flags);}

    public byte reserved1() {return this.ptr.get(LAYOUT__reserved1, OFFSET__reserved1);}
    public void reserved1(byte value) {this.ptr.set(LAYOUT__reserved1, OFFSET__reserved1, value);}
    public java.lang.foreign.MemorySegment $reserved1() {return this.ptr.asSlice(OFFSET__reserved1, LAYOUT__reserved1);}

    public int interpolation_filter() {return this.ptr.get(LAYOUT__interpolation_filter, OFFSET__interpolation_filter);}
    public void interpolation_filter(int value) {this.ptr.set(LAYOUT__interpolation_filter, OFFSET__interpolation_filter, value);}
    public java.lang.foreign.MemorySegment $interpolation_filter() {return this.ptr.asSlice(OFFSET__interpolation_filter, LAYOUT__interpolation_filter);}

    public int TxMode() {return this.ptr.get(LAYOUT__TxMode, OFFSET__TxMode);}
    public void TxMode(int value) {this.ptr.set(LAYOUT__TxMode, OFFSET__TxMode, value);}
    public java.lang.foreign.MemorySegment $TxMode() {return this.ptr.asSlice(OFFSET__TxMode, LAYOUT__TxMode);}

    public byte delta_q_res() {return this.ptr.get(LAYOUT__delta_q_res, OFFSET__delta_q_res);}
    public void delta_q_res(byte value) {this.ptr.set(LAYOUT__delta_q_res, OFFSET__delta_q_res, value);}
    public java.lang.foreign.MemorySegment $delta_q_res() {return this.ptr.asSlice(OFFSET__delta_q_res, LAYOUT__delta_q_res);}

    public byte delta_lf_res() {return this.ptr.get(LAYOUT__delta_lf_res, OFFSET__delta_lf_res);}
    public void delta_lf_res(byte value) {this.ptr.set(LAYOUT__delta_lf_res, OFFSET__delta_lf_res, value);}
    public java.lang.foreign.MemorySegment $delta_lf_res() {return this.ptr.asSlice(OFFSET__delta_lf_res, LAYOUT__delta_lf_res);}

    public java.lang.foreign.MemorySegment SkipModeFrame() {return this.ptr.asSlice(OFFSET__SkipModeFrame, LAYOUT__SkipModeFrame);}
    public byte SkipModeFrame(int index) {return this.SkipModeFrame().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void SkipModeFrame(int index, byte value) {this.SkipModeFrame().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public byte coded_denom() {return this.ptr.get(LAYOUT__coded_denom, OFFSET__coded_denom);}
    public void coded_denom(byte value) {this.ptr.set(LAYOUT__coded_denom, OFFSET__coded_denom, value);}
    public java.lang.foreign.MemorySegment $coded_denom() {return this.ptr.asSlice(OFFSET__coded_denom, LAYOUT__coded_denom);}

    public java.lang.foreign.MemorySegment reserved2() {return this.ptr.asSlice(OFFSET__reserved2, LAYOUT__reserved2);}
    public byte reserved2(int index) {return this.reserved2().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void reserved2(int index, byte value) {this.reserved2().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment OrderHints() {return this.ptr.asSlice(OFFSET__OrderHints, LAYOUT__OrderHints);}
    public byte OrderHints(int index) {return this.OrderHints().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index);}
    public void OrderHints(int index, byte value) {this.OrderHints().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, index, value);}

    public java.lang.foreign.MemorySegment expectedFrameId() {return this.ptr.asSlice(OFFSET__expectedFrameId, LAYOUT__expectedFrameId);}
    public int expectedFrameId(int index) {return this.expectedFrameId().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void expectedFrameId(int index, int value) {this.expectedFrameId().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment pTileInfo() {return this.ptr.get(LAYOUT__pTileInfo, OFFSET__pTileInfo);}
    public void pTileInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pTileInfo, OFFSET__pTileInfo, value);}
    public java.lang.foreign.MemorySegment $pTileInfo() {return this.ptr.asSlice(OFFSET__pTileInfo, LAYOUT__pTileInfo);}

    public java.lang.foreign.MemorySegment pQuantization() {return this.ptr.get(LAYOUT__pQuantization, OFFSET__pQuantization);}
    public void pQuantization(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pQuantization, OFFSET__pQuantization, value);}
    public java.lang.foreign.MemorySegment $pQuantization() {return this.ptr.asSlice(OFFSET__pQuantization, LAYOUT__pQuantization);}

    public java.lang.foreign.MemorySegment pSegmentation() {return this.ptr.get(LAYOUT__pSegmentation, OFFSET__pSegmentation);}
    public void pSegmentation(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pSegmentation, OFFSET__pSegmentation, value);}
    public java.lang.foreign.MemorySegment $pSegmentation() {return this.ptr.asSlice(OFFSET__pSegmentation, LAYOUT__pSegmentation);}

    public java.lang.foreign.MemorySegment pLoopFilter() {return this.ptr.get(LAYOUT__pLoopFilter, OFFSET__pLoopFilter);}
    public void pLoopFilter(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLoopFilter, OFFSET__pLoopFilter, value);}
    public java.lang.foreign.MemorySegment $pLoopFilter() {return this.ptr.asSlice(OFFSET__pLoopFilter, LAYOUT__pLoopFilter);}

    public java.lang.foreign.MemorySegment pCDEF() {return this.ptr.get(LAYOUT__pCDEF, OFFSET__pCDEF);}
    public void pCDEF(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pCDEF, OFFSET__pCDEF, value);}
    public java.lang.foreign.MemorySegment $pCDEF() {return this.ptr.asSlice(OFFSET__pCDEF, LAYOUT__pCDEF);}

    public java.lang.foreign.MemorySegment pLoopRestoration() {return this.ptr.get(LAYOUT__pLoopRestoration, OFFSET__pLoopRestoration);}
    public void pLoopRestoration(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pLoopRestoration, OFFSET__pLoopRestoration, value);}
    public java.lang.foreign.MemorySegment $pLoopRestoration() {return this.ptr.asSlice(OFFSET__pLoopRestoration, LAYOUT__pLoopRestoration);}

    public java.lang.foreign.MemorySegment pGlobalMotion() {return this.ptr.get(LAYOUT__pGlobalMotion, OFFSET__pGlobalMotion);}
    public void pGlobalMotion(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pGlobalMotion, OFFSET__pGlobalMotion, value);}
    public java.lang.foreign.MemorySegment $pGlobalMotion() {return this.ptr.asSlice(OFFSET__pGlobalMotion, LAYOUT__pGlobalMotion);}

    public java.lang.foreign.MemorySegment pFilmGrain() {return this.ptr.get(LAYOUT__pFilmGrain, OFFSET__pFilmGrain);}
    public void pFilmGrain(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__pFilmGrain, OFFSET__pFilmGrain, value);}
    public java.lang.foreign.MemorySegment $pFilmGrain() {return this.ptr.asSlice(OFFSET__pFilmGrain, LAYOUT__pFilmGrain);}
}
