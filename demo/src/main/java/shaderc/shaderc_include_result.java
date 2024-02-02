package shaderc;

public record shaderc_include_result(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$source_name = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$source_name = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$source_name_length = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$source_name_length = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$content = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$content = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$content_length = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$content_length = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$user_data = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$user_data = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$source_name,
            LAYOUT$source_name_length,
            LAYOUT$content,
            LAYOUT$content_length,
            LAYOUT$user_data
    ).withName("shaderc_include_result");

    public shaderc_include_result(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static shaderc_include_result getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new shaderc_include_result(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment source_name() {return this.ptr.get(LAYOUT$source_name, OFFSET$source_name);}
    public void source_name(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$source_name, OFFSET$source_name, value);}
    public java.lang.foreign.MemorySegment source_name_ptr() {return this.ptr.asSlice(OFFSET$source_name, LAYOUT$source_name);}

    public long source_name_length() {return this.ptr.get(LAYOUT$source_name_length, OFFSET$source_name_length);}
    public void source_name_length(long value) {this.ptr.set(LAYOUT$source_name_length, OFFSET$source_name_length, value);}
    public java.lang.foreign.MemorySegment source_name_length_ptr() {return this.ptr.asSlice(OFFSET$source_name_length, LAYOUT$source_name_length);}

    public java.lang.foreign.MemorySegment content() {return this.ptr.get(LAYOUT$content, OFFSET$content);}
    public void content(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$content, OFFSET$content, value);}
    public java.lang.foreign.MemorySegment content_ptr() {return this.ptr.asSlice(OFFSET$content, LAYOUT$content);}

    public long content_length() {return this.ptr.get(LAYOUT$content_length, OFFSET$content_length);}
    public void content_length(long value) {this.ptr.set(LAYOUT$content_length, OFFSET$content_length, value);}
    public java.lang.foreign.MemorySegment content_length_ptr() {return this.ptr.asSlice(OFFSET$content_length, LAYOUT$content_length);}

    public java.lang.foreign.MemorySegment user_data() {return this.ptr.get(LAYOUT$user_data, OFFSET$user_data);}
    public void user_data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$user_data, OFFSET$user_data, value);}
    public java.lang.foreign.MemorySegment user_data_ptr() {return this.ptr.asSlice(OFFSET$user_data, LAYOUT$user_data);}
}
