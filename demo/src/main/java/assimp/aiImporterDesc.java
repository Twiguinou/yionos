package assimp;

public record aiImporterDesc(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$mName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mName = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mAuthor = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mAuthor = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mMaintainer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mMaintainer = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mComments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mComments = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mFlags = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mMinMajor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mMinMajor = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mMinMinor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mMinMinor = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mMaxMajor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mMaxMajor = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mMaxMinor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mMaxMinor = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$mFileExtensions = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$mFileExtensions = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mName,
            LAYOUT$mAuthor,
            LAYOUT$mMaintainer,
            LAYOUT$mComments,
            LAYOUT$mFlags,
            LAYOUT$mMinMajor,
            LAYOUT$mMinMinor,
            LAYOUT$mMaxMajor,
            LAYOUT$mMaxMinor,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$mFileExtensions
    ).withName("aiImporterDesc");

    public aiImporterDesc(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiImporterDesc getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiImporterDesc(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment mName() {return this.ptr.get(LAYOUT$mName, OFFSET$mName);}
    public void mName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mName, OFFSET$mName, value);}
    public java.lang.foreign.MemorySegment mName_ptr() {return this.ptr.asSlice(OFFSET$mName, LAYOUT$mName);}

    public java.lang.foreign.MemorySegment mAuthor() {return this.ptr.get(LAYOUT$mAuthor, OFFSET$mAuthor);}
    public void mAuthor(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mAuthor, OFFSET$mAuthor, value);}
    public java.lang.foreign.MemorySegment mAuthor_ptr() {return this.ptr.asSlice(OFFSET$mAuthor, LAYOUT$mAuthor);}

    public java.lang.foreign.MemorySegment mMaintainer() {return this.ptr.get(LAYOUT$mMaintainer, OFFSET$mMaintainer);}
    public void mMaintainer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mMaintainer, OFFSET$mMaintainer, value);}
    public java.lang.foreign.MemorySegment mMaintainer_ptr() {return this.ptr.asSlice(OFFSET$mMaintainer, LAYOUT$mMaintainer);}

    public java.lang.foreign.MemorySegment mComments() {return this.ptr.get(LAYOUT$mComments, OFFSET$mComments);}
    public void mComments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mComments, OFFSET$mComments, value);}
    public java.lang.foreign.MemorySegment mComments_ptr() {return this.ptr.asSlice(OFFSET$mComments, LAYOUT$mComments);}

    public int mFlags() {return this.ptr.get(LAYOUT$mFlags, OFFSET$mFlags);}
    public void mFlags(int value) {this.ptr.set(LAYOUT$mFlags, OFFSET$mFlags, value);}
    public java.lang.foreign.MemorySegment mFlags_ptr() {return this.ptr.asSlice(OFFSET$mFlags, LAYOUT$mFlags);}

    public int mMinMajor() {return this.ptr.get(LAYOUT$mMinMajor, OFFSET$mMinMajor);}
    public void mMinMajor(int value) {this.ptr.set(LAYOUT$mMinMajor, OFFSET$mMinMajor, value);}
    public java.lang.foreign.MemorySegment mMinMajor_ptr() {return this.ptr.asSlice(OFFSET$mMinMajor, LAYOUT$mMinMajor);}

    public int mMinMinor() {return this.ptr.get(LAYOUT$mMinMinor, OFFSET$mMinMinor);}
    public void mMinMinor(int value) {this.ptr.set(LAYOUT$mMinMinor, OFFSET$mMinMinor, value);}
    public java.lang.foreign.MemorySegment mMinMinor_ptr() {return this.ptr.asSlice(OFFSET$mMinMinor, LAYOUT$mMinMinor);}

    public int mMaxMajor() {return this.ptr.get(LAYOUT$mMaxMajor, OFFSET$mMaxMajor);}
    public void mMaxMajor(int value) {this.ptr.set(LAYOUT$mMaxMajor, OFFSET$mMaxMajor, value);}
    public java.lang.foreign.MemorySegment mMaxMajor_ptr() {return this.ptr.asSlice(OFFSET$mMaxMajor, LAYOUT$mMaxMajor);}

    public int mMaxMinor() {return this.ptr.get(LAYOUT$mMaxMinor, OFFSET$mMaxMinor);}
    public void mMaxMinor(int value) {this.ptr.set(LAYOUT$mMaxMinor, OFFSET$mMaxMinor, value);}
    public java.lang.foreign.MemorySegment mMaxMinor_ptr() {return this.ptr.asSlice(OFFSET$mMaxMinor, LAYOUT$mMaxMinor);}

    public java.lang.foreign.MemorySegment mFileExtensions() {return this.ptr.get(LAYOUT$mFileExtensions, OFFSET$mFileExtensions);}
    public void mFileExtensions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mFileExtensions, OFFSET$mFileExtensions, value);}
    public java.lang.foreign.MemorySegment mFileExtensions_ptr() {return this.ptr.asSlice(OFFSET$mFileExtensions, LAYOUT$mFileExtensions);}
}
