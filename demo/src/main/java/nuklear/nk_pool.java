package nuklear;

public record nk_pool(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__alloc = nuklear.nk_allocator.gRecordLayout.withName("alloc");
    public static final long OFFSET__alloc = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__type = java.lang.foreign.ValueLayout.JAVA_INT.withName("type");
    public static final long OFFSET__type = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__page_count = java.lang.foreign.ValueLayout.JAVA_INT.withName("page_count");
    public static final long OFFSET__page_count = 28;
    public static final java.lang.foreign.AddressLayout LAYOUT__pages = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("pages");
    public static final long OFFSET__pages = 32;
    public static final java.lang.foreign.AddressLayout LAYOUT__freelist = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("freelist");
    public static final long OFFSET__freelist = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__capacity = java.lang.foreign.ValueLayout.JAVA_INT.withName("capacity");
    public static final long OFFSET__capacity = 48;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__size = java.lang.foreign.ValueLayout.JAVA_LONG.withName("size");
    public static final long OFFSET__size = 56;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__cap = java.lang.foreign.ValueLayout.JAVA_LONG.withName("cap");
    public static final long OFFSET__cap = 64;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__alloc,
            LAYOUT__type,
            LAYOUT__page_count,
            LAYOUT__pages,
            LAYOUT__freelist,
            LAYOUT__capacity,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__size,
            LAYOUT__cap
    ).withByteAlignment(8).withName("nk_pool");

    public nk_pool(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_pool getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_pool(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_pool value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_allocator alloc() {return new nuklear.nk_allocator(this._ptr.asSlice(OFFSET__alloc, LAYOUT__alloc));}
    public void alloc(java.util.function.Consumer<nuklear.nk_allocator> consumer) {consumer.accept(this.alloc());}
    public void alloc(nuklear.nk_allocator value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__alloc, LAYOUT__alloc.byteSize());}

    public int type() {return this._ptr.get(LAYOUT__type, OFFSET__type);}
    public void type(int value) {this._ptr.set(LAYOUT__type, OFFSET__type, value);}
    public java.lang.foreign.MemorySegment $type() {return this._ptr.asSlice(OFFSET__type, LAYOUT__type);}

    public int page_count() {return this._ptr.get(LAYOUT__page_count, OFFSET__page_count);}
    public void page_count(int value) {this._ptr.set(LAYOUT__page_count, OFFSET__page_count, value);}
    public java.lang.foreign.MemorySegment $page_count() {return this._ptr.asSlice(OFFSET__page_count, LAYOUT__page_count);}

    public java.lang.foreign.MemorySegment pages() {return this._ptr.get(LAYOUT__pages, OFFSET__pages);}
    public void pages(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__pages, OFFSET__pages, value);}
    public java.lang.foreign.MemorySegment $pages() {return this._ptr.asSlice(OFFSET__pages, LAYOUT__pages);}

    public java.lang.foreign.MemorySegment freelist() {return this._ptr.get(LAYOUT__freelist, OFFSET__freelist);}
    public void freelist(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__freelist, OFFSET__freelist, value);}
    public java.lang.foreign.MemorySegment $freelist() {return this._ptr.asSlice(OFFSET__freelist, LAYOUT__freelist);}

    public int capacity() {return this._ptr.get(LAYOUT__capacity, OFFSET__capacity);}
    public void capacity(int value) {this._ptr.set(LAYOUT__capacity, OFFSET__capacity, value);}
    public java.lang.foreign.MemorySegment $capacity() {return this._ptr.asSlice(OFFSET__capacity, LAYOUT__capacity);}

    public long size() {return this._ptr.get(LAYOUT__size, OFFSET__size);}
    public void size(long value) {this._ptr.set(LAYOUT__size, OFFSET__size, value);}
    public java.lang.foreign.MemorySegment $size() {return this._ptr.asSlice(OFFSET__size, LAYOUT__size);}

    public long cap() {return this._ptr.get(LAYOUT__cap, OFFSET__cap);}
    public void cap(long value) {this._ptr.set(LAYOUT__cap, OFFSET__cap, value);}
    public java.lang.foreign.MemorySegment $cap() {return this._ptr.asSlice(OFFSET__cap, LAYOUT__cap);}
}
