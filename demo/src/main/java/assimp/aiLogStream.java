package assimp;

public record aiLogStream(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$callback = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$callback = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$user = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$user = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$callback,
            LAYOUT$user
    ).withName("aiLogStream");

    public aiLogStream(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiLogStream getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiLogStream(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment callback() {return this.ptr.get(LAYOUT$callback, OFFSET$callback);}
    public void callback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$callback, OFFSET$callback, value);}
    public java.lang.foreign.MemorySegment callback_ptr() {return this.ptr.asSlice(OFFSET$callback, LAYOUT$callback);}

    public java.lang.foreign.MemorySegment user() {return this.ptr.get(LAYOUT$user, OFFSET$user);}
    public void user(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$user, OFFSET$user, value);}
    public java.lang.foreign.MemorySegment user_ptr() {return this.ptr.asSlice(OFFSET$user, LAYOUT$user);}
}
