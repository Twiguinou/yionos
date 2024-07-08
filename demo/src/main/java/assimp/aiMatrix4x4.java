package assimp;

public record aiMatrix4x4(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a1 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("a1");
    public static final long OFFSET__a1 = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a2 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("a2");
    public static final long OFFSET__a2 = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a3 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("a3");
    public static final long OFFSET__a3 = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a4 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("a4");
    public static final long OFFSET__a4 = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b1 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("b1");
    public static final long OFFSET__b1 = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b2 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("b2");
    public static final long OFFSET__b2 = 20;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b3 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("b3");
    public static final long OFFSET__b3 = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b4 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("b4");
    public static final long OFFSET__b4 = 28;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c1 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("c1");
    public static final long OFFSET__c1 = 32;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c2 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("c2");
    public static final long OFFSET__c2 = 36;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c3 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("c3");
    public static final long OFFSET__c3 = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c4 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("c4");
    public static final long OFFSET__c4 = 44;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__d1 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("d1");
    public static final long OFFSET__d1 = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__d2 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("d2");
    public static final long OFFSET__d2 = 52;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__d3 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("d3");
    public static final long OFFSET__d3 = 56;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__d4 = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("d4");
    public static final long OFFSET__d4 = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__a1,
            LAYOUT__a2,
            LAYOUT__a3,
            LAYOUT__a4,
            LAYOUT__b1,
            LAYOUT__b2,
            LAYOUT__b3,
            LAYOUT__b4,
            LAYOUT__c1,
            LAYOUT__c2,
            LAYOUT__c3,
            LAYOUT__c4,
            LAYOUT__d1,
            LAYOUT__d2,
            LAYOUT__d3,
            LAYOUT__d4
    ).withByteAlignment(4).withName("aiMatrix4x4");

    public aiMatrix4x4(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMatrix4x4 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMatrix4x4(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMatrix4x4 value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float a1() {return this.ptr.get(LAYOUT__a1, OFFSET__a1);}
    public void a1(float value) {this.ptr.set(LAYOUT__a1, OFFSET__a1, value);}
    public java.lang.foreign.MemorySegment $a1() {return this.ptr.asSlice(OFFSET__a1, LAYOUT__a1);}

    public float a2() {return this.ptr.get(LAYOUT__a2, OFFSET__a2);}
    public void a2(float value) {this.ptr.set(LAYOUT__a2, OFFSET__a2, value);}
    public java.lang.foreign.MemorySegment $a2() {return this.ptr.asSlice(OFFSET__a2, LAYOUT__a2);}

    public float a3() {return this.ptr.get(LAYOUT__a3, OFFSET__a3);}
    public void a3(float value) {this.ptr.set(LAYOUT__a3, OFFSET__a3, value);}
    public java.lang.foreign.MemorySegment $a3() {return this.ptr.asSlice(OFFSET__a3, LAYOUT__a3);}

    public float a4() {return this.ptr.get(LAYOUT__a4, OFFSET__a4);}
    public void a4(float value) {this.ptr.set(LAYOUT__a4, OFFSET__a4, value);}
    public java.lang.foreign.MemorySegment $a4() {return this.ptr.asSlice(OFFSET__a4, LAYOUT__a4);}

    public float b1() {return this.ptr.get(LAYOUT__b1, OFFSET__b1);}
    public void b1(float value) {this.ptr.set(LAYOUT__b1, OFFSET__b1, value);}
    public java.lang.foreign.MemorySegment $b1() {return this.ptr.asSlice(OFFSET__b1, LAYOUT__b1);}

    public float b2() {return this.ptr.get(LAYOUT__b2, OFFSET__b2);}
    public void b2(float value) {this.ptr.set(LAYOUT__b2, OFFSET__b2, value);}
    public java.lang.foreign.MemorySegment $b2() {return this.ptr.asSlice(OFFSET__b2, LAYOUT__b2);}

    public float b3() {return this.ptr.get(LAYOUT__b3, OFFSET__b3);}
    public void b3(float value) {this.ptr.set(LAYOUT__b3, OFFSET__b3, value);}
    public java.lang.foreign.MemorySegment $b3() {return this.ptr.asSlice(OFFSET__b3, LAYOUT__b3);}

    public float b4() {return this.ptr.get(LAYOUT__b4, OFFSET__b4);}
    public void b4(float value) {this.ptr.set(LAYOUT__b4, OFFSET__b4, value);}
    public java.lang.foreign.MemorySegment $b4() {return this.ptr.asSlice(OFFSET__b4, LAYOUT__b4);}

    public float c1() {return this.ptr.get(LAYOUT__c1, OFFSET__c1);}
    public void c1(float value) {this.ptr.set(LAYOUT__c1, OFFSET__c1, value);}
    public java.lang.foreign.MemorySegment $c1() {return this.ptr.asSlice(OFFSET__c1, LAYOUT__c1);}

    public float c2() {return this.ptr.get(LAYOUT__c2, OFFSET__c2);}
    public void c2(float value) {this.ptr.set(LAYOUT__c2, OFFSET__c2, value);}
    public java.lang.foreign.MemorySegment $c2() {return this.ptr.asSlice(OFFSET__c2, LAYOUT__c2);}

    public float c3() {return this.ptr.get(LAYOUT__c3, OFFSET__c3);}
    public void c3(float value) {this.ptr.set(LAYOUT__c3, OFFSET__c3, value);}
    public java.lang.foreign.MemorySegment $c3() {return this.ptr.asSlice(OFFSET__c3, LAYOUT__c3);}

    public float c4() {return this.ptr.get(LAYOUT__c4, OFFSET__c4);}
    public void c4(float value) {this.ptr.set(LAYOUT__c4, OFFSET__c4, value);}
    public java.lang.foreign.MemorySegment $c4() {return this.ptr.asSlice(OFFSET__c4, LAYOUT__c4);}

    public float d1() {return this.ptr.get(LAYOUT__d1, OFFSET__d1);}
    public void d1(float value) {this.ptr.set(LAYOUT__d1, OFFSET__d1, value);}
    public java.lang.foreign.MemorySegment $d1() {return this.ptr.asSlice(OFFSET__d1, LAYOUT__d1);}

    public float d2() {return this.ptr.get(LAYOUT__d2, OFFSET__d2);}
    public void d2(float value) {this.ptr.set(LAYOUT__d2, OFFSET__d2, value);}
    public java.lang.foreign.MemorySegment $d2() {return this.ptr.asSlice(OFFSET__d2, LAYOUT__d2);}

    public float d3() {return this.ptr.get(LAYOUT__d3, OFFSET__d3);}
    public void d3(float value) {this.ptr.set(LAYOUT__d3, OFFSET__d3, value);}
    public java.lang.foreign.MemorySegment $d3() {return this.ptr.asSlice(OFFSET__d3, LAYOUT__d3);}

    public float d4() {return this.ptr.get(LAYOUT__d4, OFFSET__d4);}
    public void d4(float value) {this.ptr.set(LAYOUT__d4, OFFSET__d4, value);}
    public java.lang.foreign.MemorySegment $d4() {return this.ptr.asSlice(OFFSET__d4, LAYOUT__d4);}
}
