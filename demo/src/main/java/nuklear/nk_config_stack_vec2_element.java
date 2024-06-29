package nuklear;

public record nk_config_stack_vec2_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__address = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__address = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__old_value = nuklear.nk_vec2.gRecordLayout;
    public static final long OFFSET__old_value = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__address,
            LAYOUT__old_value
    ).withByteAlignment(8).withName("nk_config_stack_vec2_element");

    public nk_config_stack_vec2_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_config_stack_vec2_element getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_config_stack_vec2_element(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_config_stack_vec2_element value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment address() {return this._ptr.get(LAYOUT__address, OFFSET__address);}
    public void address(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__address, OFFSET__address, value);}
    public java.lang.foreign.MemorySegment $address() {return this._ptr.asSlice(OFFSET__address, LAYOUT__address);}

    public nuklear.nk_vec2 old_value() {return new nuklear.nk_vec2(this._ptr.asSlice(OFFSET__old_value, LAYOUT__old_value));}
    public void old_value(java.util.function.Consumer<nuklear.nk_vec2> consumer) {consumer.accept(this.old_value());}
    public void old_value(nuklear.nk_vec2 value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__old_value, LAYOUT__old_value.byteSize());}
}
