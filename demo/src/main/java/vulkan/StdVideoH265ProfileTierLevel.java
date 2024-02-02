package vulkan;

public record StdVideoH265ProfileTierLevel(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH265ProfileTierLevelFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$general_profile_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$general_profile_idc = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$general_level_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$general_level_idc = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$general_profile_idc,
            LAYOUT$general_level_idc
    ).withName("StdVideoH265ProfileTierLevel");

    public StdVideoH265ProfileTierLevel(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static StdVideoH265ProfileTierLevel getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new StdVideoH265ProfileTierLevel(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public vulkan.StdVideoH265ProfileTierLevelFlags flags() {return new vulkan.StdVideoH265ProfileTierLevelFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}
    public void flags(java.util.function.Consumer<vulkan.StdVideoH265ProfileTierLevelFlags> consumer) {consumer.accept(this.flags());}
    public void flags(vulkan.StdVideoH265ProfileTierLevelFlags value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$flags, LAYOUT$flags.byteSize());}

    public int general_profile_idc() {return this.ptr.get(LAYOUT$general_profile_idc, OFFSET$general_profile_idc);}
    public void general_profile_idc(int value) {this.ptr.set(LAYOUT$general_profile_idc, OFFSET$general_profile_idc, value);}
    public java.lang.foreign.MemorySegment general_profile_idc_ptr() {return this.ptr.asSlice(OFFSET$general_profile_idc, LAYOUT$general_profile_idc);}

    public int general_level_idc() {return this.ptr.get(LAYOUT$general_level_idc, OFFSET$general_level_idc);}
    public void general_level_idc(int value) {this.ptr.set(LAYOUT$general_level_idc, OFFSET$general_level_idc, value);}
    public java.lang.foreign.MemorySegment general_level_idc_ptr() {return this.ptr.asSlice(OFFSET$general_level_idc, LAYOUT$general_level_idc);}
}
