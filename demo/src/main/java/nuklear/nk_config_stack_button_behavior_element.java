package nuklear;

public record nk_config_stack_button_behavior_element(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$address = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$address = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$old_value = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$old_value = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$address,
            LAYOUT$old_value,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("nk_config_stack_button_behavior_element");

    public nk_config_stack_button_behavior_element(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_config_stack_button_behavior_element getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_config_stack_button_behavior_element(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment address() {return this._ptr.get(LAYOUT$address, OFFSET$address);}
    public void address(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$address, OFFSET$address, value);}
    public java.lang.foreign.MemorySegment address_ptr() {return this._ptr.asSlice(OFFSET$address, LAYOUT$address);}

    public int old_value() {return this._ptr.get(LAYOUT$old_value, OFFSET$old_value);}
    public void old_value(int value) {this._ptr.set(LAYOUT$old_value, OFFSET$old_value, value);}
    public java.lang.foreign.MemorySegment old_value_ptr() {return this._ptr.asSlice(OFFSET$old_value, LAYOUT$old_value);}
}
