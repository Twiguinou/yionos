package glfw3;

public record GLFWallocator(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__allocate = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__allocate = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__reallocate = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__reallocate = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__deallocate = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__deallocate = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__user = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__user = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__allocate,
            LAYOUT__reallocate,
            LAYOUT__deallocate,
            LAYOUT__user
    ).withByteAlignment(8).withName("GLFWallocator");

    public GLFWallocator(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static GLFWallocator getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new GLFWallocator(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, GLFWallocator value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment allocate() {return this.ptr.get(LAYOUT__allocate, OFFSET__allocate);}
    public void allocate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__allocate, OFFSET__allocate, value);}
    public java.lang.foreign.MemorySegment $allocate() {return this.ptr.asSlice(OFFSET__allocate, LAYOUT__allocate);}

    public java.lang.foreign.MemorySegment reallocate() {return this.ptr.get(LAYOUT__reallocate, OFFSET__reallocate);}
    public void reallocate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__reallocate, OFFSET__reallocate, value);}
    public java.lang.foreign.MemorySegment $reallocate() {return this.ptr.asSlice(OFFSET__reallocate, LAYOUT__reallocate);}

    public java.lang.foreign.MemorySegment deallocate() {return this.ptr.get(LAYOUT__deallocate, OFFSET__deallocate);}
    public void deallocate(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__deallocate, OFFSET__deallocate, value);}
    public java.lang.foreign.MemorySegment $deallocate() {return this.ptr.asSlice(OFFSET__deallocate, LAYOUT__deallocate);}

    public java.lang.foreign.MemorySegment user() {return this.ptr.get(LAYOUT__user, OFFSET__user);}
    public void user(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__user, OFFSET__user, value);}
    public java.lang.foreign.MemorySegment $user() {return this.ptr.asSlice(OFFSET__user, LAYOUT__user);}
}
