package assimp;

public record aiMatrix3x3(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__a1 = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a2 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__a2 = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a3 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__a3 = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__b1 = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b2 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__b2 = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b3 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__b3 = 20;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c1 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__c1 = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c2 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__c2 = 28;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c3 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET__c3 = 32;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__a1,
            LAYOUT__a2,
            LAYOUT__a3,
            LAYOUT__b1,
            LAYOUT__b2,
            LAYOUT__b3,
            LAYOUT__c1,
            LAYOUT__c2,
            LAYOUT__c3
    ).withByteAlignment(4).withName("aiMatrix3x3");

    public aiMatrix3x3(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static aiMatrix3x3 getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new aiMatrix3x3(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, aiMatrix3x3 value)
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

    public float b1() {return this.ptr.get(LAYOUT__b1, OFFSET__b1);}
    public void b1(float value) {this.ptr.set(LAYOUT__b1, OFFSET__b1, value);}
    public java.lang.foreign.MemorySegment $b1() {return this.ptr.asSlice(OFFSET__b1, LAYOUT__b1);}

    public float b2() {return this.ptr.get(LAYOUT__b2, OFFSET__b2);}
    public void b2(float value) {this.ptr.set(LAYOUT__b2, OFFSET__b2, value);}
    public java.lang.foreign.MemorySegment $b2() {return this.ptr.asSlice(OFFSET__b2, LAYOUT__b2);}

    public float b3() {return this.ptr.get(LAYOUT__b3, OFFSET__b3);}
    public void b3(float value) {this.ptr.set(LAYOUT__b3, OFFSET__b3, value);}
    public java.lang.foreign.MemorySegment $b3() {return this.ptr.asSlice(OFFSET__b3, LAYOUT__b3);}

    public float c1() {return this.ptr.get(LAYOUT__c1, OFFSET__c1);}
    public void c1(float value) {this.ptr.set(LAYOUT__c1, OFFSET__c1, value);}
    public java.lang.foreign.MemorySegment $c1() {return this.ptr.asSlice(OFFSET__c1, LAYOUT__c1);}

    public float c2() {return this.ptr.get(LAYOUT__c2, OFFSET__c2);}
    public void c2(float value) {this.ptr.set(LAYOUT__c2, OFFSET__c2, value);}
    public java.lang.foreign.MemorySegment $c2() {return this.ptr.asSlice(OFFSET__c2, LAYOUT__c2);}

    public float c3() {return this.ptr.get(LAYOUT__c3, OFFSET__c3);}
    public void c3(float value) {this.ptr.set(LAYOUT__c3, OFFSET__c3, value);}
    public java.lang.foreign.MemorySegment $c3() {return this.ptr.asSlice(OFFSET__c3, LAYOUT__c3);}
}
