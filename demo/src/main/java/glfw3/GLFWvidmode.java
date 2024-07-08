package glfw3;

public record GLFWvidmode(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__width = java.lang.foreign.ValueLayout.JAVA_INT.withName("width");
    public static final long OFFSET__width = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__height = java.lang.foreign.ValueLayout.JAVA_INT.withName("height");
    public static final long OFFSET__height = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__redBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("redBits");
    public static final long OFFSET__redBits = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__greenBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("greenBits");
    public static final long OFFSET__greenBits = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__blueBits = java.lang.foreign.ValueLayout.JAVA_INT.withName("blueBits");
    public static final long OFFSET__blueBits = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__refreshRate = java.lang.foreign.ValueLayout.JAVA_INT.withName("refreshRate");
    public static final long OFFSET__refreshRate = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__width,
            LAYOUT__height,
            LAYOUT__redBits,
            LAYOUT__greenBits,
            LAYOUT__blueBits,
            LAYOUT__refreshRate
    ).withByteAlignment(4).withName("GLFWvidmode");

    public GLFWvidmode(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static GLFWvidmode getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new GLFWvidmode(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, GLFWvidmode value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int width() {return this.ptr.get(LAYOUT__width, OFFSET__width);}
    public void width(int value) {this.ptr.set(LAYOUT__width, OFFSET__width, value);}
    public java.lang.foreign.MemorySegment $width() {return this.ptr.asSlice(OFFSET__width, LAYOUT__width);}

    public int height() {return this.ptr.get(LAYOUT__height, OFFSET__height);}
    public void height(int value) {this.ptr.set(LAYOUT__height, OFFSET__height, value);}
    public java.lang.foreign.MemorySegment $height() {return this.ptr.asSlice(OFFSET__height, LAYOUT__height);}

    public int redBits() {return this.ptr.get(LAYOUT__redBits, OFFSET__redBits);}
    public void redBits(int value) {this.ptr.set(LAYOUT__redBits, OFFSET__redBits, value);}
    public java.lang.foreign.MemorySegment $redBits() {return this.ptr.asSlice(OFFSET__redBits, LAYOUT__redBits);}

    public int greenBits() {return this.ptr.get(LAYOUT__greenBits, OFFSET__greenBits);}
    public void greenBits(int value) {this.ptr.set(LAYOUT__greenBits, OFFSET__greenBits, value);}
    public java.lang.foreign.MemorySegment $greenBits() {return this.ptr.asSlice(OFFSET__greenBits, LAYOUT__greenBits);}

    public int blueBits() {return this.ptr.get(LAYOUT__blueBits, OFFSET__blueBits);}
    public void blueBits(int value) {this.ptr.set(LAYOUT__blueBits, OFFSET__blueBits, value);}
    public java.lang.foreign.MemorySegment $blueBits() {return this.ptr.asSlice(OFFSET__blueBits, LAYOUT__blueBits);}

    public int refreshRate() {return this.ptr.get(LAYOUT__refreshRate, OFFSET__refreshRate);}
    public void refreshRate(int value) {this.ptr.set(LAYOUT__refreshRate, OFFSET__refreshRate, value);}
    public java.lang.foreign.MemorySegment $refreshRate() {return this.ptr.asSlice(OFFSET__refreshRate, LAYOUT__refreshRate);}
}
