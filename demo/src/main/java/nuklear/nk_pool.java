package nuklear;

public record nk_pool(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$alloc = nuklear.nk_allocator.gStructLayout;
    public static final long OFFSET$alloc = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$page_count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$page_count = 28L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pages = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pages = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$freelist = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$freelist = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$capacity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$capacity = 48L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 56L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$cap = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$cap = 64L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$alloc,
            LAYOUT$type,
            LAYOUT$page_count,
            LAYOUT$pages,
            LAYOUT$freelist,
            LAYOUT$capacity,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$size,
            LAYOUT$cap
    ).withName("nk_pool");

    public nk_pool(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_pool getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_pool(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_allocator alloc() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET$alloc, LAYOUT$alloc));}
    public void alloc(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.alloc());}
    public void alloc(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$alloc, LAYOUT$alloc.byteSize());}

    public int type() {return this._ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this._ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this._ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public int page_count() {return this._ptr.get(LAYOUT$page_count, OFFSET$page_count);}
    public void page_count(int value) {this._ptr.set(LAYOUT$page_count, OFFSET$page_count, value);}
    public java.lang.foreign.MemorySegment page_count_ptr() {return this._ptr.asSlice(OFFSET$page_count, LAYOUT$page_count);}

    public java.lang.foreign.MemorySegment pages() {return this._ptr.get(LAYOUT$pages, OFFSET$pages);}
    public void pages(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$pages, OFFSET$pages, value);}
    public java.lang.foreign.MemorySegment pages_ptr() {return this._ptr.asSlice(OFFSET$pages, LAYOUT$pages);}

    public java.lang.foreign.MemorySegment freelist() {return this._ptr.get(LAYOUT$freelist, OFFSET$freelist);}
    public void freelist(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$freelist, OFFSET$freelist, value);}
    public java.lang.foreign.MemorySegment freelist_ptr() {return this._ptr.asSlice(OFFSET$freelist, LAYOUT$freelist);}

    public int capacity() {return this._ptr.get(LAYOUT$capacity, OFFSET$capacity);}
    public void capacity(int value) {this._ptr.set(LAYOUT$capacity, OFFSET$capacity, value);}
    public java.lang.foreign.MemorySegment capacity_ptr() {return this._ptr.asSlice(OFFSET$capacity, LAYOUT$capacity);}

    public long size() {return this._ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this._ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this._ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public long cap() {return this._ptr.get(LAYOUT$cap, OFFSET$cap);}
    public void cap(long value) {this._ptr.set(LAYOUT$cap, OFFSET$cap, value);}
    public java.lang.foreign.MemorySegment cap_ptr() {return this._ptr.asSlice(OFFSET$cap, LAYOUT$cap);}
}
