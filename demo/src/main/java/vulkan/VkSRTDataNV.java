package vulkan;

public record VkSRTDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__sx = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("sx");
    public static final long OFFSET__sx = 0;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__a = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("a");
    public static final long OFFSET__a = 4;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__b = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("b");
    public static final long OFFSET__b = 8;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__pvx = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("pvx");
    public static final long OFFSET__pvx = 12;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__sy = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("sy");
    public static final long OFFSET__sy = 16;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__c = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("c");
    public static final long OFFSET__c = 20;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__pvy = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("pvy");
    public static final long OFFSET__pvy = 24;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__sz = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("sz");
    public static final long OFFSET__sz = 28;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__pvz = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("pvz");
    public static final long OFFSET__pvz = 32;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__qx = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("qx");
    public static final long OFFSET__qx = 36;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__qy = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("qy");
    public static final long OFFSET__qy = 40;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__qz = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("qz");
    public static final long OFFSET__qz = 44;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__qw = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("qw");
    public static final long OFFSET__qw = 48;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__tx = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("tx");
    public static final long OFFSET__tx = 52;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__ty = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("ty");
    public static final long OFFSET__ty = 56;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__tz = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("tz");
    public static final long OFFSET__tz = 60;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__sx,
            LAYOUT__a,
            LAYOUT__b,
            LAYOUT__pvx,
            LAYOUT__sy,
            LAYOUT__c,
            LAYOUT__pvy,
            LAYOUT__sz,
            LAYOUT__pvz,
            LAYOUT__qx,
            LAYOUT__qy,
            LAYOUT__qz,
            LAYOUT__qw,
            LAYOUT__tx,
            LAYOUT__ty,
            LAYOUT__tz
    ).withByteAlignment(4).withName("VkSRTDataNV");

    public VkSRTDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static VkSRTDataNV getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new VkSRTDataNV(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, VkSRTDataNV value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public float sx() {return this.ptr.get(LAYOUT__sx, OFFSET__sx);}
    public void sx(float value) {this.ptr.set(LAYOUT__sx, OFFSET__sx, value);}
    public java.lang.foreign.MemorySegment $sx() {return this.ptr.asSlice(OFFSET__sx, LAYOUT__sx);}

    public float a() {return this.ptr.get(LAYOUT__a, OFFSET__a);}
    public void a(float value) {this.ptr.set(LAYOUT__a, OFFSET__a, value);}
    public java.lang.foreign.MemorySegment $a() {return this.ptr.asSlice(OFFSET__a, LAYOUT__a);}

    public float b() {return this.ptr.get(LAYOUT__b, OFFSET__b);}
    public void b(float value) {this.ptr.set(LAYOUT__b, OFFSET__b, value);}
    public java.lang.foreign.MemorySegment $b() {return this.ptr.asSlice(OFFSET__b, LAYOUT__b);}

    public float pvx() {return this.ptr.get(LAYOUT__pvx, OFFSET__pvx);}
    public void pvx(float value) {this.ptr.set(LAYOUT__pvx, OFFSET__pvx, value);}
    public java.lang.foreign.MemorySegment $pvx() {return this.ptr.asSlice(OFFSET__pvx, LAYOUT__pvx);}

    public float sy() {return this.ptr.get(LAYOUT__sy, OFFSET__sy);}
    public void sy(float value) {this.ptr.set(LAYOUT__sy, OFFSET__sy, value);}
    public java.lang.foreign.MemorySegment $sy() {return this.ptr.asSlice(OFFSET__sy, LAYOUT__sy);}

    public float c() {return this.ptr.get(LAYOUT__c, OFFSET__c);}
    public void c(float value) {this.ptr.set(LAYOUT__c, OFFSET__c, value);}
    public java.lang.foreign.MemorySegment $c() {return this.ptr.asSlice(OFFSET__c, LAYOUT__c);}

    public float pvy() {return this.ptr.get(LAYOUT__pvy, OFFSET__pvy);}
    public void pvy(float value) {this.ptr.set(LAYOUT__pvy, OFFSET__pvy, value);}
    public java.lang.foreign.MemorySegment $pvy() {return this.ptr.asSlice(OFFSET__pvy, LAYOUT__pvy);}

    public float sz() {return this.ptr.get(LAYOUT__sz, OFFSET__sz);}
    public void sz(float value) {this.ptr.set(LAYOUT__sz, OFFSET__sz, value);}
    public java.lang.foreign.MemorySegment $sz() {return this.ptr.asSlice(OFFSET__sz, LAYOUT__sz);}

    public float pvz() {return this.ptr.get(LAYOUT__pvz, OFFSET__pvz);}
    public void pvz(float value) {this.ptr.set(LAYOUT__pvz, OFFSET__pvz, value);}
    public java.lang.foreign.MemorySegment $pvz() {return this.ptr.asSlice(OFFSET__pvz, LAYOUT__pvz);}

    public float qx() {return this.ptr.get(LAYOUT__qx, OFFSET__qx);}
    public void qx(float value) {this.ptr.set(LAYOUT__qx, OFFSET__qx, value);}
    public java.lang.foreign.MemorySegment $qx() {return this.ptr.asSlice(OFFSET__qx, LAYOUT__qx);}

    public float qy() {return this.ptr.get(LAYOUT__qy, OFFSET__qy);}
    public void qy(float value) {this.ptr.set(LAYOUT__qy, OFFSET__qy, value);}
    public java.lang.foreign.MemorySegment $qy() {return this.ptr.asSlice(OFFSET__qy, LAYOUT__qy);}

    public float qz() {return this.ptr.get(LAYOUT__qz, OFFSET__qz);}
    public void qz(float value) {this.ptr.set(LAYOUT__qz, OFFSET__qz, value);}
    public java.lang.foreign.MemorySegment $qz() {return this.ptr.asSlice(OFFSET__qz, LAYOUT__qz);}

    public float qw() {return this.ptr.get(LAYOUT__qw, OFFSET__qw);}
    public void qw(float value) {this.ptr.set(LAYOUT__qw, OFFSET__qw, value);}
    public java.lang.foreign.MemorySegment $qw() {return this.ptr.asSlice(OFFSET__qw, LAYOUT__qw);}

    public float tx() {return this.ptr.get(LAYOUT__tx, OFFSET__tx);}
    public void tx(float value) {this.ptr.set(LAYOUT__tx, OFFSET__tx, value);}
    public java.lang.foreign.MemorySegment $tx() {return this.ptr.asSlice(OFFSET__tx, LAYOUT__tx);}

    public float ty() {return this.ptr.get(LAYOUT__ty, OFFSET__ty);}
    public void ty(float value) {this.ptr.set(LAYOUT__ty, OFFSET__ty, value);}
    public java.lang.foreign.MemorySegment $ty() {return this.ptr.asSlice(OFFSET__ty, LAYOUT__ty);}

    public float tz() {return this.ptr.get(LAYOUT__tz, OFFSET__tz);}
    public void tz(float value) {this.ptr.set(LAYOUT__tz, OFFSET__tz, value);}
    public java.lang.foreign.MemorySegment $tz() {return this.ptr.asSlice(OFFSET__tz, LAYOUT__tz);}
}
