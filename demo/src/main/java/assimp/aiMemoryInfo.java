package assimp;

public record aiMemoryInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$textures = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$materials = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$materials = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$meshes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$meshes = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nodes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$nodes = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$animations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$animations = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cameras = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$cameras = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$lights = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$lights = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$total = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$total = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$textures,
            LAYOUT$materials,
            LAYOUT$meshes,
            LAYOUT$nodes,
            LAYOUT$animations,
            LAYOUT$cameras,
            LAYOUT$lights,
            LAYOUT$total
    ).withName("aiMemoryInfo");

    public aiMemoryInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static aiMemoryInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new aiMemoryInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int textures() {return this.ptr.get(LAYOUT$textures, OFFSET$textures);}
    public void textures(int value) {this.ptr.set(LAYOUT$textures, OFFSET$textures, value);}
    public java.lang.foreign.MemorySegment textures_ptr() {return this.ptr.asSlice(OFFSET$textures, LAYOUT$textures);}

    public int materials() {return this.ptr.get(LAYOUT$materials, OFFSET$materials);}
    public void materials(int value) {this.ptr.set(LAYOUT$materials, OFFSET$materials, value);}
    public java.lang.foreign.MemorySegment materials_ptr() {return this.ptr.asSlice(OFFSET$materials, LAYOUT$materials);}

    public int meshes() {return this.ptr.get(LAYOUT$meshes, OFFSET$meshes);}
    public void meshes(int value) {this.ptr.set(LAYOUT$meshes, OFFSET$meshes, value);}
    public java.lang.foreign.MemorySegment meshes_ptr() {return this.ptr.asSlice(OFFSET$meshes, LAYOUT$meshes);}

    public int nodes() {return this.ptr.get(LAYOUT$nodes, OFFSET$nodes);}
    public void nodes(int value) {this.ptr.set(LAYOUT$nodes, OFFSET$nodes, value);}
    public java.lang.foreign.MemorySegment nodes_ptr() {return this.ptr.asSlice(OFFSET$nodes, LAYOUT$nodes);}

    public int animations() {return this.ptr.get(LAYOUT$animations, OFFSET$animations);}
    public void animations(int value) {this.ptr.set(LAYOUT$animations, OFFSET$animations, value);}
    public java.lang.foreign.MemorySegment animations_ptr() {return this.ptr.asSlice(OFFSET$animations, LAYOUT$animations);}

    public int cameras() {return this.ptr.get(LAYOUT$cameras, OFFSET$cameras);}
    public void cameras(int value) {this.ptr.set(LAYOUT$cameras, OFFSET$cameras, value);}
    public java.lang.foreign.MemorySegment cameras_ptr() {return this.ptr.asSlice(OFFSET$cameras, LAYOUT$cameras);}

    public int lights() {return this.ptr.get(LAYOUT$lights, OFFSET$lights);}
    public void lights(int value) {this.ptr.set(LAYOUT$lights, OFFSET$lights, value);}
    public java.lang.foreign.MemorySegment lights_ptr() {return this.ptr.asSlice(OFFSET$lights, LAYOUT$lights);}

    public int total() {return this.ptr.get(LAYOUT$total, OFFSET$total);}
    public void total(int value) {this.ptr.set(LAYOUT$total, OFFSET$total, value);}
    public java.lang.foreign.MemorySegment total_ptr() {return this.ptr.asSlice(OFFSET$total, LAYOUT$total);}
}
