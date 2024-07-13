package nuklear;

public interface nk_plugin_paste
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(nuklear.nk_handle.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_plugin_paste.class);

    void invoke(nuklear.nk_handle arg1, java.lang.foreign.MemorySegment arg2);

    default void invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        this.invoke(new nuklear.nk_handle(arg1), arg2);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
