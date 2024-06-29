package shaderc;

public record shaderc_include_result(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__source_name = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__source_name = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__source_name_length = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__source_name_length = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__content = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__content = 16;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__content_length = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET__content_length = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__user_data = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__user_data = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__source_name,
            LAYOUT__source_name_length,
            LAYOUT__content,
            LAYOUT__content_length,
            LAYOUT__user_data
    ).withByteAlignment(8).withName("shaderc_include_result");

    public shaderc_include_result(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static shaderc_include_result getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new shaderc_include_result(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, shaderc_include_result value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment source_name() {return this.ptr.get(LAYOUT__source_name, OFFSET__source_name);}
    public void source_name(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__source_name, OFFSET__source_name, value);}
    public java.lang.foreign.MemorySegment $source_name() {return this.ptr.asSlice(OFFSET__source_name, LAYOUT__source_name);}

    public long source_name_length() {return this.ptr.get(LAYOUT__source_name_length, OFFSET__source_name_length);}
    public void source_name_length(long value) {this.ptr.set(LAYOUT__source_name_length, OFFSET__source_name_length, value);}
    public java.lang.foreign.MemorySegment $source_name_length() {return this.ptr.asSlice(OFFSET__source_name_length, LAYOUT__source_name_length);}

    public java.lang.foreign.MemorySegment content() {return this.ptr.get(LAYOUT__content, OFFSET__content);}
    public void content(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__content, OFFSET__content, value);}
    public java.lang.foreign.MemorySegment $content() {return this.ptr.asSlice(OFFSET__content, LAYOUT__content);}

    public long content_length() {return this.ptr.get(LAYOUT__content_length, OFFSET__content_length);}
    public void content_length(long value) {this.ptr.set(LAYOUT__content_length, OFFSET__content_length, value);}
    public java.lang.foreign.MemorySegment $content_length() {return this.ptr.asSlice(OFFSET__content_length, LAYOUT__content_length);}

    public java.lang.foreign.MemorySegment user_data() {return this.ptr.get(LAYOUT__user_data, OFFSET__user_data);}
    public void user_data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__user_data, OFFSET__user_data, value);}
    public java.lang.foreign.MemorySegment $user_data() {return this.ptr.asSlice(OFFSET__user_data, LAYOUT__user_data);}
}
