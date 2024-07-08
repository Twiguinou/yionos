package nuklear;

public record nk_config_stack_user_font_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__address = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("address");
    public static final long OFFSET__address = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__old_value = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("old_value");
    public static final long OFFSET__old_value = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__address,
            LAYOUT__old_value
    ).withByteAlignment(8).withName("nk_config_stack_user_font_element");

    public nk_config_stack_user_font_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_config_stack_user_font_element getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_config_stack_user_font_element(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_config_stack_user_font_element value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment address() {return this._ptr.get(LAYOUT__address, OFFSET__address);}
    public void address(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__address, OFFSET__address, value);}
    public java.lang.foreign.MemorySegment $address() {return this._ptr.asSlice(OFFSET__address, LAYOUT__address);}

    public java.lang.foreign.MemorySegment old_value() {return this._ptr.get(LAYOUT__old_value, OFFSET__old_value);}
    public void old_value(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__old_value, OFFSET__old_value, value);}
    public java.lang.foreign.MemorySegment $old_value() {return this._ptr.asSlice(OFFSET__old_value, LAYOUT__old_value);}
}
