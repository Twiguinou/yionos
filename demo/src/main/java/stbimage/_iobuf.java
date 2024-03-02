package stbimage;

public record _iobuf(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$_ptr = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$_ptr = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$_cnt = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$_cnt = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$_base = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$_base = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$_flag = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$_flag = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$_file = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$_file = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$_charbuf = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$_charbuf = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$_bufsiz = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$_bufsiz = 36L;
    public static final java.lang.foreign.AddressLayout LAYOUT$_tmpfname = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$_tmpfname = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$_ptr,
            LAYOUT$_cnt,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$_base,
            LAYOUT$_flag,
            LAYOUT$_file,
            LAYOUT$_charbuf,
            LAYOUT$_bufsiz,
            LAYOUT$_tmpfname
    ).withName("_iobuf");

    public _iobuf(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static _iobuf getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new _iobuf(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment _ptr() {return this.ptr.get(LAYOUT$_ptr, OFFSET$_ptr);}
    public void _ptr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$_ptr, OFFSET$_ptr, value);}
    public java.lang.foreign.MemorySegment _ptr_ptr() {return this.ptr.asSlice(OFFSET$_ptr, LAYOUT$_ptr);}

    public int _cnt() {return this.ptr.get(LAYOUT$_cnt, OFFSET$_cnt);}
    public void _cnt(int value) {this.ptr.set(LAYOUT$_cnt, OFFSET$_cnt, value);}
    public java.lang.foreign.MemorySegment _cnt_ptr() {return this.ptr.asSlice(OFFSET$_cnt, LAYOUT$_cnt);}

    public java.lang.foreign.MemorySegment _base() {return this.ptr.get(LAYOUT$_base, OFFSET$_base);}
    public void _base(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$_base, OFFSET$_base, value);}
    public java.lang.foreign.MemorySegment _base_ptr() {return this.ptr.asSlice(OFFSET$_base, LAYOUT$_base);}

    public int _flag() {return this.ptr.get(LAYOUT$_flag, OFFSET$_flag);}
    public void _flag(int value) {this.ptr.set(LAYOUT$_flag, OFFSET$_flag, value);}
    public java.lang.foreign.MemorySegment _flag_ptr() {return this.ptr.asSlice(OFFSET$_flag, LAYOUT$_flag);}

    public int _file() {return this.ptr.get(LAYOUT$_file, OFFSET$_file);}
    public void _file(int value) {this.ptr.set(LAYOUT$_file, OFFSET$_file, value);}
    public java.lang.foreign.MemorySegment _file_ptr() {return this.ptr.asSlice(OFFSET$_file, LAYOUT$_file);}

    public int _charbuf() {return this.ptr.get(LAYOUT$_charbuf, OFFSET$_charbuf);}
    public void _charbuf(int value) {this.ptr.set(LAYOUT$_charbuf, OFFSET$_charbuf, value);}
    public java.lang.foreign.MemorySegment _charbuf_ptr() {return this.ptr.asSlice(OFFSET$_charbuf, LAYOUT$_charbuf);}

    public int _bufsiz() {return this.ptr.get(LAYOUT$_bufsiz, OFFSET$_bufsiz);}
    public void _bufsiz(int value) {this.ptr.set(LAYOUT$_bufsiz, OFFSET$_bufsiz, value);}
    public java.lang.foreign.MemorySegment _bufsiz_ptr() {return this.ptr.asSlice(OFFSET$_bufsiz, LAYOUT$_bufsiz);}

    public java.lang.foreign.MemorySegment _tmpfname() {return this.ptr.get(LAYOUT$_tmpfname, OFFSET$_tmpfname);}
    public void _tmpfname(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$_tmpfname, OFFSET$_tmpfname, value);}
    public java.lang.foreign.MemorySegment _tmpfname_ptr() {return this.ptr.asSlice(OFFSET$_tmpfname, LAYOUT$_tmpfname);}
}
