package vulkan;

public record StdVideoEncodeH264PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoEncodeH264PictureInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$seq_parameter_set_id = 4L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pic_parameter_set_id = 5L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$idr_pic_id = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$idr_pic_id = 6L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primary_pic_type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primary_pic_type = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frame_num = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$frame_num = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$PicOrderCnt = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$PicOrderCnt = 16L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$temporal_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$temporal_id = 20L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$reserved1 = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$reserved1 = 21L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRefLists = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRefLists = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$seq_parameter_set_id,
            LAYOUT$pic_parameter_set_id,
            LAYOUT$idr_pic_id,
            LAYOUT$primary_pic_type,
            LAYOUT$frame_num,
            LAYOUT$PicOrderCnt,
            LAYOUT$temporal_id,
            LAYOUT$reserved1,
            LAYOUT$pRefLists
    ).withName("StdVideoEncodeH264PictureInfo");

    public StdVideoEncodeH264PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoEncodeH264PictureInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoEncodeH264PictureInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoEncodeH264PictureInfoFlags flags() {return new vulkan.StdVideoEncodeH264PictureInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoEncodeH264PictureInfoFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoEncodeH264PictureInfoFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public char seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id);}
    public void seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$seq_parameter_set_id, LAYOUT$seq_parameter_set_id);}

    public char pic_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id);}
    public void pic_parameter_set_id(char value) {this.ptr.set(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment pic_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pic_parameter_set_id, LAYOUT$pic_parameter_set_id);}

    public short idr_pic_id() {return this.ptr.get(LAYOUT$idr_pic_id, OFFSET$idr_pic_id);}
    public void idr_pic_id(short value) {this.ptr.set(LAYOUT$idr_pic_id, OFFSET$idr_pic_id, value);}
    public java.lang.foreign.MemorySegment idr_pic_id_ptr() {return this.ptr.asSlice(OFFSET$idr_pic_id, LAYOUT$idr_pic_id);}

    public int primary_pic_type() {return this.ptr.get(LAYOUT$primary_pic_type, OFFSET$primary_pic_type);}
    public void primary_pic_type(int value) {this.ptr.set(LAYOUT$primary_pic_type, OFFSET$primary_pic_type, value);}
    public java.lang.foreign.MemorySegment primary_pic_type_ptr() {return this.ptr.asSlice(OFFSET$primary_pic_type, LAYOUT$primary_pic_type);}

    public int frame_num() {return this.ptr.get(LAYOUT$frame_num, OFFSET$frame_num);}
    public void frame_num(int value) {this.ptr.set(LAYOUT$frame_num, OFFSET$frame_num, value);}
    public java.lang.foreign.MemorySegment frame_num_ptr() {return this.ptr.asSlice(OFFSET$frame_num, LAYOUT$frame_num);}

    public int PicOrderCnt() {return this.ptr.get(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt);}
    public void PicOrderCnt(int value) {this.ptr.set(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt, value);}
    public java.lang.foreign.MemorySegment PicOrderCnt_ptr() {return this.ptr.asSlice(OFFSET$PicOrderCnt, LAYOUT$PicOrderCnt);}

    public char temporal_id() {return (char)this.ptr.get(LAYOUT$temporal_id, OFFSET$temporal_id);}
    public void temporal_id(char value) {this.ptr.set(LAYOUT$temporal_id, OFFSET$temporal_id, (byte)value);}
    public java.lang.foreign.MemorySegment temporal_id_ptr() {return this.ptr.asSlice(OFFSET$temporal_id, LAYOUT$temporal_id);}

    public java.lang.foreign.MemorySegment reserved1() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}
    public char reserved1(int i) {return (char)this.reserved1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void reserved1(int i, char value) {this.reserved1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment pRefLists() {return this.ptr.get(LAYOUT$pRefLists, OFFSET$pRefLists);}
    public void pRefLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRefLists, OFFSET$pRefLists, value);}
    public java.lang.foreign.MemorySegment pRefLists_ptr() {return this.ptr.asSlice(OFFSET$pRefLists, LAYOUT$pRefLists);}
}
