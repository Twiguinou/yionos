package nuklear;

public interface nk_plugin_alloc
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_plugin_alloc.class);

    java.lang.foreign.MemorySegment invoke(nuklear.nk_handle arg1, java.lang.foreign.MemorySegment old, long arg3);

    default java.lang.foreign.MemorySegment invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment old, long arg3)
    {
        return this.invoke(new nuklear.nk_handle(arg1), old, arg3);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return nuklear.Nuklear.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
