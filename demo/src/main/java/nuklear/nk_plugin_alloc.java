package nuklear;

public interface nk_plugin_alloc
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_handle.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_plugin_alloc.class);

    java.lang.foreign.MemorySegment invoke(nuklear.nk_handle arg0, java.lang.foreign.MemorySegment arg1, long arg2);

    default java.lang.foreign.MemorySegment invoke(java.lang.foreign.MemorySegment arg0, java.lang.foreign.MemorySegment arg1, long arg2)
    {
        return this.invoke(new nuklear.nk_handle(arg0), arg1, arg2);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
