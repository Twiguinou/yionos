package nuklear;

public interface nk_plugin_paste
{
    java.lang.foreign.FunctionDescriptor gDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS);
    java.lang.invoke.MethodHandle gUpcallStub = jpgen.NativeTypes.initUpcallStub(gDescriptor, "invoke", nk_plugin_paste.class);

    void invoke(nuklear.nk_handle arg1, java.lang.foreign.MemorySegment arg2);

    default void invoke(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        this.invoke(new nuklear.nk_handle(arg1), arg2);
    }

    default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)
    {
        return nuklear.Nuklear.gSystemLinker.upcallStub(gUpcallStub.bindTo(this), gDescriptor, arena);
    }
}
