package nuklear;

public interface nk_text_width_f
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_handle.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_text_width_f.class);

    float invoke(nuklear.nk_handle arg1, float h, java.lang.foreign.MemorySegment arg3, int len);

    default float invoke(java.lang.foreign.MemorySegment arg1, float h, java.lang.foreign.MemorySegment arg3, int len)
    {
        return this.invoke(new nuklear.nk_handle(arg1), h, arg3, len);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
