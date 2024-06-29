package assimp;

public record aiMemoryInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__textures = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__textures = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__materials = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__materials = 4;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__meshes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__meshes = 8;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__nodes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__nodes = 12;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__animations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__animations = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__cameras = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__cameras = 20;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__lights = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__lights = 24;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__total = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__total = 28;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__textures,
            LAYOUT__materials,
            LAYOUT__meshes,
            LAYOUT__nodes,
            LAYOUT__animations,
            LAYOUT__cameras,
            LAYOUT__lights,
            LAYOUT__total
    ).withByteAlignment(4).withName("aiMemoryInfo");

    public aiMemoryInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMemoryInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMemoryInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMemoryInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int textures() {return this.ptr.get(LAYOUT__textures, OFFSET__textures);}
    public void textures(int value) {this.ptr.set(LAYOUT__textures, OFFSET__textures, value);}
    public java.lang.foreign.MemorySegment $textures() {return this.ptr.asSlice(OFFSET__textures, LAYOUT__textures);}

    public int materials() {return this.ptr.get(LAYOUT__materials, OFFSET__materials);}
    public void materials(int value) {this.ptr.set(LAYOUT__materials, OFFSET__materials, value);}
    public java.lang.foreign.MemorySegment $materials() {return this.ptr.asSlice(OFFSET__materials, LAYOUT__materials);}

    public int meshes() {return this.ptr.get(LAYOUT__meshes, OFFSET__meshes);}
    public void meshes(int value) {this.ptr.set(LAYOUT__meshes, OFFSET__meshes, value);}
    public java.lang.foreign.MemorySegment $meshes() {return this.ptr.asSlice(OFFSET__meshes, LAYOUT__meshes);}

    public int nodes() {return this.ptr.get(LAYOUT__nodes, OFFSET__nodes);}
    public void nodes(int value) {this.ptr.set(LAYOUT__nodes, OFFSET__nodes, value);}
    public java.lang.foreign.MemorySegment $nodes() {return this.ptr.asSlice(OFFSET__nodes, LAYOUT__nodes);}

    public int animations() {return this.ptr.get(LAYOUT__animations, OFFSET__animations);}
    public void animations(int value) {this.ptr.set(LAYOUT__animations, OFFSET__animations, value);}
    public java.lang.foreign.MemorySegment $animations() {return this.ptr.asSlice(OFFSET__animations, LAYOUT__animations);}

    public int cameras() {return this.ptr.get(LAYOUT__cameras, OFFSET__cameras);}
    public void cameras(int value) {this.ptr.set(LAYOUT__cameras, OFFSET__cameras, value);}
    public java.lang.foreign.MemorySegment $cameras() {return this.ptr.asSlice(OFFSET__cameras, LAYOUT__cameras);}

    public int lights() {return this.ptr.get(LAYOUT__lights, OFFSET__lights);}
    public void lights(int value) {this.ptr.set(LAYOUT__lights, OFFSET__lights, value);}
    public java.lang.foreign.MemorySegment $lights() {return this.ptr.asSlice(OFFSET__lights, LAYOUT__lights);}

    public int total() {return this.ptr.get(LAYOUT__total, OFFSET__total);}
    public void total(int value) {this.ptr.set(LAYOUT__total, OFFSET__total, value);}
    public java.lang.foreign.MemorySegment $total() {return this.ptr.asSlice(OFFSET__total, LAYOUT__total);}
}
