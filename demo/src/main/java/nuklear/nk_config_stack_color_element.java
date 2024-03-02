package nuklear;

public record nk_config_stack_color_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$address = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$address = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$old_value = nuklear.nk_color.gStructLayout;
    public static final long OFFSET$old_value = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$address,
            LAYOUT$old_value,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_config_stack_color_element");

    public nk_config_stack_color_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_config_stack_color_element getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_config_stack_color_element(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment address() {return this._ptr.get(LAYOUT$address, OFFSET$address);}
    public void address(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$address, OFFSET$address, value);}
    public java.lang.foreign.MemorySegment address_ptr() {return this._ptr.asSlice(OFFSET$address, LAYOUT$address);}

    public nuklear.nk_color old_value() {return new nuklear.nk_color(this._ptr.asSlice(OFFSET$old_value, LAYOUT$old_value));}
    public void old_value(java.util.function.Consumer<nuklear.nk_color> consumer) {consumer.accept(this.old_value());}
    public void old_value(nuklear.nk_color value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$old_value, LAYOUT$old_value.byteSize());}
}
