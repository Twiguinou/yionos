package nuklear;

public interface nk_text_width_f
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_handle.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_text_width_f.class);

    float invoke(nuklear.nk_handle arg0, float arg1, java.lang.foreign.MemorySegment arg2, int arg3);

    default float invoke(java.lang.foreign.MemorySegment arg0, float arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        return this.invoke(new nuklear.nk_handle(arg0), arg1, arg2, arg3);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
