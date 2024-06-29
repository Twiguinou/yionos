package assimp;

public record aiPlane(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__a = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__b = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__c = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__d = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__d = 12;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__a,
            LAYOUT__b,
            LAYOUT__c,
            LAYOUT__d
    ).withByteAlignment(4).withName("aiPlane");

    public aiPlane(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiPlane getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiPlane(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiPlane value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float a() {return this.ptr.get(LAYOUT__a, OFFSET__a);}
    public void a(float value) {this.ptr.set(LAYOUT__a, OFFSET__a, value);}
    public java.lang.foreign.MemorySegment $a() {return this.ptr.asSlice(OFFSET__a, LAYOUT__a);}

    public float b() {return this.ptr.get(LAYOUT__b, OFFSET__b);}
    public void b(float value) {this.ptr.set(LAYOUT__b, OFFSET__b, value);}
    public java.lang.foreign.MemorySegment $b() {return this.ptr.asSlice(OFFSET__b, LAYOUT__b);}

    public float c() {return this.ptr.get(LAYOUT__c, OFFSET__c);}
    public void c(float value) {this.ptr.set(LAYOUT__c, OFFSET__c, value);}
    public java.lang.foreign.MemorySegment $c() {return this.ptr.asSlice(OFFSET__c, LAYOUT__c);}

    public float d() {return this.ptr.get(LAYOUT__d, OFFSET__d);}
    public void d(float value) {this.ptr.set(LAYOUT__d, OFFSET__d, value);}
    public java.lang.foreign.MemorySegment $d() {return this.ptr.asSlice(OFFSET__d, LAYOUT__d);}
}
