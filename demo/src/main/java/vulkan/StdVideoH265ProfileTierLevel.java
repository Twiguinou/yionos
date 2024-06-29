package vulkan;

public record StdVideoH265ProfileTierLevel(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__flags = vulkan.StdVideoH265ProfileTierLevelFlags.gRecordLayout;
    public static final long OFFSET__flags = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__general_profile_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__general_profile_idc = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__general_level_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__general_level_idc = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__flags,
            LAYOUT__general_profile_idc,
            LAYOUT__general_level_idc
    ).withByteAlignment(4).withName("StdVideoH265ProfileTierLevel");

    public StdVideoH265ProfileTierLevel(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static StdVideoH265ProfileTierLevel getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new StdVideoH265ProfileTierLevel(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, StdVideoH265ProfileTierLevel value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public vulkan.StdVideoH265ProfileTierLevelFlags flags() {return new vulkan.StdVideoH265ProfileTierLevelFlags(this.ptr.asSlice(OFFSET__flags, LAYOUT__flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265ProfileTierLevelFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265ProfileTierLevelFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__flags, LAYOUT__flags.byteSize());}

    public int general_profile_idc() {return this.ptr.get(LAYOUT__general_profile_idc, OFFSET__general_profile_idc);}
    public void general_profile_idc(int value) {this.ptr.set(LAYOUT__general_profile_idc, OFFSET__general_profile_idc, value);}
    public java.lang.foreign.MemorySegment $general_profile_idc() {return this.ptr.asSlice(OFFSET__general_profile_idc, LAYOUT__general_profile_idc);}

    public int general_level_idc() {return this.ptr.get(LAYOUT__general_level_idc, OFFSET__general_level_idc);}
    public void general_level_idc(int value) {this.ptr.set(LAYOUT__general_level_idc, OFFSET__general_level_idc, value);}
    public java.lang.foreign.MemorySegment $general_level_idc() {return this.ptr.asSlice(OFFSET__general_level_idc, LAYOUT__general_level_idc);}
}
