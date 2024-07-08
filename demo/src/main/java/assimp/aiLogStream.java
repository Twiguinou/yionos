package assimp;

public record aiLogStream(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__callback = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("callback");
    public static final long OFFSET__callback = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__user = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("user");
    public static final long OFFSET__user = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__callback,
            LAYOUT__user
    ).withByteAlignment(8).withName("aiLogStream");

    public aiLogStream(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiLogStream getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiLogStream(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiLogStream value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment callback() {return this.ptr.get(LAYOUT__callback, OFFSET__callback);}
    public void callback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__callback, OFFSET__callback, value);}
    public java.lang.foreign.MemorySegment $callback() {return this.ptr.asSlice(OFFSET__callback, LAYOUT__callback);}

    public java.lang.foreign.MemorySegment user() {return this.ptr.get(LAYOUT__user, OFFSET__user);}
    public void user(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__user, OFFSET__user, value);}
    public java.lang.foreign.MemorySegment $user() {return this.ptr.asSlice(OFFSET__user, LAYOUT__user);}
}
