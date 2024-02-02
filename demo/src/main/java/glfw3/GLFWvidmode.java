package glfw3;

public record GLFWvidmode(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$width = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$height = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$redBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$redBits = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$greenBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$greenBits = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blueBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$blueBits = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$refreshRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$refreshRate = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$width,
            LAYOUT$height,
            LAYOUT$redBits,
            LAYOUT$greenBits,
            LAYOUT$blueBits,
            LAYOUT$refreshRate
    ).withName("GLFWvidmode");

    public GLFWvidmode(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static GLFWvidmode getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new GLFWvidmode(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
    public void width(int value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
    public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

    public int height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(int value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public int redBits() {return this.ptr.get(LAYOUT$redBits, OFFSET$redBits);}
    public void redBits(int value) {this.ptr.set(LAYOUT$redBits, OFFSET$redBits, value);}
    public java.lang.foreign.MemorySegment redBits_ptr() {return this.ptr.asSlice(OFFSET$redBits, LAYOUT$redBits);}

    public int greenBits() {return this.ptr.get(LAYOUT$greenBits, OFFSET$greenBits);}
    public void greenBits(int value) {this.ptr.set(LAYOUT$greenBits, OFFSET$greenBits, value);}
    public java.lang.foreign.MemorySegment greenBits_ptr() {return this.ptr.asSlice(OFFSET$greenBits, LAYOUT$greenBits);}

    public int blueBits() {return this.ptr.get(LAYOUT$blueBits, OFFSET$blueBits);}
    public void blueBits(int value) {this.ptr.set(LAYOUT$blueBits, OFFSET$blueBits, value);}
    public java.lang.foreign.MemorySegment blueBits_ptr() {return this.ptr.asSlice(OFFSET$blueBits, LAYOUT$blueBits);}

    public int refreshRate() {return this.ptr.get(LAYOUT$refreshRate, OFFSET$refreshRate);}
    public void refreshRate(int value) {this.ptr.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);}
    public java.lang.foreign.MemorySegment refreshRate_ptr() {return this.ptr.asSlice(OFFSET$refreshRate, LAYOUT$refreshRate);}
}
