package nuklear;

public interface nk_plugin_free
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(nuklear.nk_handle.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_plugin_free.class);

    void invoke(nuklear.nk_handle arg1, java.lang.foreign.MemorySegment old);

    default void invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment old)
    {
        this.invoke(new nuklear.nk_handle(arg1), old);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
